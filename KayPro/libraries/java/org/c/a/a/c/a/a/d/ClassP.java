package org.c.a.a.c.a.a.d;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.ac;
import org.c.a.a.b.d.a.ah;
import org.c.a.a.b.d.a.ClassB;
import org.c.a.a.b.d.a.ClassI;
import org.c.a.a.b.d.a.ClassJ;
import org.c.a.a.b.d.a.ClassK;
import org.c.a.a.b.d.a.ClassN;
import org.c.a.a.b.d.a.ClassP;
import org.c.a.a.b.d.a.ClassQ;
import org.c.a.a.b.d.a.ClassR;
import org.c.a.a.b.d.a.ClassV;
import org.c.a.a.b.d.a.Interfacel;
import org.c.a.a.b.d.b.Abstractn;
import org.c.a.a.b.d.b.ab;
import org.c.a.a.b.d.b.ai;
import org.c.a.a.b.d.b.al;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.b.ClassJ;
import org.c.a.a.b.d.b.ClassQ;
import org.c.a.a.b.d.b.ClassW;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.ClassU;
import org.c.a.a.b.d.d.Interfaceb;
import org.c.a.a.b.d.d.Interfacer;
import org.c.a.a.c.a.a.a.b.a.ClassB;
import org.c.a.a.c.a.a.a.b.a.ClassD;
import org.c.a.a.c.a.a.a.b.a.ClassH;
import org.c.a.a.d.ClassC;

public class ClassP extends Abstracta {

    protected ClassX f6232a = new ClassX();

    protected HashMap f6233b = new HashMap();

    protected ClassC f6234c = new ClassC();

    protected ClassC f6235d = new ClassC();

    protected boolean f6236e;

    protected ai m8662a(ListIterator listIterator) {
        while (listIterator.hasNext()) {
            Interfacer interfaceC2032r = (Interfacer) listIterator.next();
            if (interfaceC2032r.getClass() == ClassH.class) {
                Abstractn abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
                Class<?> cls = abstractC1978nM8093b.getClass();
                if (cls == ai.class) {
                    return (ai) abstractC1978nM8093b;
                }
                if (cls == ClassJ.class) {
                    break;
                }
            }
        }
        return null;
    }

    protected void m8663a() {
        int size = this.f6235d.size();
        if (size > 0) {
            for (ClassG c1971g : this.f6235d) {
                ClassR c1942r = (ClassR) this.f6233b.get(((ClassQ) c1971g.m8000d()).m8021i());
                if (c1942r != null) {
                    Abstractn abstractC1978nM8003j = c1971g.m8003j();
                    c1942r.m7926a(new ClassP(abstractC1978nM8003j));
                    ((ClassH) c1942r.m7928d()).m8303b(abstractC1978nM8003j.mo7970e());
                }
            }
            for (ClassQ c2195q : this.f6234c) {
                c2195q.f6238b.subList(c2195q.f6239c, c2195q.f6239c + size).clear();
                if (c2195q.f6238b.isEmpty()) {
                    c2195q.f6237a.mo8289a((Interfaceb) null);
                    c2195q.f6237a.m8290b(0);
                } else {
                    this.f6232a.m8675a();
                    this.f6232a.mo7855a(c2195q.f6238b);
                    int iM8676b = this.f6232a.m8676b();
                    c2195q.f6237a.m8290b(iM8676b == -1 ? 0 : iM8676b);
                }
            }
        }
    }

    protected void m8664a(String str, int i, ListIterator listIterator) {
        Abstractn abstractC1978nM8093b;
        int iMo7970e;
        HashSet hashSet = new HashSet();
        while (true) {
            if (!listIterator.hasNext()) {
                abstractC1978nM8093b = null;
                break;
            }
            Interfacer interfaceC2032r = (Interfacer) listIterator.next();
            if (interfaceC2032r.getClass() == ClassH.class) {
                abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
                if (abstractC1978nM8093b.getClass() != ClassG.class) {
                    break;
                }
                ClassG c1971g = (ClassG) abstractC1978nM8093b;
                if (!c1971g.m8002i().equals("=") || c1971g.m8000d().getClass() != ClassQ.class) {
                    break;
                }
                ClassQ c1981q = (ClassQ) c1971g.m8000d();
                if (!c1981q.m8020g().equals(str) || c1981q.m8019d().getClass() != al.class) {
                    break;
                }
                String strM8021i = c1981q.m8021i();
                if (!hashSet.contains(strM8021i)) {
                    this.f6236e = false;
                    c1971g.m8003j().mo7957a(this);
                    if (this.f6236e) {
                        break;
                    }
                    this.f6235d.add(c1971g);
                    hashSet.add(strM8021i);
                } else {
                    break;
                }
            } else {
                abstractC1978nM8093b = null;
                break;
            }
        }
        if (abstractC1978nM8093b == null) {
            iMo7970e = i == 0 ? 0 : i + 1;
        } else {
            iMo7970e = abstractC1978nM8093b.mo7970e();
        }
        if (i < iMo7970e) {
            Iterator it = this.f6235d.iterator();
            int i2 = iMo7970e;
            while (it.hasNext()) {
                if (i <= ((ClassG) it.next()).mo7970e() && i2 <= i2) {
                    int i3 = i2 == i2 ? i2 + 1 : i2;
                    it.remove();
                    i2 = i3;
                }
            }
        }
    }

