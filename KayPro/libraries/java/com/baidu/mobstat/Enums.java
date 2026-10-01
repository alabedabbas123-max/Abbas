package com.baidu.mobstat;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
public abstract class Enums {

    public static final Enums f4537a;

    public static final Enums f4538b;

    public static final Enums f4539c;

    public static final Enums f4540d;

    private static final Enums[] f4541f;

    private int f4542e;

    public abstract void mo6807a(Context context);

    public static Enums valueOf(String str) {
        return (Enums) Enum.valueOf(Enums.class, str);
    }

    public static Enums[] values() {
        return (Enums[]) f4541f.clone();
    }

    static {
        int i = 3;
        int i2 = 2;
        int i3 = 1;
        f4537a = new Enums("SERVICE", 0, i3) {
            @Override
            public void mo6807a(Context context) {
                if (ClassT.m6808a(context).mo5948b(context)) {
                    try {
                        Intent intent = new Intent(context, Class.forName("com.baidu.bottom.service.BottomService"));
                        intent.putExtra("SDK_PRODUCT_LY", "MS");
                        context.startService(intent);
                    } catch (Throwable th) {
                        ba.m6312c().m6305b(th);
                    }
                }
            }
        };
        f4538b = new Enums("NO_SERVICE", i3, i2) {
            @Override
            public void mo6807a(Context context) {
                Context applicationContext = context.getApplicationContext();
                Interfacea interfaceC1409aM6808a = ClassT.m6808a(context);
                aa c1410aa = new aa();
                c1410aa.f4026a = false;
                c1410aa.f4027b = "M";
                c1410aa.f4028c = false;
                interfaceC1409aM6808a.mo5945a(applicationContext, c1410aa.m5949a());
            }
        };
        f4539c = new Enums("RECEIVER", i2, i) {
            @Override
            public void mo6807a(Context context) {
                Context applicationContext = context.getApplicationContext();
                Interfacea interfaceC1409aM6808a = ClassT.m6808a(context);
                aa c1410aa = new aa();
                c1410aa.f4026a = false;
                c1410aa.f4027b = "R";
                c1410aa.f4028c = false;
                interfaceC1409aM6808a.mo5945a(applicationContext, c1410aa.m5949a());
            }
        };
        f4540d = new Enums("ERISED", i, 4) {
            @Override
            public void mo6807a(Context context) {
                Context applicationContext = context.getApplicationContext();
                Interfacea interfaceC1409aM6808a = ClassT.m6808a(context);
                aa c1410aa = new aa();
                c1410aa.f4026a = false;
                c1410aa.f4027b = "E";
                c1410aa.f4028c = false;
                interfaceC1409aM6808a.mo5945a(applicationContext, c1410aa.m5949a());
            }
        };
        f4541f = new Enums[]{f4537a, f4538b, f4539c, f4540d};
    }

    private Enums(String str, int i, int i2) {
        super(str, i);
        this.f4542e = i2;
    }

    @Override
    public String toString() {
        return String.valueOf(this.f4542e);
    }

    public static Enums m6805a(int i) {
        for (Enums enumC1514s : values()) {
            if (enumC1514s.f4542e == i) {
                return enumC1514s;
            }
        }
        return f4538b;
    }

    public static boolean m6806b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            try {
                List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
                for (int i = 0; runningServices != null && i < runningServices.size(); i++) {
                    if ("com.baidu.bottom.service.BottomService".equals(runningServices.get(i).service.getClassName())) {
                        return true;
                    }
                }
            } catch (Exception e) {
                ba.m6312c().m6302a(e);
            }
        }
        return false;
    }
}
