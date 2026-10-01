package com.a.b.c.b;

import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstractu;
import com.a.b.e.c.Abstractv;
import com.a.b.e.c.ClassS;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.util.BitSet;

public abstract class Abstractr {
    protected static String m4405a(ClassX c1197x) {
        int iD_ = c1197x.m5476d_();
        StringBuilder sb = new StringBuilder((iD_ * 5) + 2);
        sb.append('{');
        for (int i = 0; i < iD_; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c1197x.m4916b(i).m4900m());
        }
        sb.append('}');
        return sb.toString();
    }

    protected static String m4406a(Abstractv abstractC1229v) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (abstractC1229v instanceof ClassS) {
            sb.append("null");
        } else {
            sb.append(abstractC1229v.mo4943h());
            sb.append(' ');
            sb.append(abstractC1229v.mo3828d());
        }
        return sb.toString();
    }

    protected static String m4407a(Abstractv abstractC1229v, int i) {
        StringBuilder sb = new StringBuilder(20);
        sb.append("#");
        long jMo5017k = abstractC1229v instanceof Abstractu ? ((Abstractu) abstractC1229v).mo5017k() : abstractC1229v.mo5016j();
        switch (i) {
            case 4:
                sb.append(ClassK.m5488f((int) jMo5017k));
                break;
            case 8:
                sb.append(ClassK.m5487e((int) jMo5017k));
                break;
            case 16:
                sb.append(ClassK.m5485c((int) jMo5017k));
                break;
            case 32:
                sb.append(ClassK.m5480a((int) jMo5017k));
                break;
            case 64:
                sb.append(ClassK.m5481a(jMo5017k));
                break;
            default:
                throw new RuntimeException("shouldn't happen");
        }
        return sb.toString();
    }

    protected static short m4408a(int i, int i2) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("low out of range 0..255");
        }
        if ((i2 & 255) != i2) {
            throw new IllegalArgumentException("high out of range 0..255");
        }
        return (short) ((i2 << 8) | i);
    }

    protected static short m4409a(int i, int i2, int i3, int i4) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("n0 out of range 0..15");
        }
        if ((i2 & 15) != i2) {
            throw new IllegalArgumentException("n1 out of range 0..15");
        }
        if ((i3 & 15) != i3) {
            throw new IllegalArgumentException("n2 out of range 0..15");
        }
        if ((i4 & 15) != i4) {
            throw new IllegalArgumentException("n3 out of range 0..15");
        }
        return (short) ((i2 << 4) | i | (i3 << 8) | (i4 << 12));
    }

    protected static short m4410a(Abstractl abstractC1044l, int i) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("arg out of range 0..255");
        }
        int iM4393a = abstractC1044l.m4379j().m4393a();
        if ((iM4393a & 255) != iM4393a) {
            throw new IllegalArgumentException("opcode out of range 0..255");
        }
        return (short) (iM4393a | (i << 8));
    }

    protected static void m4411a(Interfacea interfaceC1303a, short s) {
        interfaceC1303a.mo5456c(s);
    }

    protected static void m4412a(Interfacea interfaceC1303a, short s, int i) {
        m4415a(interfaceC1303a, s, (short) i, (short) (i >> 16));
    }

    protected static void m4413a(Interfacea interfaceC1303a, short s, long j) {
        m4417a(interfaceC1303a, s, (short) j, (short) (j >> 16), (short) (j >> 32), (short) (j >> 48));
    }

    protected static void m4414a(Interfacea interfaceC1303a, short s, short s2) {
        interfaceC1303a.mo5456c(s);
        interfaceC1303a.mo5456c(s2);
    }

    protected static void m4415a(Interfacea interfaceC1303a, short s, short s2, short s3) {
        interfaceC1303a.mo5456c(s);
        interfaceC1303a.mo5456c(s2);
        interfaceC1303a.mo5456c(s3);
    }

    protected static void m4416a(Interfacea interfaceC1303a, short s, short s2, short s3, short s4) {
        interfaceC1303a.mo5456c(s);
        interfaceC1303a.mo5456c(s2);
        interfaceC1303a.mo5456c(s3);
        interfaceC1303a.mo5456c(s4);
    }

    protected static void m4417a(Interfacea interfaceC1303a, short s, short s2, short s3, short s4, short s5) {
        interfaceC1303a.mo5456c(s);
        interfaceC1303a.mo5456c(s2);
        interfaceC1303a.mo5456c(s3);
        interfaceC1303a.mo5456c(s4);
        interfaceC1303a.mo5456c(s5);
    }

    protected static boolean m4418a(int i) {
        return i >= -8 && i <= 7;
    }

    protected static int m4419b(int i, int i2) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("low out of range 0..15");
        }
        if ((i2 & 15) != i2) {
            throw new IllegalArgumentException("high out of range 0..15");
        }
        return (i2 << 4) | i;
    }

    protected static String m4420b(ClassX c1197x) {
        int iD_ = c1197x.m5476d_();
        StringBuilder sb = new StringBuilder(30);
        sb.append("{");
        switch (iD_) {
            case 0:
                break;
            case 1:
                sb.append(c1197x.m4916b(0).m4900m());
                break;
            default:
                ClassU c1194uM4916b = c1197x.m4916b(iD_ - 1);
                if (c1194uM4916b.m4898k() == 2) {
                    c1194uM4916b = c1194uM4916b.m4893c(1);
                }
                sb.append(c1197x.m4916b(0).m4900m());
                sb.append("..");
                sb.append(c1194uM4916b.m4900m());
                break;
        }
        sb.append("}");
        return sb.toString();
    }

    protected static boolean m4421b(int i) {
        return i == (i & 15);
    }

    protected static boolean m4422c(int i) {
        return ((byte) i) == i;
    }

    protected static boolean m4423c(ClassX c1197x) {
        int iD_ = c1197x.m5476d_();
        if (iD_ < 2) {
            return true;
        }
        int iM4894g = c1197x.m4916b(0).m4894g();
        for (int i = 0; i < iD_; i++) {
            ClassU c1194uM4916b = c1197x.m4916b(i);
            if (c1194uM4916b.m4894g() != iM4894g) {
                return false;
            }
            iM4894g += c1194uM4916b.m4898k();
        }
        return true;
    }

    protected static String m4424d(Abstractl abstractC1044l) {
        int iM4326d = ((am) abstractC1044l).m4326d();
        return iM4326d == ((char) iM4326d) ? ClassK.m5485c(iM4326d) : ClassK.m5480a(iM4326d);
    }

    protected static boolean m4425d(int i) {
        return i == (i & 255);
    }

    protected static String m4426e(Abstractl abstractC1044l) {
        int iM4327e = ((am) abstractC1044l).m4327e();
        return iM4327e == ((short) iM4327e) ? ClassK.m5490h(iM4327e) : ClassK.m5489g(iM4327e);
    }

    protected static boolean m4427e(int i) {
        return ((short) i) == i;
    }

    protected static boolean m4428f(int i) {
        return i == (65535 & i);
    }

    public abstract int mo4234a();

    public abstract String mo4235a(Abstractl abstractC1044l);

    public final String m4429a(Abstractl abstractC1044l, boolean z) {
        String strM4397e = abstractC1044l.m4379j().m4397e();
        String strMo4235a = mo4235a(abstractC1044l);
        String strMo4238b = mo4238b(abstractC1044l, z);
        StringBuilder sb = new StringBuilder(100);
        sb.append(strM4397e);
        if (strMo4235a.length() != 0) {
            sb.append(' ');
            sb.append(strMo4235a);
        }
        if (strMo4238b.length() != 0) {
            sb.append(" // ");
            sb.append(strMo4238b);
        }
        return sb.toString();
    }

    public abstract void mo4236a(Interfacea interfaceC1303a, Abstractl abstractC1044l);

    public boolean mo4237a(am c1031am) {
        return false;
    }

    public abstract String mo4238b(Abstractl abstractC1044l, boolean z);

    public abstract boolean mo4239b(Abstractl abstractC1044l);

    public BitSet mo4240c(Abstractl abstractC1044l) {
        return new BitSet();
    }
}
