package tv.ouya.console.api;

class l implements android.os.Parcelable.Creator<tv.ouya.console.api.Product> {
    l() {
    }

    @Override
    public tv.ouya.console.api.Product createFromParcel(android.os.Parcel r1) {
        return createFromParcel2(r1);
    }

    @Override
    public tv.ouya.console.api.Product createFromParcel2(android.os.Parcel r15) {
        return new tv.ouya.console.api.Product(r15.readString(), r15.readString(), r15.readInt(), r15.readDouble(), r15.readString(), r15.readDouble(), r15.readDouble(), r15.readString(), r15.readString());
    }

    @Override
    public tv.ouya.console.api.Product[] newArray(int r1) {
        return newArray2(r1);
    }

    @Override
    public tv.ouya.console.api.Product[] newArray2(int r1) {
        return new tv.ouya.console.api.Product[r1];
    }
}
