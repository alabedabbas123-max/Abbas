package com.a.b.a.d;

import com.a.b.a.a.ClassA;
import com.a.b.a.a.ClassB;
import com.a.b.a.a.ClassC;
import com.a.b.a.a.ClassD;
import com.a.b.a.a.ClassE;
import com.a.b.a.a.ClassF;
import com.a.b.a.a.ClassG;
import com.a.b.a.a.ClassH;
import com.a.b.a.a.ClassI;
import com.a.b.a.a.ClassJ;
import com.a.b.a.a.ClassK;
import com.a.b.a.a.ClassL;
import com.a.b.a.a.ClassM;
import com.a.b.a.a.ClassN;
import com.a.b.a.a.ClassO;
import com.a.b.a.a.ClassP;
import com.a.b.a.a.ClassQ;
import com.a.b.a.a.ClassR;
import com.a.b.a.a.ClassS;
import com.a.b.a.a.ClassX;
import com.a.b.a.b.ClassC;
import com.a.b.a.b.ClassD;
import com.a.b.a.b.ClassH;
import com.a.b.a.b.ClassK;
import com.a.b.a.b.ClassR;
import com.a.b.a.b.ClassT;
import com.a.b.a.e.ClassI;
import com.a.b.a.e.ClassK;
import com.a.b.a.e.Interfacea;
import com.a.b.a.e.Interfacej;
import com.a.b.e.a.Enumb;
import com.a.b.e.b.ClassA;
import com.a.b.e.c.Abstractag;
import com.a.b.e.c.aa;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassY;
import com.a.b.e.c.Interfaceb;
import com.a.b.g.ClassE;
import com.a.b.g.ClassF;
import com.a.b.g.ClassK;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttAnnotationDefault;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttBootstrapMethods;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttCode;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttConstantValue;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttDeprecated;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttEnclosingMethod;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttExceptions;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttInnerClasses;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLineNumberTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTypeTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSignature;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSourceDebugExtension;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSourceFile;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSynthetic;
import java.io.IOException;

public class ClassJ extends ClassB {

    public static final ClassJ f1947a = new ClassJ();

    private ClassD m4161a(ClassE c1307e, Interfaceb interfaceC1209b, ae c1205ae, int i, int i2, int i3, Interfacej interfaceC0975j) {
        ClassD c0932d = new ClassD(i);
        int i4 = 0;
        while (i4 < i) {
            if (i3 < 4) {
                m4165b();
            }
            int iM5446f = c1307e.m5446f(i2);
            int iM5446f2 = c1307e.m5446f(i2 + 2);
            if (interfaceC0975j != null) {
                interfaceC0975j.m4195a(c1307e, i2, 2, "bootstrap_method_ref: " + ClassK.m5485c(iM5446f));
                interfaceC0975j.m4195a(c1307e, i2 + 2, 2, "num_bootstrap_arguments: " + ClassK.m5485c(iM5446f2));
            }
            int i5 = i2 + 4;
            int i6 = i3 - 4;
            if (i6 < iM5446f2 * 2) {
                m4165b();
            }
            ClassC c0931c = new ClassC(iM5446f2);
            int i7 = 0;
            while (i7 < iM5446f2) {
                int iM5446f3 = c1307e.m5446f(i5);
                if (interfaceC0975j != null) {
                    interfaceC0975j.m4195a(c1307e, i5, 2, "bootstrap_arguments[" + i7 + "]" + ClassK.m5485c(iM5446f3));
                }
                c0931c.m3955a(i7, interfaceC1209b.mo4971a(iM5446f3));
                i7++;
                i5 += 2;
                i6 -= 2;
            }
            c0931c.mo3944c_();
            c0932d.m3958a(i4, c1205ae, (ClassY) interfaceC1209b.mo4971a(iM5446f), c0931c);
            i4++;
            i3 = i6;
            i2 = i5;
        }
        c0932d.mo3944c_();
        if (i3 != 0) {
            m4164a(i3);
        }
        return c0932d;
    }

