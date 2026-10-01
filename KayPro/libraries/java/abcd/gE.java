package abcd;

public class gE {
    private static final java.lang.String DW = null;
    private static final java.lang.String[] j6 = null;
    private final abcd.HD FH;
    private final java.util.concurrent.atomic.AtomicReference<abcd.gE.c> Hw;
    private final abcd.gE v5;

    private static class a {
        java.lang.String DW;
        java.lang.String FH;
        java.lang.String Hw;
        java.lang.String Zo;
        java.lang.String j6;
        java.lang.String v5;

        private a() {
        }

        a(abcd.gE.a r1) {
            this();
        }

        private static boolean DW(java.lang.String r0, java.lang.String r1) {
            if (r0 != null) goto L6;
            if (r1 != null) goto L6;
            return true;
        L6:
            if (r0 == null) goto L11;
            if (r1 != null) goto L10;
            return false;
        L10:
            return abcd.NK.j6(r0, r1);
        L11:
            return false;
        }

        private static boolean FH(java.lang.String r0, java.lang.String r1) {
            if (r0 != null) goto L6;
            if (r1 != null) goto L6;
            return true;
        L6:
            if (r0 == null) goto L11;
            if (r1 != null) goto L10;
            return false;
        L10:
            return r0.equals(r1);
        L11:
            return false;
        }

        abcd.gE.a j6(java.lang.String r3) {
            abcd.gE.a r0 = new abcd.gE.a();
            r0.j6 = this.j6;
            r0.DW = this.DW;
            r0.FH = this.FH;
            r0.Hw = this.Hw;
            r0.v5 = r3;
            r0.Zo = this.Zo;
            return r0;
        }

        boolean j6(java.lang.String r2, java.lang.String r3) {
            if (DW(this.DW, r2) == true) goto L5;
            return false;
        L5:
            if (FH(this.FH, r3) == false) goto L10;
            return true;
        L10:
            return false;
        }

        boolean j6(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            if (DW(this.DW, r2) == true) goto L5;
            return false;
        L5:
            if (FH(this.FH, r3) == true) goto L7;
            return false;
        L7:
            if (DW(this.Hw, r4) == false) goto L13;
            return true;
        L13:
            return false;
        }

        public java.lang.String toString() {
            java.lang.String r0 = this.DW;
            if (r0 != null) goto L6;
            return "<empty>";
        L6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder(r0);
            if (this.FH == null) goto L10;
            r1.append(".");
            r1.append(this.FH);
        L10:
            if (this.Hw == null) goto L13;
            r1.append(".");
            r1.append(this.Hw);
        L13:
            if (this.v5 == null) goto L16;
            r1.append("=");
            r1.append(this.v5);
        L16:
            return r1.toString();
        }
    }

    public interface b<T> {
        T j6(abcd.gE r1);
    }

    private static class c {
        final java.util.Map<java.lang.Object, java.lang.Object> DW;
        final abcd.gE.c FH;
        final java.util.List<abcd.gE.a> j6;

        c(java.util.List<abcd.gE.a> r4, abcd.gE.c r5) {
            this.j6 = r4;
            this.DW = new java.util.concurrent.ConcurrentHashMap(16, 0.75f, 1);
            this.FH = r5;
        }
    }

    private static class d {
        private int DW;
        private final char[] j6;

        d(java.lang.String r1) {
            this.j6 = r1.toCharArray();
        }

        void DW() {
            this.DW--;
        }

        int j6() {
            char[] r0 = this.j6;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
            int r1 = this.DW;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
            this.DW = r1 + 1;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
            return r0[r1];
        L4:
            this.DW = this.j6.length;
            return -1;
        }
    }

    static {
        j6 = new java.lang.String[0];
        DW = new java.lang.String();
    }

    public gE() {
        this(null);
    }

    public gE(abcd.gE r2) {
        this.FH = new abcd.HD();
        this.v5 = r2;
        this.Hw = new java.util.concurrent.atomic.AtomicReference(VH());
    }

