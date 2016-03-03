package com.mcp.mycareerplan.api;

public class Log {
    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

    public static String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }

    public static void e(
            String title, String msg) {
//        System.err.print(new Throwable().getStackTrace()[2].getLineNumber());
        System.err.println(padLeft("[" + title + "] ", 20) + msg);
    }

    public static void d(String title, String msg) {
//        System.out.print(new Throwable().getStackTrace()[2].getLineNumber());
        System.out.println(padLeft("[" + title + "] ", 20) + msg);
    }
}
