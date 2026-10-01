package a.g.a;

import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.Abstracti;
import a.b.d.ClassA;
import a.b.d.ClassH;
import a.d.ClassJ;
import a.d.a.Abstractbd;

class ClassF extends w implements d {

    final ClassA f785a;

    private ClassF(ClassA c0318a) {
        this.f785a = c0318a;
    }

    private int m2018a(int i, byte b, int i2, int i3) {
        switch (b) {
            case 89:
                return m2019a(i, i2, i3);
            case 90:
                return m2021b(i, i2, i3);
            case 91:
                return m2022c(i, i2, i3);
            case 92:
                return m2023d(i, i2, i3);
            case 93:
                return m2024e(i, i2, i3);
            case 94:
                return m2025f(i, i2, i3);
            case 95:
                return m2026g(i, i2, i3);
            default:
                throw new IllegalArgumentException("Not a dup/swap opcode [" + ((int) b) + "]");
        }
    }

    private int m2019a(int i, int i2, int i3) {
        boolean zM2124b = this.f785a.f732a.m2124b(i, i2);
        boolean zM2127c = this.f785a.f732a.m2127c(i, i3);
        boolean zM2127c2 = this.f785a.f732a.m2127c(i, i3 - 1);
        if (zM2127c) {
            return zM2127c2 ? 89 : 0;
        }
        return (zM2127c2 || !zM2124b) ? 0 : 87;
    }

    private boolean m2020a(Abstractc abstractC0048c) {
        return abstractC0048c.f147c >= 89 && abstractC0048c.f147c <= 95;
    }

    private int m2021b(int i, int i2, int i3) {
        boolean zM2124b = this.f785a.f732a.m2124b(i, i2);
        boolean zM2124b2 = this.f785a.f732a.m2124b(i, i2 - 1);
        boolean zM2127c = this.f785a.f732a.m2127c(i, i3);
        boolean zM2127c2 = this.f785a.f732a.m2127c(i, i3 - 1);
        boolean zM2127c3 = this.f785a.f732a.m2127c(i, i3 - 2);
        if (zM2127c2) {
            if (zM2127c3) {
                return zM2127c ? 90 : 95;
            }
            return (zM2127c || !zM2124b) ? 0 : 87;
        }
        if (!zM2124b2) {
            if (zM2127c3) {
                return zM2127c ? 89 : 0;
            }
            return (zM2127c || !zM2124b) ? 0 : 87;
        }
        if (zM2127c3) {
            return zM2127c ? 5855071 : 22367;
        }
        if (zM2127c) {
            return 22367;
        }
        return zM2124b ? 88 : 87;
    }

    private int m2022c(int i, int i2, int i3) {
        boolean zM2124b = this.f785a.f732a.m2124b(i, i2);
        boolean zM2124b2 = this.f785a.f732a.m2124b(i, i2 - 1);
        boolean zM2124b3 = this.f785a.f732a.m2124b(i, i2 - 2);
        boolean zM2127c = this.f785a.f732a.m2127c(i, i3);
        boolean zM2127c2 = this.f785a.f732a.m2127c(i, i3 - 1);
        boolean zM2127c3 = this.f785a.f732a.m2127c(i, i3 - 2);
        boolean zM2127c4 = this.f785a.f732a.m2127c(i, i3 - 3);
        if (zM2127c2) {
            if (zM2127c3) {
                if (zM2127c4) {
                    return zM2127c ? 91 : 22363;
                }
                return (!zM2127c && zM2124b) ? 87 : 0;
            }
            if (!zM2124b3) {
                if (zM2127c4) {
                    return zM2127c ? 90 : 95;
                }
                return (!zM2127c && zM2124b) ? 87 : 0;
            }
            if (zM2127c4) {
                return -1;
            }
            if (zM2127c) {
                return 5724253;
            }
            return zM2124b ? 5726039 : 22367;
        }
        if (!zM2124b2) {
            if (zM2127c3) {
                if (zM2127c4) {
                    return zM2127c ? 90 : 95;
                }
                return (!zM2127c && zM2124b) ? 87 : 0;
            }
            if (!zM2124b3) {
                if (zM2127c4) {
                    return zM2127c ? 89 : 0;
                }
                return (!zM2127c && zM2124b) ? 87 : 0;
            }
            if (zM2127c4) {
                return zM2127c ? 5855071 : 22367;
            }
            if (zM2127c) {
                return 22367;
            }
            return zM2124b ? 88 : 87;
        }
        if (zM2127c3) {
            if (zM2127c4) {
                return zM2127c ? 5920607 : 22619;
            }
            if (zM2127c) {
                return 22367;
            }
            return zM2124b ? 88 : 87;
        }
        if (zM2124b3) {
            if (zM2127c4) {
                return zM2127c ? -1 : 5789531;
            }
            if (zM2127c) {
                return 5789531;
            }
            return zM2124b ? 22360 : 88;
        }
        if (zM2127c4) {
            return zM2127c ? 5855071 : 22367;
        }
        if (zM2127c) {
            return 22367;
        }
        return zM2124b ? 88 : 87;
    }

