package abcd;

@xu
public abstract class Abstracttc {

    @uu
    private static boolean f1501DW;

    @tu
    private static boolean f1502j6;

    @ru(field = -1456585251406249295L)
    protected Sa f1503EQ;

    @ru(field = 2159239594396043268L)
    protected final pa f1504FH;

    @ru(field = -639764972249128061L)
    protected final Ca f1505Hw;

    @ru(field = 2852311312572900777L)
    protected int f1506J0;

    @ru(field = 3878940098194349235L)
    protected int f1507J8;

    @ru(field = 4426913019366570801L)
    protected int[] f1508Mr;

    @ru(field = 1094939260146292405L)
    protected int[] f1509QX;

    @ru(field = 3790042629748569265L)
    protected int[] f1510U2;

    @ru(field = -771520953783836816L)
    private boolean f1511VH;

    @ru(field = 3133548740757660045L)
    protected int[] f1512Ws;

    @ru(field = -2692041844269217696L)
    protected int[] f1513XL;

    @ru(field = -2674072922617323039L)
    protected final Ba f1514Zo;

    @ru(field = 4030436532707917423L)
    protected int f1515a8;

    @ru(field = -1410840465421801275L)
    protected int[] f1516aM;

    @ru(field = -3411445788856780548L)
    private int f1517gn;

    @ru(field = 5203750808569409764L)
    protected int[] f1518j3;

    @ru(field = 2582965753194724296L)
    protected boolean f1519tp;

    @ru(field = -1455695039483370907L)
    private int f1520u7;

    @ru(field = 4806766380864976011L)
    protected final Ga f1521v5;

    @ru(field = -2636719083277406208L)
    protected int f1522we;

    static {
        wu.j6(Abstracttc.class, 124169490244666167L, 124169490244666167L);
    }

    public Abstracttc(Ga ga, Ca ca, Ba ba, pa paVar, int i, int i2) {
        if (f1502j6) {
            wu.j6(2556982381397340000L, (Object) null, new Object[]{ga, ca, ba, paVar, new Integer(i), new Integer(i2)});
        }
        this.f1510U2 = new int[10000];
        this.f1505Hw = ca;
        this.f1521v5 = ga;
        this.f1514Zo = ba;
        this.f1504FH = paVar;
        this.f1517gn = i;
        this.f1520u7 = i2;
    }

    @su(method = -108504334746612720L)
    protected int m3570DW(int i) {
        try {
            if (f1502j6) {
                wu.j6(-4552738793638896544L, this, i);
            }
            int i2 = this.f1506J0 + i;
            if (i2 < this.f1507J8) {
                return this.f1509QX[i2];
            }
            return 0;
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -4552738793638896544L, this, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = -3752348428494758548L)
    protected void m3571DW() {
        try {
            if (f1502j6) {
                wu.j6(-3235653410013790784L, this);
            }
            if (this.f1519tp) {
                int i = this.f1513XL[this.f1506J0];
                int i2 = this.f1518j3[this.f1506J0];
                int i3 = this.f1508Mr[this.f1506J0];
                String string = this.f1504FH.getString(this.f1522we);
                this.f1505Hw.DW(this.f1503EQ.VH(), this.f1503EQ.J8(), i, i2, i, i3, "错误的 </C>" + string + "<//C>", 0);
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -3235653410013790784L, this);
            }
            throw th;
        }
    }

