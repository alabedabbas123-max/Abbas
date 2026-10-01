package io.fabric.sdk.android.services.common;

public abstract class Abstracta {
    private static final java.util.regex.Pattern j6 = null;
    private final java.lang.String DW;
    private final abcd.Jz FH;
    private final abcd.Fz Hw;
    protected final io.fabric.sdk.android.Kit Zo;
    private final java.lang.String v5;

    static {
        j6 = java.util.regex.Pattern.compile("http(s?)://[^\\/]+", 2);
    }

    public Abstracta(io.fabric.sdk.android.Kit r1, java.lang.String r2, java.lang.String r3, abcd.Jz r4, abcd.Fz r5) {
        if (r3 == null) goto L10;
        if (r4 == null) goto L8;
        this.Zo = r1;
        this.v5 = r2;
        this.DW = j6(r3);
        this.FH = r4;
        this.Hw = r5;
        return;
    L8:
        throw new java.lang.IllegalArgumentException("requestFactory must not be null.");
    L10:
        throw new java.lang.IllegalArgumentException("url must not be null.");
    }

    private java.lang.String j6(java.lang.String r2) {
        if (io.fabric.sdk.android.services.common.i.DW(this.v5) == false) goto L5;
        return r2;
    L5:
        return j6.matcher(r2).replaceFirst(this.v5);
    }

    protected java.lang.String DW() {
        return this.DW;
    }

    protected abcd.Hz j6() {
        return j6(java.util.Collections.emptyMap());
    }

    protected abcd.Hz j6(java.util.Map<java.lang.String, java.lang.String> r4) {
        abcd.Hz r5 = this.FH.j6(this.Hw, DW(), r4);
        r5.j6(false);
        r5.j6(10000);
        r5.FH("User-Agent", "Crashlytics Android SDK/" + this.Zo.getVersion());
        r5.FH("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return r5;
    }
}
