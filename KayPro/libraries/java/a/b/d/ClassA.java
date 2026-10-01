package a.b.d;

import a.b.a.d;
import a.b.c;
import a.b.Interfacej;

public class ClassA extends Abstractc {

    public int f133a;

    public ClassA() {
    }

    public ClassA(byte b, int i) {
        this.f147c = b;
        this.f133a = i;
    }

    private int m330g() {
        return (this.f147c == -56 || this.f147c == -55) ? 4 : 2;
    }

    private int m331h() {
        return ((short) this.f133a) == this.f133a ? 2 : 4;
    }

    @Override
    public int mo322a(int i) {
        return m330g() + 1;
    }

    @Override
    public Abstractc mo323a() {
        if (m331h() == 2) {
            if (this.f147c == -56) {
                this.f147c = (byte) -89;
            } else if (this.f147c == -55) {
                this.f147c = (byte) -88;
            }
        } else if (this.f147c == -89 || this.f147c == -56) {
            this.f147c = (byte) -56;
        } else {
            if (this.f147c != -88) {
                throw new IllegalArgumentException("Branch instruction can't be widened (" + toString() + ")");
            }
            this.f147c = (byte) -55;
        }
        return this;
    }

    @Override
    public void mo324a(c cVar, Interfacej interfaceC0162j, d dVar, int i, a.b.d.a.d dVar2) {
        dVar2.a(cVar, interfaceC0162j, dVar, i, this);
    }

    @Override
    public byte mo332b() {
        switch (this.f147c) {
            case -56:
                return (byte) -89;
            case -55:
                return (byte) -88;
            default:
                return this.f147c;
        }
    }

    @Override
    public String mo333b(int i) {
        return "[" + i + "] " + toString() + " (target=" + (this.f133a + i) + ")";
    }

    @Override
    protected void mo326b(byte[] bArr, int i) {
        this.f133a = m370b(bArr, i, m330g());
    }

    @Override
    protected void mo327c(byte[] bArr, int i) {
        if (m331h() > m330g()) {
            throw new IllegalArgumentException("Instruction has invalid branch offset size (" + mo333b(i) + ")");
        }
        m371b(bArr, i, this.f133a, m330g());
    }

    public String toString() {
        return m384d() + " " + (this.f133a >= 0 ? "+" : "") + this.f133a;
    }
}
