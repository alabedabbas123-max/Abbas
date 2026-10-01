package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

public class CountingInputStream extends ProxyInputStream {
    private long count;

    public CountingInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    protected void afterRead(int i) {
        synchronized (this) {
            if (i != -1) {
                this.count += (long) i;
            }
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

    @Override
    public long skip(long j) throws IOException {
        long jSkip;
        synchronized (this) {
            jSkip = super.skip(j);
            this.count += jSkip;
        }
        return jSkip;
    }
}
