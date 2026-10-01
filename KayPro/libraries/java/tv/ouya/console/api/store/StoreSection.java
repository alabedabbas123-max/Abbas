package tv.ouya.console.api.store;

public class StoreSection implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<tv.ouya.console.api.store.StoreSection> CREATOR = null;
    private tv.ouya.console.api.store.StoreSection.a DW;
    private java.util.List<tv.ouya.console.api.store.StoreSection> FH;
    private java.lang.String j6;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
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
            return (tv.ouya.console.api.store.StoreSection.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(tv.ouya.console.api.store.StoreSection.a.values(), r1);
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
        tv.ouya.console.api.store.StoreSection r6 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this != r5) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    if ((r5 instanceof tv.ouya.console.api.store.StoreSection) == true) { $pc0 = 8; continue $sw0; }
                    return false;
                }
                case 8: {
                    r6 = (tv.ouya.console.api.store.StoreSection) r5;
                    if (this.j6.equals(r6.j6) == true) { $pc0 = 12; continue $sw0; }
                    return false;
                }
                case 12: {
                    if (this.DW.equals(r6.DW) == true) { $pc0 = 15; continue $sw0; }
                    return false;
                }
                case 15: {
                    if (this.FH.equals(r6.FH) == true) { $pc0 = 17; continue $sw0; }
                    return false;
                }
                case 17: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return (((this.j6.hashCode() * 31) + this.DW.hashCode()) * 31) + this.FH.hashCode();
    }

    @Override
    public void writeToParcel(android.os.Parcel r3, int r4) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r3.writeString(this.j6);
                    r3.writeString(this.DW.name().toUpperCase());
                    r3.writeInt(this.FH.size());
                    r0 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0 >= this.FH.size()) { $pc1 = 6; continue $sw1; }
                    this.FH.get(r0).writeToParcel(r3, r4);
                    r0 = r0 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
