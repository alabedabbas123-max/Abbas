package com.aide.ui.views.editor;

@abcd.Interfacexu
public abstract class ra {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    public interface a {
        void DW(int r1, char[] r2, int r3, int r4);

        void j6(java.lang.String r1);

        boolean j6(int r1, char[] r2, int r3, int r4);
    }

    static {
        abcd.wu.j6(com.aide.ui.views.editor.ra.class, 3836745710645965440L, 3836745710645965440L);
    }

    public ra() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -953159144135997120L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-953159144135997120L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static char[] j6(java.io.Reader r12, com.aide.ui.views.editor.ra.a r13, char[] r14) {
    L46:
        th = move-exception;
        char[] r7 = r14;
        if (DW == false) goto L51;
        abcd.wu.j6(th, -754261635788803180L, null, r12, r13, r7);
    L51:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-754261635788803180L, null, r12, r13, r14);     // Catch: java.lang.Throwable -> L46
    L5:
        int r1 = 0;
        int r2 = 0;
        boolean r3 = false;
        boolean r4 = false;
    L6:
        int r5 = r12.read(r14, r1, r14.length - r1);     // Catch: java.lang.Throwable -> L46
        if (r5 == (-1)) goto L43;
        int r6 = r2;
        boolean r8 = r4;
        int r9 = r1;
        boolean r10 = r3;
        int r11 = 0;
    L9:
        int r15 = r1 + r5;     // Catch: java.lang.Throwable -> L46
        if (r9 >= r15) goto L34;
        char r16 = r14[r9];     // Catch: java.lang.Throwable -> L46
        if (r16 != '\n') goto L14;
        if (r10 == false) goto L27;
        r11 = r11 + 1;     // Catch: java.lang.Throwable -> L46
        if (r8 == false) goto L26;
    L18:
        r10 = false;
    L33:
        r9 = r9 + 1;     // Catch: java.lang.Throwable -> L46
        goto L9
    L26:
        r13.j6("\r\n");     // Catch: java.lang.Throwable -> L46
        r10 = false;
        r8 = true;
        goto L33
    L27:
        if (r8 == true) goto L30;
        r13.j6("\n");     // Catch: java.lang.Throwable -> L46
        r8 = true;
    L30:
        if (r13.j6(r6, r14, r11, r9 - r11) == false) goto L31;
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L46
        r11 = r9 + 1;     // Catch: java.lang.Throwable -> L46
        goto L33
    L31:
        return r14;
    L14:
        if (r16 == '\r') goto L20;
        if (r10 == false) goto L18;
        if (r8 == true) goto L18;
        r13.j6("\r");     // Catch: java.lang.Throwable -> L46
        r8 = true;
        goto L18
    L20:
        if (r13.j6(r6, r14, r11, r9 - r11) == false) goto L21;
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L46
        r11 = r9 + 1;     // Catch: java.lang.Throwable -> L46
        r10 = true;
        goto L33
    L21:
        return r14;
    L34:
        if (r11 == 0) goto L36;
        if (r11 >= r15) goto L41;
        r15 = r15 - r11;     // Catch: java.lang.Throwable -> L46
        java.lang.System.arraycopy(r14, r11, r14, 0, r15);     // Catch: java.lang.Throwable -> L46
    L40:
        r1 = r15;
    L42:
        r3 = r10;
        r2 = r6;
        r4 = r8;
        goto L6
    L41:
        r1 = 0;
        goto L42
    L36:
        if (r15 != r14.length) goto L40;
        char[] r17 = new char[r14.length * 2];     // Catch: java.lang.Throwable -> L46
        java.lang.System.arraycopy(r14, 0, r17, 0, r14.length);     // Catch: java.lang.Throwable -> L46
        r1 = r14.length;     // Catch: java.lang.Throwable -> L46
        r14 = r17;
        goto L42
    L43:
        if (r1 == 0) goto L45;
        r13.DW(r2, r14, 0, r1);     // Catch: java.lang.Throwable -> L46
    L45:
        return r14;
    }
}
