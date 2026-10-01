package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

public class BoundedInputStream extends InputStream {

    private final InputStream f5383in;
    private long mark;

    private final long f5384max;

    private long f5385pos;
    private boolean propagateClose;

    public BoundedInputStream(InputStream inputStream) {
        this(inputStream, -1L);
    }

    public BoundedInputStream(InputStream inputStream, long j) {
        this.f5385pos = 0L;
        this.mark = -1L;
        this.propagateClose = true;
        this.f5384max = j;
        this.f5383in = inputStream;
    }

    @Override
    public int available() throws IOException {
        if (this.f5384max < 0 || this.f5385pos < this.f5384max) {
            return this.f5383in.available();
        }
        return 0;
    }

    @Override
    public void close() throws IOException {
        if (this.propagateClose) {
            this.f5383in.close();
        }
    }

    public boolean isPropagateClose() {
        return this.propagateClose;
    }

    @Override
    public void mark(int i) {
        synchronized (this) {
            this.f5383in.mark(i);
            this.mark = this.f5385pos;
        }
    }

    @Override
    public boolean markSupported() {
        return this.f5383in.markSupported();
    }

    @Override
    public int read() throws IOException {
        if (this.f5384max >= 0 && this.f5385pos >= this.f5384max) {
            return -1;
        }
        int i = this.f5383in.read();
        this.f5385pos++;
        return i;
    }

    @Override
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f5384max >= 0 && this.f5385pos >= this.f5384max) {
            return -1;
        }
        int i3 = this.f5383in.read(bArr, i, (int) (this.f5384max >= 0 ? Math.min(i2, this.f5384max - this.f5385pos) : i2));
        if (i3 == -1) {
            return -1;
        }
        this.f5385pos += (long) i3;
        return i3;
    }

    @Override
    public void reset() throws IOException {
        synchronized (this) {
            this.f5383in.reset();
            this.f5385pos = this.mark;
        }
    }

    public void setPropagateClose(boolean z) {
        this.propagateClose = z;
    }

    @Override
    public long skip(long j) throws IOException {
        if (this.f5384max >= 0) {
            j = Math.min(j, this.f5384max - this.f5385pos);
        }
        long jSkip = this.f5383in.skip(j);
        this.f5385pos += jSkip;
        return jSkip;
    }

    public String toString() {
        return this.f5383in.toString();
    }
}
