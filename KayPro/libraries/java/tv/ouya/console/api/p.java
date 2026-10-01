package tv.ouya.console.api;

class p implements android.os.Parcelable.Creator<tv.ouya.console.api.UserInfo> {
    p() {
    }

    @Override
    public tv.ouya.console.api.UserInfo createFromParcel(android.os.Parcel r1) {
        return createFromParcel2(r1);
    }

    @Override
    public tv.ouya.console.api.UserInfo createFromParcel2(android.os.Parcel r7) {
        tv.ouya.console.api.UserInfo r0 = new tv.ouya.console.api.UserInfo();
        tv.ouya.console.api.UserInfo.j6(r0, r7.readString());
        tv.ouya.console.api.UserInfo.DW(r0, r7.readString());
        tv.ouya.console.api.UserInfo.FH(r0, r7.readString());
        long r1 = r7.readLong();
        if (r1 <= 0) goto L5;
        tv.ouya.console.api.UserInfo.j6(r0, new java.util.GregorianCalendar());
        tv.ouya.console.api.UserInfo.j6(r0).setTimeInMillis(r1);
    L5:
        tv.ouya.console.api.UserInfo.j6(r0, r7.readInt());
        boolean r2 = false;
        if (r7.readByte() != 1) goto L8;
        boolean r3 = true;
    L9:
        tv.ouya.console.api.UserInfo.j6(r0, r3);
        if (r7.readByte() != 1) goto L12;
        r2 = true;
    L12:
        tv.ouya.console.api.UserInfo.DW(r0, r2);
        return r0;
    L8:
        r3 = false;
        goto L9
    }

    @Override
    public tv.ouya.console.api.UserInfo[] newArray(int r1) {
        return newArray2(r1);
    }

    @Override
    public tv.ouya.console.api.UserInfo[] newArray2(int r1) {
        return new tv.ouya.console.api.UserInfo[r1];
    }
}
