package com.a.b.c.c;

import com.a.b.e.a.ClassC;
import com.a.b.e.a.ClassD;
import com.a.b.e.c.ClassN;
import com.a.b.e.c.ClassZ;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class ClassF extends Abstractat {

    private ClassC f2442a;

    private ArrayList f2443b;

    private ArrayList f2444c;

    private ArrayList f2445d;

    public ClassF() {
        super(4, -1);
        this.f2442a = null;
        this.f2443b = null;
        this.f2444c = null;
        this.f2445d = null;
    }

    private static int m4589a(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public int mo4468a(Abstractat abstractC1079at) {
        if (m4595d()) {
            return this.f2442a.compareTo(((ClassF) abstractC1079at).f2442a);
        }
        throw new UnsupportedOperationException("uninternable instance");
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_ANNOTATIONS_DIRECTORY_ITEM;
    }

    @Override
    protected void mo4470a(Abstractax abstractC1083ax, int i) {
        m4520a(((m4589a(this.f2443b) + m4589a(this.f2444c) + m4589a(this.f2445d)) * 8) + 16);
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        aq c1076aqM4674d = c1113t.m4674d();
        if (this.f2442a != null) {
            this.f2442a = (ClassC) c1076aqM4674d.m4514b(this.f2442a);
        }
        if (this.f2443b != null) {
            Iterator it = this.f2443b.iterator();
            while (it.hasNext()) {
                ((ClassZ) it.next()).m4699a(c1113t);
            }
        }
        if (this.f2444c != null) {
            Iterator it2 = this.f2444c.iterator();
            while (it2.hasNext()) {
                ((al) it2.next()).m4498a(c1113t);
            }
        }
        if (this.f2445d != null) {
            Iterator it3 = this.f2445d.iterator();
            while (it3.hasNext()) {
                ((au) it3.next()).m4527a(c1113t);
            }
        }
    }

    public void m4590a(ClassC c1163c, ClassT c1113t) {
        if (c1163c == null) {
            throw new NullPointerException("annotations == null");
        }
        if (this.f2442a != null) {
            throw new UnsupportedOperationException("class annotations already set");
        }
        this.f2442a = new ClassC(c1163c, c1113t);
    }

    public void m4591a(ClassN c1221n, ClassC c1163c, ClassT c1113t) {
        if (this.f2443b == null) {
            this.f2443b = new ArrayList();
        }
        this.f2443b.add(new ClassZ(c1221n, new ClassC(c1163c, c1113t)));
    }

    public void m4592a(ClassZ c1233z, ClassC c1163c, ClassT c1113t) {
        if (this.f2444c == null) {
            this.f2444c = new ArrayList();
        }
        this.f2444c.add(new al(c1233z, new ClassC(c1163c, c1113t)));
    }

    public void m4593a(ClassZ c1233z, ClassD c1164d, ClassT c1113t) {
        if (this.f2445d == null) {
            this.f2445d = new ArrayList();
        }
        this.f2445d.add(new au(c1233z, c1164d, c1113t));
    }

    @Override
    protected void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a) {
        boolean zMo5405a = interfaceC1303a.mo5405a();
        int iM4519b = Abstractat.m4519b(this.f2442a);
        int iM4589a = m4589a(this.f2443b);
        int iM4589a2 = m4589a(this.f2444c);
        int iM4589a3 = m4589a(this.f2445d);
        if (zMo5405a) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4525g()) + " annotations directory");
            interfaceC1303a.mo5403a(4, "  class_annotations_off: " + ClassK.m5480a(iM4519b));
            interfaceC1303a.mo5403a(4, "  fields_size:           " + ClassK.m5480a(iM4589a));
            interfaceC1303a.mo5403a(4, "  methods_size:          " + ClassK.m5480a(iM4589a2));
            interfaceC1303a.mo5403a(4, "  parameters_size:       " + ClassK.m5480a(iM4589a3));
        }
        interfaceC1303a.mo5457d(iM4519b);
        interfaceC1303a.mo5457d(iM4589a);
        interfaceC1303a.mo5457d(iM4589a2);
        interfaceC1303a.mo5457d(iM4589a3);
        if (iM4589a != 0) {
            Collections.sort(this.f2443b);
            if (zMo5405a) {
                interfaceC1303a.mo5403a(0, "  fields:");
            }
            Iterator it = this.f2443b.iterator();
            while (it.hasNext()) {
                ((ClassZ) it.next()).m4700a(c1113t, interfaceC1303a);
            }
        }
        if (iM4589a2 != 0) {
            Collections.sort(this.f2444c);
            if (zMo5405a) {
                interfaceC1303a.mo5403a(0, "  methods:");
            }
            Iterator it2 = this.f2444c.iterator();
            while (it2.hasNext()) {
                ((al) it2.next()).m4499a(c1113t, interfaceC1303a);
            }
        }
        if (iM4589a3 != 0) {
            Collections.sort(this.f2445d);
            if (zMo5405a) {
                interfaceC1303a.mo5403a(0, "  parameters:");
            }
            Iterator it3 = this.f2445d.iterator();
            while (it3.hasNext()) {
                ((au) it3.next()).m4528a(c1113t, interfaceC1303a);
            }
        }
    }

    @Override
    public String mo4474b() {
        throw new RuntimeException("unsupported");
    }

    public boolean m4594c() {
        return this.f2442a == null && this.f2443b == null && this.f2444c == null && this.f2445d == null;
    }

    public boolean m4595d() {
        return this.f2442a != null && this.f2443b == null && this.f2444c == null && this.f2445d == null;
    }

    public int hashCode() {
        if (this.f2442a == null) {
            return 0;
        }
        return this.f2442a.hashCode();
    }
}
