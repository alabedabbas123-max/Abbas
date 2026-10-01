package com.a.b.c.c;

import com.a.a.a.ClassB;
import com.a.b.c.b.ac;
import com.a.b.c.b.ad;
import com.a.b.c.b.ClassS;
import com.a.b.c.b.ClassU;
import com.a.b.c.b.Enumt;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassZ;
import com.a.b.e.d.ClassA;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.g.ClassH;
import com.a.b.g.Interfacea;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;

public final class ClassP {

    private final ac f2483a;

    private final ClassS f2484b;

    private final ClassT f2486d;

    private final int f2487e;

    private final int f2488f;

    private final ClassA f2489g;

    private final boolean f2490h;

    private Interfacea f2493k;

    private PrintWriter f2494l;

    private String f2495m;

    private boolean f2496n;

    private final ClassU[] f2497o;

    private int f2491i = 0;

    private int f2492j = 1;

    private final ClassH f2485c = new ClassH();

    public ClassP(ac c1021ac, ClassS c1051s, ClassT c1113t, int i, int i2, boolean z, ClassZ c1233z) {
        this.f2483a = c1021ac;
        this.f2484b = c1051s;
        this.f2486d = c1113t;
        this.f2489g = c1233z.m4983i();
        this.f2490h = z;
        this.f2487e = i;
        this.f2488f = i2;
        this.f2497o = new ClassU[i2];
    }

    private int m4636a(int i) {
        int iD_ = this.f2484b.m5476d_();
        while (i < iD_ && this.f2484b.m4431a(i).m4433a() == this.f2491i) {
            i++;
            ClassU c1053uM4431a = this.f2484b.m4431a(i);
            int iM4443g = c1053uM4431a.m4443g();
            ClassU c1053u = this.f2497o[iM4443g];
            if (c1053uM4431a != c1053u) {
                this.f2497o[iM4443g] = c1053uM4431a;
                if (c1053uM4431a.m4439c()) {
                    if (c1053u == null || !c1053uM4431a.m4438b(c1053u)) {
                        m4650c(c1053uM4431a);
                    } else {
                        if (c1053u.m4439c()) {
                            throw new RuntimeException("shouldn't happen");
                        }
                        m4646b(c1053uM4431a);
                    }
                } else if (c1053uM4431a.m4437b() != Enumt.END_REPLACED) {
                    m4655e(c1053uM4431a);
                }
            }
        }
        return i;
    }

    private static int m4637a(int i, int i2) {
        if (i < -4 || i > 10) {
            throw new RuntimeException("Parameter out of range");
        }
        return i + 4 + (i2 * 15) + 10;
    }

    private int m4638a(int i, ArrayList arrayList) {
        int size = arrayList.size();
        while (i < size && ((ad) arrayList.get(i)).m4282a() == this.f2491i) {
            m4641a((ad) arrayList.get(i));
            i++;
        }
        return i;
    }

    private String m4639a(ClassU c1053u) {
        StringBuilder sb = new StringBuilder();
        sb.append("v");
        sb.append(c1053u.m4443g());
        sb.append(' ');
        ad c1204adM4440d = c1053u.m4440d();
        if (c1204adM4440d == null) {
            sb.append("null");
        } else {
            sb.append(c1204adM4440d.mo3828d());
        }
        sb.append(' ');
        ae c1205aeM4442f = c1053u.m4442f();
        if (c1205aeM4442f == null) {
            sb.append("null");
        } else {
            sb.append(c1205aeM4442f.mo3828d());
        }
        ad c1204adM4441e = c1053u.m4441e();
        if (c1204adM4441e != null) {
            sb.append(' ');
            sb.append(c1204adM4441e.mo3828d());
        }
        return sb.toString();
    }

    private void m4640a(int i, String str) {
        if (this.f2495m != null) {
            str = String.valueOf(this.f2495m) + str;
        }
        if (this.f2493k != null) {
            Interfacea interfaceC1303a = this.f2493k;
            if (!this.f2496n) {
                i = 0;
            }
            interfaceC1303a.mo5403a(i, str);
        }
        if (this.f2494l != null) {
            this.f2494l.println(str);
        }
    }

    private void m4641a(ad c1022ad) {
        int i;
        int i2;
        int iM4799a = c1022ad.m4283b().m4799a();
        int iM4282a = c1022ad.m4282a();
        int i3 = iM4799a - this.f2492j;
        int i4 = iM4282a - this.f2491i;
        if (i4 < 0) {
            throw new RuntimeException("Position entries must be in ascending address order");
        }
        if (i3 < -4 || i3 > 10) {
            m4645b(i3);
            i3 = 0;
        }
        int iM4637a = m4637a(i3, i4);
        if ((iM4637a & (-256)) > 0) {
            m4649c(i4);
            int iM4637a2 = m4637a(i3, 0);
            if ((iM4637a2 & (-256)) > 0) {
                m4645b(i3);
                i = 0;
                iM4637a = m4637a(0, 0);
                i2 = 0;
            } else {
                iM4637a = iM4637a2;
                i = i3;
                i2 = 0;
            }
        } else {
            i = i3;
            i2 = i4;
        }
        this.f2485c.mo3755a(iM4637a);
        this.f2492j = i + this.f2492j;
        this.f2491i = i2 + this.f2491i;
        if (this.f2493k == null && this.f2494l == null) {
            return;
        }
        m4640a(1, String.format("%04x: line %d", Integer.valueOf(this.f2491i), Integer.valueOf(this.f2492j)));
    }

