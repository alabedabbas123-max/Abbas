package com.a.b.a.b;

import com.a.b.e.c.Abstracta;
import com.a.b.e.c.Abstractv;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassL;
import com.a.b.e.c.ClassO;
import com.a.b.e.c.ClassP;
import com.a.b.e.c.ClassR;
import com.a.b.e.c.ClassS;
import com.a.b.e.c.ClassW;
import com.a.b.e.c.Interfaceb;
import com.a.b.e.d.ClassC;
import com.a.b.g.ClassD;
import com.a.b.g.ClassE;
import com.a.b.g.ClassK;
import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;
import java.util.ArrayList;

public final class ClassK {

    public static final Interfacen f1871a = new ClassL();

    private final ClassE f1872b;

    private final Interfaceb f1873c;

    public ClassK(ClassE c1307e, Interfaceb interfaceC1209b) {
        if (c1307e == null) {
            throw new NullPointerException("bytes == null");
        }
        if (interfaceC1209b == null) {
            throw new NullPointerException("pool == null");
        }
        this.f1872b = c1307e;
        this.f1873c = interfaceC1209b;
    }

    private int m3984b(int i, Interfacen interfaceC0942n) {
        int i2 = (i + 4) & (-4);
        int iM5445e = 0;
        for (int i3 = i + 1; i3 < i2; i3++) {
            iM5445e = (iM5445e << 8) | this.f1872b.m5445e(i3);
        }
        int iM5442c = i + this.f1872b.m5442c(i2);
        int iM5442c2 = this.f1872b.m5442c(i2 + 4);
        int iM5442c3 = this.f1872b.m5442c(i2 + 8);
        int i4 = (iM5442c3 - iM5442c2) + 1;
        int i5 = i2 + 12;
        if (iM5442c2 > iM5442c3) {
            throw new al("low / high inversion");
        }
        ao c0928ao = new ao(i4);
        for (int i6 = 0; i6 < i4; i6++) {
            int iM5442c4 = this.f1872b.m5442c(i5) + i;
            i5 += 4;
            c0928ao.m3940a(iM5442c2 + i6, iM5442c4);
        }
        c0928ao.m3943c(iM5442c);
        c0928ao.m3947f();
        c0928ao.mo3944c_();
        int i7 = i5 - i;
        interfaceC0942n.mo3933a(171, i, i7, c0928ao, iM5445e);
        return i7;
    }

