package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;

public class ca {

    private static ca f4385a = new ca();

    private static String f4386b = "";

    public static ca m6601a() {
        return f4385a;
    }

    public void m6604a(Context context, final Interfacebz interfaceC1462bz) {
        f4386b = cc.m6606a(context);
        if (!TextUtils.isEmpty(f4386b)) {
            if (interfaceC1462bz != null) {
                interfaceC1462bz.mo6589a(f4386b);
                return;
            }
            return;
        }
        by.m6596a(context, new Interfacecb() {
            @Override
            public void mo6605a(String str) {
                if (!TextUtils.isEmpty(str)) {
                    String unused = ca.f4386b = str;
                    if (interfaceC1462bz != null) {
                        interfaceC1462bz.mo6589a(ca.f4386b);
                    }
                }
            }
        });
    }
}
