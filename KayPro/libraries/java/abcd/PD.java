package abcd;

final class PD extends abcd.MD {
    private static final java.util.regex.Pattern FH = null;
    private final java.util.List<abcd.PD.a> Hw;
    private final boolean v5;

    private interface a {
        boolean j6(char r1);
    }

    private static final class b implements abcd.PD.a {
        private final char DW;
        private final char j6;

        b(char r1, char r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        @Override
        public final boolean j6(char r2) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.j6 <= r2) { $pc0 = 5; continue $sw0; }
                        return false;
                    }
                    case 5: {
                        if (r2 > this.DW) { $pc0 = 10; continue $sw0; }
                        return true;
                    }
                    case 10: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static final class c implements abcd.PD.a {
        static final abcd.PD.c j6 = null;

        static {
            j6 = new abcd.PD.c();
        }

        private c() {
        }

        @Override
        public final boolean j6(char r1) {
            return java.lang.Character.isDigit(r1);
        }
    }

    private static final class d implements abcd.PD.a {
        static final abcd.PD.d j6 = null;

        static {
            j6 = new abcd.PD.d();
        }

        private d() {
        }

        @Override
        public final boolean j6(char r1) {
            return java.lang.Character.isLetter(r1);
        }
    }

    private static final class e implements abcd.PD.a {
        static final abcd.PD.e j6 = null;

        static {
            j6 = new abcd.PD.e();
        }

        private e() {
        }

        @Override
        public final boolean j6(char r1) {
            return java.lang.Character.isLowerCase(r1);
        }
    }

    private static final class f implements abcd.PD.a {
        private char j6;

        f(char r1) {
            this.j6 = r1;
        }