    private int m3985c(int i, Interfacen interfaceC0942n) {
        int i2 = (i + 4) & (-4);
        int iM5445e = 0;
        for (int i3 = i + 1; i3 < i2; i3++) {
            iM5445e = (iM5445e << 8) | this.f1872b.m5445e(i3);
        }
        int iM5442c = i + this.f1872b.m5442c(i2);
        int iM5442c2 = this.f1872b.m5442c(i2 + 4);
        int i4 = i2 + 8;
        ao c0928ao = new ao(iM5442c2);
        for (int i5 = 0; i5 < iM5442c2; i5++) {
            int iM5442c3 = this.f1872b.m5442c(i4);
            int iM5442c4 = this.f1872b.m5442c(i4 + 4) + i;
            i4 += 8;
            c0928ao.m3940a(iM5442c3, iM5442c4);
        }
        c0928ao.m3943c(iM5442c);
        c0928ao.m3947f();
        c0928ao.mo3944c_();
        int i6 = i4 - i;
        interfaceC0942n.mo3933a(171, i, i6, c0928ao, iM5445e);
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee  */
    private int m3986d(int i, Interfacen interfaceC0942n) {
        ae c1205ae;
        int i2;
        int i3;
        boolean z;
        int iM5445e = this.f1872b.m5445e(i + 1);
        switch (iM5445e) {
            case 4:
                c1205ae = ae.f3140k;
                break;
            case 5:
                c1205ae = ae.f3142m;
                break;
            case 6:
                c1205ae = ae.f3144o;
                break;
            case 7:
                c1205ae = ae.f3143n;
                break;
            case 8:
                c1205ae = ae.f3141l;
                break;
            case 9:
                c1205ae = ae.f3147r;
                break;
            case 10:
                c1205ae = ae.f3146q;
                break;
            case 11:
                c1205ae = ae.f3145p;
                break;
            default:
                throw new al("bad newarray code " + ClassK.m5487e(iM5445e));
        }
        int iMo3928a = interfaceC0942n.mo3928a();
        ClassM c0941m = new ClassM(this);
        if (iMo3928a >= 0) {
            m3988a(iMo3928a, c0941m);
            if ((c0941m.f1875a instanceof ClassP) && iMo3928a + c0941m.f1876b == i) {
                i2 = c0941m.f1877c;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        int i4 = i + 2;
        ArrayList arrayList = new ArrayList();
        if (i2 != 0) {
            int i5 = i4;
            i3 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (this.f1872b.m5445e(i5) == 89) {
                    m3988a(i6, c0941m);
                    if (c0941m.f1876b != 0 && (c0941m.f1875a instanceof ClassP) && c0941m.f1877c == i3) {
                        int i7 = c0941m.f1876b + i6;
                        m3988a(i7, c0941m);
                        if (c0941m.f1876b != 0 && (c0941m.f1875a instanceof Abstractv)) {
                            int i8 = c0941m.f1876b + i7;
                            arrayList.add(c0941m.f1875a);
                            i5 = i8 + 1;
                            int iM5445e2 = this.f1872b.m5445e(i8);
                            switch (iM5445e) {
                                case 4:
                                case 8:
                                    if (iM5445e2 == 84) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    break;
                                case 5:
                                    if (iM5445e2 == 85) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    break;
                                case 6:
                                    if (iM5445e2 == 81) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    break;
                                case 7:
                                    if (iM5445e2 == 82) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    break;
                                case 9:
                                    if (iM5445e2 == 86) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    break;
                                case 10:
                                    if (iM5445e2 == 79) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    break;
                                case 11:
                                    if (iM5445e2 == 80) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    break;
                                default:
                                    z = true;
                                    break;
                            }
                            if (!z) {
                                i3++;
                                i4 = i5;
                            }
                        }
                    }
                }
            }
        } else {
            i3 = 0;
        }
        if (i3 < 2 || i3 != i2) {
            interfaceC0942n.mo3936a(i, 2, c1205ae, (ArrayList) null);
            return 2;
        }
        interfaceC0942n.mo3936a(i, i4 - i, c1205ae, arrayList);
        return i4 - i;
    }

    private int m3987e(int i, Interfacen interfaceC0942n) {
        int iM5445e = this.f1872b.m5445e(i + 1);
        int iM5446f = this.f1872b.m5446f(i + 2);
        switch (iM5445e) {
            case 21:
                interfaceC0942n.mo3932a(21, i, 4, iM5446f, ClassC.f3255f, 0);
                return 4;
            case 22:
                interfaceC0942n.mo3932a(21, i, 4, iM5446f, ClassC.f3256g, 0);
                return 4;
            case 23:
                interfaceC0942n.mo3932a(21, i, 4, iM5446f, ClassC.f3254e, 0);
                return 4;
            case 24:
                interfaceC0942n.mo3932a(21, i, 4, iM5446f, ClassC.f3253d, 0);
                return 4;
            case 25:
                interfaceC0942n.mo3932a(21, i, 4, iM5446f, ClassC.f3267r, 0);
                return 4;
            case 54:
                interfaceC0942n.mo3932a(54, i, 4, iM5446f, ClassC.f3255f, 0);
                return 4;
            case 55:
                interfaceC0942n.mo3932a(54, i, 4, iM5446f, ClassC.f3256g, 0);
                return 4;
            case 56:
                interfaceC0942n.mo3932a(54, i, 4, iM5446f, ClassC.f3254e, 0);
                return 4;
            case 57:
                interfaceC0942n.mo3932a(54, i, 4, iM5446f, ClassC.f3253d, 0);
                return 4;
            case 58:
                interfaceC0942n.mo3932a(54, i, 4, iM5446f, ClassC.f3267r, 0);
                return 4;
            case 132:
                interfaceC0942n.mo3932a(iM5445e, i, 6, iM5446f, ClassC.f3255f, this.f1872b.m5440b(i + 4));
                return 6;
            case 169:
                interfaceC0942n.mo3932a(iM5445e, i, 4, iM5446f, ClassC.f3260k, 0);
                return 4;
            default:
                interfaceC0942n.mo3930a(196, i, 1);
                return 1;
        }
    }

    public int m3988a(int i, Interfacen interfaceC0942n) {
        Interfacen interfaceC0942n2 = interfaceC0942n == null ? f1871a : interfaceC0942n;
        try {
            int iM5445e = this.f1872b.m5445e(i);
            ClassJ.m3983b(iM5445e);
            switch (iM5445e) {
                case 0:
                    interfaceC0942n2.mo3935a(iM5445e, i, 1, ClassC.f3258i);
                    return 1;
                case 1:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassS.f3185a, 0);
                    return 1;
                case 2:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassP.f3170a, -1);
                    return 1;
                case 3:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassP.f3171b, 0);
                    return 1;
                case 4:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassP.f3172c, 1);
                    return 1;
                case 5:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassP.f3173d, 2);
                    return 1;
                case 6:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassP.f3174e, 3);
                    return 1;
                case 7:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassP.f3175f, 4);
                    return 1;
                case 8:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassP.f3176g, 5);
                    return 1;
                case 9:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassW.f3188a, 0);
                    return 1;
                case 10:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassW.f3189b, 0);
                    return 1;
                case 11:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassO.f3167a, 0);
                    return 1;
                case 12:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassO.f3168b, 0);
                    return 1;
                case 13:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassO.f3169c, 0);
                    return 1;
                case 14:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassL.f3164a, 0);
                    return 1;
                case 15:
                    interfaceC0942n2.mo3934a(18, i, 1, ClassL.f3165b, 0);
                    return 1;
                case 16:
                    int iM5437a = this.f1872b.m5437a(i + 1);
                    interfaceC0942n2.mo3934a(18, i, 2, ClassP.m5001a(iM5437a), iM5437a);
                    return 2;
                case 17:
                    int iM5440b = this.f1872b.m5440b(i + 1);
                    interfaceC0942n2.mo3934a(18, i, 3, ClassP.m5001a(iM5440b), iM5440b);
                    return 3;
                case 18:
                    Abstracta abstractC1200aMo4971a = this.f1873c.mo4971a(this.f1872b.m5445e(i + 1));
                    interfaceC0942n2.mo3934a(18, i, 2, abstractC1200aMo4971a, abstractC1200aMo4971a instanceof ClassP ? ((ClassP) abstractC1200aMo4971a).m5002i_() : 0);
                    return 2;
                case 19:
                    Abstracta abstractC1200aMo4971a2 = this.f1873c.mo4971a(this.f1872b.m5446f(i + 1));
                    interfaceC0942n2.mo3934a(18, i, 3, abstractC1200aMo4971a2, abstractC1200aMo4971a2 instanceof ClassP ? ((ClassP) abstractC1200aMo4971a2).m5002i_() : 0);
                    return 3;
                case 20:
                    interfaceC0942n2.mo3934a(20, i, 3, this.f1873c.mo4971a(this.f1872b.m5446f(i + 1)), 0);
                    return 3;
                case 21:
                    interfaceC0942n2.mo3932a(21, i, 2, this.f1872b.m5445e(i + 1), ClassC.f3255f, 0);
                    return 2;
                case 22:
                    interfaceC0942n2.mo3932a(21, i, 2, this.f1872b.m5445e(i + 1), ClassC.f3256g, 0);
                    return 2;
                case 23:
                    interfaceC0942n2.mo3932a(21, i, 2, this.f1872b.m5445e(i + 1), ClassC.f3254e, 0);
                    return 2;
                case 24:
                    interfaceC0942n2.mo3932a(21, i, 2, this.f1872b.m5445e(i + 1), ClassC.f3253d, 0);
                    return 2;
                case 25:
                    interfaceC0942n2.mo3932a(21, i, 2, this.f1872b.m5445e(i + 1), ClassC.f3267r, 0);
                    return 2;
                case 26:
                case 27:
                case 28:
                case 29:
                    interfaceC0942n2.mo3932a(21, i, 1, iM5445e - 26, ClassC.f3255f, 0);
                    return 1;
                case 30:
                case 31:
                case 32:
                case 33:
                    interfaceC0942n2.mo3932a(21, i, 1, iM5445e - 30, ClassC.f3256g, 0);
                    return 1;
                case 34:
                case 35:
                case 36:
                case 37:
                    interfaceC0942n2.mo3932a(21, i, 1, iM5445e - 34, ClassC.f3254e, 0);
                    return 1;
                case 38:
                case 39:
                case 40:
                case 41:
                    interfaceC0942n2.mo3932a(21, i, 1, iM5445e - 38, ClassC.f3253d, 0);
                    return 1;
                case 42:
                case 43:
                case 44:
                case 45:
                    interfaceC0942n2.mo3932a(21, i, 1, iM5445e - 42, ClassC.f3267r, 0);
                    return 1;
                case 46:
                    interfaceC0942n2.mo3935a(46, i, 1, ClassC.f3255f);
                    return 1;
                case 47:
                    interfaceC0942n2.mo3935a(46, i, 1, ClassC.f3256g);
                    return 1;
                case 48:
                    interfaceC0942n2.mo3935a(46, i, 1, ClassC.f3254e);
                    return 1;
                case 49:
                    interfaceC0942n2.mo3935a(46, i, 1, ClassC.f3253d);
                    return 1;
                case 50:
                    interfaceC0942n2.mo3935a(46, i, 1, ClassC.f3267r);
                    return 1;
                case 51:
                    interfaceC0942n2.mo3935a(46, i, 1, ClassC.f3251b);
                    return 1;
                case 52:
                    interfaceC0942n2.mo3935a(46, i, 1, ClassC.f3252c);
                    return 1;
                case 53:
                    interfaceC0942n2.mo3935a(46, i, 1, ClassC.f3257h);
                    return 1;
                case 54:
                    interfaceC0942n2.mo3932a(54, i, 2, this.f1872b.m5445e(i + 1), ClassC.f3255f, 0);
                    return 2;
                case 55:
                    interfaceC0942n2.mo3932a(54, i, 2, this.f1872b.m5445e(i + 1), ClassC.f3256g, 0);
                    return 2;
                case 56:
                    interfaceC0942n2.mo3932a(54, i, 2, this.f1872b.m5445e(i + 1), ClassC.f3254e, 0);
                    return 2;
                case 57:
                    interfaceC0942n2.mo3932a(54, i, 2, this.f1872b.m5445e(i + 1), ClassC.f3253d, 0);
                    return 2;
                case 58:
                    interfaceC0942n2.mo3932a(54, i, 2, this.f1872b.m5445e(i + 1), ClassC.f3267r, 0);
                    return 2;
                case 59:
                case 60:
                case 61:
                case ByteOps.ISTORE_3:
                    interfaceC0942n2.mo3932a(54, i, 1, iM5445e - 59, ClassC.f3255f, 0);
                    return 1;
                case 63:
                case 64:
                case 65:
                case 66:
                    interfaceC0942n2.mo3932a(54, i, 1, iM5445e - 63, ClassC.f3256g, 0);
                    return 1;
                case 67:
                case 68:
                case 69:
                case 70:
                    interfaceC0942n2.mo3932a(54, i, 1, iM5445e - 67, ClassC.f3254e, 0);
                    return 1;
                case 71:
                case 72:
                case 73:
                case 74:
                    interfaceC0942n2.mo3932a(54, i, 1, iM5445e - 71, ClassC.f3253d, 0);
                    return 1;
                case 75:
                case 76:
                case 77:
                case 78:
                    interfaceC0942n2.mo3932a(54, i, 1, iM5445e - 75, ClassC.f3267r, 0);
                    return 1;
                case 79:
                    interfaceC0942n2.mo3935a(79, i, 1, ClassC.f3255f);
                    return 1;
                case 80:
                    interfaceC0942n2.mo3935a(79, i, 1, ClassC.f3256g);
                    return 1;
                case 81:
                    interfaceC0942n2.mo3935a(79, i, 1, ClassC.f3254e);
                    return 1;
                case 82:
                    interfaceC0942n2.mo3935a(79, i, 1, ClassC.f3253d);
                    return 1;
                case 83:
                    interfaceC0942n2.mo3935a(79, i, 1, ClassC.f3267r);
                    return 1;
                case 84:
                    interfaceC0942n2.mo3935a(79, i, 1, ClassC.f3251b);
                    return 1;
                case 85:
                    interfaceC0942n2.mo3935a(79, i, 1, ClassC.f3252c);
                    return 1;
                case 86:
                    interfaceC0942n2.mo3935a(79, i, 1, ClassC.f3257h);
                    return 1;
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                    interfaceC0942n2.mo3935a(iM5445e, i, 1, ClassC.f3258i);
                    return 1;
                case 96:
                case 100:
                case 104:
                case 108:
                case 112:
                case 116:
                case 120:
                case 122:
                case 124:
                case 126:
                case 128:
                case 130:
                    interfaceC0942n2.mo3935a(iM5445e, i, 1, ClassC.f3255f);
                    return 1;
                case 97:
                case 101:
                case 105:
                case 109:
                case 113:
                case 117:
                case 121:
                case 123:
                case 125:
                case 127:
                case 129:
                case 131:
                    interfaceC0942n2.mo3935a(iM5445e - 1, i, 1, ClassC.f3256g);
                    return 1;
                case 98:
                case 102:
                case 106:
                case 110:
                case 114:
                case 118:
                    interfaceC0942n2.mo3935a(iM5445e - 2, i, 1, ClassC.f3254e);
                    return 1;
                case 99:
                case 103:
                case 107:
                case 111:
                case 115:
                case 119:
                    interfaceC0942n2.mo3935a(iM5445e - 3, i, 1, ClassC.f3253d);
                    return 1;
                case 132:
                    interfaceC0942n2.mo3932a(iM5445e, i, 3, this.f1872b.m5445e(i + 1), ClassC.f3255f, this.f1872b.m5437a(i + 2));
                    return 3;
                case 133:
                case 140:
                case 143:
                    interfaceC0942n2.mo3935a(iM5445e, i, 1, ClassC.f3256g);
                    return 1;
                case 134:
                case 137:
                case 144:
                    interfaceC0942n2.mo3935a(iM5445e, i, 1, ClassC.f3254e);
                    return 1;
                case 135:
                case 138:
                case 141:
                    interfaceC0942n2.mo3935a(iM5445e, i, 1, ClassC.f3253d);
                    return 1;
                case 136:
                case 139:
                case 142:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 190:
                    interfaceC0942n2.mo3935a(iM5445e, i, 1, ClassC.f3255f);
                    return 1;
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 198:
                case 199:
                    interfaceC0942n2.mo3931a(iM5445e, i, 3, this.f1872b.m5440b(i + 1) + i);
                    return 3;
                case 169:
                    interfaceC0942n2.mo3932a(iM5445e, i, 2, this.f1872b.m5445e(i + 1), ClassC.f3260k, 0);
                    return 2;
                case 170:
                    return m3984b(i, interfaceC0942n2);
                case 171:
                    return m3985c(i, interfaceC0942n2);
                case 172:
                    interfaceC0942n2.mo3935a(172, i, 1, ClassC.f3255f);
                    return 1;
                case 173:
                    interfaceC0942n2.mo3935a(172, i, 1, ClassC.f3256g);
                    return 1;
                case 174:
                    interfaceC0942n2.mo3935a(172, i, 1, ClassC.f3254e);
                    return 1;
                case 175:
                    interfaceC0942n2.mo3935a(172, i, 1, ClassC.f3253d);
                    return 1;
                case 176:
                    interfaceC0942n2.mo3935a(172, i, 1, ClassC.f3267r);
                    return 1;
                case 177:
                case 191:
                case 194:
                case 195:
                    interfaceC0942n2.mo3935a(iM5445e, i, 1, ClassC.f3258i);
                    return 1;
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 187:
                case 189:
                case 192:
                case 193:
                    interfaceC0942n2.mo3934a(iM5445e, i, 3, this.f1873c.mo4971a(this.f1872b.m5446f(i + 1)), 0);
                    return 3;
                case 185:
                    interfaceC0942n2.mo3934a(iM5445e, i, 5, this.f1873c.mo4971a(this.f1872b.m5446f(i + 1)), this.f1872b.m5445e(i + 3) | (this.f1872b.m5445e(i + 4) << 8));
                    return 5;
                case 186:
                    interfaceC0942n2.mo3934a(iM5445e, i, 5, (ClassR) this.f1873c.mo4971a(this.f1872b.m5446f(i + 1)), 0);
                    return 5;
                case 188:
                    return m3986d(i, interfaceC0942n2);
                case 196:
                    return m3987e(i, interfaceC0942n2);
                case 197:
                    interfaceC0942n2.mo3934a(iM5445e, i, 4, this.f1873c.mo4971a(this.f1872b.m5446f(i + 1)), this.f1872b.m5445e(i + 3));
                    return 4;
                case 200:
                case 201:
                    interfaceC0942n2.mo3931a(iM5445e == 200 ? 167 : 168, i, 5, this.f1872b.m5442c(i + 1) + i);
                    return 5;
                default:
                    interfaceC0942n2.mo3930a(iM5445e, i, 1);
                    return 1;
            }
        } catch (al e) {
            e.m3757a("...at bytecode offset " + ClassK.m5480a(i));
            throw e;
        } catch (RuntimeException e2) {
            al c0925al = new al(e2);
            c0925al.m3757a("...at bytecode offset " + ClassK.m5480a(i));
            throw c0925al;
        }
    }

    public ClassE m3989a() {
        return this.f1872b;
    }

    public void m3990a(Interfacen interfaceC0942n) {
        int iM5436a = this.f1872b.m5436a();
        int iM3988a = 0;
        while (iM3988a < iM5436a) {
            iM3988a += m3988a(iM3988a, interfaceC0942n);
        }
    }

    public void m3991a(int[] iArr, Interfacen interfaceC0942n) {
        if (interfaceC0942n == null) {
            throw new NullPointerException("visitor == null");
        }
        while (true) {
            int iM5428d = ClassD.m5428d(iArr, 0);
            if (iM5428d < 0) {
                return;
            }
            ClassD.m5427c(iArr, iM5428d);
            m3988a(iM5428d, interfaceC0942n);
            interfaceC0942n.mo3929a(iM5428d);
        }
    }

    public int m3992b() {
        return this.f1872b.m5436a();
    }

    public int m3993c() {
        return this.f1872b.m5436a() + 4;
    }
}
