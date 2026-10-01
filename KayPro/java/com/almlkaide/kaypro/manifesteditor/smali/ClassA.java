package com.almlkaide.kaypro.manifesteditor.smali;

import abcd.Ca;
import abcd.Da;
import abcd.Wa;
import abcd.na;
import com.almlkaide.kaypro.manifesteditor.version.ClassA;
import java.io.Reader;
import org.a.a.a.ClassD;
import org.a.a.a.Interfaceaa;
import org.a.a.a.a.ab;

public class ClassA {

    private ClassA f3542a = new ClassA(null);

    private final Ca f3543b;

    private final na f3544c;

    public ClassA(Ca ca, na naVar) {
        this.f3544c = naVar;
        this.f3543b = ca;
    }

    public void m5547a(Da da, Reader reader, Wa wa) {
        int i;
        ClassA c1329a = this.f3542a;
        c1329a.m7454a(ClassD.m7410a(reader));
        wa.j6();
        while (true) {
            Interfaceaa interfaceC1751aaD = c1329a.m7460d();
            int iMo7354a = interfaceC1751aaD.mo7354a();
            int iMo7355c = interfaceC1751aaD.mo7355c();
            int iMo7356d = interfaceC1751aaD.mo7356d() + 1;
            if (iMo7354a == -1) {
                wa.j6(0, 0, iMo7355c, iMo7356d, iMo7355c, iMo7356d);
                return;
            }
            switch (iMo7354a) {
                case 1:
                case 4:
                case 5:
                case 6:
                    i = 3;
                    break;
                case 2:
                case 3:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    i = 2;
                    break;
                case 13:
                case 14:
                case 15:
                case 18:
                case 19:
                case 21:
                case 22:
                case 34:
                case 35:
                    i = 1;
                    break;
                case 16:
                case 17:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                    i = 5;
                    break;
                case 20:
                case 38:
                default:
                    i = 7;
                    break;
                case 23:
                case 24:
                case 25:
                case 36:
                    i = 6;
                    break;
                case 37:
                    i = 8;
                    break;
                case 39:
                case 40:
                case 41:
                    i = 4;
                    break;
            }
            ab c1687ab = (ab) c1329a.m7475m();
            wa.j6(i, 0, iMo7355c, iMo7356d, c1687ab.m7266b(), c1687ab.m7268c());
        }
    }
}
