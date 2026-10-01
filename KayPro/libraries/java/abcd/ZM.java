package abcd;

public class ZM extends abcd.AbstractyL implements abcd.InterfacepL {
    abcd.EL j6;

    public ZM(java.util.Date r6) {
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

    @Override
    public abcd.EL DW() {
        return this.j6;
    }
}
