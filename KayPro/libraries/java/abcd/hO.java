package abcd;

public class hO implements abcd._N {
    private static final java.util.Set j6 = null;

    static {
        j6 = new java.util.HashSet();
        j6.add(abcd.InterfacelN.FH);
        j6.add(abcd.InterfacelN.Hw);
        j6.add(abcd.InterfacelN.v5);
        j6.add(abcd.InterfacelN.Zo);
        j6.add(abcd.InterfacelN.Ws);
        j6.add(abcd.InterfacelN.we);
        j6.add(abcd.InterfacelN.J0);
        j6.add(abcd.InterfacelN.J8);
        j6.add(abcd.InterfacejN.FH);
        j6.add(abcd.InterfacejN.j6);
        j6.add(abcd.InterfacejN.DW);
        j6.add(abcd.InterfacejN.EQ);
        j6.add(abcd.InterfaceoN.VH);
        j6.add(abcd.InterfaceoN.Zo);
        j6.add(abcd.InterfaceoN.gn);
    }

    public hO() {
    }

    @Override
    public abcd.wN j6(abcd.wN r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6.contains(r3.v5()) == true) { $pc0 = 5; continue $sw0; }
                    return r3;
                }
                case 5: {
                    return new abcd.wN(abcd.InterfacelN.DW, abcd.mM.j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
