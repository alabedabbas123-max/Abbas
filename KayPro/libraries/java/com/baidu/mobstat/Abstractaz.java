package com.baidu.mobstat;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

public abstract class Abstractaz {

    public static int f4291a = 2;

    public abstract String mo6299a();

    public abstract boolean mo6306b();

    public void m6301a(String str, Throwable th) {
        m6297a(2, str + '\n' + m6298d(th));
    }

    public void m6300a(String str) {
        m6297a(3, str);
    }

    public void m6302a(Throwable th) {
        m6297a(3, m6298d(th));
    }

    public void m6304b(String str, Throwable th) {
        m6297a(3, str + '\n' + m6298d(th));
    }

    public void m6308c(String str, Throwable th) {
        m6297a(4, str + '\n' + m6298d(th));
    }

    public void m6303b(String str) {
        m6297a(5, str);
    }

    public void m6305b(Throwable th) {
        m6297a(5, m6298d(th));
    }

    public void m6307c(String str) {
        m6297a(6, str);
    }

    public void m6309c(Throwable th) {
        m6297a(6, m6298d(th));
    }

    public void m6310d(String str, Throwable th) {
        m6297a(6, str + '\n' + m6298d(th));
    }

    private String m6298d(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private void m6297a(int i, String str) {
        if (mo6306b() && i >= f4291a) {
            Log.println(i, mo6299a(), str);
        }
    }
}