    protected void m8665a(String str, ListIterator listIterator) {
        int i;
        Iterator it = this.f6235d.iterator();
        int i2 = 0;
        while (true) {
            i = i2;
            if (!listIterator.hasNext() || !it.hasNext()) {
                break;
            }
            Interfacer interfaceC2032r = (Interfacer) listIterator.next();
            if (interfaceC2032r.getClass() != ClassH.class) {
                break;
            }
            Abstractn abstractC1978nM8093b = ((ClassH) interfaceC2032r).m8093b();
            if (abstractC1978nM8093b.getClass() != ClassG.class) {
                break;
            }
            ClassG c1971g = (ClassG) abstractC1978nM8093b;
            if (!c1971g.m8002i().equals("=") || c1971g.m8000d().getClass() != ClassQ.class) {
                break;
            }
            ClassQ c1981q = (ClassQ) c1971g.m8000d();
            if (!c1981q.m8020g().equals(str)) {
                break;
            }
            ClassG c1971g2 = (ClassG) it.next();
            if (c1971g.mo7970e() != c1971g2.mo7970e()) {
                break;
            }
            if (!c1981q.m8021i().equals(((ClassQ) c1971g2.m8000d()).m8021i())) {
                break;
            } else {
                i2 = i + 1;
            }
        }
        if (i < this.f6235d.size()) {
            this.f6235d.subList(i, this.f6235d.size()).clear();
        }
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
        ClassB c2094b = (ClassB) c1933i;
        this.f6233b.clear();
        this.f6234c.clear();
        this.f6235d.clear();
        m7863e(c2094b.m8279e());
        m7863e(c2094b.m8280f());
        m8663a();
    }

    @Override
    public void mo7771a(ClassJ c1934j) {
        m7773a((Interfacel) c1934j.m7941e());
    }

    @Override
    public void mo7772a(ClassK c1935k) {
        ClassU c2035u;
        ListIterator listIterator;
        ai c1961aiM8662a;
        ClassD c2096d = (ClassD) c1935k;
        if (c2096d.m7908g().getClass() != ClassU.class || (c1961aiM8662a = m8662a((listIterator = (c2035u = (ClassU) c2096d.m7908g()).listIterator()))) == null) {
            return;
        }
        String strM7586d = c2096d.mo8292k().m7586d();
        this.f6234c.add(new ClassQ(c2096d, c2035u, listIterator.nextIndex()));
        if (this.f6234c.size() == 1) {
            m8664a(strM7586d, c1961aiM8662a.m8012i().equals("()V") ? 0 : c1961aiM8662a.mo7970e(), listIterator);
        } else {
            m8665a(strM7586d, listIterator);
        }
    }

    @Override
    public void mo7774a(ClassN c1938n) {
        m7773a((Interfacel) c1938n.m7913c());
    }

    @Override
    public void mo7777a(ClassQ c1941q) {
        if ((c1941q.m7922a() & 8) == 0) {
            c1941q.m7925d().mo7869a(this);
        }
    }

    @Override
    public void mo7778a(ClassR c1942r) {
        this.f6233b.put(c1942r.m7929e(), c1942r);
    }

    @Override
    public void mo7782a(ClassV c1946v) {
        m7773a((Interfacel) c1946v.m7941e());
    }

    @Override
    public void mo7787a(ab c1954ab) {
        m7800a(c1954ab.m7966j());
    }

    @Override
    public void mo7815a(ClassW c1987w) {
        this.f6236e = true;
    }
}
