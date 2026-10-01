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
        java.lang.String r0 = r7.readString();
        java.lang.String r1 = r7.readString();
        int r2 = r7.readInt();
        java.util.ArrayList r3 = new java.util.ArrayList(r2);
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L6;
        r3.add(createFromParcel2(r7));
        r4 = r4 + 1;
        goto L3
    L6:
        return new tv.ouya.console.api.store.StoreSection(r0, r1, r3);
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
