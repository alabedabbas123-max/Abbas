package com.a.b.f;

import com.a.b.e.b.Abstractj;
import com.a.b.e.b.ab;
import com.a.b.e.b.ac;
import com.a.b.e.b.ad;
import com.a.b.e.b.ClassD;
import com.a.b.e.b.ClassS;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.g.ClassN;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public final class ap {

    private ArrayList f3371a;

    private int f3372b;

    private int f3373c;

    private int f3374d;

    private int f3375e;

    private int f3376f;

    private int f3377g;

    private final int f3378h;

    private final boolean f3379i;

    private Abstractan[] f3380j;

    private ArrayList[] f3381k;

    private List[] f3382l;

    private boolean f3383m = false;

    private ap(ab c1168ab, int i, boolean z) {
        this.f3378h = i;
        this.f3379i = z;
        this.f3377g = c1168ab.m4746a().m5515j();
        this.f3374d = c1168ab.m4746a().m4826e();
        this.f3375e = this.f3374d;
    }

    private static Abstractan m5263a(aj c1264aj) {
        return new ClassZ(new ClassS(ac.f3041s, ad.f3049a, (ClassU) null, ClassX.f3113a), c1264aj);
    }

    public static ap m5264a(ab c1168ab, int i, boolean z) {
        ap c1270ap = new ap(c1168ab, i, z);
        c1270ap.m5266a(c1168ab);
        return c1270ap;
    }

    static BitSet m5265a(ClassD c1177d, ClassN c1316n) {
        BitSet bitSet = new BitSet(c1177d.m5476d_());
        int iM5496b = c1316n.m5496b();
        for (int i = 0; i < iM5496b; i++) {
            bitSet.set(c1177d.m5514c(c1316n.m5497b(i)));
        }
        return bitSet;
    }

    private void m5266a(ab c1168ab) {
        int iD_ = c1168ab.m4746a().m5476d_();
        this.f3371a = new ArrayList(iD_ + 2);
        for (int i = 0; i < iD_; i++) {
            this.f3371a.add(aj.m5202a(c1168ab, i, this));
        }
        this.f3372b = ((aj) this.f3371a.get(c1168ab.m4746a().m5514c(c1168ab.m4748b()))).m5238p().m5227e();
        this.f3373c = -1;
    }

    public static ClassN m5268b(ClassD c1177d, ClassN c1316n) {
        ClassN c1316n2 = new ClassN(c1316n.m5496b());
        int iM5496b = c1316n.m5496b();
        for (int i = 0; i < iM5496b; i++) {
            c1316n2.m5499c(c1177d.m5514c(c1316n.m5497b(i)));
        }
        return c1316n2;
    }

    private void m5269b(Abstractan abstractC1268an, ClassX c1197x) {
        if (c1197x == null) {
            return;
        }
        int iD_ = c1197x.m5476d_();
        for (int i = 0; i < iD_; i++) {
            if (!this.f3381k[c1197x.m4916b(i).m4894g()].remove(abstractC1268an)) {
                throw new RuntimeException("use not found");
            }
        }
    }

    private void m5271p() {
        if (this.f3383m) {
            throw new RuntimeException("No use list in back mode");
        }
        this.f3381k = new ArrayList[this.f3374d];
        for (int i = 0; i < this.f3374d; i++) {
            this.f3381k[i] = new ArrayList();
        }
        m5280a(new ar(this));
        this.f3382l = new List[this.f3374d];
        for (int i2 = 0; i2 < this.f3374d; i2++) {
            this.f3382l[i2] = Collections.unmodifiableList(this.f3381k[i2]);
        }
    }

    public int m5272a(int i) {
        if (i < 0) {
            return -1;
        }
        return ((aj) this.f3371a.get(i)).m5228f();
    }

    void m5273a() {
        if (this.f3373c >= 0) {
            throw new RuntimeException("must be called at most once");
        }
        this.f3373c = this.f3371a.size();
        int i = this.f3373c;
        int i2 = this.f3377g;
        this.f3377g = i2 + 1;
        aj c1264aj = new aj(i, i2, this);
        this.f3371a.add(c1264aj);
        Iterator it = this.f3371a.iterator();
        while (it.hasNext()) {
            ((aj) it.next()).m5224c(c1264aj);
        }
        if (c1264aj.m5230h().cardinality() == 0) {
            this.f3371a.remove(this.f3373c);
            this.f3373c = -1;
            this.f3377g--;
        }
    }

    public void m5274a(Abstractag abstractC1261ag) {
        Iterator it = m5297j().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((aj) it.next()).m5222c().iterator();
            while (it2.hasNext()) {
                ((Abstractan) it2.next()).m5255b(abstractC1261ag);
            }
        }
        this.f3374d = abstractC1261ag.mo5078a();
        this.f3375e = this.f3374d;
    }

    public void m5275a(Interfaceal interfaceC1266al) {
        BitSet bitSet = new BitSet(m5297j().size());
        Stack stack = new Stack();
        stack.add(m5289d());
        while (stack.size() > 0) {
            aj c1264aj = (aj) stack.pop();
            ArrayList arrayListM5208a = c1264aj.m5208a();
            if (!bitSet.get(c1264aj.m5227e())) {
                for (int size = arrayListM5208a.size() - 1; size >= 0; size--) {
                    stack.add((aj) arrayListM5208a.get(size));
                }
                bitSet.set(c1264aj.m5227e());
                interfaceC1266al.mo5153a(c1264aj, null);
            }
        }
    }

    void m5276a(Abstractan abstractC1268an) {
        m5279a(abstractC1268an, (ClassX) null);
        m5277a(abstractC1268an, (ClassU) null);
    }

    void m5277a(Abstractan abstractC1268an, ClassU c1194u) {
        if (this.f3380j == null) {
            return;
        }
        if (c1194u != null) {
            this.f3380j[c1194u.m4894g()] = null;
        }
        ClassU c1194uM5261o = abstractC1268an.m5261o();
        if (c1194uM5261o != null) {
            if (this.f3380j[c1194uM5261o.m4894g()] != null) {
                throw new RuntimeException("Duplicate add of insn");
            }
            this.f3380j[c1194uM5261o.m4894g()] = abstractC1268an;
        }
    }

    void m5278a(Abstractan abstractC1268an, ClassU c1194u, ClassU c1194u2) {
        if (this.f3381k == null) {
            return;
        }
        if (c1194u != null) {
            this.f3381k[c1194u.m4894g()].remove(abstractC1268an);
        }
        int iM4894g = c1194u2.m4894g();
        if (this.f3381k.length <= iM4894g) {
            this.f3381k = null;
        } else {
            this.f3381k[iM4894g].add(abstractC1268an);
        }
    }

    void m5279a(Abstractan abstractC1268an, ClassX c1197x) {
        if (this.f3381k == null) {
            return;
        }
        if (c1197x != null) {
            m5269b(abstractC1268an, c1197x);
        }
        ClassX c1197xMo5171b = abstractC1268an.mo5171b();
        int iD_ = c1197xMo5171b.m5476d_();
        for (int i = 0; i < iD_; i++) {
            this.f3381k[c1197xMo5171b.m4916b(i).m4894g()].add(abstractC1268an);
        }
    }

    public void m5280a(Interfaceao interfaceC1269ao) {
        Iterator it = this.f3371a.iterator();
        while (it.hasNext()) {
            ((aj) it.next()).m5216a(interfaceC1269ao);
        }
    }

    public void m5281a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Abstractan abstractC1268an = (Abstractan) it.next();
            aj c1264ajM5262p = abstractC1268an.m5262p();
            ArrayList arrayListM5222c = c1264ajM5262p.m5222c();
            for (int size = arrayListM5222c.size() - 1; size >= 0; size--) {
                Abstractan abstractC1268an2 = (Abstractan) arrayListM5222c.get(size);
                if (abstractC1268an == abstractC1268an2) {
                    m5286b(abstractC1268an2);
                    arrayListM5222c.remove(size);
                    break;
                }
            }
            int size2 = arrayListM5222c.size();
            Abstractan abstractC1268an3 = size2 == 0 ? null : (Abstractan) arrayListM5222c.get(size2 - 1);
            if (c1264ajM5262p != m5293f() && (size2 == 0 || abstractC1268an3.mo5174f() == null || abstractC1268an3.mo5174f().m4840f().m4740d() == 1)) {
                arrayListM5222c.add(Abstractan.m5252a(new ClassS(ac.f3041s, ad.f3049a, (ClassU) null, ClassX.f3113a), c1264ajM5262p));
                BitSet bitSetM5231i = c1264ajM5262p.m5231i();
                for (int iNextSetBit = bitSetM5231i.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM5231i.nextSetBit(iNextSetBit + 1)) {
                    if (iNextSetBit != c1264ajM5262p.m5233k()) {
                        c1264ajM5262p.m5219b(iNextSetBit);
                    }
                }
            }
        }
    }

    public void m5282a(boolean z, Interfaceal interfaceC1266al) {
        BitSet bitSet = new BitSet(this.f3371a.size());
        Stack stack = new Stack();
        aj c1264ajM5293f = z ? m5293f() : m5289d();
        if (c1264ajM5293f == null) {
            return;
        }
        stack.add(null);
        stack.add(c1264ajM5293f);
        while (stack.size() > 0) {
            aj c1264aj = (aj) stack.pop();
            aj c1264aj2 = (aj) stack.pop();
            if (!bitSet.get(c1264aj.m5227e())) {
                BitSet bitSetM5230h = z ? c1264aj.m5230h() : c1264aj.m5231i();
                for (int iNextSetBit = bitSetM5230h.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM5230h.nextSetBit(iNextSetBit + 1)) {
                    stack.add(c1264aj);
                    stack.add((aj) this.f3371a.get(iNextSetBit));
                }
                bitSet.set(c1264aj.m5227e());
                interfaceC1266al.mo5153a(c1264aj, c1264aj2);
            }
        }
    }

    public boolean m5283a(ClassU c1194u) {
        Abstractan abstractC1268anM5288c = m5288c(c1194u.m4894g());
        if (abstractC1268anM5288c == null) {
            return false;
        }
        if (abstractC1268anM5288c.mo5258g() != null) {
            return true;
        }
        Iterator it = m5290d(c1194u.m4894g()).iterator();
        while (it.hasNext()) {
            Abstractj abstractC1183jMo5174f = ((Abstractan) it.next()).mo5174f();
            if (abstractC1183jMo5174f != null && abstractC1183jMo5174f.m4840f().m4737a() == 54) {
                return true;
            }
        }
        return false;
    }

    public int m5284b(int i) {
        int i2 = this.f3375e + this.f3376f;
        this.f3376f += i;
        this.f3374d = Math.max(this.f3374d, i2 + i);
        return i2;
    }

    public aj m5285b() {
        int size = this.f3371a.size();
        int i = this.f3377g;
        this.f3377g = i + 1;
        aj c1264aj = new aj(size, i, this);
        c1264aj.m5222c().add(m5263a(c1264aj));
        this.f3371a.add(c1264aj);
        return c1264aj;
    }

    void m5286b(Abstractan abstractC1268an) {
        if (this.f3381k != null) {
            m5269b(abstractC1268an, abstractC1268an.mo5171b());
        }
        ClassU c1194uM5261o = abstractC1268an.m5261o();
        if (this.f3380j == null || c1194uM5261o == null) {
            return;
        }
        this.f3380j[c1194uM5261o.m4894g()] = null;
    }

    public int m5287c() {
        return this.f3372b;
    }

    public Abstractan m5288c(int i) {
        if (this.f3383m) {
            throw new RuntimeException("No def list in back mode");
        }
        if (this.f3380j != null) {
            return this.f3380j[i];
        }
        this.f3380j = new Abstractan[m5294g()];
        m5280a(new aq(this));
        return this.f3380j[i];
    }

    public aj m5289d() {
        return (aj) this.f3371a.get(this.f3372b);
    }

    public List m5290d(int i) {
        if (this.f3382l == null) {
            m5271p();
        }
        return this.f3382l[i];
    }

    public int m5291e() {
        return this.f3373c;
    }

    void m5292e(int i) {
        this.f3374d = i;
        this.f3375e = this.f3374d;
        m5299l();
    }

    public aj m5293f() {
        if (this.f3373c < 0) {
            return null;
        }
        return (aj) this.f3371a.get(this.f3373c);
    }

    public int m5294g() {
        return this.f3374d;
    }

    public int m5295h() {
        return this.f3378h;
    }

    public void m5296i() {
        this.f3376f = 0;
    }

    public ArrayList m5297j() {
        return this.f3371a;
    }

    public BitSet m5298k() {
        int size = this.f3371a.size();
        BitSet bitSet = new BitSet(size);
        BitSet bitSet2 = new BitSet(size);
        bitSet.set(m5289d().m5227e());
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit == -1) {
                return bitSet2;
            }
            bitSet2.set(iNextSetBit);
            bitSet.or(((aj) this.f3371a.get(iNextSetBit)).m5231i());
            bitSet.andNot(bitSet2);
        }
    }

    public void m5299l() {
        this.f3380j = null;
        this.f3381k = null;
        this.f3382l = null;
    }

    public ArrayList[] m5300m() {
        if (this.f3381k == null) {
            m5271p();
        }
        ArrayList[] arrayListArr = new ArrayList[this.f3374d];
        for (int i = 0; i < this.f3374d; i++) {
            arrayListArr[i] = new ArrayList(this.f3381k[i]);
        }
        return arrayListArr;
    }

    public int m5301n() {
        int i = this.f3374d;
        this.f3374d = i + 1;
        this.f3375e = this.f3374d;
        m5299l();
        return i;
    }

    public void m5302o() {
        this.f3383m = true;
        this.f3381k = null;
        this.f3380j = null;
    }
}
