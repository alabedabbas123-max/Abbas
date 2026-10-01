package a.e;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

class ap extends DeflaterOutputStream {

    final ao f631a;

    private CRC32 f632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ap(ao c0259ao) {
        super(new ByteArrayOutputStream(16384), new Deflater(9, true), 1024);
        this.f631a = c0259ao;
        this.f632b = new CRC32();
    }

    @Override
    public void close() throws IOException {
        super.finish();
        ((DeflaterOutputStream) this).def.end();
        super.close();
        byte[] byteArray = ((ByteArrayOutputStream) ((DeflaterOutputStream) this).out).toByteArray();
        this.f631a.f627g = this.f631a.f621a.f615a.size();
        this.f631a.f624d = (int) this.f632b.getValue();
        this.f631a.f625e = byteArray.length;
        this.f631a.m1745c();
        this.f631a.f621a.f615a.write(byteArray);
    }

    @Override
    public void write(byte[] bArr, int i, int i2) throws IOException {
        super.write(bArr, i, i2);
        this.f632b.update(bArr, i, i2);
        this.f631a.f626f += (long) i2;
    }
}
