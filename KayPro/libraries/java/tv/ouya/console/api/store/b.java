package tv.ouya.console.api.store;

class b implements android.os.Parcelable.Creator<tv.ouya.console.api.store.AppDetails> {
    b() {
    }

    @Override
    public tv.ouya.console.api.store.AppDetails createFromParcel(android.os.Parcel r1) {
        return createFromParcel2(r1);
    }

    @Override
    public tv.ouya.console.api.store.AppDetails createFromParcel2(android.os.Parcel r26) {
        java.lang.String r2 = r26.readString();
        java.lang.String r3 = r26.readString();
        java.lang.String r4 = r26.readString();
        java.lang.String r5 = r26.readString();
        java.lang.Long r6 = java.lang.Long.valueOf(r26.readLong());
        java.lang.String r7 = r26.readString();
        java.lang.String r8 = r26.readString();
        java.util.ArrayList r9 = new java.util.ArrayList();
        r26.readStringList(r9);
        java.lang.Long r10 = java.lang.Long.valueOf(r26.readLong());
        java.lang.String r11 = r26.readString();
        java.lang.String r12 = r26.readString();
        java.lang.String r13 = r26.readString();
        boolean r14 = false;
        if (r26.readByte() != 1) goto L5;
        boolean r1 = true;
    L6:
        java.lang.Boolean r16 = java.lang.Boolean.valueOf(r1);
        java.lang.String r17 = r26.readString();
        if (r26.readByte() != 1) goto L9;
        boolean r15 = true;
    L10:
        java.lang.Boolean r18 = java.lang.Boolean.valueOf(r15);
        if (r26.readByte() != 1) goto L13;
        boolean r19 = true;
    L14:
        java.lang.Boolean r110 = java.lang.Boolean.valueOf(r19);
        java.lang.String r23 = r26.readString();
        if (r26.readInt() != 1) goto L17;
        r14 = true;
    L17:
        tv.ouya.console.api.Product r20 = null;
        if (r14 == false) goto L21;
        r20 = tv.ouya.console.api.Product.CREATOR.createFromParcel(r26);
    L21:
        return new tv.ouya.console.api.store.AppDetails(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r16, r17, r18, r110, r23, r20, r26.readDouble(), r26.readInt());
    L13:
        r19 = false;
        goto L14
    L9:
        r15 = false;
        goto L10
    L5:
        r1 = false;
        goto L6
    }

    @Override
    public tv.ouya.console.api.store.AppDetails[] newArray(int r1) {
        return newArray2(r1);
    }

    @Override
    public tv.ouya.console.api.store.AppDetails[] newArray2(int r1) {
        return new tv.ouya.console.api.store.AppDetails[r1];
    }
}
