package com.a.b.c.c;

import com.a.b.e.a.ClassA;
import com.a.b.e.a.ClassE;
import com.a.b.e.a.Enumb;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassC;
import com.a.b.e.c.ClassD;
import com.a.b.e.c.ClassE;
import com.a.b.e.c.ClassP;
import com.a.b.e.c.ClassS;
import com.a.b.e.c.ClassZ;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;
import java.util.ArrayList;

public final class ClassE {

    private static final ae f2431a = ae.m4964b(ClassC.m5056a("Ldalvik/annotation/AnnotationDefault;"));

    private static final ae f2432b = ae.m4964b(ClassC.m5056a("Ldalvik/annotation/EnclosingClass;"));

    private static final ae f2433c = ae.m4964b(ClassC.m5056a("Ldalvik/annotation/EnclosingMethod;"));

    private static final ae f2434d = ae.m4964b(ClassC.m5056a("Ldalvik/annotation/InnerClass;"));

    private static final ae f2435e = ae.m4964b(ClassC.m5056a("Ldalvik/annotation/MemberClasses;"));

    private static final ae f2436f = ae.m4964b(ClassC.m5056a("Ldalvik/annotation/Signature;"));

    private static final ae f2437g = ae.m4964b(ClassC.m5056a("Ldalvik/annotation/SourceDebugExtension;"));

    private static final ae f2438h = ae.m4964b(ClassC.m5056a("Ldalvik/annotation/Throws;"));

    private static final ad f2439i = new ad("accessFlags");

    private static final ad f2440j = new ad("name");

    private static final ad f2441k = new ad("value");

    public static ClassA m4580a(ClassA c1161a) {
        ClassA c1161a2 = new ClassA(f2431a, Enumb.SYSTEM);
        c1161a2.m4708a(new ClassE(f2441k, new ClassC(c1161a)));
        c1161a2.mo3944c_();
        return c1161a2;
    }

    public static ClassA m4581a(ad c1204ad) {
        ClassA c1161a = new ClassA(f2436f, Enumb.SYSTEM);
        String strM4958j = c1204ad.m4958j();
        int length = strM4958j.length();
        ArrayList arrayList = new ArrayList(20);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (strM4958j.charAt(i) == 'L') {
                while (i2 < length) {
                    char cCharAt = strM4958j.charAt(i2);
                    if (cCharAt == ';') {
                        i2++;
                        break;
                    }
                    if (cCharAt == '<') {
                        break;
                    }
                    i2++;
                }
            } else {
                while (i2 < length && strM4958j.charAt(i2) != 'L') {
                    i2++;
                }
            }
            arrayList.add(strM4958j.substring(i, i2));
            i = i2;
        }
        int size = arrayList.size();
        ClassE c1212e = new ClassE(size);
        for (int i3 = 0; i3 < size; i3++) {
            c1212e.m4980a(i3, (Abstracta) new ad((String) arrayList.get(i3)));
        }
        c1212e.mo3944c_();
        c1161a.m4708a(new ClassE(f2441k, new ClassD(c1212e)));
        c1161a.mo3944c_();
        return c1161a;
    }

    public static ClassA m4582a(ad c1204ad, int i) {
        ClassA c1161a = new ClassA(f2434d, Enumb.SYSTEM);
        Abstracta abstractC1200a = c1204ad;
        if (c1204ad == null) {
            abstractC1200a = ClassS.f3185a;
        }
        c1161a.m4708a(new ClassE(f2440j, abstractC1200a));
        c1161a.m4708a(new ClassE(f2439i, ClassP.m5001a(i)));
        c1161a.mo3944c_();
        return c1161a;
    }

    public static ClassA m4583a(ae c1205ae) {
        ClassA c1161a = new ClassA(f2432b, Enumb.SYSTEM);
        c1161a.m4708a(new ClassE(f2441k, c1205ae));
        c1161a.mo3944c_();
        return c1161a;
    }

    public static ClassA m4584a(ClassZ c1233z) {
        ClassA c1161a = new ClassA(f2433c, Enumb.SYSTEM);
        c1161a.m4708a(new ClassE(f2441k, c1233z));
        c1161a.mo3944c_();
        return c1161a;
    }

    public static ClassA m4585a(Interfacee interfaceC1238e) {
        ClassD c1211dM4588c = m4588c(interfaceC1238e);
        ClassA c1161a = new ClassA(f2435e, Enumb.SYSTEM);
        c1161a.m4708a(new ClassE(f2441k, c1211dM4588c));
        c1161a.mo3944c_();
        return c1161a;
    }

    public static ClassA m4586b(ad c1204ad) {
        ClassA c1161a = new ClassA(f2437g, Enumb.SYSTEM);
        c1161a.m4708a(new ClassE(f2441k, c1204ad));
        c1161a.mo3944c_();
        return c1161a;
    }

    public static ClassA m4587b(Interfacee interfaceC1238e) {
        ClassD c1211dM4588c = m4588c(interfaceC1238e);
        ClassA c1161a = new ClassA(f2438h, Enumb.SYSTEM);
        c1161a.m4708a(new ClassE(f2441k, c1211dM4588c));
        c1161a.mo3944c_();
        return c1161a;
    }

    private static ClassD m4588c(Interfacee interfaceC1238e) {
        int iMo4148d_ = interfaceC1238e.mo4148d_();
        ClassE c1212e = new ClassE(iMo4148d_);
        for (int i = 0; i < iMo4148d_; i++) {
            c1212e.m4980a(i, (Abstracta) ae.m4964b(interfaceC1238e.mo4145a(i)));
        }
        c1212e.mo3944c_();
        return new ClassD(c1212e);
    }
}
