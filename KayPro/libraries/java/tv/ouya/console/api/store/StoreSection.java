package tv.ouya.console.api.store;

public class StoreSection implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<tv.ouya.console.api.store.StoreSection> CREATOR = null;
    private tv.ouya.console.api.store.StoreSection.a DW;
    private java.util.List<tv.ouya.console.api.store.StoreSection> FH;
    private java.lang.String j6;

    public static final enum a extends java.lang.Enum<tv.ouya.console.api.store.StoreSection.a> {
        public static final tv.ouya.console.api.store.StoreSection.a DW = null;
        private static final tv.ouya.console.api.store.StoreSection.a[] FH = null;
        public static final tv.ouya.console.api.store.StoreSection.a j6 = null;

        static {
            j6 = new tv.ouya.console.api.store.StoreSection.a("TAG", 0);
            DW = new tv.ouya.console.api.store.StoreSection.a("LIST", 1);
            FH = new tv.ouya.console.api.store.StoreSection.a[]{j6, DW};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static tv.ouya.console.api.store.StoreSection.a valueOf(java.lang.String r1) {
            return (tv.ouya.console.api.store.StoreSection.a) java.lang.Enum.valueOf(tv.ouya.console.api.store.StoreSection.a.class, r1);
        }

        public static tv.ouya.console.api.store.StoreSection.a[] values() {
            return (tv.ouya.console.api.store.StoreSection.a[]) FH.clone();
        }
    }

    static {
        CREATOR = new tv.ouya.console.api.store.c();
    }

    public StoreSection() {
    }

    public StoreSection(java.lang.String r1, java.lang.String r2, java.util.List<tv.ouya.console.api.store.StoreSection> r3) {
        this.j6 = r1;
        this.DW = tv.ouya.console.api.store.StoreSection.a.valueOf(r2.toUpperCase());
        this.FH = r3;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof tv.ouya.console.api.store.StoreSection) == true) goto L8;
        return false;
    L8:
        tv.ouya.console.api.store.StoreSection r6 = (tv.ouya.console.api.store.StoreSection) r5;
        if (this.j6.equals(r6.j6) == true) goto L12;
        return false;
    L12:
        if (this.DW.equals(r6.DW) == true) goto L15;
        return false;
    L15:
        if (this.FH.equals(r6.FH) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.j6.hashCode() * 31) + this.DW.hashCode()) * 31) + this.FH.hashCode();
    }

    @Override
    public void writeToParcel(android.os.Parcel r3, int r4) {
        r3.writeString(this.j6);
        r3.writeString(this.DW.name().toUpperCase());
        r3.writeInt(this.FH.size());
        int r0 = 0;
    L4:
        if (r0 >= this.FH.size()) goto L6;
        this.FH.get(r0).writeToParcel(r3, r4);
        r0 = r0 + 1;
        goto L4
    }
}
