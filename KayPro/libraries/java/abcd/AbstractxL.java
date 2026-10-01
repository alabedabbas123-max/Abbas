package abcd;

public abstract class AbstractxL extends abcd.EL {
    public AbstractxL() {
    }

    @Override
    public int hashCode() {
        return -1;
    }

    @Override
    boolean j6(abcd.EL r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r1 instanceof abcd.AbstractxL) == true) { $pc0 = 6; continue $sw0; }
                    return false;
                }
                case 6: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return "NULL";
    }
}
