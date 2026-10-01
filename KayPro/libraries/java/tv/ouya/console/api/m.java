package tv.ouya.console.api;

class m implements android.os.Parcelable.Creator<tv.ouya.console.api.Purchasable> {
    m() {
    }

    @Override
    public tv.ouya.console.api.Purchasable createFromParcel(android.os.Parcel r1) {
        return createFromParcel2(r1);
    }

    @Override
    public tv.ouya.console.api.Purchasable createFromParcel2(android.os.Parcel r5) {
        java.lang.String r0 = null;
        byte r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5.readString();
                    r1 = r5.readByte();
                    if (r1 == 1) { $pc0 = 11; continue $sw0; }
                    if (r1 != 2) { $pc0 = 9; continue $sw0; }
                    return new tv.ouya.console.api.Purchasable(r0, r5.readString(), r5.readString(), r5.readString());
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("Unable to rebuild purchasable. Encryption data state unknown");
                }
                case 11: {
                    return new tv.ouya.console.api.Purchasable(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public tv.ouya.console.api.Purchasable[] newArray(int r1) {
        return newArray2(r1);
    }

    @Override
    public tv.ouya.console.api.Purchasable[] newArray2(int r1) {
        return new tv.ouya.console.api.Purchasable[r1];
    }
}
