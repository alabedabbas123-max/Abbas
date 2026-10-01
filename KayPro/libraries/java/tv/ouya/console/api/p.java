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
        tv.ouya.console.api.UserInfo r0 = null;
        long r1 = 0L;
        boolean r2 = false;
        boolean r3 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new tv.ouya.console.api.UserInfo();
                    tv.ouya.console.api.UserInfo.j6(r0, r7.readString());
                    tv.ouya.console.api.UserInfo.DW(r0, r7.readString());
                    tv.ouya.console.api.UserInfo.FH(r0, r7.readString());
                    r1 = r7.readLong();
                    if (r1 <= 0) { $pc0 = 5; continue $sw0; }
                    tv.ouya.console.api.UserInfo.j6(r0, new java.util.GregorianCalendar());
                    tv.ouya.console.api.UserInfo.j6(r0).setTimeInMillis(r1);
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    tv.ouya.console.api.UserInfo.j6(r0, r7.readInt());
                    r2 = false;
                    if (r7.readByte() != 1) { $pc0 = 8; continue $sw0; }
                    r3 = true;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    tv.ouya.console.api.UserInfo.j6(r0, r3);
                    if (r7.readByte() != 1) { $pc0 = 12; continue $sw0; }
                    r2 = true;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    tv.ouya.console.api.UserInfo.DW(r0, r2);
                    return r0;
                }
                case 8: {
                    r3 = false;
                    { $pc0 = 9; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
