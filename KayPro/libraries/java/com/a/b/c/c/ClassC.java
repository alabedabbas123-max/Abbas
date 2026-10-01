package com.a.b.c.c;

import com.a.b.e.a.ClassA;
import com.a.b.e.a.ClassC;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import java.util.Iterator;

public final class ClassC extends Abstractat {

    private final ClassC f2428a;

    private final ClassA[] f2429b;

    public ClassC(ClassC c1163c, ClassT c1113t) {
        super(4, m4579a(c1163c));
        this.f2428a = c1163c;
        this.f2429b = new ClassA[c1163c.m4717b()];
        int i = 0;
        Iterator it = c1163c.m4719d().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return;
            }
            this.f2429b[i2] = new ClassA((ClassA) it.next(), c1113t);
            i = i2 + 1;
        }
    }

    private static int m4579a(ClassC c1163c) {
        try {
            return (c1163c.m4717b() * 4) + 4;
        } catch (NullPointerException e) {
            throw new NullPointerException("list == null");
        }
    }

    @Override
    protected int mo4468a(Abstractat abstractC1079at) {
        return this.f2428a.compareTo(((ClassC) abstractC1079at).f2428a);
    }

    @Override
    public Enumah mo4469a() {
        return Enumah.TYPE_ANNOTATION_SET_ITEM;
    }

    @Override
    protected void mo4470a(Abstractax abstractC1083ax, int i) {
        ClassA.m4466a(this.f2429b);
    }

    @Override
    public void mo4471a(ClassT c1113t) {
        aq c1076aqM4686p = c1113t.m4686p();
        int length = this.f2429b.length;
        for (int i = 0; i < length; i++) {
            this.f2429b[i] = (ClassA) c1076aqM4686p.m4514b(this.f2429b[i]);
        }
    }

    @Override
    protected void mo4473a_(ClassT c1113t, Interfacea interfaceC1303a) {
        boolean zMo5405a = interfaceC1303a.mo5405a();
        int length = this.f2429b.length;
        if (zMo5405a) {
            interfaceC1303a.mo5403a(0, String.valueOf(m4525g()) + " annotation set");
            interfaceC1303a.mo5403a(4, "  size: " + ClassK.m5480a(length));
        }
        interfaceC1303a.mo5457d(length);
        for (int i = 0; i < length; i++) {
            int iE = this.f2429b[i].m4523e();
            if (zMo5405a) {
                interfaceC1303a.mo5403a(4, "  entries[" + Integer.toHexString(i) + "]: " + ClassK.m5480a(iE));
                this.f2429b[i].m4472a(interfaceC1303a, "    ");
            }
            interfaceC1303a.mo5457d(iE);
        }
    }

    @Override
    public String mo4474b() {
        return this.f2428a.toString();
    }

    public int hashCode() {
        return this.f2428a.hashCode();
    }
}
