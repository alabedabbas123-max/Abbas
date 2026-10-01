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
            int r8 = 0;
            java.lang.String r9 = null;
            android.os.Bundle r10 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r4 != 1) { $pc0 = 5; continue $sw0; }
                        r5.enforceInterface("tv.ouya.console.internal.IStringListener");
                        Mr(r5.readString());
                        r6.writeNoException();
                        return true;
                    }
                    case 5: {
                        if (r4 != 2) { $pc0 = 7; continue $sw0; }
                        r5.enforceInterface("tv.ouya.console.internal.IStringListener");
                        r8 = r5.readInt();
                        r9 = r5.readString();
                        if (r5.readInt() == 0) { $pc0 = 19; continue $sw0; }
                        r10 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r5);
                        $pc0 = 20; continue $sw0;
                    }
                    case 20: {
                        j6(r8, r9, r10);
                        r6.writeNoException();
                        return true;
                    }
                    case 19: {
                        r10 = null;
                        { $pc0 = 20; continue $sw0; }
                    }
                    case 7: {
                        if (r4 != 3) { $pc0 = 9; continue $sw0; }
                        r5.enforceInterface("tv.ouya.console.internal.IStringListener");
                        onCancel();
                        r6.writeNoException();
                        return true;
                    }
                    case 9: {
                        if (r4 != 1598968902) { $pc0 = 11; continue $sw0; }
                        r6.writeString("tv.ouya.console.internal.IStringListener");
                        return true;
                    }
                    case 11: {
                        return super.onTransact(r4, r5, r6, r7);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    void Mr(java.lang.String r1);

    void j6(int r1, java.lang.String r2, android.os.Bundle r3);

    void onCancel();
}
