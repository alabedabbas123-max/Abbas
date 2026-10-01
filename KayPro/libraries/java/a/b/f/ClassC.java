package a.b.f;

import a.b.a.d;
import a.b.b.b;
import a.b.c;
import com.blankj.utilcode.constant.MemoryConstants;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassE;
import a.b.d.ClassH;
import a.b.d.ClassK;
import a.d.a.Abstractae;
import a.d.a.Abstractbd;
import a.g.a.ClassV;

public class ClassC {

    private final ClassV f191a;

    private int f192b;

    private int f193c;

    private Object f194d;

    private final b[] f195e;

    private final Abstractc[] f196f;

    private final ClassP f197g;

    public ClassC() {
        this(new ClassV());
    }

    public ClassC(ClassV c0349v) {
        this.f195e = new b[0];
        this.f196f = new Abstractc[]{new ClassK((byte) 58, MemoryConstants.f4579GB), new ClassK((byte) 25, MemoryConstants.f4579GB)};
        this.f197g = new ClassP(this.f195e, this.f196f);
        this.f191a = c0349v;
    }

    private byte m687a(int i) {
        switch (i) {
            case 4:
            case 8:
                return (byte) 84;
            case 5:
                return (byte) 85;
            case 6:
                return (byte) 81;
            case 7:
                return (byte) 82;
            case 9:
                return (byte) 86;
            case 10:
                return (byte) 79;
            case 11:
                return (byte) 80;
            default:
                throw new IllegalArgumentException("Unexpected new array type [" + i + "]");
        }
    }

    private int m688a(c cVar, Interfacej interfaceC0162j, d dVar, int i) {
        int iM889c = this.f197g.m889c();
        this.f197g.m858a();
        int iMo322a = i;
        for (int i2 = 0; i2 < iM889c && iMo322a < dVar.e; i2++) {
            Abstractc abstractC0048cM387a = ClassE.m387a(dVar.f, iMo322a);
            abstractC0048cM387a.mo324a(cVar, interfaceC0162j, dVar, iMo322a, this.f197g);
            iMo322a += abstractC0048cM387a.mo322a(iMo322a);
        }
        if (this.f197g.m885b()) {
            return this.f197g.m856a(iM889c - 1);
        }
        return -1;
    }

    private Object m689a(int i, int i2) {
        switch (i) {
            case 4:
                return new boolean[i2];
            case 5:
                return new char[i2];
            case 6:
                return new float[i2];
            case 7:
                return new double[i2];
            case 8:
                return new byte[i2];
            case 9:
                return new short[i2];
            case 10:
                return new int[i2];
            case 11:
                return new long[i2];
            default:
                throw new IllegalArgumentException("Unexpected new array type [" + i + "]");
        }
    }

    private void m690a(int i, Object obj, int i2, Abstractbd abstractC0206bd) {
        switch (i) {
            case 4:
                ((boolean[]) obj)[i2] = abstractC0206bd.mo1404r().mo1357e() != 0;
                return;
            case 5:
                ((char[]) obj)[i2] = (char) abstractC0206bd.mo1404r().mo1357e();
                return;
            case 6:
                ((float[]) obj)[i2] = abstractC0206bd.mo1590l().mo1527o_();
                return;
            case 7:
                ((double[]) obj)[i2] = abstractC0206bd.mo1589i().mo1503m_();
                return;
            case 8:
                ((byte[]) obj)[i2] = (byte) abstractC0206bd.mo1404r().mo1357e();
                return;
            case 9:
                ((short[]) obj)[i2] = (short) abstractC0206bd.mo1404r().mo1357e();
                return;
            case 10:
                ((int[]) obj)[i2] = abstractC0206bd.mo1404r().mo1357e();
                return;
            case 11:
                ((long[]) obj)[i2] = abstractC0206bd.mo1466k_().mo1442e();
                return;
            default:
                throw new IllegalArgumentException("Unexpected new array type [" + i + "]");
        }
    }

    public int m691a() {
        return this.f192b;
    }

    public boolean m692a(c cVar, Interfacej interfaceC0162j, d dVar, int i, ClassH c0053h) {
        Abstractc abstractC0048cM387a;
        this.f194d = null;
        Abstractae abstractC0180aeMo1404r = this.f191a.m2206j(i).m1643c(0).mo1404r();
        if (!abstractC0180aeMo1404r.mo1321c()) {
            return false;
        }
        int iMo1357e = abstractC0180aeMo1404r.mo1357e();
        int i2 = c0053h.f150a;
        byte bM687a = m687a(i2);
        byte[] bArr = dVar.f;
        int iM688a = m688a(cVar, interfaceC0162j, dVar, c0053h.mo322a(i) + i);
        if (iM688a > 0) {
            i = iM688a;
            abstractC0048cM387a = ClassE.m387a(bArr, iM688a);
        } else {
            iM688a = i;
            abstractC0048cM387a = c0053h;
        }
        int iMo322a = i + abstractC0048cM387a.mo322a(i);
        int i3 = 0;
        Abstractc abstractC0048c = abstractC0048cM387a;
        while (i3 < iMo1357e) {
            int iMo322a2 = abstractC0048c.mo322a(i) + i;
            Abstractc abstractC0048cM387a2 = ClassE.m387a(bArr, iMo322a2);
            if (abstractC0048cM387a2.mo367b(cVar) < 1 || !this.f191a.m2207k(iMo322a2).m1666g(0).mo1335n_().m1320b(iM688a)) {
                return false;
            }
            int iMo322a3 = iMo322a2 + abstractC0048cM387a2.mo322a(iMo322a2);
            Abstractc abstractC0048cM387a3 = ClassE.m387a(bArr, iMo322a3);
            if (abstractC0048cM387a3.mo367b(cVar) != 1) {
                return false;
            }
            Abstractbd abstractC0206bdC = this.f191a.m2207k(iMo322a3).m1643c(0);
            if (abstractC0206bdC.mo1331j() != 1 || !abstractC0206bdC.mo1404r().mo1321c() || abstractC0206bdC.mo1404r().mo1357e() != i3) {
                return false;
            }
            int iMo322a4 = iMo322a3 + abstractC0048cM387a3.mo322a(iMo322a3);
            Abstractc abstractC0048cM387a4 = ClassE.m387a(bArr, iMo322a4);
            if (abstractC0048cM387a4.mo367b(cVar) < 1 || !this.f191a.m2207k(iMo322a4).m1643c(0).mo1321c()) {
                return false;
            }
            Abstractbd abstractC0206bdC2 = this.f191a.m2207k(iMo322a4).m1643c(0);
            i = iMo322a4 + abstractC0048cM387a4.mo322a(iMo322a4);
            Abstractc abstractC0048cM387a5 = ClassE.m387a(bArr, i);
            if (abstractC0048cM387a5.f147c != bM687a) {
                return false;
            }
            if (i3 == 0) {
                this.f194d = m689a(i2, iMo1357e);
            }
            m690a(i2, this.f194d, i3, abstractC0206bdC2);
            i3++;
            abstractC0048c = abstractC0048cM387a5;
        }
        this.f192b = iMo322a;
        this.f193c = i;
        return i > iM688a;
    }

    public int m693b() {
        return this.f193c;
    }

    public Object m694c() {
        return this.f194d;
    }
}
