package abcd;

public class uA {
    static java.util.Map<java.lang.String, abcd.InterfacetA> DW;
    static abcd.InterfacesA j6;

    static {
        j6 = new abcd.wA();
        DW = new java.util.TreeMap();
    }

    public static abcd.InterfacetA j6(java.lang.String r2) {
        abcd.InterfacetA r0 = null;
        abcd.InterfacetA r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = DW.get(r2);
                    if (r0 != null) { $pc0 = 6; continue $sw0; }
                    r1 = j6.j6(r2);
                    DW.put(r2, r1);
                    return r1;
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
