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
        java.lang.String r0 = r4.readString();
        boolean r2 = true;
        if (r4.readInt() == 1) goto L7;
        r2 = false;
    L7:
        return new tv.ouya.console.api.store.Tag(r0, java.lang.Boolean.valueOf(r2), r4.readString());
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
