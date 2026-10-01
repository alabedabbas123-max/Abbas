package abcd;

public class dL extends java.util.ArrayList implements java.util.List, abcd.InterfaceeL, abcd.InterfacegL {
    public dL() {
    }

    public static java.lang.String j6(java.util.List r4) {
        if (r4 != null) goto L5;
        return "null";
    L5:
        boolean r1 = true;
        java.lang.StringBuffer r2 = new java.lang.StringBuffer();
        java.util.Iterator r5 = r4.iterator();
        r2.append('[');
    L7:
        if (r5.hasNext() == false) goto L15;
        if (r1 == false) goto L10;
        r1 = false;
    L11:
        java.lang.Object r3 = r5.next();
        if (r3 == null) goto L13;
        r2.append(abcd.hL.j6(r3));
        goto L7
    L13:
        r2.append("null");
        goto L7
    L10:
        r2.append(',');
        goto L11
    L15:
        r2.append(']');
        return r2.toString();
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
