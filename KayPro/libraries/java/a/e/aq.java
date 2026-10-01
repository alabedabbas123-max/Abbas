package a.e;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

class aq extends ByteArrayOutputStream {

    final ao f633a;

    private CRC32 f634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private aq(ao c0259ao) {
        super(16384);
        this.f633a = c0259ao;
        this.f634b = new CRC32();
    }

    @Override
    public void close() throws IOException {
        super.close();
        byte[] byteArray = super.toByteArray();
        this.f633a.f627g = this.f633a.f621a.f615a.size();
        this.f633a.f624d = (int) this.f634b.getValue();
        this.f633a.f625e = byteArray.length;
        this.f633a.f626f = byteArray.length;
        this.f633a.m1745c();
        this.f633a.f621a.f615a.write(byteArray);
    }

    @Override
    public void write(int i) {
        super.write(i);
        this.f634b.update(i);
    }

    @Override
    public void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
        this.f634b.update(bArr, i, i2);
    }
}
