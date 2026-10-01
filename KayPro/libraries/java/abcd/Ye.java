package abcd;

@abcd.Interfacexu
public class Ye implements abcd.InterfaceYl {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.Ye.class, 737711429368467645L, 737711429368467645L);
    }

    public Ye() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -919997216995409865L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-919997216995409865L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = -3292850577691247115L)
    private void FH() {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 2463767961289454832L, this);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2463767961289454832L, this);     // Catch: java.lang.Throwable -> L16
    L6:
        java.util.List<com.aide.ui.AIDEEditor> r2 = com.aide.ui.U.lg().J8().getFileEditors();     // Catch: java.lang.Throwable -> L16
        java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L16
        java.util.Iterator<com.aide.ui.AIDEEditor> r4 = r2.iterator();     // Catch: java.lang.Throwable -> L16
    L8:
        if (r4.hasNext() == false) goto L10;
        r3.add(r4.next().getFilePath());     // Catch: java.lang.Throwable -> L16
        goto L8
    L10:
        java.util.Iterator r5 = r3.iterator();     // Catch: java.lang.Throwable -> L16
    L11:
        if (r5.hasNext() == false) goto L15;
        java.lang.String r6 = (java.lang.String) r5.next();     // Catch: java.lang.Throwable -> L16
        com.aide.ui.U.er().j6(r6);     // Catch: java.lang.Throwable -> L16
        goto L11
    }

    static void j6(abcd.Ye r0) {
        r0.FH();
    }

    @Override
    public boolean isEnabled() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2713305050511557151L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-2713305050511557151L, this);     // Catch: java.lang.Throwable -> L8
        return true;
    L15:
        return true;
    }

    @Override
    public int j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 966460528457489099L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(966460528457489099L, this);     // Catch: java.lang.Throwable -> L8
        return com.almlkaide.kaypro.R.id.filetabMenuCloseAll;
    L15:
        return com.almlkaide.kaypro.R.id.filetabMenuCloseAll;
    }

    @Override
    public boolean run() {
        return com.almlkaide.kaypro.aide.FileTabListener.filetabMenuCloseAll(this);
    }

    public boolean run_() {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 490823827207421679L, this);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(490823827207421679L, this);     // Catch: java.lang.Throwable -> L16
    L6:
        boolean r3 = false;
        java.util.Iterator<com.aide.ui.AIDEEditor> r2 = com.aide.ui.U.lg().J8().getFileEditors().iterator();     // Catch: java.lang.Throwable -> L16
    L8:
        if (r2.hasNext() == false) goto L12;
        java.lang.String r4 = r2.next().getFilePath();     // Catch: java.lang.Throwable -> L16
        if (com.aide.ui.U.er().DW(r4).J0() == false) goto L8;
        r3 = true;
        goto L8
    L12:
        if (r3 == false) goto L14;
        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), com.almlkaide.kaypro.R.string.dialog_save_files_title, com.almlkaide.kaypro.R.string.dialog_save_files_message, new abcd.RunnableXe(this), null);     // Catch: java.lang.Throwable -> L16
    L15:
        return true;
    L14:
        FH();     // Catch: java.lang.Throwable -> L16
        goto L15
    }
}