    private ClassT m4162a(ClassE c1307e, Interfaceb interfaceC1209b, Interfacej interfaceC0975j, int i, boolean z) {
        if (c1307e.m5436a() != i * 10) {
            m4164a((i * 10) + 2);
        }
        ClassF c1308fM5441b = c1307e.m5441b();
        ClassT c0948t = new ClassT(i);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                int unsignedShort = c1308fM5441b.readUnsignedShort();
                int unsignedShort2 = c1308fM5441b.readUnsignedShort();
                int unsignedShort3 = c1308fM5441b.readUnsignedShort();
                int unsignedShort4 = c1308fM5441b.readUnsignedShort();
                int unsignedShort5 = c1308fM5441b.readUnsignedShort();
                ad c1204ad = (ad) interfaceC1209b.mo4971a(unsignedShort3);
                ad c1204ad2 = (ad) interfaceC1209b.mo4971a(unsignedShort4);
                ad c1204ad3 = null;
                ad c1204ad4 = null;
                if (z) {
                    c1204ad4 = c1204ad2;
                } else {
                    c1204ad3 = c1204ad2;
                }
                c0948t.m4053a(i2, unsignedShort, unsignedShort2, c1204ad, c1204ad3, c1204ad4, unsignedShort5);
                if (interfaceC0975j != null) {
                    interfaceC0975j.m4195a(c1307e, i2 * 10, 10, String.valueOf(ClassK.m5485c(unsignedShort)) + ".." + ClassK.m5485c(unsignedShort + unsignedShort2) + " " + ClassK.m5485c(unsignedShort5) + " " + c1204ad.mo3828d() + " " + c1204ad2.mo3828d());
                }
            } catch (IOException e) {
                throw new RuntimeException("shouldn't happen", e);
            }
        }
        c0948t.mo3944c_();
        return c0948t;
    }

    private static Interfacea m4163a() {
        throw new ClassI("severely truncated attribute");
    }

    private static Interfacea m4164a(int i) {
        throw new ClassI("bad attribute length; expected length " + ClassK.m5480a(i));
    }

    private static Interfacea m4165b() {
        throw new ClassI("truncated attribute");
    }

    private Interfacea m4166b(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 < 2) {
            m4163a();
        }
        return new ClassA(new ClassA(c0960e, i, i2, interfaceC0975j).m4106a(), i2);
    }

    private Interfacea m4167c(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 < 2) {
            return m4163a();
        }
        ClassE c1307eM4130b = c0960e.m4130b();
        int iM5446f = c1307eM4130b.m5446f(i);
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM4130b, i, 2, "num_boostrap_methods: " + ClassK.m5485c(iM5446f));
        }
        return new ClassB(m4161a(c1307eM4130b, c0960e.m4135g(), c0960e.m4133e(), iM5446f, i + 2, i2 - 2, interfaceC0975j));
    }

    private Interfacea m4168d(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 < 12) {
            return m4163a();
        }
        ClassE c1307eM4130b = c0960e.m4130b();
        Interfaceb interfaceC1209bM4135g = c0960e.m4135g();
        int iM5446f = c1307eM4130b.m5446f(i);
        int iM5446f2 = c1307eM4130b.m5446f(i + 2);
        int iM5442c = c1307eM4130b.m5442c(i + 4);
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM4130b, i, 2, "max_stack: " + ClassK.m5485c(iM5446f));
            interfaceC0975j.m4195a(c1307eM4130b, i + 2, 2, "max_locals: " + ClassK.m5485c(iM5446f2));
            interfaceC0975j.m4195a(c1307eM4130b, i + 4, 4, "code_length: " + ClassK.m5480a(iM5442c));
        }
        int i3 = i + 8;
        int i4 = i2 - 8;
        if (i4 < iM5442c + 4) {
            return m4165b();
        }
        int i5 = i3 + iM5442c;
        int i6 = i4 - iM5442c;
        ClassK c0939k = new ClassK(c1307eM4130b.m5438a(i3, iM5442c + i3), interfaceC1209bM4135g);
        if (interfaceC0975j != null) {
            c0939k.m3990a(new ClassD(c0939k.m3989a(), interfaceC0975j));
        }
        int iM5446f3 = c1307eM4130b.m5446f(i5);
        ClassH c0936h = iM5446f3 == 0 ? ClassH.f1864a : new ClassH(iM5446f3);
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM4130b, i5, 2, "exception_table_length: " + ClassK.m5485c(iM5446f3));
        }
        int i7 = i5 + 2;
        int i8 = i6 - 2;
        if (i8 < (iM5446f3 * 8) + 2) {
            return m4165b();
        }
        int i9 = 0;
        int i10 = i8;
        int i11 = i7;
        while (i9 < iM5446f3) {
            if (interfaceC0975j != null) {
                interfaceC0975j.m4194a(1);
            }
            int iM5446f4 = c1307eM4130b.m5446f(i11);
            int iM5446f5 = c1307eM4130b.m5446f(i11 + 2);
            int iM5446f6 = c1307eM4130b.m5446f(i11 + 4);
            ae c1205ae = (ae) interfaceC1209bM4135g.mo4973b(c1307eM4130b.m5446f(i11 + 6));
            c0936h.m3972a(i9, iM5446f4, iM5446f5, iM5446f6, c1205ae);
            if (interfaceC0975j != null) {
                interfaceC0975j.m4195a(c1307eM4130b, i11, 8, String.valueOf(ClassK.m5485c(iM5446f4)) + ".." + ClassK.m5485c(iM5446f5) + " -> " + ClassK.m5485c(iM5446f6) + " " + (c1205ae == null ? "<any>" : c1205ae.mo3828d()));
            }
            int i12 = i11 + 8;
            int i13 = i10 - 8;
            if (interfaceC0975j != null) {
                interfaceC0975j.m4194a(-1);
            }
            i9++;
            i10 = i13;
            i11 = i12;
        }
        c0936h.mo3944c_();
        ClassC c0958c = new ClassC(c0960e, 3, i11, this);
        c0958c.m4113a(interfaceC0975j);
        ClassK c0976kM4114b = c0958c.m4114b();
        c0976kM4114b.mo3944c_();
        int iM4112a = c0958c.m4112a() - i11;
        return iM4112a != i10 ? m4164a((i11 - i) + iM4112a) : new ClassC(iM5446f, iM5446f2, c0939k, c0936h, c0976kM4114b);
    }

    private Interfacea m4169e(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 != 2) {
            return m4164a(2);
        }
        ClassE c1307eM4130b = c0960e.m4130b();
        Abstractag abstractC1207ag = (Abstractag) c0960e.m4135g().mo4971a(c1307eM4130b.m5446f(i));
        ClassD c0890d = new ClassD(abstractC1207ag);
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM4130b, i, 2, "value: " + abstractC1207ag);
        }
        return c0890d;
    }

    private Interfacea m4170f(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        return i2 != 0 ? m4164a(0) : new ClassE();
    }

    private Interfacea m4171g(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 != 4) {
            m4164a(4);
        }
        ClassE c1307eM4130b = c0960e.m4130b();
        Interfaceb interfaceC1209bM4135g = c0960e.m4135g();
        ae c1205ae = (ae) interfaceC1209bM4135g.mo4971a(c1307eM4130b.m5446f(i));
        aa c1201aa = (aa) interfaceC1209bM4135g.mo4973b(c1307eM4130b.m5446f(i + 2));
        ClassF c0892f = new ClassF(c1205ae, c1201aa);
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM4130b, i, 2, "class: " + c1205ae);
            interfaceC0975j.m4195a(c1307eM4130b, i + 2, 2, "method: " + ClassE.m4120a(c1201aa));
        }
        return c0892f;
    }

    private Interfacea m4172h(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 < 2) {
            return m4163a();
        }
        ClassE c1307eM4130b = c0960e.m4130b();
        int iM5446f = c1307eM4130b.m5446f(i);
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM4130b, i, 2, "number_of_exceptions: " + ClassK.m5485c(iM5446f));
        }
        int i3 = i + 2;
        if (i2 - 2 != iM5446f * 2) {
            m4164a((iM5446f * 2) + 2);
        }
        return new ClassG(c0960e.m4127a(i3, iM5446f));
    }

    private Interfacea m4173i(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 < 2) {
            return m4163a();
        }
        ClassE c1307eM4130b = c0960e.m4130b();
        Interfaceb interfaceC1209bM4135g = c0960e.m4135g();
        int iM5446f = c1307eM4130b.m5446f(i);
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM4130b, i, 2, "number_of_classes: " + ClassK.m5485c(iM5446f));
        }
        int i3 = i + 2;
        if (i2 - 2 != iM5446f * 8) {
            m4164a((iM5446f * 8) + 2);
        }
        ClassX c0910x = new ClassX(iM5446f);
        int i4 = 0;
        int i5 = i3;
        while (i4 < iM5446f) {
            int iM5446f2 = c1307eM4130b.m5446f(i5);
            int iM5446f3 = c1307eM4130b.m5446f(i5 + 2);
            int iM5446f4 = c1307eM4130b.m5446f(i5 + 4);
            int iM5446f5 = c1307eM4130b.m5446f(i5 + 6);
            ae c1205ae = (ae) interfaceC1209bM4135g.mo4971a(iM5446f2);
            ae c1205ae2 = (ae) interfaceC1209bM4135g.mo4973b(iM5446f3);
            ad c1204ad = (ad) interfaceC1209bM4135g.mo4973b(iM5446f4);
            c0910x.m3787a(i4, c1205ae, c1205ae2, c1204ad, iM5446f5);
            if (interfaceC0975j != null) {
                interfaceC0975j.m4195a(c1307eM4130b, i5, 2, "inner_class: " + ClassE.m4120a(c1205ae));
                interfaceC0975j.m4195a(c1307eM4130b, i5 + 2, 2, "  outer_class: " + ClassE.m4120a(c1205ae2));
                interfaceC0975j.m4195a(c1307eM4130b, i5 + 4, 2, "  name: " + ClassE.m4120a(c1204ad));
                interfaceC0975j.m4195a(c1307eM4130b, i5 + 6, 2, "  access_flags: " + ClassA.m4728b(iM5446f5));
            }
            i4++;
            i5 += 8;
        }
        c0910x.mo3944c_();
        return new ClassH(c0910x);
    }

    private Interfacea m4174j(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 < 2) {
            return m4163a();
        }
        ClassE c1307eM4130b = c0960e.m4130b();
        int iM5446f = c1307eM4130b.m5446f(i);
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM4130b, i, 2, "line_number_table_length: " + ClassK.m5485c(iM5446f));
        }
        int i3 = i + 2;
        if (i2 - 2 != iM5446f * 4) {
            m4164a((iM5446f * 4) + 2);
        }
        ClassR c0946r = new ClassR(iM5446f);
        for (int i4 = 0; i4 < iM5446f; i4++) {
            int iM5446f2 = c1307eM4130b.m5446f(i3);
            int iM5446f3 = c1307eM4130b.m5446f(i3 + 2);
            c0946r.m4043a(i4, iM5446f2, iM5446f3);
            if (interfaceC0975j != null) {
                interfaceC0975j.m4195a(c1307eM4130b, i3, 4, String.valueOf(ClassK.m5485c(iM5446f2)) + " " + iM5446f3);
            }
            i3 += 4;
        }
        c0946r.mo3944c_();
        return new ClassI(c0946r);
    }

    private Interfacea m4175k(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 < 2) {
            return m4163a();
        }
        ClassE c1307eM4130b = c0960e.m4130b();
        int iM5446f = c1307eM4130b.m5446f(i);
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM4130b, i, 2, "local_variable_table_length: " + ClassK.m5485c(iM5446f));
        }
        return new ClassJ(m4162a(c1307eM4130b.m5438a(i + 2, i + i2), c0960e.m4135g(), interfaceC0975j, iM5446f, false));
    }

    private Interfacea m4176l(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 < 2) {
            return m4163a();
        }
        ClassE c1307eM4130b = c0960e.m4130b();
        int iM5446f = c1307eM4130b.m5446f(i);
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM4130b, i, 2, "local_variable_type_table_length: " + ClassK.m5485c(iM5446f));
        }
        return new ClassK(m4162a(c1307eM4130b.m5438a(i + 2, i + i2), c0960e.m4135g(), interfaceC0975j, iM5446f, true));
    }

    private Interfacea m4177m(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 < 2) {
            m4163a();
        }
        return new ClassL(new ClassA(c0960e, i, i2, interfaceC0975j).m4107b(Enumb.BUILD), i2);
    }

    private Interfacea m4178n(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 < 2) {
            m4163a();
        }
        return new ClassN(new ClassA(c0960e, i, i2, interfaceC0975j).m4107b(Enumb.RUNTIME), i2);
    }

    private Interfacea m4179o(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 < 2) {
            m4163a();
        }
        return new ClassM(new ClassA(c0960e, i, i2, interfaceC0975j).m4105a(Enumb.BUILD), i2);
    }

    private Interfacea m4180p(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 < 2) {
            m4163a();
        }
        return new ClassO(new ClassA(c0960e, i, i2, interfaceC0975j).m4105a(Enumb.RUNTIME), i2);
    }

    private Interfacea m4181q(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 != 2) {
            m4164a(2);
        }
        ClassE c1307eM4130b = c0960e.m4130b();
        ad c1204ad = (ad) c0960e.m4135g().mo4971a(c1307eM4130b.m5446f(i));
        ClassP c0902p = new ClassP(c1204ad);
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM4130b, i, 2, "signature: " + c1204ad);
        }
        return c0902p;
    }

    private Interfacea m4182r(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        ClassE c1307eM5438a = c0960e.m4130b().m5438a(i, i + i2);
        ad c1204ad = new ad(c1307eM5438a);
        ClassQ c0903q = new ClassQ(c1204ad);
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM5438a, i, i2, "sourceDebugExtension: " + c1204ad.m4958j());
        }
        return c0903q;
    }

    private Interfacea m4183s(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        if (i2 != 2) {
            m4164a(2);
        }
        ClassE c1307eM4130b = c0960e.m4130b();
        ad c1204ad = (ad) c0960e.m4135g().mo4971a(c1307eM4130b.m5446f(i));
        ClassR c0904r = new ClassR(c1204ad);
        if (interfaceC0975j != null) {
            interfaceC0975j.m4195a(c1307eM4130b, i, 2, "source: " + c1204ad);
        }
        return c0904r;
    }

    private Interfacea m4184t(ClassE c0960e, int i, int i2, Interfacej interfaceC0975j) {
        return i2 != 0 ? m4164a(0) : new ClassS();
    }

    @Override
    protected Interfacea mo4109a(ClassE c0960e, int i, String str, int i2, int i3, Interfacej interfaceC0975j) {
        switch (i) {
            case 0:
                if (str == AttBootstrapMethods.ATTRIBUTE_NAME) {
                    return m4167c(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttDeprecated.ATTRIBUTE_NAME) {
                    return m4170f(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttEnclosingMethod.ATTRIBUTE_NAME) {
                    return m4171g(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttInnerClasses.ATTRIBUTE_NAME) {
                    return m4173i(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME) {
                    return m4177m(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME) {
                    return m4178n(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttSynthetic.ATTRIBUTE_NAME) {
                    return m4184t(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttSignature.ATTRIBUTE_NAME) {
                    return m4181q(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttSourceDebugExtension.ATTRIBUTE_NAME) {
                    return m4182r(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttSourceFile.ATTRIBUTE_NAME) {
                    return m4183s(c0960e, i2, i3, interfaceC0975j);
                }
                break;
            case 1:
                if (str == AttConstantValue.ATTRIBUTE_NAME) {
                    return m4169e(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttDeprecated.ATTRIBUTE_NAME) {
                    return m4170f(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME) {
                    return m4177m(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME) {
                    return m4178n(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttSignature.ATTRIBUTE_NAME) {
                    return m4181q(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttSynthetic.ATTRIBUTE_NAME) {
                    return m4184t(c0960e, i2, i3, interfaceC0975j);
                }
                break;
            case 2:
                if (str == AttAnnotationDefault.ATTRIBUTE_NAME) {
                    return m4166b(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttCode.ATTRIBUTE_NAME) {
                    return m4168d(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttDeprecated.ATTRIBUTE_NAME) {
                    return m4170f(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttExceptions.ATTRIBUTE_NAME) {
                    return m4172h(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME) {
                    return m4177m(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME) {
                    return m4178n(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME) {
                    return m4179o(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME) {
                    return m4180p(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttSignature.ATTRIBUTE_NAME) {
                    return m4181q(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttSynthetic.ATTRIBUTE_NAME) {
                    return m4184t(c0960e, i2, i3, interfaceC0975j);
                }
                break;
            case 3:
                if (str == AttLineNumberTable.ATTRIBUTE_NAME) {
                    return m4174j(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttLocalVariableTable.ATTRIBUTE_NAME) {
                    return m4175k(c0960e, i2, i3, interfaceC0975j);
                }
                if (str == AttLocalVariableTypeTable.ATTRIBUTE_NAME) {
                    return m4176l(c0960e, i2, i3, interfaceC0975j);
                }
                break;
        }
        return super.mo4109a(c0960e, i, str, i2, i3, interfaceC0975j);
    }
}