    private int m2023d(int i, int i2, int i3) {
        boolean zM2124b = this.f785a.f732a.m2124b(i, i2);
        boolean zM2124b2 = this.f785a.f732a.m2124b(i, i2 - 1);
        boolean zM2127c = this.f785a.f732a.m2127c(i, i3);
        boolean zM2127c2 = this.f785a.f732a.m2127c(i, i3 - 1);
        boolean zM2127c3 = this.f785a.f732a.m2127c(i, i3 - 2);
        if (this.f785a.f732a.m2127c(i, i3 - 3)) {
            if (zM2127c3) {
                if (zM2127c2) {
                    return zM2127c ? 92 : 23135;
                }
                return !zM2127c ? 0 : 89;
            }
            if (zM2127c2) {
                if (zM2127c) {
                    return 6249055;
                }
                return zM2124b ? 22871 : 89;
            }
            if (!zM2127c && zM2124b) {
                return 87;
            }
            return 0;
        }
        if (zM2127c3) {
            if (zM2127c2) {
                return zM2127c ? 90 : 95;
            }
            if (zM2124b2) {
                return zM2127c ? 5855071 : 22367;
            }
            return zM2127c ? 87 : 0;
        }
        if (zM2127c2) {
            if (!zM2127c && zM2124b) {
                return 87;
            }
            return 0;
        }
        if (zM2124b2) {
            if (zM2127c) {
                return 22367;
            }
            return zM2124b ? 88 : 87;
        }
        if (!zM2127c && zM2124b) {
            return 87;
        }
        return 0;
    }

    private int m2024e(int i, int i2, int i3) {
        boolean zM2119a = this.f785a.f732a.m2119a(i, i2, i2 - 1);
        boolean zM2124b = this.f785a.f732a.m2124b(i, i2 - 2);
        boolean zM2125b = this.f785a.f732a.m2125b(i, i3, i3 - 1);
        boolean zM2127c = this.f785a.f732a.m2127c(i, i3 - 2);
        boolean zM2125b2 = this.f785a.f732a.m2125b(i, i3 - 3, i3 - 4);
        if (zM2127c) {
            if (zM2125b2) {
                return zM2125b ? 93 : 22621;
            }
            return (zM2125b || !zM2119a) ? 0 : 88;
        }
        if (!zM2124b) {
            if (zM2125b2) {
                return zM2125b ? 92 : 0;
            }
            return (zM2125b || !zM2119a) ? 0 : 88;
        }
        if (zM2125b2) {
            return zM2125b ? -1 : 5724253;
        }
        if (zM2125b) {
            return 5724253;
        }
        return zM2119a ? 22360 : 87;
    }

