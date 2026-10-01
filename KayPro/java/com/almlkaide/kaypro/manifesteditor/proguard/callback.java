package com.almlkaide.kaypro.manifesteditor.proguard;

import com.aide.ui.build.android.fb;

public class callback implements Runnable {

    private ClassC f3642c;

    private String f3643msg;

    public callback(ClassC c1356c, String str) {
        this.f3642c = c1356c;
        this.f3643msg = str;
    }

    @Override
    public void run() {
        fb.m5813DW(this.f3642c.f3641a, this.f3643msg);
    }
}
