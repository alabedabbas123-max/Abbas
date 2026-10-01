package tv.ouya.console.api.store;

class a implements android.os.Parcelable.Creator<tv.ouya.console.api.store.AppDescription> {
    a() {
    }

    @Override
    public tv.ouya.console.api.store.AppDescription createFromParcel(android.os.Parcel r1) {
        return createFromParcel2(r1);
    }

    @Override
    public tv.ouya.console.api.store.AppDescription createFromParcel2(android.os.Parcel r15) {
        java.lang.String r1 = null;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        boolean r0 = false;
        java.util.HashMap r6 = null;
        tv.ouya.console.api.Product r7 = null;
        int r4 = 0;
        int r8 = 0;
        java.lang.String r9 = null;
        tv.ouya.console.api.store.AppDescription.a r10 = null;
        double r11 = 0.0d;
        int r12 = 0;
        boolean r13 = false;
        boolean r14 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = r15.readString();
                    r2 = r15.readString();
                    r3 = r15.readString();
                    if (r15.readInt() != 1) { $pc0 = 5; continue $sw0; }
                    r0 = true;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r6 = null;
                    if (r0 == false) { $pc0 = 9; continue $sw0; }
                    r7 = tv.ouya.console.api.Product.CREATOR.createFromParcel(r15);
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r4 = r15.readInt();
                    if (r4 <= (-1)) { $pc0 = 15; continue $sw0; }
                    r6 = new java.util.HashMap();
                    r8 = 0;
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    if (r8 >= r4) { $pc0 = 15; continue $sw0; }
                    r9 = r15.readString();
                    r10 = new tv.ouya.console.api.store.AppDescription.a();
                    r10.Hw(r15.readString());
                    r10.FH(r15.readString());
                    r10.DW(r15.readString());
                    r10.j6(r15.readString());
                    r6.put(r9, r10);
                    r8 = r8 + 1;
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    r11 = r15.readDouble();
                    r12 = r15.readInt();
                    if (r15.readByte() != 1) { $pc0 = 18; continue $sw0; }
                    r13 = true;
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    if (r15.readByte() != 1) { $pc0 = 22; continue $sw0; }
                    r14 = true;
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    return new tv.ouya.console.api.store.AppDescription(r1, r2, r3, r7, r6, r11, r12, r13, r14, r15.readString());
                }
                case 22: {
                    r14 = false;
                    { $pc0 = 24; continue $sw0; }
                }
                case 18: {
                    r13 = false;
                    { $pc0 = 20; continue $sw0; }
                }
                case 9: {
                    r7 = null;
                    { $pc0 = 10; continue $sw0; }
                }
                case 5: {
                    r0 = false;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public tv.ouya.console.api.store.AppDescription[] newArray(int r1) {
        return newArray2(r1);
    }

    @Override
    public tv.ouya.console.api.store.AppDescription[] newArray2(int r1) {
        return new tv.ouya.console.api.store.AppDescription[r1];
    }
}
