package org.c.a.a.c.a.a.a.c;

import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.d.ClassC;

public abstract class Abstracta implements Interfacef {

    static final boolean f6039j;

    protected ClassB f6040a;

    protected Abstracta f6041b;

    protected boolean f6042c;

    protected int f6043d;

    protected int f6044e;

    protected int f6045f;

    protected String f6046g;

    protected int f6047h;

    protected ClassC f6048i = new ClassC();

    static {
        f6039j = !Abstracta.class.desiredAssertionStatus();
    }

    public Abstracta(int i, int i2, int i3) {
        this.f6042c = i2 == 0;
        this.f6043d = i;
        this.f6044e = i2;
        this.f6045f = i2;
        this.f6047h = i3;
    }

    public Abstracta(int i, int i2, String str, int i3) {
        this.f6042c = i2 == 0;
        this.f6043d = i;
        this.f6044e = i2;
        this.f6045f = i2;
        this.f6046g = str;
        this.f6047h = i3;
    }

    public Abstracta(int i, int i2, String str, int i3, boolean z) {
        this.f6042c = z;
        this.f6043d = i;
        this.f6044e = i2;
        this.f6045f = i2;
        this.f6046g = str;
        this.f6047h = i3;
    }

    public ClassB m8318a() {
        return this.f6040a;
    }

    public void m8319a(int i) {
        if (!f6039j && i > this.f6045f) {
            throw new AssertionError();
        }
        this.f6044e = i;
    }

    public void m8320a(String str) {
        this.f6046g = str;
    }

    public void m8321a(Abstracta abstractC2115a) {
        this.f6041b = abstractC2115a;
    }

    public void m8322a(ClassB c2116b) {
        this.f6040a = c2116b;
    }

    public void m8323a(Interfaceg interfaceC2121g) {
        this.f6048i.add(interfaceC2121g);
    }

    public void m8324a(boolean z) {
        this.f6042c = z;
    }

    public abstract boolean mo8325a(Interfacel interfaceC2052l);

    public Abstracta m8326b() {
        return this.f6041b;
    }

    public void m8327b(int i) {
        if (this.f6044e > i) {
            this.f6044e = i;
        }
        if (this.f6045f < i) {
            this.f6045f = i;
        }
    }

    public abstract void mo8328b(Interfacel interfaceC2052l);

    public abstract boolean mo8329b(Abstracta abstractC2115a);

    public abstract void mo8330c(Interfacel interfaceC2052l);

    public abstract void mo8331c(Abstracta abstractC2115a);

    public boolean m8332c() {
        return this.f6042c;
    }

    public int m8333d() {
        return this.f6043d;
    }

    public abstract void mo8334d(Abstracta abstractC2115a);

    public int m8335e() {
        return this.f6044e;
    }

    public int m8336f() {
        return this.f6045f;
    }

    @Override
    public String mo8337g() {
        return this.f6046g;
    }

    public int m8338h() {
        return this.f6047h;
    }

    public ClassC m8339i() {
        return this.f6048i;
    }
}
