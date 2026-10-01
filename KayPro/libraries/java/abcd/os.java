package abcd;

public final class os extends abcd.Abstractms {
    private final abcd.Hr j6;

    public os(abcd.Hr r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    r2.Ws();
                    this.j6 = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("annotation == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected int DW(abcd.Abstractms r2) {
        return this.j6.j6(((abcd.os) r2).j6);
    }

    @Override
    public boolean Hw() {
        return false;
    }

    public abcd.Hr VH() {
        return this.j6;
    }

    @Override
    public java.lang.String Zo() {
        return "annotation";
    }

    @Override
    public java.lang.String aM() {
        return this.j6.toString();
    }

    public boolean equals(java.lang.Object r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r2 instanceof abcd.os) == true) { $pc1 = 7; continue $sw1; }
                    return false;
                }
                case 7: {
                    return this.j6.equals(((abcd.os) r2).j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return this.j6.hashCode();
    }

    public java.lang.String toString() {
        return this.j6.toString();
    }
}
