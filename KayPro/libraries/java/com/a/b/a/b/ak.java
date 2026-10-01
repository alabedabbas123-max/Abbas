package com.a.b.a.b;

import com.a.b.a.e.Interfaceg;
import com.a.b.a.e.Interfaceh;
import com.a.b.e.b.Abstractj;
import com.a.b.e.b.ClassA;
import com.a.b.e.b.aa;
import com.a.b.e.b.ac;
import com.a.b.e.b.ad;
import com.a.b.e.b.ae;
import com.a.b.e.b.af;
import com.a.b.e.b.ag;
import com.a.b.e.b.ClassI;
import com.a.b.e.b.ClassN;
import com.a.b.e.b.ClassR;
import com.a.b.e.b.ClassS;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.b.Interfaceah;
import com.a.b.e.c.Abstracta;
import com.a.b.e.c.aa;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassJ;
import com.a.b.e.c.ClassN;
import com.a.b.e.c.ClassP;
import com.a.b.e.c.ClassZ;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfaced;
import com.a.b.e.d.Interfacee;
import com.a.b.g.ClassN;
import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;
import java.util.ArrayList;

final class ak extends ap {

    private static final ae f1816a = new ae(ClassC.m5059c("java/lang/reflect/Array"));

    private static final ClassZ f1817b = new ClassZ(f1816a, new aa(new ad("newInstance"), new ad("(Ljava/lang/Class;[I)Ljava/lang/Object;")));

    private final ab f1818c;

    private final ClassO f1819d;

    private final Interfaceh f1820e;

    private final Interfaceah f1821f;

    private final int f1822g;

    private final ArrayList f1823h;

    private Interfacee f1824i;

    private boolean f1825j;

    private boolean f1826k;

    private int f1827l;

    private int f1828m;

    private boolean f1829n;

    private boolean f1830o;

    private aa f1831p;

    private aa f1832q;

    private ad f1833r;

    public ak(ab c0915ab, ClassO c0943o, Interfaceah interfaceC1174ah, Interfaceh interfaceC0973h) {
        super(c0943o.mo4005j());
        if (interfaceC0973h == null) {
            throw new NullPointerException("methods == null");
        }
        if (c0915ab == null) {
            throw new NullPointerException("ropper == null");
        }
        if (interfaceC1174ah == null) {
            throw new NullPointerException("advice == null");
        }
        this.f1818c = c0915ab;
        this.f1819d = c0943o;
        this.f1820e = interfaceC0973h;
        this.f1821f = interfaceC1174ah;
        this.f1822g = c0943o.m4007l();
        this.f1823h = new ArrayList(25);
        this.f1824i = null;
        this.f1825j = false;
        this.f1826k = false;
        this.f1827l = -1;
        this.f1828m = 0;
        this.f1830o = false;
        this.f1832q = null;
        this.f1833r = null;
    }

