package abcd;

public class Binderyx extends android.os.Binder implements android.os.IInterface {
    protected Binderyx(java.lang.String r1) {
        attachInterface(this, r1);
    }

    @Override
    public android.os.IBinder asBinder() {
        return this;
    }

    protected boolean j6(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        throw null;
    }

    @Override
    public boolean onTransact(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        boolean r0 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 <= 16777215) { $pc0 = 5; continue $sw0; }
                    r0 = super.onTransact(r2, r3, r4, r5);
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r0 == false) { $pc0 = 10; continue $sw0; }
                    return true;
                }
                case 10: {
                    return j6(r2, r3, r4, r5);
                }
                case 5: {
                    r3.enforceInterface(getInterfaceDescriptor());
                    r0 = false;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
