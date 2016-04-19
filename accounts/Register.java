package com.mcp.mycareerplan.api.accounts;

import android.app.ProgressDialog;
import android.os.AsyncTask;

import com.mcp.mycareerplan.R;
import com.mcp.mycareerplan.SignUpActivity;
import com.mcp.mycareerplan.api.Log;
import com.mcp.mycareerplan.api.MCPWebService;
import com.mcp.mycareerplan.api.Result;

import retrofit2.Response;

import java.io.IOException;
import java.net.URL;

public class Register extends AsyncTask<Void, Void, Response<Result>> {
    private static final String LOG_TAG = Register.class.getSimpleName();
    private User user;
    private ProgressDialog dialog;
    private SignUpActivity activity;

    public Register(User user, SignUpActivity activity) {
        this.user = user;
        this.activity = activity;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        dialog.setMessage(activity.getResources().getString(R.string.loading));
        dialog.show();
    }

    protected Response<Result> doInBackground(Void... v) {
        Log.d(LOG_TAG, "registerUser()");
        IRegister register = MCPWebService.getApi().create(IRegister.class);
        Response<Result> res = null;
        try {
            res = register.register(user).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d(LOG_TAG, res.toString());
        return res;
    }

    @Override
    protected void onPostExecute(Response<Result> resultResponse) {
        // TODO: Make it work for correct API
        if (resultResponse.body().getCodigo()==400) {
            dialog.dismiss();
            activity.onSignupSuccess();
        } else {
            if ((dialog != null) && dialog.isShowing()) {
                dialog.dismiss();
                dialog = null;
            }
            activity.onSignupFailed();
        }
    }
}
