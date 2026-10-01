package org.c.a.a.c.a.a.d;

import java.util.HashSet;
import org.c.a.a.b.d.Abstracta;
import org.c.a.a.b.d.a.Interfacel;
import org.c.a.a.b.d.b.ClassG;
import org.c.a.a.b.d.d.ac;
import org.c.a.a.b.d.d.ae;
import org.c.a.a.b.d.d.ai;
import org.c.a.a.b.d.d.ClassG;
import org.c.a.a.b.d.d.ClassH;
import org.c.a.a.b.d.d.ClassI;
import org.c.a.a.b.d.d.ClassJ;
import org.c.a.a.b.d.d.ClassK;
import org.c.a.a.b.d.d.ClassL;
import org.c.a.a.b.d.d.ClassN;
import org.c.a.a.b.d.d.ClassV;
import org.c.a.a.c.a.a.a.b.b.ClassB;
import org.c.a.a.c.a.a.a.c.Abstracta;

public class ClassZ extends Abstracta {

    protected HashSet f6257a = new HashSet();

    protected boolean f6258b;

    public void m8678a() {
        this.f6257a.clear();
        this.f6258b = false;
    }

    @Override
    public void mo7801a(ClassG c1971g) {
        if (c1971g.m8000d().getClass() == ClassB.class && c1971g.m8002i().equals("=")) {
            Abstracta abstractC2115aM8306g = ((ClassB) c1971g.m8000d()).m8306g();
            if (!abstractC2115aM8306g.m8332c()) {
                this.f6257a.add(abstractC2115aM8306g);
            }
        }
        c1971g.m8000d().mo7957a(this);
        c1971g.m8003j().mo7957a(this);
    }

    @Override
    public void mo7832a(ac c2009ac) {
        c2009ac.m8061b().mo7957a(this);
    }

    @Override
    public void mo7834a(ae c2011ae) {
    }

    @Override
    public void mo7838a(ai c2015ai) {
        c2015ai.m8083b().mo7957a(this);
    }

    @Override
    public void mo7844a(ClassG c2021g) {
        m7800a(c2021g.m8090b());
    }

    @Override
    public void mo7845a(ClassH c2022h) {
        this.f6258b = (c2022h.m8093b().mo7970e() > 0) | this.f6258b;
        c2022h.m8093b().mo7957a(this);
    }

    @Override
    public void mo7846a(ClassI c2023i) {
        c2023i.m8097e().mo7957a(this);
    }

    @Override
    public void mo7847a(ClassJ c2024j) {
        m7773a((Interfacel) c2024j.m8102b());
        m7800a(c2024j.m8104d());
        m7800a(c2024j.m8105e());
        m7800a(c2024j.m8106f());
    }

    @Override
    public void mo7848a(ClassK c2025k) {
        c2025k.m8110d().mo7957a(this);
    }

    @Override
    public void mo7849a(ClassL c2026l) {
        c2026l.m8110d().mo7957a(this);
    }

    @Override
    public void mo7851a(ClassN c2028n) {
        this.f6258b = (c2028n.m8115b().mo7970e() > 0) | this.f6258b;
        c2028n.m8115b().mo7957a(this);
    }

    @Override
    public void mo7856a(ClassV c2036v) {
        c2036v.m8123b().mo7957a(this);
    }

    public HashSet m8679b() {
        return this.f6257a;
    }

    public boolean m8680c() {
        return this.f6258b;
    }
}
