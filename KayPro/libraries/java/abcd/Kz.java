package abcd;

public final class Kz {
    public static final javax.net.ssl.SSLSocketFactory j6(abcd.Lz r4) {
        javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance("TLS");
        r0.init(null, new javax.net.ssl.TrustManager[]{new abcd.Mz(new abcd.Nz(r4.DW(), r4.j6()), r4)}, null);
        return r0.getSocketFactory();
    }
}
