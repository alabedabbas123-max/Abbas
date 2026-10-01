package abcd;

import com.almlkaide.kaypro.android.dx.io.Opcodes;
import java.util.Stack;

@xu
public class wd {

    @uu
    private static boolean f1523DW;

    @tu
    private static boolean f1524j6;

    @ru(field = 647299077558343752L)
    private Cb f1525EQ;

    @ru(field = -2510009628330290295L)
    private final Ca f1526FH;

    @ru(field = -42230960020258041L)
    private final Ba f1527Hw;

    @ru(field = -8449167060008107125L)
    private Cb f1528J0;

    @ru(field = -1564302155730653493L)
    private int f1529J8;

    @ru(field = -3199270150856153376L)
    private qb f1530QX;

    @ru(field = -4713977396547679851L)
    private Ya[] f1531VH;

    @ru(field = 3727084974672863253L)
    private int f1532Ws;

    @ru(field = -4114967764066394560L)
    private qb f1533XL;

    @ru(field = -1950204381388417303L)
    private Stack<Kb> f1534Zo;

    @ru(field = -2101861800345370191L)
    private Cb f1535aM;

    @ru(field = 329799355108904980L)
    private final boolean f1536gn;

    @ru(field = 157971488616081075L)
    private Cb f1537j3;

    @ru(field = 3715738420187489872L)
    private bc f1538tp;

    @ru(field = -3904038697715404720L)
    private bc f1539u7;

    @ru(field = 1592074076257719808L)
    private final Hd f1540v5;

    @ru(field = 7206138773084011840L)
    private Cb f1541we;

    static {
        wu.j6(wd.class, -699406337387828800L, -699406337387828800L);
    }

