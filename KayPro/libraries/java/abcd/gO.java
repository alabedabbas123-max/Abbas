package abcd;

class gO {
    static abcd.HL j6(java.util.List r2) {
        abcd.rL r0 = new abcd.rL();
        java.util.Iterator r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        r0.j6((abcd.InterfaceqL) r3.next());
        goto L4
    L6:
        return new abcd.WL(r0);
    }

    static java.io.OutputStream j6(java.io.OutputStream r0) {
        if (r0 == null) goto L4;
        return r0;
    L4:
        return new abcd.jO();
    }

    static java.io.OutputStream j6(java.io.OutputStream r1, java.io.OutputStream r2) {
        if (r1 == null) goto L8;
        if (r2 != null) goto L7;
        return j6(r1);
    L7:
        return new abcd.YP(r1, r2);
    L8:
        return j6(r2);
    }

    static java.io.OutputStream j6(java.util.Collection r1, java.io.OutputStream r2) {
        java.util.Iterator r3 = r1.iterator();
    L4:
        if (r3.hasNext() == false) goto L5;
        r2 = j6(r2, ((abcd.kO) r3.next()).DW());
        goto L4
    L5:
        return r2;
    }

    public static java.security.Provider j6(java.lang.String r3) {
        if (r3 == null) goto L8;
        java.security.Provider r0 = java.security.Security.getProvider(r3);
        if (r0 == null) goto L7;
        return r0;
    L7:
        throw new java.security.NoSuchProviderException("provider " + r3 + " not found.");
    L8:
        return null;
    }

    static java.util.List j6(abcd.SP r2) {
        java.util.ArrayList r0 = new java.util.ArrayList();
        java.util.Iterator r3 = r2.j6(null).iterator();     // Catch: java.lang.ClassCastException -> L9
    L5:
        if (r3.hasNext() == false) goto L6;
        r0.add(((abcd.SN) r3.next()).j6());     // Catch: java.lang.ClassCastException -> L9
        goto L5
    L6:
        return r0;
    L9:
        e = move-exception;
        throw new abcd.XN("error processing certs", e);
    }
}
