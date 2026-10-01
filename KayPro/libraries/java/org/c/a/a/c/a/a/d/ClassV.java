package org.c.a.a.c.a.a.d;

import java.util.Iterator;
import java.util.List;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.ah;
import org.c.a.a.b.d.a.ClassB;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.a.ClassJ;
import org.c.a.a.b.d.a.ClassK;
import org.c.a.a.b.d.a.ClassN;
import org.c.a.a.b.d.a.ClassQ;
import org.c.a.a.b.d.a.ClassV;
import org.c.a.a.b.d.a.Interfacel;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ai;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.c.a.a.a.b.a.ClassB;
import org.c.a.a.c.a.a.a.b.a.ClassD;
import org.c.a.a.c.a.a.a.b.a.Interfacek;
import org.c.a.a.c.a.a.c.ac;

public class ClassV extends Abstracta {

    protected ac f6246a;

    protected int f6247b;

    protected Interfacek f6248c;

    public ClassV(ac c2133ac) {
        this.f6246a = c2133ac;
    }

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
        List listM8280f = ((ClassB) c1933i).m8280f();
        this.f6248c = null;
        this.f6247b = 0;
        m7863e(listM8280f);
        if (this.f6247b != 1 || this.f6248c == null) {
            return;
        }
        listM8280f.remove(this.f6248c);
    }

    @Override
    public void mo7771a(ClassJ c1934j) {
        m7773a((Interfacel) c1934j.m7941e());
    }

    @Override
    public void mo7772a(ClassK c1935k) {
        if ((c1935k.m7904a() & 1024) == 0) {
            ClassD c2096d = (ClassD) c1935k;
            if (c2096d.m7908g().getClass() == ClassU.class) {
                ClassU c2035u = (ClassU) c2096d.m7908g();
                Iterator it = c2035u.iterator();
                while (it.hasNext()) {
                    Interfacer interfaceC2032r = (Interfacer) it.next();
                    if (interfaceC2032r.getClass() == ClassH.class) {
                        Abstractn abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
                        if (abstractC1978nM8093b.getClass() == ai.class && "()V".equals(((ai) abstractC1978nM8093b).m8012i())) {
                            it.remove();
                            break;
                        }
                    }
                }
                if (c2035u.isEmpty()) {
                    ClassB c2094bMo8291j = c2096d.mo8291j();
                    if (c2094bMo8291j.m8283j() != null) {
                        int size = c2094bMo8291j.m8283j().size();
                        if (c2094bMo8291j.m8282i() != null) {
                            size++;
                        }
                        if (this.f6246a.m8418b(c2096d.m7907f()).size() == size) {
                            this.f6248c = c2096d;
                        }
                    } else if (c2094bMo8291j.m8282i() == null) {
                        if (c2096d.m7907f().equals("()V")) {
                            this.f6248c = c2096d;
                        }
                    } else if (c2096d.m7907f().equals("(L" + c2094bMo8291j.m8282i().m8150g() + ";)V")) {
                        this.f6248c = c2096d;
                    }
                }
            }
            this.f6247b++;
        }
    }

    @Override
    public void mo7774a(ClassN c1938n) {
        m7773a((Interfacel) c1938n.m7913c());
    }

    @Override
    public void mo7777a(ClassQ c1941q) {
    }

    @Override
    public void mo7782a(ClassV c1946v) {
        m7773a((Interfacel) c1946v.m7941e());
    }
}
