package abcd;

public abstract class AbstractAm implements abcd.Interfaceon {
    private final java.lang.String j6;

    public AbstractAm(java.lang.String r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.j6 = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("name == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String getName() {
        return this.j6;
    }
}
