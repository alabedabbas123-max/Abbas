package tv.ouya.console.api.store;

class a implements android.os.Parcelable.Creator<tv.ouya.console.api.store.AppDescription> {
    a() {
    }

    @Override
    public tv.ouya.console.api.store.AppDescription createFromParcel(android.os.Parcel r1) {
        return createFromParcel2(r1);
    }

    @Override
    public tv.ouya.console.api.store.AppDescription createFromParcel2(android.os.Parcel r15) {
        java.lang.String r1 = r15.readString();
        java.lang.String r2 = r15.readString();
        java.lang.String r3 = r15.readString();
        if (r15.readInt() != 1) goto L5;
        boolean r0 = true;
    L6:
        java.util.HashMap r6 = null;
        if (r0 == false) goto L9;
        tv.ouya.console.api.Product r7 = tv.ouya.console.api.Product.CREATOR.createFromParcel(r15);
    L10:
        int r4 = r15.readInt();
        if (r4 <= (-1)) goto L15;
        r6 = new java.util.HashMap();
        int r8 = 0;
    L13:
        if (r8 >= r4) goto L15;
        java.lang.String r9 = r15.readString();
        tv.ouya.console.api.store.AppDescription.a r10 = new tv.ouya.console.api.store.AppDescription.a();
        r10.Hw(r15.readString());
        r10.FH(r15.readString());
        r10.DW(r15.readString());
        r10.j6(r15.readString());
        r6.put(r9, r10);
        r8 = r8 + 1;
    L15:
        double r11 = r15.readDouble();
        int r12 = r15.readInt();
        if (r15.readByte() != 1) goto L18;
        boolean r13 = true;
    L20:
        if (r15.readByte() != 1) goto L22;
        boolean r14 = true;
    L24:
        return new tv.ouya.console.api.store.AppDescription(r1, r2, r3, r7, r6, r11, r12, r13, r14, r15.readString());
    L22:
        r14 = false;
        goto L24
    L18:
        r13 = false;
        goto L20
    L9:
        r7 = null;
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    @Override
    public tv.ouya.console.api.store.AppDescription[] newArray(int r1) {
        return newArray2(r1);
    }

    @Override
    public tv.ouya.console.api.store.AppDescription[] newArray2(int r1) {
        return new tv.ouya.console.api.store.AppDescription[r1];
    }
}
