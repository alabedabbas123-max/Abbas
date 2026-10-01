package tv.ouya.console.api.store;

class d implements android.os.Parcelable.Creator<tv.ouya.console.api.store.Tag> {
    d() {
    }

    @Override
    public tv.ouya.console.api.store.Tag createFromParcel(android.os.Parcel r1) {
        return createFromParcel2(r1);
    }

    @Override
    public tv.ouya.console.api.store.Tag createFromParcel2(android.os.Parcel r4) {
        java.lang.String r0 = null;
        boolean r2 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r4.readString();
                    r2 = true;
                    if (r4.readInt() == 1) { $pc0 = 7; continue $sw0; }
                    r2 = false;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    return new tv.ouya.console.api.store.Tag(r0, java.lang.Boolean.valueOf(r2), r4.readString());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public tv.ouya.console.api.store.Tag[] newArray(int r1) {
        return newArray2(r1);
    }

    @Override
    public tv.ouya.console.api.store.Tag[] newArray2(int r1) {
        return new tv.ouya.console.api.store.Tag[r1];
    }
}
