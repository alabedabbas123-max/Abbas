package org.c.a.a.c.a.a.d;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.Abstractai;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.ah;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.a.ClassK;
import org.c.a.a.b.d.a.ClassV;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ab;
import org.c.a.a.b.d.b.al;
import org.c.a.a.b.d.b.Interfacef;
import org.c.a.a.b.d.d.ah;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.c.a.a.a.b.a.ClassB;
import org.c.a.a.c.a.a.a.b.a.ClassC;
import org.c.a.a.c.a.a.a.b.b.ClassB;
import org.c.a.a.d.ClassC;

public class ClassL extends Abstracta {

    protected ClassB f6219a;

    protected HashMap f6220b = new HashMap();

    protected ClassC f6221c = new ClassC();

    protected HashSet f6222d = new HashSet();

    protected int f6223e;

    final ClassJ f6224f;

    protected ClassL(ClassJ c2188j) {
        this.f6224f = c2188j;
    }

    @Override
    public void mo7764a(ac c1918ac) {
        this.f6220b.clear();
        this.f6221c.clear();
        m7839a(c1918ac.m7874g());
        if (!this.f6220b.isEmpty()) {
            ClassN c2192n = new ClassN(this);
            c1918ac.m7874g().mo8055a(c2192n);
            if (c1918ac.m7878t_() != null) {
                c1918ac.m7878t_().mo7869a(c2192n);
            }
        }
        if (this.f6221c.isEmpty()) {
            return;
        }
        Collections.sort(this.f6221c, ClassJ.f6214e);
        c1918ac.mo7869a(new ClassM(this));
    }

    @Override
    public void mo7766a(ah c1923ah) {
        this.f6220b.clear();
        this.f6221c.clear();
        m7839a(c1923ah.m7891g());
        if (!this.f6220b.isEmpty()) {
            c1923ah.m7891g().mo8055a(new ClassN(this));
        }
        if (this.f6221c.isEmpty()) {
            return;
        }
        Collections.sort(this.f6221c, ClassJ.f6214e);
        c1923ah.mo7869a(new ClassM(this));
    }

    @Override
    public void mo7770a(ClassI c1933i) {
        this.f6219a = (ClassB) c1933i;
        m7863e(this.f6219a.m8280f());
    }

    @Override
    public void mo7772a(ClassK c1935k) {
        this.f6220b.clear();
        this.f6221c.clear();
        m7839a(c1935k.m7908g());
        if (!this.f6220b.isEmpty()) {
            ClassN c2192n = new ClassN(this);
            c1935k.m7908g().mo8055a(c2192n);
            if (c1935k.m7910p_() != null) {
                c1935k.m7910p_().mo7869a(c2192n);
            }
        }
        if (this.f6221c.isEmpty()) {
            return;
        }
        Collections.sort(this.f6221c, ClassJ.f6214e);
        c1935k.mo7869a(new ClassM(this));
    }

    @Override
    public void mo7787a(ab c1954ab) {
        ClassB c2094b;
        Interfacef interfaceC1970fM7966j;
        if (this.f6222d.contains(c1954ab)) {
            return;
        }
        this.f6222d.add(c1954ab);
        if (c1954ab.m7967l() == null) {
            ClassI c2049iM7964g = c1954ab.m7964g();
            String strM8150g = c2049iM7964g.m8150g();
            ClassV c1946v = (ClassV) this.f6219a.m8270a(strM8150g);
            if (c1946v != null) {
                c2094b = (ClassB) c1946v.m7941e();
                if (c2049iM7964g.m8151i() == null && c2049iM7964g.m8152j() != null) {
                    ClassC c2095c = (ClassC) c1946v;
                    c2095c.m8286a(c2095c.m7893k() & (-4097));
                    this.f6221c.add(c2095c);
                    this.f6219a.m8275b(strM8150g);
                    this.f6223e = c1954ab.mo7970e();
                }
            } else {
                c2094b = null;
            }
        } else {
            c2094b = (ClassB) c1954ab.m7967l();
        }
        if (c2094b == null || (interfaceC1970fM7966j = c1954ab.m7966j()) == null) {
            return;
        }
        ClassC c2247cM8283j = c2094b.m8283j();
        if (!interfaceC1970fM7966j.mo7867j_()) {
            if (interfaceC1970fM7966j.getClass() == ClassB.class) {
                if (c2247cM8283j != null) {
                    c1954ab.m7960a((Interfacef) null);
                    this.f6220b.put(((ClassB) interfaceC1970fM7966j).m8306g().mo8337g(), ((String) c2247cM8283j.get(0)).substring(4));
                    return;
                }
                return;
            }
            if (interfaceC1970fM7966j.getClass() != al.class || c2094b.m8282i() == null) {
                return;
            }
            c1954ab.m7960a((Interfacef) null);
            return;
        }
        ClassC c2247cL_ = interfaceC1970fM7966j.mo7868l_();
        if (c2094b.m8282i() != null) {
            c2247cL_.remove(0);
        }
        if (c2247cM8283j != null) {
            int size = c2247cL_.size();
            List<Abstractn> listSubList = c2247cL_.subList(size - c2247cM8283j.size(), size);
            Iterator it = c2247cM8283j.iterator();
            for (Abstractn abstractC1978n : listSubList) {
                String str = (String) it.next();
                if (abstractC1978n.getClass() == ClassB.class) {
                    this.f6220b.put(((ClassB) abstractC1978n).m8306g().mo8337g(), str.substring(4));
                }
            }
            listSubList.clear();
        }
    }

    @Override
    public void mo7855a(ClassU c2035u) {
        if (c2035u.isEmpty()) {
            return;
        }
        ListIterator listIterator = c2035u.listIterator();
        while (listIterator.hasNext()) {
            ((Interfacer) listIterator.next()).mo8055a(this);
            if (this.f6223e == 0 && !this.f6221c.isEmpty()) {
                listIterator.previous();
                Iterator it = this.f6221c.iterator();
                while (it.hasNext()) {
                    listIterator.add(new ah((Abstractai) it.next()));
                }
                this.f6221c.clear();
                listIterator.next();
            }
        }
    }
}
