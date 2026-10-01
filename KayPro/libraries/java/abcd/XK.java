package abcd;

public class XK extends java.io.BufferedOutputStream {
    public XK(java.io.OutputStream r1) {
        super(r1);
    }

    public XK(java.io.OutputStream r1, int r2) {
        super(r1);
    }

    @Override
    public void close() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        flush();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 5; continue $sw0;
                    }
                    super.close();
                    return;
                }
                case 5: {
                    th = $ex0;
                    super.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
