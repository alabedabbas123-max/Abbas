package com.almlkaide.kaypro.manifesteditor.proguard;

import com.aide.ui.build.android.fb;
import com.aide.ui.build.android.B;

class Runnableg implements Runnable {

    final ClassC f3648a;

    private final boolean f3649b;

    Runnableg(ClassC c1356c, boolean z) {
        this.f3648a = c1356c;
        this.f3649b = z;
    }

    @Override
    public void run() {
        B b = this.f3648a.f3641a;
        if (this.f3649b) {
            fb.m5820j6(b, false);
        }
        fb.m5818j6(b, fb.m5814EQ(b), fb.m5815J0(b));
    }
}
