package abcd;

public class sF {
    public sF() {
    }

    private static java.lang.String j6(java.util.List<java.lang.String> r3, java.lang.String r4, java.lang.String r5) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3.size() != 1) { $pc0 = 7; continue $sw0; }
                    return java.lang.String.valueOf(r4) + " " + r3.get(0);
                }
                case 7: {
                    return java.lang.String.valueOf(r5) + " " + abcd.NK.j6(r3, ", ", " and ");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String j6(java.lang.String r3, java.util.List<java.lang.String> r4) {
        java.lang.StringBuilder r0 = null;
        java.util.Iterator<java.lang.String> r5 = null;
        java.lang.String r6 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.lang.StringBuilder(r3);
                    if (r3.endsWith("\n") == true) { $pc1 = 5; continue $sw1; }
                    r0.append("\n");
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r0.append("\n");
                    r0.append("Conflicts:\n");
                    r5 = r4.iterator();
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r5.hasNext() == false) { $pc1 = 9; continue $sw1; }
                    r6 = r5.next();
                    r0.append('\t');
                    r0.append(r6);
                    r0.append('\n');
                    { $pc1 = 7; continue $sw1; }
                }
                case 9: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String j6(java.util.List<abcd.ME> r11, abcd.ME r12) {
        java.lang.StringBuilder r0 = null;
        java.util.ArrayList r1 = null;
        java.util.ArrayList r2 = null;
        java.util.ArrayList r3 = null;
        java.util.ArrayList r4 = null;
        java.util.ArrayList r5 = null;
        java.util.Iterator<abcd.ME> r13 = null;
        abcd.ME r6 = null;
        java.util.ArrayList r14 = null;
        java.lang.String r15 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("Merge ");
                    r1 = new java.util.ArrayList();
                    r2 = new java.util.ArrayList();
                    r3 = new java.util.ArrayList();
                    r4 = new java.util.ArrayList();
                    r5 = new java.util.ArrayList();
                    r13 = r11.iterator();
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r13.hasNext() == false) { $pc2 = 5; continue $sw2; }
                    r6 = r13.next();
                    if (r6.getName().startsWith("refs/heads/") == true) { $pc2 = 27; continue $sw2; }
                    if (r6.getName().startsWith("refs/remotes/") == true) { $pc2 = 30; continue $sw2; }
                    if (r6.getName().startsWith("refs/tags/") == true) { $pc2 = 33; continue $sw2; }
                    if (r6.getName().equals(r6.DW().VH()) == true) { $pc2 = 36; continue $sw2; }
                    r5.add(r6.getName());
                    { $pc2 = 4; continue $sw2; }
                }
                case 36: {
                    r4.add("'" + r6.getName() + "'");
                    { $pc2 = 4; continue $sw2; }
                }
                case 33: {
                    r3.add("'" + abcd.UE.Hw(r6.getName()) + "'");
                    { $pc2 = 4; continue $sw2; }
                }
                case 30: {
                    r2.add("'" + abcd.UE.Hw(r6.getName()) + "'");
                    { $pc2 = 4; continue $sw2; }
                }
                case 27: {
                    r1.add("'" + abcd.UE.Hw(r6.getName()) + "'");
                    { $pc2 = 4; continue $sw2; }
                }
                case 5: {
                    r14 = new java.util.ArrayList();
                    if (r1.isEmpty() == true) { $pc2 = 9; continue $sw2; }
                    r14.add(j6(r1, "branch", "branches"));
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (r2.isEmpty() == true) { $pc2 = 12; continue $sw2; }
                    r14.add(j6(r2, "remote-tracking branch", "remote-tracking branches"));
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    if (r3.isEmpty() == true) { $pc2 = 15; continue $sw2; }
                    r14.add(j6(r3, "tag", "tags"));
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    if (r4.isEmpty() == true) { $pc2 = 18; continue $sw2; }
                    r14.add(j6(r4, "commit", "commits"));
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    if (r5.isEmpty() == true) { $pc2 = 20; continue $sw2; }
                    r14.add(abcd.NK.j6(r5, ", ", " and "));
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    r0.append(abcd.NK.j6(r14, ", "));
                    r15 = r12.v5().getName();
                    if (r15.equals("refs/heads/master") == true) { $pc2 = 24; continue $sw2; }
                    r0.append(" into " + abcd.UE.Hw(r15));
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
