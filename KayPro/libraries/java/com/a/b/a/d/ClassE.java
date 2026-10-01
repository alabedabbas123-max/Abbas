package com.a.b.a.d;

import com.a.b.a.a.ClassB;
import com.a.b.a.a.ClassR;
import com.a.b.a.b.ClassD;
import com.a.b.a.c.ClassA;
import com.a.b.a.e.ClassI;
import com.a.b.a.e.ClassK;
import com.a.b.a.e.Interfacea;
import com.a.b.a.e.Interfaceb;
import com.a.b.a.e.Interfacec;
import com.a.b.a.e.Interfacee;
import com.a.b.a.e.Interfaceh;
import com.a.b.a.e.Interfacej;
import com.a.b.e.b.ClassA;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.af;
import com.a.b.e.c.Interfaceb;
import com.a.b.e.d.ClassB;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassE;
import com.a.b.g.ClassK;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttBootstrapMethods;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSourceFile;

public class ClassE implements Interfacec {

    private final String f1923a;

    private final ClassE f1924b;

    private final boolean f1925c;

    private af f1926d;

    private int f1927e;

    private ae f1928f;

    private ae f1929g;

    private Interfacee f1930h;

    private Interfacee f1931i;

    private Interfaceh f1932j;

    private ClassK f1933k;

    private ClassB f1934l;

    private Interfacej f1935m;

    public ClassE(ClassE c1307e, String str, boolean z) {
        if (c1307e == null) {
            throw new NullPointerException("bytes == null");
        }
        if (str == null) {
            throw new NullPointerException("filePath == null");
        }
        this.f1923a = str;
        this.f1924b = c1307e;
        this.f1925c = z;
        this.f1927e = -1;
    }

    public ClassE(byte[] bArr, String str, boolean z) {
        this(new ClassE(bArr), str, z);
    }

    public static String m4120a(Object obj) {
        return obj == null ? "(none)" : obj.toString();
    }

    private boolean m4121a(int i) {
        return i == -889275714;
    }

    private boolean m4122b(int i, int i2) {
        if (i >= 0) {
            if (i2 == 53) {
                if (i <= 0) {
                    return true;
                }
            } else if (i2 < 53 && i2 >= 45) {
                return true;
            }
        }
        return false;
    }

    private void m4123q() {
        if (this.f1927e == -1) {
            m4125s();
        }
    }

    private void m4124r() {
        if (this.f1933k == null) {
            m4125s();
        }
    }

    private void m4125s() {
        try {
            m4126t();
        } catch (ClassI e) {
            e.m3757a("...while parsing " + this.f1923a);
            throw e;
        } catch (RuntimeException e2) {
            ClassI c0974i = new ClassI(e2);
            c0974i.m3757a("...while parsing " + this.f1923a);
            throw c0974i;
        }
    }

