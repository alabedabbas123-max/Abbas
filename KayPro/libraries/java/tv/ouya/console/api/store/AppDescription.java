package tv.ouya.console.api.store;

public class AppDescription implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<tv.ouya.console.api.store.AppDescription> CREATOR = null;
    private static final java.lang.String[] j6 = null;
    private java.lang.String DW;
    private java.lang.String EQ;
    private java.lang.String FH;
    private java.util.HashMap<java.lang.String, tv.ouya.console.api.store.AppDescription.a> Hw;
    private int VH;
    private double Zo;
    private boolean gn;
    public tv.ouya.console.api.Product tp;
    private boolean u7;
    private java.lang.String v5;

    public static class a {
        public static final tv.ouya.console.api.store.AppDescription.a j6 = null;
        private java.lang.String DW;
        private java.lang.String FH;
        private java.lang.String Hw;
        private java.lang.String v5;

        static {
            j6 = new tv.ouya.console.api.store.AppDescription.a();
        }

        public a() {
        }

        public java.lang.String DW() {
            return this.Hw;
        }

        public void DW(java.lang.String r1) {
            this.Hw = r1;
        }

        public java.lang.String FH() {
            return this.FH;
        }

        public void FH(java.lang.String r1) {
            this.FH = r1;
        }

        public java.lang.String Hw() {
            return this.DW;
        }

        public void Hw(java.lang.String r1) {
            this.DW = r1;
        }

        public boolean equals(java.lang.Object r5) {
            tv.ouya.console.api.store.AppDescription.a r6 = null;
            java.lang.String r2 = null;
            java.lang.String r3 = null;
            java.lang.String r4 = null;
            java.lang.String r7 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this != r5) { $pc0 = 6; continue $sw0; }
                        return true;
                    }
                    case 6: {
                        if (r5 != null) { $pc0 = 8; continue $sw0; }
                        $pc0 = 43; continue $sw0;
                    }
                    case 43: {
                        return false;
                    }
                    case 8: {
                        if (tv.ouya.console.api.store.AppDescription.a.class != r5.getClass()) { $pc0 = 43; continue $sw0; }
                        r6 = (tv.ouya.console.api.store.AppDescription.a) r5;
                        r2 = this.FH;
                        if (r2 == null) { $pc0 = 16; continue $sw0; }
                        if (r2.equals(r6.FH) == false) { $pc0 = 17; continue $sw0; }
                        $pc0 = 18; continue $sw0;
                    }
                    case 18: {
                        r3 = this.DW;
                        if (r3 == null) { $pc0 = 24; continue $sw0; }
                        if (r3.equals(r6.DW) == false) { $pc0 = 25; continue $sw0; }
                        $pc0 = 26; continue $sw0;
                    }
                    case 26: {
                        r4 = this.Hw;
                        if (r4 == null) { $pc0 = 32; continue $sw0; }
                        if (r4.equals(r6.Hw) == false) { $pc0 = 33; continue $sw0; }
                        $pc0 = 34; continue $sw0;
                    }
                    case 34: {
                        r7 = this.v5;
                        if (r7 == null) { $pc0 = 40; continue $sw0; }
                        if (r7.equals(r6.v5) == false) { $pc0 = 41; continue $sw0; }
                        $pc0 = 42; continue $sw0;
                    }
                    case 42: {
                        return true;
                    }
                    case 41: {
                        return false;
                    }
                    case 40: {
                        if (r6.v5 == null) { $pc0 = 42; continue $sw0; }
                        $pc0 = 33; continue $sw0;
                    }
                    case 33: {
                        return false;
                    }
                    case 32: {
                        if (r6.Hw == null) { $pc0 = 34; continue $sw0; }
                        $pc0 = 25; continue $sw0;
                    }
                    case 25: {
                        return false;
                    }
                    case 24: {
                        if (r6.DW == null) { $pc0 = 26; continue $sw0; }
                        $pc0 = 17; continue $sw0;
                    }
                    case 17: {
                        return false;
                    }
                    case 16: {
                        if (r6.FH == null) { $pc0 = 18; continue $sw0; }
                        { $pc0 = 17; continue $sw0; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public int hashCode() {
            java.lang.String r0 = null;
            int r1 = 0;
            int r2 = 0;
            int r3 = 0;
            java.lang.String r4 = null;
            int r5 = 0;
            int r6 = 0;
            java.lang.String r7 = null;
            int r8 = 0;
            int r9 = 0;
            java.lang.String r10 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = this.DW;
                        r1 = 0;
                        if (r0 == null) { $pc1 = 5; continue $sw1; }
                        r2 = r0.hashCode();
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        r3 = r2 * 31;
                        r4 = this.FH;
                        if (r4 == null) { $pc1 = 9; continue $sw1; }
                        r5 = r4.hashCode();
                        $pc1 = 10; continue $sw1;
                    }
                    case 10: {
                        r6 = (r3 + r5) * 31;
                        r7 = this.Hw;
                        if (r7 == null) { $pc1 = 13; continue $sw1; }
                        r8 = r7.hashCode();
                        $pc1 = 14; continue $sw1;
                    }
                    case 14: {
                        r9 = (r6 + r8) * 31;
                        r10 = this.v5;
                        if (r10 == null) { $pc1 = 18; continue $sw1; }
                        r1 = r10.hashCode();
                        $pc1 = 18; continue $sw1;
                    }
                    case 18: {
                        return r9 + r1;
                    }
                    case 13: {
                        r8 = 0;
                        { $pc1 = 14; continue $sw1; }
                    }
                    case 9: {
                        r5 = 0;
                        { $pc1 = 10; continue $sw1; }
                    }
                    case 5: {
                        r2 = 0;
                        { $pc1 = 6; continue $sw1; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.lang.String j6() {
            return this.v5;
        }

        public void j6(java.lang.String r1) {
            this.v5 = r1;
        }

        public java.lang.String toString() {
            return "AppVersion{uuid='" + this.DW + "', uploadedAt=" + this.FH + ", mainImageFullUrl='" + this.Hw + "', contentRating='" + this.v5 + "'}";
        }
    }

    static {
        j6 = new java.lang.String[]{"unsubmitted", "submitted", "under_review", "approved", "published", "rejected"};
        CREATOR = new tv.ouya.console.api.store.a();
    }

    public AppDescription() {
    }

    public AppDescription(java.lang.String r1, java.lang.String r2, java.lang.String r3, tv.ouya.console.api.Product r4, java.util.HashMap<java.lang.String, tv.ouya.console.api.store.AppDescription.a> r5, double r6, int r8, boolean r9, boolean r10, java.lang.String r11) {
        this.DW = r1;
        this.FH = r2;
        this.v5 = r3;
        this.Hw = r5;
        this.tp = r4;
        this.Zo = r6;
        this.VH = r8;
        this.gn = r9;
        this.u7 = r10;
        this.EQ = r11;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object r8) {
        tv.ouya.console.api.store.AppDescription r9 = null;
        java.lang.String r1 = null;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        tv.ouya.console.api.Product r4 = null;
        java.util.HashMap<java.lang.String, tv.ouya.console.api.store.AppDescription.a> r5 = null;
        java.lang.String r6 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this != r8) { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    if ((r8 instanceof tv.ouya.console.api.store.AppDescription) == true) { $pc2 = 8; continue $sw2; }
                    return false;
                }
                case 8: {
                    r9 = (tv.ouya.console.api.store.AppDescription) r8;
                    r1 = this.FH;
                    if (r1 == null) { $pc2 = 14; continue $sw2; }
                    if (r1.equals(r9.FH) == false) { $pc2 = 15; continue $sw2; }
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    r2 = this.DW;
                    if (r2 == null) { $pc2 = 22; continue $sw2; }
                    if (r2.equals(r9.DW) == false) { $pc2 = 23; continue $sw2; }
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    r3 = this.v5;
                    if (r3 == null) { $pc2 = 30; continue $sw2; }
                    if (r3.equals(r9.v5) == false) { $pc2 = 31; continue $sw2; }
                    $pc2 = 32; continue $sw2;
                }
                case 32: {
                    r4 = this.tp;
                    if (r4 != null) { $pc2 = 38; continue $sw2; }
                    if (r9.tp == null) { $pc2 = 40; continue $sw2; }
                    return false;
                }
                case 40: {
                    r5 = this.Hw;
                    if (r5 == null) { $pc2 = 46; continue $sw2; }
                    if (r5.equals(r9.Hw) == true) { $pc2 = 49; continue $sw2; }
                    $pc2 = 47; continue $sw2;
                }
                case 47: {
                    return false;
                }
                case 49: {
                    if (this.Zo == r9.Zo) { $pc2 = 52; continue $sw2; }
                    return false;
                }
                case 52: {
                    if (this.VH == r9.VH) { $pc2 = 55; continue $sw2; }
                    return false;
                }
                case 55: {
                    if (this.gn == r9.gn) { $pc2 = 58; continue $sw2; }
                    return false;
                }
                case 58: {
                    if (this.u7 == r9.u7) { $pc2 = 60; continue $sw2; }
                    return false;
                }
                case 60: {
                    r6 = this.EQ;
                    if (r6 != null) { $pc2 = 63; continue $sw2; }
                    $pc2 = 65; continue $sw2;
                }
                case 65: {
                    return true;
                }
                case 63: {
                    if (r6.equals(r9.EQ) == true) { $pc2 = 65; continue $sw2; }
                    return false;
                }
                case 46: {
                    if (r9.Hw == null) { $pc2 = 49; continue $sw2; }
                    $pc2 = 38; continue $sw2;
                }
                case 38: {
                    if (r4.equals(r9.tp) == true) { $pc2 = 40; continue $sw2; }
                    return false;
                }
                case 31: {
                    return false;
                }
                case 30: {
                    if (r9.v5 == null) { $pc2 = 32; continue $sw2; }
                    $pc2 = 23; continue $sw2;
                }
                case 23: {
                    return false;
                }
                case 22: {
                    if (r9.DW == null) { $pc2 = 24; continue $sw2; }
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    return false;
                }
                case 14: {
                    if (r9.FH == null) { $pc2 = 16; continue $sw2; }
                    { $pc2 = 15; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        java.lang.String r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.String r4 = null;
        int r5 = 0;
        int r6 = 0;
        java.util.HashMap<java.lang.String, tv.ouya.console.api.store.AppDescription.a> r7 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.DW;
                    r1 = 0;
                    if (r0 == null) { $pc3 = 5; continue $sw3; }
                    r2 = r0.hashCode();
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    r3 = r2 * 31;
                    r4 = this.FH;
                    if (r4 == null) { $pc3 = 9; continue $sw3; }
                    r5 = r4.hashCode();
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    r6 = (r3 + r5) * 31;
                    r7 = this.Hw;
                    if (r7 == null) { $pc3 = 14; continue $sw3; }
                    r1 = r7.hashCode();
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    return r6 + r1;
                }
                case 9: {
                    r5 = 0;
                    { $pc3 = 10; continue $sw3; }
                }
                case 5: {
                    r2 = 0;
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return "AppDescription{title='" + this.FH + "', uuid='" + this.DW + "', versions=" + this.Hw + '}';
    }

    @Override
    public void writeToParcel(android.os.Parcel r3, int r4) {
        int r0 = 0;
        tv.ouya.console.api.Product r1 = null;
        java.util.HashMap<java.lang.String, tv.ouya.console.api.store.AppDescription.a> r5 = null;
        java.util.Iterator<java.lang.String> r6 = null;
        java.lang.String r2 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r3.writeString(this.DW);
                    r3.writeString(this.FH);
                    r3.writeString(this.v5);
                    if (this.tp == null) { $pc4 = 5; continue $sw4; }
                    r0 = 1;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    r3.writeInt(r0);
                    r1 = this.tp;
                    if (r1 == null) { $pc4 = 9; continue $sw4; }
                    r1.writeToParcel(r3, r4);
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    r5 = this.Hw;
                    if (r5 != null) { $pc4 = 12; continue $sw4; }
                    r3.writeInt(-1);
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    r3.writeDouble(this.Zo);
                    r3.writeInt(this.VH);
                    r3.writeByte(this.gn ? 1 : 0);
                    r3.writeByte(this.u7 ? 1 : 0);
                    r3.writeString(this.EQ);
                    return;
                }
                case 12: {
                    r3.writeInt(r5.size());
                    r6 = this.Hw.keySet().iterator();
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    if (r6.hasNext() == false) { $pc4 = 16; continue $sw4; }
                    r2 = r6.next();
                    r3.writeString(r2);
                    r3.writeString(this.Hw.get(r2).Hw());
                    r3.writeString(this.Hw.get(r2).FH());
                    r3.writeString(this.Hw.get(r2).DW());
                    r3.writeString(this.Hw.get(r2).j6());
                    { $pc4 = 14; continue $sw4; }
                }
                case 5: {
                    r0 = 0;
                    { $pc4 = 6; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
