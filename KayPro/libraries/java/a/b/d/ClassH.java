package a.b.d;

import a.b.a.d;
import a.b.c;
import a.b.Interfacej;

public class ClassH extends Abstractc {

    public int f150a;

    public ClassH() {
    }

    public ClassH(byte b) {
        this(b, m390a(b));
    }

    public ClassH(byte b, int i) {
        this.f147c = b;
        this.f150a = i;
    }

    private static int m390a(byte b) {
        switch (b) {
            case 2:
                return -1;
            case 3:
            case 9:
            case 11:
            case 14:
            default:
                return 0;
            case 4:
            case 10:
            case 12:
            case 15:
                return 1;
            case 5:
            case 13:
                return 2;
            case 6:
                return 3;
            case 7:
                return 4;
            case 8:
                return 5;
        }
    }

    private int m391g() {
        if (this.f147c == 16 || this.f147c == -68) {
            return 1;
        }
        return this.f147c == 17 ? 2 : 0;
    }

    private int m392h() {
        if (this.f150a >= -1 && this.f150a <= 5) {
            return 0;
        }
        if (((byte) this.f150a) == this.f150a) {
            return 1;
        }
        return ((short) this.f150a) == this.f150a ? 2 : 4;
    }

    @Override
    public int mo322a(int i) {
        return m391g() + 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override
    public Abstractc mo323a() {
        switch (this.f147c) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                switch (m392h()) {
                    case 0:
                        this.f147c = (byte) (this.f150a + 3);
                        break;
                    case 1:
                        this.f147c = (byte) 16;
                        break;
                    case 2:
                        this.f147c = (byte) 17;
                        break;
                }
                break;
            case 9:
            case 10:
                this.f147c = (byte) (this.f150a + 9);
                return this;
            case 11:
            case 12:
            case 13:
                this.f147c = (byte) (this.f150a + 11);
                return this;
            case 14:
            case 15:
                this.f147c = (byte) (this.f150a + 14);
                return this;
            default:
                return this;
        }
    }

    @Override
    public void mo324a(c cVar, Interfacej interfaceC0162j, d dVar, int i, a.b.d.a.d dVar2) {
        dVar2.a(cVar, interfaceC0162j, dVar, i, this);
    }

    @Override
    public byte mo332b() {
        switch (this.f147c) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                return (byte) 3;
            case 9:
            case 10:
                return (byte) 9;
            case 11:
            case 12:
            case 13:
                return (byte) 11;
            case 14:
            case 15:
                return (byte) 14;
            default:
                return this.f147c;
        }
    }

    @Override
    protected void mo326b(byte[] bArr, int i) {
        int iM391g = m391g();
        this.f150a = iM391g == 0 ? m390a(this.f147c) : m370b(bArr, i, iM391g);
    }

    @Override
    protected void mo327c(byte[] bArr, int i) {
        int iM391g = m391g();
        if (m392h() > iM391g) {
            throw new IllegalArgumentException("Instruction has invalid constant size (" + mo333b(i) + ")");
        }
        m371b(bArr, i, this.f150a, iM391g);
    }

    public String toString() {
        return m384d() + (m391g() > 0 ? " " + this.f150a : "");
    }
}
