package tv.ouya.console.api.store;

class b implements android.os.Parcelable.Creator<tv.ouya.console.api.store.AppDetails> {
    b() {
    }

    @Override
    public tv.ouya.console.api.store.AppDetails createFromParcel(android.os.Parcel r1) {
        return createFromParcel2(r1);
    }

    @Override
    public tv.ouya.console.api.store.AppDetails createFromParcel2(android.os.Parcel r26) {
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        java.lang.String r5 = null;
        java.lang.Long r6 = null;
        java.lang.String r7 = null;
        java.lang.String r8 = null;
        java.util.ArrayList r9 = null;
        java.lang.Long r10 = null;
        java.lang.String r11 = null;
        java.lang.String r12 = null;
        java.lang.String r13 = null;
        boolean r14 = false;
        boolean r1 = false;
        java.lang.Boolean r16 = null;
        java.lang.String r17 = null;
        boolean r15 = false;
        java.lang.Boolean r18 = null;
        boolean r19 = false;
        java.lang.Boolean r110 = null;
        java.lang.String r23 = null;
        tv.ouya.console.api.Product r20 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r2 = r26.readString();
                    r3 = r26.readString();
                    r4 = r26.readString();
                    r5 = r26.readString();
                    r6 = java.lang.Long.valueOf(r26.readLong());
                    r7 = r26.readString();
                    r8 = r26.readString();
                    r9 = new java.util.ArrayList();
                    r26.readStringList(r9);
                    r10 = java.lang.Long.valueOf(r26.readLong());
                    r11 = r26.readString();
                    r12 = r26.readString();
                    r13 = r26.readString();
                    r14 = false;
                    if (r26.readByte() != 1) { $pc0 = 5; continue $sw0; }
                    r1 = true;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r16 = java.lang.Boolean.valueOf(r1);
                    r17 = r26.readString();
                    if (r26.readByte() != 1) { $pc0 = 9; continue $sw0; }
                    r15 = true;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r18 = java.lang.Boolean.valueOf(r15);
                    if (r26.readByte() != 1) { $pc0 = 13; continue $sw0; }
                    r19 = true;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    r110 = java.lang.Boolean.valueOf(r19);
                    r23 = r26.readString();
                    if (r26.readInt() != 1) { $pc0 = 17; continue $sw0; }
                    r14 = true;
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    r20 = null;
                    if (r14 == false) { $pc0 = 21; continue $sw0; }
                    r20 = tv.ouya.console.api.Product.CREATOR.createFromParcel(r26);
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    return new tv.ouya.console.api.store.AppDetails(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r16, r17, r18, r110, r23, r20, r26.readDouble(), r26.readInt());
                }
                case 13: {
                    r19 = false;
                    { $pc0 = 14; continue $sw0; }
                }
                case 9: {
                    r15 = false;
                    { $pc0 = 10; continue $sw0; }
                }
                case 5: {
                    r1 = false;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public tv.ouya.console.api.store.AppDetails[] newArray(int r1) {
        return newArray2(r1);
    }

    @Override
    public tv.ouya.console.api.store.AppDetails[] newArray2(int r1) {
        return new tv.ouya.console.api.store.AppDetails[r1];
    }
}
