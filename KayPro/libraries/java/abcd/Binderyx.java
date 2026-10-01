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
        if (r2 <= 16777215) goto L5;
        boolean r0 = super.onTransact(r2, r3, r4, r5);
    L6:
        if (r0 == false) goto L10;
        return true;
    L10:
        return j6(r2, r3, r4, r5);
    L5:
        r3.enforceInterface(getInterfaceDescriptor());
        r0 = false;
        goto L6
    }
}
