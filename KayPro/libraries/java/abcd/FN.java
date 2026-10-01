package abcd;

public class FN extends abcd.AbstractyL implements abcd.InterfacepL {
    abcd.EL j6;

    public FN(abcd.EL r2) {
        if ((r2 instanceof abcd.zM) == false) goto L5;
    L9:
        this.j6 = r2;
        return;
    L5:
        if ((r2 instanceof abcd.jM) == true) goto L9;
        throw new java.lang.IllegalArgumentException("unknown object passed to Time");
    }

    public FN(java.util.Date r6) {
        java.util.SimpleTimeZone r0 = new java.util.SimpleTimeZone(0, "Z");
        java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
        r3.setTimeZone(r0);
        java.lang.String r7 = java.lang.String.valueOf(r3.format(r6)) + "Z";
        int r1 = java.lang.Integer.parseInt(r7.substring(0, 4));
        if (r1 >= 1950) goto L5;
    L8:
        this.j6 = new abcd.jM(r7);
        return;
    L5:
        if (r1 > 2049) goto L8;
        this.j6 = new abcd.zM(r7.substring(2));
    }

    public static abcd.FN j6(java.lang.Object r3) {
        if (r3 == null) goto L17;
        if ((r3 instanceof abcd.FN) == true) goto L17;
        if ((r3 instanceof abcd.zM) == false) goto L11;
        return new abcd.FN((abcd.zM) r3);
    L11:
        if ((r3 instanceof abcd.jM) == false) goto L15;
        return new abcd.FN((abcd.jM) r3);
    L15:
        throw new java.lang.IllegalArgumentException("unknown object in factory: " + r3.getClass().getName());
    L17:
        return (abcd.FN) r3;
    }

    @Override
    public abcd.EL DW() {
        return this.j6;
    }

    public java.lang.String Zo() {
        abcd.EL r0 = this.j6;
        if ((r0 instanceof abcd.zM) == false) goto L7;
        return ((abcd.zM) r0).tp();
    L7:
        return ((abcd.jM) r0).tp();
    }

    public java.lang.String toString() {
        return Zo();
    }

    public java.util.Date v5() {
    L8:
        e = move-exception;
        throw new java.lang.IllegalStateException("invalid date string: " + e.getMessage());
    L3:
        if ((this.j6 instanceof abcd.zM) == false) goto L7;
        return ((abcd.zM) this.j6).u7();
    L7:
        return ((abcd.jM) this.j6).u7();
    }
}
