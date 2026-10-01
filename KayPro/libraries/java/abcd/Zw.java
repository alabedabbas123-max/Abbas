package abcd;

public interface Zw {

    public static final enum a extends java.lang.Enum<abcd.Zw.a> {
        public static final abcd.Zw.a DW = null;
        public static final abcd.Zw.a FH = null;
        private static final abcd.Zw.a[] Hw = null;
        public static final abcd.Zw.a j6 = null;
        private final java.lang.String v5;

        static {
            j6 = new abcd.Zw.a("DROPBOX", 0, "dropbox");
            DW = new abcd.Zw.a("APP_FOLDER", 1, "sandbox");
            FH = new abcd.Zw.a("AUTO", 2, "auto");
            Hw = new abcd.Zw.a[]{j6, DW, FH};
        }

        private a(java.lang.String r1, int r2, java.lang.String r3) {
            super(r1, r2);
            this.v5 = r3;
        }

        public static abcd.Zw.a valueOf(java.lang.String r1) {
            return (abcd.Zw.a) java.lang.Enum.valueOf(abcd.Zw.a.class, r1);
        }

        public static abcd.Zw.a[] values() {
            return (abcd.Zw.a[]) Hw.clone();
        }

        @Override
        public java.lang.String toString() {
            return this.v5;
        }
    }

    public static final class b {
        public final int DW;
        public final java.lang.String j6;
    }

    boolean DW();

    abcd.Zw.a FH();

    java.lang.String Hw();

    java.lang.String Zo();

    java.util.Locale getLocale();

    abcd.Zw.b j6();

    void j6(org.apache.http.HttpRequest r1);

    void j6(org.apache.http.client.methods.HttpUriRequest r1);

    org.apache.http.client.HttpClient v5();
}
