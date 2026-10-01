package abcd;

public abstract class Abstractqt {
    public Abstractqt() {
    }

    public abstract int j6();

    public abstract abcd.bs j6(abcd.bs r1);

    public final abcd.cs j6(abcd.cs r5) {
        int r0 = 0;
        abcd.cs r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5.size();
                    r1 = new abcd.cs(r0);
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= r0) { $pc0 = 5; continue $sw0; }
                    r1.j6(r2, j6(r5.get(r2)));
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    r1.we();
                    if (r1.equals(r5) == false) { $pc0 = 9; continue $sw0; }
                    return r5;
                }
                case 9: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
