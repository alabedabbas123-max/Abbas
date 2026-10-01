package com.baidu.mobstat;

import android.content.Context;

class ab implements Thread.UncaughtExceptionHandler {

    private static final ab f4029a = new ab();

    private Thread.UncaughtExceptionHandler f4030b;

    private Context f4031c;

    public static ab m5950a() {
        return f4029a;
    }

    private ab() {
    }

    public void m5951a(Context context) {
        this.f4031c = context;
        if (this.f4030b == null) {
            this.f4030b = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override
    public void uncaughtException(Thread thread, Throwable th) {
        ExceptionAnalysis.getInstance().saveCrashInfo(this.f4031c, th, true);
        if (!this.f4030b.equals(this)) {
            this.f4030b.uncaughtException(thread, th);
        }
    }
}
