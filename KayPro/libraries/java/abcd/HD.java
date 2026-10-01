package abcd;

public class HD {
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<? extends abcd.LD>, java.util.concurrent.CopyOnWriteArrayList<abcd.GD>> j6;

    public HD() {
        this.j6 = new java.util.concurrent.ConcurrentHashMap();
    }

    private void j6(abcd.GD r4) {
        java.util.concurrent.CopyOnWriteArrayList<abcd.GD> r0 = null;
        java.util.concurrent.CopyOnWriteArrayList<abcd.GD> r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.j6.get(r4.DW);
                    if (r0 != null) { $pc0 = 8; continue $sw0; }
                    r0 = new java.util.concurrent.CopyOnWriteArrayList();
                    r1 = this.j6.putIfAbsent(r4.DW, r0);
                    if (r1 == null) { $pc0 = 8; continue $sw0; }
                    r0 = r1;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    r0.add(r4);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.util.concurrent.CopyOnWriteArrayList<abcd.GD> r0 = null;
        java.util.Iterator<abcd.GD> r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.j6.get(r3.j6());
                    if (r0 == null) { $pc1 = 9; continue $sw1; }
                    r1 = r0.iterator();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r1.hasNext() == false) { $pc1 = 11; continue $sw1; }
                    r3.j6(r1.next().FH);
                    { $pc1 = 6; continue $sw1; }
                }
                case 11: {
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
