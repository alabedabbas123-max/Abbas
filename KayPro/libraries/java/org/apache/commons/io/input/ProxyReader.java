package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

public abstract class ProxyReader extends FilterReader {
    public ProxyReader(Reader reader) {
        super(reader);
    }

    protected void afterRead(int i) throws IOException {
    }

    protected void beforeRead(int i) throws IOException {
    }

    @Override
    public void close() throws IOException {
        try {
            this.in.close();
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    protected void handleIOException(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override
    public void mark(int i) throws IOException {
        synchronized (this) {
            try {
                this.in.mark(i);
            } catch (IOException e) {
                handleIOException(e);
            }
        }
    }

    @Override
    public boolean markSupported() {
        return this.in.markSupported();
    }

    @Override
    public int read() throws IOException {
        try {
            beforeRead(1);
            int i = this.in.read();
            afterRead(i == -1 ? -1 : 1);
            return i;
        } catch (IOException e) {
            handleIOException(e);
            return -1;
        }
    }

    @Override
    public int read(CharBuffer charBuffer) throws IOException {
        int length;
        if (charBuffer != null) {
            try {
                length = charBuffer.length();
            } catch (IOException e) {
                handleIOException(e);
                return -1;
            }
        } else {
            length = 0;
        }
        beforeRead(length);
        int i = this.in.read(charBuffer);
        afterRead(i);
        return i;
    }

    @Override
    public int read(char[] cArr) throws IOException {
        int length;
        if (cArr != null) {
            try {
                length = cArr.length;
            } catch (IOException e) {
                handleIOException(e);
                return -1;
            }
        } else {
            length = 0;
        }
        beforeRead(length);
        int i = this.in.read(cArr);
        afterRead(i);
        return i;
    }

    @Override
    public int read(char[] cArr, int i, int i2) throws IOException {
        try {
            beforeRead(i2);
            int i3 = this.in.read(cArr, i, i2);
            afterRead(i3);
            return i3;
        } catch (IOException e) {
            handleIOException(e);
            return -1;
        }
    }

    @Override
    public boolean ready() throws IOException {
        try {
            return this.in.ready();
        } catch (IOException e) {
            handleIOException(e);
            return false;
        }
    }

    @Override
    public void reset() throws IOException {
        synchronized (this) {
            try {
                this.in.reset();
            } catch (IOException e) {
                handleIOException(e);
            }
        }
    }

    @Override
    public long skip(long j) throws IOException {
        try {
            return this.in.skip(j);
        } catch (IOException e) {
            handleIOException(e);
            return 0L;
        }
    }
}