    @su(method = 420587201319770496L)
    protected void m3572DW(int i, int i2) {
        int i3;
        int i4;
        try {
            if (f1502j6) {
                wu.j6(2597456785602609504L, this, new Integer(i), new Integer(i2));
            }
            if (this.f1511VH) {
                if (this.f1506J0 > 0) {
                    i3 = this.f1513XL[this.f1506J0 - 1];
                    i4 = this.f1508Mr[this.f1506J0 - 1];
                } else {
                    i3 = this.f1513XL[this.f1506J0];
                    i4 = this.f1518j3[this.f1506J0];
                }
                int i5 = i3;
                int i6 = i4;
                this.f1515a8++;
                if (this.f1515a8 >= this.f1510U2.length) {
                    int[] iArr = new int[(this.f1510U2.length * 2) + 1];
                    System.arraycopy(this.f1510U2, 0, iArr, 0, this.f1510U2.length);
                    this.f1510U2 = iArr;
                }
                this.f1510U2[this.f1515a8] = this.f1503EQ.j6(i, true, i2, i5, i6, i5, i6);
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, 2597456785602609504L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @su(method = -4063637893459125633L)
    protected void m3573DW(int i, boolean z, int i2) {
        try {
            if (f1502j6) {
                wu.j6(-2248176318411063717L, this, new Integer(i), new Boolean(z), new Integer(i2));
            }
            if (this.f1511VH) {
                int iJ6 = this.f1503EQ.j6(i, z, this.f1510U2, (this.f1515a8 - i2) + 1, i2, this.f1513XL[this.f1506J0], this.f1518j3[this.f1506J0]);
                this.f1515a8 = (this.f1515a8 - i2) + 1;
                if (this.f1515a8 >= this.f1510U2.length) {
                    int[] iArr = new int[(this.f1510U2.length * 2) + 1];
                    System.arraycopy(this.f1510U2, 0, iArr, 0, this.f1510U2.length);
                    this.f1510U2 = iArr;
                }
                this.f1510U2[this.f1515a8] = iJ6;
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -2248176318411063717L, this, new Integer(i), new Boolean(z), new Integer(i2));
            }
            throw th;
        }
    }

    @su(method = 577722138556150525L)
    protected int m3574FH() {
        try {
            if (f1502j6) {
                wu.j6(1994884584143556105L, this);
            }
            return this.f1509QX[this.f1506J0];
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, 1994884584143556105L, this);
            }
            throw th;
        }
    }

