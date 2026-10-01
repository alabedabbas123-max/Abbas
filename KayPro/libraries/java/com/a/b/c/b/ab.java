package com.a.b.c.b;

import com.a.a.ClassA;
import com.a.b.c.ClassA;
import com.a.b.e.b.ClassO;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.b.ClassZ;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractx;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.d.ClassC;
import com.a.b.f.ClassA;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

public final class ab {

    private final ClassA f2017a;

    private final int f2018b;

    private ArrayList f2019c;

    private int f2023g;

    private final int f2024h;

    private int f2022f = -1;

    private boolean f2020d = false;

    private boolean f2021e = false;

    public ab(ClassA c0984a, int i, int i2, int i3) {
        this.f2017a = c0984a;
        this.f2018b = i2;
        this.f2019c = new ArrayList(i);
        this.f2024h = i3;
    }

    private ClassN m4250a(Abstractl abstractC1044l, ClassN c1046n) {
        while (c1046n != null && (!c1046n.m4395c().mo4239b(abstractC1044l) || (this.f2017a.f1962c && c1046n.m4393a() == 26))) {
            c1046n = ClassO.m4401a(c1046n, this.f2017a);
        }
        return c1046n;
    }

    private void m4251a(int i) {
        m4266d(i);
        this.f2023g += i;
    }

    private static void m4252a(ClassI c1041i, Interfacek interfaceC1043k) {
        int iMo4222a;
        Abstracta abstractC1200aM4353c = c1041i.m4353c();
        int iMo4222a2 = interfaceC1043k.mo4222a(abstractC1200aM4353c);
        if (iMo4222a2 >= 0) {
            c1041i.m4351a(iMo4222a2);
        }
        if (!(abstractC1200aM4353c instanceof Abstractx) || (iMo4222a = interfaceC1043k.mo4222a(((Abstractx) abstractC1200aM4353c).m5022n())) < 0) {
            return;
        }
        c1041i.m4352b(iMo4222a);
    }

