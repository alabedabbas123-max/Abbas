package a.b.d;

import a.b.a.d;
import a.b.c;
import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;
import a.b.Interfacej;

public class ClassK extends Abstractc {

    public boolean f155a;

    public int f156b;

    public int f157d;

    public ClassK() {
    }

    public ClassK(byte b) {
        this(b, m393a(b), 0);
    }

    public ClassK(byte b, int i) {
        this(b, i, 0);
    }

    public ClassK(byte b, int i, int i2) {
        boolean z = true;
        this.f147c = b;
        this.f156b = i;
        this.f157d = i2;
        if (m395i() <= 1 && m397k() <= 1) {
            z = false;
        }
        this.f155a = z;
    }

    public ClassK(boolean z) {
        this.f155a = z;
    }

    private static int m393a(byte b) {
        switch (b) {
            case 27:
            case 31:
            case 35:
            case 39:
            case 43:
            case 60:
            case 64:
            case 68:
            case 72:
            case 76:
                return 1;
            case 28:
            case 32:
            case 36:
            case 40:
            case 44:
            case 61:
            case 65:
            case 69:
            case 73:
            case 77:
                return 2;
            case 29:
            case 33:
            case 37:
            case 41:
            case 45:
            case ByteOps.ISTORE_3:
            case 66:
            case 70:
            case 74:
            case 78:
                return 3;
            case 30:
            case 34:
            case 38:
            case 42:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 63:
            case 67:
            case 71:
            case 75:
            default:
                return 0;
        }
    }

    private int m394h() {
        if ((this.f147c < 26 || this.f147c > 45) && (this.f147c < 59 || this.f147c > 78)) {
            return this.f155a ? 2 : 1;
        }
        return 0;
    }

    private int m395i() {
        if ((this.f156b & 3) == this.f156b) {
            return 0;
        }
        if ((this.f156b & 255) == this.f156b) {
            return 1;
        }
        return (this.f156b & 65535) == this.f156b ? 2 : 4;
    }

    private int m396j() {
        if (this.f147c != -124) {
            return 0;
        }
        return this.f155a ? 2 : 1;
    }

    private int m397k() {
        if (this.f147c != -124) {
            return 0;
        }
        if (((byte) this.f157d) == this.f157d) {
            return 1;
        }
        return ((short) this.f157d) == this.f157d ? 2 : 4;
    }

    @Override
    public int mo322a(int i) {
        return (this.f155a ? 2 : 1) + m394h() + m396j();
    }

    @Override
    public Abstractc mo323a() {
        boolean z = true;
        this.f147c = mo332b();
        if (this.f156b <= 3) {
            switch (this.f147c) {
                case 21:
                    this.f147c = (byte) (this.f156b + 26);
                    break;
                case 22:
                    this.f147c = (byte) (this.f156b + 30);
                    break;
                case 23:
                    this.f147c = (byte) (this.f156b + 34);
                    break;
                case 24:
                    this.f147c = (byte) (this.f156b + 38);
                    break;
                case 25:
                    this.f147c = (byte) (this.f156b + 42);
                    break;
                case 54:
                    this.f147c = (byte) (this.f156b + 59);
                    break;
                case 55:
                    this.f147c = (byte) (this.f156b + 63);
                    break;
                case 56:
                    this.f147c = (byte) (this.f156b + 67);
                    break;
                case 57:
                    this.f147c = (byte) (this.f156b + 71);
                    break;
                case 58:
                    this.f147c = (byte) (this.f156b + 75);
                    break;
            }
        }
        if (m395i() <= 1 && m397k() <= 1) {
            z = false;
        }
        this.f155a = z;
        return this;
    }

    @Override
    public void mo324a(c cVar, Interfacej interfaceC0162j, d dVar, int i, a.b.d.a.d dVar2) {
        dVar2.a(cVar, interfaceC0162j, dVar, i, this);
    }

    @Override
    public byte mo332b() {
        switch (this.f147c) {
            case 26:
            case 27:
            case 28:
            case 29:
                return (byte) 21;
            case 30:
            case 31:
            case 32:
            case 33:
                return (byte) 22;
            case 34:
            case 35:
            case 36:
            case 37:
                return (byte) 23;
            case 38:
            case 39:
            case 40:
            case 41:
                return (byte) 24;
            case 42:
            case 43:
            case 44:
            case 45:
                return (byte) 25;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            default:
                return this.f147c;
            case 59:
            case 60:
            case 61:
            case ByteOps.ISTORE_3:
                return (byte) 54;
            case 63:
            case 64:
            case 65:
            case 66:
                return (byte) 55;
            case 67:
            case 68:
            case 69:
            case 70:
                return (byte) 56;
            case 71:
            case 72:
            case 73:
            case 74:
                return (byte) 57;
            case 75:
            case 76:
            case 77:
            case 78:
                return (byte) 58;
        }
    }

    @Override
    protected void mo326b(byte[] bArr, int i) {
        int iM394h = m394h();
        int iM396j = m396j();
        if (iM394h == 0) {
            this.f156b = this.f147c < 59 ? (this.f147c - 26) & 3 : (this.f147c - 59) & 3;
        } else {
            this.f156b = m368a(bArr, i, iM394h);
            i += iM394h;
        }
        this.f157d = m370b(bArr, i, iM396j);
    }

    @Override
    protected void mo327c(byte[] bArr, int i) {
        int iM394h = m394h();
        int iM396j = m396j();
        if (m395i() > iM394h) {
            throw new IllegalArgumentException("Instruction has invalid variable index size (" + mo333b(i) + ")");
        }
        if (m397k() > iM396j) {
            throw new IllegalArgumentException("Instruction has invalid constant size (" + mo333b(i) + ")");
        }
        m369a(bArr, i, this.f156b, iM394h);
        m371b(bArr, iM394h + i, this.f157d, iM396j);
    }

    @Override
    protected boolean mo383c() {
        return this.f155a;
    }

    public boolean m398g() {
        return this.f147c < 54;
    }

    public String toString() {
        return m384d() + (this.f155a ? "_w" : "") + " v" + this.f156b + (m396j() > 0 ? ", " + this.f157d : "");
    }
}
