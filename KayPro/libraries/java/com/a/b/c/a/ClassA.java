package com.a.b.c.a;

import com.a.b.a.a.ClassA;
import com.a.b.a.a.ClassF;
import com.a.b.a.a.ClassG;
import com.a.b.a.a.ClassH;
import com.a.b.a.a.ClassL;
import com.a.b.a.a.ClassM;
import com.a.b.a.a.ClassN;
import com.a.b.a.a.ClassO;
import com.a.b.a.a.ClassP;
import com.a.b.a.a.ClassQ;
import com.a.b.a.a.ClassX;
import com.a.b.a.a.ClassY;
import com.a.b.a.d.ClassE;
import com.a.b.a.e.Interfaceb;
import com.a.b.a.e.Interfaceg;
import com.a.b.a.e.Interfaceh;
import com.a.b.c.c.ClassE;
import com.a.b.e.a.ClassA;
import com.a.b.e.a.ClassC;
import com.a.b.e.a.ClassD;
import com.a.b.e.a.ClassE;
import com.a.b.e.a.Enumb;
import com.a.b.e.b.ClassA;
import com.a.b.e.c.aa;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassZ;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassY;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttAnnotationDefault;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttEnclosingMethod;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttExceptions;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttInnerClasses;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSignature;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSourceDebugExtension;
import java.util.ArrayList;

