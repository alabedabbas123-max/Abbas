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
        java.lang.String r0 = r5.readString();
        byte r1 = r5.readByte();
        if (r1 == 1) goto L11;
        if (r1 != 2) goto L9;
        return new tv.ouya.console.api.Purchasable(r0, r5.readString(), r5.readString(), r5.readString());
    L9:
        throw new java.lang.IllegalArgumentException("Unable to rebuild purchasable. Encryption data state unknown");
    L11:
        return new tv.ouya.console.api.Purchasable(r0);
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
