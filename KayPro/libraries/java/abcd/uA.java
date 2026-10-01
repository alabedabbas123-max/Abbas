package abcd;

public class uA {
    static java.util.Map<java.lang.String, abcd.InterfacetA> DW;
    static abcd.InterfacesA j6;

    static {
        j6 = new abcd.wA();
        DW = new java.util.TreeMap();
    }

    public static abcd.InterfacetA j6(java.lang.String r2) {
        abcd.InterfacetA r0 = DW.get(r2);
        if (r0 != null) goto L6;
        abcd.InterfacetA r1 = j6.j6(r2);
        DW.put(r2, r1);
        return r1;
    L6:
        return r0;
    }
}
