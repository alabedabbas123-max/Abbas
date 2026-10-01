package org.a.a.a;

import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.a.a.a.a.Abstractm;

public abstract class Abstractu {

    private static final Map f5358a = new WeakHashMap();

    private static final Map f5359b = new WeakHashMap();

    private List f5360c = new ClassV(this);

    private int f5361d = -1;

    protected Abstractm f5362v;

    public boolean m7473a(ClassW c1797w, int i, int i2) {
        return true;
    }

    public abstract String[] mo5543a();

    public Interfacead mo5544b() {
        return ae.m7361a(mo5543a());
    }

    public void m7474b(ClassW c1797w, int i, int i2) {
    }

    public Abstractm m7475m() {
        return this.f5362v;
    }

    public List m7476n() {
        return this.f5360c;
    }

    public Interfacea m7477o() {
        return new ClassS(m7476n());
    }

    public final int m7478p() {
        return this.f5361d;
    }
}
