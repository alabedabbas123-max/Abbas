package a.f;

import a.b.b;
import a.b.c;
import a.b.Interfaced;
import a.b.Interfacej;
import a.b.f.ClassI;
import a.b.f.ClassZ;
import a.j.ClassK;

public class ClassI implements Interfacek {

    private final b f707a;

    private final ClassZ f708b;

    private c f709c;

    public ClassI(b bVar, ClassZ c0094z) {
        this.f707a = bVar;
        this.f708b = c0094z;
    }

    @Override
    public void mo1820a(String str, int i, int i2, String str2, String str3, String str4, String str5, int i3, int i4, String str6) {
        String strM1850b;
        if (this.f709c == null || !str.equals(str5)) {
            return;
        }
        Interfacej interfaceC0162jB = this.f709c.b(str3, ClassI.m753a(str2, ClassK.m3158a(str4)));
        if (interfaceC0162jB != null) {
            if (this.f708b != null && (strM1850b = ClassP.m1850b(interfaceC0162jB)) != null && !strM1850b.equals(str6)) {
                this.f708b.m941a(ClassI.m760b(str), "Warning: " + str + ": method '" + str2 + " " + str3 + '(' + str4 + ")' is not being kept as '" + strM1850b + "', but remapped to '" + str6 + "'");
            }
            ClassP.m1848a(interfaceC0162jB, str6);
        }
    }

    @Override
    public void mo1821a(String str, String str2, String str3, String str4, String str5) {
        String strM1850b;
        if (this.f709c == null || !str.equals(str4)) {
            return;
        }
        Interfaced interfaceC0041dA = this.f709c.a(str3, ClassI.m800w(str2));
        if (interfaceC0041dA != null) {
            if (this.f708b != null && (strM1850b = ClassP.m1850b(interfaceC0041dA)) != null && !strM1850b.equals(str5)) {
                this.f708b.m941a(ClassI.m760b(str), "Warning: " + str + ": field '" + str2 + " " + str3 + "' is not being kept as '" + strM1850b + "', but remapped to '" + str5 + "'");
            }
            ClassP.m1848a(interfaceC0041dA, str5);
        }
    }

    @Override
    public boolean mo1822a(String str, String str2) {
        String strM1794b;
        String strM760b = ClassI.m760b(str);
        this.f709c = this.f707a.a(strM760b);
        if (this.f709c == null) {
            return false;
        }
        String strM760b2 = ClassI.m760b(str2);
        if (this.f708b != null && (strM1794b = ClassC.m1794b(this.f709c)) != null && !strM1794b.equals(strM760b2)) {
            this.f708b.m942a(strM760b, strM1794b, "Warning: " + str + " is not being kept as '" + ClassI.m764c(strM1794b) + "', but remapped to '" + str2 + "'");
        }
        ClassC.m1792a(this.f709c, strM760b2);
        return true;
    }
}
