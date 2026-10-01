package abcd;

public abstract class _w implements java.io.Serializable {
    public final java.lang.String DW;
    public final java.lang.String j6;

    public _w(java.lang.String r3, java.lang.String r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 == null) { $pc0 = 14; continue $sw0; }
                    if (r3.contains("|") == true) { $pc0 = 12; continue $sw0; }
                    if (r4 == null) { $pc0 = 10; continue $sw0; }
                    this.j6 = r3;
                    this.DW = r4;
                    return;
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("'secret' must be non-null");
                }
                case 12: {
                    throw new java.lang.IllegalArgumentException("'key' must not contain a \"|\" character: \"" + r3 + "\"");
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException("'key' must be non-null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r2 instanceof abcd._w) == true) { $pc1 = 5; continue $sw1; }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (j6((abcd._w) r2) == false) { $pc1 = 7; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return this.j6.hashCode() ^ (this.DW.hashCode() << 1);
    }

    public boolean j6(abcd._w r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.j6.equals(r3.j6) == true) { $pc2 = 5; continue $sw2; }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (this.DW.equals(r3.DW) == false) { $pc2 = 7; continue $sw2; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return "{key=\"" + this.j6 + "\", secret=\"" + this.DW.charAt(0) + "...\"}";
    }
}