    @su(method = 46468429612263600L)
    protected void m3575FH(int i) {
        try {
            if (f1502j6) {
                wu.j6(-6601774980360144372L, this, i);
            }
            if (this.f1511VH) {
                this.f1515a8++;
                if (this.f1515a8 >= this.f1510U2.length) {
                    int[] iArr = new int[(this.f1510U2.length * 2) + 1];
                    System.arraycopy(this.f1510U2, 0, iArr, 0, this.f1510U2.length);
                    this.f1510U2 = iArr;
                }
                this.f1510U2[this.f1515a8] = this.f1503EQ.j6(i, true, this.f1513XL[this.f1506J0], this.f1518j3[this.f1506J0], this.f1508Mr[this.f1506J0]);
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -6601774980360144372L, this, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = -1472550081801976667L)
    protected void m3576FH(int i, int i2) {
        try {
            if (f1502j6) {
                wu.j6(-281104476381136211L, this, new Integer(i), new Integer(i2));
            }
            m3585j6(i, true, i2);
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -281104476381136211L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @su(method = 736691946851523505L)
    protected void m3577Hw() {
        try {
            if (f1502j6) {
                wu.j6(2118961078039041205L, this);
            }
            if (this.f1511VH) {
                this.f1515a8++;
                if (this.f1515a8 >= this.f1510U2.length) {
                    int[] iArr = new int[(this.f1510U2.length * 2) + 1];
                    System.arraycopy(this.f1510U2, 0, iArr, 0, this.f1510U2.length);
                    this.f1510U2 = iArr;
                }
                if (this.f1504FH.Zo(this.f1522we) || this.f1504FH.u7(this.f1522we)) {
                    this.f1510U2[this.f1515a8] = this.f1503EQ.j6(this.f1522we, false, this.f1509QX[this.f1506J0], this.f1513XL[this.f1506J0], this.f1518j3[this.f1506J0], this.f1516aM[this.f1506J0], this.f1508Mr[this.f1506J0]);
                } else if (this.f1504FH.we(this.f1522we)) {
                    this.f1510U2[this.f1515a8] = this.f1503EQ.j6(this.f1522we, false, this.f1513XL[this.f1506J0], this.f1518j3[this.f1506J0], this.f1516aM[this.f1506J0], this.f1508Mr[this.f1506J0]);
                } else {
                    this.f1510U2[this.f1515a8] = this.f1503EQ.j6(this.f1522we, false, this.f1513XL[this.f1506J0], this.f1518j3[this.f1506J0], this.f1508Mr[this.f1506J0]);
                }
            }
            if (this.f1506J0 < this.f1507J8) {
                this.f1506J0++;
                this.f1522we = this.f1512Ws[this.f1506J0];
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, 2118961078039041205L, this);
            }
            throw th;
        }
    }

    @su(method = -215528572066294264L)
    protected void m3578Hw(int i) {
        try {
            if (f1502j6) {
                wu.j6(-7749183810588027552L, this, i);
            }
            if (this.f1522we != i) {
                if (this.f1511VH) {
                    this.f1515a8++;
                    if (this.f1515a8 >= this.f1510U2.length) {
                        int[] iArr = new int[(this.f1510U2.length * 2) + 1];
                        System.arraycopy(this.f1510U2, 0, iArr, 0, this.f1510U2.length);
                        this.f1510U2 = iArr;
                    }
                    if (this.f1504FH.we(i)) {
                        this.f1510U2[this.f1515a8] = this.f1503EQ.j6(i, true, this.f1513XL[this.f1506J0], this.f1518j3[this.f1506J0], this.f1516aM[this.f1506J0], this.f1508Mr[this.f1506J0]);
                    } else {
                        this.f1510U2[this.f1515a8] = this.f1503EQ.j6(i, true, this.f1513XL[this.f1506J0], this.f1518j3[this.f1506J0], this.f1508Mr[this.f1506J0]);
                    }
                }
                mo3567j6(i);
                return;
            }
            if (this.f1511VH) {
                this.f1515a8++;
                if (this.f1515a8 >= this.f1510U2.length) {
                    int[] iArr2 = new int[(this.f1510U2.length * 2) + 1];
                    System.arraycopy(this.f1510U2, 0, iArr2, 0, this.f1510U2.length);
                    this.f1510U2 = iArr2;
                }
                if (this.f1504FH.we(this.f1522we)) {
                    this.f1510U2[this.f1515a8] = this.f1503EQ.j6(this.f1522we, false, this.f1513XL[this.f1506J0], this.f1518j3[this.f1506J0], this.f1516aM[this.f1506J0], this.f1508Mr[this.f1506J0]);
                } else {
                    this.f1510U2[this.f1515a8] = this.f1503EQ.j6(this.f1522we, false, this.f1513XL[this.f1506J0], this.f1518j3[this.f1506J0], this.f1508Mr[this.f1506J0]);
                }
            }
            if (this.f1506J0 < this.f1507J8) {
                this.f1506J0++;
                this.f1522we = this.f1512Ws[this.f1506J0];
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -7749183810588027552L, this, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = -366642762537592224L)
    protected void m3579Hw(int i, int i2) {
        try {
            if (f1502j6) {
                wu.j6(-5771426013190878856L, this, new Integer(i), new Integer(i2));
            }
            m3585j6(i, false, i2);
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -5771426013190878856L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @su(method = 4384934834712854128L)
    protected void m3580VH(int i) {
        int i2;
        int i3;
        try {
            if (f1502j6) {
                wu.j6(1678205529904752552L, this, i);
            }
            if (this.f1519tp) {
                if (this.f1506J0 > 0) {
                    i2 = this.f1516aM[this.f1506J0 - 1];
                    i3 = this.f1508Mr[this.f1506J0 - 1];
                } else {
                    i2 = this.f1513XL[this.f1506J0];
                    i3 = this.f1518j3[this.f1506J0];
                }
                int i4 = i3 - 1;
                int i5 = i4 + 2;
                String string = this.f1504FH.getString(i);
                this.f1505Hw.DW(this.f1503EQ.VH(), this.f1503EQ.J8(), i2, i4, i2, i5, "缺少 </C>" + string + "<//C>", 1);
                int i6 = i4 + 1;
                this.f1505Hw.j6(this.f1503EQ.VH(), this.f1503EQ.J8(), i2, i6, i2, i6, string, "插入 '" + string + "'");
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, 1678205529904752552L, this, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = 1958099669883580131L)
    protected int m3581Zo() {
        try {
            if (f1502j6) {
                wu.j6(1753937972425972563L, this);
            }
            return this.f1510U2[this.f1515a8];
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, 1753937972425972563L, this);
            }
            throw th;
        }
    }

    @su(method = -195057312006026288L)
    protected int m3582Zo(int i) {
        try {
            if (f1502j6) {
                wu.j6(-5609276059107571848L, this, i);
            }
            int i2 = this.f1506J0 + i;
            return i2 < this.f1507J8 ? this.f1512Ws[i2] : this.f1520u7;
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -5609276059107571848L, this, new Integer(i));
            }
            throw th;
        }
    }

    protected abstract void mo3566j6();

    @su(method = 863853519216458168L)
    protected void mo3567j6(int i) {
        int i2;
        int i3;
        try {
            if (f1502j6) {
                wu.j6(-910837666801806960L, this, i);
            }
            if (this.f1519tp) {
                if (this.f1506J0 > 0) {
                    i2 = this.f1516aM[this.f1506J0 - 1];
                    i3 = this.f1508Mr[this.f1506J0 - 1];
                } else {
                    i2 = this.f1513XL[this.f1506J0];
                    i3 = this.f1518j3[this.f1506J0];
                }
                int i4 = i3 - 1;
                int i5 = i4 + 2;
                String string = this.f1504FH.getString(i);
                this.f1505Hw.DW(this.f1503EQ.VH(), this.f1503EQ.J8(), i2, i4, i2, i5, "缺少 </C>" + string + "<//C>", 0);
                int i6 = i4 + 1;
                this.f1505Hw.j6(this.f1503EQ.VH(), this.f1503EQ.J8(), i2, i6, i2, i6, string, "插入 '" + string + "'");
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -910837666801806960L, this, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = 268959459321191925L)
    protected void m3583j6(int i, int i2) {
        try {
            if (f1502j6) {
                wu.j6(-4494260712112960779L, this, new Integer(i), new Integer(i2));
            }
            if (this.f1511VH) {
                this.f1515a8++;
                if (this.f1515a8 >= this.f1510U2.length) {
                    int[] iArr = new int[(this.f1510U2.length * 2) + 1];
                    System.arraycopy(this.f1510U2, 0, iArr, 0, this.f1510U2.length);
                    this.f1510U2 = iArr;
                }
                this.f1510U2[this.f1515a8] = this.f1503EQ.j6(i, true, i2, this.f1513XL[this.f1506J0], this.f1518j3[this.f1506J0], this.f1516aM[this.f1506J0], this.f1508Mr[this.f1506J0]);
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -4494260712112960779L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @su(method = -577752007578207501L)
    protected void m3584j6(int i, int i2, int i3) {
        int i4;
        int i5;
        try {
            if (f1502j6) {
                wu.j6(-3616143964656995205L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (this.f1511VH) {
                if (this.f1506J0 > 0) {
                    i4 = this.f1513XL[this.f1506J0 - 1];
                    i5 = this.f1508Mr[this.f1506J0 - 1];
                } else {
                    i4 = this.f1513XL[this.f1506J0];
                    i5 = this.f1518j3[this.f1506J0];
                }
                int iJ6 = this.f1503EQ.j6(i, false, this.f1510U2, ((this.f1515a8 - i3) - i2) + 1, i3, i4, i5);
                System.arraycopy(this.f1510U2, (this.f1515a8 - i2) + 1, this.f1510U2, ((this.f1515a8 - i2) - i3) + 2, i2);
                this.f1515a8 = (this.f1515a8 - i3) + 1;
                if (this.f1515a8 >= this.f1510U2.length) {
                    int[] iArr = new int[(this.f1510U2.length * 2) + 1];
                    System.arraycopy(this.f1510U2, 0, iArr, 0, this.f1510U2.length);
                    this.f1510U2 = iArr;
                }
                this.f1510U2[this.f1515a8 - i2] = iJ6;
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -3616143964656995205L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @su(method = 1064440989616909593L)
    protected void m3585j6(int i, boolean z, int i2) {
        int i3;
        int i4;
        try {
            if (f1502j6) {
                wu.j6(7916207218309642237L, this, new Integer(i), new Boolean(z), new Integer(i2));
            }
            if (this.f1511VH) {
                if (this.f1506J0 > 0) {
                    i3 = this.f1516aM[this.f1506J0 - 1];
                    i4 = this.f1508Mr[this.f1506J0 - 1];
                } else {
                    i3 = this.f1513XL[this.f1506J0];
                    i4 = this.f1518j3[this.f1506J0];
                }
                int iJ6 = this.f1503EQ.j6(i, z, this.f1510U2, (this.f1515a8 - i2) + 1, i2, i3, i4);
                this.f1515a8 = (this.f1515a8 - i2) + 1;
                if (this.f1515a8 >= this.f1510U2.length) {
                    int[] iArr = new int[(this.f1510U2.length * 2) + 1];
                    System.arraycopy(this.f1510U2, 0, iArr, 0, this.f1510U2.length);
                    this.f1510U2 = iArr;
                }
                this.f1510U2[this.f1515a8] = iJ6;
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, 7916207218309642237L, this, new Integer(i), new Boolean(z), new Integer(i2));
            }
            throw th;
        }
    }

    @su(method = 2329444839209796720L)
    protected void m3586j6(int i, boolean z, int i2, int i3) {
        int i4;
        int i5;
        try {
            if (f1502j6) {
                wu.j6(-2734554676045016088L, this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3));
            }
            if (this.f1511VH) {
                if (this.f1506J0 > 0) {
                    i4 = this.f1513XL[this.f1506J0 - 1];
                    i5 = this.f1508Mr[this.f1506J0 - 1];
                } else {
                    i4 = this.f1513XL[this.f1506J0];
                    i5 = this.f1518j3[this.f1506J0];
                }
                int i6 = i4;
                int i7 = i5;
                int iJ6 = i3 != -1 ? this.f1503EQ.j6(i, z, this.f1510U2, (this.f1515a8 - i2) + 1, i2, i6, i7, i3) : this.f1503EQ.j6(i, z, this.f1510U2, (this.f1515a8 - i2) + 1, i2, i6, i7);
                this.f1515a8 = (this.f1515a8 - i2) + 1;
                if (this.f1515a8 >= this.f1510U2.length) {
                    int[] iArr = new int[(this.f1510U2.length * 2) + 1];
                    System.arraycopy(this.f1510U2, 0, iArr, 0, this.f1510U2.length);
                    this.f1510U2 = iArr;
                }
                this.f1510U2[this.f1515a8] = iJ6;
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -2734554676045016088L, this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    public void mo3568j6(Wa wa, Da da, boolean z, Sa sa) {
        try {
            if (f1502j6) {
                wu.j6(-3281760867051586701L, this, wa, da, new Boolean(z), sa);
            }
            try {
                try {
                    sa.j6(wa);
                    this.f1512Ws = wa.FH;
                    this.f1509QX = wa.Hw;
                    this.f1513XL = wa.v5;
                    this.f1516aM = wa.Zo;
                    this.f1518j3 = wa.VH;
                    this.f1508Mr = wa.gn;
                    this.f1507J8 = wa.EQ - 1;
                    this.f1503EQ = sa;
                    this.f1519tp = z;
                    this.f1511VH = true;
                    this.f1515a8 = -1;
                    this.f1506J0 = 0;
                    this.f1522we = this.f1512Ws[0];
                    mo3566j6();
                    sa.DW(this.f1510U2[0]);
                    if (this.f1515a8 != 0) {
                        throw new RuntimeException("Corrupted syntax tree " + this.f1515a8 + "  Bottom-most syntaxtag: " + sa.P8(this.f1510U2[1]));
                    }
                    this.f1503EQ = null;
                    this.f1512Ws = null;
                    this.f1509QX = null;
                    this.f1513XL = null;
                    this.f1516aM = null;
                    this.f1518j3 = null;
                } catch (a unused) {
                    sa.DW(sa.j6(this.f1517gn, true, new int[0], 0, 0, 1, 1));
                    this.f1503EQ = null;
                    this.f1512Ws = null;
                    this.f1509QX = null;
                    this.f1513XL = null;
                    this.f1516aM = null;
                    this.f1518j3 = null;
                }
                this.f1508Mr = null;
            } catch (Throwable th) {
                this.f1503EQ = null;
                this.f1512Ws = null;
                this.f1509QX = null;
                this.f1513XL = null;
                this.f1516aM = null;
                this.f1518j3 = null;
                this.f1508Mr = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (f1501DW) {
                wu.j6(th2, -3281760867051586701L, this, wa, da, new Boolean(z), sa);
            }
            throw th2;
        }
    }

    @su(method = 1896356021634659457L)
    protected void mo3569j6(String str) {
        int i;
        int i2;
        try {
            if (f1502j6) {
                wu.j6(-4405401829567086295L, this, str);
            }
            if (this.f1519tp) {
                if (this.f1506J0 > 0) {
                    i = this.f1516aM[this.f1506J0 - 1];
                    i2 = this.f1508Mr[this.f1506J0 - 1];
                } else {
                    i = this.f1513XL[this.f1506J0];
                    i2 = this.f1518j3[this.f1506J0];
                }
                int i3 = i2 - 1;
                int i4 = i;
                this.f1505Hw.DW(this.f1503EQ.VH(), this.f1503EQ.J8(), i4, i3, i4, i3 + 2, str, 0);
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -4405401829567086295L, this, str);
            }
            throw th;
        }
    }

    @su(method = -757368751391587205L)
    protected void m3587v5() {
        try {
            if (f1502j6) {
                wu.j6(211340623713319919L, this);
            }
            if (this.f1506J0 < this.f1507J8) {
                this.f1506J0++;
                this.f1522we = this.f1512Ws[this.f1506J0];
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, 211340623713319919L, this);
            }
            throw th;
        }
    }

    @su(method = 1653945322325760596L)
    protected void m3588v5(int i) {
        try {
            if (f1502j6) {
                wu.j6(-580628100788316288L, this, i);
            }
            if (this.f1522we != i) {
                mo3567j6(i);
            } else if (this.f1506J0 < this.f1507J8) {
                this.f1506J0++;
                this.f1522we = this.f1512Ws[this.f1506J0];
            }
        } catch (Throwable th) {
            if (f1501DW) {
                wu.j6(th, -580628100788316288L, this, new Integer(i));
            }
            throw th;
        }
    }
}