    private int m2025f(int i, int i2, int i3) {
        boolean zM2119a = this.f785a.f732a.m2119a(i, i2, i2 - 1);
        boolean zM2124b = this.f785a.f732a.m2124b(i, i2 - 2);
        boolean zM2124b2 = this.f785a.f732a.m2124b(i, i2 - 3);
        boolean zM2125b = this.f785a.f732a.m2125b(i, i3, i3 - 1);
        boolean zM2127c = this.f785a.f732a.m2127c(i, i3 - 2);
        boolean zM2127c2 = this.f785a.f732a.m2127c(i, i3 - 3);
        boolean zM2125b2 = this.f785a.f732a.m2125b(i, i3 - 4, i3 - 5);
        if (zM2127c) {
            if (zM2127c2) {
                if (zM2125b2) {
                    return zM2125b ? 94 : 22622;
                }
                return (!zM2125b && zM2119a) ? 88 : 0;
            }
            if (!zM2124b2) {
                if (zM2125b2) {
                    return zM2125b ? 93 : 22621;
                }
                return (!zM2125b && zM2119a) ? 88 : 0;
            }
            if (zM2125b2) {
                return zM2125b ? -1 : 5726046;
            }
            if (zM2125b) {
                return -1;
            }
            return zM2119a ? 5726040 : 22367;
        }
        if (!zM2124b) {
            if (zM2127c2) {
                if (zM2125b2) {
                    return zM2125b ? 93 : 22621;
                }
                return (!zM2125b && zM2119a) ? 88 : 0;
            }
            if (!zM2124b2) {
                if (zM2125b2) {
                    return zM2125b ? 92 : 0;
                }
                return (!zM2125b && zM2119a) ? 88 : 0;
            }
            if (zM2125b2) {
                return zM2125b ? -1 : 5724253;
            }
            if (zM2125b) {
                return 5724253;
            }
            return zM2119a ? 22360 : 87;
        }
        if (zM2127c2) {
            if (zM2125b2) {
                return zM2125b ? -1 : 5724254;
            }
            if (zM2125b) {
                return 5724253;
            }
            return zM2119a ? 22360 : 87;
        }
        if (zM2124b2) {
            if (zM2125b2) {
                return zM2125b ? -1 : 5789790;
            }
            if (zM2125b) {
                return 5789790;
            }
            return zM2119a ? 22616 : 88;
        }
        if (zM2125b2) {
            return zM2125b ? -1 : 5724253;
        }
        if (zM2125b) {
            return 5724253;
        }
        return zM2119a ? 22360 : 87;
    }

    private int m2026g(int i, int i2, int i3) {
        boolean zM2124b = this.f785a.f732a.m2124b(i, i2);
        boolean zM2124b2 = this.f785a.f732a.m2124b(i, i2 - 1);
        boolean zM2127c = this.f785a.f732a.m2127c(i, i3);
        boolean zM2127c2 = this.f785a.f732a.m2127c(i, i3 - 1);
        if (!zM2127c) {
            return zM2124b2 ? 22367 : 0;
        }
        if (zM2127c2) {
            return 95;
        }
        return zM2124b ? 87 : 0;
    }

