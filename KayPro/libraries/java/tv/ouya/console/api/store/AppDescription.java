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
            if (this != r5) goto L6;
            return true;
        L6:
            if (r5 != null) goto L8;
        L43:
            return false;
        L8:
            if (tv.ouya.console.api.store.AppDescription.a.class != r5.getClass()) goto L43;
            tv.ouya.console.api.store.AppDescription.a r6 = (tv.ouya.console.api.store.AppDescription.a) r5;
            java.lang.String r2 = this.FH;
            if (r2 == null) goto L16;
            if (r2.equals(r6.FH) == false) goto L17;
        L18:
            java.lang.String r3 = this.DW;
            if (r3 == null) goto L24;
            if (r3.equals(r6.DW) == false) goto L25;
        L26:
            java.lang.String r4 = this.Hw;
            if (r4 == null) goto L32;
            if (r4.equals(r6.Hw) == false) goto L33;
        L34:
            java.lang.String r7 = this.v5;
            if (r7 == null) goto L40;
            if (r7.equals(r6.v5) == false) goto L41;
        L42:
            return true;
        L41:
            return false;
        L40:
            if (r6.v5 == null) goto L42;
        L33:
            return false;
        L32:
            if (r6.Hw == null) goto L34;
        L25:
            return false;
        L24:
            if (r6.DW == null) goto L26;
        L17:
            return false;
        L16:
            if (r6.FH == null) goto L18;
            goto L17
        }

        public int hashCode() {
            java.lang.String r0 = this.DW;
            int r1 = 0;
            if (r0 == null) goto L5;
            int r2 = r0.hashCode();
        L6:
            int r3 = r2 * 31;
            java.lang.String r4 = this.FH;
            if (r4 == null) goto L9;
            int r5 = r4.hashCode();
        L10:
            int r6 = (r3 + r5) * 31;
            java.lang.String r7 = this.Hw;
            if (r7 == null) goto L13;
            int r8 = r7.hashCode();
        L14:
            int r9 = (r6 + r8) * 31;
            java.lang.String r10 = this.v5;
            if (r10 == null) goto L18;
            r1 = r10.hashCode();
        L18:
            return r9 + r1;
        L13:
            r8 = 0;
            goto L14
        L9:
            r5 = 0;
            goto L10
        L5:
            r2 = 0;
            goto L6
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
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof tv.ouya.console.api.store.AppDescription) == true) goto L8;
        return false;
    L8:
        tv.ouya.console.api.store.AppDescription r9 = (tv.ouya.console.api.store.AppDescription) r8;
        java.lang.String r1 = this.FH;
        if (r1 == null) goto L14;
        if (r1.equals(r9.FH) == false) goto L15;
    L16:
        java.lang.String r2 = this.DW;
        if (r2 == null) goto L22;
        if (r2.equals(r9.DW) == false) goto L23;
    L24:
        java.lang.String r3 = this.v5;
        if (r3 == null) goto L30;
        if (r3.equals(r9.v5) == false) goto L31;
    L32:
        tv.ouya.console.api.Product r4 = this.tp;
        if (r4 != null) goto L38;
        if (r9.tp == null) goto L40;
        return false;
    L40:
        java.util.HashMap<java.lang.String, tv.ouya.console.api.store.AppDescription.a> r5 = this.Hw;
        if (r5 == null) goto L46;
        if (r5.equals(r9.Hw) == true) goto L49;
    L47:
        return false;
    L49:
        if (this.Zo == r9.Zo) goto L52;
        return false;
    L52:
        if (this.VH == r9.VH) goto L55;
        return false;
    L55:
        if (this.gn == r9.gn) goto L58;
        return false;
    L58:
        if (this.u7 == r9.u7) goto L60;
        return false;
    L60:
        java.lang.String r6 = this.EQ;
        if (r6 != null) goto L63;
    L65:
        return true;
    L63:
        if (r6.equals(r9.EQ) == true) goto L65;
        return false;
    L46:
        if (r9.Hw == null) goto L49;
    L38:
        if (r4.equals(r9.tp) == true) goto L40;
        return false;
    L31:
        return false;
    L30:
        if (r9.v5 == null) goto L32;
    L23:
        return false;
    L22:
        if (r9.DW == null) goto L24;
    L15:
        return false;
    L14:
        if (r9.FH == null) goto L16;
        goto L15
    }

    public int hashCode() {
        java.lang.String r0 = this.DW;
        int r1 = 0;
        if (r0 == null) goto L5;
        int r2 = r0.hashCode();
    L6:
        int r3 = r2 * 31;
        java.lang.String r4 = this.FH;
        if (r4 == null) goto L9;
        int r5 = r4.hashCode();
    L10:
        int r6 = (r3 + r5) * 31;
        java.util.HashMap<java.lang.String, tv.ouya.console.api.store.AppDescription.a> r7 = this.Hw;
        if (r7 == null) goto L14;
        r1 = r7.hashCode();
    L14:
        return r6 + r1;
    L9:
        r5 = 0;
        goto L10
    L5:
        r2 = 0;
        goto L6
    }

    public java.lang.String toString() {
        return "AppDescription{title='" + this.FH + "', uuid='" + this.DW + "', versions=" + this.Hw + '}';
    }

    @Override
    public void writeToParcel(android.os.Parcel r3, int r4) {
        r3.writeString(this.DW);
        r3.writeString(this.FH);
        r3.writeString(this.v5);
        if (this.tp == null) goto L5;
        int r0 = 1;
    L6:
        r3.writeInt(r0);
        tv.ouya.console.api.Product r1 = this.tp;
        if (r1 == null) goto L9;
        r1.writeToParcel(r3, r4);
    L9:
        java.util.HashMap<java.lang.String, tv.ouya.console.api.store.AppDescription.a> r5 = this.Hw;
        if (r5 != null) goto L12;
        r3.writeInt(-1);
    L16:
        r3.writeDouble(this.Zo);
        r3.writeInt(this.VH);
        r3.writeByte(this.gn ? 1 : 0);
        r3.writeByte(this.u7 ? 1 : 0);
        r3.writeString(this.EQ);
        return;
    L12:
        r3.writeInt(r5.size());
        java.util.Iterator<java.lang.String> r6 = this.Hw.keySet().iterator();
    L14:
        if (r6.hasNext() == false) goto L16;
        java.lang.String r2 = r6.next();
        r3.writeString(r2);
        r3.writeString(this.Hw.get(r2).Hw());
        r3.writeString(this.Hw.get(r2).FH());
        r3.writeString(this.Hw.get(r2).DW());
        r3.writeString(this.Hw.get(r2).j6());
        goto L14
    L5:
        r0 = 0;
        goto L6
    }
}
