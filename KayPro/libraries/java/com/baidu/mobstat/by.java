package com.baidu.mobstat;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;

public class by {
    public static void m6596a(Context context, final Interfacecb interfaceC1465cb) {
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        context.bindService(intent, new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                try {
                    Interfacecd interfaceC1467cdM6610a = Interfacecd.a.m6610a(iBinder);
                    if (!TextUtils.isEmpty(interfaceC1467cdM6610a.mo6608a()) && interfaceC1465cb != null) {
                        interfaceC1465cb.mo6605a(interfaceC1467cdM6610a.mo6608a());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onServiceDisconnected(ComponentName componentName) {
            }
        }, 1);
    }
}
