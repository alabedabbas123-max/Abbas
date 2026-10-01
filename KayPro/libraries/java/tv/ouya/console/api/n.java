package tv.ouya.console.api;

class n implements android.os.Parcelable.Creator<tv.ouya.console.api.Receipt> {
    n() {
    }

    @Override
    public tv.ouya.console.api.Receipt createFromParcel(android.os.Parcel r1) {
        return createFromParcel2(r1);
    }

    @Override
    public tv.ouya.console.api.Receipt createFromParcel2(android.os.Parcel r12) {
        return new tv.ouya.console.api.Receipt(r12.readString(), r12.readInt(), new java.util.Date(r12.readLong()), new java.util.Date(r12.readLong()), r12.readString(), r12.readString(), r12.readDouble(), r12.readString());
    }

    @Override
    public tv.ouya.console.api.Receipt[] newArray(int r1) {
        return newArray2(r1);
    }

    @Override
    public tv.ouya.console.api.Receipt[] newArray2(int r1) {
        return new tv.ouya.console.api.Receipt[r1];
    }
}
