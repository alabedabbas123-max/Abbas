package com.a.b.a.d;

import com.a.b.a.e.ClassI;
import com.a.b.a.e.Interfacej;
import com.a.b.e.a.ClassA;
import com.a.b.e.a.ClassC;
import com.a.b.e.a.ClassD;
import com.a.b.e.a.ClassE;
import com.a.b.e.a.Enumb;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.aa;
import com.a.b.e.c.ac;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassC;
import com.a.b.e.c.ClassD;
import com.a.b.e.c.ClassE;
import com.a.b.e.c.ClassG;
import com.a.b.e.c.ClassH;
import com.a.b.e.c.ClassK;
import com.a.b.e.c.ClassL;
import com.a.b.e.c.ClassM;
import com.a.b.e.c.ClassO;
import com.a.b.e.c.ClassP;
import com.a.b.e.c.ClassW;
import com.a.b.e.c.Interfaceb;
import com.a.b.e.d.ClassC;
import com.a.b.g.ClassE;
import com.a.b.g.ClassF;
import com.a.b.g.ClassK;
import java.io.IOException;

public final class ClassA {

    private final ClassE f1908a;

    private final Interfaceb f1909b;

    private final ClassE f1910c;

    private final Interfacej f1911d;

    private final ClassF f1912e;

    private int f1913f;

    public ClassA(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (c0960e == null) {
            throw new NullPointerException("cf == null");
        }
        this.f1908a = c0960e;
        this.f1909b = c0960e.m4135g();
        this.f1911d = interfaceC0975j;
        this.f1910c = c0960e.m4130b().m5438a(i, i + i2);
        this.f1912e = this.f1910c.m5441b();
        this.f1913f = 0;
    }

    private void m4096a(int i) {
        if (this.f1912e.available() < i) {
            throw new ClassI("truncated annotation attribute");
        }
    }

    private void m4097a(int i, String str) {
        this.f1911d.m4195a(this.f1910c, this.f1913f, i, str);
        this.f1913f += i;
    }

    private ClassE m4098b() {
        m4096a(5);
        ad c1204ad = (ad) this.f1909b.mo4971a(this.f1912e.readUnsignedShort());
        if (this.f1911d != null) {
            m4097a(2, "element_name: " + c1204ad.mo3828d());
            m4097a(0, "value: ");
            m4099b(1);
        }
        Abstracta abstractC1200aM4101c = m4101c();
        if (this.f1911d != null) {
            m4099b(-1);
        }
        return new ClassE(c1204ad, abstractC1200aM4101c);
    }

    private void m4099b(int i) {
        this.f1911d.m4194a(i);
    }

    private ClassD m4100c(Enumb enumC1162b) {
        int unsignedByte = this.f1912e.readUnsignedByte();
        if (this.f1911d != null) {
            m4097a(1, "num_parameters: " + ClassK.m5487e(unsignedByte));
        }
        ClassD c1164d = new ClassD(unsignedByte);
        for (int i = 0; i < unsignedByte; i++) {
            if (this.f1911d != null) {
                m4097a(0, "parameter_annotations[" + i + "]:");
                m4099b(1);
            }
            c1164d.m4722a(i, m4102d(enumC1162b));
            if (this.f1911d != null) {
                this.f1911d.m4194a(-1);
            }
        }
        c1164d.mo3944c_();
        return c1164d;
    }

