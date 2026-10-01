package abcd;

public class WK extends java.io.Writer {
    private final java.io.OutputStreamWriter DW;
    private final java.io.ByteArrayOutputStream j6;

    public WK() {
        this.j6 = new java.io.ByteArrayOutputStream();
        this.DW = new java.io.OutputStreamWriter(j6(), abcd.hE.Zo);
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    public java.io.OutputStream j6() {
        return this.j6;
    }

    public java.lang.String toString() {
        return abcd.IK.j6(this.j6.toByteArray());
    }

    @Override
    public void write(char[] r3, int r4, int r5) {
        synchronized (this.j6) {
            java.io.ByteArrayOutputStream r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = this.j6;
                        try {
                            this.DW.write(r3, r4, r5);
                            this.DW.flush();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        return;
                    }
                    case 7: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