    private void m4642a(ad c1204ad) {
        if (c1204ad == null || this.f2486d == null) {
            this.f2485c.mo5458e(0);
        } else {
            this.f2485c.mo5458e(this.f2486d.m4677g().m4559b(c1204ad) + 1);
        }
    }

    private void m4643a(ae c1205ae) {
        if (c1205ae == null || this.f2486d == null) {
            this.f2485c.mo5458e(0);
        } else {
            this.f2485c.mo5458e(this.f2486d.m4680j().m4564b(c1205ae) + 1);
        }
    }

    private void m4644a(ArrayList arrayList, ArrayList arrayList2) {
        int i;
        ClassU c1053u;
        boolean z = (this.f2493k == null && this.f2494l == null) ? false : true;
        int iMo5462g = this.f2485c.mo5462g();
        if (arrayList.size() > 0) {
            this.f2492j = ((ad) arrayList.get(0)).m4283b().m4799a();
        }
        this.f2485c.mo5458e(this.f2492j);
        if (z) {
            m4640a(this.f2485c.mo5462g() - iMo5462g, "line_start: " + this.f2492j);
        }
        int iM4651d = m4651d();
        ClassB c1235bM5042c = this.f2489g.m5042c();
        int iD_ = c1235bM5042c.m5476d_();
        if (this.f2490h) {
            i = iM4651d;
        } else {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ClassU c1053u2 = (ClassU) it.next();
                if (iM4651d == c1053u2.m4443g()) {
                    this.f2497o[iM4651d] = c1053u2;
                    break;
                }
            }
            i = iM4651d + 1;
        }
        int iMo5462g2 = this.f2485c.mo5462g();
        this.f2485c.mo5458e(iD_);
        if (z) {
            m4640a(this.f2485c.mo5462g() - iMo5462g2, String.format("parameters_size: %04x", Integer.valueOf(iD_)));
        }
        int iM5066j = i;
        for (int i2 = 0; i2 < iD_; i2++) {
            ClassC c1236cM5053b = c1235bM5042c.m5053b(i2);
            int iMo5462g3 = this.f2485c.mo5462g();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c1053u = null;
                    break;
                }
                c1053u = (ClassU) it2.next();
                if (iM5066j == c1053u.m4443g()) {
                    if (c1053u.m4441e() != null) {
                        m4642a((ad) null);
                    } else {
                        m4642a(c1053u.m4440d());
                    }
                    this.f2497o[iM5066j] = c1053u;
                    break;
                }
            }
            if (c1053u == null) {
                m4642a((ad) null);
            }
            if (z) {
                m4640a(this.f2485c.mo5462g() - iMo5462g3, "parameter " + ((c1053u == null || c1053u.m4441e() != null) ? "<unnamed>" : c1053u.m4440d().mo3828d()) + " v" + iM5066j);
            }
            iM5066j += c1236cM5053b.m5066j();
        }
        for (ClassU c1053u3 : this.f2497o) {
            if (c1053u3 != null && c1053u3.m4441e() != null) {
                m4653d(c1053u3);
            }
        }
    }

    private void m4645b(int i) {
        int iMo5462g = this.f2485c.mo5462g();
        this.f2485c.mo3755a(2);
        this.f2485c.m5460f(i);
        this.f2492j += i;
        if (this.f2493k == null && this.f2494l == null) {
            return;
        }
        m4640a(this.f2485c.mo5462g() - iMo5462g, String.format("line = %d", Integer.valueOf(this.f2492j)));
    }

    private void m4646b(ClassU c1053u) {
        int iMo5462g = this.f2485c.mo5462g();
        this.f2485c.mo3755a(6);
        m4652d(c1053u.m4443g());
        if (this.f2493k == null && this.f2494l == null) {
            return;
        }
        m4640a(this.f2485c.mo5462g() - iMo5462g, String.format("%04x: +local restart %s", Integer.valueOf(this.f2491i), m4639a(c1053u)));
    }

    private byte[] m4647b() {
        int iM4636a = 0;
        ArrayList arrayListM4648c = m4648c();
        m4644a(arrayListM4648c, m4654e());
        this.f2485c.mo3755a(7);
        if (this.f2493k != null || this.f2494l != null) {
            m4640a(1, String.format("%04x: prologue end", Integer.valueOf(this.f2491i)));
        }
        int size = arrayListM4648c.size();
        int iD_ = this.f2484b.m5476d_();
        int i = 0;
        while (true) {
            iM4636a = m4636a(iM4636a);
            int iM4638a = m4638a(i, arrayListM4648c);
            int iM4433a = iM4636a < iD_ ? this.f2484b.m4431a(iM4636a).m4433a() : Integer.MAX_VALUE;
            int iM4282a = iM4638a < size ? ((ad) arrayListM4648c.get(iM4638a)).m4282a() : Integer.MAX_VALUE;
            int iMin = Math.min(iM4282a, iM4433a);
            if (iMin == Integer.MAX_VALUE || (iMin == this.f2487e && iM4433a == Integer.MAX_VALUE && iM4282a == Integer.MAX_VALUE)) {
                break;
            }
            if (iMin == iM4282a) {
                i = iM4638a + 1;
                m4641a((ad) arrayListM4648c.get(iM4638a));
            } else {
                m4649c(iMin - this.f2491i);
                i = iM4638a;
            }
        }
        m4656f();
        return this.f2485c.m5461f();
    }

    private ArrayList m4648c() {
        int iD_ = this.f2483a == null ? 0 : this.f2483a.m5476d_();
        ArrayList arrayList = new ArrayList(iD_);
        for (int i = 0; i < iD_; i++) {
            arrayList.add(this.f2483a.m4280a(i));
        }
        Collections.sort(arrayList, new ClassQ(this));
        return arrayList;
    }

    private void m4649c(int i) {
        int iMo5462g = this.f2485c.mo5462g();
        this.f2485c.mo3755a(1);
        this.f2485c.mo5458e(i);
        this.f2491i += i;
        if (this.f2493k == null && this.f2494l == null) {
            return;
        }
        m4640a(this.f2485c.mo5462g() - iMo5462g, String.format("%04x: advance pc", Integer.valueOf(this.f2491i)));
    }

    private void m4650c(ClassU c1053u) {
        if (c1053u.m4441e() != null) {
            m4653d(c1053u);
            return;
        }
        int iMo5462g = this.f2485c.mo5462g();
        this.f2485c.mo3755a(3);
        m4652d(c1053u.m4443g());
        m4642a(c1053u.m4440d());
        m4643a(c1053u.m4442f());
        if (this.f2493k == null && this.f2494l == null) {
            return;
        }
        m4640a(this.f2485c.mo5462g() - iMo5462g, String.format("%04x: +local %s", Integer.valueOf(this.f2491i), m4639a(c1053u)));
    }

    private int m4651d() {
        return (this.f2488f - this.f2489g.m5042c().m5055e()) - (this.f2490h ? 0 : 1);
    }

    private void m4652d(int i) {
        if (i < 0) {
            throw new RuntimeException("Signed value where unsigned required: " + i);
        }
        this.f2485c.mo5458e(i);
    }

    private void m4653d(ClassU c1053u) {
        int iMo5462g = this.f2485c.mo5462g();
        this.f2485c.mo3755a(4);
        m4652d(c1053u.m4443g());
        m4642a(c1053u.m4440d());
        m4643a(c1053u.m4442f());
        m4642a(c1053u.m4441e());
        if (this.f2493k == null && this.f2494l == null) {
            return;
        }
        m4640a(this.f2485c.mo5462g() - iMo5462g, String.format("%04x: +localx %s", Integer.valueOf(this.f2491i), m4639a(c1053u)));
    }

    private ArrayList m4654e() {
        ArrayList arrayList = new ArrayList(this.f2489g.m5042c().m5476d_());
        int iM4651d = m4651d();
        BitSet bitSet = new BitSet(this.f2488f - iM4651d);
        int iD_ = this.f2484b.m5476d_();
        for (int i = 0; i < iD_; i++) {
            ClassU c1053uM4431a = this.f2484b.m4431a(i);
            int iM4443g = c1053uM4431a.m4443g();
            if (iM4443g >= iM4651d && !bitSet.get(iM4443g - iM4651d)) {
                bitSet.set(iM4443g - iM4651d);
                arrayList.add(c1053uM4431a);
            }
        }
        Collections.sort(arrayList, new ClassR(this));
        return arrayList;
    }

    private void m4655e(ClassU c1053u) {
        int iMo5462g = this.f2485c.mo5462g();
        this.f2485c.mo3755a(5);
        this.f2485c.mo5458e(c1053u.m4443g());
        if (this.f2493k == null && this.f2494l == null) {
            return;
        }
        m4640a(this.f2485c.mo5462g() - iMo5462g, String.format("%04x: -local %s", Integer.valueOf(this.f2491i), m4639a(c1053u)));
    }

    private void m4656f() {
        this.f2485c.mo3755a(0);
        if (this.f2493k == null && this.f2494l == null) {
            return;
        }
        m4640a(1, "end sequence");
    }

    public byte[] m4657a() {
        try {
            return m4647b();
        } catch (IOException e) {
            throw ClassB.m3756a(e, "...while encoding debug info");
        }
    }

    public byte[] m4658a(String str, PrintWriter printWriter, Interfacea interfaceC1303a, boolean z) {
        this.f2495m = str;
        this.f2494l = printWriter;
        this.f2493k = interfaceC1303a;
        this.f2496n = z;
        return m4657a();
    }
}
