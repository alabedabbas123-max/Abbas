package abcd;

public class HD {
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<? extends abcd.LD>, java.util.concurrent.CopyOnWriteArrayList<abcd.GD>> j6;

    public HD() {
        this.j6 = new java.util.concurrent.ConcurrentHashMap();
    }

    private void j6(abcd.GD r4) {
        java.util.concurrent.CopyOnWriteArrayList<abcd.GD> r0 = this.j6.get(r4.DW);
        if (r0 != null) goto L8;
        r0 = new java.util.concurrent.CopyOnWriteArrayList();
        java.util.concurrent.CopyOnWriteArrayList<abcd.GD> r1 = this.j6.putIfAbsent(r4.DW, r0);
        if (r1 == null) goto L8;
        r0 = r1;
    L8:
        r0.add(r4);
    }

    public abcd.GD j6(abcd.DD r2) {
        return j6(abcd.DD.class, r2);
    }

    public <T extends abcd.LD> abcd.GD j6(java.lang.Class<T> r2, T r3) {
        abcd.GD r0 = new abcd.GD(this, r2, r3);
        j6(r0);
        return r0;
    }

    public void j6(abcd.KD r3) {
        java.util.concurrent.CopyOnWriteArrayList<abcd.GD> r0 = this.j6.get(r3.j6());
        if (r0 == null) goto L9;
        java.util.Iterator<abcd.GD> r1 = r0.iterator();
    L6:
        if (r1.hasNext() == false) goto L11;
        r3.j6(r1.next().FH);
        goto L6
    L11:
        return;
    }
}
