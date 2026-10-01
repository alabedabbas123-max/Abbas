package com.a.b.c.c;

import com.a.b.c.b.ClassD;
import com.a.b.c.b.ClassE;
import com.a.b.c.b.ClassF;
import com.a.b.c.b.ClassG;
import com.a.b.c.b.ClassJ;
import com.a.b.g.ClassH;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

public final class ClassJ {

    private final ClassJ f2452a;

    private ClassF f2453b = null;

    private byte[] f2454c = null;

    private int f2455d = 0;

    private TreeMap f2456e = null;

    public ClassJ(ClassJ c1042j) {
        this.f2452a = c1042j;
    }

    private static void m4601a(ClassD c1036d, int i, int i2, String str, PrintWriter printWriter, Interfacea interfaceC1303a) {
        String strM4337a = c1036d.m4337a(str, String.valueOf(ClassK.m5485c(i)) + ": ");
        if (printWriter != null) {
            printWriter.println(strM4337a);
        }
        interfaceC1303a.mo5403a(i2, strM4337a);
    }

    private void m4602a(String str, PrintWriter printWriter, Interfacea interfaceC1303a) {
        int i = 0;
        m4603c();
        boolean z = interfaceC1303a != null;
        int i2 = z ? 6 : 0;
        int i3 = z ? 2 : 0;
        int iD_ = this.f2453b.m5476d_();
        String str2 = String.valueOf(str) + "  ";
        if (z) {
            interfaceC1303a.mo5403a(0, String.valueOf(str) + "tries:");
        } else {
            printWriter.println(String.valueOf(str) + "tries:");
        }
        for (int i4 = 0; i4 < iD_; i4++) {
            ClassG c1039gM4344a = this.f2453b.m4344a(i4);
            ClassD c1036dM4349c = c1039gM4344a.m4349c();
            String str3 = String.valueOf(str2) + "try " + ClassK.m5486d(c1039gM4344a.m4346a()) + ".." + ClassK.m5486d(c1039gM4344a.m4348b());
            String strM4337a = c1036dM4349c.m4337a(str2, "");
            if (z) {
                interfaceC1303a.mo5403a(i2, str3);
                interfaceC1303a.mo5403a(i3, strM4337a);
            } else {
                printWriter.println(str3);
                printWriter.println(strM4337a);
            }
        }
        if (z) {
            interfaceC1303a.mo5403a(0, String.valueOf(str) + "handlers:");
            interfaceC1303a.mo5403a(this.f2455d, String.valueOf(str2) + "size: " + ClassK.m5485c(this.f2456e.size()));
            ClassD c1036d = null;
            for (Map.Entry entry : this.f2456e.entrySet()) {
                ClassD c1036d2 = (ClassD) entry.getKey();
                int iIntValue = ((Integer) entry.getValue()).intValue();
                if (c1036d != null) {
                    m4601a(c1036d, i, iIntValue - i, str2, printWriter, interfaceC1303a);
                }
                c1036d = c1036d2;
                i = iIntValue;
            }
            m4601a(c1036d, i, this.f2454c.length - i, str2, printWriter, interfaceC1303a);
        }
    }

    private void m4603c() {
        if (this.f2453b == null) {
            this.f2453b = this.f2452a.m4366g();
        }
    }

    public int m4604a() {
        m4603c();
        return this.f2453b.m5476d_();
    }

    public void m4605a(ClassT c1113t) {
        int i;
        m4603c();
        be c1091beM4680j = c1113t.m4680j();
        int iD_ = this.f2453b.m5476d_();
        this.f2456e = new TreeMap();
        for (int i2 = 0; i2 < iD_; i2++) {
            this.f2456e.put(this.f2453b.m4344a(i2).m4349c(), null);
        }
        if (this.f2456e.size() > 65535) {
            throw new UnsupportedOperationException("too many catch handlers");
        }
        ClassH c1310h = new ClassH();
        this.f2455d = c1310h.mo5458e(this.f2456e.size());
        for (Map.Entry entry : this.f2456e.entrySet()) {
            ClassD c1036d = (ClassD) entry.getKey();
            int iD_2 = c1036d.m5476d_();
            boolean zM4339e = c1036d.m4339e();
            entry.setValue(Integer.valueOf(c1310h.mo5462g()));
            if (zM4339e) {
                c1310h.m5460f(-(iD_2 - 1));
                i = iD_2 - 1;
            } else {
                c1310h.m5460f(iD_2);
                i = iD_2;
            }
            for (int i3 = 0; i3 < i; i3++) {
                ClassE c1037eM4336a = c1036d.m4336a(i3);
                c1310h.mo5458e(c1091beM4680j.m4564b(c1037eM4336a.m4341a()));
                c1310h.mo5458e(c1037eM4336a.m4342b());
            }
            if (zM4339e) {
                c1310h.mo5458e(c1036d.m4336a(i).m4342b());
            }
        }
        this.f2454c = c1310h.m5461f();
    }

    public void m4606a(ClassT c1113t, Interfacea interfaceC1303a) {
        m4603c();
        if (interfaceC1303a.mo5405a()) {
            m4602a("  ", null, interfaceC1303a);
        }
        int iD_ = this.f2453b.m5476d_();
        for (int i = 0; i < iD_; i++) {
            ClassG c1039gM4344a = this.f2453b.m4344a(i);
            int iM4346a = c1039gM4344a.m4346a();
            int iM4348b = c1039gM4344a.m4348b();
            int i2 = iM4348b - iM4346a;
            if (i2 >= 65536) {
                throw new UnsupportedOperationException("bogus exception range: " + ClassK.m5480a(iM4346a) + ".." + ClassK.m5480a(iM4348b));
            }
            interfaceC1303a.mo5457d(iM4346a);
            interfaceC1303a.mo5456c(i2);
            interfaceC1303a.mo5456c(((Integer) this.f2456e.get(c1039gM4344a.m4349c())).intValue());
        }
        interfaceC1303a.mo5453a(this.f2454c);
    }

    public int m4607b() {
        return (m4604a() * 8) + this.f2454c.length;
    }
}
