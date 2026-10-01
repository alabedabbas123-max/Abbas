package org.c.a.a.c.a.a.a.b.a;

import java.util.List;
import org.c.a.a.b.a.ClassA;
import org.c.a.a.b.a.ClassD;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.Interfacee;
import org.c.a.a.b.d.c.Interfaced;
import org.c.a.a.b.d.c.Interfaceg;
import org.c.a.a.b.d.d.Interfaceb;
import org.c.a.a.b.d.e.Interfaced;
import org.c.a.a.b.d.e.Interfacef;
import org.c.a.a.b.d.e.Interfacel;

public class ClassL extends ac implements Interfacee {

    protected ClassB f6017k;

    protected ClassA f6018l;

    protected ClassD f6019m;

    protected List f6020n;

    protected int f6021o;

    public ClassL(ClassB c2094b, ClassA c1821a, ClassD c1877d, Interfaced interfaceC1994d, String str, Interfacef interfaceC2046f, Interfacel interfaceC2052l, List list, Interfaced interfaceC2044d, Interfaceg interfaceC1997g, int i) {
        super(interfaceC1994d, c1877d.m7683a(), str, interfaceC2046f, interfaceC2052l, null, interfaceC2044d, c1877d.m7686c(), null, interfaceC1997g);
        this.f6017k = c2094b;
        this.f6018l = c1821a;
        this.f6020n = list;
        this.f6019m = c1877d;
        this.f6021o = i;
    }

    @Override
    public void mo8287a(int i) {
        this.f5614b = i;
    }

    @Override
    public void mo8288a(Interfacee interfaceC1929e) {
        this.f5618f = interfaceC1929e;
    }

    @Override
    public void mo8289a(Interfaceb interfaceC2016b) {
        this.f5621i = interfaceC2016b;
    }

    @Override
    public ClassB mo8291j() {
        return this.f6017k;
    }

    @Override
    public ClassA mo8292k() {
        return this.f6018l;
    }

    @Override
    public int mo8269q_() {
        return this.f6021o;
    }

    @Override
    public ClassD mo8294r_() {
        return this.f6019m;
    }

    @Override
    public List mo8295s_() {
        return this.f6020n;
    }

    @Override
    public String toString() {
        return "ClassFileMethodDeclaration{" + this.f5615c + " " + this.f5620h + ", firstLineNumber=" + this.f6021o + "}";
    }
}
