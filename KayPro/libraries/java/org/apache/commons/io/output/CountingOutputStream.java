package org.apache.commons.io.output;

import java.io.OutputStream;

public class CountingOutputStream extends ProxyOutputStream {
    private long count;

    public CountingOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.count = 0L;
    }

    @Override
    protected void beforeWrite(int i) {
        synchronized (this) {
            this.count += (long) i;
        }
    }

    public long getByteCount() {
        long j;
        synchronized (this) {
            j = this.count;
        }
        return j;
    }

    public int getCount() {
        long byteCount = getByteCount();
        if (byteCount > 2147483647L) {
            throw new ArithmeticException("The byte count " + byteCount + " is too large to be converted to an int");
        }
        return (int) byteCount;
    }

    public long resetByteCount() {
        long j;
        synchronized (this) {
            j = this.count;
            this.count = 0L;
        }
        return j;
    }

    public int resetCount() {
        long jResetByteCount = resetByteCount();
        if (jResetByteCount > 2147483647L) {
            throw new ArithmeticException("The byte count " + jResetByteCount + " is too large to be converted to an int");
        }
        return (int) jResetByteCount;
    }
}
