package org.c.a.a.c.d.b;

import org.c.a.a.c.d.c.Abstracta;
import org.c.a.a.c.d.c.Abstractb;

public class ClassA {

    protected Abstracta f6373a;

    protected Abstracta f6374b;

    protected Abstractb f6375c;

    protected Abstractb f6376d;

    public Abstracta m8816a() {
        if (this.f6373a == null) {
            this.f6373a = new ClassB(this);
        }
        return this.f6373a;
    }

    public Abstracta m8817b() {
        if (this.f6374b == null) {
            this.f6374b = new ClassC(this);
        }
        return this.f6374b;
    }

    public Abstractb m8818c() {
        if (this.f6375c == null) {
            this.f6375c = new ClassD(this);
        }
        return this.f6375c;
    }

    public Abstractb m8819d() {
        if (this.f6376d == null) {
            this.f6376d = new ClassE(this);
        }
        return this.f6376d;
    }
}
