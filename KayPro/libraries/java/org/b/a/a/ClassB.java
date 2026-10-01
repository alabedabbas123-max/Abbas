package org.b.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ClassB {

    private InputStream f5400a;

    private OutputStream f5401b;

    private final int f5402c;

    private final int f5403d;

    private final int f5404e;

    private final byte[] f5405f;

    private int f5406g;

    private int f5407h;

    private boolean f5408i;

    public ClassB(InputStream inputStream, int i, int i2) {
        this(inputStream, null, i, i2);
    }

    private ClassB(InputStream inputStream, OutputStream outputStream, int i, int i2) {
        this.f5400a = inputStream;
        this.f5401b = outputStream;
        this.f5408i = false;
        this.f5402c = i;
        this.f5403d = i2;
        this.f5404e = this.f5402c / this.f5403d;
        this.f5405f = new byte[this.f5402c];
        if (this.f5400a != null) {
            this.f5406g = -1;
            this.f5407h = this.f5404e;
        } else {
            this.f5406g = 0;
            this.f5407h = 0;
        }
    }

    private boolean m7502e() throws IOException {
        if (this.f5408i) {
            System.err.println("ReadBlock: blkIdx = " + this.f5406g);
        }
        if (this.f5400a == null) {
            throw new IOException("reading from an output buffer");
        }
        this.f5407h = 0;
        int i = this.f5402c;
        int i2 = 0;
        while (i > 0) {
            long j = this.f5400a.read(this.f5405f, i2, i);
            if (j == -1) {
                if (i2 == 0) {
                    return false;
                }
                Arrays.fill(this.f5405f, i2, i + i2, (byte) 0);
                break;
            }
            i2 = (int) (((long) i2) + j);
            i = (int) (((long) i) - j);
            if (j != this.f5402c && this.f5408i) {
                System.err.println("ReadBlock: INCOMPLETE READ " + j + " of " + this.f5402c + " bytes read.");
            }
        }
        this.f5406g++;
        return true;
    }

    private void m7503f() throws IOException {
        if (this.f5408i) {
            System.err.println("WriteBlock: blkIdx = " + this.f5406g);
        }
        if (this.f5401b == null) {
            throw new IOException("writing to an input buffer");
        }
        this.f5401b.write(this.f5405f, 0, this.f5402c);
        this.f5401b.flush();
        this.f5407h = 0;
        this.f5406g++;
        Arrays.fill(this.f5405f, (byte) 0);
    }

    public int m7504a() {
        return this.f5403d;
    }

    public boolean m7505a(byte[] bArr) {
        int iM7504a = m7504a();
        for (int i = 0; i < iM7504a; i++) {
            if (bArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public byte[] m7506b() throws IOException {
        if (this.f5408i) {
            System.err.println("ReadRecord: recIdx = " + this.f5407h + " blkIdx = " + this.f5406g);
        }
        if (this.f5400a == null) {
            if (this.f5401b == null) {
                throw new IOException("input buffer is closed");
            }
            throw new IOException("reading from an output buffer");
        }
        if (this.f5407h >= this.f5404e && !m7502e()) {
            return null;
        }
        byte[] bArr = new byte[this.f5403d];
        System.arraycopy(this.f5405f, this.f5407h * this.f5403d, bArr, 0, this.f5403d);
        this.f5407h++;
        return bArr;
    }

    void m7507c() throws IOException {
        if (this.f5408i) {
            System.err.println("TarBuffer.flushBlock() called.");
        }
        if (this.f5401b == null) {
            throw new IOException("writing to an input buffer");
        }
        if (this.f5407h > 0) {
            m7503f();
        }
    }

    public void m7508d() throws IOException {
        if (this.f5408i) {
            System.err.println("TarBuffer.closeBuffer().");
        }
        if (this.f5401b == null) {
            if (this.f5400a != null) {
                if (this.f5400a != System.in) {
                    this.f5400a.close();
                }
                this.f5400a = null;
                return;
            }
            return;
        }
        m7507c();
        if (this.f5401b == System.out || this.f5401b == System.err) {
            return;
        }
        this.f5401b.close();
        this.f5401b = null;
    }
}