    private Abstracta m4101c() {
        int unsignedByte = this.f1912e.readUnsignedByte();
        if (this.f1911d != null) {
            m4097a(1, "tag: " + new ad(Character.toString((char) unsignedByte)).m4957i());
        }
        switch (unsignedByte) {
            case 64:
                return new ClassC(m4104e(Enumb.EMBEDDED));
            case 66:
                return ClassH.m4990a(((ClassP) m4103d()).m5002i_());
            case 67:
                ClassP c1223p = (ClassP) m4103d();
                c1223p.m5002i_();
                return ClassK.m4996a(c1223p.m5002i_());
            case 68:
                return (ClassL) m4103d();
            case 70:
                return (ClassO) m4103d();
            case 73:
                return (ClassP) m4103d();
            case 74:
                return (ClassW) m4103d();
            case 83:
                return ac.m4951a(((ClassP) m4103d()).m5002i_());
            case 90:
                return ClassG.m4987a(((ClassP) m4103d()).m5002i_());
            case 91:
                m4096a(2);
                int unsignedShort = this.f1912e.readUnsignedShort();
                ClassE c1212e = new ClassE(unsignedShort);
                if (this.f1911d != null) {
                    m4097a(2, "num_values: " + unsignedShort);
                    m4099b(1);
                }
                for (int i = 0; i < unsignedShort; i++) {
                    if (this.f1911d != null) {
                        m4099b(-1);
                        m4097a(0, "element_value[" + i + "]:");
                        m4099b(1);
                    }
                    c1212e.m4980a(i, m4101c());
                }
                if (this.f1911d != null) {
                    m4099b(-1);
                }
                c1212e.mo3944c_();
                return new ClassD(c1212e);
            case 99:
                ClassC c1236cM5058b = ClassC.m5058b(((ad) this.f1909b.mo4971a(this.f1912e.readUnsignedShort())).m4958j());
                if (this.f1911d != null) {
                    m4097a(2, "class_info: " + c1236cM5058b.mo3828d());
                }
                return new ae(c1236cM5058b);
            case 101:
                m4096a(4);
                int unsignedShort2 = this.f1912e.readUnsignedShort();
                int unsignedShort3 = this.f1912e.readUnsignedShort();
                ad c1204ad = (ad) this.f1909b.mo4971a(unsignedShort2);
                ad c1204ad2 = (ad) this.f1909b.mo4971a(unsignedShort3);
                if (this.f1911d != null) {
                    m4097a(2, "type_name: " + c1204ad.mo3828d());
                    m4097a(2, "const_name: " + c1204ad2.mo3828d());
                }
                return new ClassM(new aa(c1204ad2, c1204ad));
            case 115:
                return m4103d();
            default:
                throw new ClassI("unknown annotation tag: " + ClassK.m5487e(unsignedByte));
        }
    }

    private ClassC m4102d(Enumb enumC1162b) {
        int unsignedShort = this.f1912e.readUnsignedShort();
        if (this.f1911d != null) {
            m4097a(2, "num_annotations: " + ClassK.m5485c(unsignedShort));
        }
        ClassC c1163c = new ClassC();
        for (int i = 0; i < unsignedShort; i++) {
            if (this.f1911d != null) {
                m4097a(0, "annotations[" + i + "]:");
                m4099b(1);
            }
            c1163c.m4716a(m4104e(enumC1162b));
            if (this.f1911d != null) {
                this.f1911d.m4194a(-1);
            }
        }
        c1163c.mo3944c_();
        return c1163c;
    }

    private Abstracta m4103d() {
        Abstracta abstractC1200aMo4971a = this.f1909b.mo4971a(this.f1912e.readUnsignedShort());
        if (this.f1911d != null) {
            m4097a(2, "constant_value: " + (abstractC1200aMo4971a instanceof ad ? ((ad) abstractC1200aMo4971a).m4957i() : abstractC1200aMo4971a.mo3828d()));
        }
        return abstractC1200aMo4971a;
    }

    private ClassA m4104e(Enumb enumC1162b) {
        m4096a(4);
        int unsignedShort = this.f1912e.readUnsignedShort();
        int unsignedShort2 = this.f1912e.readUnsignedShort();
        ae c1205ae = new ae(ClassC.m5056a(((ad) this.f1909b.mo4971a(unsignedShort)).m4958j()));
        if (this.f1911d != null) {
            m4097a(2, "type: " + c1205ae.mo3828d());
            m4097a(2, "num_elements: " + unsignedShort2);
        }
        ClassA c1161a = new ClassA(c1205ae, enumC1162b);
        for (int i = 0; i < unsignedShort2; i++) {
            if (this.f1911d != null) {
                m4097a(0, "elements[" + i + "]:");
                m4099b(1);
            }
            c1161a.m4710b(m4098b());
            if (this.f1911d != null) {
                m4099b(-1);
            }
        }
        c1161a.mo3944c_();
        return c1161a;
    }

    public ClassD m4105a(Enumb enumC1162b) {
        try {
            ClassD c1164dM4100c = m4100c(enumC1162b);
            if (this.f1912e.available() != 0) {
                throw new ClassI("extra data in attribute");
            }
            return c1164dM4100c;
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    public Abstracta m4106a() {
        try {
            Abstracta abstractC1200aM4101c = m4101c();
            if (this.f1912e.available() != 0) {
                throw new ClassI("extra data in attribute");
            }
            return abstractC1200aM4101c;
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    public ClassC m4107b(Enumb enumC1162b) {
        try {
            ClassC c1163cM4102d = m4102d(enumC1162b);
            if (this.f1912e.available() != 0) {
                throw new ClassI("extra data in attribute");
            }
            return c1163cM4102d;
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }
}
