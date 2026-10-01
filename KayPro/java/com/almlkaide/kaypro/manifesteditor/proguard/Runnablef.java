package com.almlkaide.kaypro.manifesteditor.proguard;

import com.aide.ui.build.android.fb;
import com.aide.ui.build.android.B;
import java.util.Map;

class Runnablef implements Runnable {

    final ClassC f3646a;

    private final Map f3647b;

    Runnablef(ClassC c1356c, Map map) {
        this.f3646a = c1356c;
        this.f3647b = map;
    }

    @Override
    public void run() {
        B b = this.f3646a.f3641a;
        fb.m5819j6(b, "Proguard", this.f3647b);
        fb.m5816QX(b);
    }
}