    public wd(La la, Hd hd, boolean z) {
        try {
            if (f1524j6) {
                wu.j6(-267499786660002223L, (Object) null, la, hd, new Boolean(z));
            }
            this.f1539u7 = new bc();
            this.f1538tp = new bc();
            this.f1525EQ = new Cb();
            this.f1541we = new Cb();
            this.f1528J0 = new Cb();
            this.f1530QX = new qb();
            this.f1533XL = new qb();
            this.f1535aM = new Cb();
            this.f1537j3 = new Cb();
            this.f1526FH = la.rN;
            this.f1527Hw = la.a8;
            this.f1540v5 = hd;
            this.f1536gn = z;
            this.f1534Zo = new Stack<>();
            this.f1531VH = new Ya[1000];
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -267499786660002223L, (Object) null, la, hd, new Boolean(z));
            }
            throw th;
        }
    }

    @su(method = -232932055010985265L)
    private void m3589DW() {
        try {
            if (f1524j6) {
                wu.j6(2080653267750020283L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                this.f1541we.FH();
                this.f1528J0.FH();
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 2080653267750020283L, this);
            }
            throw th;
        }
    }

    @su(method = -2723836273991095725L)
    private void m3590DW(int i) {
        try {
            if (f1524j6) {
                wu.j6(-4865959331244461005L, this, i);
            }
            int iHw = (this.f1541we.Hw() - this.f1529J8) + (i / 31);
            int i2 = 1 << (i % 31);
            this.f1541we.j6(iHw, this.f1541we.DW(iHw) | i2);
            this.f1528J0.j6(iHw, i2 | this.f1528J0.DW(iHw));
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -4865959331244461005L, this, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = -5518939049090031345L)
    private void m3591DW(Sa sa, int i) {
        try {
            if (f1524j6) {
                wu.j6(1464995043938832891L, this, sa, new Integer(i));
            }
            if (sa.KD(i)) {
                this.f1539u7.DW(sa.gn(i));
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 1464995043938832891L, this, sa, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = -5254978793897246400L)
    private void m3592DW(Sa sa, int i, boolean z) {
        try {
            if (f1524j6) {
                wu.j6(4434530161671651492L, this, sa, new Integer(i), new Boolean(z));
            }
            int iWe = sa.we(i);
            for (int i2 = 0; i2 < iWe; i2++) {
                if (sa.P8(sa.Zo(i, i2)) == 126) {
                    int iWe2 = sa.we(sa.Zo(i, i2));
                    for (int i3 = 3; i3 < iWe2; i3 += 2) {
                        int iZo = sa.Zo(sa.Zo(i, i2), i3);
                        try {
                            if (this.f1527Hw.DW(sa.VH(), sa.J8(), sa.J8(iZo)).mb() == z) {
                                int iZo2 = sa.Zo(iZo, 0);
                                if (sa.nw(iZo2) && !m3624j6(sa.FH(iZo2))) {
                                    this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(iZo2), sa.BT(iZo2), sa.QX(iZo2), sa.Ws(iZo2), "此字段不能初始化", 12);
                                }
                            }
                        } catch (jc unused) {
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 4434530161671651492L, this, sa, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @su(method = 4799364171306969540L)
    private boolean m3593DW(Sa sa, Kb kb, Ya ya) {
        try {
            if (f1524j6) {
                wu.j6(3754142419477361536L, this, sa, kb, ya);
            }
            if (kb.DW(ya.EQ())) {
                return true;
            }
            kb.Hw.DW();
            while (kb.Hw.j6()) {
                if (ya.FH(sa.VH(), sa.J8(), this.f1527Hw.FH(kb.Hw.FH())) || this.f1527Hw.FH(kb.Hw.FH()).FH(sa.VH(), sa.J8(), ya)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 3754142419477361536L, this, sa, kb, ya);
            }
            throw th;
        }
    }

    @su(method = 5230560152146525800L)
    private void m3594EQ() {
        try {
            if (f1524j6) {
                wu.j6(-3585538218718978096L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                this.f1525EQ.FH(0);
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -3585538218718978096L, this);
            }
            throw th;
        }
    }

    @su(method = 30655015981490915L)
    private void m3595EQ(Sa sa, int i) {
        try {
            if (f1524j6) {
                wu.j6(7251384258624154695L, this, sa, new Integer(i));
            }
            for (int i2 = 0; i2 < this.f1529J8; i2++) {
                this.f1541we.j6((this.f1541we.Hw() - this.f1529J8) + i2, this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i2) & this.f1537j3.DW((this.f1537j3.Hw() - this.f1529J8) + i2));
                this.f1528J0.j6((this.f1528J0.Hw() - this.f1529J8) + i2, this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i2) & this.f1537j3.DW((this.f1537j3.Hw() - this.f1529J8) + i2));
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 7251384258624154695L, this, sa, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = 2782903748556439728L)
    private void m3596FH() {
        try {
            if (f1524j6) {
                wu.j6(3242217874148346800L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                this.f1525EQ.FH();
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 3242217874148346800L, this);
            }
            throw th;
        }
    }

    @su(method = -2023025234262367016L)
    private void m3597FH(Sa sa, int i) {
        try {
            if (f1524j6) {
                wu.j6(-1842233557550518440L, this, sa, new Integer(i));
            }
            if (sa.KD(i)) {
                int iDW = this.f1533XL.DW(sa.gn(i));
                for (int i2 = 0; i2 < this.f1529J8; i2++) {
                    int i3 = iDW + i2;
                    this.f1537j3.j6(i3, this.f1537j3.DW(i3) & this.f1525EQ.DW((this.f1525EQ.Hw() - this.f1529J8) + i2));
                }
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -1842233557550518440L, this, sa, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = 3298401737053620224L)
    private void m3598Hw() {
        try {
            if (f1524j6) {
                wu.j6(-2247460175161775700L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                this.f1541we.FH(this.f1541we.DW(this.f1541we.Hw() - this.f1529J8));
                this.f1528J0.FH(this.f1528J0.DW(this.f1528J0.Hw() - this.f1529J8));
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -2247460175161775700L, this);
            }
            throw th;
        }
    }

    @su(method = -904436931058659429L)
    private void m3599Hw(Sa sa, int i) {
        try {
            if (f1524j6) {
                wu.j6(2703916375187442147L, this, sa, new Integer(i));
            }
            if (sa.KD(i)) {
                this.f1538tp.DW(sa.gn(i));
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 2703916375187442147L, this, sa, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = 1535811474898909796L)
    private void m3600J0() {
        try {
            if (f1524j6) {
                wu.j6(-677043635111277696L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                int iDW = this.f1541we.DW((this.f1541we.Hw() - (this.f1529J8 * 2)) + i);
                int iDW2 = this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i);
                int i2 = iDW & iDW2;
                int iDW3 = this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i) & this.f1528J0.DW((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i);
                this.f1541we.j6((this.f1541we.Hw() - (this.f1529J8 * 2)) + i, i2);
                this.f1528J0.j6((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i, iDW3);
            }
            for (int i3 = 0; i3 < this.f1529J8; i3++) {
                this.f1541we.FH();
                this.f1528J0.FH();
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -677043635111277696L, this);
            }
            throw th;
        }
    }

    @su(method = -1414240783914463904L)
    private void m3601J8() {
        try {
            if (f1524j6) {
                wu.j6(1542660407575268832L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                int iDW = this.f1541we.DW((this.f1541we.Hw() - (this.f1529J8 * 2)) + i);
                int iDW2 = this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i);
                int iDW3 = iDW & this.f1528J0.DW((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i) & iDW2 & this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i);
                this.f1541we.j6((this.f1541we.Hw() - this.f1529J8) + i, iDW3);
                this.f1528J0.j6((this.f1528J0.Hw() - this.f1529J8) + i, iDW3);
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 1542660407575268832L, this);
            }
            throw th;
        }
    }

    @su(method = 2418806593956713244L)
    private void m3602Mr() {
        try {
            if (f1524j6) {
                wu.j6(-2983599087857253728L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                int iDW = this.f1541we.DW((this.f1541we.Hw() - (this.f1529J8 * 2)) + i);
                int iDW2 = this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i);
                int iDW3 = iDW & this.f1528J0.DW((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i) & iDW2 & this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i);
                this.f1541we.j6((this.f1541we.Hw() - (this.f1529J8 * 2)) + i, iDW3);
                this.f1528J0.j6((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i, iDW3);
            }
            for (int i2 = 0; i2 < this.f1529J8; i2++) {
                this.f1541we.FH();
                this.f1528J0.FH();
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -2983599087857253728L, this);
            }
            throw th;
        }
    }

    @su(method = -2240428477815038863L)
    private void m3603QX() {
        try {
            if (f1524j6) {
                wu.j6(1393407716109239509L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                int iDW = this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i);
                int iDW2 = this.f1528J0.DW((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i) & this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i);
                this.f1541we.j6((this.f1541we.Hw() - (this.f1529J8 * 2)) + i, iDW);
                this.f1528J0.j6((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i, iDW2);
            }
            for (int i2 = 0; i2 < this.f1529J8; i2++) {
                this.f1541we.FH();
                this.f1528J0.FH();
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 1393407716109239509L, this);
            }
            throw th;
        }
    }

    @su(method = -4932142855252053343L)
    private void m3604U2() {
        try {
            if (f1524j6) {
                wu.j6(1463148845762260613L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                int iDW = this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i);
                this.f1541we.j6((this.f1528J0.Hw() - this.f1529J8) + i, this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i));
                this.f1528J0.j6((this.f1541we.Hw() - this.f1529J8) + i, iDW);
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 1463148845762260613L, this);
            }
            throw th;
        }
    }

    @su(method = 4853851441781113593L)
    private void m3605VH() {
        try {
            if (f1524j6) {
                wu.j6(-3906001912587746675L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                this.f1525EQ.FH(this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i) & this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i));
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -3906001912587746675L, this);
            }
            throw th;
        }
    }

    @su(method = -3942417010829058124L)
    private boolean m3606VH(Sa sa, int i) {
        int iZo;
        try {
            if (f1524j6) {
                wu.j6(-3086549971054836352L, this, sa, new Integer(i));
            }
            if (this.f1539u7.j6(i)) {
                return true;
            }
            if (this.f1538tp.Hw() > 0) {
                this.f1538tp.v5.DW();
                while (this.f1538tp.v5.j6()) {
                    int iFH = this.f1538tp.v5.FH();
                    if (iFH != i && sa.QX(iFH, i)) {
                        return true;
                    }
                    int iP8 = sa.P8(iFH);
                    if (iP8 == 137) {
                        iZo = sa.Zo(iFH, 2);
                    } else if (iP8 == 145) {
                        iZo = sa.Zo(iFH, 4);
                    } else if (iP8 != 149) {
                        iZo = iP8 != 211 ? -1 : sa.Zo(sa.Zo(iFH, 4), 0);
                    } else {
                        iZo = sa.Zo(sa.Zo(iFH, 3), 0);
                    }
                    if (iZo == -1 || (sa.P8(iZo) != 14 && (!sa.cn(iZo) || !sa.ro(iZo) || sa.u7(iZo).dx() != 11 || !this.f1527Hw.j6(sa.tp(iZo))))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -3086549971054836352L, this, sa, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = -766277725332780057L)
    private void m3607Ws() {
        try {
            if (f1524j6) {
                wu.j6(801335165456691615L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                int iDW = this.f1541we.DW((this.f1541we.Hw() - (this.f1529J8 * 2)) + i);
                int iDW2 = this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i);
                int iDW3 = iDW & this.f1528J0.DW((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i) & iDW2 & this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i);
                this.f1541we.j6((this.f1541we.Hw() - (this.f1529J8 * 2)) + i, iDW3);
                this.f1528J0.j6((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i, iDW3);
            }
            for (int i2 = 0; i2 < this.f1529J8; i2++) {
                this.f1541we.FH();
                this.f1528J0.FH();
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 801335165456691615L, this);
            }
            throw th;
        }
    }

    @su(method = 327300400331773105L)
    private void m3608XL() {
        try {
            if (f1524j6) {
                wu.j6(-4840180205570077311L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                int iDW = this.f1541we.DW((this.f1541we.Hw() - (this.f1529J8 * 2)) + i);
                int iDW2 = this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i);
                int iDW3 = this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i);
                this.f1541we.j6((this.f1541we.Hw() - (this.f1529J8 * 2)) + i, iDW & iDW2);
                this.f1528J0.j6((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i, iDW3);
            }
            for (int i2 = 0; i2 < this.f1529J8; i2++) {
                this.f1541we.FH();
                this.f1528J0.FH();
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -4840180205570077311L, this);
            }
            throw th;
        }
    }

    @su(method = 6517425315548265763L)
    private void m3609Zo() {
        try {
            if (f1524j6) {
                wu.j6(-2433127471963125021L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                this.f1541we.FH(this.f1525EQ.DW((this.f1525EQ.Hw() - this.f1529J8) + i));
                this.f1528J0.FH(this.f1525EQ.DW((this.f1525EQ.Hw() - this.f1529J8) + i));
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -2433127471963125021L, this);
            }
            throw th;
        }
    }

    @su(method = -105938034753792021L)
    private void m3610Zo(Sa sa, int i) {
        int iFH;
        int iFH2;
        try {
            if (f1524j6) {
                wu.j6(-6998471219290213421L, this, sa, new Integer(i));
            }
            int iP8 = sa.P8(i);
            if (iP8 != 66) {
                if (iP8 == 68) {
                    m3623j6(true);
                    m3596FH();
                    return;
                }
                int i2 = 0;
                if (iP8 == 74) {
                    m3623j6(false);
                    m3596FH();
                    return;
                }
                if (iP8 == 159) {
                    m3610Zo(sa, sa.Zo(i, 0));
                    return;
                }
                int i3 = 3;
                if (iP8 == 209) {
                    m3627tp();
                    m3610Zo(sa, sa.Zo(i, 1));
                    if (sa.we(i) > 3) {
                        m3613gn();
                        m3589DW();
                        m3610Zo(sa, sa.Zo(i, 3));
                    }
                    m3589DW();
                    m3609Zo();
                    m3596FH();
                    return;
                }
                if (iP8 != 222) {
                    if (iP8 == 231) {
                        return;
                    }
                    if (iP8 == 196) {
                        int iWe = sa.we(i);
                        for (int i4 = 1; i4 < iWe - 1; i4 += 2) {
                            m3610Zo(sa, sa.Zo(i, i4));
                            m3605VH();
                            m3589DW();
                        }
                        m3609Zo();
                        m3596FH();
                        return;
                    }
                    if (iP8 == 197) {
                        int iWe2 = sa.we(i);
                        for (int i5 = 1; i5 < iWe2 - 1; i5 += 2) {
                            m3610Zo(sa, sa.Zo(i, i5));
                            m3605VH();
                            m3589DW();
                        }
                        m3609Zo();
                        m3596FH();
                        return;
                    }
                    if (iP8 == 211) {
                        int i6 = this.f1532Ws;
                        m3627tp();
                        m3632v5(sa, i);
                        m3610Zo(sa, sa.Zo(i, 8));
                        int iFH3 = sa.FH(sa.Zo(i, 5));
                        m3590DW(iFH3);
                        if (iFH3 > this.f1532Ws) {
                            this.f1532Ws = iFH3;
                        }
                        m3605VH();
                        m3610Zo(sa, sa.Zo(i, 10));
                        m3589DW();
                        m3628tp(sa, i);
                        m3630u7(sa, i);
                        m3596FH();
                        this.f1532Ws = i6;
                        m3626lg();
                        return;
                    }
                    int i7 = 2;
                    if (iP8 == 212) {
                        int iWe3 = sa.we(i);
                        while (i7 < iWe3 - 2) {
                            m3610Zo(sa, sa.Zo(i, i7));
                            m3605VH();
                            m3589DW();
                            i7++;
                        }
                        m3610Zo(sa, sa.Zo(i, iWe3 - 1));
                        return;
                    }
                    switch (iP8) {
                        default:
                            int i8 = 126;
                            switch (iP8) {
                                case 122:
                                    int i9 = this.f1532Ws;
                                    int iWe4 = sa.we(i);
                                    for (int i10 = 0; i10 < iWe4; i10++) {
                                        int iZo = sa.Zo(i, i10);
                                        if (sa.P8(iZo) == 126) {
                                            int iWe5 = sa.we(iZo);
                                            for (int i11 = 3; i11 < iWe5; i11 += 2) {
                                                int iZo2 = sa.Zo(sa.Zo(iZo, i11), 0);
                                                if (sa.nw(iZo2) && (iFH = sa.FH(iZo2)) > this.f1532Ws) {
                                                    this.f1532Ws = iFH;
                                                }
                                            }
                                        }
                                    }
                                    for (int i12 = 0; i12 < iWe4; i12++) {
                                        int iP9 = sa.P8(sa.Zo(i, i12));
                                        if (iP9 == 126 || iP9 == 127) {
                                            m3610Zo(sa, sa.Zo(i, i12));
                                        }
                                    }
                                    while (i2 < iWe4) {
                                        int iP10 = sa.P8(sa.Zo(i, i2));
                                        if (iP10 != 126 && iP10 != 127) {
                                            m3610Zo(sa, sa.Zo(i, i2));
                                        }
                                        i2++;
                                    }
                                    m3592DW(sa, i, true);
                                    this.f1532Ws = i9;
                                    m3609Zo();
                                    m3626lg();
                                    m3596FH();
                                    m3605VH();
                                    m3589DW();
                                    return;
                                case 123:
                                    if (sa.P8(sa.Zo(i, 5)) == 133) {
                                        int i13 = this.f1532Ws;
                                        m3609Zo();
                                        int iZo3 = sa.Zo(i, 3);
                                        int iWe6 = sa.we(iZo3);
                                        for (int i14 = 1; i14 < iWe6 - 1; i14 += 2) {
                                            int iZo4 = sa.Zo(iZo3, i14);
                                            if (sa.P8(iZo4) != 16) {
                                                int iFH4 = sa.FH(sa.Zo(iZo4, 3));
                                                if (iFH4 > this.f1532Ws) {
                                                    this.f1532Ws = iFH4;
                                                }
                                                m3590DW(iFH4);
                                            }
                                        }
                                        m3605VH();
                                        m3589DW();
                                        m3610Zo(sa, sa.Zo(i, 5));
                                        m3589DW();
                                        this.f1532Ws = i13;
                                        return;
                                    }
                                    return;
                                case 124:
                                    if (sa.P8(sa.Zo(i, 8)) == 133) {
                                        int i15 = this.f1532Ws;
                                        m3609Zo();
                                        int iZo5 = sa.Zo(i, 5);
                                        int iWe7 = sa.we(iZo5);
                                        for (int i16 = 1; i16 < iWe7 - 1; i16 += 2) {
                                            int iZo6 = sa.Zo(iZo5, i16);
                                            if (sa.P8(iZo6) != 16) {
                                                int iFH5 = sa.FH(sa.Zo(iZo6, 3));
                                                if (iFH5 > this.f1532Ws) {
                                                    this.f1532Ws = iFH5;
                                                }
                                                m3590DW(iFH5);
                                            }
                                        }
                                        m3605VH();
                                        m3589DW();
                                        m3610Zo(sa, sa.Zo(i, 8));
                                        m3589DW();
                                        this.f1532Ws = i15;
                                        return;
                                    }
                                    return;
                                default:
                                    switch (iP8) {
                                        case 126:
                                            int iWe8 = sa.we(i);
                                            for (int i17 = 3; i17 < iWe8; i17 += 2) {
                                                int iZo7 = sa.Zo(i, i17);
                                                int iZo8 = sa.Zo(iZo7, 0);
                                                if (sa.we(iZo7) > 2) {
                                                    m3610Zo(sa, sa.Zo(iZo7, 3));
                                                    m3605VH();
                                                    m3589DW();
                                                }
                                                if (sa.nw(iZo8) && (iFH2 = sa.FH(iZo8)) > this.f1532Ws) {
                                                    this.f1532Ws = iFH2;
                                                }
                                            }
                                            return;
                                        case 127:
                                            m3610Zo(sa, sa.Zo(i, 1));
                                            m3605VH();
                                            m3589DW();
                                            return;
                                        case 128:
                                        case 129:
                                            break;
                                        default:
                                            switch (iP8) {
                                                case 133:
                                                    int iWe9 = sa.we(i);
                                                    int i18 = this.f1532Ws;
                                                    if (sa.P8(sa.er(i)) == 123 && sa.P8(sa.Zo(i, 1)) == 146 && sa.P8(sa.Zo(sa.Zo(i, 1), 0)) == 163) {
                                                        m3609Zo();
                                                        int iEr = sa.er(sa.er(i));
                                                        int iWe10 = sa.we(iEr);
                                                        int i19 = 0;
                                                        while (i19 < iWe10) {
                                                            int iZo9 = sa.Zo(iEr, i19);
                                                            int iWe11 = sa.we(iZo9);
                                                            if (sa.P8(iZo9) == i8) {
                                                                for (int i20 = 3; i20 < iWe11; i20 += 2) {
                                                                    int iZo10 = sa.Zo(sa.Zo(iZo9, i20), 0);
                                                                    if (sa.nw(iZo10)) {
                                                                        m3590DW(sa.FH(iZo10));
                                                                    }
                                                                }
                                                            }
                                                            i19++;
                                                            i8 = 126;
                                                        }
                                                        m3596FH();
                                                        m3605VH();
                                                        m3589DW();
                                                    }
                                                    for (int i21 = 1; i21 < iWe9 - 1; i21++) {
                                                        m3610Zo(sa, sa.Zo(i, i21));
                                                        m3605VH();
                                                        m3589DW();
                                                    }
                                                    if (sa.P8(sa.er(i)) == 123) {
                                                        m3592DW(sa, sa.er(sa.er(i)), false);
                                                    }
                                                    m3609Zo();
                                                    m3596FH();
                                                    this.f1532Ws = i18;
                                                    m3626lg();
                                                    return;
                                                case 134:
                                                    m3609Zo();
                                                    m3596FH();
                                                    return;
                                                case 135:
                                                    m3610Zo(sa, sa.Zo(i, 2));
                                                    m3629u7();
                                                    m3610Zo(sa, sa.Zo(i, 4));
                                                    m3615j3();
                                                    return;
                                                case 136:
                                                    m3610Zo(sa, sa.Zo(i, 2));
                                                    m3613gn();
                                                    m3629u7();
                                                    m3589DW();
                                                    m3610Zo(sa, sa.Zo(i, 4));
                                                    m3610Zo(sa, sa.Zo(i, 6));
                                                    m3602Mr();
                                                    return;
                                                case 137:
                                                    m3632v5(sa, i);
                                                    m3610Zo(sa, sa.Zo(i, 2));
                                                    m3629u7();
                                                    m3633we();
                                                    m3610Zo(sa, sa.Zo(i, 4));
                                                    m3589DW();
                                                    m3628tp(sa, i);
                                                    m3630u7(sa, i);
                                                    return;
                                                case 138:
                                                    m3618j6(sa, i);
                                                    m3631v5();
                                                    m3596FH();
                                                    return;
                                                case 139:
                                                    m3597FH(sa, i);
                                                    m3631v5();
                                                    m3596FH();
                                                    return;
                                                case 140:
                                                    m3610Zo(sa, sa.Zo(i, 2));
                                                    m3605VH();
                                                    m3589DW();
                                                    m3610Zo(sa, sa.Zo(i, 4));
                                                    return;
                                                case 141:
                                                case 142:
                                                    if (sa.we(i) > 2) {
                                                        m3627tp();
                                                        m3610Zo(sa, sa.Zo(i, 1));
                                                        m3589DW();
                                                    }
                                                    m3631v5();
                                                    m3596FH();
                                                    return;
                                                case 143:
                                                case 144:
                                                    break;
                                                case 145:
                                                    m3632v5(sa, i);
                                                    m3610Zo(sa, sa.Zo(i, 1));
                                                    m3595EQ(sa, i);
                                                    m3605VH();
                                                    m3589DW();
                                                    m3610Zo(sa, sa.Zo(i, 4));
                                                    m3633we();
                                                    m3628tp(sa, i);
                                                    m3630u7(sa, i);
                                                    return;
                                                case 146:
                                                    m3610Zo(sa, sa.Zo(i, 0));
                                                    return;
                                                case 147:
                                                    m3632v5(sa, i);
                                                    m3610Zo(sa, sa.Zo(i, 2));
                                                    m3598Hw();
                                                    int iZo11 = sa.Zo(i, 4);
                                                    int iWe12 = sa.we(iZo11);
                                                    boolean z = false;
                                                    for (int i22 = 1; i22 < iWe12 - 1; i22++) {
                                                        int iP11 = sa.P8(sa.Zo(iZo11, i22));
                                                        if (iP11 == 143) {
                                                            m3601J8();
                                                        } else if (iP11 != 144) {
                                                            m3605VH();
                                                            m3589DW();
                                                            m3610Zo(sa, sa.Zo(iZo11, i22));
                                                        } else {
                                                            m3601J8();
                                                            z = true;
                                                        }
                                                    }
                                                    if (z) {
                                                        m3611a8();
                                                    } else {
                                                        m3589DW();
                                                    }
                                                    m3628tp(sa, i);
                                                    m3630u7(sa, i);
                                                    return;
                                                case 148:
                                                    m3632v5(sa, i);
                                                    m3610Zo(sa, sa.Zo(i, 2));
                                                    m3628tp(sa, i);
                                                    m3630u7(sa, i);
                                                    return;
                                                case 149:
                                                    int i23 = this.f1532Ws;
                                                    m3632v5(sa, i);
                                                    m3627tp();
                                                    int iZo12 = sa.Zo(i, 2);
                                                    if (sa.P8(sa.Zo(iZo12, 0)) != 14) {
                                                        int iWe13 = sa.we(iZo12);
                                                        for (int i24 = 0; i24 < iWe13; i24 += 2) {
                                                            m3610Zo(sa, sa.Zo(iZo12, i24));
                                                            m3605VH();
                                                            m3589DW();
                                                        }
                                                    }
                                                    int iZo13 = sa.Zo(i, 3);
                                                    if (sa.P8(sa.Zo(iZo13, 0)) != 14) {
                                                        m3610Zo(sa, sa.Zo(iZo13, 0));
                                                        m3629u7();
                                                        m3633we();
                                                    } else {
                                                        m3631v5();
                                                    }
                                                    m3610Zo(sa, sa.Zo(i, 6));
                                                    int iZo14 = sa.Zo(i, 4);
                                                    if (sa.we(iZo14) > 0) {
                                                        m3595EQ(sa, i);
                                                        m3605VH();
                                                        m3589DW();
                                                        int iWe14 = sa.we(iZo14);
                                                        while (i2 < iWe14) {
                                                            m3610Zo(sa, sa.Zo(iZo14, i2));
                                                            m3605VH();
                                                            m3589DW();
                                                            i2 += 2;
                                                        }
                                                        m3596FH();
                                                    } else {
                                                        m3589DW();
                                                    }
                                                    m3596FH();
                                                    m3628tp(sa, i);
                                                    m3630u7(sa, i);
                                                    this.f1532Ws = i23;
                                                    m3626lg();
                                                    return;
                                                case 150:
                                                    int i25 = this.f1532Ws;
                                                    m3627tp();
                                                    m3610Zo(sa, sa.Zo(i, 1));
                                                    int iWe15 = sa.we(i);
                                                    while (i7 < iWe15) {
                                                        int iZo15 = sa.Zo(i, i7);
                                                        if (sa.P8(iZo15) == 204) {
                                                            m3609Zo();
                                                            int iFH6 = sa.FH(sa.Zo(iZo15, 4));
                                                            m3590DW(iFH6);
                                                            if (iFH6 > this.f1532Ws) {
                                                                this.f1532Ws = iFH6;
                                                            }
                                                            m3605VH();
                                                            m3589DW();
                                                            m3610Zo(sa, sa.Zo(iZo15, sa.we(iZo15) - 1));
                                                            m3607Ws();
                                                        } else {
                                                            m3627tp();
                                                            m3610Zo(sa, sa.Zo(iZo15, sa.we(iZo15) - 1));
                                                            m3612aM();
                                                        }
                                                        i7++;
                                                    }
                                                    m3596FH();
                                                    this.f1532Ws = i25;
                                                    m3626lg();
                                                    return;
                                                case 151:
                                                    int iWe16 = sa.we(i);
                                                    for (int i26 = 3; i26 < iWe16; i26 += 2) {
                                                        int iZo16 = sa.Zo(i, i26);
                                                        int iFH7 = sa.FH(sa.Zo(iZo16, 0));
                                                        if (sa.we(iZo16) > 2) {
                                                            m3610Zo(sa, sa.Zo(iZo16, 3));
                                                            m3590DW(iFH7);
                                                            m3605VH();
                                                            m3589DW();
                                                        }
                                                        if (iFH7 > this.f1532Ws) {
                                                            this.f1532Ws = iFH7;
                                                        }
                                                    }
                                                    m3609Zo();
                                                    m3596FH();
                                                    return;
                                                default:
                                                    switch (iP8) {
                                                        case 155:
                                                            m3610Zo(sa, sa.Zo(i, 0));
                                                            m3605VH();
                                                            m3589DW();
                                                            m3610Zo(sa, sa.Zo(i, sa.we(i) - 1));
                                                            return;
                                                        case 156:
                                                            int iZo17 = sa.Zo(i, 0);
                                                            if (sa.nw(iZo17) && !m3624j6(sa.FH(iZo17))) {
                                                                m3614gn(sa, iZo17);
                                                            }
                                                            m3610Zo(sa, sa.Zo(i, sa.we(i) - 1));
                                                            return;
                                                        case 157:
                                                            m3610Zo(sa, sa.Zo(i, sa.we(i) - 1));
                                                            return;
                                                        default:
                                                            switch (iP8) {
                                                                case 161:
                                                                    if (sa.cn(i) && sa.ro(i) && sa.u7(i).dx() == 11) {
                                                                        m3623j6(this.f1527Hw.j6(sa.tp(i)));
                                                                        m3596FH();
                                                                        return;
                                                                    }
                                                                    int iZo18 = sa.Zo(i, 0);
                                                                    if (sa.nw(iZo18) && ((sa.we(i) != 1 || !sa.sG(i)) && !m3624j6(sa.FH(iZo18)))) {
                                                                        m3614gn(sa, iZo18);
                                                                    }
                                                                    m3609Zo();
                                                                    m3596FH();
                                                                    return;
                                                                case 162:
                                                                case 163:
                                                                case 164:
                                                                case 166:
                                                                case 167:
                                                                    break;
                                                                case 165:
                                                                    m3610Zo(sa, sa.Zo(i, 0));
                                                                    m3605VH();
                                                                    m3589DW();
                                                                    m3610Zo(sa, sa.Zo(i, 2));
                                                                    return;
                                                                case 168:
                                                                    if (!sa.cn(i) || !sa.ro(i) || sa.u7(i).dx() != 11) {
                                                                        m3610Zo(sa, sa.Zo(i, 1));
                                                                        return;
                                                                    } else {
                                                                        m3623j6(this.f1527Hw.j6(sa.tp(i)));
                                                                        m3596FH();
                                                                        return;
                                                                    }
                                                                case 169:
                                                                    if (!sa.cn(i) || !sa.ro(i) || sa.u7(i).dx() != 11) {
                                                                        m3610Zo(sa, sa.Zo(i, 4));
                                                                        return;
                                                                    } else {
                                                                        m3623j6(this.f1527Hw.j6(sa.tp(i)));
                                                                        m3596FH();
                                                                        return;
                                                                    }
                                                                case 170:
                                                                    if (sa.cn(i) && sa.ro(i) && sa.u7(i).dx() == 11) {
                                                                        m3623j6(this.f1527Hw.j6(sa.tp(i)));
                                                                        m3596FH();
                                                                        return;
                                                                    }
                                                                    if (sa.P8(sa.Zo(i, 0)) == 34) {
                                                                        m3610Zo(sa, sa.Zo(i, 1));
                                                                        m3604U2();
                                                                        return;
                                                                    }
                                                                    m3610Zo(sa, sa.Zo(i, 1));
                                                                    if (sa.Sf(sa.Zo(i, 1)) && sa.P8(sa.Zo(i, 1)) == 161 && sa.we(sa.Zo(i, 1)) == 1) {
                                                                        int iZo19 = sa.Zo(sa.Zo(i, 1), 0);
                                                                        if (sa.nw(iZo19)) {
                                                                            m3590DW(sa.FH(iZo19));
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 171:
                                                                    m3610Zo(sa, sa.Zo(i, 0));
                                                                    if (sa.Sf(sa.Zo(i, 0)) && sa.P8(sa.Zo(i, 0)) == 161 && sa.we(sa.Zo(i, 0)) == 1) {
                                                                        int iZo20 = sa.Zo(sa.Zo(i, 0), 0);
                                                                        if (sa.nw(iZo20)) {
                                                                            m3590DW(sa.FH(iZo20));
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 172:
                                                                    if (sa.cn(i) && sa.ro(i) && sa.u7(i).dx() == 11) {
                                                                        m3623j6(this.f1527Hw.j6(sa.tp(i)));
                                                                        m3596FH();
                                                                        return;
                                                                    }
                                                                    if (sa.P8(sa.Zo(i, 1)) == 42) {
                                                                        m3610Zo(sa, sa.Zo(i, 0));
                                                                        m3629u7();
                                                                        m3610Zo(sa, sa.Zo(i, 2));
                                                                        m3603QX();
                                                                        return;
                                                                    }
                                                                    if (sa.P8(sa.Zo(i, 1)) == 39) {
                                                                        m3610Zo(sa, sa.Zo(i, 0));
                                                                        m3613gn();
                                                                        m3610Zo(sa, sa.Zo(i, 2));
                                                                        m3608XL();
                                                                        return;
                                                                    }
                                                                    if (sa.P8(sa.Zo(i, 1)) != 210) {
                                                                        m3610Zo(sa, sa.Zo(i, 0));
                                                                        m3605VH();
                                                                        m3589DW();
                                                                        m3610Zo(sa, sa.Zo(i, 2));
                                                                        int iZo21 = sa.Zo(i, 0);
                                                                        if (sa.Sf(iZo21)) {
                                                                            if ((sa.P8(iZo21) == 161 && sa.we(iZo21) == 1) || (sa.P8(iZo21) == 159 && sa.P8(sa.Zo(iZo21, 0)) == 166)) {
                                                                                int iZo22 = sa.Zo(iZo21, sa.we(iZo21) - 1);
                                                                                if (sa.nw(iZo22)) {
                                                                                    m3590DW(sa.FH(iZo22));
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    if (sa.ro(i) && sa.u7(i).dx() == 11) {
                                                                        m3610Zo(sa, sa.Zo(i, 0));
                                                                        m3613gn();
                                                                        m3629u7();
                                                                        m3589DW();
                                                                        m3610Zo(sa, sa.Zo(sa.Zo(i, 1), 1));
                                                                        m3610Zo(sa, sa.Zo(i, 2));
                                                                        m3600J0();
                                                                        return;
                                                                    }
                                                                    m3610Zo(sa, sa.Zo(i, 0));
                                                                    m3613gn();
                                                                    m3629u7();
                                                                    m3589DW();
                                                                    m3610Zo(sa, sa.Zo(sa.Zo(i, 1), 1));
                                                                    m3610Zo(sa, sa.Zo(i, 2));
                                                                    m3602Mr();
                                                                    return;
                                                                case 173:
                                                                    m3610Zo(sa, sa.Zo(i, 0));
                                                                    return;
                                                                default:
                                                                    switch (iP8) {
                                                                        case 175:
                                                                            int iWe17 = sa.we(i);
                                                                            while (i3 < iWe17) {
                                                                                int iZo23 = sa.Zo(i, i3);
                                                                                if (sa.P8(iZo23) == 11) {
                                                                                    i3 += 2;
                                                                                } else {
                                                                                    if (sa.P8(iZo23) != 230) {
                                                                                        m3610Zo(sa, iZo23);
                                                                                        m3605VH();
                                                                                        m3589DW();
                                                                                    }
                                                                                    i3 += 3;
                                                                                }
                                                                            }
                                                                            if (sa.P8(sa.Zo(i, sa.we(i) - 1)) == 196) {
                                                                                m3610Zo(sa, sa.Zo(i, sa.we(i) - 1));
                                                                                m3605VH();
                                                                                m3589DW();
                                                                            }
                                                                            m3609Zo();
                                                                            m3596FH();
                                                                            return;
                                                                        case 176:
                                                                            if (sa.we(i) <= 4) {
                                                                                m3610Zo(sa, sa.Zo(i, 3));
                                                                                return;
                                                                            }
                                                                            m3610Zo(sa, sa.Zo(i, 0));
                                                                            m3605VH();
                                                                            m3589DW();
                                                                            m3610Zo(sa, sa.Zo(i, 5));
                                                                            return;
                                                                        case 177:
                                                                            if (sa.we(i) <= 5) {
                                                                                m3610Zo(sa, sa.Zo(i, 3));
                                                                                m3605VH();
                                                                                m3610Zo(sa, sa.Zo(i, 4));
                                                                                m3596FH();
                                                                                return;
                                                                            }
                                                                            m3610Zo(sa, sa.Zo(i, 0));
                                                                            m3605VH();
                                                                            m3589DW();
                                                                            m3610Zo(sa, sa.Zo(i, 5));
                                                                            m3605VH();
                                                                            m3610Zo(sa, sa.Zo(i, 6));
                                                                            m3596FH();
                                                                            return;
                                                                        case 178:
                                                                            break;
                                                                        default:
                                                                            int iWe18 = sa.we(i);
                                                                            while (i2 < iWe18) {
                                                                                m3610Zo(sa, sa.Zo(i, i2));
                                                                                i2++;
                                                                            }
                                                                            return;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            m3609Zo();
                            m3596FH();
                    }
                }
                m3610Zo(sa, sa.Zo(i, 6));
                m3609Zo();
                m3596FH();
                return;
            }
            m3609Zo();
            m3596FH();
        } catch (Throwable th) {
            if (!f1523DW) {
                throw th;
            }
            wu.j6(th, -6998471219290213421L, this, sa, new Integer(i));
            throw th;
        }
    }

    @su(method = 4742427924940615872L)
    private void m3611a8() {
        try {
            if (f1524j6) {
                wu.j6(-968527905770842276L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                int iDW = this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i);
                int iDW2 = this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i);
                this.f1541we.j6((this.f1541we.Hw() - (this.f1529J8 * 2)) + i, iDW);
                this.f1528J0.j6((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i, iDW2);
            }
            for (int i2 = 0; i2 < this.f1529J8; i2++) {
                this.f1541we.FH();
                this.f1528J0.FH();
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -968527905770842276L, this);
            }
            throw th;
        }
    }

    @su(method = -2544216921846534285L)
    private void m3612aM() {
        try {
            if (f1524j6) {
                wu.j6(1133280183427191315L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                int iDW = this.f1541we.DW((this.f1541we.Hw() - (this.f1529J8 * 2)) + i);
                int iDW2 = this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i);
                int iDW3 = (iDW & this.f1528J0.DW((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i)) | (iDW2 & this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i));
                this.f1541we.j6((this.f1541we.Hw() - (this.f1529J8 * 2)) + i, iDW3);
                this.f1528J0.j6((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i, iDW3);
            }
            for (int i2 = 0; i2 < this.f1529J8; i2++) {
                this.f1541we.FH();
                this.f1528J0.FH();
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 1133280183427191315L, this);
            }
            throw th;
        }
    }

    @su(method = 415158426678421161L)
    private void m3613gn() {
        try {
            if (f1524j6) {
                wu.j6(5911841659148495145L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                this.f1525EQ.FH(this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i));
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 5911841659148495145L, this);
            }
            throw th;
        }
    }

    @su(method = -214505553345936055L)
    private void m3614gn(Sa sa, int i) {
        String str;
        try {
            if (f1524j6) {
                wu.j6(-4142579138963988899L, this, sa, new Integer(i));
            }
            if (sa.Zo(i) != 1 && sa.Zo(i) != 32 && sa.Zo(i) != 2) {
                this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(i), sa.BT(i), sa.QX(i), sa.Ws(i), "字段 </C>" + sa.aM(i) + "<//C> 可能尚未初始化", 12);
                return;
            }
            this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(i), sa.BT(i), sa.QX(i), sa.Ws(i), "变量 </C>" + sa.aM(i) + "<//C> 可能尚未初始化", 12);
            if (sa.ro(i)) {
                Ya yaU7 = sa.u7(i);
                int iVH = sa.VH(i);
                if (yaU7.dx() == 11) {
                    str = " = false";
                } else {
                    str = this.f1540v5.DW(yaU7) ? " = 0" : " = null";
                }
                this.f1526FH.j6(sa.VH(), sa.J8(), sa.QX(iVH), sa.Ws(iVH), sa.QX(iVH), sa.Ws(iVH), str, "初始化变量");
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -4142579138963988899L, this, sa, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = 1980945748473763271L)
    private void m3615j3() {
        try {
            if (f1524j6) {
                wu.j6(-2320112290496921837L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                int iDW = this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i);
                int iDW2 = iDW & this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i) & this.f1528J0.DW((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i);
                this.f1541we.j6((this.f1541we.Hw() - (this.f1529J8 * 2)) + i, iDW2);
                this.f1528J0.j6((this.f1528J0.Hw() - (this.f1529J8 * 2)) + i, iDW2);
            }
            for (int i2 = 0; i2 < this.f1529J8; i2++) {
                this.f1541we.FH();
                this.f1528J0.FH();
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -2320112290496921837L, this);
            }
            throw th;
        }
    }

    @su(method = 1653982278605545104L)
    private Kb m3616j6() {
        try {
            if (f1524j6) {
                wu.j6(4214674050526289876L, this);
            }
            if (this.f1534Zo.empty()) {
                return new Kb();
            }
            Kb kbPop = this.f1534Zo.pop();
            kbPop.j6();
            return kbPop;
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 4214674050526289876L, this);
            }
            throw th;
        }
    }

    @su(method = -2918345165271138600L)
    private void m3617j6(Kb kb) {
        try {
            if (f1524j6) {
                wu.j6(-2028275435803741264L, this, kb);
            }
            this.f1534Zo.push(kb);
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -2028275435803741264L, this, kb);
            }
            throw th;
        }
    }

    @su(method = 174603044867706280L)
    private void m3618j6(Sa sa, int i) {
        try {
            if (f1524j6) {
                wu.j6(-259047755414385336L, this, sa, new Integer(i));
            }
            if (sa.KD(i)) {
                int iDW = this.f1530QX.DW(sa.gn(i));
                for (int i2 = 0; i2 < this.f1529J8; i2++) {
                    int i3 = iDW + i2;
                    this.f1535aM.j6(i3, this.f1535aM.DW(i3) & this.f1525EQ.DW((this.f1525EQ.Hw() - this.f1529J8) + i2));
                }
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -259047755414385336L, this, sa, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = 493264373440465560L)
    private void m3619j6(Sa sa, int i, int i2, Kb kb, Ia ia, int i3) {
        int i4;
        int i5 = 1;
        if (f1524j6) {
            wu.j6(1419610820476051896L, this, new Object[]{sa, new Integer(i), new Integer(i2), kb, ia, new Integer(i3)});
        }
        try {
            Ya yaDW = ia.DW(i3);
            if (yaDW.rN()) {
                m3622j6(sa, kb, yaDW, i);
                return;
            }
            if (yaDW.ei()) {
                if (sa.SI(i)) {
                    m3622j6(sa, kb, ia.j6(i3, sa.Hw(i)), i);
                    return;
                }
                return;
            }
            if (yaDW.gW() && sa.SI(i)) {
                Ya yaHw = sa.Hw(i);
                int iWe = sa.we(i2);
                if (iWe > 2) {
                    int i6 = 0;
                    while (i5 < iWe) {
                        if (!sa.ro(sa.Zo(i2, i5))) {
                            return;
                        }
                        this.f1531VH[i6] = sa.u7(sa.Zo(i2, i5));
                        i5 += 2;
                        i6++;
                    }
                    i4 = i6;
                } else {
                    i4 = 0;
                }
                m3622j6(sa, kb, ia.j6(sa.VH(), sa.J8(), i3, yaHw, this.f1531VH, 0, i4, new Ya[0], 0, 0), i);
            }
        } catch (jc unused) {
        }
    }

    @su(method = 635439721200822473L)
    private void m3620j6(Sa sa, int i, Kb kb) throws Throwable {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        try {
            if (f1524j6) {
                wu.j6(2739759092726613997L, this, sa, new Integer(i7), kb);
            }
            int iP8 = sa.P8(i);
            if (iP8 == 1) {
                if (sa.Zo(i) == 20) {
                    Ia ia = (Ia) sa.v5(i);
                    if (sa.P8(sa.er(i)) == 156 && sa.sh(i)) {
                        int iJ3 = sa.j3(sa.j3(sa.j3(i)));
                        if (sa.ro(iJ3) && sa.u7(iJ3).lg() && this.f1540v5.DW(ia)) {
                            return;
                        }
                    }
                    if (sa.P8(sa.er(i)) == 155) {
                        i2 = 0;
                        int iZo = sa.Zo(sa.er(i), 0);
                        if (sa.ro(iZo) && sa.u7(iZo).lg() && this.f1540v5.DW(ia)) {
                            return;
                        }
                    } else {
                        i2 = 0;
                    }
                    int iCb = ia.cb();
                    for (int i8 = 0; i8 < iCb; i8++) {
                        m3619j6(sa, i, sa.Zo(sa.er(i), sa.we(sa.er(i)) - 1), kb, ia, i8);
                    }
                } else {
                    i2 = 0;
                }
                if (sa.Zo(i) == 22 || sa.Zo(i) == 25 || sa.Zo(i) == 24 || sa.Zo(i) == 23) {
                    Ia ia2 = (Ia) sa.v5(i);
                    int iCb2 = ia2.cb();
                    while (i2 < iCb2) {
                        m3619j6(sa, i, sa.Zo(sa.er(sa.er(i)), sa.we(sa.er(sa.er(i))) - 1), kb, ia2, i2);
                        i2++;
                    }
                    return;
                }
                return;
            }
            if (iP8 == 142) {
                int iWe = sa.we(i);
                for (int i9 = 0; i9 < iWe; i9++) {
                    m3620j6(sa, sa.Zo(i7, i9), kb);
                }
                if (sa.ro(sa.Zo(i7, 1))) {
                    m3622j6(sa, kb, sa.u7(sa.Zo(i7, 1)), i7);
                    return;
                }
                return;
            }
            if (iP8 == 150) {
                Kb kbM3616j6 = m3616j6();
                m3620j6(sa, sa.Zo(i7, 1), kbM3616j6);
                int iWe2 = sa.we(i);
                int i10 = 2;
                while (true) {
                    i3 = 3;
                    i4 = Opcodes.SUB_DOUBLE_2ADDR;
                    if (i10 >= iWe2) {
                        break;
                    }
                    int iZo2 = sa.Zo(i7, i10);
                    if (sa.P8(iZo2) == 204) {
                        int iZo3 = sa.Zo(iZo2, 3);
                        int iWe3 = sa.we(iZo3);
                        int i11 = 0;
                        while (i11 < iWe3) {
                            int iZo4 = sa.Zo(iZo3, i11);
                            if (sa.ro(iZo4)) {
                                ua uaVarU7 = sa.u7(iZo4);
                                try {
                                    i6 = iZo3;
                                    try {
                                        if (this.f1540v5.Hw(sa.VH(), uaVarU7) && uaVarU7 != this.f1540v5.QX(sa.VH()) && uaVarU7 != this.f1540v5.gW(sa.VH()) && !m3593DW(sa, kbM3616j6, (Ya) uaVarU7)) {
                                            this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(iZo4), sa.BT(iZo4), sa.QX(iZo4), sa.Ws(iZo4), "异常情况 </C>" + uaVarU7.VH() + "<//C> 未抛出", 12);
                                            this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(iZo2), sa.BT(iZo2), sa.QX(iZo2), sa.Ws(iZo2), "", "删除catch子句");
                                        }
                                    } catch (jc unused) {
                                    }
                                } catch (jc unused2) {
                                    i6 = iZo3;
                                }
                            } else {
                                i6 = iZo3;
                            }
                            i11 += 2;
                            iZo3 = i6;
                        }
                    }
                    i10++;
                }
                for (int i12 = 2; i12 < iWe2; i12++) {
                    int iZo5 = sa.Zo(i7, i12);
                    if (sa.P8(iZo5) == 204) {
                        int iZo6 = sa.Zo(iZo5, 3);
                        int iWe4 = sa.we(iZo6);
                        for (int i13 = 0; i13 < iWe4; i13 += 2) {
                            int iZo7 = sa.Zo(iZo6, i13);
                            if (sa.ro(iZo7)) {
                                m3621j6(sa, kbM3616j6, sa.u7(iZo7));
                            }
                        }
                    }
                }
                int i14 = 2;
                while (i14 < iWe2) {
                    try {
                        int iZo8 = sa.Zo(i7, i14);
                        if (sa.P8(iZo8) == i4) {
                            int iZo9 = sa.Zo(iZo8, i3);
                            int iWe5 = sa.we(iZo9);
                            int i15 = 0;
                            while (i15 < iWe5) {
                                int iZo10 = sa.Zo(iZo9, i15);
                                if (sa.ro(iZo10)) {
                                    Ya yaU7 = sa.u7(iZo10);
                                    int i16 = 2;
                                    while (i16 < i14) {
                                        int iZo11 = sa.Zo(i7, i16);
                                        int i17 = iZo9;
                                        int i18 = iWe5;
                                        if (sa.P8(iZo11) == 204) {
                                            int iZo12 = sa.Zo(iZo11, 3);
                                            int iWe6 = sa.we(iZo12);
                                            int i19 = 0;
                                            while (i19 < iWe6) {
                                                int i20 = iWe6;
                                                int iZo13 = sa.Zo(iZo12, i19);
                                                if (sa.ro(iZo13)) {
                                                    i5 = iZo12;
                                                    if (yaU7.FH(sa.VH(), sa.J8(), sa.u7(iZo13))) {
                                                        this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(iZo10), sa.BT(iZo10), sa.QX(iZo10), sa.Ws(iZo10), "异常情况 </C>" + yaU7.VH() + "<//C>已被捕获", 12);
                                                        this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(iZo8), sa.BT(iZo8), sa.QX(iZo8), sa.Ws(iZo8), "", "删除catch子句");
                                                    }
                                                } else {
                                                    i5 = iZo12;
                                                }
                                                i19 += 2;
                                                iWe6 = i20;
                                                iZo12 = i5;
                                            }
                                        }
                                        i16++;
                                        i7 = i;
                                        iZo9 = i17;
                                        iWe5 = i18;
                                    }
                                }
                                i15 += 2;
                                i7 = i;
                                iZo9 = iZo9;
                                iWe5 = iWe5;
                            }
                        }
                        i14++;
                        i7 = i;
                        i3 = 3;
                        i4 = Opcodes.SUB_DOUBLE_2ADDR;
                    } catch (Throwable th) {
                        th = th;
                        i7 = i;
                        if (f1523DW) {
                            wu.j6(th, 2739759092726613997L, this, sa, new Integer(i7), kb);
                        }
                        throw th;
                    }
                }
                kb.FH(kbM3616j6);
                m3617j6(kbM3616j6);
                for (int i21 = 2; i21 < iWe2; i21++) {
                    m3620j6(sa, sa.Zo(i, i21), kb);
                }
                return;
            }
            switch (iP8) {
                case 122:
                    int iWe7 = sa.we(i);
                    for (int i22 = 0; i22 < iWe7; i22++) {
                        int iZo14 = sa.Zo(i7, i22);
                        int iP9 = sa.P8(iZo14);
                        if (iP9 != 126) {
                            if (iP9 != 127) {
                                m3620j6(sa, iZo14, kb);
                            } else if (sa.we(sa.Zo(iZo14, 0)) != 0) {
                                Kb kbM3616j7 = m3616j6();
                                m3620j6(sa, sa.Zo(iZo14, sa.we(iZo14) - 1), kbM3616j7);
                                kbM3616j7.Hw.DW();
                                while (kbM3616j7.Hw.j6()) {
                                    this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(kbM3616j7.Hw.Hw()), sa.BT(kbM3616j7.Hw.Hw()), sa.QX(kbM3616j7.Hw.Hw()), sa.Ws(kbM3616j7.Hw.Hw()), "异常情况 </C>" + this.f1527Hw.FH(kbM3616j7.Hw.FH()).VH() + "<//C> 必须被捕获", 12);
                                    this.f1526FH.FH(sa.VH(), sa.J8(), sa.vy(kbM3616j7.Hw.Hw()), sa.BT(kbM3616j7.Hw.Hw()), "添加 try/catch");
                                }
                                m3617j6(kbM3616j7);
                            } else {
                                m3620j6(sa, iZo14, kb);
                            }
                        }
                    }
                    return;
                case 123:
                    Kb kbM3616j8 = m3616j6();
                    m3620j6(sa, sa.Zo(i7, sa.we(i) - 1), kbM3616j8);
                    int iEr = sa.er(i);
                    int iWe8 = sa.we(iEr);
                    for (int i23 = 0; i23 < iWe8; i23++) {
                        int iZo15 = sa.Zo(iEr, i23);
                        int iP10 = sa.P8(iZo15);
                        if (iP10 == 126 || (iP10 == 127 && sa.we(sa.Zo(iZo15, 0)) == 0)) {
                            m3620j6(sa, iZo15, kbM3616j8);
                        }
                    }
                    int iZo16 = sa.Zo(i7, 4);
                    int iWe9 = sa.we(iZo16);
                    for (int i24 = 1; i24 < iWe9; i24 += 2) {
                        int iZo17 = sa.Zo(iZo16, i24);
                        if (sa.ro(iZo17)) {
                            ua uaVarU8 = sa.u7(iZo17);
                            try {
                                if (!m3593DW(sa, kbM3616j8, (Ya) uaVarU8) && this.f1540v5.Hw(sa.VH(), uaVarU8) && uaVarU8 != this.f1540v5.QX(sa.VH()) && uaVarU8 != this.f1540v5.gW(sa.VH()) && this.f1536gn) {
                                    this.f1526FH.Zo(sa.VH(), sa.J8(), sa.vy(iZo17), sa.BT(iZo17), sa.QX(iZo17), sa.Ws(iZo17), "异常情况 </C>" + uaVarU8.VH() + "<//C> 未抛出", 50);
                                }
                            } catch (jc unused3) {
                            }
                        }
                    }
                    for (int i25 = 1; i25 < iWe9; i25 += 2) {
                        int iZo18 = sa.Zo(iZo16, i25);
                        if (sa.ro(iZo18)) {
                            m3621j6(sa, kbM3616j8, sa.u7(iZo18));
                        }
                    }
                    kbM3616j8.Hw.DW();
                    while (kbM3616j8.Hw.j6()) {
                        String str = "异常情况 </C>" + this.f1527Hw.FH(kbM3616j8.Hw.FH()).VH() + "<//C> 必须被捕获";
                        int iVy = sa.vy(kbM3616j8.Hw.Hw());
                        int iBT = sa.BT(kbM3616j8.Hw.Hw());
                        int iQX = sa.QX(kbM3616j8.Hw.Hw());
                        int iWs = sa.Ws(kbM3616j8.Hw.Hw());
                        if (iVy == iQX && iBT == iWs) {
                            iWs++;
                        }
                        this.f1526FH.j6(sa.VH(), sa.J8(), iVy, iBT, iQX, iWs, str, 12);
                        this.f1526FH.FH(sa.VH(), sa.J8(), iVy, iBT, "添加 try/catch");
                        this.f1526FH.j6(sa.VH(), sa.J8(), iVy, iBT, "添加throws语句");
                    }
                    m3617j6(kbM3616j8);
                    return;
                case 124:
                    Kb kbM3616j9 = m3616j6();
                    m3620j6(sa, sa.Zo(i7, sa.we(i) - 1), kbM3616j9);
                    int iZo19 = sa.Zo(i7, 7);
                    int iWe10 = sa.we(iZo19);
                    try {
                        if (!this.f1527Hw.DW(sa.VH(), sa.J8(), sa.J8(i)).XX()) {
                            for (int i26 = 1; i26 < iWe10; i26 += 2) {
                                int iZo20 = sa.Zo(iZo19, i26);
                                if (sa.ro(iZo20)) {
                                    ua uaVarU9 = sa.u7(iZo20);
                                    try {
                                        if (!m3593DW(sa, kbM3616j9, (Ya) uaVarU9) && this.f1540v5.Hw(sa.VH(), uaVarU9) && uaVarU9 != this.f1540v5.QX(sa.VH()) && uaVarU9 != this.f1540v5.gW(sa.VH()) && this.f1536gn) {
                                            this.f1526FH.Zo(sa.VH(), sa.J8(), sa.vy(iZo20), sa.BT(iZo20), sa.QX(iZo20), sa.Ws(iZo20), "异常情况 </C>" + uaVarU9.VH() + "<//C> 未抛出", 50);
                                        }
                                    } catch (jc unused4) {
                                    }
                                }
                            }
                        }
                    } catch (jc unused5) {
                    }
                    for (int i27 = 1; i27 < iWe10; i27 += 2) {
                        int iZo21 = sa.Zo(iZo19, i27);
                        if (sa.ro(iZo21)) {
                            m3621j6(sa, kbM3616j9, sa.u7(iZo21));
                        }
                    }
                    kbM3616j9.Hw.DW();
                    while (kbM3616j9.Hw.j6()) {
                        String str2 = "异常情况 </C>" + this.f1527Hw.FH(kbM3616j9.Hw.FH()).VH() + "<//C> 必须在throws子句中捕获或声明";
                        int iVy2 = sa.vy(kbM3616j9.Hw.Hw());
                        int iBT2 = sa.BT(kbM3616j9.Hw.Hw());
                        this.f1526FH.j6(sa.VH(), sa.J8(), iVy2, iBT2, sa.QX(kbM3616j9.Hw.Hw()), sa.Ws(kbM3616j9.Hw.Hw()), str2, 12);
                        this.f1526FH.FH(sa.VH(), sa.J8(), iVy2, iBT2, "添加 try/catch");
                        this.f1526FH.j6(sa.VH(), sa.J8(), iVy2, iBT2, "添加throws语句");
                    }
                    m3617j6(kbM3616j9);
                    return;
                default:
                    int iWe11 = sa.we(i);
                    for (int i28 = 0; i28 < iWe11; i28++) {
                        m3620j6(sa, sa.Zo(i7, i28), kb);
                    }
                    return;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @su(method = 116265926861685120L)
    private void m3621j6(Sa sa, Kb kb, Ya ya) {
        try {
            if (f1524j6) {
                wu.j6(-596476287953095068L, this, sa, kb, ya);
            }
            Kb kbM3616j6 = m3616j6();
            kb.Hw.DW();
            while (kb.Hw.j6()) {
                if (!this.f1527Hw.FH(kb.Hw.FH()).FH(sa.VH(), sa.J8(), ya)) {
                    kbM3616j6.j6(kb.Hw.FH(), kb.Hw.Hw());
                }
            }
            kb.j6();
            kb.FH(kbM3616j6);
            m3617j6(kbM3616j6);
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -596476287953095068L, this, sa, kb, ya);
            }
            throw th;
        }
    }

    @su(method = 30737830246434864L)
    private void m3622j6(Sa sa, Kb kb, Ya ya, int i) {
        try {
            if (f1524j6) {
                wu.j6(-4353626257859679900L, this, sa, kb, ya, new Integer(i));
            }
            if (this.f1540v5.Hw(sa.VH(), ya)) {
                kb.j6(ya.EQ(), i);
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -4353626257859679900L, this, sa, kb, ya, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = -1814834780868475392L)
    private void m3623j6(boolean z) {
        try {
            if (f1524j6) {
                wu.j6(-3469590687437411532L, this, z);
            }
            int i = 0;
            if (z) {
                while (i < this.f1529J8) {
                    this.f1541we.FH(this.f1525EQ.DW((this.f1525EQ.Hw() - this.f1529J8) + i));
                    this.f1528J0.FH(-1);
                    i++;
                }
                return;
            }
            while (i < this.f1529J8) {
                this.f1541we.FH(-1);
                this.f1528J0.FH(this.f1525EQ.DW((this.f1525EQ.Hw() - this.f1529J8) + i));
                i++;
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -3469590687437411532L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @su(method = -125167050571009620L)
    private boolean m3624j6(int i) {
        try {
            if (f1524j6) {
                wu.j6(-2663311704124757840L, this, i);
            }
            return (this.f1525EQ.DW((this.f1525EQ.Hw() - this.f1529J8) + (i / 31)) & (1 << (i % 31))) != 0;
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -2663311704124757840L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0034 A[Catch: Throwable -> 0x049f, TryCatch #0 {Throwable -> 0x049f, blocks: (B:3:0x0008, B:5:0x000c, B:6:0x0022, B:9:0x002e, B:13:0x0078, B:23:0x0095, B:24:0x0098, B:26:0x009e, B:28:0x00a9, B:45:0x00ee, B:46:0x00f8, B:48:0x0109, B:50:0x010f, B:52:0x0115, B:54:0x011f, B:56:0x012b, B:58:0x013a, B:60:0x0140, B:62:0x0146, B:64:0x014c, B:66:0x0156, B:57:0x0133, B:74:0x0176, B:79:0x0190, B:107:0x026c, B:123:0x02b8, B:125:0x02bf, B:127:0x02ca, B:130:0x02d5, B:133:0x02db, B:135:0x02df, B:137:0x02f0, B:139:0x02f6, B:141:0x0300, B:143:0x030c, B:145:0x031b, B:147:0x0321, B:149:0x0327, B:151:0x0331, B:144:0x0314, B:159:0x0351, B:161:0x036a, B:163:0x0379, B:164:0x037e, B:166:0x0382, B:168:0x038e, B:170:0x039c, B:172:0x03b0, B:174:0x03b6, B:176:0x03c1, B:178:0x03cb, B:180:0x03f6, B:182:0x0402, B:184:0x0408, B:186:0x0424, B:194:0x047f, B:190:0x0471, B:12:0x0034), top: B:204:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x04a4  */
    /* JADX WARN: Multi-variable type inference failed */
    @su(method = 251906958129355260L)
    private boolean m3625j6(Sa sa, int i, boolean z) throws Throwable {
        boolean z2 = z;
        try {
            if (f1524j6) {
                wu.j6(-608205069973540032L, this, sa, new Integer(i), new Boolean(z2));
            }
            int iP8 = sa.P8(i);
            if (iP8 != 209 && iP8 != 211) {
                switch (iP8) {
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
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                        if (z2 == 0) {
                            this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(i), sa.BT(i), sa.QX(i), sa.Ws(i), "无法访问此语句", 12);
                            this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(i), sa.BT(i), sa.QX(i), sa.Ws(i), "", "删除");
                        }
                        break;
                }
            } else if (z2 == 0) {
                this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(i), sa.BT(i), sa.QX(i), sa.Ws(i), "无法访问此语句", 12);
                this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(i), sa.BT(i), sa.QX(i), sa.Ws(i), "", "删除");
            }
            int iP9 = sa.P8(i);
            if (iP9 == 124) {
                int iZo = sa.Zo(i, 8);
                if (sa.P8(iZo) == 133 && m3625j6(sa, iZo, true)) {
                    try {
                        Ya yaCa = this.f1527Hw.DW(sa.VH(), sa.J8(), sa.J8(i)).ca();
                        if (yaCa.dx() != 1) {
                            int iZo2 = sa.Zo(iZo, sa.we(iZo) - 1);
                            this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(iZo2), sa.BT(iZo2), sa.QX(iZo2), sa.Ws(iZo2), "此方法必须返回类型为 </C>" + yaCa.VH() + "<//C>", 12);
                            this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(iZo2), sa.BT(iZo2), sa.vy(iZo2), sa.BT(iZo2), yaCa.dx() == 11 ? "return false;\n" : this.f1540v5.DW(yaCa) ? "return 0;\n" : "return null;\n", "插入 return 语句");
                        }
                    } catch (jc unused) {
                    }
                }
                return true;
            }
            if (iP9 == 127) {
                int iZo3 = sa.Zo(i, 1);
                if (!m3625j6(sa, iZo3, true)) {
                    int iZo4 = sa.Zo(iZo3, sa.we(iZo3) - 1);
                    this.f1526FH.j6(sa.VH(), sa.J8(), sa.vy(iZo4), sa.BT(iZo4), sa.QX(iZo4), sa.Ws(iZo4), "初始值设定项必须能够正常完成", 12);
                }
                return true;
            }
            zM3606VH = false;
            boolean zM3606VH = false;
            if (iP9 != 209) {
                if (iP9 == 211) {
                    m3625j6(sa, sa.Zo(i, 10), z2);
                    this.f1538tp.FH(i);
                    this.f1539u7.FH(i);
                    return z2;
                }
                if (iP9 == 212) {
                    return m3625j6(sa, sa.Zo(i, sa.we(i) - 1), z2);
                }
                try {
                    try {
                        switch (iP9) {
                            case 133:
                                int iWe = sa.we(i);
                                int i2 = 1;
                                boolean z3 = z2;
                                while (i2 < iWe - 1) {
                                    boolean zM3625j6 = m3625j6(sa, sa.Zo(i, i2), z3);
                                    i2++;
                                    z3 = zM3625j6;
                                }
                                return z3;
                            case 134:
                            case 143:
                            case 144:
                            case 146:
                            case 151:
                                break;
                            case 135:
                                m3625j6(sa, sa.Zo(i, 2), z2);
                                m3625j6(sa, sa.Zo(i, 4), z2);
                                return z2;
                            case 136:
                                m3625j6(sa, sa.Zo(i, 2), z2);
                                return m3625j6(sa, sa.Zo(i, 4), z2) | m3625j6(sa, sa.Zo(i, 6), z2);
                            case 137:
                                m3625j6(sa, sa.Zo(i, 2), z2);
                                int iZo5 = sa.Zo(i, 2);
                                if (sa.cn(iZo5) && sa.ro(iZo5) && sa.u7(iZo5).dx() == 11 && !this.f1527Hw.j6(sa.tp(iZo5))) {
                                    m3625j6(sa, sa.Zo(i, 4), false);
                                } else {
                                    m3625j6(sa, sa.Zo(i, 4), z2);
                                }
                                boolean zM3606VH2 = (sa.cn(iZo5) && sa.ro(iZo5) && sa.u7(iZo5).dx() == 11 && this.f1527Hw.j6(sa.tp(iZo5))) ? false : z2 ? 1 : 0;
                                if (!zM3606VH2) {
                                    zM3606VH2 = m3606VH(sa, i);
                                }
                                this.f1538tp.FH(i);
                                this.f1539u7.FH(i);
                                return zM3606VH2;
                            case 138:
                                if (z2 != 0) {
                                    m3591DW(sa, i);
                                }
                                return false;
                            case 139:
                                if (z2 != 0) {
                                    m3599Hw(sa, i);
                                }
                                return false;
                            case 140:
                                return m3625j6(sa, sa.Zo(i, 4), z2);
                            case 141:
                            case 142:
                                int iWe2 = sa.we(i);
                                for (int i3 = 0; i3 < iWe2; i3++) {
                                    m3625j6(sa, sa.Zo(i, i3), z2);
                                }
                                return false;
                            case 145:
                                boolean zM3625j7 = m3625j6(sa, sa.Zo(i, 1), z2);
                                int iZo6 = sa.Zo(i, 4);
                                if (sa.cn(iZo6) && sa.ro(iZo6) && sa.u7(iZo6).dx() == 11 && this.f1527Hw.j6(sa.tp(iZo6))) {
                                    zM3625j7 = false;
                                }
                                if (!zM3625j7) {
                                    zM3625j7 = m3606VH(sa, i);
                                }
                                this.f1538tp.FH(i);
                                this.f1539u7.FH(i);
                                m3625j6(sa, sa.Zo(i, 4), zM3625j7);
                                return zM3625j7;
                            case 147:
                                m3625j6(sa, sa.Zo(i, 2), z2);
                                int iZo7 = sa.Zo(i, 4);
                                int iWe3 = sa.we(iZo7);
                                boolean zM3606VH3 = z2 ? 1 : 0;
                                boolean z4 = false;
                                for (int i4 = 1; i4 < iWe3 - 1; i4++) {
                                    if (sa.P8(sa.Zo(iZo7, i4)) == 144) {
                                        z4 = true;
                                    }
                                    int iP10 = sa.P8(sa.Zo(iZo7, i4));
                                    if (iP10 == 143 || iP10 == 144) {
                                        int i5 = i4 - 1;
                                        int iP11 = sa.P8(sa.Zo(iZo7, i5));
                                        if (iP11 != 8 && iP11 != 143 && iP11 != 144 && zM3606VH3 && this.f1536gn) {
                                            this.f1526FH.Zo(sa.VH(), sa.J8(), sa.QX(sa.Zo(iZo7, i5)), sa.Ws(sa.Zo(iZo7, i5)) - 1, sa.QX(sa.Zo(iZo7, i5)), sa.Ws(sa.Zo(iZo7, i5)) + 1, "可能会失败", 48);
                                            this.f1526FH.j6(sa.VH(), sa.J8(), sa.QX(sa.Zo(iZo7, i5)), sa.Ws(sa.Zo(iZo7, i5)), sa.QX(sa.Zo(iZo7, i5)), sa.Ws(sa.Zo(iZo7, i5)), "\nbreak;", "插入 break 语句");
                                        }
                                        zM3606VH3 = m3625j6(sa, sa.Zo(iZo7, i4), z2);
                                    } else {
                                        zM3606VH3 = m3625j6(sa, sa.Zo(iZo7, i4), zM3606VH3);
                                    }
                                }
                                if (!zM3606VH3 && !z4) {
                                    zM3606VH3 = z2 ? 1 : 0;
                                }
                                if (!zM3606VH3) {
                                    zM3606VH3 = m3606VH(sa, i);
                                }
                                this.f1538tp.FH(i);
                                this.f1539u7.FH(i);
                                return zM3606VH3;
                            case 148:
                                boolean zM3625j8 = m3625j6(sa, sa.Zo(i, 2), z2);
                                if (!zM3625j8) {
                                    zM3625j8 = m3606VH(sa, i);
                                }
                                this.f1538tp.FH(i);
                                this.f1539u7.FH(i);
                                return zM3625j8;
                            case 149:
                                for (int i6 = 0; i6 < 6; i6++) {
                                    m3625j6(sa, sa.Zo(i, i6), true);
                                }
                                int iZo8 = sa.Zo(sa.Zo(i, 3), 0);
                                if (sa.P8(iZo8) != 14 && sa.cn(iZo8) && sa.ro(iZo8) && sa.u7(iZo8).dx() == 11 && !this.f1527Hw.j6(sa.tp(iZo8))) {
                                    m3625j6(sa, sa.Zo(i, 6), false);
                                } else {
                                    m3625j6(sa, sa.Zo(i, 6), z2);
                                }
                                if (sa.P8(iZo8) != 14 && (!sa.cn(iZo8) || !sa.ro(iZo8) || sa.u7(iZo8).dx() != 11 || !this.f1527Hw.j6(sa.tp(iZo8)))) {
                                    zM3606VH = z2 ? 1 : 0;
                                }
                                if (!zM3606VH) {
                                    zM3606VH = m3606VH(sa, i);
                                }
                                this.f1538tp.FH(i);
                                this.f1539u7.FH(i);
                                return zM3606VH;
                            case 150:
                                boolean zM3625j9 = m3625j6(sa, sa.Zo(i, 1), z2);
                                int iWe4 = sa.we(i);
                                for (int i7 = 2; i7 < iWe4; i7++) {
                                    int iP12 = sa.P8(sa.Zo(i, i7));
                                    if (iP12 == 204) {
                                        zM3625j9 |= m3625j6(sa, sa.Zo(sa.Zo(i, i7), 6), z2);
                                    } else if (iP12 == 205) {
                                        zM3625j9 &= m3625j6(sa, sa.Zo(sa.Zo(i, i7), 1), z2);
                                    }
                                }
                                return zM3625j9;
                            default:
                                int iWe5 = sa.we(i);
                                for (int i8 = 0; i8 < iWe5; i8++) {
                                    m3625j6(sa, sa.Zo(i, i8), true);
                                }
                                return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z2 = 6;
                        if (f1523DW) {
                            wu.j6(th, -608205069973540032L, this, sa, new Integer(i), new Boolean(z2));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z2 = 0;
                    if (f1523DW) {
                        wu.j6(th, -608205069973540032L, this, sa, new Integer(i), new Boolean(z2));
                    }
                    throw th;
                }
            }
            int iWe6 = sa.we(i);
            for (int i9 = 0; i9 < iWe6; i9++) {
                m3625j6(sa, sa.Zo(i, i9), z2);
            }
            return z2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @su(method = 726831897550659180L)
    private void m3626lg() {
        try {
            if (f1524j6) {
                wu.j6(-3437713502432803360L, this);
            }
            if (this.f1532Ws < 0) {
                for (int iMax = Math.max(0, this.f1541we.Hw() - this.f1529J8); iMax < this.f1541we.Hw(); iMax++) {
                    this.f1541we.j6(iMax, 0);
                    this.f1528J0.j6(iMax, 0);
                }
                return;
            }
            int iHw = (this.f1541we.Hw() - this.f1529J8) + (this.f1532Ws / 31);
            for (int i = iHw + 1; i < this.f1541we.Hw(); i++) {
                this.f1541we.j6(i, 0);
                this.f1528J0.j6(i, 0);
            }
            int i2 = (-1) >>> (31 - (this.f1532Ws % 31));
            this.f1541we.j6(iHw, this.f1541we.DW(iHw) & i2);
            this.f1528J0.j6(iHw, i2 & this.f1528J0.DW(iHw));
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -3437713502432803360L, this);
            }
            throw th;
        }
    }

    @su(method = -4329191993184513140L)
    private void m3627tp() {
        try {
            if (f1524j6) {
                wu.j6(-2858434901373962304L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                this.f1525EQ.FH(this.f1525EQ.DW(this.f1525EQ.Hw() - this.f1529J8));
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -2858434901373962304L, this);
            }
            throw th;
        }
    }

    @su(method = -88098861582390227L)
    private void m3628tp(Sa sa, int i) {
        try {
            if (f1524j6) {
                wu.j6(-2506587062058478103L, this, sa, new Integer(i));
            }
            for (int i2 = 0; i2 < this.f1529J8; i2++) {
                this.f1541we.j6((this.f1541we.Hw() - this.f1529J8) + i2, this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i2) & this.f1535aM.DW((this.f1535aM.Hw() - this.f1529J8) + i2));
                this.f1528J0.j6((this.f1528J0.Hw() - this.f1529J8) + i2, this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i2) & this.f1535aM.DW((this.f1535aM.Hw() - this.f1529J8) + i2));
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -2506587062058478103L, this, sa, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = -3799905575828337976L)
    private void m3629u7() {
        try {
            if (f1524j6) {
                wu.j6(-840617949707530184L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                this.f1525EQ.FH(this.f1541we.DW((this.f1541we.Hw() - this.f1529J8) + i));
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -840617949707530184L, this);
            }
            throw th;
        }
    }

    @su(method = 3969174057768834525L)
    private void m3630u7(Sa sa, int i) {
        try {
            if (f1524j6) {
                wu.j6(4110034780595017413L, this, sa, new Integer(i));
            }
            this.f1530QX.FH(i);
            this.f1533XL.FH(i);
            for (int i2 = 0; i2 < this.f1529J8; i2++) {
                this.f1537j3.FH();
            }
            for (int i3 = 0; i3 < this.f1529J8; i3++) {
                this.f1535aM.FH();
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 4110034780595017413L, this, sa, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = 1096804752857888137L)
    private void m3631v5() {
        try {
            if (f1524j6) {
                wu.j6(3752675648478821449L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                this.f1541we.FH(-1);
                this.f1528J0.FH(-1);
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 3752675648478821449L, this);
            }
            throw th;
        }
    }

    @su(method = -439163142522118880L)
    private void m3632v5(Sa sa, int i) {
        try {
            if (f1524j6) {
                wu.j6(-612822512837306904L, this, sa, new Integer(i));
            }
            this.f1530QX.j6(i, this.f1535aM.Hw());
            this.f1533XL.j6(i, this.f1537j3.Hw());
            for (int i2 = 0; i2 < this.f1529J8; i2++) {
                this.f1535aM.FH(-1);
            }
            for (int i3 = 0; i3 < this.f1529J8; i3++) {
                this.f1537j3.FH(-1);
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, -612822512837306904L, this, sa, new Integer(i));
            }
            throw th;
        }
    }

    @su(method = 5970743223891337500L)
    private void m3633we() {
        try {
            if (f1524j6) {
                wu.j6(4966982198132051072L, this);
            }
            for (int i = 0; i < this.f1529J8; i++) {
                int iDW = this.f1528J0.DW((this.f1528J0.Hw() - this.f1529J8) + i);
                this.f1541we.j6((this.f1528J0.Hw() - this.f1529J8) + i, iDW);
                this.f1528J0.j6((this.f1528J0.Hw() - this.f1529J8) + i, iDW);
            }
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 4966982198132051072L, this);
            }
            throw th;
        }
    }

    public void m3634DW(Sa sa) {
        try {
            if (f1524j6) {
                wu.j6(3061491024927343905L, this, sa);
            }
            Kb kbM3616j6 = m3616j6();
            m3620j6(sa, sa.aM(), kbM3616j6);
            m3617j6(kbM3616j6);
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 3061491024927343905L, this, sa);
            }
            throw th;
        }
    }

    public void m3635FH(Sa sa) {
        try {
            if (f1524j6) {
                wu.j6(6499484554753996448L, this, sa);
            }
            this.f1539u7.j6();
            this.f1538tp.j6();
            m3625j6(sa, sa.aM(), true);
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 6499484554753996448L, this, sa);
            }
            throw th;
        }
    }

    public void m3636j6(Sa sa) {
        try {
            if (f1524j6) {
                wu.j6(2819950732953212496L, this, sa);
            }
            this.f1532Ws = -1;
            this.f1529J8 = (sa.FH() / 31) + 1;
            this.f1525EQ.j6();
            this.f1541we.j6();
            this.f1528J0.j6();
            this.f1530QX.j6();
            this.f1533XL.j6();
            this.f1535aM.j6();
            this.f1537j3.j6();
            m3594EQ();
            m3610Zo(sa, sa.aM());
        } catch (Throwable th) {
            if (f1523DW) {
                wu.j6(th, 2819950732953212496L, this, sa);
            }
            throw th;
        }
    }
}
