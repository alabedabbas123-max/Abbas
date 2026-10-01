package abcd;

public final class yn extends abcd.Xt implements abcd.Interfacepn {
    public yn(int r1) {
        super(r1);
    }

    @Override
    public int Hw() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = size();
                    r1 = 2;
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= r0) { $pc0 = 5; continue $sw0; }
                    r1 = r1 + get(r2).Hw();
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Interfaceon get(int r1) {
        return (abcd.Interfaceon) DW(r1);
    }

    @Override
    public abcd.Interfaceon j6(abcd.Interfaceon r6) {
        int r0 = 0;
        int r1 = 0;
        java.lang.String r7 = null;
        abcd.Interfaceon r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = size();
                    r1 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1 >= r0) { $pc1 = 15; continue $sw1; }
                    if (get(r1) == r6) { $pc1 = 7; continue $sw1; }
                    r1 = r1 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 7: {
                    r7 = r6.getName();
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r1 = r1 + 1;
                    if (r1 >= r0) { $pc1 = 13; continue $sw1; }
                    r3 = get(r1);
                    if (r3.getName().equals(r7) == false) { $pc1 = 8; continue $sw1; }
                    return r3;
                }
                case 13: {
                    return null;
                }
                case 15: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Interfaceon j6(java.lang.String r5) {
        int r0 = 0;
        int r1 = 0;
        abcd.Interfaceon r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = size();
                    r1 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r1 >= r0) { $pc2 = 8; continue $sw2; }
                    r2 = get(r1);
                    if (r2.getName().equals(r5) == true) { $pc2 = 6; continue $sw2; }
                    r1 = r1 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 6: {
                    return r2;
                }
                case 8: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r1, abcd.Interfaceon r2) {
        j6(r1, r2);
    }
}
