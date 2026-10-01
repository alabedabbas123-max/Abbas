package tv.ouya.console.api.store;

class c implements android.os.Parcelable.Creator<tv.ouya.console.api.store.StoreSection> {
    c() {
    }

    @Override
    public tv.ouya.console.api.store.StoreSection createFromParcel(android.os.Parcel r1) {
        return createFromParcel2(r1);
    }

    @Override
    public tv.ouya.console.api.store.StoreSection createFromParcel2(android.os.Parcel r7) {
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        int r2 = 0;
        java.util.ArrayList r3 = null;
        int r4 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r7.readString();
                    r1 = r7.readString();
                    r2 = r7.readInt();
                    r3 = new java.util.ArrayList(r2);
                    r4 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r4 >= r2) { $pc0 = 6; continue $sw0; }
                    r3.add(createFromParcel2(r7));
                    r4 = r4 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 6: {
                    return new tv.ouya.console.api.store.StoreSection(r0, r1, r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public tv.ouya.console.api.store.StoreSection[] newArray(int r1) {
        return newArray2(r1);
    }

    @Override
    public tv.ouya.console.api.store.StoreSection[] newArray2(int r1) {
        return new tv.ouya.console.api.store.StoreSection[r1];
    }
}
