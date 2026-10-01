package com.a.b.c.b;

import com.a.b.e.b.ab;
import com.a.b.e.b.ClassB;
import com.a.b.e.b.ClassD;
import com.a.b.e.c.ae;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassN;
import java.util.ArrayList;
import java.util.HashSet;

public final class ak implements Interfacec {

    private final ab f2049a;

    private final int[] f2050b;

    private final ClassB f2051c;

    public ak(ab c1168ab, int[] iArr, ClassB c1034b) {
        if (c1168ab == null) {
            throw new NullPointerException("method == null");
        }
        if (iArr == null) {
            throw new NullPointerException("order == null");
        }
        if (c1034b == null) {
            throw new NullPointerException("addresses == null");
        }
        this.f2049a = c1168ab;
        this.f2050b = iArr;
        this.f2051c = c1034b;
    }

    private static ClassD m4313a(ClassB c1175b, ClassB c1034b) {
        ClassN c1316nM4814c = c1175b.m4814c();
        int iM5496b = c1316nM4814c.m5496b();
        int iM4815d = c1175b.m4815d();
        Interfacee interfaceC1238eMo4807b = c1175b.m4818g().mo4807b();
        int iMo4148d_ = interfaceC1238eMo4807b.mo4148d_();
        if (iMo4148d_ == 0) {
            return ClassD.f2060a;
        }
        if ((iM4815d == -1 && iM5496b != iMo4148d_) || (iM4815d != -1 && (iM5496b != iMo4148d_ + 1 || iM4815d != c1316nM4814c.m5497b(iMo4148d_)))) {
            throw new RuntimeException("shouldn't happen: weird successors list");
        }
        for (int i = 0; i < iMo4148d_; i++) {
            if (interfaceC1238eMo4807b.mo4145a(i).equals(ClassC.f3267r)) {
                iMo4148d_ = i + 1;
                break;
            }
        }
        ClassD c1036d = new ClassD(iMo4148d_);
        for (int i2 = 0; i2 < iMo4148d_; i2++) {
            c1036d.m4338a(i2, new ae(interfaceC1238eMo4807b.mo4145a(i2)), c1034b.m4331a(c1316nM4814c.m5497b(i2)).m4378i());
        }
        c1036d.mo3944c_();
        return c1036d;
    }

    public static ClassF m4314a(ab c1168ab, int[] iArr, ClassB c1034b) {
        ClassD c1036d;
        ClassB c1175b = null;
        int length = iArr.length;
        ClassD c1177dM4746a = c1168ab.m4746a();
        ArrayList arrayList = new ArrayList(length);
        ClassD c1036d2 = ClassD.f2060a;
        int i = 0;
        ClassB c1175b2 = null;
        while (i < length) {
            ClassB c1175bM4825b = c1177dM4746a.m4825b(iArr[i]);
            if (c1175bM4825b.m4819h()) {
                ClassD c1036dM4313a = m4313a(c1175bM4825b, c1034b);
                if (c1036d2.m5476d_() == 0) {
                    c1175b = c1175bM4825b;
                    c1036d = c1036dM4313a;
                } else if (c1036d2.equals(c1036dM4313a) && m4316a(c1175b2, c1175bM4825b, c1034b)) {
                    c1175b = c1175bM4825b;
                    c1175bM4825b = c1175b2;
                    c1036d = c1036d2;
                } else {
                    if (c1036d2.m5476d_() != 0) {
                        arrayList.add(m4315a(c1175b2, c1175b, c1036d2, c1034b));
                    }
                    c1175b = c1175bM4825b;
                    c1036d = c1036dM4313a;
                }
            } else {
                c1175bM4825b = c1175b2;
                c1036d = c1036d2;
            }
            i++;
            c1036d2 = c1036d;
            c1175b2 = c1175bM4825b;
        }
        if (c1036d2.m5476d_() != 0) {
            arrayList.add(m4315a(c1175b2, c1175b, c1036d2, c1034b));
        }
        int size = arrayList.size();
        if (size == 0) {
            return ClassF.f2063a;
        }
        ClassF c1038f = new ClassF(size);
        for (int i2 = 0; i2 < size; i2++) {
            c1038f.m4345a(i2, (ClassG) arrayList.get(i2));
        }
        c1038f.mo3944c_();
        return c1038f;
    }

    private static ClassG m4315a(ClassB c1175b, ClassB c1175b2, ClassD c1036d, ClassB c1034b) {
        return new ClassG(c1034b.m4333b(c1175b).m4378i(), c1034b.m4334c(c1175b2).m4378i(), c1036d);
    }

    private static boolean m4316a(ClassB c1175b, ClassB c1175b2, ClassB c1034b) {
        if (c1175b == null) {
            throw new NullPointerException("start == null");
        }
        if (c1175b2 == null) {
            throw new NullPointerException("end == null");
        }
        return c1034b.m4334c(c1175b2).m4378i() - c1034b.m4333b(c1175b).m4378i() <= 65535;
    }

    @Override
    public ClassF mo4317a() {
        return m4314a(this.f2049a, this.f2050b, this.f2051c);
    }

    @Override
    public boolean mo4318b() {
        ClassD c1177dM4746a = this.f2049a.m4746a();
        int iD_ = c1177dM4746a.m5476d_();
        for (int i = 0; i < iD_; i++) {
            if (c1177dM4746a.m4821a(i).m4818g().mo4807b().mo4148d_() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public HashSet mo4319c() {
        HashSet hashSet = new HashSet(20);
        ClassD c1177dM4746a = this.f2049a.m4746a();
        int iD_ = c1177dM4746a.m5476d_();
        for (int i = 0; i < iD_; i++) {
            Interfacee interfaceC1238eMo4807b = c1177dM4746a.m4821a(i).m4818g().mo4807b();
            int iMo4148d_ = interfaceC1238eMo4807b.mo4148d_();
            for (int i2 = 0; i2 < iMo4148d_; i2++) {
                hashSet.add(interfaceC1238eMo4807b.mo4145a(i2));
            }
        }
        return hashSet;
    }
}
