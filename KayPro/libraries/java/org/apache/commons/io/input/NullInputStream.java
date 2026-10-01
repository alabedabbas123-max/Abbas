package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class NullInputStream extends InputStream {

    private boolean f5388eof;
    private long mark;
    private final boolean markSupported;
    private long position;
    private long readlimit;
    private final long size;
    private final boolean throwEofException;

    public NullInputStream(long j) {
        this(j, true, false);
    }

    public NullInputStream(long j, boolean z, boolean z2) {
        this.mark = -1L;
        this.size = j;
        this.markSupported = z;
        this.throwEofException = z2;
    }

    private int doEndOfFile() throws EOFException {
        this.f5388eof = true;
        if (this.throwEofException) {
            throw new EOFException();
        }
        return -1;
    }

    @Override
    public int available() {
        long j = this.size - this.position;
        if (j <= 0) {
            return 0;
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    @Override
    public void close() throws IOException {
        this.f5388eof = false;
        this.position = 0L;
        this.mark = -1L;
    }

    public long getPosition() {
        return this.position;
    }

    public long getSize() {
        return this.size;
    }

    @Override
    public void mark(int i) {
        synchronized (this) {
            if (!this.markSupported) {
                throw new UnsupportedOperationException("Mark not supported");
            }
            this.mark = this.position;
            this.readlimit = i;
        }
    }

    @Override
    public boolean markSupported() {
        return this.markSupported;
    }

    protected int processByte() {
        return 0;
    }

    protected void processBytes(byte[] bArr, int i, int i2) {
    }

    @Override
    public int read() throws IOException {
        if (this.f5388eof) {
            throw new IOException("Read after end of file");
        }
        if (this.position == this.size) {
            return doEndOfFile();
        }
        this.position++;
        return processByte();
    }

    @Override
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f5388eof) {
            throw new IOException("Read after end of file");
        }
        if (this.position == this.size) {
            return doEndOfFile();
        }
        this.position += (long) i2;
        if (this.position > this.size) {
            i3 = i2 - ((int) (this.position - this.size));
            this.position = this.size;
        } else {
            i3 = i2;
        }
        processBytes(bArr, i, i3);
        return i3;
    }

    @Override
    public void reset() throws IOException {
        synchronized (this) {
            if (!this.markSupported) {
                throw new UnsupportedOperationException("Mark not supported");
            }
            if (this.mark < 0) {
                throw new IOException("No position has been marked");
            }
            if (this.position > this.mark + this.readlimit) {
                throw new IOException("Marked position [" + this.mark + "] is no longer valid - passed the read limit [" + this.readlimit + "]");
            }
            this.position = this.mark;
            this.f5388eof = false;
        }
    }

    @Override
    public long skip(long j) throws IOException {
        if (this.f5388eof) {
            throw new IOException("Skip after end of file");
        }
        if (this.position == this.size) {
            return doEndOfFile();
        }
        this.position += j;
        if (this.position <= this.size) {
            return j;
        }
        long j2 = j - (this.position - this.size);
        this.position = this.size;
        return j2;
    }
}
