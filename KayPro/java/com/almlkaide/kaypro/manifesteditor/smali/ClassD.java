package com.almlkaide.kaypro.manifesteditor.smali;

import abcd.Ca;
import abcd.Da;
import abcd.Wa;
import abcd.na;
import com.almlkaide.kaypro.manifesteditor.scanner.ClassA;
import java.io.Reader;
import org.a.a.a.Interfaceaa;

public class ClassD {

    private ClassA f3547a = new ClassA(null);

    private Ca f3548b;

    private na f3549c;

    public ClassD(Ca ca, na naVar) {
        this.f3548b = ca;
        this.f3549c = naVar;
    }

    public void m5559a(Da da, Reader reader, Wa wa) {
        boolean z;
        int i;
        ClassA c1364a = this.f3547a;
        c1364a.m5792a(reader);
        wa.j6();
        boolean z2 = false;
        while (true) {
            Interfaceaa interfaceC1751aaF = c1364a.m7494f();
            int iMo7354a = interfaceC1751aaF.mo7354a();
            int iMo7355c = interfaceC1751aaF.mo7355c();
            int iMo7356d = interfaceC1751aaF.mo7356d();
            if (iMo7354a == -1) {
                wa.j6(0, 0, iMo7355c, iMo7356d, iMo7355c, iMo7356d);
                return;
            }
            switch (iMo7354a) {
                case 1:
                case 3:
                    i = 1;
                    z = z2;
                    continue;
                    wa.j6(i, 0, iMo7355c, iMo7356d, c1364a.mo7468j(), c1364a.mo7469k());
                    z2 = z;
                    break;
                case 2:
                case 4:
                case 10:
                case 11:
                case 14:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 34:
                case 38:
                case 92:
                case 93:
                case 94:
                case 96:
                case 104:
                case 106:
                case 109:
                case 111:
                case 112:
                case 115:
                case 116:
                case 118:
                case 119:
                    i = 6;
                    z = z2;
                    continue;
                    wa.j6(i, 0, iMo7355c, iMo7356d, c1364a.mo7468j(), c1364a.mo7469k());
                    z2 = z;
                    break;
                case 5:
                case 13:
                case 105:
                case 108:
                case 121:
                    i = 5;
                    z = z2;
                    continue;
                    wa.j6(i, 0, iMo7355c, iMo7356d, c1364a.mo7468j(), c1364a.mo7469k());
                    z2 = z;
                    break;
                case 6:
                case 7:
                case 18:
                case 19:
                case 33:
                case 110:
                    i = 3;
                    z = z2;
                    continue;
                    wa.j6(i, 0, iMo7355c, iMo7356d, c1364a.mo7468j(), c1364a.mo7469k());
                    z2 = z;
                    break;
                case 8:
                case 9:
                case 12:
                case 20:
                case 21:
                case 36:
                case 37:
                case 95:
                case 100:
                case 101:
                case 107:
                case 113:
                case 117:
                    i = 4;
                    z = z2;
                    continue;
                    wa.j6(i, 0, iMo7355c, iMo7356d, c1364a.mo7468j(), c1364a.mo7469k());
                    z2 = z;
                    break;
                case 15:
                case 16:
                case 102:
                case 103:
                    i = 2;
                    z = z2;
                    continue;
                    wa.j6(i, 0, iMo7355c, iMo7356d, c1364a.mo7468j(), c1364a.mo7469k());
                    z2 = z;
                    break;
                case 17:
                    i = 3;
                    z = true;
                    continue;
                    wa.j6(i, 0, iMo7355c, iMo7356d, c1364a.mo7468j(), c1364a.mo7469k());
                    z2 = z;
                    break;
                case 91:
                    i = 8;
                    z = z2;
                    continue;
                    wa.j6(i, 0, iMo7355c, iMo7356d, c1364a.mo7468j(), c1364a.mo7469k());
                    z2 = z;
                    break;
                case 114:
                    z = false;
                    i = z2 ? 3 : 7;
                    continue;
                    wa.j6(i, 0, iMo7355c, iMo7356d, c1364a.mo7468j(), c1364a.mo7469k());
                    z2 = z;
                    break;
                case 123:
                    z2 = false;
                    break;
            }
            if (iMo7354a < 40 || iMo7354a > 90) {
                i = 7;
                z = z2;
            } else {
                i = 1;
                z = z2;
            }
            wa.j6(i, 0, iMo7355c, iMo7356d, c1364a.mo7468j(), c1364a.mo7469k());
            z2 = z;
        }
    }
}
