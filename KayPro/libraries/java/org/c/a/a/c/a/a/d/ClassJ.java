package org.c.a.a.c.a.a.d;

import java.util.Iterator;
import org.c.a.a.b.a.ClassA;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.ah;
import org.c.a.a.b.d.a.ClassB;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.a.ClassJ;
import org.c.a.a.b.d.a.ClassK;
import org.c.a.a.b.d.a.ClassN;
import org.c.a.a.b.d.a.ClassV;
import org.c.a.a.b.d.a.Interfacee;
import org.c.a.a.b.d.a.Interfacel;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ai;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.b.ClassJ;
import org.c.a.a.b.d.b.ClassQ;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.c.a.a.a.b.a.ClassB;
import org.c.a.a.c.a.a.a.b.a.ClassD;
import org.c.a.a.d.ClassC;

public class ClassJ extends Abstracta {

    static final ClassK f6214e = new ClassK();

    protected ClassI f6217c;

    protected ClassO f6215a = new ClassO(this);

    protected ClassL f6216b = new ClassL(this);

    protected ClassC f6218d = new ClassC();

    @Override
    public void mo7764a(ac c1918ac) {
    }

    @Override
    public void mo7766a(ah c1923ah) {
    }

    @Override
    public void mo7768a(ClassB c1926b) {
        m7773a((Interfacel) c1926b.m7897b());
    }

    @Override
    public void mo7770a(ClassI c1933i) {
        ClassB c2094b = (ClassB) c1933i;
        this.f6217c = null;
        this.f6218d.clear();
        m7863e(c2094b.m8280f());
        c2094b.m8273a(this.f6217c);
        c2094b.m8274a(this.f6218d.isEmpty() ? null : new ClassC(this.f6218d));
        if (this.f6217c != null || !this.f6218d.isEmpty()) {
            this.f6215a.mo7770a((ClassI) c2094b);
        }
        if (c2094b.m8281g() != null) {
            this.f6216b.mo7770a((ClassI) c2094b);
        }
    }

    @Override
    public void mo7771a(ClassJ c1934j) {
        m7773a((Interfacel) c1934j.m7941e());
    }

    @Override
    public void mo7772a(ClassK c1935k) {
        boolean z;
        ClassD c2096d = (ClassD) c1935k;
        this.f6218d.clear();
        if (c2096d.m7908g().mo7867j_()) {
            Iterator it = c2096d.m7908g().mo7868l_().iterator();
            while (it.hasNext()) {
                Interfacer interfaceC2032r = (Interfacer) it.next();
                if (interfaceC2032r.getClass() == ClassH.class) {
                    Abstractn abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
                    Class<?> cls = abstractC1978nM8093b.getClass();
                    if (cls == ai.class || cls == ClassJ.class) {
                        break;
                    }
                    if (cls == ClassG.class) {
                        ClassG c1971g = (ClassG) abstractC1978nM8093b;
                        Abstractn abstractC1978nM8000d = c1971g.m8000d();
                        if (abstractC1978nM8000d.getClass() == ClassQ.class) {
                            String strM8021i = ((ClassQ) abstractC1978nM8000d).m8021i();
                            if (strM8021i.startsWith("this$")) {
                                this.f6217c = (ClassI) c1971g.m8003j().mo7963f();
                            } else if (strM8021i.startsWith("val$")) {
                                this.f6218d.add(strM8021i);
                            }
                        }
                    }
                }
                it.remove();
            }
        }
        Interfacee interfaceC1929eP_ = c2096d.m7910p_();
        if (interfaceC1929eP_ != null) {
            if (interfaceC1929eP_.mo7867j_()) {
                ClassC c2247cL_ = interfaceC1929eP_.mo7868l_();
                if (this.f6217c != null) {
                    c2247cL_.remove(0);
                }
                int size = this.f6218d.size();
                if (size > 0) {
                    int size2 = c2247cL_.size();
                    c2247cL_.subList(size2 - size, size2).clear();
                }
            } else if (this.f6217c != null) {
                c2096d.mo8288a((Interfacee) null);
            }
        }
        ClassA c1821aM7591i = c2096d.mo8292k().m7591i();
        if (c1821aM7591i != null) {
            String strM7586d = c1821aM7591i.m7586d();
            String strM7586d2 = c2096d.mo8292k().m7586d();
            int length = strM7586d2.startsWith(new StringBuilder(String.valueOf(strM7586d)).append('$').toString()) ? strM7586d.length() + 1 : strM7586d2.lastIndexOf(36) + 1;
            if (Character.isDigit(strM7586d2.charAt(length))) {
                int length2 = strM7586d2.length();
                while (true) {
                    length2--;
                    if (length2 <= length) {
                        z = true;
                        break;
                    } else if (!Character.isDigit(strM7586d2.charAt(length2))) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    c2096d.mo8287a(c2096d.m7904a() | 4096);
                }
            }
        }
    }

    @Override
    public void mo7774a(ClassN c1938n) {
        m7773a((Interfacel) c1938n.m7913c());
    }

    @Override
    public void mo7782a(ClassV c1946v) {
        m7773a((Interfacel) c1946v.m7941e());
    }
}
