package com.a.b.a.d;

import com.a.b.a.b.ao;
import com.a.b.a.b.ClassJ;
import com.a.b.a.b.Interfacen;
import com.a.b.a.e.Interfacej;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassL;
import com.a.b.e.c.ClassO;
import com.a.b.e.c.ClassP;
import com.a.b.e.c.ClassS;
import com.a.b.e.c.ClassW;
import com.a.b.e.d.ClassC;
import com.a.b.g.ClassE;
import com.a.b.g.ClassK;
import java.util.ArrayList;

public class ClassD implements Interfacen {

    private final ClassE f1921a;

    private final Interfacej f1922b;

    public ClassD(ClassE c1307e, Interfacej interfaceC0975j) {
        if (c1307e == null) {
            throw new NullPointerException("bytes == null");
        }
        if (interfaceC0975j == null) {
            throw new NullPointerException("observer == null");
        }
        this.f1921a = c1307e;
        this.f1922b = interfaceC0975j;
    }

    private void m4115a(int i, int i2, int i3, long j) {
        this.f1922b.m4195a(this.f1921a, i2, i3, String.valueOf(m4116b(i2)) + (i3 == 1 ? " // " : " #") + (i3 == 1 ? ClassK.m5491i((int) j) : ClassK.m5484b(j)));
    }

    private String m4116b(int i) {
        int iM5445e = this.f1921a.m5445e(i);
        String strM3982a = ClassJ.m3982a(iM5445e);
        if (iM5445e == 196) {
            strM3982a = String.valueOf(strM3982a) + " " + ClassJ.m3982a(this.f1921a.m5445e(i + 1));
        }
        return String.valueOf(ClassK.m5485c(i)) + ": " + strM3982a;
    }

    private void m4117b(int i, int i2, int i3, int i4) {
        String str;
        String str2 = i3 == 1 ? " // " : " ";
        int iM5445e = this.f1921a.m5445e(i2);
        if (i3 == 1 || iM5445e == 16) {
            str = "#" + ClassK.m5491i(i4);
        } else {
            str = iM5445e == 17 ? "#" + ClassK.m5490h(i4) : "#" + ClassK.m5489g(i4);
        }
        this.f1922b.m4195a(this.f1921a, i2, i3, String.valueOf(m4116b(i2)) + str2 + str);
    }

    private void m4118b(int i, int i2, int i3, long j) {
        this.f1922b.m4195a(this.f1921a, i2, i3, String.valueOf(m4116b(i2)) + (i3 != 1 ? " #" + ClassK.m5481a(j) : "") + " // " + Double.longBitsToDouble(j));
    }

    private void m4119c(int i, int i2, int i3, int i4) {
        this.f1922b.m4195a(this.f1921a, i2, i3, String.valueOf(m4116b(i2)) + (i3 != 1 ? " #" + ClassK.m5480a(i4) : "") + " // " + Float.intBitsToFloat(i4));
    }

    @Override
    public int mo3928a() {
        return -1;
    }

    @Override
    public void mo3929a(int i) {
    }

    @Override
    public void mo3930a(int i, int i2, int i3) {
        this.f1922b.m4195a(this.f1921a, i2, i3, m4116b(i2));
    }

    @Override
    public void mo3931a(int i, int i2, int i3, int i4) {
        this.f1922b.m4195a(this.f1921a, i2, i3, String.valueOf(m4116b(i2)) + " " + (i3 <= 3 ? ClassK.m5485c(i4) : ClassK.m5480a(i4)));
    }

    @Override
    public void mo3932a(int i, int i2, int i3, int i4, ClassC c1236c, int i5) {
        String strM5487e = i3 <= 3 ? ClassK.m5487e(i4) : ClassK.m5485c(i4);
        boolean z = i3 == 1;
        String str = "";
        if (i == 132) {
            str = ", #" + (i3 <= 3 ? ClassK.m5491i(i5) : ClassK.m5490h(i5));
        }
        String str2 = "";
        if (c1236c.m5068l()) {
            str2 = String.valueOf(z ? "," : " //") + " category-2";
        }
        this.f1922b.m4195a(this.f1921a, i2, i3, String.valueOf(m4116b(i2)) + (z ? " // " : " ") + strM5487e + str + str2);
    }

    @Override
    public void mo3933a(int i, int i2, int i3, ao c0928ao, int i4) {
        int iM3938a = c0928ao.m3938a();
        StringBuilder sb = new StringBuilder((iM3938a * 20) + 100);
        sb.append(m4116b(i2));
        if (i4 != 0) {
            sb.append(" // padding: " + ClassK.m5480a(i4));
        }
        sb.append('\n');
        for (int i5 = 0; i5 < iM3938a; i5++) {
            sb.append("  ");
            sb.append(ClassK.m5489g(c0928ao.m3939a(i5)));
            sb.append(": ");
            sb.append(ClassK.m5485c(c0928ao.m3942b(i5)));
            sb.append('\n');
        }
        sb.append("  default: ");
        sb.append(ClassK.m5485c(c0928ao.m3941b()));
        this.f1922b.m4195a(this.f1921a, i2, i3, sb.toString());
    }

    @Override
    public void mo3934a(int i, int i2, int i3, Abstracta abstractC1200a, int i4) {
        if (abstractC1200a instanceof ClassS) {
            mo3935a(i, i2, i3, (ClassC) null);
            return;
        }
        if (abstractC1200a instanceof ClassP) {
            m4117b(i, i2, i3, i4);
            return;
        }
        if (abstractC1200a instanceof ClassW) {
            m4115a(i, i2, i3, ((ClassW) abstractC1200a).m5021n());
            return;
        }
        if (abstractC1200a instanceof ClassO) {
            m4119c(i, i2, i3, ((ClassO) abstractC1200a).mo5016j());
            return;
        }
        if (abstractC1200a instanceof ClassL) {
            m4118b(i, i2, i3, ((ClassL) abstractC1200a).mo5017k());
            return;
        }
        String str = "";
        if (i4 != 0) {
            str = i == 197 ? String.valueOf(", ") + ClassK.m5487e(i4) : String.valueOf(", ") + ClassK.m5485c(i4);
        }
        this.f1922b.m4195a(this.f1921a, i2, i3, String.valueOf(m4116b(i2)) + " " + abstractC1200a + str);
    }

    @Override
    public void mo3935a(int i, int i2, int i3, ClassC c1236c) {
        this.f1922b.m4195a(this.f1921a, i2, i3, m4116b(i2));
    }

    @Override
    public void mo3936a(int i, int i2, ae c1205ae, ArrayList arrayList) {
        this.f1922b.m4195a(this.f1921a, i, i2, String.valueOf(m4116b(i)) + (i2 == 1 ? " // " : " ") + c1205ae.m4966i().m5077u().mo3828d());
    }
}
