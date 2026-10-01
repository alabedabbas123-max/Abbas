package abcd;

import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.android.dx.io.Opcodes;

@xu
public class pe extends Abstracttc {

    @tu
    private static boolean f1487lg;

    @uu
    private static boolean f1488rN;

    @ru(field = 2807000347218565205L)
    private final qe f1489BT;

    @ru(field = 2476953408972858905L)
    private boolean f1490KD;

    @ru(field = 19999675408803419L)
    private final boolean f1491P8;

    @ru(field = 2123274564022500024L)
    private int f1492SI;

    @ru(field = -1205933645060729321L)
    private Kb f1493cn;

    @ru(field = -253996847833957045L)
    private int[] f1494ei;

    @ru(field = 299627670920894732L)
    private final Ga f1495er;

    @ru(field = 2137297501770656040L)
    private final Ba f1496gW;

    @ru(field = -873092328741712624L)
    private int[] f1497nw;

    @ru(field = -5652248516190801072L)
    private Kb f1498ro;

    @ru(field = -5168631366583819885L)
    private ie f1499vy;

    @ru(field = -4395402725631823584L)
    private final Ca f1500yS;

    static {
        wu.j6(pe.class, 2696428590087455179L, 2696428590087455179L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(ie ieVar, Ga ga, Ca ca, Ba ba, qe qeVar, boolean z) {
        super(ga, ca, ba, qeVar, Opcodes.DIV_DOUBLE_2ADDR, 0);
        if (f1487lg) {
            wu.j6(1333569799875153720L, (Object) null, new Object[]{ieVar, ga, ca, ba, qeVar, new Boolean(z)});
        }
        this.f1494ei = new int[10000];
        this.f1497nw = new int[10000];
        this.f1498ro = new Kb();
        this.f1493cn = new Kb();
        this.f1499vy = ieVar;
        this.f1495er = ga;
        this.f1500yS = ca;
        this.f1496gW = ba;
        this.f1489BT = qeVar;
        this.f1491P8 = z;
        this.f1498ro.DW(ga.j6("BR"), 12);
        this.f1498ro.DW(ga.j6("AREA"), 12);
        this.f1498ro.DW(ga.j6("LINK"), 12);
        this.f1498ro.DW(ga.j6("IMG"), 12);
        this.f1498ro.DW(ga.j6("LINK"), 12);
        this.f1498ro.DW(ga.j6("PARAM"), 12);
        this.f1498ro.DW(ga.j6("HR"), 12);
        this.f1498ro.DW(ga.j6("P"), 4);
        this.f1498ro.DW(ga.j6("DT"), 4);
        this.f1498ro.DW(ga.j6("DD"), 4);
        this.f1498ro.DW(ga.j6("LI"), 4);
        this.f1498ro.DW(ga.j6("INPUT"), 12);
        this.f1498ro.DW(ga.j6("OPTION"), 4);
        this.f1498ro.DW(ga.j6("THEAD"), 4);
        this.f1498ro.DW(ga.j6("TFOOT"), 4);
        this.f1498ro.DW(ga.j6("COLGROUP"), 4);
        this.f1498ro.DW(ga.j6("COL"), 12);
        this.f1498ro.DW(ga.j6("TR"), 4);
        this.f1498ro.DW(ga.j6("TH"), 4);
        this.f1498ro.DW(ga.j6("TD"), 4);
        this.f1498ro.DW(ga.j6("BASE"), 12);
        this.f1498ro.DW(ga.j6("META"), 12);
        this.f1498ro.DW(ga.j6("BODY"), 4);
        this.f1498ro.DW(ga.j6("TBODY"), 4);
        this.f1498ro.DW(ga.j6("HEAD"), 4);
        this.f1498ro.DW(ga.j6("HTML"), 4);
        this.f1498ro.Hw.DW();
        while (this.f1498ro.Hw.j6()) {
            this.f1493cn.DW(this.f1498ro.Hw.FH(), this.f1498ro.Hw.Hw());
        }
        this.f1493cn.DW(ga.j6("BASEFONT"), 12);
        this.f1493cn.DW(ga.j6("FRAME"), 12);
        this.f1493cn.DW(ga.j6("ISINDEX"), 12);
        new ie(ca, ga);
    }

    @su(method = 635766177258176640L)
    private void m3519BT() {
        try {
            if (f1487lg) {
                wu.j6(1808972345005612344L, this);
            }
            m3577Hw();
            m3588v5(2);
            m3577Hw();
            int i = this.f1510U2[this.f1515a8];
            if (!m3524KD() && m3549j6(this.f1503EQ.Mr(i), this.f1503EQ.a8(i), this.f1503EQ.U2(i), "XHTML")) {
                this.f1490KD = true;
            }
            if (this.f1522we == 2) {
                m3587v5();
            }
            if (this.f1522we != 37) {
                m3579Hw(Opcodes.XOR_INT_LIT16, 2);
            } else {
                m3577Hw();
                m3579Hw(Opcodes.XOR_INT_LIT16, 3);
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 1808972345005612344L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0029 A[Catch: Throwable -> 0x0037, TryCatch #0 {Throwable -> 0x0037, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000d, B:15:0x001e, B:18:0x0024, B:22:0x0030, B:20:0x0029, B:21:0x002d, B:23:0x0033), top: B:32:0x0005 }] */
    @su(method = -3270535570670136316L)
    private int m3520DW(boolean z) {
        try {
            if (f1487lg) {
                wu.j6(45079695959964732L, this, z);
            }
            int i = 0;
            while (true) {
                int i2 = this.f1522we;
                if (i2 != 2) {
                    if (i2 == 40) {
                        m3547j3();
                    } else if (i2 != 75 && i2 != 100) {
                        switch (i2) {
                            case 70:
                            case 71:
                                m3558u7();
                                break;
                            case 72:
                            case 73:
                                if (z) {
                                    m3558u7();
                                }
                                break;
                            default:
                                break;
                        }
                    } else {
                        m3558u7();
                    }
                    i++;
                } else {
                    m3587v5();
                }
            }
            return i;
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 45079695959964732L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @su(method = -479623824004049076L)
    private void m3521EQ() {
        try {
            if (f1487lg) {
                wu.j6(-4427080287675678524L, this);
            }
            m3577Hw();
            if (this.f1522we == 2) {
                m3587v5();
            }
            int i = 0;
            if (this.f1522we == 25) {
                m3577Hw();
                i = 1;
            }
            while (true) {
                int i2 = this.f1522we;
                if (i2 == 2) {
                    m3587v5();
                } else if (i2 != 26) {
                    m3578Hw(76);
                    m3579Hw(300, i + 2);
                    return;
                } else {
                    m3563we();
                    i++;
                }
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -4427080287675678524L, this);
            }
            throw th;
        }
    }

    @su(method = -206533744219250973L)
    private void m3522J0() {
        try {
            if (f1487lg) {
                wu.j6(1686065605880339255L, this);
            }
            int i = this.f1522we;
            if (i != 16 && i != 17) {
                if (i == 26) {
                    m3577Hw();
                    m3579Hw(305, 1);
                    return;
                } else {
                    m3526P8();
                    m3579Hw(305, 1);
                    m3550lg();
                    return;
                }
            }
            int i2 = this.f1522we;
            m3577Hw();
            int i3 = 0;
            while (this.f1522we != 0 && this.f1522we == 18) {
                m3577Hw();
                i3++;
            }
            m3578Hw(i2);
            m3579Hw(305, i3 + 2);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 1686065605880339255L, this);
            }
            throw th;
        }
    }

    @su(method = -598140290476783152L)
    private void m3523J8() {
        try {
            if (f1487lg) {
                wu.j6(318734335971974656L, this);
            }
            m3577Hw();
            m3578Hw(78);
            m3578Hw(76);
            m3579Hw(306, 3);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 318734335971974656L, this);
            }
            throw th;
        }
    }

    @su(method = -2329592476199817801L)
    private boolean m3524KD() {
        try {
            if (f1487lg) {
                wu.j6(-3600743194614054325L, this);
            }
            return this.f1491P8 || this.f1490KD;
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -3600743194614054325L, this);
            }
            throw th;
        }
    }

    @su(method = 2118506138460182625L)
    private void m3525Mr() {
        try {
            if (f1487lg) {
                wu.j6(329419703417923229L, this);
            }
            m3577Hw();
            m3588v5(2);
            m3577Hw();
            if (this.f1522we == 2) {
                m3587v5();
            }
            int i = this.f1522we;
            boolean z = true;
            if (i == 8) {
                z = false;
            } else {
                if (i == 39) {
                    m3587v5();
                    if (this.f1522we == 2) {
                        m3587v5();
                    }
                    m3578Hw(8);
                    m3579Hw(Opcodes.AND_INT_LIT16, 3);
                    return;
                }
                if (i != 35) {
                    if (i != 36) {
                        m3571DW();
                    } else if (m3582Zo(2) == 37) {
                        m3519BT();
                    } else {
                        m3552rN();
                        m3587v5();
                    }
                    z = false;
                } else if (m3582Zo(2) == 37) {
                    m3562vy();
                } else {
                    m3552rN();
                    m3587v5();
                    z = false;
                }
            }
            if (this.f1522we == 2) {
                m3587v5();
            }
            if (this.f1522we == 39) {
                m3587v5();
                if (this.f1522we == 2) {
                    m3587v5();
                }
            }
            m3578Hw(8);
            m3579Hw(Opcodes.AND_INT_LIT16, z ? 4 : 3);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 329419703417923229L, this);
            }
            throw th;
        }
    }

    @su(method = 104254998471910720L)
    private void m3526P8() {
        try {
            if (f1487lg) {
                wu.j6(-83869335575872000L, this);
            }
            m3572DW(26, this.f1495er.j6(""));
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -83869335575872000L, this);
            }
            throw th;
        }
    }

    @su(method = -278829639512454171L)
    private void m3527QX() {
        try {
            if (f1487lg) {
                wu.j6(-272628408630211271L, this);
            }
            m3577Hw();
            m3577Hw();
            if (this.f1522we == 23) {
                m3577Hw();
            } else {
                m3580VH(23);
                m3575FH(23);
            }
            m3579Hw(Opcodes.MUL_DOUBLE_2ADDR, 3);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -272628408630211271L, this);
            }
            throw th;
        }
    }

    @su(method = -3685190568893848735L)
    private boolean m3528SI() {
        try {
            if (!f1487lg) {
                return false;
            }
            wu.j6(7703329555308962253L, this);
            return false;
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 7703329555308962253L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0166 A[Catch: Throwable -> 0x0176, TryCatch #0 {Throwable -> 0x0176, blocks: (B:3:0x0007, B:5:0x000b, B:6:0x000e, B:9:0x001d, B:11:0x0023, B:14:0x0061, B:15:0x0075, B:27:0x008e, B:28:0x0091, B:32:0x009e, B:33:0x00aa, B:34:0x00b3, B:36:0x00c4, B:38:0x00ca, B:63:0x0150, B:39:0x00d2, B:41:0x00dc, B:43:0x00e2, B:44:0x00e5, B:62:0x014d, B:45:0x00e9, B:47:0x00ef, B:48:0x010a, B:50:0x0110, B:52:0x0123, B:55:0x0133, B:56:0x0137, B:58:0x013d, B:60:0x0143, B:61:0x014a, B:65:0x0156, B:66:0x015d, B:51:0x0119, B:67:0x015e, B:70:0x0169, B:68:0x0162, B:69:0x0166, B:71:0x016c, B:12:0x0035, B:13:0x0049), top: B:80:0x0007 }] */
    @su(method = 1321864341692128215L)
    private void m3529U2() {
        int iJ6;
        int iJ7;
        int iJ8;
        int iM3570DW;
        try {
            if (f1487lg) {
                wu.j6(211642640317223211L, this);
            }
            m3578Hw(7);
            if (this.f1522we != 25) {
                m3564yS();
                iJ6 = this.f1495er.j6("");
                m3572DW(25, iJ6);
                m3575FH(49);
                iJ7 = this.f1495er.j6("");
                m3572DW(25, iJ7);
            } else if (m3582Zo(1) == 49) {
                iJ6 = m3574FH();
                m3577Hw();
                m3577Hw();
                iJ7 = m3574FH();
                m3577Hw();
            } else {
                iJ6 = this.f1495er.j6("");
                m3572DW(25, iJ6);
                m3575FH(49);
                iJ7 = m3574FH();
                m3577Hw();
            }
            m3579Hw(Opcodes.RSUB_INT_LIT8, 3);
            int iHw = this.f1495er.Hw(iJ6);
            int iHw2 = this.f1495er.Hw(iJ7);
            int i = 0;
            while (true) {
                int i2 = this.f1522we;
                if (i2 != 2) {
                    if (i2 == 26) {
                        m3532Ws();
                    } else if (i2 == 40) {
                        m3547j3();
                    } else if (i2 != 50) {
                        if (i2 != 75 && i2 != 100) {
                            switch (i2) {
                                case 70:
                                case 71:
                                case 72:
                                case 73:
                                    break;
                                default:
                                    int i3 = i + 2;
                                    int i4 = this.f1522we;
                                    if (i4 != 8) {
                                        if (i4 == 12) {
                                            m3577Hw();
                                            m3579Hw(201, i3 + 1);
                                            return;
                                        } else {
                                            mo3567j6(8);
                                            m3575FH(12);
                                            m3579Hw(201, i3 + 1);
                                            return;
                                        }
                                    }
                                    m3577Hw();
                                    m3579Hw(200, i3 + 1);
                                    if (iJ6 == this.f1495er.j6("") && m3560u7(iHw2)) {
                                        m3551nw();
                                        m3545gn(iJ7);
                                    } else {
                                        m3559u7(iHw, iHw2);
                                        m3548j6(false);
                                        if (this.f1522we == 0) {
                                            if (!m3561v5(iHw, iHw2)) {
                                                m3534Zo(iJ6, iJ7);
                                            }
                                            m3531VH(iJ6, iJ7);
                                        } else if (m3582Zo(1) != 25) {
                                            m3577Hw();
                                            m3564yS();
                                            m3572DW(25, iHw);
                                            m3575FH(49);
                                            m3572DW(25, iHw2);
                                            m3576FH(Opcodes.RSUB_INT_LIT8, 3);
                                            m3575FH(8);
                                            m3579Hw(Opcodes.REM_DOUBLE_2ADDR, 3);
                                        } else {
                                            if (m3582Zo(2) == 49) {
                                                iJ8 = m3570DW(1);
                                                iM3570DW = m3570DW(3);
                                            } else {
                                                iJ8 = this.f1495er.j6("");
                                                iM3570DW = m3570DW(1);
                                            }
                                            int iHw3 = this.f1495er.Hw(iJ8);
                                            int iHw4 = this.f1495er.Hw(iM3570DW);
                                            if (iHw4 == iHw2 && iHw3 == iHw) {
                                                m3543gW();
                                            } else {
                                                if (!m3557tp(iHw3, iHw4)) {
                                                    throw new RuntimeException("Non-open closing tag found in element()");
                                                }
                                                if (m3561v5(iHw, iHw2)) {
                                                    m3545gn(iJ7);
                                                } else {
                                                    m3534Zo(iJ6, iJ7);
                                                    m3531VH(iJ6, iJ7);
                                                }
                                            }
                                        }
                                        m3537cb();
                                    }
                                    m3579Hw(Opcodes.MUL_INT_LIT16, 3);
                                    return;
                            }
                        }
                        m3558u7();
                    } else {
                        m3532Ws();
                    }
                    i++;
                } else {
                    m3587v5();
                }
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 211642640317223211L, this);
            }
            throw th;
        }
    }

    @su(method = 3806929098110415555L)
    private void m3530VH() {
        try {
            if (f1487lg) {
                wu.j6(-3175365506678172353L, this);
            }
            m3577Hw();
            if (this.f1522we != 77) {
                m3578Hw(76);
                m3579Hw(301, 2);
            } else {
                m3577Hw();
                m3578Hw(76);
                m3579Hw(301, 3);
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -3175365506678172353L, this);
            }
            throw th;
        }
    }

    @su(method = 1318012910322962607L)
    private void m3531VH(int i, int i2) {
        try {
            if (f1487lg) {
                wu.j6(353168381969270227L, this, new Integer(i), new Integer(i2));
            }
            boolean z = false;
            if (this.f1506J0 > 0 && this.f1512Ws[this.f1506J0 - 1] == 15) {
                this.f1506J0--;
                z = true;
            }
            m3575FH(11);
            m3572DW(25, i);
            m3575FH(49);
            m3572DW(25, i2);
            m3576FH(Opcodes.RSUB_INT_LIT8, 3);
            m3575FH(8);
            m3576FH(Opcodes.REM_DOUBLE_2ADDR, 3);
            if (z) {
                this.f1506J0++;
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 353168381969270227L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @su(method = -2764687439684604291L)
    private void m3532Ws() {
        int iJ6;
        int iM3574FH;
        try {
            if (f1487lg) {
                wu.j6(2451154229618410153L, this);
            }
            if (m3582Zo(1) == 49) {
                iJ6 = m3574FH();
                m3577Hw();
                m3578Hw(49);
                iM3574FH = m3574FH();
                m3577Hw();
            } else {
                iJ6 = this.f1495er.j6("");
                m3572DW(26, iJ6);
                m3575FH(49);
                iM3574FH = m3574FH();
                m3577Hw();
            }
            m3579Hw(Opcodes.MUL_INT_LIT8, 3);
            int iM3520DW = m3555sh() ? m3520DW(true) + 0 : 0;
            if (this.f1522we == 13) {
                m3578Hw(13);
                int iM3520DW2 = iM3520DW + m3520DW(false);
                m3533XL();
                m3579Hw(Opcodes.ADD_DOUBLE_2ADDR, iM3520DW2 + 3);
                return;
            }
            m3575FH(13);
            m3572DW(26, iJ6);
            m3575FH(49);
            m3572DW(26, iM3574FH);
            m3576FH(Opcodes.MUL_INT_LIT8, 3);
            m3576FH(Opcodes.SUB_DOUBLE_2ADDR, 1);
            m3579Hw(Opcodes.ADD_DOUBLE_2ADDR, 3);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 2451154229618410153L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x007f A[Catch: Throwable -> 0x00a3, TryCatch #0 {Throwable -> 0x00a3, blocks: (B:3:0x0005, B:5:0x0009, B:6:0x000c, B:20:0x002d, B:22:0x0037, B:24:0x003e, B:26:0x0045, B:28:0x004c, B:30:0x0053, B:31:0x0059, B:33:0x005d, B:39:0x006b, B:40:0x006e, B:41:0x0071, B:42:0x0075, B:44:0x007c, B:43:0x0079, B:45:0x007f, B:46:0x0083, B:48:0x008b, B:49:0x008f, B:50:0x0096, B:51:0x009a), top: B:60:0x0005 }] */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x006b. Please report as an issue. */
    @su(method = -5016388748517073648L)
    private void m3533XL() {
        try {
            if (f1487lg) {
                wu.j6(4292650597932965280L, this);
            }
            int i = this.f1522we;
            if (i != 16 && i != 17) {
                if (i == 26 || i == 50) {
                    m3539dx();
                    m3579Hw(Opcodes.SUB_DOUBLE_2ADDR, 1);
                    return;
                }
                if (i == 72) {
                    m3544gn();
                    m3579Hw(Opcodes.SUB_DOUBLE_2ADDR, 1);
                    return;
                }
                if (i == 74) {
                    m3523J8();
                    m3579Hw(Opcodes.SUB_DOUBLE_2ADDR, 1);
                    return;
                } else if (i == 303) {
                    m3556tp();
                    m3579Hw(Opcodes.SUB_DOUBLE_2ADDR, 1);
                    return;
                } else {
                    m3541ei();
                    m3579Hw(Opcodes.SUB_DOUBLE_2ADDR, 1);
                    m3550lg();
                    return;
                }
            }
            int i2 = this.f1522we;
            m3577Hw();
            int i3 = 0;
            while (this.f1522we != 0) {
                int i4 = this.f1522we;
                if (i4 == 20) {
                    m3577Hw();
                } else if (i4 != 22) {
                    if (i4 != 100) {
                        switch (i4) {
                            case 16:
                            case 17:
                                break;
                            case 18:
                                m3577Hw();
                                break;
                            default:
                                switch (i4) {
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 75:
                                        m3558u7();
                                        break;
                                    case 74:
                                        m3523J8();
                                        break;
                                    default:
                                        m3571DW();
                                        break;
                                }
                                break;
                        }
                        m3578Hw(i2);
                        m3579Hw(Opcodes.SUB_DOUBLE_2ADDR, i3 + 2);
                    }
                    m3558u7();
                } else if (m3582Zo(1) == 21) {
                    m3527QX();
                } else {
                    m3542er();
                    m3587v5();
                }
                i3++;
            }
            m3578Hw(i2);
            m3579Hw(Opcodes.SUB_DOUBLE_2ADDR, i3 + 2);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 4292650597932965280L, this);
            }
            throw th;
        }
    }

    @su(method = 2582153735453504512L)
    private void m3534Zo(int i, int i2) {
        int i3;
        int i4;
        String str;
        try {
            if (f1487lg) {
                wu.j6(5864449322446462032L, this, new Integer(i), new Integer(i2));
            }
            if (this.f1506J0 > 0) {
                i3 = this.f1516aM[this.f1506J0 - 1];
                i4 = this.f1508Mr[this.f1506J0 - 1];
            } else {
                i3 = this.f1513XL[this.f1506J0];
                i4 = this.f1518j3[this.f1506J0];
            }
            int i5 = i3;
            int i6 = i4;
            if (i == this.f1495er.j6("")) {
                str = "</" + this.f1495er.j6(i2) + ">";
            } else {
                str = "</" + this.f1495er.j6(i) + Config.TRACE_TODAY_VISIT_SPLIT + this.f1495er.j6(i2) + ">";
            }
            String str2 = str;
            mo3569j6("Expected " + str2);
            if (this.f1519tp) {
                this.f1500yS.j6(this.f1503EQ.VH(), this.f1503EQ.J8(), i5, i6, i5, i6, str2, "Insert " + str2);
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 5864449322446462032L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @su(method = -4617834369079632575L)
    private void m3535a8() {
        try {
            if (f1487lg) {
                wu.j6(3860216808666997933L, this);
            }
            m3577Hw();
            m3577Hw();
            m3578Hw(28);
            m3579Hw(Opcodes.MUL_DOUBLE_2ADDR, 3);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 3860216808666997933L, this);
            }
            throw th;
        }
    }

    @su(method = 2503338296119588783L)
    private void m3536aM() {
        try {
            if (f1487lg) {
                wu.j6(-1765797397332424725L, this);
            }
            m3577Hw();
            if (this.f1522we != 6) {
                m3578Hw(5);
                m3579Hw(Opcodes.RSUB_INT, 2);
            } else {
                m3577Hw();
                m3578Hw(5);
                m3579Hw(Opcodes.RSUB_INT, 3);
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -1765797397332424725L, this);
            }
            throw th;
        }
    }

    @su(method = 2100082160186763276L)
    private void m3537cb() {
        try {
            if (f1487lg) {
                wu.j6(1961464005460496100L, this);
            }
            this.f1492SI--;
            if (this.f1492SI >= -1) {
            } else {
                throw new InternalError("tag stack corruption");
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 1961464005460496100L, this);
            }
            throw th;
        }
    }

    @su(method = -5847020503116374661L)
    private boolean m3538cn() {
        try {
            if (f1487lg) {
                wu.j6(602106912744337215L, this);
            }
            return m3582Zo(0) == 34 && m3582Zo(1) == 2 && m3582Zo(2) == 38;
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 602106912744337215L, this);
            }
            throw th;
        }
    }

    @su(method = -55306226279532800L)
    private void m3539dx() {
        try {
            if (f1487lg) {
                wu.j6(3018598428864255040L, this);
            }
            if (m3582Zo(1) == 49) {
                m3574FH();
                m3577Hw();
                m3578Hw(49);
                m3574FH();
                m3577Hw();
            } else {
                m3572DW(26, this.f1495er.j6(""));
                m3575FH(49);
                m3574FH();
                m3577Hw();
            }
            m3579Hw(Opcodes.MUL_INT_LIT8, 3);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 3018598428864255040L, this);
            }
            throw th;
        }
    }

    @su(method = 977010856115937600L)
    private void m3540ef() {
        try {
            if (f1487lg) {
                wu.j6(-84727185843536848L, this);
            }
            this.f1490KD = true;
            m3577Hw();
            if (this.f1522we != 33) {
                m3578Hw(32);
                m3579Hw(Opcodes.REM_INT_LIT16, 2);
            } else {
                m3577Hw();
                m3578Hw(32);
                m3579Hw(Opcodes.REM_INT_LIT16, 3);
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -84727185843536848L, this);
            }
            throw th;
        }
    }

    @su(method = 932070319418425808L)
    private void m3541ei() {
        try {
            if (f1487lg) {
                wu.j6(-1257497241168487104L, this);
            }
            m3572DW(26, this.f1495er.j6(""));
            m3572DW(49, this.f1495er.j6(""));
            m3572DW(26, this.f1495er.j6(""));
            m3576FH(Opcodes.MUL_INT_LIT8, 3);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -1257497241168487104L, this);
            }
            throw th;
        }
    }

    @su(method = -336666737155665973L)
    private void m3542er() {
        try {
            if (f1487lg) {
                wu.j6(-1802753764231956697L, this);
            }
            m3565DW("缺少实体名");
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -1802753764231956697L, this);
            }
            throw th;
        }
    }

    @su(method = 155193003450460976L)
    private void m3543gW() {
        try {
            if (f1487lg) {
                wu.j6(490496885142451200L, this);
            }
            m3578Hw(11);
            if (m3582Zo(1) == 49) {
                m3577Hw();
                m3577Hw();
                m3577Hw();
            } else {
                m3572DW(25, this.f1495er.j6(""));
                m3575FH(49);
                m3577Hw();
            }
            m3579Hw(Opcodes.RSUB_INT_LIT8, 3);
            int iM3520DW = m3520DW(true);
            m3578Hw(8);
            m3579Hw(Opcodes.REM_DOUBLE_2ADDR, iM3520DW + 3);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 490496885142451200L, this);
            }
            throw th;
        }
    }

    @su(method = -571991942200170084L)
    private void m3544gn() {
        try {
            if (f1487lg) {
                wu.j6(-34832790989287116L, this);
            }
            m3577Hw();
            if (this.f1522we != 77) {
                m3578Hw(76);
                m3579Hw(302, 2);
            } else {
                m3577Hw();
                m3578Hw(76);
                m3579Hw(302, 3);
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -34832790989287116L, this);
            }
            throw th;
        }
    }

    @su(method = 2017468052794212480L)
    private void m3545gn(int i) {
        try {
            if (f1487lg) {
                wu.j6(1125695056493717080L, this, i);
            }
            boolean z = false;
            if (this.f1506J0 > 0 && this.f1512Ws[this.f1506J0 - 1] == 15) {
                this.f1506J0--;
                z = true;
            }
            m3575FH(11);
            m3572DW(25, this.f1495er.j6(""));
            m3575FH(49);
            m3572DW(25, i);
            m3576FH(Opcodes.RSUB_INT_LIT8, 3);
            m3575FH(8);
            m3576FH(Opcodes.ADD_INT_LIT16, 3);
            if (z) {
                this.f1506J0++;
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 1125695056493717080L, this, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = 3539972932719341200L)
    private void m3546gn(int i, int i2) {
        try {
            if (f1487lg) {
                wu.j6(5443692474207081600L, this, new Integer(i), new Integer(i2));
            }
            m3575FH(7);
            m3572DW(25, i);
            m3575FH(49);
            m3572DW(25, i2);
            m3576FH(Opcodes.RSUB_INT_LIT8, 3);
            m3575FH(8);
            m3576FH(200, 3);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 5443692474207081600L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    @su(method = -225668675932866820L)
    private void m3547j3() {
        try {
            if (f1487lg) {
                wu.j6(-487941828752970556L, this);
            }
            m3577Hw();
            int i = 0;
            while (true) {
                int i2 = this.f1522we;
                if (i2 == 41 || i2 == 42) {
                    m3577Hw();
                } else {
                    if (i2 != 75 && i2 != 100) {
                        switch (i2) {
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                                break;
                            default:
                                if (this.f1522we == 45) {
                                    m3577Hw();
                                } else {
                                    m3578Hw(44);
                                }
                                m3579Hw(Opcodes.ADD_INT_LIT8, i + 2);
                                return;
                        }
                        if (f1488rN) {
                            wu.j6(th, -487941828752970556L, this);
                        }
                        throw th;
                    }
                    m3558u7();
                    continue;
                }
                i++;
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -487941828752970556L, this);
            }
            throw th;
        }
    }

    @su(method = 1236514551446537955L)
    private void m3548j6(boolean z) {
        int iJ6;
        int iM3570DW;
        try {
            if (f1487lg) {
                wu.j6(5405929383823743L, this, z);
            }
            int i = 0;
            while (this.f1522we != 0) {
                int i2 = this.f1522we;
                if (i2 == 4) {
                    m3536aM();
                } else if (i2 == 7) {
                    m3529U2();
                } else {
                    if (i2 == 11) {
                        if (m3582Zo(1) == 25) {
                            if (m3582Zo(2) == 49) {
                                iJ6 = m3570DW(1);
                                iM3570DW = m3570DW(3);
                            } else {
                                iJ6 = this.f1495er.j6("");
                                iM3570DW = m3570DW(1);
                            }
                            if (z) {
                                m3546gn(iJ6, iM3570DW);
                                m3551nw();
                                m3543gW();
                                m3579Hw(Opcodes.MUL_INT_LIT16, 3);
                            } else {
                                if (!m3557tp(this.f1495er.Hw(iJ6), this.f1495er.Hw(iM3570DW))) {
                                    m3546gn(iJ6, iM3570DW);
                                    m3551nw();
                                    m3543gW();
                                    m3579Hw(Opcodes.MUL_INT_LIT16, 3);
                                }
                            }
                        } else if (z) {
                            m3587v5();
                            m3564yS();
                        }
                        m3579Hw(Opcodes.DIV_INT_LIT16, i);
                    }
                    if (i2 == 24) {
                        m3577Hw();
                    } else if (i2 != 34) {
                        if (i2 != 40) {
                            if (i2 != 75 && i2 != 100) {
                                if (i2 == 14 || i2 == 15) {
                                    m3577Hw();
                                } else if (i2 != 27) {
                                    if (i2 == 28) {
                                        m3577Hw();
                                    } else if (i2 == 30) {
                                        m3540ef();
                                    } else if (i2 != 31) {
                                        switch (i2) {
                                            case 46:
                                            case 48:
                                                m3577Hw();
                                                break;
                                            case 47:
                                                m3577Hw();
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                        break;
                                                    default:
                                                        m3571DW();
                                                        m3587v5();
                                                        continue;
                                                }
                                                break;
                                        }
                                    } else {
                                        m3554sG();
                                    }
                                } else if (m3582Zo(1) == 29) {
                                    m3535a8();
                                } else {
                                    m3577Hw();
                                }
                            }
                            m3558u7();
                        } else {
                            m3547j3();
                        }
                    } else if (m3538cn()) {
                        m3525Mr();
                    } else {
                        m3571DW();
                        m3587v5();
                    }
                }
                i++;
            }
            m3579Hw(Opcodes.DIV_INT_LIT16, i);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 5405929383823743L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @su(method = -430922552309027889L)
    private boolean m3549j6(char[] cArr, int i, int i2, String str) {
        try {
            if (f1487lg) {
                wu.j6(769511385396704675L, this, cArr, new Integer(i), new Integer(i2), str);
            }
            for (int i3 = 0; i3 < i2 - str.length(); i3++) {
                for (int i4 = 0; i4 < str.length(); i4++) {
                    if (Character.toUpperCase(cArr[i + i3 + i4]) != str.charAt(i4)) {
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 769511385396704675L, this, cArr, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @su(method = -759018113577647560L)
    private void m3550lg() {
        try {
            if (f1487lg) {
                wu.j6(1658975754984091768L, this);
            }
            mo3569j6("需要属性值");
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 1658975754984091768L, this);
            }
            throw th;
        }
    }

    @su(method = -3812376229139812155L)
    private void m3551nw() {
        try {
            if (f1487lg) {
                wu.j6(-4137885996064603935L, this);
            }
            m3576FH(Opcodes.DIV_INT_LIT16, 0);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -4137885996064603935L, this);
            }
            throw th;
        }
    }

    @su(method = -2167170908170414208L)
    private void m3552rN() {
        try {
            if (f1487lg) {
                wu.j6(404030174872094400L, this);
            }
            mo3569j6("缺少 DOCTYPE 文本");
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 404030174872094400L, this);
            }
            throw th;
        }
    }

    @su(method = 520094756709608256L)
    private void m3553ro() {
        try {
            if (f1487lg) {
                wu.j6(29321400142394304L, this);
            }
            m3577Hw();
            if (this.f1522we != 77) {
                m3578Hw(76);
                m3579Hw(320, 2);
            } else {
                m3577Hw();
                m3578Hw(76);
                m3579Hw(320, 3);
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 29321400142394304L, this);
            }
            throw th;
        }
    }

    @su(method = -747911321154254943L)
    private void m3554sG() {
        try {
            if (f1487lg) {
                wu.j6(-474720042319093419L, this);
            }
            m3587v5();
            if (this.f1522we == 33) {
                m3587v5();
            } else {
                mo3567j6(33);
            }
            m3588v5(32);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -474720042319093419L, this);
            }
            throw th;
        }
    }

    @su(method = -1614880530507905271L)
    private boolean m3555sh() {
        try {
            if (f1487lg) {
                wu.j6(-2973454859323713667L, this);
            }
            int i = 0;
            while (true) {
                int iM3582Zo = m3582Zo(i);
                if (iM3582Zo != 2) {
                    if (iM3582Zo == 13) {
                        return true;
                    }
                    if (iM3582Zo != 100 && iM3582Zo != 44 && iM3582Zo != 45 && iM3582Zo != 70 && iM3582Zo != 71) {
                        switch (iM3582Zo) {
                            case 40:
                            case 41:
                            case 42:
                                continue;
                            default:
                                switch (iM3582Zo) {
                                    case 75:
                                    case 76:
                                    case 77:
                                        break;
                                    default:
                                        return false;
                                }
                                break;
                        }
                    }
                }
                i++;
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -2973454859323713667L, this);
            }
            throw th;
        }
    }

    @su(method = -709435003496642304L)
    private void m3556tp() {
        try {
            if (f1487lg) {
                wu.j6(-375451614685429776L, this);
            }
            m3577Hw();
            if (this.f1522we != 77) {
                m3578Hw(76);
                m3579Hw(303, 2);
            } else {
                m3577Hw();
                m3578Hw(76);
                m3579Hw(303, 3);
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -375451614685429776L, this);
            }
            throw th;
        }
    }

    @su(method = -132461058858353900L)
    private boolean m3557tp(int i, int i2) {
        try {
            if (f1487lg) {
                wu.j6(-907071535982540180L, this, new Integer(i), new Integer(i2));
            }
            for (int i3 = 0; i3 <= this.f1492SI; i3++) {
                if (this.f1497nw[i3] == i2 && this.f1494ei[i3] == i) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -907071535982540180L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @su(method = 2003991096871996024L)
    private void m3558u7() {
        try {
            if (f1487lg) {
                wu.j6(-934639821420569712L, this);
            }
            int i = this.f1522we;
            if (i == 75) {
                m3577Hw();
                return;
            }
            if (i == 100) {
                m3553ro();
                return;
            }
            switch (i) {
                case 70:
                    m3521EQ();
                    return;
                case 71:
                    m3530VH();
                    return;
                case 72:
                    m3544gn();
                    return;
                case 73:
                    m3556tp();
                    return;
                default:
                    throw new RuntimeException("Expeted ASP content token");
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -934639821420569712L, this);
            }
            throw th;
        }
    }

    @su(method = 453864645101318031L)
    private void m3559u7(int i, int i2) {
        try {
            if (f1487lg) {
                wu.j6(-217027098242920589L, this, new Integer(i), new Integer(i2));
            }
            this.f1492SI++;
            if (this.f1492SI >= this.f1497nw.length) {
                int[] iArr = new int[(this.f1497nw.length * 2) + 1];
                System.arraycopy(this.f1497nw, 0, iArr, 0, this.f1497nw.length);
                this.f1497nw = iArr;
                int[] iArr2 = new int[(this.f1494ei.length * 2) + 1];
                System.arraycopy(this.f1494ei, 0, iArr2, 0, this.f1494ei.length);
                this.f1494ei = iArr2;
            }
            this.f1497nw[this.f1492SI] = i2;
            this.f1494ei[this.f1492SI] = i;
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -217027098242920589L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @su(method = -516739911278363088L)
    private boolean m3560u7(int i) {
        try {
            if (f1487lg) {
                wu.j6(2306659841560672L, this, i);
            }
            if (m3524KD()) {
                return false;
            }
            Kb kb = m3528SI() ? this.f1498ro : this.f1493cn;
            return kb.DW(i) && (kb.FH(i) & 8) != 0;
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 2306659841560672L, this, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = -1719549147889339129L)
    private boolean m3561v5(int i, int i2) {
        try {
            if (f1487lg) {
                wu.j6(486345633620564635L, this, new Integer(i), new Integer(i2));
            }
            if (m3524KD() || i != this.f1495er.j6("")) {
                return false;
            }
            Kb kb = m3528SI() ? this.f1498ro : this.f1493cn;
            return kb.DW(i2) && (kb.FH(i2) & 4) != 0;
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 486345633620564635L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @su(method = -394461868347411848L)
    private void m3562vy() {
        try {
            if (f1487lg) {
                wu.j6(884180032201906200L, this);
            }
            m3577Hw();
            m3588v5(2);
            m3577Hw();
            m3579Hw(Opcodes.OR_INT_LIT16, 2);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 884180032201906200L, this);
            }
            throw th;
        }
    }

    @su(method = -453814113285509648L)
    private void m3563we() {
        try {
            if (f1487lg) {
                wu.j6(-5709696301283242536L, this);
            }
            m3577Hw();
            if (this.f1522we == 2) {
                m3587v5();
            }
            if (this.f1522we != 13) {
                m3579Hw(304, 1);
                return;
            }
            m3578Hw(13);
            if (this.f1522we == 2) {
                m3587v5();
            }
            m3522J0();
            m3579Hw(304, 3);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -5709696301283242536L, this);
            }
            throw th;
        }
    }

    @su(method = 2630684488426727328L)
    private void m3564yS() {
        try {
            if (f1487lg) {
                wu.j6(5982573566176813056L, this);
            }
            mo3569j6("缺少标记名");
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, 5982573566176813056L, this);
            }
            throw th;
        }
    }

    @su(method = -584985485661317604L)
    protected void m3565DW(String str) {
        try {
            if (f1487lg) {
                wu.j6(-3306963461962627500L, this, str);
            }
            if (this.f1519tp) {
                int i = this.f1506J0;
                while (i > 0) {
                    i--;
                    if (this.f1512Ws[i] != 2) {
                        break;
                    }
                }
                int i2 = this.f1516aM[i];
                int i3 = this.f1508Mr[i] - 1;
                this.f1500yS.DW(this.f1503EQ.VH(), this.f1503EQ.J8(), i2, i3, i2, i3 + 2, str, 1);
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -3306963461962627500L, this, str);
            }
            throw th;
        }
    }

    @Override
    @su(method = -720323764815924984L)
    protected void mo3566j6() {
        try {
            if (f1487lg) {
                wu.j6(-4409876803959209360L, this);
            }
            this.f1490KD = false;
            m3548j6(true);
            m3579Hw(Opcodes.DIV_DOUBLE_2ADDR, 1);
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -4409876803959209360L, this);
            }
            throw th;
        }
    }

    @Override
    @su(method = -1566810862231898483L)
    protected void mo3567j6(int i) {
        try {
            if (f1487lg) {
                wu.j6(-1068866878698152487L, this, i);
            }
            if (this.f1519tp) {
                int i2 = this.f1506J0;
                while (i2 > 0) {
                    i2--;
                    if (this.f1512Ws[i2] != 2) {
                        break;
                    }
                }
                int i3 = this.f1516aM[i2];
                int i4 = this.f1508Mr[i2] - 1;
                String string = this.f1489BT.getString(i);
                this.f1500yS.DW(this.f1503EQ.VH(), this.f1503EQ.J8(), i3, i4, i3, i4 + 2, "缺少 </C>" + string + "<//C>", 0);
                int i5 = i4 + 1;
                this.f1500yS.j6(this.f1503EQ.VH(), this.f1503EQ.J8(), i3, i5, i3, i5, string, "插入 '" + string + "'");
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -1068866878698152487L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override
    public void mo3568j6(Wa wa, Da da, boolean z, Sa sa) {
        try {
            if (f1487lg) {
                wu.j6(-220726349220359820L, this, wa, da, new Boolean(z), sa);
            }
            super.mo3568j6(wa, da, z, sa);
            this.f1499vy.Hw(sa);
            if (z) {
                this.f1499vy.j6(sa, m3524KD());
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -220726349220359820L, this, wa, da, new Boolean(z), sa);
            }
            throw th;
        }
    }

    @Override
    @su(method = -541726490486978500L)
    protected void mo3569j6(String str) {
        try {
            if (f1487lg) {
                wu.j6(-3833289294958571100L, this, str);
            }
            if (this.f1519tp) {
                int i = this.f1506J0;
                while (i > 0) {
                    i--;
                    if (this.f1512Ws[i] != 2) {
                        break;
                    }
                }
                int i2 = this.f1516aM[i];
                int i3 = this.f1508Mr[i] - 1;
                this.f1500yS.DW(this.f1503EQ.VH(), this.f1503EQ.J8(), i2, i3, i2, i3 + 2, str, 0);
            }
        } catch (Throwable th) {
            if (f1488rN) {
                wu.j6(th, -3833289294958571100L, this, str);
            }
            throw th;
        }
    }
}
