package abcd;

public class fL extends java.util.HashMap implements java.util.Map, abcd.InterfaceeL, abcd.InterfacegL {
    public fL() {
    }

    private static java.lang.String j6(java.lang.String r1, java.lang.Object r2, java.lang.StringBuffer r3) {
        r3.append('\"');
        if (r1 != null) goto L5;
        r3.append("null");
    L6:
        r3.append('\"');
        r3.append(':');
        r3.append(abcd.hL.j6(r2));
        return r3.toString();
    L5:
        abcd.hL.j6(r1, r3);
        goto L6
    }

    public static java.lang.String j6(java.util.Map r4) {
        if (r4 != null) goto L5;
        return "null";
    L5:
        java.lang.StringBuffer r0 = new java.lang.StringBuffer();
        boolean r1 = true;
        java.util.Iterator r5 = r4.entrySet().iterator();
        r0.append('{');
    L7:
        if (r5.hasNext() == false) goto L12;
        if (r1 == false) goto L10;
        r1 = false;
    L11:
        java.util.Map.Entry r2 = (java.util.Map.Entry) r5.next();
        j6(java.lang.String.valueOf(r2.getKey()), r2.getValue(), r0);
        goto L7
    L10:
        r0.append(',');
        goto L11
    L12:
        r0.append('}');
        return r0.toString();
    }

    @Override
    public java.lang.String j6() {
        return j6(this);
    }

    @Override
    public java.lang.String toString() {
        return j6();
    }
}
