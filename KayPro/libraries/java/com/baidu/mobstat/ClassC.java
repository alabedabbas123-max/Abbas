package com.baidu.mobstat;

import android.content.Context;

public class ClassC {
    public static void m6597a(Context context) {
        if (bu.m6524a().m6532d()) {
            ClassB.f4292a.m6311a(context);
            ClassW.m6814a(context).m6818a(Enumg.AP_LIST, System.currentTimeMillis());
        }
    }

    public static void m6598a(Context context, boolean z) {
        if (bu.m6524a().m6532d()) {
            ClassE.f4498a.m6744a(context, z);
            ClassW.m6814a(context).m6818a(z ? Enumg.APP_SYS_LIST : Enumg.APP_USER_LIST, System.currentTimeMillis());
        }
    }

    public static void m6600b(Context context, boolean z) {
        if (bu.m6524a().m6532d()) {
            ClassF.f4499a.m6754a(context, z);
            ClassW.m6814a(context).m6818a(z ? Enumg.APP_TRACE_CURRENT : Enumg.APP_TRACE_HIS, System.currentTimeMillis());
        }
    }

    public static void m6599b(Context context) {
        if (bu.m6524a().m6532d()) {
            ClassD.f4469a.m6713a(context);
            ClassW.m6814a(context).m6818a(Enumg.APP_APK, System.currentTimeMillis());
        }
    }
}
