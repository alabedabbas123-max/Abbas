package abcd;

public abstract class EL extends abcd.AbstractyL {
    EL() {
    }

    public static abcd.EL j6(byte[] r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return new abcd.C1419vL(r1).Hw();
                }
                case 6: {
                    throw new java.io.IOException("cannot recognise object in stream");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        return this;
    }

    abcd.EL VH() {
        return this;
    }

    abstract boolean Zo();

    @Override
    public final boolean equals(java.lang.Object r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this != r3) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    if ((r3 instanceof abcd.InterfaceqL) == true) { $pc1 = 8; continue $sw1; }
                    return false;
                }
                case 8: {
                    if (j6(((abcd.InterfaceqL) r3).DW()) == false) { $pc1 = 12; continue $sw1; }
                    return true;
                }
                case 12: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.EL gn() {
        return this;
    }

    abstract void j6(abcd.CL r1);

    abstract boolean j6(abcd.EL r1);

    abstract int v5();
}
