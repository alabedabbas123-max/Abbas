package com.a.b.f;

import com.baidu.mobstat.Config;
import com.a.b.e.b.Abstractj;
import com.a.b.e.b.ab;
import com.a.b.e.b.ac;
import com.a.b.e.b.ad;
import com.a.b.e.b.ClassB;
import com.a.b.e.b.ClassD;
import com.a.b.e.b.ClassM;
import com.a.b.e.b.ClassS;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.g.ClassK;
import com.a.b.g.ClassN;
import com.a.b.g.Interfaceo;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class aj {

    public static final Comparator f3355a = new ak();

    private BitSet f3357c;

    private BitSet f3358d;

    private final int f3361g;

    private final ap f3362h;

    private final int f3363i;

    private Interfaceo f3367m;

    private Interfaceo f3368n;

    private int f3360f = -1;

    private int f3365k = 0;

    private int f3366l = 0;

    private final ArrayList f3356b = new ArrayList();

    private ClassN f3359e = new ClassN();

    private final ArrayList f3364j = new ArrayList();

    public aj(int i, int i2, ap c1270ap) {
        this.f3362h = c1270ap;
        this.f3363i = i;
        this.f3361g = i2;
        this.f3357c = new BitSet(c1270ap.m5297j().size());
        this.f3358d = new BitSet(c1270ap.m5297j().size());
    }

    public static aj m5202a(ab c1168ab, int i, ap c1270ap) {
        ClassD c1177dM4746a = c1168ab.m4746a();
        ClassB c1175bM4821a = c1177dM4746a.m4821a(i);
        aj c1264aj = new aj(i, c1175bM4821a.mo3961a(), c1270ap);
        ClassM c1186mM4813b = c1175bM4821a.m4813b();
        c1264aj.f3356b.ensureCapacity(c1186mM4813b.m5476d_());
        int iD_ = c1186mM4813b.m5476d_();
        for (int i2 = 0; i2 < iD_; i2++) {
            c1264aj.f3356b.add(new ClassZ(c1186mM4813b.m4847a(i2), c1264aj));
        }
        c1264aj.f3357c = ap.m5265a(c1177dM4746a, c1168ab.m4747a(c1175bM4821a.mo3961a()));
        c1264aj.f3358d = ap.m5265a(c1177dM4746a, c1175bM4821a.m4814c());
        c1264aj.f3359e = ap.m5268b(c1177dM4746a, c1175bM4821a.m4814c());
        if (c1264aj.f3359e.m5496b() != 0) {
            int iM4815d = c1175bM4821a.m4815d();
            c1264aj.f3360f = iM4815d < 0 ? -1 : c1177dM4746a.m5514c(iM4815d);
        }
        return c1264aj;
    }

    private static void m5203a(BitSet bitSet, ClassU c1194u) {
        bitSet.set(c1194u.m4894g());
        if (c1194u.m4898k() > 1) {
            bitSet.set(c1194u.m4894g() + 1);
        }
    }

    private void m5204a(List list) {
        int size;
        Abstractan abstractC1268an;
        int i;
        BitSet bitSet = new BitSet(this.f3362h.m5294g());
        BitSet bitSet2 = new BitSet(this.f3362h.m5294g());
        int size2 = list.size();
        int i2 = 0;
        while (i2 < size2) {
            for (int i3 = i2; i3 < size2; i3++) {
                m5203a(bitSet, ((Abstractan) list.get(i3)).mo5171b().m4916b(0));
                m5203a(bitSet2, ((Abstractan) list.get(i3)).m5261o());
            }
            int i4 = i2;
            int i5 = i2;
            while (i4 < size2) {
                if (m5205b(bitSet, ((Abstractan) list.get(i4)).m5261o())) {
                    i = i5;
                } else {
                    i = i5 + 1;
                    Collections.swap(list, i4, i5);
                }
                i4++;
                i5 = i;
            }
            if (i2 == i5) {
                int i6 = i5;
                while (true) {
                    if (i6 >= size2) {
                        abstractC1268an = null;
                        break;
                    }
                    abstractC1268an = (Abstractan) list.get(i6);
                    if (m5205b(bitSet, abstractC1268an.m5261o()) && m5205b(bitSet2, abstractC1268an.mo5171b().m4916b(0))) {
                        Collections.swap(list, i5, i6);
                        break;
                    }
                    i6++;
                }
                ClassU c1194uM5261o = abstractC1268an.m5261o();
                ClassU c1194uM4890b = c1194uM5261o.m4890b(this.f3362h.m5284b(c1194uM5261o.m4898k()));
                ClassZ c1302z = new ClassZ(new ClassS(ac.m4751a(c1194uM5261o.mo3825a()), ad.f3049a, c1194uM4890b, abstractC1268an.mo5171b()), this);
                int i7 = i5 + 1;
                list.add(i5, c1302z);
                list.set(i7, new ClassZ(new ClassS(ac.m4751a(c1194uM5261o.mo3825a()), ad.f3049a, c1194uM5261o, ClassX.m4909a(c1194uM4890b)), this));
                size = list.size();
                i5 = i7;
            } else {
                size = size2;
            }
            bitSet.clear();
            bitSet2.clear();
            i2 = i5;
            size2 = size;
        }
    }

    private static boolean m5205b(BitSet bitSet, ClassU c1194u) {
        int iM4894g = c1194u.m4894g();
        return bitSet.get(iM4894g) || (c1194u.m4898k() == 2 && bitSet.get(iM4894g + 1));
    }

    private int m5207t() {
        int size = this.f3356b.size();
        int i = 0;
        while (i < size && (((Abstractan) this.f3356b.get(i)) instanceof ac)) {
            i++;
        }
        return i;
    }

    public ArrayList m5208a() {
        return this.f3364j;
    }

    public void m5209a(int i) {
        this.f3356b.add(0, new ac(i, this));
    }

    public void m5210a(int i, int i2) {
        if (i == i2) {
            return;
        }
        this.f3358d.set(i2);
        if (this.f3360f == i) {
            this.f3360f = i2;
        }
        for (int iM5496b = this.f3359e.m5496b() - 1; iM5496b >= 0; iM5496b--) {
            if (this.f3359e.m5497b(iM5496b) == i) {
                this.f3359e.m5498b(iM5496b, i2);
            }
        }
        this.f3358d.clear(i);
        ((aj) this.f3362h.m5297j().get(i2)).f3357c.set(this.f3363i);
        ((aj) this.f3362h.m5297j().get(i)).f3357c.clear(this.f3363i);
    }

    public void m5211a(Abstractj abstractC1183j) {
        Abstractan abstractC1268anM5252a = Abstractan.m5252a(abstractC1183j, this);
        this.f3356b.add(m5207t(), abstractC1268anM5252a);
        this.f3362h.m5276a(abstractC1268anM5252a);
    }

    public void m5212a(ClassU c1194u) {
        this.f3356b.add(0, new ac(c1194u, this));
    }

    public void m5213a(ClassU c1194u, ClassU c1194u2) {
        if (this.f3358d.cardinality() > 1) {
            throw new IllegalStateException("Inserting a move to a block with multiple successors");
        }
        if (c1194u.m4894g() == c1194u2.m4894g()) {
            return;
        }
        ClassZ c1302z = (ClassZ) this.f3356b.get(this.f3356b.size() - 1);
        if (c1302z.m5261o() != null || c1302z.mo5171b().m5476d_() > 0) {
            int iNextSetBit = this.f3358d.nextSetBit(0);
            while (iNextSetBit >= 0) {
                ((aj) this.f3362h.m5297j().get(iNextSetBit)).m5221b(c1194u, c1194u2);
                iNextSetBit = this.f3358d.nextSetBit(iNextSetBit + 1);
            }
            return;
        }
        this.f3356b.add(this.f3356b.size() - 1, new ClassZ(new ClassS(ac.m4751a(c1194u.mo3825a()), ad.f3049a, c1194u, ClassX.m4909a(c1194u2)), this));
        this.f3365k++;
    }

    public void m5214a(Interfaceae interfaceC1259ae) {
        int size = this.f3356b.size();
        for (int i = 0; i < size; i++) {
            Abstractan abstractC1268an = (Abstractan) this.f3356b.get(i);
            if (!(abstractC1268an instanceof ac)) {
                return;
            }
            interfaceC1259ae.mo5154a((ac) abstractC1268an);
        }
    }

    public void m5215a(aj c1264aj) {
        this.f3364j.add(c1264aj);
    }

    public void m5216a(Interfaceao interfaceC1269ao) {
        int size = this.f3356b.size();
        for (int i = 0; i < size; i++) {
            ((Abstractan) this.f3356b.get(i)).mo5169a(interfaceC1269ao);
        }
    }

    public aj m5217b(aj c1264aj) {
        aj c1264ajM5285b = this.f3362h.m5285b();
        if (!this.f3358d.get(c1264aj.f3363i)) {
            throw new RuntimeException("Block " + c1264aj.m5229g() + " not successor of " + m5229g());
        }
        c1264ajM5285b.f3357c.set(this.f3363i);
        c1264ajM5285b.f3358d.set(c1264aj.f3363i);
        c1264ajM5285b.f3359e.m5499c(c1264aj.f3363i);
        c1264ajM5285b.f3360f = c1264aj.f3363i;
        for (int iM5496b = this.f3359e.m5496b() - 1; iM5496b >= 0; iM5496b--) {
            if (this.f3359e.m5497b(iM5496b) == c1264aj.f3363i) {
                this.f3359e.m5498b(iM5496b, c1264ajM5285b.f3363i);
            }
        }
        if (this.f3360f == c1264aj.f3363i) {
            this.f3360f = c1264ajM5285b.f3363i;
        }
        this.f3358d.clear(c1264aj.f3363i);
        this.f3358d.set(c1264ajM5285b.f3363i);
        c1264aj.f3357c.set(c1264ajM5285b.f3363i);
        c1264aj.f3357c.set(this.f3363i, this.f3358d.get(c1264aj.f3363i));
        return c1264ajM5285b;
    }

    public void m5218b() {
        this.f3356b.subList(0, m5207t()).clear();
    }

    public void m5219b(int i) {
        int i2 = 0;
        for (int iM5496b = this.f3359e.m5496b() - 1; iM5496b >= 0; iM5496b--) {
            if (this.f3359e.m5497b(iM5496b) == i) {
                i2 = iM5496b;
            } else {
                this.f3360f = this.f3359e.m5497b(iM5496b);
            }
        }
        this.f3359e.m5502d(i2);
        this.f3358d.clear(i);
        ((aj) this.f3362h.m5297j().get(i)).f3357c.clear(this.f3363i);
    }

    public void m5220b(Abstractj abstractC1183j) {
        if (abstractC1183j.m4840f().m4740d() == 1) {
            throw new IllegalArgumentException("last insn must branch");
        }
        Abstractan abstractC1268an = (Abstractan) this.f3356b.get(this.f3356b.size() - 1);
        Abstractan abstractC1268anM5252a = Abstractan.m5252a(abstractC1183j, this);
        this.f3356b.set(this.f3356b.size() - 1, abstractC1268anM5252a);
        this.f3362h.m5286b(abstractC1268an);
        this.f3362h.m5276a(abstractC1268anM5252a);
    }

    public void m5221b(ClassU c1194u, ClassU c1194u2) {
        if (c1194u.m4894g() == c1194u2.m4894g()) {
            return;
        }
        this.f3356b.add(m5207t(), new ClassZ(new ClassS(ac.m4751a(c1194u.mo3825a()), ad.f3049a, c1194u, ClassX.m4909a(c1194u2)), this));
        this.f3366l++;
    }

    public ArrayList m5222c() {
        return this.f3356b;
    }

    public void m5223c(int i) {
        if (this.f3368n == null) {
            this.f3368n = ai.m5201c(this.f3362h.m5294g());
        }
        this.f3368n.mo5411a(i);
    }

    public void m5224c(aj c1264aj) {
        if (this != c1264aj && this.f3359e.m5496b() == 0) {
            this.f3358d.set(c1264aj.f3363i);
            this.f3359e.m5499c(c1264aj.f3363i);
            this.f3360f = c1264aj.f3363i;
            c1264aj.f3357c.set(this.f3363i);
        }
    }

    public List m5225d() {
        return this.f3356b.subList(0, m5207t());
    }

    public void m5226d(int i) {
        if (this.f3367m == null) {
            this.f3367m = ai.m5201c(this.f3362h.m5294g());
        }
        this.f3367m.mo5411a(i);
    }

    public int m5227e() {
        return this.f3363i;
    }

    public int m5228f() {
        return this.f3361g;
    }

    public String m5229g() {
        return ClassK.m5485c(this.f3361g);
    }

    public BitSet m5230h() {
        return this.f3357c;
    }

    public BitSet m5231i() {
        return this.f3358d;
    }

    public ClassN m5232j() {
        return this.f3359e;
    }

    public int m5233k() {
        return this.f3360f;
    }

    public int m5234l() {
        return this.f3362h.m5272a(this.f3360f);
    }

    public aj m5235m() {
        if (this.f3360f < 0) {
            return null;
        }
        return (aj) this.f3362h.m5297j().get(this.f3360f);
    }

    public ClassN m5236n() {
        ClassN c1316n = new ClassN(this.f3359e.m5496b());
        int iM5496b = this.f3359e.m5496b();
        for (int i = 0; i < iM5496b; i++) {
            c1316n.m5499c(this.f3362h.m5272a(this.f3359e.m5497b(i)));
        }
        return c1316n;
    }

    public ap m5237o() {
        return this.f3362h;
    }

    public aj m5238p() {
        aj c1264ajM5285b = this.f3362h.m5285b();
        c1264ajM5285b.f3357c = this.f3357c;
        c1264ajM5285b.f3358d.set(this.f3363i);
        c1264ajM5285b.f3359e.m5499c(this.f3363i);
        c1264ajM5285b.f3360f = this.f3363i;
        this.f3357c = new BitSet(this.f3362h.m5297j().size());
        this.f3357c.set(c1264ajM5285b.f3363i);
        for (int iNextSetBit = c1264ajM5285b.f3357c.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = c1264ajM5285b.f3357c.nextSetBit(iNextSetBit + 1)) {
            ((aj) this.f3362h.m5297j().get(iNextSetBit)).m5210a(this.f3363i, c1264ajM5285b.f3363i);
        }
        return c1264ajM5285b;
    }

    public Interfaceo m5239q() {
        if (this.f3368n == null) {
            this.f3368n = ai.m5201c(this.f3362h.m5294g());
        }
        return this.f3368n;
    }

    public boolean m5240r() {
        return this.f3363i == this.f3362h.m5291e();
    }

    public void m5241s() {
        if (this.f3366l > 1) {
            m5204a(this.f3356b.subList(0, this.f3366l));
            if (((Abstractan) this.f3356b.get(this.f3366l)).mo5260j()) {
                throw new RuntimeException("Unexpected: moves from phis before move-exception");
            }
        }
        if (this.f3365k > 1) {
            m5204a(this.f3356b.subList((this.f3356b.size() - this.f3365k) - 1, this.f3356b.size() - 1));
        }
        this.f3362h.m5296i();
    }

    public String toString() {
        return "{" + this.f3363i + Config.TRACE_TODAY_VISIT_SPLIT + ClassK.m5485c(this.f3361g) + '}';
    }
}
