package com.a.b.c.c;

import com.a.a.a.ClassB;
import com.a.b.g.Interfacea;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.io.IOUtils;

public final class aq extends Abstractax {

    private static final Comparator f2386a = new ar();

    private static int[] f2387f;

    private final ArrayList f2388b;

    private final HashMap f2389c;

    private final Enumas f2390d;

    private int f2391e;

    public aq(String str, ClassT c1113t, int i, Enumas enumC1078as) {
        super(str, c1113t, i);
        this.f2388b = new ArrayList(100);
        this.f2389c = new HashMap(100);
        this.f2390d = enumC1078as;
        this.f2391e = -1;
    }

    static int[] m4509e() {
        int[] iArr = f2387f;
        if (iArr == null) {
            iArr = new int[Enumas.valuesCustom().length];
            try {
                iArr[Enumas.INSTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Enumas.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Enumas.TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            f2387f = iArr;
        }
        return iArr;
    }

    @Override
    public int mo4510a(Abstractag abstractC1066ag) {
        return ((Abstractat) abstractC1066ag).m4523e();
    }

    public void m4511a(Abstractat abstractC1079at) {
        m4545k();
        try {
            if (abstractC1079at.m4524f() > m4541g()) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f2388b.add(abstractC1079at);
        } catch (NullPointerException e) {
            throw new NullPointerException("item == null");
        }
    }

    public void m4512a(Interfacea interfaceC1303a, Enumah enumC1067ah, String str) {
        m4544j();
        TreeMap treeMap = new TreeMap();
        for (Abstractat abstractC1079at : this.f2388b) {
            if (abstractC1079at.mo4469a() == enumC1067ah) {
                treeMap.put(abstractC1079at.mo4474b(), abstractC1079at);
            }
        }
        if (treeMap.size() == 0) {
            return;
        }
        interfaceC1303a.mo5403a(0, str);
        for (Map.Entry entry : treeMap.entrySet()) {
            interfaceC1303a.mo5403a(0, String.valueOf(((Abstractat) entry.getValue()).m4525g()) + ' ' + ((String) entry.getKey()) + '\n');
        }
    }

    @Override
    protected void mo4513a_(Interfacea interfaceC1303a) {
        boolean zMo5405a = interfaceC1303a.mo5405a();
        ClassT c1113tF = m4540f();
        int iMo4484e_ = 0;
        boolean z = true;
        for (Abstractat abstractC1079at : this.f2388b) {
            if (zMo5405a) {
                if (z) {
                    z = false;
                } else {
                    interfaceC1303a.mo5403a(0, IOUtils.LINE_SEPARATOR_UNIX);
                }
            }
            int iM4524f = abstractC1079at.m4524f() - 1;
            int i = (iM4524f ^ (-1)) & (iMo4484e_ + iM4524f);
            if (iMo4484e_ != i) {
                interfaceC1303a.mo5463g(i - iMo4484e_);
                iMo4484e_ = i;
            }
            abstractC1079at.mo4483a(c1113tF, interfaceC1303a);
            iMo4484e_ = abstractC1079at.mo4484e_() + iMo4484e_;
        }
        if (iMo4484e_ != this.f2391e) {
            throw new RuntimeException("output size mismatch");
        }
    }

    public synchronized Abstractat m4514b(Abstractat abstractC1079at) {
        Abstractat abstractC1079at2;
        m4545k();
        abstractC1079at2 = (Abstractat) this.f2389c.get(abstractC1079at);
        if (abstractC1079at2 == null) {
            m4511a(abstractC1079at);
            this.f2389c.put(abstractC1079at, abstractC1079at);
            abstractC1079at2 = abstractC1079at;
        }
        return abstractC1079at2;
    }

    @Override
    public Collection mo4482b() {
        return this.f2388b;
    }

    @Override
    protected void mo4515c() {
        ClassT c1113tF = m4540f();
        int i = 0;
        while (true) {
            int size = this.f2388b.size();
            if (i >= size) {
                return;
            }
            int i2 = i;
            while (i2 < size) {
                ((Abstractat) this.f2388b.get(i2)).mo4471a(c1113tF);
                i2++;
            }
            i = i2;
        }
    }

    public void m4516d() {
        m4544j();
        switch (m4509e()[this.f2390d.ordinal()]) {
            case 2:
                Collections.sort(this.f2388b, f2386a);
                break;
            case 3:
                Collections.sort(this.f2388b);
                break;
        }
        int size = this.f2388b.size();
        int iMo4484e_ = 0;
        for (int i = 0; i < size; i++) {
            Abstractat abstractC1079at = (Abstractat) this.f2388b.get(i);
            try {
                int iM4521b = abstractC1079at.m4521b(this, iMo4484e_);
                if (iM4521b < iMo4484e_) {
                    throw new RuntimeException("bogus place() result for " + abstractC1079at);
                }
                iMo4484e_ = iM4521b + abstractC1079at.mo4484e_();
            } catch (RuntimeException e) {
                throw ClassB.m3756a(e, "...while placing " + abstractC1079at);
            }
        }
        this.f2391e = iMo4484e_;
    }

    @Override
    public int mo4517f_() {
        m4544j();
        return this.f2391e;
    }
}