    private static java.lang.String DW(abcd.gE.d r7) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
    L3:
        int r1 = r7.j6();
        if (r1 < 0) goto L37;
        if (93 == r1) goto L7;
        if (32 == r1) goto L22;
        if (9 == r1) goto L22;
        char r4 = (char) r1;
        if (java.lang.Character.isLetterOrDigit(r4) == true) goto L21;
        if (46 == r1) goto L21;
        if (45 == r1) goto L21;
        throw new abcd.XC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badSectionEntry, new java.lang.Object[]{r0}));
    L21:
        r0.append(r4);
    L22:
        int r2 = r7.j6();
        if (r2 < 0) goto L35;
        if (34 == r2) goto L26;
        if (32 == r2) goto L22;
        if (9 == r2) goto L22;
        throw new abcd.XC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badSectionEntry, new java.lang.Object[]{r0}));
    L26:
        r7.DW();
    L28:
        return r0.toString();
    L35:
        throw new abcd.XC(org.eclipse.jgit.JGitText.j6().unexpectedEndOfConfigFile);
    L7:
        r7.DW();
        goto L28
    L37:
        throw new abcd.XC(org.eclipse.jgit.JGitText.j6().unexpectedEndOfConfigFile);
    }

    private static java.lang.String DW(java.lang.String r9) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(r9.length());
        int r2 = 0;
        boolean r3 = false;
        int r4 = 0;
    L4:
        if (r2 >= r9.length()) goto L5;
        char r5 = r9.charAt(r2);
        if (r5 != ' ') goto L12;
        if (r3 == false) goto L32;
    L36:
        r0.append(' ');
    L37:
        r2 = r2 + 1;
        goto L4
    L32:
        if (r0.length() <= 0) goto L36;
        if (r0.charAt(r0.length() - 1) != ' ') goto L36;
        r0.insert(r4, '\"');
        r3 = true;
        goto L36
    L12:
        if (r5 != ';') goto L14;
    L27:
        if (r3 == true) goto L29;
        r0.insert(r4, '\"');
        r3 = true;
    L29:
        r0.append(r5);
        goto L37
    L14:
        if (r5 == '\\') goto L26;
        if (r5 != '\"') goto L17;
        r0.append("\\\"");
        goto L37
    L17:
        if (r5 == '#') goto L27;
        switch(r5) {
            case 8: goto L24;
            case 9: goto L23;
            case 10: goto L20;
            default: goto L19;
        };
    L19:
        r0.append(r5);
        goto L37
    L20:
        if (r3 == false) goto L22;
        r0.append('\"');
        r3 = false;
    L22:
        r0.append("\\n\\\n");
        r4 = r0.length();
        goto L37
    L23:
        r0.append("\\t");
        goto L37
    L24:
        r0.append("\\b");
        goto L37
    L26:
        r0.append("\\\\");
        goto L37
    L5:
        if (r3 == false) goto L8;
        r0.append('\"');
    L8:
        return r0.toString();
    }

    private java.lang.String Hw(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        java.util.List<java.lang.String> r0 = v5(r2, r3, r4);
        if (r0 != null) goto L5;
        abcd.gE r1 = this.v5;
        if (r1 != null) goto L9;
        return null;
    L9:
        return r1.Hw(r2, r3, r4);
    L5:
        return r0.get(0);
    }

    private abcd.gE.c VH() {
        return new abcd.gE.c(java.util.Collections.emptyList(), v5());
    }

    private abcd.gE.c Zo() {
    L2:
        abcd.gE.c r0 = this.Hw.get();
        abcd.gE.c r1 = v5();
        if (r0.FH == r1) goto L4;
        abcd.gE.c r2 = new abcd.gE.c(r0.j6, r1);
        if (this.Hw.compareAndSet(r0, r2) == false) goto L2;
        return r2;
    L4:
        return r0;
    }

    private static int j6(java.util.List<abcd.gE.a> r3, java.lang.String r4, java.lang.String r5) {
        int r0 = 0;
    L4:
        if (r0 >= r3.size()) goto L5;
        if (r3.get(r0).j6(r4, r5, null) == true) goto L9;
        r0 = r0 + 1;
    L9:
        r0 = r0 + 1;
        if (r0 >= r3.size()) goto L15;
        abcd.gE.a r1 = r3.get(r0);
        if (r1.j6(r4, r5, r1.Hw) == true) goto L9;
    L15:
        return r0;
    L5:
        return -1;
    }

    private abcd.gE.c j6(abcd.gE.c r5, java.lang.String r6, java.lang.String r7) {
        java.util.ArrayList r1 = new java.util.ArrayList(r5.j6.size());
        java.util.Iterator<abcd.gE.a> r8 = r5.j6.iterator();
        boolean r0 = false;
    L4:
        if (r8.hasNext() == false) goto L6;
        abcd.gE.a r2 = r8.next();
        if (r2.j6(r6, r7) == true) goto L9;
        if (r0 == false) goto L16;
        if (r2.DW != null) goto L16;
        if (r2.FH == null) goto L4;
    L16:
        r1.add(r2);
        goto L4
    L9:
        r0 = true;
        goto L4
    L6:
        return j6(r1);
    }

    private abcd.gE.c j6(abcd.gE.c r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.List<java.lang.String> r11) {
        java.util.List<abcd.gE.a> r12 = j6(r7, r11);
        int r1 = 0;
        int r0 = 0;
        int r2 = -1;
    L4:
        if (r1 >= r12.size()) goto L13;
        if (r0 >= r11.size()) goto L13;
        abcd.gE.a r3 = r12.get(r1);
        if (r3.j6(r8, r9, r10) == false) goto L11;
        r12.set(r1, r3.j6(r11.get(r0)));
        r2 = r1 + 1;
        r0 = r0 + 1;
    L11:
        r1 = r1 + 1;
    L13:
        if (r0 != r11.size()) goto L24;
        if (r1 >= r12.size()) goto L24;
    L17:
        if (r1 >= r12.size()) goto L24;
        int r4 = r1 + 1;
        if (r12.get(r1).j6(r8, r9, r10) == true) goto L21;
        r1 = r4;
        goto L17
    L21:
        r1 = r4 - 1;
        r12.remove(r1);
    L24:
        if (r0 >= r11.size()) goto L37;
        if (r1 != r12.size()) goto L37;
        if (r2 >= 0) goto L30;
        r2 = j6(r12, r8, r9);
    L30:
        if (r2 >= 0) goto L33;
        abcd.gE.a r5 = new abcd.gE.a(null);
        r5.DW = r8;
        r5.FH = r9;
        r12.add(r5);
        r2 = r12.size();
    L33:
        if (r0 >= r11.size()) goto L37;
        abcd.gE.a r6 = new abcd.gE.a(null);
        r6.DW = r8;
        r6.FH = r9;
        r6.Hw = r10;
        r6.v5 = r11.get(r0);
        r12.add(r2, r6);
        r2 = r2 + 1;
        r0 = r0 + 1;
    L37:
        return j6(r12);
    }

    private abcd.gE.c j6(java.util.List<abcd.gE.a> r3) {
        return new abcd.gE.c(java.util.Collections.unmodifiableList(r3), v5());
    }

    private static java.lang.String j6(abcd.gE.d r7) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
    L3:
        int r1 = r7.j6();
        if (r1 < 0) goto L43;
        if (61 == r1) goto L39;
        if (32 == r1) goto L22;
        if (9 == r1) goto L22;
        char r2 = (char) r1;
        if (java.lang.Character.isLetterOrDigit(r2) == true) goto L21;
        if (r1 == 45) goto L21;
        if (10 != r1) goto L20;
        r7.DW();
        r0.append(r2);
        goto L39
    L20:
        throw new abcd.XC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badEntryName, new java.lang.Object[]{r0}));
    L21:
        r0.append(r2);
    L22:
        int r3 = r7.j6();
        if (r3 < 0) goto L41;
        if (61 == r3) goto L39;
        if (59 == r3) goto L37;
        if (35 == r3) goto L37;
        if (10 == r3) goto L37;
        if (32 == r3) goto L22;
        if (9 == r3) goto L22;
        throw new abcd.XC(org.eclipse.jgit.JGitText.j6().badEntryDelimiter);
    L37:
        r7.DW();
        goto L39
    L41:
        throw new abcd.XC(org.eclipse.jgit.JGitText.j6().unexpectedEndOfConfigFile);
    L39:
        return r0.toString();
    L43:
        throw new abcd.XC(org.eclipse.jgit.JGitText.j6().unexpectedEndOfConfigFile);
    }

    private static java.lang.String j6(abcd.gE.d r9, boolean r10, int r11) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        boolean r3 = false;
    L3:
        int r4 = r9.j6();
        if (r4 < 0) goto L6;
        if (10 == r4) goto L12;
        if (r11 == r4) goto L28;
        if (r10 == true) goto L32;
        if (java.lang.Character.isWhitespace((char) r4) == true) goto L21;
        if (59 == r4) goto L26;
        if (35 != r4) goto L32;
    L26:
        r9.DW();
        goto L28
    L21:
        r3 = true;
    L32:
        if (r3 == false) goto L38;
        if (r0.length() <= 0) goto L36;
        r0.append(' ');
    L36:
        r3 = false;
    L38:
        if (92 == r4) goto L39;
        if (34 == r4) goto L60;
        r0.append((char) r4);
        goto L3
    L60:
        if (r10 == true) goto L61;
        r10 = true;
        goto L3
    L61:
        r10 = false;
        goto L3
    L39:
        int r5 = r9.j6();
        if (r5 == (-1)) goto L58;
        if (r5 == 10) goto L3;
        if (r5 != 34) goto L43;
        r0.append('\"');
        goto L3
    L43:
        if (r5 != 92) goto L45;
        r0.append('\\');
        goto L3
    L45:
        if (r5 != 98) goto L47;
        r0.append('\b');
        goto L3
    L47:
        if (r5 != 110) goto L49;
        r0.append('\n');
        goto L3
    L49:
        if (r5 != 116) goto L52;
        r0.append('\t');
        goto L3
    L52:
        throw new abcd.XC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badEscape, new java.lang.Object[]{java.lang.Character.valueOf((char) r5)}));
    L58:
        throw new abcd.XC(org.eclipse.jgit.JGitText.j6().endOfFileInEscape);
    L28:
        if (r0.length() > 0) goto L100;
        return null;
    L100:
        return r0.toString();
    L12:
        if (r10 == true) goto L15;
        r9.DW();
        goto L28
    L15:
        throw new abcd.XC(org.eclipse.jgit.JGitText.j6().newlineInQuotesNotAllowed);
    L6:
        if (r0.length() != 0) goto L28;
        throw new abcd.XC(org.eclipse.jgit.JGitText.j6().unexpectedEndOfConfigFile);
    }

    private static java.util.List<abcd.gE.a> j6(abcd.gE.c r1, java.util.List<java.lang.String> r2) {
        java.util.ArrayList r3 = new java.util.ArrayList((r1.j6.size() + r2.size()) + 1);
        r3.addAll(r1.j6);
        return r3;
    }

    private static java.util.List<java.lang.String> j6(java.util.List<java.lang.String> r2, java.lang.String r3) {
        if (r2 != null) goto L6;
        return java.util.Collections.singletonList(r3);
    L6:
        if (r2.size() != 1) goto L9;
        java.util.ArrayList r0 = new java.util.ArrayList(2);
        r0.add(r2.get(0));
        r0.add(r3);
        return r0;
    L9:
        r2.add(r3);
        return r2;
    }

    private static <T> T[] j6(T r4) {
        return (T[]) ((java.lang.Object[]) r4.getClass().getMethod("values", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]));
    L5:
        e = move-exception;
        java.lang.String r5 = r4.getClass().getName();
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().enumValuesNotAvailable, new java.lang.Object[]{r5}), e);
    }

    private abcd.gE.c v5() {
        abcd.gE r0 = this.v5;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.Zo();
    }

    private java.util.List<java.lang.String> v5(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        java.util.Iterator<abcd.gE.a> r0 = this.Hw.get().j6.iterator();
        java.util.List<java.lang.String> r1 = null;
    L4:
        if (r0.hasNext() == false) goto L5;
        abcd.gE.a r2 = r0.next();
        if (r2.j6(r5, r6, r7) == false) goto L4;
        r1 = j6(r1, r2.v5);
        goto L4
    L5:
        return r1;
    }

    protected void DW() {
        this.FH.j6(new abcd.CD());
    }

    public void DW(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10) {
        DW(r7, r8, r9, r10);
    }

    public void DW(java.lang.String r8, java.lang.String r9, java.lang.String r10, long r11) {
        if (r11 < 1073741824) goto L8;
        if ((r11 % 1073741824) != 0) goto L8;
        java.lang.String r12 = java.lang.String.valueOf(java.lang.String.valueOf(r11 / 1073741824)) + " g";
    L18:
        j6(r8, r9, r10, r12);
        return;
    L8:
        if (r11 < 1048576) goto L13;
        if ((r11 % 1048576) != 0) goto L13;
        r12 = java.lang.String.valueOf(java.lang.String.valueOf(r11 / 1048576)) + " m";
    L13:
        if (r11 >= 1024) goto L15;
    L17:
        r12 = java.lang.String.valueOf(r11);
        goto L18
    L15:
        if ((r11 % 1024) != 0) goto L17;
        r12 = java.lang.String.valueOf(java.lang.String.valueOf(r11 / 1024)) + " k";
        goto L18
    }

    public void DW(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4) {
        if (r4 == false) goto L4;
        java.lang.String r5 = "true";
    L5:
        j6(r1, r2, r3, r5);
        return;
    L4:
        r5 = "false";
        goto L5
    }

    public java.lang.String[] DW(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        abcd.gE r0 = this.v5;
        if (r0 == null) goto L5;
        java.lang.String[] r1 = r0.DW(r3, r4, r5);
    L6:
        java.util.List<java.lang.String> r6 = v5(r3, r4, r5);
        if (r6 == null) goto L13;
        java.lang.String[] r7 = new java.lang.String[r1.length + r6.size()];
        int r8 = r1.length;
        java.lang.System.arraycopy(r1, 0, r7, 0, r8);
        java.util.Iterator<java.lang.String> r9 = r6.iterator();
    L10:
        if (r9.hasNext() == false) goto L11;
        r7[r8] = r9.next();
        r8 = r8 + 1;
        goto L10
    L11:
        return r7;
    L13:
        return r1;
    L5:
        r1 = j6;
        goto L6
    }

    public void FH(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        j6(r2, r3, r4, java.util.Collections.emptyList());
    }

    protected boolean FH() {
        return true;
    }

    public java.lang.String Hw() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        java.util.Iterator<abcd.gE.a> r1 = this.Hw.get().j6.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        abcd.gE.a r2 = r1.next();
        java.lang.String r3 = r2.j6;
        if (r3 == null) goto L11;
        r0.append(r3);
    L11:
        if (r2.DW == null) goto L30;
        if (r2.Hw != null) goto L30;
        r0.append('[');
        r0.append(r2.DW);
        if (r2.FH == null) goto L28;
        r0.append(' ');
        java.lang.String r4 = DW(r2.FH);
        if (r4.startsWith("\"") == true) goto L19;
    L21:
        boolean r5 = false;
    L23:
        if (r5 == true) goto L25;
        r0.append('\"');
    L25:
        r0.append(r4);
        if (r5 == true) goto L28;
        r0.append('\"');
        goto L28
    L19:
        if (r4.endsWith("\"") == false) goto L21;
        r5 = true;
    L28:
        r0.append(']');
    L46:
        java.lang.String r6 = r2.Zo;
        if (r6 == null) goto L49;
        r0.append(r6);
    L49:
        r0.append('\n');
    L30:
        if (r2.DW == null) goto L46;
        if (r2.Hw == null) goto L46;
        java.lang.String r7 = r2.j6;
        if (r7 != null) goto L36;
    L37:
        r0.append('\t');
    L38:
        r0.append(r2.Hw);
        if (DW == r2.v5) goto L44;
        r0.append(" =");
        if (r2.v5 == null) goto L44;
        r0.append(' ');
        r0.append(DW(r2.v5));
    L44:
        if (r2.Zo == null) goto L46;
        r0.append(' ');
        goto L46
    L36:
        if ("".equals(r7) == false) goto L38;
    L6:
        return r0.toString();
    }

    public int j6(java.lang.String r2, java.lang.String r3, int r4) {
        return j6(r2, null, r3, r4);
    }

    public int j6(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10) {
        long r0 = j6(r7, r8, r9, r10);
        if ((-2147483648L) > r0) goto L9;
        if (r0 > 2147483647L) goto L9;
        return (int) r0;
    L9:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().integerValueOutOfRange, new java.lang.Object[]{r7, r9}));
    }

    public long j6(java.lang.String r7, java.lang.String r8, long r9) {
        return j6(r7, null, r8, r9);
    }

    public long j6(java.lang.String r9, java.lang.String r10, java.lang.String r11, long r12) {
        java.lang.String r13 = j6(r9, r10, r11);
        if (r13 != null) goto L5;
        return r12;
    L5:
        java.lang.String r0 = r13.trim();
        if (r0.length() != 0) goto L8;
        return r12;
    L8:
        char r1 = abcd.NK.j6(r0.charAt(r0.length() - 1));
        if (r1 != 'g') goto L11;
        long r6 = 1073741824;
    L19:
        if (r6 <= 1) goto L22;
        r0 = r0.substring(0, r0.length() - 1).trim();
    L22:
        if (r0.length() != 0) goto L29;
        return r12;
    L29:
        return r6 * java.lang.Long.parseLong(r0);
    L28:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidIntegerValue, new java.lang.Object[]{r9, r11, r13}));
    L11:
        if (r1 != 'k') goto L13;
        r6 = 1024;
        goto L19
    L13:
        if (r1 == 'm') goto L15;
        r6 = 1;
        goto L19
    L15:
        r6 = 1048576;
        goto L19
    }

    public abcd.GD j6(abcd.DD r2) {
        return this.FH.j6(r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends java.lang.Enum<?>> T j6(java.lang.String r8, java.lang.String r9, java.lang.String r10, T r11) {
        return (T) j6((java.lang.Enum[]) j6(r11), r8, r9, r10, r11);
    }

    public <T extends java.lang.Enum<?>> T j6(T[] r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, T r14) {
        java.lang.String r0 = j6(r11, r12, r13);
        if (r0 != null) goto L5;
        return r14;
    L5:
        java.lang.String r15 = r0.replace(' ', '_');
        int r1 = r10.length;
        T r4 = null;
        T r5 = null;
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L7;
        T r6 = r10[r2];
        if (abcd.NK.j6(r6.name(), r15) == true) goto L23;
        if (abcd.NK.j6(r6.name(), "TRUE") == false) goto L28;
        r4 = r6;
    L30:
        r2 = r2 + 1;
        goto L6
    L28:
        if (abcd.NK.j6(r6.name(), "FALSE") == false) goto L30;
        r5 = r6;
        goto L30
    L23:
        return r6;
    L7:
        if (r4 == null) goto L16;
        if (r5 == null) goto L16;
        if (abcd.NK.DW(r15) == false) goto L13;
        return r4;
    L13:
        return r5;
    L16:
        if (r12 == null) goto L20;
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().enumValueNotSupported3, new java.lang.Object[]{r11, r13, r0}));
    L20:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().enumValueNotSupported2, new java.lang.Object[]{r11, r13, r0}));
    }

    public <T> T j6(gE.b<T> r3) {
        abcd.gE.c r0 = Zo();
        T r1 = (T) r0.DW.get(r3);
        if (r1 != null) goto L6;
        T r2 = (T) r3.j6(this);
        r0.DW.put(r3, r2);
        return r2;
    L6:
        return r1;
    }

    public java.lang.String j6(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
        return Hw(r1, r2, r3);
    }

    protected void j6() {
        this.Hw.set(VH());
    }

    public void j6(java.lang.String r10) {
        java.util.ArrayList r0 = new java.util.ArrayList();
        abcd.gE.d r1 = new abcd.gE.d(r10);
        abcd.gE.a r11 = new abcd.gE.a(null);
        abcd.gE.a r3 = null;
    L3:
        int r4 = r1.j6();
        if ((-1) == r4) goto L5;
        char r5 = (char) r4;
        if ('\n' == r5) goto L9;
        java.lang.String r6 = r11.Zo;
        if (r6 != null) goto L15;
        if (';' == r5) goto L46;
        if ('#' == r5) goto L46;
        if (r11.DW != null) goto L30;
        if (java.lang.Character.isWhitespace(r5) == false) goto L30;
        if (r11.j6 != null) goto L28;
        r11.j6 = "";
    L28:
        r11.j6 = java.lang.String.valueOf(r11.j6) + r5;
    L30:
        if ('[' == r5) goto L31;
        if (r3 == null) goto L45;
        r11.DW = r3.DW;
        r11.FH = r3.FH;
        r1.DW();
        r11.Hw = j6(r1);
        if (r11.Hw.endsWith("\n") == true) goto L42;
        r11.v5 = j6(r1, false, -1);
        goto L3
    L42:
        java.lang.String r7 = r11.Hw;
        r11.Hw = r7.substring(0, r7.length() - 1);
        r11.v5 = DW;
        goto L3
    L45:
        throw new abcd.XC(org.eclipse.jgit.JGitText.j6().invalidLineInConfigFile);
    L31:
        r11.DW = DW(r1);
        int r8 = r1.j6();
        if (34 != r8) goto L35;
        r11.FH = j6(r1, true, 34);
        r8 = r1.j6();
    L35:
        if (93 != r8) goto L38;
        r11.Zo = "";
        goto L3
    L38:
        throw new abcd.XC(org.eclipse.jgit.JGitText.j6().badGroupHeader);
    L46:
        r11.Zo = java.lang.String.valueOf(r5);
        goto L3
    L15:
        r11.Zo = java.lang.String.valueOf(r6) + r5;
        goto L3
    L9:
        r0.add(r11);
        if (r11.DW == null) goto L12;
        r3 = r11;
    L12:
        r11 = new abcd.gE.a(null);
        goto L3
    L5:
        this.Hw.set(j6(r0));
    }

    public void j6(java.lang.String r4, java.lang.String r5) {
    L2:
        abcd.gE.c r0 = this.Hw.get();
        abcd.gE.c r1 = j6(r0, r4, r5);
        if (this.Hw.compareAndSet(r0, r1) == false) goto L2;
    }

    public void j6(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        j6(r1, r2, r3, java.util.Collections.singletonList(r4));
    }

    public void j6(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.List<java.lang.String> r11) {
    L2:
        abcd.gE.c r0 = this.Hw.get();
        abcd.gE.c r1 = j6(r0, r8, r9, r10, r11);
        if (this.Hw.compareAndSet(r0, r1) == false) goto L2;
        if (FH() == false) goto L10;
        DW();
        return;
    }

    public boolean j6(java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8) {
        java.lang.String r9 = Hw(r5, r6, r7);
        if (r9 != null) goto L6;
        return r8;
    L6:
        if (DW != r9) goto L12;
        return true;
    L12:
        return abcd.NK.DW(r9);
    L11:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidBooleanValue, new java.lang.Object[]{r5, r7, r9}));
    }

    public boolean j6(java.lang.String r2, java.lang.String r3, boolean r4) {
        return j6(r2, null, r3, r4);
    }
}
