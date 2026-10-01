package abcd;

public final class Wm implements abcd.Rs {
    private final int j6;

    public Wm(int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 < 0) { $pc0 = 7; continue $sw0; }
                    this.j6 = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("subroutineAddress < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int Mr() {
        return abcd.Qs.we.Mr();
    }

    @Override
    public abcd.Rs U2() {
        return this;
    }

    @Override
    public boolean a8() {
        return false;
    }

    @Override
    public java.lang.String aM() {
        return toString();
    }

    public boolean equals(java.lang.Object r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r3 instanceof abcd.Wm) == true) { $pc1 = 6; continue $sw1; }
                    return false;
                }
                case 6: {
                    if (this.j6 != ((abcd.Wm) r3).j6) { $pc1 = 9; continue $sw1; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.we;
    }

    public int hashCode() {
        return this.j6;
    }

    @Override
    public int j3() {
        return abcd.Qs.we.j3();
    }

    public int j6() {
        return this.j6;
    }

    public java.lang.String toString() {
        return "<addr:" + abcd.Yt.v5(this.j6) + ">";
    }
}
