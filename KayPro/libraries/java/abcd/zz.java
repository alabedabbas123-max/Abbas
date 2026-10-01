package abcd;

public class zz extends abcd.Az {
    public zz(android.content.Context r1, java.io.File r2, java.lang.String r3, java.lang.String r4) {
        super(r1, r2, r3, r4);
    }

    @Override
    public java.io.OutputStream j6(java.io.File r3) {
        return new java.util.zip.GZIPOutputStream(new java.io.FileOutputStream(r3));
    }
}
