package com.aide.ui.preferences;

@abcd.Interfacexu
public class b {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.preferences.b.class, -4279537788465023376L, -4279537788465023376L);
    }

    public b() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -512342087741497743L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-512342087741497743L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static void DW(android.content.Context r13, android.preference.PreferenceScreen r14) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -6390746408990753400L, null, r13, r14);
    L24:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-6390746408990753400L, null, r13, r14);     // Catch: java.lang.Throwable -> L19
    L6:
        abcd.Enumid[] r3 = abcd.Enumid.values();     // Catch: java.lang.Throwable -> L19
        int r5 = r3.length;     // Catch: java.lang.Throwable -> L19
        android.preference.PreferenceCategory r7 = null;
        int r4 = 0;
    L7:
        if (r4 >= r5) goto L18;
        abcd.Enumid r8 = r3[r4];     // Catch: java.lang.Throwable -> L19
        if (r7 != null) goto L11;
    L12:
        r7 = new android.preference.PreferenceCategory(r13);     // Catch: java.lang.Throwable -> L19
        r7.setTitle(r8.Zo());     // Catch: java.lang.Throwable -> L19
        r14.addPreference(r7);     // Catch: java.lang.Throwable -> L19
    L13:
        com.aide.ui.preferences.PremiumCheckBoxPreference r9 = new com.aide.ui.preferences.PremiumCheckBoxPreference(r13);     // Catch: java.lang.Throwable -> L19
        r9.setKey(r8.VH());     // Catch: java.lang.Throwable -> L19
        r9.setTitle(r8.getName());     // Catch: java.lang.Throwable -> L19
        if (r8.j6(false).length() <= 0) goto L16;
        r9.setSummary(("\"" + r8.j6(false).replace("\n", "\\n") + "\"") + " versus " + ("\"" + r8.j6(true).replace("\n", "\\n") + "\""));     // Catch: java.lang.Throwable -> L19
    L16:
        r7.addPreference(r9);     // Catch: java.lang.Throwable -> L19
        r4 = r4 + 1;
        goto L7
    L11:
        if (r7.getTitle().equals(r8.Zo()) == true) goto L13;
    }

    public static void FH(android.content.Context r13, android.preference.PreferenceScreen r14) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -6107569869657035195L, null, r13, r14);
    L24:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-6107569869657035195L, null, r13, r14);     // Catch: java.lang.Throwable -> L19
    L6:
        abcd.EnumMd[] r3 = abcd.EnumMd.values();     // Catch: java.lang.Throwable -> L19
        int r5 = r3.length;     // Catch: java.lang.Throwable -> L19
        android.preference.PreferenceCategory r7 = null;
        int r4 = 0;
    L7:
        if (r4 >= r5) goto L18;
        abcd.EnumMd r8 = r3[r4];     // Catch: java.lang.Throwable -> L19
        if (r7 != null) goto L11;
    L12:
        r7 = new android.preference.PreferenceCategory(r13);     // Catch: java.lang.Throwable -> L19
        r7.setTitle(r8.Zo());     // Catch: java.lang.Throwable -> L19
        r14.addPreference(r7);     // Catch: java.lang.Throwable -> L19
    L13:
        com.aide.ui.preferences.PremiumCheckBoxPreference r9 = new com.aide.ui.preferences.PremiumCheckBoxPreference(r13);     // Catch: java.lang.Throwable -> L19
        r9.setKey(r8.VH());     // Catch: java.lang.Throwable -> L19
        r9.setTitle(r8.getName());     // Catch: java.lang.Throwable -> L19
        if (r8.j6(false).length() <= 0) goto L16;
        r9.setSummary(("\"" + r8.j6(false).replace("\n", "\\n") + "\"") + " versus " + ("\"" + r8.j6(true).replace("\n", "\\n") + "\""));     // Catch: java.lang.Throwable -> L19
    L16:
        r7.addPreference(r9);     // Catch: java.lang.Throwable -> L19
        r4 = r4 + 1;
        goto L7
    L11:
        if (r7.getTitle().equals(r8.Zo()) == true) goto L13;
    }

    public static void j6(android.content.Context r7, android.preference.PreferenceScreen r8) {
    L18:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, 1653182198676246961L, null, r7, r8);
    L22:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(1653182198676246961L, null, r7, r8);     // Catch: java.lang.Throwable -> L18
    L6:
        if (com.aide.ui.U.ef() == false) goto L8;
    L11:
        FH(r7, r8);     // Catch: java.lang.Throwable -> L18
    L13:
        if (com.aide.ui.U.ef() == false) goto L15;
    L16:
        DW(r7, r8);     // Catch: java.lang.Throwable -> L18
        return;
    L15:
        if (com.aide.ui.U.j6.equals("com.aide.ui") == true) goto L16;
        return;
    L8:
        if (com.aide.ui.U.j6.equals("com.aide.phonegap") == true) goto L11;
        if (com.aide.ui.U.j6.equals("com.aide.web") == false) goto L13;
        goto L11
    }
}
