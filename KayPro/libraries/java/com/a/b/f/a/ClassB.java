package com.a.b.f.a;

import com.a.b.e.b.ClassO;
import com.a.b.e.b.ClassU;
import com.a.b.f.Abstractan;
import com.a.b.f.aa;
import com.a.b.f.ac;
import com.a.b.f.ClassZ;
import com.a.b.f.Interfaceao;
import java.util.ArrayList;

class ClassB implements Interfaceao {

    final ClassA f3295a;

    ClassB(ClassA c1240a) {
        this.f3295a = c1240a;
    }

    private void m5118a(Abstractan abstractC1268an) {
        ClassU c1194uMo5258g = abstractC1268an.mo5258g();
        if (c1194uMo5258g != null) {
            ClassO c1188oM4896i = c1194uMo5258g.m4896i();
            ArrayList arrayList = (ArrayList) this.f3295a.f3285c.get(c1188oM4896i);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f3295a.f3285c.put(c1188oM4896i, arrayList);
            }
            arrayList.add(c1194uMo5258g);
        }
        if (!(abstractC1268an instanceof ClassZ)) {
            if (abstractC1268an instanceof ac) {
                this.f3295a.f3288f.add((ac) abstractC1268an);
            }
        } else if (abstractC1268an.mo5173e().m4737a() == 56) {
            this.f3295a.f3286d.add((ClassZ) abstractC1268an);
        } else if (aa.m5160b().mo4812a(abstractC1268an.mo5174f().m4840f(), abstractC1268an.mo5171b())) {
            this.f3295a.f3287e.add((ClassZ) abstractC1268an);
        }
    }

    @Override
    public void mo5119a(ac c1257ac) {
        m5118a((Abstractan) c1257ac);
    }

    @Override
    public void mo5120a(ClassZ c1302z) {
        m5118a((Abstractan) c1302z);
    }

    @Override
    public void mo5121b(ClassZ c1302z) {
        m5118a((Abstractan) c1302z);
    }
}
