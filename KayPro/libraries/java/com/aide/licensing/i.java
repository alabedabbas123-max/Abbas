package com.aide.licensing;

@abcd.Interfacexu
public class i {

    @abcd.Interfaceru(field = 2956333421720757728L)
    private static final java.security.SecureRandom DW = null;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = 1804855225910640183L)
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.licensing.i.class, 5040490317030669360L, 5040490317030669360L);     // Catch: java.lang.Throwable -> L8
        if (FH == false) goto L6;
        abcd.wu.j6(-3457085867215190144L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = false;     // Catch: java.lang.Throwable -> L8
        DW = new java.security.SecureRandom();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -3457085867215190144L, null);
    L12:
        throw th;
    }

    public i() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 2072890154687443120L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(2072890154687443120L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static long DW(android.content.Context r11) {
    L9:
        th = move-exception;
        if (Hw == false) goto L13;
        abcd.wu.j6(th, 788683071768376512L, null, r11);
    L13:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(788683071768376512L, null, r11);     // Catch: java.lang.Throwable -> L9
    L6:
        byte[] r3 = FH(r11);     // Catch: java.lang.Throwable -> L9
        long r4 = (((((long) r3[0]) & 255) | ((((long) r3[1]) & 255) << 8)) | ((((long) r3[2]) & 255) << 16)) | ((255 & ((long) r3[3])) << 24);     // Catch: java.lang.Throwable -> L9
        abcd.ue.j6("Device ID long: " + java.lang.Long.toHexString(r4));     // Catch: java.lang.Throwable -> L9
        return 268435455 & r4;
    }

    @abcd.Interfacesu(method = -281371228977056293L)
    private static java.lang.String DW(java.lang.String r5) {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, 6482084520535680403L, null, r5);
    L15:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(6482084520535680403L, null, r5);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r5 != null) goto L9;
        return "";
    L9:
        return r5.trim().toLowerCase(java.util.Locale.US);
    }

    @abcd.Interfacesu(method = 2408192990342247365L)
    private static byte[] FH(android.content.Context r6) {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, -1393602165026291935L, null, r6);
    L15:
        throw th;
    L4:
        if (FH == false) goto L16;
        abcd.wu.j6(-1393602165026291935L, null, r6);     // Catch: java.lang.Throwable -> L11
    L16:
        return java.security.MessageDigest.getInstance("SHA-256").digest(Hw(r6).getBytes("UTF-8"));
    L8:
        e = move-exception;
        throw new java.lang.RuntimeException(e);     // Catch: java.lang.Throwable -> L11
    }

    @abcd.Interfacesu(method = 3454045335017905469L)
    private static java.lang.String Hw(android.content.Context r5) {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, -5892646746367961779L, null, r5);
    L15:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-5892646746367961779L, null, r5);     // Catch: java.lang.Throwable -> L11
    L7:
        if (j6 == false) goto L10;
        return v5(r5);
    L10:
        return Zo(r5);
    }

    @abcd.Interfacesu(method = -7546387813303295L)
    private static java.lang.String Zo(android.content.Context r6) {
    L10:
        th = move-exception;
        if (Hw == false) goto L14;
        abcd.wu.j6(th, 6568867120161252949L, null, r6);
    L14:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(6568867120161252949L, null, r6);     // Catch: java.lang.Throwable -> L10
    L6:
        java.lang.String r3 = "(default)";
        r3 = android.provider.Settings.Secure.getString(r6.getContentResolver(), "android_id");     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> L10
    L8:
        java.lang.String r4 = "android id: " + r3 + ";";     // Catch: java.lang.Throwable -> L10
        abcd.ue.j6("Device ID string: " + r4);     // Catch: java.lang.Throwable -> L10
        return r4;
    }

    public static long j6(android.content.Context r6) {
    L9:
        th = move-exception;
        if (Hw == false) goto L13;
        abcd.wu.j6(th, 2241911797433139205L, null, r6);
    L13:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(2241911797433139205L, null, r6);     // Catch: java.lang.Throwable -> L9
    L6:
        long r3 = DW.nextLong() << 32;     // Catch: java.lang.Throwable -> L9
        return DW(r6) | r3;
    }

    static java.lang.String j6(java.lang.String r0) {
        return DW(r0);
    }

    public static boolean j6(android.content.Context r7, long r8) {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, 888274387979980029L, null, r7, new java.lang.Long(r8));
    L15:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(888274387979980029L, null, r7, new java.lang.Long(r8));     // Catch: java.lang.Throwable -> L11
    L5:
        if ((4294967295L & r8) != DW(r7)) goto L9;
        return true;
    L9:
        return false;
    }

    @abcd.Interfacesu(method = 627317200230993920L)
    private static java.lang.String v5(android.content.Context r9) {
        java.lang.String r1 = "(default)";
    L23:
        th = move-exception;
        if (Hw == false) goto L28;
        abcd.wu.j6(th, -940928107995117036L, null, r9);
    L28:
        throw th;
    L4:
        if (FH == false) goto L39;
        abcd.wu.j6(-940928107995117036L, null, r9);     // Catch: java.lang.Throwable -> L23
    L39:
        android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r9.getSystemService("phone");     // Catch: java.lang.Exception -> L13 java.lang.Throwable -> L23
        java.lang.String r6 = r5.getDeviceId();     // Catch: java.lang.Exception -> L9 java.lang.Throwable -> L23
    L41:
        java.lang.String r7 = r5.getSimSerialNumber();     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L23
    L45:
        r1 = android.provider.Settings.Secure.getString(r9.getContentResolver(), "android_id");     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L23
    L15:
        java.lang.StringBuilder r8 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L23
        r8.append("android id: ");     // Catch: java.lang.Throwable -> L23
        r8.append(r1);     // Catch: java.lang.Throwable -> L23
        r8.append(";");     // Catch: java.lang.Throwable -> L23
        r8.append("tel device id: ");     // Catch: java.lang.Throwable -> L23
        r8.append(r6);     // Catch: java.lang.Throwable -> L23
        r8.append(";");     // Catch: java.lang.Throwable -> L23
        r8.append("tel sim serial no: ");     // Catch: java.lang.Throwable -> L23
        r8.append(r7);     // Catch: java.lang.Throwable -> L23
        r8.append(";");     // Catch: java.lang.Throwable -> L23
        r8.append("accounts: ");     // Catch: java.lang.Throwable -> L23
        android.accounts.Account[] r0 = android.accounts.AccountManager.get(r9).getAccountsByType("com.google");     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L23
        java.util.Arrays.sort(r0, new com.aide.licensing.h());     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L23
        int r2 = r0.length;     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L23
        int r10 = 0;
    L17:
        if (r10 >= r2) goto L21;
        r8.append(DW(r0[r10].name));     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L23
        r8.append(",");     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L23
    L20:
        r10 = r10 + 1;
    L21:
        java.lang.String r3 = r8.toString();     // Catch: java.lang.Throwable -> L23
        abcd.ue.j6("Device ID string: " + r3);     // Catch: java.lang.Throwable -> L23
        return r3;
    L12:
        r7 = "(default)";
    L9:
        r6 = "(default)";
    L13:
        r7 = "(default)";
        r6 = r7;
        goto L45
    }
}