class ClassA {
    private static ClassA m4204a(ClassE c0960e) {
        boolean z;
        ae c1205aeM4133e = c0960e.m4133e();
        Interfaceh interfaceC0973hM4138j = c0960e.m4138j();
        int iM4193d_ = interfaceC0973hM4138j.m4193d_();
        ClassA c1161a = new ClassA(c1205aeM4133e, Enumb.EMBEDDED);
        int i = 0;
        boolean z2 = false;
        while (i < iM4193d_) {
            Interfaceg interfaceC0972gMo4192a = interfaceC0973hM4138j.mo4192a(i);
            ClassA c0887a = (ClassA) interfaceC0972gMo4192a.mo4003h().mo4186a(AttAnnotationDefault.ATTRIBUTE_NAME);
            if (c0887a != null) {
                c1161a.m4710b(new ClassE(interfaceC0972gMo4192a.mo3999d().m4944a(), c0887a.m3766b()));
                z = true;
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        if (!z2) {
            return null;
        }
        c1161a.mo3944c_();
        return ClassE.m4580a(c1161a);
    }

    public static ClassC m4205a(ClassE c0960e, ClassB c0986b) {
        ClassC c1163cM4714a;
        ClassA c1161aM4204a;
        ae c1205aeM4133e = c0960e.m4133e();
        Interfaceb interfaceC0967bM4139k = c0960e.m4139k();
        ClassC c1163cM4206a = m4206a(interfaceC0967bM4139k);
        ClassA c1161aM4214e = m4214e(interfaceC0967bM4139k);
        try {
            ClassC c1163cM4207a = m4207a(c1205aeM4133e, interfaceC0967bM4139k, c1161aM4214e == null);
            c1163cM4714a = c1163cM4207a != null ? ClassC.m4714a(c1163cM4206a, c1163cM4207a) : c1163cM4206a;
        } catch (ClassY e) {
            c0986b.f1972h.println("warning: " + e.getMessage());
        }
        if (c1161aM4214e != null) {
            c1163cM4714a = ClassC.m4713a(c1163cM4714a, c1161aM4214e);
        }
        return (!ClassA.m4736j(c0960e.mo4132d()) || (c1161aM4204a = m4204a(c0960e)) == null) ? c1163cM4714a : ClassC.m4713a(c1163cM4714a, c1161aM4204a);
    }

    public static ClassC m4206a(Interfaceb interfaceC0967b) {
        ClassC c1163cM4209b = m4209b(interfaceC0967b);
        ClassA c1161aM4211c = m4211c(interfaceC0967b);
        ClassA c1161aM4213d = m4213d(interfaceC0967b);
        if (c1161aM4211c != null) {
            c1163cM4209b = ClassC.m4713a(c1163cM4209b, c1161aM4211c);
        }
        return c1161aM4213d != null ? ClassC.m4713a(c1163cM4209b, c1161aM4213d) : c1163cM4209b;
    }

    private static ClassC m4207a(ae c1205ae, Interfaceb interfaceC0967b, boolean z) {
        ClassH c0894h = (ClassH) interfaceC0967b.mo4186a(AttInnerClasses.ATTRIBUTE_NAME);
        if (c0894h == null) {
            return null;
        }
        ClassX c0910xM3777b = c0894h.m3777b();
        int iD_ = c0910xM3777b.m5476d_();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        ClassY c0911y = null;
        while (i < iD_) {
            ClassY c0911yM3786a = c0910xM3777b.m3786a(i);
            ae c1205aeM3788a = c0911yM3786a.m3788a();
            if (!c1205aeM3788a.equals(c1205ae)) {
                if (c1205ae.equals(c0911yM3786a.m3789b())) {
                    arrayList.add(c1205aeM3788a.m4966i());
                }
                c0911yM3786a = c0911y;
            }
            i++;
            c0911y = c0911yM3786a;
        }
        int size = arrayList.size();
        if (c0911y == null && size == 0) {
            return null;
        }
        ClassC c1163c = new ClassC();
        if (c0911y != null) {
            c1163c.m4716a(ClassE.m4582a(c0911y.m3790c(), c0911y.m3791d()));
            if (z) {
                if (c0911y.m3789b() == null) {
                    throw new ClassY("Ignoring InnerClasses attribute for an anonymous inner class\n(" + c1205ae.mo3828d() + ") that doesn't come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class.");
                }
                c1163c.m4716a(ClassE.m4583a(c0911y.m3789b()));
            }
        }
        if (size != 0) {
            ClassB c1235b = new ClassB(size);
            for (int i2 = 0; i2 < size; i2++) {
                c1235b.m5052a(i2, (ClassC) arrayList.get(i2));
            }
            c1235b.mo3944c_();
            c1163c.m4716a(ClassE.m4585a(c1235b));
        }
        c1163c.mo3944c_();
        return c1163c;
    }

    public static Interfacee m4208a(Interfaceg interfaceC0972g) {
        ClassG c0893g = (ClassG) interfaceC0972g.mo4003h().mo4186a(AttExceptions.ATTRIBUTE_NAME);
        return c0893g == null ? ClassB.f3210a : c0893g.m3776b();
    }

    private static ClassC m4209b(Interfaceb interfaceC0967b) {
        ClassN c0900n = (ClassN) interfaceC0967b.mo4186a(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
        ClassL c0898l = (ClassL) interfaceC0967b.mo4186a(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME);
        if (c0900n == null) {
            return c0898l == null ? ClassC.f2826a : c0898l.m3782b();
        }
        return c0898l == null ? c0900n.m3782b() : ClassC.m4714a(c0900n.m3782b(), c0898l.m3782b());
    }

    public static ClassC m4210b(Interfaceg interfaceC0972g) {
        ClassC c1163cM4206a = m4206a(interfaceC0972g.mo4003h());
        Interfacee interfaceC1238eM4208a = m4208a(interfaceC0972g);
        return interfaceC1238eM4208a.mo4148d_() != 0 ? ClassC.m4713a(c1163cM4206a, ClassE.m4587b(interfaceC1238eM4208a)) : c1163cM4206a;
    }

    private static ClassA m4211c(Interfaceb interfaceC0967b) {
        ClassP c0902p = (ClassP) interfaceC0967b.mo4186a(AttSignature.ATTRIBUTE_NAME);
        if (c0902p == null) {
            return null;
        }
        return ClassE.m4581a(c0902p.m3779b());
    }

    public static ClassD m4212c(Interfaceg interfaceC0972g) {
        Interfaceb interfaceC0967bH = interfaceC0972g.mo4003h();
        ClassO c0901o = (ClassO) interfaceC0967bH.mo4186a(AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME);
        ClassM c0899m = (ClassM) interfaceC0967bH.mo4186a(AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME);
        if (c0901o == null) {
            return c0899m == null ? ClassD.f2828a : c0899m.m3785b();
        }
        return c0899m == null ? c0901o.m3785b() : ClassD.m4720a(c0901o.m3785b(), c0899m.m3785b());
    }

    private static ClassA m4213d(Interfaceb interfaceC0967b) {
        ClassQ c0903q = (ClassQ) interfaceC0967b.mo4186a(AttSourceDebugExtension.ATTRIBUTE_NAME);
        if (c0903q == null) {
            return null;
        }
        return ClassE.m4586b(c0903q.m3780b());
    }

    private static ClassA m4214e(Interfaceb interfaceC0967b) {
        ClassF c0892f = (ClassF) interfaceC0967b.mo4186a(AttEnclosingMethod.ATTRIBUTE_NAME);
        if (c0892f == null) {
            return null;
        }
        ae c1205aeM3774b = c0892f.m3774b();
        aa c1201aaM3775c = c0892f.m3775c();
        return c1201aaM3775c == null ? ClassE.m4583a(c1205aeM3774b) : ClassE.m4584a(new ClassZ(c1205aeM3774b, c1201aaM3775c));
    }
}
