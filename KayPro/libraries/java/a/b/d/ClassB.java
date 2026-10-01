package a.b.d;

import a.b.b.a;
import a.b.b.a.f;
import a.b.b.d;
import a.b.b.e;
import a.b.b.g;
import a.b.b.h;
import a.b.b.i;
import a.b.b.j;
import a.b.b.k;
import a.b.b.l;
import a.b.b.m;
import a.b.b.n;
import a.b.b.o;
import a.b.b.p;
import a.b.b.r;
import a.b.b.s;
import a.b.c;
import a.b.Interfacej;
import a.b.f.ClassI;

public class ClassB extends Abstractc implements f {

    public int f139a;

    public int f140b;

    private int f141d;

    private int f142e;

    public ClassB() {
    }

    public ClassB(byte b, int i) {
        this(b, i, 0);
    }

    public ClassB(byte b, int i, int i2) {
        this.f147c = b;
        this.f139a = i;
        this.f140b = i2;
    }

    private int m346g() {
        return this.f147c == 18 ? 1 : 2;
    }

    private int m347h() {
        if (this.f147c == -59) {
            return 1;
        }
        return (this.f147c == -70 || this.f147c == -71) ? 2 : 0;
    }

    private int m348i() {
        if ((this.f139a & 255) == this.f139a) {
            return 1;
        }
        return (this.f139a & 65535) == this.f139a ? 2 : 4;
    }

    @Override
    public int mo322a(int i) {
        return m346g() + 1 + m347h();
    }

    @Override
    public int mo349a(c cVar) {
        int iMo349a = super.mo349a(cVar);
        switch (this.f147c) {
            case -77:
            case -75:
                cVar.a(this.f139a, this);
                return iMo349a + this.f142e;
            case -76:
            case -69:
            case -68:
            case -67:
            case -66:
            case -65:
            case -64:
            case -63:
            case -62:
            case -61:
            case -60:
            default:
                return iMo349a;
            case -74:
            case -73:
            case -72:
            case -71:
            case -70:
                cVar.a(this.f139a, this);
                return iMo349a + this.f141d;
            case -59:
                return iMo349a + this.f140b;
        }
    }

    @Override
    public Abstractc mo323a() {
        if (m348i() == 1) {
            if (this.f147c == 19) {
                this.f147c = (byte) 18;
            }
        } else if (this.f147c == 18) {
            this.f147c = (byte) 19;
        }
        return this;
    }

    public void m350a(c cVar, a aVar) {
    }

    public void m351a(c cVar, a.b.b.c cVar2) {
    }

    public void m352a(c cVar, d dVar) {
        this.f142e = ClassI.m799v(ClassI.m796s(dVar.c(cVar)));
    }

    public void m353a(c cVar, e eVar) {
    }

    public void m354a(c cVar, a.b.b.f fVar) {
    }

    public void m355a(c cVar, g gVar) {
        cVar.a(gVar.b, this);
    }

    public void m356a(c cVar, h hVar) {
        cVar.a(hVar.b, this);
    }

    public void m357a(c cVar, i iVar) {
    }

    public void m358a(c cVar, j jVar) {
    }

    public void m359a(c cVar, k kVar) {
    }

    public void m360a(c cVar, l lVar) {
        cVar.a(lVar.b, this);
    }

    public void m361a(c cVar, m mVar) {
    }

    public void m362a(c cVar, n nVar) {
        String strB = nVar.b(cVar);
        this.f141d = ClassI.m798u(strB);
        this.f142e = ClassI.m799v(ClassI.m796s(strB));
    }

    public void m363a(c cVar, o oVar) {
    }

    public void m364a(c cVar, p pVar) {
    }

    public void m365a(c cVar, r rVar) {
    }

    public void m366a(c cVar, s sVar) {
    }

    @Override
    public void mo324a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, a.b.d.a.d dVar2) {
        dVar2.a(cVar, interfaceC0162j, dVar, i, this);
    }

    @Override
    public byte mo332b() {
        if (this.f147c == 19) {
            return (byte) 18;
        }
        return this.f147c;
    }

    @Override
    public int mo367b(c cVar) {
        int iMo367b = super.mo367b(cVar);
        switch (this.f147c) {
            case -78:
            case -76:
            case -74:
            case -73:
            case -72:
            case -71:
            case -70:
                cVar.a(this.f139a, this);
                return iMo367b + this.f142e;
            case -77:
            case -75:
            default:
                return iMo367b;
        }
    }

    @Override
    protected void mo326b(byte[] bArr, int i) {
        int iM346g = m346g();
        int iM347h = m347h();
        this.f139a = m368a(bArr, i, iM346g);
        this.f140b = m368a(bArr, iM346g + i, iM347h);
    }

    @Override
    protected void mo327c(byte[] bArr, int i) {
        int iM346g = m346g();
        int iM347h = m347h();
        if (m348i() > iM346g) {
            throw new IllegalArgumentException("Instruction has invalid constant index size (" + mo333b(i) + ")");
        }
        m369a(bArr, i, this.f139a, iM346g);
        m369a(bArr, iM346g + i, this.f140b, iM347h);
    }

    public String toString() {
        return m384d() + " #" + this.f139a + (m347h() == 0 ? "" : ", " + this.f140b);
    }
}
