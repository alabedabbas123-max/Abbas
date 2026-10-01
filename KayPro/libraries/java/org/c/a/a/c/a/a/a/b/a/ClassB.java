package org.c.a.a.c.a.a.a.b.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.c.a.a.b.d.a.Abstractai;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.a.Interfaceg;
import org.c.a.a.b.d.a.Interfacez;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.d.ClassB;
import org.c.a.a.d.ClassC;

public class ClassB extends ClassI implements Interfacek {

    protected List f5998c;

    protected List f5999d;

    protected List f6000e;

    protected Map f6001f;

    protected int f6002g;

    protected ClassI f6003h;

    protected ClassC f6004i;

    protected ClassB f6005j;

    public ClassB(String str, ClassB c2094b) {
        super(str, null);
        this.f6001f = Collections.emptyMap();
        this.f6005j = c2094b;
    }

    public Interfacek m8270a(String str) {
        Interfacek interfaceC2103k = (Interfacek) this.f6001f.get(str);
        return (interfaceC2103k != null || this.f6005j == null) ? interfaceC2103k : this.f6005j.m8270a(str);
    }

    public void m8271a(List list) {
        if (list != null) {
            this.f5998c = list;
            m8278d(list);
        }
    }

    public void m8272a(Interfaceg interfaceC1931g) {
        this.f5647b = interfaceC1931g;
    }

    public void m8273a(ClassI c2049i) {
        this.f6003h = c2049i;
    }

    public void m8274a(ClassC c2247c) {
        this.f6004i = c2247c;
    }

    public Interfacek m8275b(String str) {
        Interfacek interfaceC2103k = (Interfacek) this.f6001f.remove(str);
        this.f6000e.remove(interfaceC2103k);
        return interfaceC2103k;
    }

    public void m8276b(List list) {
        if (list != null) {
            this.f5999d = list;
            m8278d(list);
        }
    }

    public void m8277c(List list) {
        if (list != null) {
            this.f6000e = list;
            m8278d(list);
            this.f6001f = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Interfacez interfaceC1950z = (Interfacek) it.next();
                this.f6001f.put(((Abstractai) interfaceC1950z).m7894l(), interfaceC1950z);
            }
        }
    }

    protected void m8278d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iMo8269q_ = ((Interfacek) it.next()).mo8269q_();
            if (iMo8269q_ > 0) {
                if (this.f6002g == 0) {
                    this.f6002g = iMo8269q_;
                    return;
                } else {
                    if (this.f6002g > iMo8269q_) {
                        this.f6002g = iMo8269q_;
                        return;
                    }
                    return;
                }
            }
        }
    }

    public List m8279e() {
        return this.f5998c;
    }

    public List m8280f() {
        return this.f5999d;
    }

    public List m8281g() {
        return this.f6000e;
    }

    public ClassI m8282i() {
        return this.f6003h;
    }

    public ClassC m8283j() {
        return this.f6004i;
    }

    @Override
    public boolean mo7867j_() {
        return false;
    }

    public ClassB m8284k() {
        return this.f6005j;
    }

    @Override
    public Interfacez mo7865h() {
        return this;
    }

    @Override
    public ClassC mo7868l_() {
        return ClassB.m8842b(this);
    }

    @Override
    public int mo8269q_() {
        return this.f6002g;
    }

    @Override
    public int size() {
        return 1;
    }

    public String toString() {
        return "ClassFileBodyDeclaration{firstLineNumber=" + this.f6002g + "}";
    }
}
