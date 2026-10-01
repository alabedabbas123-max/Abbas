package abcd;

public class gn {
    public gn() {
    }

    public final abcd.Interfaceon j6(abcd.jn r11, int r12, int r13, abcd.Interfacexn r14) {
        abcd.Pt r3 = null;
        abcd.Interfacens r4 = null;
        int r5 = 0;
        int r6 = 0;
        int r8 = 0;
        abcd.Js r9 = null;
        java.lang.StringBuilder r1 = null;
        java.lang.String r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r11 == null) { $pc0 = 25; continue $sw0; }
                    if (r12 < 0) { $pc0 = 23; continue $sw0; }
                    if (r12 >= 4) { $pc0 = 23; continue $sw0; }
                    try {
                        r3 = r11.Hw();
                        r4 = r11.v5();
                        r5 = r3.Zo(r13);
                        r6 = r13 + 2;
                        r8 = r3.DW(r6);
                        r9 = (abcd.Js) r4.get(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.wn) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r14 != null) { $pc0 = 28; continue $sw0; }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    return j6(r11, r12, r9.we(), r13 + 6, r8, r14);
                }
                case 12: {
                    e = e;
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    r1 = new java.lang.StringBuilder();
                    r1.append("...while parsing ");
                    if (r9 == null) { $pc0 = 19; continue $sw0; }
                    r2 = r9.aM() + " ";
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    r1.append(r2);
                    r1.append("attribute at offset ");
                    r1.append(abcd.Yt.gn(r13));
                    e.j6(r1.toString());
                    throw e;
                }
                case 19: {
                    r2 = "";
                    { $pc0 = 20; continue $sw0; }
                }
                case 28: {
                    try {
                        r14.j6(r3, r13, 2, "name: " + r9.aM());
                        r14.j6(r3, r6, 4, "length: " + abcd.Yt.gn(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.wn) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    e = e;
                    r9 = null;
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    throw new java.lang.IllegalArgumentException("bad context");
                }
                case 25: {
                    throw new java.lang.NullPointerException("cf == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abcd.Interfaceon j6(abcd.jn r7, int r8, java.lang.String r9, int r10, int r11, abcd.Interfacexn r12) {
        abcd.Pt r13 = null;
        abcd.Em r14 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r13 = r7.Hw();
                    r14 = new abcd.Em(r9, r13, r10, r11, r7.v5());
                    if (r12 == null) { $pc1 = 5; continue $sw1; }
                    r12.j6(r13, r10, r11, "attribute data");
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    return r14;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
