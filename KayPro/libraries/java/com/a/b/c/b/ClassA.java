package com.a.b.c.b;

import com.a.b.e.b.ad;
import com.a.b.e.b.ClassX;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractt;
import com.a.b.e.c.Abstractu;
import com.a.b.e.c.ae;
import com.a.b.g.ClassK;
import com.a.b.g.Interfacea;
import com.almlkaide.kaypro.android.dx.io.Opcodes;
import java.util.ArrayList;

public final class ClassA extends Abstractan {

    private final ClassH f1983a;

    private final ArrayList f1984b;

    private final Abstracta f1985c;

    private final int f1986d;

    private final int f1987e;

    public ClassA(ad c1170ad, ClassH c1040h, ArrayList arrayList, Abstracta abstractC1200a) {
        super(c1170ad, ClassX.f3113a);
        if (c1040h == null) {
            throw new NullPointerException("user == null");
        }
        if (arrayList == null) {
            throw new NullPointerException("values == null");
        }
        if (arrayList.size() <= 0) {
            throw new IllegalArgumentException("Illegal number of init values");
        }
        this.f1985c = abstractC1200a;
        if (abstractC1200a == ae.f3141l || abstractC1200a == ae.f3140k) {
            this.f1986d = 1;
        } else if (abstractC1200a == ae.f3147r || abstractC1200a == ae.f3142m) {
            this.f1986d = 2;
        } else if (abstractC1200a == ae.f3146q || abstractC1200a == ae.f3144o) {
            this.f1986d = 4;
        } else {
            if (abstractC1200a != ae.f3145p && abstractC1200a != ae.f3143n) {
                throw new IllegalArgumentException("Unexpected constant type");
            }
            this.f1986d = 8;
        }
        this.f1983a = c1040h;
        this.f1984b = arrayList;
        this.f1987e = arrayList.size();
    }

    @Override
    public int mo4229a() {
        return (((this.f1987e * this.f1986d) + 1) / 2) + 4;
    }

    @Override
    public Abstractl mo4230a(ClassX c1197x) {
        return new ClassA(m4380k(), this.f1983a, this.f1984b, this.f1985c);
    }

    @Override
    protected String mo4231a(boolean z) {
        int i = this.f1983a.m4378i();
        StringBuilder sb = new StringBuilder(100);
        int size = this.f1984b.size();
        sb.append("fill-array-data-payload // for fill-array-data @ ");
        sb.append(ClassK.m5485c(i));
        for (int i2 = 0; i2 < size; i2++) {
            sb.append("\n  ");
            sb.append(i2);
            sb.append(": ");
            sb.append(((Abstracta) this.f1984b.get(i2)).mo3828d());
        }
        return sb.toString();
    }

    @Override
    public void mo4232a(Interfacea interfaceC1303a) {
        int size = this.f1984b.size();
        interfaceC1303a.mo5456c(Opcodes.FILL_ARRAY_DATA_PAYLOAD);
        interfaceC1303a.mo5456c(this.f1986d);
        interfaceC1303a.mo5457d(this.f1987e);
        switch (this.f1986d) {
            case 1:
                for (int i = 0; i < size; i++) {
                    interfaceC1303a.mo3755a((int) ((byte) ((Abstractt) ((Abstracta) this.f1984b.get(i))).mo5016j()));
                }
                break;
            case 2:
                for (int i2 = 0; i2 < size; i2++) {
                    interfaceC1303a.mo5456c((short) ((Abstractt) ((Abstracta) this.f1984b.get(i2))).mo5016j());
                }
                break;
            case 4:
                for (int i3 = 0; i3 < size; i3++) {
                    interfaceC1303a.mo5457d(((Abstractt) ((Abstracta) this.f1984b.get(i3))).mo5016j());
                }
                break;
            case 8:
                for (int i4 = 0; i4 < size; i4++) {
                    interfaceC1303a.mo5450a(((Abstractu) ((Abstracta) this.f1984b.get(i4))).mo5017k());
                }
                break;
        }
        if (this.f1986d != 1 || size % 2 == 0) {
            return;
        }
        interfaceC1303a.mo3755a(0);
    }

    @Override
    protected String mo4233b() {
        StringBuilder sb = new StringBuilder(100);
        int size = this.f1984b.size();
        for (int i = 0; i < size; i++) {
            sb.append("\n    ");
            sb.append(i);
            sb.append(": ");
            sb.append(((Abstracta) this.f1984b.get(i)).mo3828d());
        }
        return sb.toString();
    }
}
