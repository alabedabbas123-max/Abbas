package tv.ouya.console.api;

class b implements android.os.Parcelable.Creator<tv.ouya.console.api.CreditCardInfo> {
    b() {
    }

    @Override
    public tv.ouya.console.api.CreditCardInfo createFromParcel(android.os.Parcel r1) {
        return createFromParcel2(r1);
    }

    @Override
    public tv.ouya.console.api.CreditCardInfo createFromParcel2(android.os.Parcel r10) {
        double r1 = 0.0d;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        java.lang.String r5 = null;
        java.lang.String r6 = null;
        boolean r7 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = r10.readDouble();
                    r3 = r10.readString();
                    r4 = r10.readString();
                    r5 = r10.readString();
                    r6 = r10.readString();
                    if (r10.readInt() != 1) { $pc0 = 5; continue $sw0; }
                    r7 = true;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    return new tv.ouya.console.api.CreditCardInfo(r1, r3, r4, r5, r6, r7);
                }
                case 5: {
                    r7 = false;
                    { $pc0 = 7; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public tv.ouya.console.api.CreditCardInfo[] newArray(int r1) {
        return newArray2(r1);
    }

    @Override
    public tv.ouya.console.api.CreditCardInfo[] newArray2(int r1) {
        return new tv.ouya.console.api.CreditCardInfo[r1];
    }
}
