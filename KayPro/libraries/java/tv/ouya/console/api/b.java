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
        double r1 = r10.readDouble();
        java.lang.String r3 = r10.readString();
        java.lang.String r4 = r10.readString();
        java.lang.String r5 = r10.readString();
        java.lang.String r6 = r10.readString();
        if (r10.readInt() != 1) goto L5;
        boolean r7 = true;
    L7:
        return new tv.ouya.console.api.CreditCardInfo(r1, r3, r4, r5, r6, r7);
    L5:
        r7 = false;
        goto L7
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
