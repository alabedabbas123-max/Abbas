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
            if (this.j6 <= r2) goto L5;
            return false;
        L5:
            if (r2 > this.DW) goto L10;
            return true;
        L10:
            return false;
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
            if (this.j6 != r2) goto L6;
            return true;
        L6:
            return false;
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
            if (DW.indexOf(r2) == (-1)) goto L6;
            return true;
        L6:
            return false;
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
        super(false);
        this.Hw = new java.util.ArrayList();
        this.v5 = r7.startsWith("!");
        if (this.v5 == false) goto L5;
        r7 = r7.substring(1);
    L5:
        java.util.regex.Matcher r1 = FH.matcher(r7);
    L7:
        if (r1.find() == false) goto L9;
        java.lang.String r9 = r1.group(0);
        if (r9.length() != 3) goto L18;
        if (r9.charAt(1) != '-') goto L18;
        this.Hw.add(new abcd.PD.b(r9.charAt(0), r9.charAt(2)));
    L56:
        r7 = r1.replaceFirst("");
        r1.reset(r7);
    L18:
        if (r9.equals("[:alnum:]") == false) goto L21;
        this.Hw.add(abcd.PD.d.j6);
        this.Hw.add(abcd.PD.c.j6);
        goto L56
    L21:
        if (r9.equals("[:alpha:]") == false) goto L24;
        this.Hw.add(abcd.PD.d.j6);
        goto L56
    L24:
        if (r9.equals("[:blank:]") == false) goto L27;
        this.Hw.add(new abcd.PD.f(' '));
        this.Hw.add(new abcd.PD.f('\t'));
        goto L56
    L27:
        if (r9.equals("[:cntrl:]") == false) goto L30;
        this.Hw.add(new abcd.PD.b(0, 31));
        this.Hw.add(new abcd.PD.f(127));
        goto L56
    L30:
        if (r9.equals("[:digit:]") == false) goto L33;
        this.Hw.add(abcd.PD.c.j6);
        goto L56
    L33:
        if (r9.equals("[:graph:]") == false) goto L36;
        this.Hw.add(new abcd.PD.b('!', '~'));
        this.Hw.add(abcd.PD.d.j6);
        this.Hw.add(abcd.PD.c.j6);
        goto L56
    L36:
        if (r9.equals("[:lower:]") == false) goto L39;
        this.Hw.add(abcd.PD.e.j6);
        goto L56
    L39:
        if (r9.equals("[:print:]") == false) goto L42;
        this.Hw.add(new abcd.PD.b(' ', '~'));
        this.Hw.add(abcd.PD.d.j6);
        this.Hw.add(abcd.PD.c.j6);
        goto L56
    L42:
        if (r9.equals("[:punct:]") == false) goto L45;
        this.Hw.add(abcd.PD.g.j6);
        goto L56
    L45:
        if (r9.equals("[:space:]") == false) goto L48;
        this.Hw.add(abcd.PD.i.j6);
        goto L56
    L48:
        if (r9.equals("[:upper:]") == false) goto L51;
        this.Hw.add(abcd.PD.h.j6);
        goto L56
    L51:
        if (r9.equals("[:xdigit:]") == false) goto L54;
        this.Hw.add(new abcd.PD.b('0', '9'));
        this.Hw.add(new abcd.PD.b('a', 'f'));
        this.Hw.add(new abcd.PD.b('A', 'F'));
        goto L56
    L54:
        if (r9.equals("[:word:]") == false) goto L58;
        this.Hw.add(new abcd.PD.f('_'));
        this.Hw.add(abcd.PD.d.j6);
        this.Hw.add(abcd.PD.c.j6);
        goto L56
    L58:
        throw new abcd.bD(java.lang.String.format(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().characterClassIsNotSupported, new java.lang.Object[]{r9}), new java.lang.Object[0]), r8);
    L9:
        if (r0 >= r7.length()) goto L10;
        this.Hw.add(new abcd.PD.f(r7.charAt(r0)));
        r0 = r0 + 1;
        goto L9
    }

    @Override
    protected final boolean DW(char r3) {
        java.util.Iterator<abcd.PD.a> r0 = this.Hw.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        if (r0.next().j6(r3) == false) goto L4;
        return !this.v5;
    L6:
        return this.v5;
    }
}
