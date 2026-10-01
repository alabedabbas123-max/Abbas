package org.c.a.a.c.a.a.a.b.a;

import java.util.List;
import org.c.a.a.b.a.ClassA;
import org.c.a.a.b.a.ClassD;
import org.c.a.a.b.d.a.ah;
import org.c.a.a.b.d.a.Interfacee;
import org.c.a.a.b.d.a.Interfacez;
import org.c.a.a.b.d.d.Interfaceb;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.d.ClassB;
import org.c.a.a.d.ClassC;

public class ClassM extends ah implements Interfacee {

    protected ClassB f6022c;

    protected ClassA f6023d;

    protected ClassD f6024e;

    protected int f6025f;

    public ClassM(ClassB c2094b, ClassA c1821a, ClassD c1877d, int i) {
        super(c1877d.m7686c(), null);
        this.f6025f = 0;
        this.f6022c = c2094b;
        this.f6023d = c1821a;
        this.f6024e = c1877d;
        this.f6025f = i;
    }

    @Override
    public int mo8296a() {
        return 0;
    }

    @Override
    public void mo8287a(int i) {
    }

    @Override
    public void mo8288a(Interfacee interfaceC1929e) {
    }

    @Override
    public void mo8289a(Interfaceb interfaceC2016b) {
        this.f5638b = interfaceC2016b;
    }

    public void m8305b(int i) {
        this.f6025f = i;
    }

    @Override
    public Interfacez mo7865h() {
        return (Interfacez) ClassB.m8841a(this);
    }

    @Override
    public ClassB mo8291j() {
        return this.f6022c;
    }

    @Override
    public boolean mo7867j_() {
        return false;
    }

    @Override
    public ClassA mo8292k() {
        return this.f6023d;
    }

    @Override
    public ClassC mo7868l_() {
        return ClassB.m8842b(this);
    }

    @Override
    public Interfacel mo8293o_() {
        return null;
    }

    @Override
    public int mo8269q_() {
        return this.f6025f;
    }

    @Override
    public ClassD mo8294r_() {
        return this.f6024e;
    }

    @Override
    public List mo8295s_() {
        return null;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public String toString() {
        return "ClassFileConstructorDeclaration{" + this.f5637a + ", firstLineNumber=" + this.f6025f + "}";
    }
}
