package abcd;

public class Bz implements java.lang.Runnable {
    private final abcd.Interfacexz DW;
    private final android.content.Context j6;

    public Bz(android.content.Context r1, abcd.Interfacexz r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public void run() {
        io.fabric.sdk.android.services.common.i.FH(this.j6, "Performing time based file roll over.");     // Catch: java.lang.Exception -> L6
        if (this.DW.j6() == true) goto L11;
        this.DW.DW();     // Catch: java.lang.Exception -> L6
        return;
    L11:
        return;
    L6:
        e = move-exception;
        io.fabric.sdk.android.services.common.i.j6(this.j6, "Failed to roll over file", e);
    }
}
