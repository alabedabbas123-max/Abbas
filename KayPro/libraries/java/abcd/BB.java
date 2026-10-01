package abcd;

public class BB {
    private final boolean DW;
    private final abcd.sE j6;

    public BB(abcd.sE r2) {
        boolean r3 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = r2;
                    if (r2.DW().isEmpty() == true) { $pc0 = 5; continue $sw0; }
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    r3 = false;
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    this.DW = r3;
                    return;
                }
                case 5: {
                    if (r2.FH().isEmpty() == false) { $pc0 = 17; continue $sw0; }
                    if (r2.VH().isEmpty() == false) { $pc0 = 17; continue $sw0; }
                    if (r2.v5().isEmpty() == false) { $pc0 = 17; continue $sw0; }
                    if (r2.Zo().isEmpty() == false) { $pc0 = 17; continue $sw0; }
                    if (r2.gn().isEmpty() == false) { $pc0 = 17; continue $sw0; }
                    if (r2.Hw().isEmpty() == false) { $pc0 = 17; continue $sw0; }
                    r3 = true;
                    { $pc0 = 18; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Set<java.lang.String> DW() {
        return java.util.Collections.unmodifiableSet(this.j6.FH());
    }

    public java.util.Set<java.lang.String> FH() {
        return java.util.Collections.unmodifiableSet(this.j6.Hw());
    }

    public java.util.Set<java.lang.String> Hw() {
        return java.util.Collections.unmodifiableSet(this.j6.v5());
    }

    public java.util.Set<java.lang.String> VH() {
        return java.util.Collections.unmodifiableSet(this.j6.gn());
    }

    public java.util.Set<java.lang.String> Zo() {
        return java.util.Collections.unmodifiableSet(this.j6.VH());
    }

    public java.util.Set<java.lang.String> j6() {
        return java.util.Collections.unmodifiableSet(this.j6.DW());
    }

    public java.util.Set<java.lang.String> v5() {
        return java.util.Collections.unmodifiableSet(this.j6.Zo());
    }
}
