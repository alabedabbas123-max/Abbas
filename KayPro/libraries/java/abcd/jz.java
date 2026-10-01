package abcd;

public class jz implements _y<abcd.Interfacelz>, abcd.Interfacehz, abcd.Interfacelz {
    private final java.util.concurrent.atomic.AtomicBoolean DW;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> FH;
    private final java.util.List<abcd.Interfacelz> j6;

    public jz() {
        this.j6 = new java.util.ArrayList();
        this.DW = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.FH = new java.util.concurrent.atomic.AtomicReference(null);
    }

    public static boolean DW(java.lang.Object r3) {
        abcd._y r1 = (abcd._y) r3;     // Catch: java.lang.ClassCastException -> L9
        abcd.Interfacelz r2 = (abcd.Interfacelz) r3;     // Catch: java.lang.ClassCastException -> L9
        abcd.Interfacehz r4 = (abcd.Interfacehz) r3;     // Catch: java.lang.ClassCastException -> L9
        if (r1 == null) goto L12;
        if (r2 == null) goto L13;
        if (r4 == null) goto L14;
        return true;
    L14:
        return false;
    L13:
        return false;
    L12:
        return false;
    L15:
        return false;
    }

    public boolean DW() {
        java.util.Iterator<abcd.Interfacelz> r0 = FH().iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        if (r0.next().j6() == true) goto L4;
        return false;
    L9:
        return true;
    }

    public synchronized java.util.Collection<abcd.Interfacelz> FH() {
        monitor-enter(this);
        java.util.Collection<abcd.Interfacelz> r0 = java.util.Collections.unmodifiableCollection(this.j6);     // Catch: java.lang.Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    @Override
    public int compareTo(java.lang.Object r1) {
        return abcd.Enumcz.j6(this, r1);
    }

    public synchronized void j6(abcd.Interfacelz r2) {
        monitor-enter(this);
        this.j6.add(r2);     // Catch: java.lang.Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public void j6(java.lang.Object r1) {
        j6((abcd.Interfacelz) r1);
    }

    @Override
    public void j6(java.lang.Throwable r2) {
        this.FH.set(r2);
    }

    @Override
    public synchronized void j6(boolean r2) {
        monitor-enter(this);
        this.DW.set(r2);     // Catch: java.lang.Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override
    public boolean j6() {
        return this.DW.get();
    }

    @Override
    public abcd.Enumcz v5() {
        return abcd.Enumcz.DW;
    }
}
