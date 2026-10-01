package abcd;

@abcd.Interfacexu
public abstract class AbstractHh extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = 541996511108614871L)
    private android.app.AlertDialog gn;

    static {
        abcd.wu.j6(abcd.AbstractHh.class, 1036993532042931165L, 1036993532042931165L);
    }

    public AbstractHh() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 4072164298204361624L, null);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(4072164298204361624L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = 2254871941261464476L)
    private android.widget.ProgressBar DW(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -3708215645801724120L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-3708215645801724120L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.ProgressBar) r5.findViewById(com.almlkaide.kaypro.R.id.progressdialogProgress);
    }

    @abcd.Interfacesu(method = 661178770536766288L)
    private android.widget.TextView j6(android.app.AlertDialog r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -33907395936756600L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-33907395936756600L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.TextView) r5.findViewById(com.almlkaide.kaypro.R.id.progressdialogLabel);
    }

    protected abstract java.lang.String EQ();

    protected abstract void J0();

    @abcd.Interfacesu(method = -6169156859712083020L)
    protected void J8() {
    L16:
        th = move-exception;
        if (VH == false) goto L20;
        abcd.wu.j6(th, 4801251501855156192L, this);
    L20:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(4801251501855156192L, this);     // Catch: java.lang.Throwable -> L16
    L7:
        if (Ws() == true) goto L9;
        this.gn.dismiss();     // Catch: java.lang.Throwable -> L16
        return;
    L9:
        int r2 = gn();     // Catch: java.lang.Throwable -> L16
        int r3 = u7();     // Catch: java.lang.Throwable -> L16
        java.lang.String r4 = tp();     // Catch: java.lang.Throwable -> L16
        if (r3 > 0) goto L12;
    L14:
        DW(this.gn).setProgress(r2);     // Catch: java.lang.Throwable -> L16
        DW(this.gn).setSecondaryProgress(r3);     // Catch: java.lang.Throwable -> L16
        j6(this.gn).setText(r4);     // Catch: java.lang.Throwable -> L16
        this.gn.setTitle(EQ());     // Catch: java.lang.Throwable -> L16
        return;
    L12:
        if (r3 >= 100) goto L14;
        r4 = r4 + " (" + r3 + "%)";     // Catch: java.lang.Throwable -> L16
        goto L14
    }

    public void VH() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 1335807209470220700L, this);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(1335807209470220700L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.gn.dismiss();     // Catch: java.lang.Throwable -> L8
    }

    protected abstract boolean Ws();

    protected abstract void Zo();

    protected abstract int gn();

    @Override
    @abcd.Interfacesu(method = 3142682422207548855L)
    protected android.app.Dialog j6(android.app.Activity r7) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, -1649244012632306243L, this, r7);
    L15:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-1649244012632306243L, this, r7);     // Catch: java.lang.Throwable -> L11
    L6:
        android.view.View r2 = android.view.LayoutInflater.from(r7).inflate(com.almlkaide.kaypro.R.layout.progressdialog, null);     // Catch: java.lang.Throwable -> L11
        android.app.AlertDialog.Builder r3 = new android.app.AlertDialog.Builder(r7);     // Catch: java.lang.Throwable -> L11
        r3.setTitle(EQ()).setView(r2).setCancelable(true).setPositiveButton(com.almlkaide.kaypro.R.string.dialog_bt_hide, new abcd.DialogInterfaceOnClickListenerDh(this));     // Catch: java.lang.Throwable -> L11
        if (v5() == false) goto L9;
        r3.setNegativeButton(17039360, new abcd.DialogInterfaceOnClickListenerEh(this));     // Catch: java.lang.Throwable -> L11
    L9:
        this.gn = r3.create();     // Catch: java.lang.Throwable -> L11
        this.gn.setOnDismissListener(new abcd.DialogInterfaceOnDismissListenerFh(this));     // Catch: java.lang.Throwable -> L11
        we();     // Catch: java.lang.Throwable -> L11
        this.gn.setOnShowListener(new abcd.DialogInterfaceOnShowListenerGh(this));     // Catch: java.lang.Throwable -> L11
        this.gn.getWindow().addFlags(128);     // Catch: java.lang.Throwable -> L11
        return this.gn;
    }

    protected abstract java.lang.String tp();

    protected abstract int u7();

    protected abstract boolean v5();

    protected abstract void we();
}
