package com.a.b.f.a;

import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.f.Abstractan;
import com.a.b.f.ac;
import com.a.b.f.aj;
import com.a.b.f.ap;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

public class ClassJ {

    private static int[] f3307i;

    private final BitSet f3308a;

    private final BitSet f3309b;

    private final int f3310c;

    private final ap f3311d;

    private final ClassI f3312e;

    private aj f3313f;

    private int f3314g;

    private Enumk f3315h;

    private ClassJ(ap c1270ap, int i, ClassI c1248i) {
        int size = c1270ap.m5297j().size();
        this.f3311d = c1270ap;
        this.f3310c = i;
        this.f3308a = new BitSet(size);
        this.f3309b = new BitSet(size);
        this.f3312e = c1248i;
    }

    public static ClassI m5133a(ap c1270ap) {
        int iM5294g = c1270ap.m5294g();
        ClassI c1248i = new ClassI(iM5294g);
        for (int i = 0; i < iM5294g; i++) {
            new ClassJ(c1270ap, i, c1248i).m5141a();
        }
        m5135a(c1270ap, c1248i);
        return c1248i;
    }

    private static void m5134a(ClassI c1248i, ClassU c1194u, ClassX c1197x) {
        int iM4894g = c1194u.m4894g();
        for (int i = 0; i < c1197x.m5476d_(); i++) {
            c1248i.m5131a(iM4894g, c1197x.m4916b(i).m4894g());
        }
    }

    private static void m5135a(ap c1270ap, ClassI c1248i) {
        Iterator it = c1270ap.m5297j().iterator();
        while (it.hasNext()) {
            List listM5225d = ((aj) it.next()).m5225d();
            int size = listM5225d.size();
            for (int i = 0; i < size; i++) {
                for (int i2 = 0; i2 < size; i2++) {
                    if (i != i2) {
                        Abstractan abstractC1268an = (Abstractan) listM5225d.get(i);
                        Abstractan abstractC1268an2 = (Abstractan) listM5225d.get(i2);
                        m5134a(c1248i, abstractC1268an.m5261o(), abstractC1268an2.mo5171b());
                        m5134a(c1248i, abstractC1268an2.m5261o(), abstractC1268an.mo5171b());
                        c1248i.m5131a(abstractC1268an.m5261o().m4894g(), abstractC1268an2.m5261o().m4894g());
                    }
                }
            }
        }
    }

    static int[] m5136b() {
        int[] iArr = f3307i;
        if (iArr == null) {
            iArr = new int[Enumk.valuesCustom().length];
            try {
                iArr[Enumk.DONE.ordinal()] = 4;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Enumk.LIVE_IN_AT_STATEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Enumk.LIVE_OUT_AT_BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Enumk.LIVE_OUT_AT_STATEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            f3307i = iArr;
        }
        return iArr;
    }

    private void m5137c() {
        while (this.f3315h != Enumk.DONE) {
            switch (m5136b()[this.f3315h.ordinal()]) {
                case 1:
                    this.f3315h = Enumk.DONE;
                    m5139e();
                    break;
                case 2:
                    this.f3315h = Enumk.DONE;
                    m5140f();
                    break;
                case 3:
                    this.f3315h = Enumk.DONE;
                    m5138d();
                    break;
            }
        }
    }

    private void m5138d() {
        if (this.f3308a.get(this.f3313f.m5227e())) {
            return;
        }
        this.f3308a.set(this.f3313f.m5227e());
        this.f3313f.m5223c(this.f3310c);
        this.f3314g = this.f3313f.m5222c().size() - 1;
        this.f3315h = Enumk.LIVE_OUT_AT_STATEMENT;
    }

    private void m5139e() {
        if (this.f3314g != 0) {
            this.f3314g--;
            this.f3315h = Enumk.LIVE_OUT_AT_STATEMENT;
        } else {
            this.f3313f.m5226d(this.f3310c);
            this.f3309b.or(this.f3313f.m5230h());
        }
    }

    private void m5140f() {
        Abstractan abstractC1268an = (Abstractan) this.f3313f.m5222c().get(this.f3314g);
        ClassU c1194uM5261o = abstractC1268an.m5261o();
        if (abstractC1268an.m5256b(this.f3310c)) {
            return;
        }
        if (c1194uM5261o != null) {
            this.f3312e.m5131a(this.f3310c, c1194uM5261o.m4894g());
        }
        this.f3315h = Enumk.LIVE_IN_AT_STATEMENT;
    }

    public void m5141a() {
        for (Abstractan abstractC1268an : this.f3311d.m5290d(this.f3310c)) {
            this.f3315h = Enumk.DONE;
            if (abstractC1268an instanceof ac) {
                Iterator it = ((ac) abstractC1268an).m5164a(this.f3310c, this.f3311d).iterator();
                while (it.hasNext()) {
                    this.f3313f = (aj) it.next();
                    this.f3315h = Enumk.LIVE_OUT_AT_BLOCK;
                    m5137c();
                }
            } else {
                this.f3313f = abstractC1268an.m5262p();
                this.f3314g = this.f3313f.m5222c().indexOf(abstractC1268an);
                if (this.f3314g < 0) {
                    throw new RuntimeException("insn not found in it's own block");
                }
                this.f3315h = Enumk.LIVE_IN_AT_STATEMENT;
                m5137c();
            }
        }
        while (true) {
            int iNextSetBit = this.f3309b.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            this.f3313f = (aj) this.f3311d.m5297j().get(iNextSetBit);
            this.f3309b.clear(iNextSetBit);
            this.f3315h = Enumk.LIVE_OUT_AT_BLOCK;
            m5137c();
        }
    }
}
