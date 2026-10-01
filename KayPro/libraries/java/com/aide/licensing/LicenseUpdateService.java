package com.aide.licensing;

@abcd.Interfacexu
public class LicenseUpdateService extends android.app.Service {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -1949494959873280733L)
    private com.aide.licensing.d FH;

    static {
        abcd.wu.j6(com.aide.licensing.LicenseUpdateService.class, 221629680785965347L, 221629680785965347L);
    }

    public LicenseUpdateService() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1577699399604077049L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1577699399604077049L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @Override
    public android.os.IBinder onBind(android.content.Intent r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L15;
        abcd.wu.j6(1231784234591097528L, this, r10);     // Catch: java.lang.Throwable -> L8
        return null;
    L15:
        return null;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1231784234591097528L, this, r10);
    L12:
        throw th;
    }

    @Override
    public void onDestroy() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 981325962915423853L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(981325962915423853L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.ue.j6("License Update service: onDestroy");     // Catch: java.lang.Throwable -> L8
        this.FH.FH();     // Catch: java.lang.Throwable -> L8
        this.FH = null;     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public int onStartCommand(android.content.Intent r9, int r10, int r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -592375986889337440L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-592375986889337440L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.ue.j6("License Update service: onStartCommand");     // Catch: java.lang.Throwable -> L7
        this.FH = new com.aide.licensing.d();     // Catch: java.lang.Throwable -> L7
        this.FH.j6(this, true);     // Catch: java.lang.Throwable -> L7
        this.FH.DW();     // Catch: java.lang.Throwable -> L7
        return 1;
    }
}
