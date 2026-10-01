package abcd;

public class xx implements android.os.IInterface {
    private final java.lang.String DW;
    private final android.os.IBinder j6;

    protected xx(android.os.IBinder r1, java.lang.String r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    protected final void DW(int r4, android.os.Parcel r5) {
        android.os.Parcel r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = android.os.Parcel.obtain();
                    try {
                        this.j6.transact(r4, r5, r0, 0);
                        r0.readException();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 6; continue $sw0;
                    }
                    r5.recycle();
                    r0.recycle();
                    return;
                }
                case 6: {
                    th = $ex0;
                    r5.recycle();
                    r0.recycle();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public android.os.IBinder asBinder() {
        return this.j6;
    }

    protected final android.os.Parcel j6(int r4, android.os.Parcel r5) {
        android.os.Parcel r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = android.os.Parcel.obtain();
                    try {
                        this.j6.transact(r4, r5, r0, 0);
                        r0.readException();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 8; continue $sw1; }
                        $pc1 = 6; continue $sw1;
                    }
                    r5.recycle();
                    return r0;
                }
                case 6: {
                    th = $ex1;
                    r5.recycle();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    e = $ex1;
                    try {
                        r0.recycle();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 6; continue $sw1;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected final android.os.Parcel v5() {
        android.os.Parcel r0 = android.os.Parcel.obtain();
        r0.writeInterfaceToken(this.DW);
        return r0;
    }
}
