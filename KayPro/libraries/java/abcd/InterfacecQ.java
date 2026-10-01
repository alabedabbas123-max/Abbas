package abcd;

public interface InterfacecQ extends android.os.IInterface {

    public static abstract class a extends android.os.Binder implements abcd.InterfacecQ {
        public a() {
            attachInterface(this, "tv.ouya.console.internal.IStringListener");
        }

        @Override
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            if (r4 != 1) goto L5;
            r5.enforceInterface("tv.ouya.console.internal.IStringListener");
            Mr(r5.readString());
            r6.writeNoException();
            return true;
        L5:
            if (r4 != 2) goto L7;
            r5.enforceInterface("tv.ouya.console.internal.IStringListener");
            int r8 = r5.readInt();
            java.lang.String r9 = r5.readString();
            if (r5.readInt() == 0) goto L19;
            android.os.Bundle r10 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r5);
        L20:
            j6(r8, r9, r10);
            r6.writeNoException();
            return true;
        L19:
            r10 = null;
            goto L20
        L7:
            if (r4 != 3) goto L9;
            r5.enforceInterface("tv.ouya.console.internal.IStringListener");
            onCancel();
            r6.writeNoException();
            return true;
        L9:
            if (r4 != 1598968902) goto L11;
            r6.writeString("tv.ouya.console.internal.IStringListener");
            return true;
        L11:
            return super.onTransact(r4, r5, r6, r7);
        }
    }

    void Mr(java.lang.String r1);

    void j6(int r1, java.lang.String r2, android.os.Bundle r3);

    void onCancel();
}
