package abcd;

public class Vt extends java.lang.RuntimeException {
    private java.lang.StringBuffer j6;

    public Vt(java.lang.String r2) {
        this(r2, null);
    }

    public Vt(java.lang.String r3, java.lang.Throwable r4) {
        if (r3 != null) goto L7;
        if (r4 == null) goto L6;
        r3 = r4.getMessage();
        goto L7
    L6:
        r3 = null;
    L7:
        super(r3, r4);
        if ((r4 instanceof abcd.Vt) == false) goto L10;
        java.lang.String r5 = ((abcd.Vt) r4).j6.toString();
        this.j6 = new java.lang.StringBuffer(r5.length() + 200);
        this.j6.append(r5);
        return;
    L10:
        this.j6 = new java.lang.StringBuffer(200);
    }

    public Vt(java.lang.Throwable r2) {
        this(null, r2);
    }

    public static abcd.Vt j6(java.lang.Throwable r1, java.lang.String r2) {
        if ((r1 instanceof abcd.Vt) == false) goto L5;
        abcd.Vt r3 = (abcd.Vt) r1;
    L6:
        r3.j6(r2);
        return r3;
    L5:
        r3 = new abcd.Vt(r1);
        goto L6
    }

    public void j6(java.lang.String r2) {
        if (r2 == null) goto L8;
        this.j6.append(r2);
        if (r2.endsWith("\n") == true) goto L9;
        this.j6.append('\n');
        return;
    L9:
        return;
    L8:
        throw new java.lang.NullPointerException("str == null");
    }

    @Override
    public void printStackTrace(java.io.PrintStream r2) {
        super.printStackTrace(r2);
        r2.println(this.j6);
    }

    @Override
    public void printStackTrace(java.io.PrintWriter r2) {
        super.printStackTrace(r2);
        r2.println(this.j6);
    }
}
