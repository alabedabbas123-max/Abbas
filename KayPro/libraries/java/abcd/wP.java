package abcd;

public class wP implements abcd.InterfaceyP {
    private static java.util.Map DW;
    private static java.util.Map j6;

    static {
        j6 = new java.util.HashMap();
        DW = new java.util.HashMap();
        j6.put(abcd.InterfacejN.FH, abcd.InterfacelN.nw);
        j6.put(abcd.InterfacejN.j6, abcd.InterfacelN.nw);
        j6.put(abcd.InterfacejN.EQ, abcd.InterfacejN.u7);
        j6.put(abcd.InterfacelN.Ws, abcd.InterfacehN.v5);
        j6.put(abcd.InterfacelN.we, abcd.InterfacehN.DW);
        j6.put(abcd.InterfacelN.J0, abcd.InterfacehN.FH);
        j6.put(abcd.InterfacelN.J8, abcd.InterfacehN.Hw);
        j6.put(abcd.InterfacelN.FH, abcd.InterfacelN.ei);
        j6.put(abcd.InterfacelN.Hw, abcd.InterfacelN.nw);
        j6.put(abcd.InterfacelN.v5, abcd.InterfacelN.SI);
        j6.put(abcd.InterfacelN.Zo, abcd.InterfacejN.u7);
        j6.put(abcd.QN.u7, abcd.InterfacejN.u7);
        j6.put(abcd.QN.J0, abcd.InterfacehN.v5);
        j6.put(abcd.QN.J8, abcd.InterfacehN.DW);
        j6.put(abcd.QN.Ws, abcd.InterfacehN.FH);
        j6.put(abcd.QN.QX, abcd.InterfacehN.Hw);
        j6.put(abcd.QN.x9, abcd.InterfacejN.u7);
        j6.put(abcd.InterfacehN.vy, abcd.InterfacehN.v5);
        j6.put(abcd.InterfacehN.P8, abcd.InterfacehN.DW);
        j6.put(abcd.InterfacehN.ei, abcd.InterfacehN.FH);
        j6.put(abcd.InterfacehN.nw, abcd.InterfacehN.Hw);
        j6.put(abcd.InterfaceoN.VH, abcd.InterfaceoN.FH);
        j6.put(abcd.InterfaceoN.Zo, abcd.InterfaceoN.DW);
        j6.put(abcd.InterfaceoN.gn, abcd.InterfaceoN.Hw);
        j6.put(abcd._M.v5, abcd._M.j6);
        j6.put(abcd._M.Zo, abcd._M.j6);
        DW.put("SHA-1", abcd.InterfacejN.u7);
        DW.put("SHA-224", abcd.InterfacehN.v5);
        DW.put("SHA-256", abcd.InterfacehN.DW);
        DW.put("SHA-384", abcd.InterfacehN.FH);
        DW.put("SHA-512", abcd.InterfacehN.Hw);
        DW.put("GOST3411", abcd._M.j6);
        DW.put("MD2", abcd.InterfacelN.ei);
        DW.put("MD4", abcd.InterfacelN.nw);
        DW.put("MD5", abcd.InterfacelN.SI);
        DW.put("RIPEMD128", abcd.InterfaceoN.FH);
        DW.put("RIPEMD160", abcd.InterfaceoN.DW);
        DW.put("RIPEMD256", abcd.InterfaceoN.Hw);
    }

    public wP() {
    }

    @Override
    public abcd.wN j6(abcd.wN r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3.v5().equals(abcd.InterfacelN.EQ) == false) { $pc0 = 6; continue $sw0; }
                    return ((abcd.nN) r3.VH()).v5();
                }
                case 6: {
                    return new abcd.wN((abcd.zL) j6.get(r3.v5()), new abcd.mM());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
