package com.a.b.c.c;

import com.baidu.mobstat.Config;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractv;
import com.a.b.e.c.ae;
import com.a.b.e.c.ah;
import com.a.b.e.c.ClassD;
import com.a.b.e.c.ClassE;
import com.a.b.g.ClassH;
import com.a.b.g.Interfacea;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public final class ClassK extends Abstractat {

    private final ae f2457a;

    private final ArrayList f2458b;

    private final HashMap f2459c;

    private final ArrayList f2460d;

    private final ArrayList f2461e;

    private final ArrayList f2462f;

    private ClassD f2463g;

    private byte[] f2464h;

    public ClassK(ae c1205ae) {
        super(1, -1);
        if (c1205ae == null) {
            throw new NullPointerException("thisClass == null");
        }
        this.f2457a = c1205ae;
        this.f2458b = new ArrayList(20);
        this.f2459c = new HashMap(40);
        this.f2460d = new ArrayList(20);
        this.f2461e = new ArrayList(20);
        this.f2462f = new ArrayList(20);
        this.f2463g = null;
    }

    private static void m4608a(ClassT c1113t, Interfacea interfaceC1303a, String str, int i) {
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5404a(String.format("  %-21s %08x", String.valueOf(str) + "_size:", Integer.valueOf(i)));
        }
        interfaceC1303a.mo5458e(i);
    }

    private static void m4609a(ClassT c1113t, Interfacea interfaceC1303a, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (interfaceC1303a.mo5405a()) {
            interfaceC1303a.mo5403a(0, "  " + str + Config.TRACE_TODAY_VISIT_SPLIT);
        }
        int iMo4691a = 0;
        for (int i = 0; i < size; i++) {
            iMo4691a = ((Abstractx) arrayList.get(i)).mo4691a(c1113t, interfaceC1303a, iMo4691a, i);
        }
    }

    private void m4610b(ClassT c1113t, Interfacea interfaceC1303a) {
        boolean zMo5405a = interfaceC1303a.mo5405a();
        if (zMo5405a) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4525g()) + " class data for " + this.f2457a.mo3828d());
        }
        m4608a(c1113t, interfaceC1303a, "static_fields", this.f2458b.size());
        m4608a(c1113t, interfaceC1303a, "instance_fields", this.f2460d.size());
        m4608a(c1113t, interfaceC1303a, "direct_methods", this.f2461e.size());
        m4608a(c1113t, interfaceC1303a, "virtual_methods", this.f2462f.size());
        m4609a(c1113t, interfaceC1303a, "static_fields", this.f2458b);
        m4609a(c1113t, interfaceC1303a, "instance_fields", this.f2460d);
        m4609a(c1113t, interfaceC1303a, "direct_methods", this.f2461e);
        m4609a(c1113t, interfaceC1303a, "virtual_methods", this.f2462f);
        if (zMo5405a) {
            interfaceC1303a.mo5407c();
        }
    }

    private ClassD m4611h() {
        Collections.sort(this.f2458b);
        int size = this.f2458b.size();
        while (size > 0) {
            Abstracta abstractC1200a = (Abstracta) this.f2459c.get((ClassW) this.f2458b.get(size - 1));
            if (abstractC1200a instanceof Abstractv) {
                if (((Abstractv) abstractC1200a).mo5017k() != 0) {
                    break;
                }
                size--;
            } else {
                if (abstractC1200a != null) {
                    break;
                }
                size--;
            }
        }
        if (size == 0) {
            return null;
        }
        ClassE c1212e = new ClassE(size);
        for (int i = 0; i < size; i++) {
            ClassW c1116w = (ClassW) this.f2458b.get(i);
            Abstracta abstractC1200aM4975a = (Abstracta) this.f2459c.get(c1116w);
            if (abstractC1200aM4975a == null) {
                abstractC1200aM4975a = ah.m4975a(c1116w.m4693a().mo3825a());
            }
            c1212e.m4980a(i, abstractC1200aM4975a);
        }
        c1212e.mo3944c_();
        return new ClassD(c1212e);
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_CLASS_DATA_ITEM;
    }

    @Override
    protected void mo4470a(Abstractax abstractC1083ax, int i) {
        ClassH c1310h = new ClassH();
        m4610b(abstractC1083ax.m4540f(), c1310h);
        this.f2464h = c1310h.m5461f();
        m4520a(this.f2464h.length);
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        if (!this.f2458b.isEmpty()) {
            m4617d();
            Iterator it = this.f2458b.iterator();
            while (it.hasNext()) {
                ((ClassW) it.next()).m4694a(c1113t);
            }
        }
        if (!this.f2460d.isEmpty()) {
            Collections.sort(this.f2460d);
            Iterator it2 = this.f2460d.iterator();
            while (it2.hasNext()) {
                ((ClassW) it2.next()).m4694a(c1113t);
            }
        }
        if (!this.f2461e.isEmpty()) {
            Collections.sort(this.f2461e);
            Iterator it3 = this.f2461e.iterator();
            while (it3.hasNext()) {
                ((ClassY) it3.next()).m4697a(c1113t);
            }
        }
        if (this.f2462f.isEmpty()) {
            return;
        }
        Collections.sort(this.f2462f);
        Iterator it4 = this.f2462f.iterator();
        while (it4.hasNext()) {
            ((ClassY) it4.next()).m4697a(c1113t);
        }
    }

    public void m4612a(ClassW c1116w) {
        if (c1116w == null) {
            throw new NullPointerException("field == null");
        }
        this.f2460d.add(c1116w);
    }

    public void m4613a(ClassW c1116w, Abstracta abstractC1200a) {
        if (c1116w == null) {
            throw new NullPointerException("field == null");
        }
        if (this.f2463g != null) {
            throw new UnsupportedOperationException("static fields already sorted");
        }
        this.f2458b.add(c1116w);
        this.f2459c.put(c1116w, abstractC1200a);
    }

    public void m4614a(ClassY c1118y) {
        if (c1118y == null) {
            throw new NullPointerException("method == null");
        }
        this.f2461e.add(c1118y);
    }

    @Override
    public void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a) {
        if (interfaceC1303a.mo5405a()) {
            m4610b(c1113t, interfaceC1303a);
        } else {
            interfaceC1303a.mo5453a(this.f2464h);
        }
    }

    @Override
    public String mo4474b() {
        return toString();
    }

    public void m4615b(ClassY c1118y) {
        if (c1118y == null) {
            throw new NullPointerException("method == null");
        }
        this.f2462f.add(c1118y);
    }

    public boolean m4616c() {
        return this.f2458b.isEmpty() && this.f2460d.isEmpty() && this.f2461e.isEmpty() && this.f2462f.isEmpty();
    }

    public ClassD m4617d() {
        if (this.f2463g == null && this.f2458b.size() != 0) {
            this.f2463g = m4611h();
        }
        return this.f2463g;
    }
}
