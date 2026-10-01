package org.c.a.a.b.c;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.c.a.a.b.b.Abstractd;
import org.c.a.a.b.f.ClassE;
import org.c.a.a.b.f.ClassL;
import org.c.a.a.b.f.ClassO;
import org.c.a.a.b.f.Interfacep;
import org.c.a.a.c.c.a.b.ClassI;

public class ClassZ extends Abstractd implements Interfacek {

    public static final ClassZ f5605g = new ClassZ(ClassO.f5931b);

    public static final ClassZ f5606h = new ClassZ(ClassO.f5955z);

    public static final ClassZ f5607i = new ClassZ(ClassL.f5915f);

    public static final ClassZ f5608j = new ClassZ(ClassE.f5895f);

    public static final ClassZ f5609k = new ClassZ(ClassE.f5895f, ClassO.f5955z);

    public static final ClassZ f5610l = new ClassZ(ClassI.f6320U, ClassO.f5955z);

    protected List f5611m;

    protected ClassZ(int i, List list) {
        super(i, i, i, 0, "Tokens");
        this.f5611m = list;
    }

    public ClassZ(List list) {
        this(m7760a(list), list);
    }

    public ClassZ(Interfacep... interfaceC2082pArr) {
        this(Arrays.asList(interfaceC2082pArr));
    }

    protected static int m7760a(List list) {
        aa c1888aa = new aa();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Interfacep) it.next()).mo8184a(c1888aa);
        }
        return c1888aa.f5581a;
    }

    @Override
    public void mo7710a(Interfacel interfaceC1899l) {
        interfaceC1899l.mo7746a(this);
    }

    public List m7761h() {
        return this.f5611m;
    }
}