    private void m4126t() {
        if (this.f1924b.m5436a() < 10) {
            throw new ClassI("severely truncated class file");
        }
        if (this.f1935m != null) {
            this.f1935m.m4195a(this.f1924b, 0, 0, "begin classfile");
            this.f1935m.m4195a(this.f1924b, 0, 4, "magic: " + ClassK.m5480a(m4142n()));
            this.f1935m.m4195a(this.f1924b, 4, 2, "minor_version: " + ClassK.m5485c(m4143o()));
            this.f1935m.m4195a(this.f1924b, 6, 2, "major_version: " + ClassK.m5485c(m4144p()));
        }
        if (this.f1925c) {
            if (!m4121a(m4142n())) {
                throw new ClassI("bad class file magic (" + ClassK.m5480a(m4142n()) + ")");
            }
            if (!m4122b(m4143o(), m4144p())) {
                throw new ClassI("unsupported class file version " + m4144p() + "." + m4143o());
            }
        }
        ClassA c0955a = new ClassA(this.f1924b);
        c0955a.m4094a(this.f1935m);
        this.f1926d = c0955a.m4095b();
        this.f1926d.mo3944c_();
        int iM4093a = c0955a.m4093a();
        int iM5446f = this.f1924b.m5446f(iM4093a);
        this.f1928f = (ae) this.f1926d.mo4971a(this.f1924b.m5446f(iM4093a + 2));
        this.f1929g = (ae) this.f1926d.mo4973b(this.f1924b.m5446f(iM4093a + 4));
        int iM5446f2 = this.f1924b.m5446f(iM4093a + 6);
        if (this.f1935m != null) {
            this.f1935m.m4195a(this.f1924b, iM4093a, 2, "access_flags: " + ClassA.m4726a(iM5446f));
            this.f1935m.m4195a(this.f1924b, iM4093a + 2, 2, "this_class: " + this.f1928f);
            this.f1935m.m4195a(this.f1924b, iM4093a + 4, 2, "super_class: " + m4120a(this.f1929g));
            this.f1935m.m4195a(this.f1924b, iM4093a + 6, 2, "interfaces_count: " + ClassK.m5485c(iM5446f2));
            if (iM5446f2 != 0) {
                this.f1935m.m4195a(this.f1924b, iM4093a + 8, 0, "interfaces:");
            }
        }
        int i = iM4093a + 8;
        this.f1930h = m4127a(i, iM5446f2);
        int i2 = (iM5446f2 * 2) + i;
        if (this.f1925c) {
            String strM5065i = this.f1928f.m4966i().m5065i();
            if (!this.f1923a.endsWith(".class") || !this.f1923a.startsWith(strM5065i) || this.f1923a.length() != strM5065i.length() + 6) {
                throw new ClassI("class name (" + strM5065i + ") does not match path (" + this.f1923a + ")");
            }
        }
        this.f1927e = iM5446f;
        ClassG c0962g = new ClassG(this, this.f1928f, i2, this.f1934l);
        c0962g.m4155a(this.f1935m);
        this.f1931i = c0962g.m4150a();
        ClassI c0964i = new ClassI(this, this.f1928f, c0962g.m4156d(), this.f1934l);
        c0964i.m4155a(this.f1935m);
        this.f1932j = c0964i.m4160a();
        ClassC c0958c = new ClassC(this, 0, c0964i.m4156d(), this.f1934l);
        c0958c.m4113a(this.f1935m);
        this.f1933k = c0958c.m4114b();
        this.f1933k.mo3944c_();
        int iM4112a = c0958c.m4112a();
        if (iM4112a != this.f1924b.m5436a()) {
            throw new ClassI("extra bytes at end of class file, at offset " + ClassK.m5480a(iM4112a));
        }
        if (this.f1935m != null) {
            this.f1935m.m4195a(this.f1924b, iM4112a, 0, "end classfile");
        }
    }

    public Interfacee m4127a(int i, int i2) {
        if (i2 == 0) {
            return ClassB.f3210a;
        }
        if (this.f1926d == null) {
            throw new IllegalStateException("pool not yet initialized");
        }
        return new ClassF(this.f1924b, i, i2, this.f1926d, this.f1935m);
    }

    public String m4128a() {
        return this.f1923a;
    }

    public void m4129a(ClassB c0957b) {
        if (c0957b == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.f1934l = c0957b;
    }

    public ClassE m4130b() {
        return this.f1924b;
    }

    public int m4131c() {
        m4123q();
        return m4142n();
    }

    @Override
    public int mo4132d() {
        m4123q();
        return this.f1927e;
    }

    public ae m4133e() {
        m4123q();
        return this.f1928f;
    }

    public ae m4134f() {
        m4123q();
        return this.f1929g;
    }

    public Interfaceb m4135g() {
        m4123q();
        return this.f1926d;
    }

    public Interfacee m4136h() {
        m4123q();
        return this.f1930h;
    }

    public Interfacee m4137i() {
        m4124r();
        return this.f1931i;
    }

    public Interfaceh m4138j() {
        m4124r();
        return this.f1932j;
    }

    public Interfaceb m4139k() {
        m4124r();
        return this.f1933k;
    }

    public ClassD m4140l() {
        ClassB c0888b = (ClassB) m4139k().mo4186a(AttBootstrapMethods.ATTRIBUTE_NAME);
        return c0888b != null ? c0888b.m3767b() : ClassD.f1855a;
    }

    @Override
    public ad mo4141m() {
        Interfacea interfaceC0966aMo4186a = m4139k().mo4186a(AttSourceFile.ATTRIBUTE_NAME);
        if (interfaceC0966aMo4186a instanceof ClassR) {
            return ((ClassR) interfaceC0966aMo4186a).m3781b();
        }
        return null;
    }

    public int m4142n() {
        return this.f1924b.m5442c(0);
    }

    public int m4143o() {
        return this.f1924b.m5446f(4);
    }

    public int m4144p() {
        return this.f1924b.m5446f(6);
    }
}