    private int m3891a(int i, Abstracta abstractC1200a) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
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
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case ByteOps.ISTORE_3:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 98:
            case 99:
            case 101:
            case 102:
            case 103:
            case 105:
            case 106:
            case 107:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 117:
            case 118:
            case 119:
            case 121:
            case 123:
            case 125:
            case 127:
            case 129:
            case 131:
            case 168:
            case 169:
            case 170:
            case 173:
            case 174:
            case 175:
            case 176:
            case 196:
            case 197:
            default:
                throw new RuntimeException("shouldn't happen");
            case 18:
            case 20:
                return 5;
            case 21:
            case 54:
                return 2;
            case 46:
                return 38;
            case 79:
                return 39;
            case 96:
            case 132:
                return 14;
            case 100:
                return 15;
            case 104:
                return 16;
            case 108:
                return 17;
            case 112:
                return 18;
            case 116:
                return 19;
            case 120:
                return 23;
            case 122:
                return 24;
            case 124:
                return 25;
            case 126:
                return 20;
            case 128:
                return 21;
            case 130:
                return 22;
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
                return 29;
            case 145:
                return 30;
            case 146:
                return 31;
            case 147:
                return 32;
            case 148:
            case 149:
            case 151:
                return 27;
            case 150:
            case 152:
                return 28;
            case 153:
            case 159:
            case 165:
            case 198:
                return 7;
            case 154:
            case 160:
            case 166:
            case 199:
                return 8;
            case 155:
            case 161:
                return 9;
            case 156:
            case 162:
                return 10;
            case 157:
            case 163:
                return 12;
            case 158:
            case 164:
                return 11;
            case 167:
                return 6;
            case 171:
                return 13;
            case 172:
            case 177:
                return 33;
            case 178:
                return 46;
            case 179:
                return 48;
            case 180:
                return 45;
            case 181:
                return 47;
            case 182:
                ClassZ c1233z = (ClassZ) abstractC1200a;
                if (c1233z.m5022n().equals(this.f1819d.mo4004i())) {
                    for (int i2 = 0; i2 < this.f1820e.m4193d_(); i2++) {
                        Interfaceg interfaceC0972gMo4192a = this.f1820e.mo4192a(i2);
                        if (ClassA.m4731e(interfaceC0972gMo4192a.mo4002g()) && c1233z.m5023o().equals(interfaceC0972gMo4192a.mo3999d())) {
                            return 52;
                        }
                    }
                }
                return c1233z.m4986l() ? 58 : 50;
            case 183:
                ClassZ c1233z2 = (ClassZ) abstractC1200a;
                return (c1233z2.m4984j() || c1233z2.m5022n().equals(this.f1819d.mo4004i())) ? 52 : 51;
            case 184:
                return 49;
            case 185:
                return 53;
            case 186:
                return 59;
            case 187:
                return 40;
            case 188:
            case 189:
                return 41;
            case 190:
                return 34;
            case 191:
                return 35;
            case 192:
                return 43;
            case 193:
                return 44;
            case 194:
                return 36;
            case 195:
                return 37;
        }
    }

    private Abstractj m3892a(aa c1167aa, ad c1170ad, ClassX c1197x, Interfacee interfaceC1238e, Abstracta abstractC1200a) {
        return new ClassN(c1167aa, c1170ad, c1197x, interfaceC1238e, (ClassZ) abstractC1200a);
    }

    private ClassX m3893a(int i, int i2) {
        ClassX c1197x;
        int iC = m3813c();
        if (iC == 0) {
            return ClassX.f3113a;
        }
        int iJ = m3822j();
        if (iJ < 0) {
            c1197x = new ClassX(iC);
            for (int i3 = 0; i3 < iC; i3++) {
                ClassU c1194uM4876a = ClassU.m4876a(i2, m3814c(i3));
                c1197x.m4915a(i3, c1194uM4876a);
                i2 += c1194uM4876a.m4898k();
            }
            switch (i) {
                case 79:
                    if (iC != 3) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    ClassU c1194uM4916b = c1197x.m4916b(0);
                    ClassU c1194uM4916b2 = c1197x.m4916b(1);
                    c1197x.m4915a(0, c1197x.m4916b(2));
                    c1197x.m4915a(1, c1194uM4916b);
                    c1197x.m4915a(2, c1194uM4916b2);
                    break;
                    break;
                case 181:
                    if (iC != 2) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    ClassU c1194uM4916b3 = c1197x.m4916b(0);
                    c1197x.m4915a(0, c1197x.m4916b(1));
                    c1197x.m4915a(1, c1194uM4916b3);
                    break;
                    break;
            }
        } else {
            c1197x = new ClassX(1);
            c1197x.m4915a(0, ClassU.m4876a(iJ, m3814c(0)));
        }
        c1197x.mo3944c_();
        return c1197x;
    }

    private void m3894a(aa c1167aa, ad c1170ad) {
        if (c1167aa == null) {
            throw new NullPointerException("op == null");
        }
        if (c1170ad == null) {
            throw new NullPointerException("pos == null");
        }
        if (this.f1832q == null) {
            this.f1832q = c1167aa;
            this.f1833r = c1170ad;
        } else {
            if (this.f1832q != c1167aa) {
                throw new al("return op mismatch: " + c1167aa + ", " + this.f1832q);
            }
            if (c1170ad.m4799a() > this.f1833r.m4799a()) {
                this.f1833r = c1170ad;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x039a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void mo3895a(ClassQ c0945q, int i, int i2) {
        ClassX c1197xM4921f;
        ClassS c1192s;
        ClassU c1194u;
        aa c1167aaM4749a;
        Abstracta abstractC1200aM4964b;
        Abstracta abstractC1200aM5001a;
        int i3;
        Abstractj c1192s2;
        int iM4020b = c0945q.m4039d().m4020b() + this.f1822g;
        ClassX c1197xM3893a = m3893a(i2, iM4020b);
        int iD_ = c1197xM3893a.m5476d_();
        super.mo3895a(c0945q, i, i2);
        ad c1170adM3995a = this.f1819d.m3995a(i);
        ClassU c1194uB = m3808b(i2 == 54);
        int iL = m3824l();
        if (iL == 0) {
            c1194uB = null;
            switch (i2) {
                case 87:
                case 88:
                    return;
            }
        }
        if (c1194uB == null) {
            if (iL != 1) {
                int iM3873a = this.f1818c.m3873a();
                ClassU[] c1194uArr = new ClassU[iD_];
                for (int i4 = 0; i4 < iD_; i4++) {
                    ClassU c1194uM4916b = c1197xM3893a.m4916b(i4);
                    Interfaced interfaceC1237dM4895h = c1194uM4916b.m4895h();
                    ClassU c1194uM4890b = c1194uM4916b.m4890b(iM3873a);
                    this.f1823h.add(new ClassS(ac.m4751a(interfaceC1237dM4895h), c1170adM3995a, c1194uM4890b, c1194uM4916b));
                    c1194uArr[i4] = c1194uM4890b;
                    iM3873a += c1194uM4916b.m4898k();
                }
                for (int iE = m3817e(); iE != 0; iE >>= 4) {
                    ClassU c1194u2 = c1194uArr[(iE & 15) - 1];
                    Interfaced interfaceC1237dM4895h2 = c1194u2.m4895h();
                    this.f1823h.add(new ClassS(ac.m4751a(interfaceC1237dM4895h2), c1170adM3995a, c1194u2.m4890b(iM4020b), c1194u2));
                    iM4020b += interfaceC1237dM4895h2.mo3825a().m5066j();
                }
                return;
            }
            c1194uB = ClassU.m4876a(iM4020b, m3816d(0));
        }
        Interfaced interfaceC1237d = c1194uB != null ? c1194uB : ClassC.f3258i;
        Abstracta abstractC1200aF = m3818f();
        if (i2 == 197) {
            this.f1830o = true;
            this.f1828m = 6;
            ClassU c1194uM4876a = ClassU.m4876a(c1194uB.m4897j(), ClassC.f3245J);
            this.f1823h.add(new af(ac.m4752a(ClassC.f3245J, iD_), c1170adM3995a, c1197xM3893a, this.f1824i, ae.f3146q));
            this.f1823h.add(new ClassS(ac.m4764d(ClassC.f3245J), c1170adM3995a, c1194uM4876a, ClassX.f3113a));
            int i5 = 0;
            ClassC c1236cM4966i = ((ae) abstractC1200aF).m4966i();
            while (i5 < iD_) {
                i5++;
                c1236cM4966i = c1236cM4966i.m5077u();
            }
            ClassU c1194uM4876a2 = ClassU.m4876a(c1194uB.m4894g(), ClassC.f3262m);
            this.f1823h.add(c1236cM4966i.m5070n() ? new af(ac.f3022cw, c1170adM3995a, ClassX.f3113a, this.f1824i, ClassN.m4999a(c1236cM4966i)) : new af(ac.f3039q, c1170adM3995a, ClassX.f3113a, this.f1824i, new ae(c1236cM4966i)));
            this.f1823h.add(new ClassS(ac.m4767e(c1194uM4876a2.mo3825a()), c1170adM3995a, c1194uM4876a2, ClassX.f3113a));
            ClassU c1194uM4876a3 = ClassU.m4876a(c1194uB.m4894g(), ClassC.f3267r);
            this.f1823h.add(new af(ac.m4750a(f1817b.m4983i()), c1170adM3995a, ClassX.m4910a(c1194uM4876a2, c1194uM4876a), this.f1824i, f1817b));
            this.f1823h.add(new ClassS(ac.m4764d(f1817b.m4983i().m5041b()), c1170adM3995a, c1194uM4876a3, ClassX.f3113a));
            i2 = 192;
            c1197xM4921f = ClassX.m4909a(c1194uM4876a3);
        } else if (i2 == 168) {
            this.f1829n = true;
            return;
        } else {
            if (i2 == 169) {
                try {
                    this.f1831p = (aa) m3814c(0);
                    return;
                } catch (ClassCastException e) {
                    throw new RuntimeException("Argument to RET was not a ReturnAddress", e);
                }
            }
            c1197xM4921f = c1197xM3893a;
        }
        int iM3891a = m3891a(i2, abstractC1200aF);
        aa c1167aaM4749a2 = ac.m4749a(iM3891a, interfaceC1237d, c1197xM4921f, abstractC1200aF);
        if (c1194uB != null && c1167aaM4749a2.m4741e()) {
            this.f1828m++;
            c1192s = new ClassS(ac.m4764d(c1167aaM4749a2.m4737a() == 59 ? ((ClassJ) abstractC1200aF).m4993b() : ((ClassZ) abstractC1200aF).m4983i().m5041b()), c1170adM3995a, c1194uB, ClassX.f3113a);
            c1194u = null;
        } else if (c1194uB == null || !c1167aaM4749a2.m4744h()) {
            c1192s = null;
            c1194u = c1194uB;
        } else {
            this.f1828m++;
            c1192s = new ClassS(ac.m4767e(c1194uB.m4895h()), c1170adM3995a, c1194uB, ClassX.f3113a);
            c1194u = null;
        }
        if (iM3891a == 41) {
            c1167aaM4749a = c1167aaM4749a2;
            abstractC1200aM4964b = ae.m4964b(c1167aaM4749a2.m4738b());
        } else if (abstractC1200aF == null && iD_ == 2) {
            Interfaced interfaceC1237dM4895h3 = c1197xM4921f.m4916b(0).m4895h();
            Interfaced interfaceC1237dM4895h4 = c1197xM4921f.m4916b(1).m4895h();
            if ((interfaceC1237dM4895h4.mo3830f() || interfaceC1237dM4895h3.mo3830f()) && this.f1821f.mo4811a(c1167aaM4749a2, c1197xM4921f.m4916b(0), c1197xM4921f.m4916b(1))) {
                if (interfaceC1237dM4895h4.mo3830f()) {
                    Abstracta abstractC1200a = (Abstracta) interfaceC1237dM4895h4;
                    c1197xM4921f = c1197xM4921f.m4922g();
                    if (c1167aaM4749a2.m4737a() == 15) {
                        i3 = 14;
                        abstractC1200aM5001a = ClassP.m5001a(-((ClassP) interfaceC1237dM4895h4).m5002i_());
                    } else {
                        abstractC1200aM5001a = abstractC1200a;
                        i3 = iM3891a;
                    }
                } else {
                    c1197xM4921f = c1197xM4921f.m4921f();
                    abstractC1200aM5001a = (Abstracta) interfaceC1237dM4895h3;
                    i3 = iM3891a;
                }
                abstractC1200aM4964b = abstractC1200aM5001a;
                c1167aaM4749a = ac.m4749a(i3, interfaceC1237d, c1197xM4921f, abstractC1200aM5001a);
                iM3891a = i3;
            } else {
                c1167aaM4749a = c1167aaM4749a2;
                abstractC1200aM4964b = abstractC1200aF;
            }
        } else {
            c1167aaM4749a = c1167aaM4749a2;
            abstractC1200aM4964b = abstractC1200aF;
        }
        ao c0928aoH = m3820h();
        ArrayList arrayListI = m3821i();
        boolean zM4744h = c1167aaM4749a.m4744h();
        this.f1830o |= zM4744h;
        if (c0928aoH != null) {
            if (c0928aoH.m3938a() == 0) {
                c1192s2 = new ClassS(ac.f3041s, c1170adM3995a, (ClassU) null, ClassX.f3113a);
                this.f1827l = 0;
            } else {
                ClassN c1316nM3946e = c0928aoH.m3946e();
                c1192s2 = new ae(c1167aaM4749a, c1170adM3995a, c1194u, c1197xM4921f, c1316nM3946e);
                this.f1827l = c1316nM3946e.m5496b();
            }
        } else if (iM3891a == 33) {
            if (c1197xM4921f.m5476d_() != 0) {
                ClassU c1194uM4916b2 = c1197xM4921f.m4916b(0);
                Interfaced interfaceC1237dM4895h5 = c1194uM4916b2.m4895h();
                if (c1194uM4916b2.m4894g() != 0) {
                    this.f1823h.add(new ClassS(ac.m4751a(interfaceC1237dM4895h5), c1170adM3995a, ClassU.m4876a(0, interfaceC1237dM4895h5), c1194uM4916b2));
                }
            }
            c1192s2 = new ClassS(ac.f3041s, c1170adM3995a, (ClassU) null, ClassX.f3113a);
            this.f1827l = 0;
            m3894a(c1167aaM4749a, c1170adM3995a);
            this.f1826k = true;
        } else if (abstractC1200aM4964b != null) {
            if (zM4744h) {
                Abstractj abstractC1183jM3892a = c1167aaM4749a.m4737a() == 58 ? m3892a(c1167aaM4749a, c1170adM3995a, c1197xM4921f, this.f1824i, abstractC1200aM4964b) : new af(c1167aaM4749a, c1170adM3995a, c1197xM4921f, this.f1824i, abstractC1200aM4964b);
                this.f1825j = true;
                this.f1827l = this.f1824i.mo4148d_();
                c1192s2 = abstractC1183jM3892a;
            } else {
                c1192s2 = new ClassR(c1167aaM4749a, c1170adM3995a, c1194u, c1197xM4921f, abstractC1200aM4964b);
            }
        } else if (zM4744h) {
            c1192s2 = new ag(c1167aaM4749a, c1170adM3995a, c1197xM4921f, this.f1824i);
            this.f1825j = true;
            if (i2 == 191) {
                this.f1827l = -1;
            } else {
                this.f1827l = this.f1824i.mo4148d_();
            }
        } else {
            c1192s2 = new ClassS(c1167aaM4749a, c1170adM3995a, c1194u, c1197xM4921f);
        }
        this.f1823h.add(c1192s2);
        if (c1192s != null) {
            this.f1823h.add(c1192s);
        }
        if (arrayListI != null) {
            this.f1828m++;
            this.f1823h.add(new ClassI(ac.f2999cY, c1170adM3995a, ClassX.m4909a(c1192s.m4842h()), arrayListI, abstractC1200aM4964b));
        }
    }

    public void m3896a(Interfacee interfaceC1238e) {
        this.f1824i = interfaceC1238e;
        this.f1823h.clear();
        this.f1825j = false;
        this.f1826k = false;
        this.f1827l = 0;
        this.f1828m = 0;
        this.f1830o = false;
        this.f1829n = false;
        this.f1831p = null;
    }

    public ArrayList m3897m() {
        return this.f1823h;
    }

    public aa m3898n() {
        return this.f1832q;
    }

    public ad m3899o() {
        return this.f1833r;
    }

    public boolean m3900p() {
        return this.f1825j;
    }

    public boolean m3901q() {
        return this.f1826k;
    }

    public int m3902r() {
        return this.f1827l;
    }

    public int m3903s() {
        return this.f1828m;
    }

    public boolean m3904t() {
        return this.f1830o;
    }

    public boolean m3905u() {
        return this.f1829n;
    }

    public boolean m3906v() {
        return this.f1831p != null;
    }

    public aa m3907w() {
        return this.f1831p;
    }
}
