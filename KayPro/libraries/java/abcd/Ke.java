package abcd;

@abcd.Interfacexu
public class Ke {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.Ke.class, 923036074386573539L, 923036074386573539L);
    }

    public Ke() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4224916339600595499L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4224916339600595499L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static java.lang.String j6(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1517005023151267440L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1517005023151267440L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return r5 + "/raw/wearable_app.apk";
    }

    public static boolean j6(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -437176524350347264L, null, r9, r10, r11, r12);
    L17:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-437176524350347264L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L13
    L5:
        java.lang.String r0 = (((("<wearableApp package=\"" + r10 + "\">\n") + "\t<versionCode>" + r11 + "</versionCode>\n") + "\t<versionName>" + r12 + "</versionName>\n") + "\t<rawPathResId>wearable_app</rawPathResId>\n") + "</wearableApp>";     // Catch: java.lang.Throwable -> L13
        java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter(new com.aide.common.na(r9 + "/xml/wearable_app_desc.xml"));     // Catch: java.io.IOException -> L9 java.lang.Throwable -> L13
        r2.write(r0);     // Catch: java.io.IOException -> L9 java.lang.Throwable -> L13
        r2.close();     // Catch: java.io.IOException -> L9 java.lang.Throwable -> L13
        return true;
    L9:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Throwable -> L13
        return false;
    }
}
