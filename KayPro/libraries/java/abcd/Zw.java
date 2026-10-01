package abcd;

public interface Zw {

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.Zw.a DW = new abcd.Zw.a("APP_FOLDER", 1, "sandbox");
        public static final abcd.Zw.a FH = new abcd.Zw.a("AUTO", 2, "auto");
        private static final abcd.Zw.a[] Hw = new abcd.Zw.a[]{j6, DW, FH};
        public static final abcd.Zw.a j6 = new abcd.Zw.a("DROPBOX", 0, "dropbox");
        private final java.lang.String v5;



        private a(java.lang.String r1, int r2, java.lang.String r3) {
            super(r1, r2);
            this.v5 = r3;
        }

        public static abcd.Zw.a valueOf(java.lang.String r1) {
            return (abcd.Zw.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Zw.a.values(), r1);
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
