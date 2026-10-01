package abcd;

public abstract class Abstracttp extends abcd.Abstractup {
    private final abcd.Ks DW;

    public Abstracttp(abcd.Ks r2) {
        if (r2 == null) goto L7;
        this.DW = r2;
        return;
    L7:
        throw new java.lang.NullPointerException("type == null");
    }

    public final abcd.Ks aM() {
        return this.DW;
    }

    @Override
    public void j6(abcd.jp r2) {
        r2.Ws().DW(this.DW);
    }
}