    private static void m4253a(ClassY c1057y, Interfacek interfaceC1043k) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= c1057y.m4461c()) {
                return;
            }
            Abstracta abstractC1200aM4458a = c1057y.m4458a(i2);
            c1057y.m4459a(i2, interfaceC1043k.mo4222a(abstractC1200aM4458a));
            if (abstractC1200aM4458a instanceof Abstractx) {
                c1057y.m4464f(interfaceC1043k.mo4222a(((Abstractx) abstractC1200aM4458a).m5022n()));
            }
            i = i2 + 1;
        }
    }

    private static void m4254a(HashSet hashSet, Abstractl abstractC1044l) {
        int i = 0;
        if (abstractC1044l instanceof ClassI) {
            hashSet.add(((ClassI) abstractC1044l).m4353c());
            return;
        }
        if (abstractC1044l instanceof ClassY) {
            ClassY c1057y = (ClassY) abstractC1044l;
            while (i < c1057y.m4461c()) {
                hashSet.add(c1057y.m4458a(i));
                i++;
            }
            return;
        }
        if (!(abstractC1044l instanceof ClassW)) {
            if (abstractC1044l instanceof ClassX) {
                m4255a(hashSet, ((ClassX) abstractC1044l).m4457c());
            }
        } else {
            ClassZ c1199zM4455c = ((ClassW) abstractC1044l).m4455c();
            int iM4937d = c1199zM4455c.m4937d();
            while (i < iM4937d) {
                m4255a(hashSet, c1199zM4455c.m4928a(i));
                i++;
            }
        }
    }

    private static void m4255a(HashSet hashSet, ClassU c1194u) {
        if (c1194u == null) {
            return;
        }
        ClassO c1188oM4896i = c1194u.m4896i();
        ad c1204adM4860a = c1188oM4896i.m4860a();
        ad c1204adM4861b = c1188oM4896i.m4861b();
        ClassC c1236cMo3825a = c1194u.mo3825a();
        if (c1236cMo3825a != ClassC.f3259j) {
            hashSet.add(ae.m4964b(c1236cMo3825a));
        } else {
            hashSet.add(ae.m4964b(ClassC.f3267r));
        }
        if (c1204adM4860a != null) {
            hashSet.add(c1204adM4860a);
        }
        if (c1204adM4861b != null) {
            hashSet.add(c1204adM4861b);
        }
    }

    private static boolean m4256a(ClassU c1194u) {
        return (c1194u == null || c1194u.m4896i().m4860a() == null) ? false : true;
    }

    private boolean m4257a(ClassN[] c1046nArr) {
        int i = this.f2022f < 0 ? 0 : this.f2022f;
        boolean z = false;
        while (true) {
            int iM4258b = m4258b(c1046nArr);
            if (i >= iM4258b) {
                this.f2022f = i;
                return z;
            }
            z = true;
            int i2 = iM4258b - i;
            int size = this.f2019c.size();
            for (int i3 = 0; i3 < size; i3++) {
                Abstractl abstractC1044l = (Abstractl) this.f2019c.get(i3);
                if (!(abstractC1044l instanceof ClassH)) {
                    this.f2019c.set(i3, abstractC1044l.mo4329d(i2));
                }
            }
            i = iM4258b;
        }
    }

    private int m4258b(ClassN[] c1046nArr) {
        int iM4370a;
        int size = this.f2019c.size();
        int i = this.f2022f;
        for (int i2 = 0; i2 < size; i2++) {
            Abstractl abstractC1044l = (Abstractl) this.f2019c.get(i2);
            ClassN c1046n = c1046nArr[i2];
            ClassN c1046nM4250a = m4250a(abstractC1044l, c1046n);
            if (c1046nM4250a == null) {
                iM4370a = abstractC1044l.m4370a(m4264d(abstractC1044l).m4395c().mo4240c(abstractC1044l));
                if (iM4370a <= i) {
                }
                c1046nArr[i2] = c1046nM4250a;
                i = iM4370a;
            } else {
                if (c1046n != c1046nM4250a) {
                }
            }
            iM4370a = i;
            c1046nArr[i2] = c1046nM4250a;
            i = iM4370a;
        }
        return i;
    }

    private void m4259b(int i) {
        m4261c(i);
        this.f2022f += i;
    }

    private static boolean m4260b(Abstractl abstractC1044l) {
        if (abstractC1044l instanceof ClassW) {
            ClassZ c1199zM4455c = ((ClassW) abstractC1044l).m4455c();
            int iM4937d = c1199zM4455c.m4937d();
            for (int i = 0; i < iM4937d; i++) {
                if (m4256a(c1199zM4455c.m4928a(i))) {
                    return true;
                }
            }
        } else if ((abstractC1044l instanceof ClassX) && m4256a(((ClassX) abstractC1044l).m4457c())) {
            return true;
        }
        return false;
    }

    private void m4261c(int i) {
        int size = this.f2019c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Abstractl abstractC1044l = (Abstractl) this.f2019c.get(i2);
            if (!(abstractC1044l instanceof ClassH)) {
                this.f2019c.set(i2, abstractC1044l.mo4329d(i));
            }
        }
    }

    private void m4262c(Abstractl abstractC1044l) {
        if (!this.f2020d && abstractC1044l.m4380k().m4799a() >= 0) {
            this.f2020d = true;
        }
        if (this.f2021e || !m4260b(abstractC1044l)) {
            return;
        }
        this.f2021e = true;
    }

    private void m4263c(ClassN[] c1046nArr) {
        if (this.f2022f != 0) {
            this.f2019c = m4265d(c1046nArr);
            return;
        }
        int size = this.f2019c.size();
        for (int i = 0; i < size; i++) {
            Abstractl abstractC1044l = (Abstractl) this.f2019c.get(i);
            ClassN c1046nM4379j = abstractC1044l.m4379j();
            ClassN c1046n = c1046nArr[i];
            if (c1046nM4379j != c1046n) {
                this.f2019c.set(i, abstractC1044l.mo4312a(c1046n));
            }
        }
    }

    private ClassN m4264d(Abstractl abstractC1044l) {
        ClassN c1046nM4250a = m4250a(abstractC1044l.m4383n(), abstractC1044l.m4379j());
        if (c1046nM4250a == null) {
            throw new ClassA("No expanded opcode for " + abstractC1044l);
        }
        return c1046nM4250a;
    }

    private ArrayList m4265d(ClassN[] c1046nArr) {
        ClassN c1046n;
        Abstractl abstractC1044l;
        Abstractl abstractC1044l2;
        Abstractl abstractC1044lMo4312a;
        int size = this.f2019c.size();
        ArrayList arrayList = new ArrayList(size * 2);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < size; i++) {
            Abstractl abstractC1044l3 = (Abstractl) this.f2019c.get(i);
            ClassN c1046nM4379j = abstractC1044l3.m4379j();
            ClassN c1046n2 = c1046nArr[i];
            if (c1046n2 != null) {
                abstractC1044l2 = null;
                abstractC1044l = null;
                c1046n = c1046n2;
                abstractC1044lMo4312a = abstractC1044l3;
            } else {
                ClassN c1046nM4264d = m4264d(abstractC1044l3);
                BitSet bitSetMo4240c = c1046nM4264d.m4395c().mo4240c(abstractC1044l3);
                Abstractl abstractC1044lM4373b = abstractC1044l3.m4373b(bitSetMo4240c);
                Abstractl abstractC1044lM4374c = abstractC1044l3.m4374c(bitSetMo4240c);
                Abstractl abstractC1044lM4376d = abstractC1044l3.m4376d(bitSetMo4240c);
                c1046n = c1046nM4264d;
                abstractC1044l = abstractC1044lM4373b;
                abstractC1044l2 = abstractC1044lM4374c;
                abstractC1044lMo4312a = abstractC1044lM4376d;
            }
            if ((abstractC1044lMo4312a instanceof ClassH) && ((ClassH) abstractC1044lMo4312a).m4350c()) {
                arrayList2.add((ClassH) abstractC1044lMo4312a);
            } else {
                if (abstractC1044l != null) {
                    arrayList.add(abstractC1044l);
                }
                if (!(abstractC1044lMo4312a instanceof Abstractao) && arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((ClassH) it.next());
                    }
                    arrayList2.clear();
                }
                if (c1046n != c1046nM4379j) {
                    abstractC1044lMo4312a = abstractC1044lMo4312a.mo4312a(c1046n);
                }
                arrayList.add(abstractC1044lMo4312a);
                if (abstractC1044l2 != null) {
                    arrayList.add(abstractC1044l2);
                }
            }
        }
        return arrayList;
    }

    private void m4266d(int i) {
        int size = this.f2019c.size();
        int i2 = this.f2023g + this.f2018b + this.f2022f;
        int i3 = i2 - this.f2024h;
        ClassA c1239a = new ClassA(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 >= i3) {
                c1239a.mo5081a(i4, i4 + i, 1);
            } else {
                c1239a.mo5081a(i4, i4, 1);
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            Abstractl abstractC1044l = (Abstractl) this.f2019c.get(i5);
            if (!(abstractC1044l instanceof ClassH)) {
                this.f2019c.set(i5, abstractC1044l.mo4371a(c1239a));
            }
        }
    }

    private void m4267e(ClassN[] c1046nArr) {
        do {
            int i = ((this.f2018b + this.f2022f) + this.f2023g) - this.f2024h;
            Iterator it = this.f2019c.iterator();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (it.hasNext()) {
                ClassX c1197xM4381l = ((Abstractl) it.next()).m4381l();
                int i6 = i2;
                int i7 = i3;
                int i8 = i4;
                int i9 = i5;
                int i10 = 0;
                while (i10 < c1197xM4381l.m5476d_()) {
                    ClassU c1194uM4916b = c1197xM4381l.m4916b(i10);
                    if (c1194uM4916b.m4899l()) {
                        boolean z = c1194uM4916b.m4894g() >= i;
                        if (c1194uM4916b.m4902o()) {
                            if (z) {
                                i6++;
                            } else {
                                i8++;
                            }
                        } else if (z) {
                            i7++;
                        } else {
                            i9++;
                        }
                    }
                    int i11 = i9;
                    i10++;
                    i6 = i6;
                    i7 = i7;
                    i8 = i8;
                    i9 = i11;
                }
                i5 = i9;
                i4 = i8;
                i3 = i7;
                i2 = i6;
            }
            if (i3 > i2 && i5 > i4) {
                m4259b(1);
            } else if (i3 > i2) {
                m4251a(1);
            } else {
                if (i5 <= i4) {
                    return;
                }
                m4259b(1);
                if (this.f2024h != 0 && i2 > i3) {
                    m4251a(1);
                }
            }
        } while (m4257a(c1046nArr));
    }

    private ClassN[] m4268e() {
        int size = this.f2019c.size();
        ClassN[] c1046nArr = new ClassN[size];
        for (int i = 0; i < size; i++) {
            c1046nArr[i] = ((Abstractl) this.f2019c.get(i)).m4379j();
        }
        return c1046nArr;
    }

    private void m4269f() {
        do {
            m4270g();
        } while (m4271h());
    }

    private void m4270g() {
        int size = this.f2019c.size();
        int iMo4229a = 0;
        for (int i = 0; i < size; i++) {
            Abstractl abstractC1044l = (Abstractl) this.f2019c.get(i);
            abstractC1044l.m4375c(iMo4229a);
            iMo4229a += abstractC1044l.mo4229a();
        }
    }

    private boolean m4271h() {
        int i;
        int i2;
        boolean z;
        int i3 = 0;
        int size = this.f2019c.size();
        boolean z2 = false;
        while (i3 < size) {
            Abstractl abstractC1044l = (Abstractl) this.f2019c.get(i3);
            if (abstractC1044l instanceof am) {
                ClassN c1046nM4379j = abstractC1044l.m4379j();
                am c1031am = (am) abstractC1044l;
                if (c1046nM4379j.m4395c().mo4237a(c1031am)) {
                    z = z2;
                } else {
                    if (c1046nM4379j.m4394b() == 40) {
                        ClassN c1046nM4250a = m4250a(abstractC1044l, c1046nM4379j);
                        if (c1046nM4250a == null) {
                            throw new UnsupportedOperationException("method too long");
                        }
                        this.f2019c.set(i3, abstractC1044l.mo4312a(c1046nM4250a));
                        i2 = i3;
                        i = size;
                    } else {
                        try {
                            ClassH c1040h = (ClassH) this.f2019c.get(i3 + 1);
                            this.f2019c.set(i3, new am(ClassO.f2103P, c1031am.m4380k(), ClassX.f3113a, c1031am.m4325c()));
                            this.f2019c.add(i3, c1031am.m4324a(c1040h));
                            i = size + 1;
                            i2 = i3 + 1;
                        } catch (ClassCastException e) {
                            throw new IllegalStateException("unpaired TargetInsn");
                        } catch (IndexOutOfBoundsException e2) {
                            throw new IllegalStateException("unpaired TargetInsn (dangling)");
                        }
                    }
                    size = i;
                    i3 = i2;
                    z = true;
                }
            } else {
                z = z2;
            }
            i3++;
            z2 = z;
        }
        return z2;
    }

    public void m4272a(int i, ClassH c1040h) {
        int size = (this.f2019c.size() - i) - 1;
        try {
            this.f2019c.set(size, ((am) this.f2019c.get(size)).m4324a(c1040h));
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("non-reversible instruction");
        } catch (IndexOutOfBoundsException e2) {
            throw new IllegalArgumentException("too few instructions");
        }
    }

    public void m4273a(Interfacek interfaceC1043k) {
        for (Abstractl abstractC1044l : this.f2019c) {
            if (abstractC1044l instanceof ClassI) {
                m4252a((ClassI) abstractC1044l, interfaceC1043k);
            } else if (abstractC1044l instanceof ClassY) {
                m4253a((ClassY) abstractC1044l, interfaceC1043k);
            }
        }
    }

    public void m4274a(Abstractl abstractC1044l) {
        this.f2019c.add(abstractC1044l);
        m4262c(abstractC1044l);
    }

    public boolean m4275a() {
        return this.f2020d;
    }

    public boolean m4276b() {
        return this.f2021e;
    }

    public HashSet m4277c() {
        HashSet hashSet = new HashSet(20);
        Iterator it = this.f2019c.iterator();
        while (it.hasNext()) {
            m4254a(hashSet, (Abstractl) it.next());
        }
        return hashSet;
    }

    public ClassM m4278d() {
        if (this.f2022f >= 0) {
            throw new UnsupportedOperationException("already processed");
        }
        ClassN[] c1046nArrM4268e = m4268e();
        m4257a(c1046nArrM4268e);
        if (this.f2017a.f1960a) {
            m4267e(c1046nArrM4268e);
        }
        m4263c(c1046nArrM4268e);
        m4269f();
        return ClassM.m4386a(this.f2019c, this.f2022f + this.f2018b + this.f2023g);
    }
}