    public void m2027a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassA c0042a) {
        if (!this.f785a.f732a.m2123b(i)) {
            m2028a(cVar, interfaceC0162j, dVar, i, (Abstractc) c0042a);
        } else {
            if (c0042a.mo349a(cVar) <= 0 || this.f785a.f732a.m2124b(i, this.f785a.f732a.m2128d(i).m1639b() - 1)) {
                return;
            }
            this.f785a.f741j.m311b(i, new ClassA((byte) -89, c0042a.f133a));
        }
    }

    public void m2028a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        if (!this.f785a.f732a.m2123b(i)) {
            if (this.f785a.f732a.m2126c(i)) {
                int iMo349a = abstractC0048c.mo349a(cVar);
                if (iMo349a > 0) {
                    int iB = this.f785a.f732a.m2128d(i).m1639b();
                    int i2 = 0;
                    for (int i3 = iB - iMo349a; i3 < iB; i3++) {
                        if (this.f785a.f732a.m2124b(i, i3)) {
                            i2++;
                        }
                    }
                    if (i2 > 0) {
                        this.f785a.m1899b(i, true, false, i2);
                    }
                }
                int iMo367b = abstractC0048c.mo367b(cVar);
                if (iMo367b > 0) {
                    ClassJ c0240jM2129e = this.f785a.f732a.m2129e(i);
                    int iB2 = c0240jM2129e.m1639b();
                    int i4 = 0;
                    for (int i5 = iB2 - iMo367b; i5 < iB2; i5++) {
                        if (this.f785a.f732a.m2127c(i, i5)) {
                            i4++;
                        }
                    }
                    if (i4 > 0) {
                        this.f785a.m1887a(i, true, false, c0240jM2129e.m1643c(0).mo1331j());
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int iMo349a2 = abstractC0048c.mo349a(cVar);
        if (iMo349a2 > 0) {
            ClassJ c0240jM2128d = this.f785a.f732a.m2128d(i);
            int iB3 = c0240jM2128d.m1639b();
            int i6 = 0;
            int i7 = 0;
            for (int i8 = iB3 - iMo349a2; i8 < iB3; i8++) {
                boolean zM2118a = this.f785a.f732a.m2118a(i, i8);
                boolean zM2124b = this.f785a.f732a.m2124b(i, i8);
                if (zM2118a) {
                    if (zM2124b) {
                        i6++;
                    }
                } else if (!zM2124b) {
                    i7++;
                }
            }
            if (i6 > 0) {
                this.f785a.m1899b(i, false, true, iMo349a2);
            }
            if (i7 > 0) {
                Abstractbd abstractC0206bdC = c0240jM2128d.m1643c(0);
                if (i7 > (abstractC0206bdC.mo1588b() ? 2 : 1)) {
                    throw new IllegalArgumentException("Unsupported stack size increment [" + i7 + "] at [" + i + "]");
                }
                this.f785a.m1887a(i, false, true, abstractC0206bdC.mo1331j());
            }
        }
        int iMo367b2 = abstractC0048c.mo367b(cVar);
        if (iMo367b2 > 0) {
            int iB4 = this.f785a.f732a.m2129e(i).m1639b();
            int i9 = 0;
            for (int i10 = iB4 - iMo367b2; i10 < iB4; i10++) {
                if (!this.f785a.f732a.m2127c(i, i10)) {
                    i9++;
                }
            }
            if (i9 > 0) {
                this.f785a.m1899b(i, false, false, i9);
            }
        }
    }

    public void m2029a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        Abstractc[] abstractC0048cArr;
        if (!this.f785a.f732a.m2123b(i) || !m2020a(c0053h)) {
            m2028a(cVar, interfaceC0162j, dVar, i, (Abstractc) c0053h);
            return;
        }
        int iB = this.f785a.f732a.m2128d(i).m1639b() - 1;
        int iB2 = this.f785a.f732a.m2129e(i).m1639b() - 1;
        byte b = c0053h.f147c;
        int iM2018a = m2018a(i, b, iB, iB2);
        if (iM2018a == -1) {
            throw new UnsupportedOperationException("Can't handle " + c0053h.toString() + " instruction at [" + i + "]");
        }
        if ((iM2018a & (-256)) == 0) {
            byte b2 = (byte) iM2018a;
            if (b2 == 0) {
                this.f785a.f741j.m314c(i);
                if (this.f785a.f734c != null) {
                    this.f785a.f734c.a((c) null, (Interfacej) null, (a.b.a.d) null, i, (ClassH) null);
                    return;
                }
                return;
            }
            if (b2 == b) {
                this.f785a.f741j.m317d(i);
                return;
            } else {
                this.f785a.f741j.m311b(i, new ClassH(b2));
                return;
            }
        }
        Abstractc[] abstractC0048cArr2 = new Abstractc[4];
        int i2 = 0;
        int i3 = iM2018a;
        while (i3 != 0) {
            abstractC0048cArr2[i2] = new ClassH((byte) i3);
            i3 >>>= 8;
            i2++;
        }
        if (i2 < 4) {
            abstractC0048cArr = new Abstractc[i2];
            System.arraycopy(abstractC0048cArr2, 0, abstractC0048cArr, 0, i2);
        } else {
            abstractC0048cArr = abstractC0048cArr2;
        }
        this.f785a.f741j.m316c(i, abstractC0048cArr);
    }

    public void m2030a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstracti abstractC0054i) {
        if (!this.f785a.f732a.m2123b(i)) {
            m2028a(cVar, interfaceC0162j, dVar, i, (Abstractc) abstractC0054i);
        } else {
            if (abstractC0054i.mo349a(cVar) <= 0 || this.f785a.f732a.m2124b(i, this.f785a.f732a.m2128d(i).m1639b() - 1)) {
                return;
            }
            this.f785a.f741j.m311b(i, new ClassA((byte) -89, abstractC0054i.f151b));
        }
    }
}