        @Override
        public final boolean j6(char r2) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (this.j6 != r2) { $pc1 = 6; continue $sw1; }
                        return true;
                    }
                    case 6: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static final class g implements abcd.PD.a {
        private static java.lang.String DW;
        static final abcd.PD.g j6 = null;

        static {
            j6 = new abcd.PD.g();
            DW = "-!\"#$%&'()*+,./:;<=>?@[\\]_`{|}~";
        }

        private g() {
        }

        @Override
        public boolean j6(char r2) {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (DW.indexOf(r2) == (-1)) { $pc2 = 6; continue $sw2; }
                        return true;
                    }
                    case 6: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static final class h implements abcd.PD.a {
        static final abcd.PD.h j6 = null;

        static {
            j6 = new abcd.PD.h();
        }

        private h() {
        }

        @Override
        public final boolean j6(char r1) {
            return java.lang.Character.isUpperCase(r1);
        }
    }

    private static final class i implements abcd.PD.a {
        static final abcd.PD.i j6 = null;

        static {
            j6 = new abcd.PD.i();
        }

        private i() {
        }

        @Override
        public final boolean j6(char r1) {
            return java.lang.Character.isWhitespace(r1);
        }
    }

    static {
        FH = java.util.regex.Pattern.compile("([^-][-][^-]|\\[[.:=].*?[.:=]\\])");
    }

    PD(java.lang.String r7, java.lang.String r8) {
        int r0 = 0;
        java.util.regex.Matcher r1 = null;
        java.lang.String r9 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = 0;
                    super(false);
                    this.Hw = new java.util.ArrayList();
                    this.v5 = r7.startsWith("!");
                    if (this.v5 == false) { $pc3 = 5; continue $sw3; }
                    r7 = r7.substring(1);
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r1 = FH.matcher(r7);
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r1.find() == false) { $pc3 = 9; continue $sw3; }
                    r9 = r1.group(0);
                    if (r9.length() != 3) { $pc3 = 18; continue $sw3; }
                    if (r9.charAt(1) != '-') { $pc3 = 18; continue $sw3; }
                    this.Hw.add(new abcd.PD.b(r9.charAt(0), r9.charAt(2)));
                    $pc3 = 56; continue $sw3;
                }
                case 56: {
                    r7 = r1.replaceFirst("");
                    r1.reset(r7);
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    if (r9.equals("[:alnum:]") == false) { $pc3 = 21; continue $sw3; }
                    this.Hw.add(abcd.PD.d.j6);
                    this.Hw.add(abcd.PD.c.j6);
                    { $pc3 = 56; continue $sw3; }
                }
                case 21: {
                    if (r9.equals("[:alpha:]") == false) { $pc3 = 24; continue $sw3; }
                    this.Hw.add(abcd.PD.d.j6);
                    { $pc3 = 56; continue $sw3; }
                }
                case 24: {
                    if (r9.equals("[:blank:]") == false) { $pc3 = 27; continue $sw3; }
                    this.Hw.add(new abcd.PD.f(' '));
                    this.Hw.add(new abcd.PD.f('\t'));
                    { $pc3 = 56; continue $sw3; }
                }
                case 27: {
                    if (r9.equals("[:cntrl:]") == false) { $pc3 = 30; continue $sw3; }
                    this.Hw.add(new abcd.PD.b(0, 31));
                    this.Hw.add(new abcd.PD.f(127));
                    { $pc3 = 56; continue $sw3; }
                }
                case 30: {
                    if (r9.equals("[:digit:]") == false) { $pc3 = 33; continue $sw3; }
                    this.Hw.add(abcd.PD.c.j6);
                    { $pc3 = 56; continue $sw3; }
                }
                case 33: {
                    if (r9.equals("[:graph:]") == false) { $pc3 = 36; continue $sw3; }
                    this.Hw.add(new abcd.PD.b('!', '~'));
                    this.Hw.add(abcd.PD.d.j6);
                    this.Hw.add(abcd.PD.c.j6);
                    { $pc3 = 56; continue $sw3; }
                }
                case 36: {
                    if (r9.equals("[:lower:]") == false) { $pc3 = 39; continue $sw3; }
                    this.Hw.add(abcd.PD.e.j6);
                    { $pc3 = 56; continue $sw3; }
                }
                case 39: {
                    if (r9.equals("[:print:]") == false) { $pc3 = 42; continue $sw3; }
                    this.Hw.add(new abcd.PD.b(' ', '~'));
                    this.Hw.add(abcd.PD.d.j6);
                    this.Hw.add(abcd.PD.c.j6);
                    { $pc3 = 56; continue $sw3; }
                }
                case 42: {
                    if (r9.equals("[:punct:]") == false) { $pc3 = 45; continue $sw3; }
                    this.Hw.add(abcd.PD.g.j6);
                    { $pc3 = 56; continue $sw3; }
                }
                case 45: {
                    if (r9.equals("[:space:]") == false) { $pc3 = 48; continue $sw3; }
                    this.Hw.add(abcd.PD.i.j6);
                    { $pc3 = 56; continue $sw3; }
                }
                case 48: {
                    if (r9.equals("[:upper:]") == false) { $pc3 = 51; continue $sw3; }
                    this.Hw.add(abcd.PD.h.j6);
                    { $pc3 = 56; continue $sw3; }
                }
                case 51: {
                    if (r9.equals("[:xdigit:]") == false) { $pc3 = 54; continue $sw3; }
                    this.Hw.add(new abcd.PD.b('0', '9'));
                    this.Hw.add(new abcd.PD.b('a', 'f'));
                    this.Hw.add(new abcd.PD.b('A', 'F'));
                    { $pc3 = 56; continue $sw3; }
                }
                case 54: {
                    if (r9.equals("[:word:]") == false) { $pc3 = 58; continue $sw3; }
                    this.Hw.add(new abcd.PD.f('_'));
                    this.Hw.add(abcd.PD.d.j6);
                    this.Hw.add(abcd.PD.c.j6);
                    { $pc3 = 56; continue $sw3; }
                }
                case 58: {
                    throw new abcd.bD(java.lang.String.format(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().characterClassIsNotSupported, new java.lang.Object[]{r9}), new java.lang.Object[0]), r8);
                }
                case 9: {
                    if (r0 >= r7.length()) { $pc3 = 10; continue $sw3; }
                    this.Hw.add(new abcd.PD.f(r7.charAt(r0)));
                    r0 = r0 + 1;
                    { $pc3 = 9; continue $sw3; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected final boolean DW(char r3) {
        java.util.Iterator<abcd.PD.a> r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.Hw.iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc4 = 6; continue $sw4; }
                    if (r0.next().j6(r3) == false) { $pc4 = 4; continue $sw4; }
                    return !this.v5;
                }
                case 6: {
                    return this.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
