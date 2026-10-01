package org.c.a.a.c.a.a.d;

import java.util.Iterator;
import java.util.ListIterator;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.ah;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ab;
import org.c.a.a.b.d.b.ae;
import org.c.a.a.b.d.b.ai;
import org.c.a.a.b.d.b.al;
import org.c.a.a.b.d.b.ClassJ;
import org.c.a.a.b.d.b.ClassQ;
import org.c.a.a.b.d.b.Interfacef;
import org.c.a.a.c.a.a.a.b.a.ClassB;
import org.c.a.a.c.a.a.a.b.a.Interfacee;
import org.c.a.a.c.a.a.a.b.b.ClassB;
import org.c.a.a.d.ClassC;

public class ClassO extends Abstracta {

    static final boolean f6230b;

    final ClassJ f6231a;

    static {
        f6230b = !ClassJ.class.desiredAssertionStatus();
    }

    protected ClassO(ClassJ c2188j) {
        this.f6231a = c2188j;
    }

    protected Abstractn m8660a(Abstractn abstractC1978n) {
        if (abstractC1978n.getClass() == ClassB.class) {
            ClassB c2107b = (ClassB) abstractC1978n;
            if (this.f6231a.f6218d.contains(c2107b.mo8033d())) {
                return new ClassQ(c2107b.mo7963f(), new ae(c2107b.mo7970e(), this.f6231a.f6217c), this.f6231a.f6217c.m8150g(), c2107b.mo8033d().substring(4), c2107b.mo7963f().mo8146e());
            }
            if (c2107b.mo8033d() != null && c2107b.mo8033d().startsWith("this$") && c2107b.mo7963f().mo8146e().equals(this.f6231a.f6217c.mo8146e())) {
                return new ClassQ(this.f6231a.f6217c, new ae(c2107b.mo7970e(), this.f6231a.f6217c), this.f6231a.f6217c.m8150g(), "this", this.f6231a.f6217c.mo8146e());
            }
        } else if (abstractC1978n.getClass() == ClassQ.class) {
            abstractC1978n.mo7957a(this);
        }
        return abstractC1978n;
    }

    @Override
    public void mo7764a(ac c1918ac) {
        m7839a(c1918ac.m7874g());
    }

    @Override
    public void mo7766a(ah c1923ah) {
        m7839a(c1923ah.m7891g());
    }

    @Override
    public void mo7770a(ClassI c1933i) {
        m7863e(((ClassB) c1933i).m8280f());
    }

    @Override
    public void mo7787a(ab c1954ab) {
        m7800a(c1954ab.m7966j());
        if (c1954ab.m7967l() != null) {
            Iterator it = ((ClassB) c1954ab.m7967l()).m8280f().iterator();
            while (it.hasNext()) {
                m7839a(((Interfacee) it.next()).m8297g());
            }
        }
    }

    @Override
    public void mo7794a(ai c1961ai) {
        if (c1961ai.m7980d() != null) {
            if (c1961ai.m7980d().mo7867j_()) {
                m8661a(c1961ai.m7980d().mo7868l_());
            } else {
                c1961ai.m7979a(m8660a((Abstractn) c1961ai.m7980d().mo7865h()));
            }
        }
    }

    @Override
    public void mo7804a(ClassJ c1974j) {
        if (!f6230b && c1974j.m8010d() == null) {
            throw new AssertionError();
        }
        if (!c1974j.m8010d().mo7867j_()) {
            c1974j.m8009a((Interfacef) null);
            return;
        }
        ClassC c2247cL_ = c1974j.m8010d().mo7868l_();
        c2247cL_.remove(0);
        if (!f6230b && c2247cL_.size() <= 0) {
            throw new AssertionError();
        }
        if (c2247cL_.size() == 1) {
            c1974j.m8009a(m8660a((Abstractn) c2247cL_.m8846h()));
        } else {
            m8661a(c2247cL_);
        }
    }

    @Override
    public void mo7809a(ClassQ c1981q) {
        if (this.f6231a.f6218d.contains(c1981q.m8021i())) {
            c1981q.m8017a(c1981q.m8021i().substring(4));
            c1981q.m8018a((Abstractn) null);
            return;
        }
        if (c1981q.m8019d() != null) {
            Class<?> cls = c1981q.m8019d().getClass();
            if (cls == ClassQ.class) {
                ClassQ c1981q2 = (ClassQ) c1981q.m8019d();
                if (c1981q2.m8021i().startsWith("this$") && c1981q2.m8022j().equals(this.f6231a.f6217c.mo8146e())) {
                    c1981q.m8018a(new ClassQ(this.f6231a.f6217c, new ae(c1981q2.mo7970e(), this.f6231a.f6217c), this.f6231a.f6217c.m8150g(), "this", this.f6231a.f6217c.mo8146e()));
                    return;
                }
                return;
            }
            if (cls == ClassB.class) {
                ClassB c2107b = (ClassB) c1981q.m8019d();
                if (c2107b.mo8033d() != null && c2107b.mo8033d().startsWith("this$") && c2107b.mo7963f().mo8146e().equals(this.f6231a.f6217c.mo8146e())) {
                    c1981q.m8018a(new ClassQ(this.f6231a.f6217c, new ae(c2107b.mo7970e(), this.f6231a.f6217c), this.f6231a.f6217c.m8150g(), "this", this.f6231a.f6217c.mo8146e()));
                    return;
                }
                return;
            }
            if (cls == al.class && c1981q.m8021i().startsWith("this$") && c1981q.mo7963f().mo8146e().equals(this.f6231a.f6217c.mo8146e())) {
                c1981q.m8018a(new ae(c1981q.m8019d().mo7970e(), this.f6231a.f6217c));
                c1981q.m8017a("this");
            }
        }
    }

    protected void m8661a(ClassC c2247c) {
        ListIterator listIterator = c2247c.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set(m8660a((Abstractn) listIterator.next()));
        }
    }
}
