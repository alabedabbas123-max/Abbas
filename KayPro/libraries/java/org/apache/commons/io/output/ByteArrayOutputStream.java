package org.apache.commons.io.output;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.input.ClosedInputStream;

public class ByteArrayOutputStream extends OutputStream {
    static final int DEFAULT_SIZE = 1024;
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private final List<byte[]> buffers;
    private int count;
    private byte[] currentBuffer;
    private int currentBufferIndex;
    private int filledBufferSum;
    private boolean reuseBuffers;

    public ByteArrayOutputStream() {
        this(1024);
    }

    public ByteArrayOutputStream(int i) {
        this.buffers = new ArrayList();
        this.reuseBuffers = true;
        if (i < 0) {
            throw new IllegalArgumentException("Negative initial size: " + i);
        }
        synchronized (this) {
            needNewBuffer(i);
        }
    }

    private void needNewBuffer(int i) {
        if (this.currentBufferIndex < this.buffers.size() - 1) {
            this.filledBufferSum += this.currentBuffer.length;
            this.currentBufferIndex++;
            this.currentBuffer = this.buffers.get(this.currentBufferIndex);
            return;
        }
        if (this.currentBuffer == null) {
            this.filledBufferSum = 0;
        } else {
            i = Math.max(this.currentBuffer.length << 1, i - this.filledBufferSum);
            this.filledBufferSum += this.currentBuffer.length;
        }
        this.currentBufferIndex++;
        this.currentBuffer = new byte[i];
        this.buffers.add(this.currentBuffer);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) throws IOException {
        return toBufferedInputStream(inputStream, 1024);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        byteArrayOutputStream.write(inputStream);
        return byteArrayOutputStream.toInputStream();
    }

    @Override
    public void close() throws IOException {
    }

    public void reset() {
        synchronized (this) {
            this.count = 0;
            this.filledBufferSum = 0;
            this.currentBufferIndex = 0;
            if (this.reuseBuffers) {
                this.currentBuffer = this.buffers.get(this.currentBufferIndex);
            } else {
                this.currentBuffer = null;
                int length = this.buffers.get(0).length;
                this.buffers.clear();
                needNewBuffer(length);
                this.reuseBuffers = true;
            }
        }
    }

    public int size() {
        int i;
        synchronized (this) {
            i = this.count;
        }
        return i;
    }

    public byte[] toByteArray() {
        byte[] bArr;
        int i = 0;
        synchronized (this) {
            int i2 = this.count;
            if (i2 == 0) {
                bArr = EMPTY_BYTE_ARRAY;
            } else {
                byte[] bArr2 = new byte[i2];
                Iterator<byte[]> it = this.buffers.iterator();
                while (true) {
                    int i3 = i;
                    if (!it.hasNext()) {
                        break;
                    }
                    byte[] next = it.next();
                    int iMin = Math.min(next.length, i2);
                    System.arraycopy(next, 0, bArr2, i3, iMin);
                    i2 -= iMin;
                    if (i2 == 0) {
                        break;
                    }
                    i = i3 + iMin;
                }
                bArr = bArr2;
            }
        }
        return bArr;
    }

    public InputStream toInputStream() {
        InputStream sequenceInputStream;
        synchronized (this) {
            int i = this.count;
            if (i == 0) {
                sequenceInputStream = new ClosedInputStream();
            } else {
                ArrayList arrayList = new ArrayList(this.buffers.size());
                Iterator<byte[]> it = this.buffers.iterator();
                do {
                    int i2 = i;
                    if (!it.hasNext()) {
                        break;
                    }
                    byte[] next = it.next();
                    int iMin = Math.min(next.length, i2);
                    arrayList.add(new ByteArrayInputStream(next, 0, iMin));
                    i = i2 - iMin;
                } while (i != 0);
                this.reuseBuffers = false;
                sequenceInputStream = new SequenceInputStream(Collections.enumeration(arrayList));
            }
        }
        return sequenceInputStream;
    }

    @Deprecated
    public String toString() {
        return new String(toByteArray(), Charset.defaultCharset());
    }

    public String toString(String str) throws UnsupportedEncodingException {
        return new String(toByteArray(), str);
    }

    public String toString(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public int write(InputStream inputStream) throws IOException {
        int i;
        synchronized (this) {
            int i2 = this.count - this.filledBufferSum;
            i = 0;
            int i3 = inputStream.read(this.currentBuffer, i2, this.currentBuffer.length - i2);
            while (i3 != -1) {
                i += i3;
                int i4 = i2 + i3;
                this.count = i3 + this.count;
                if (i4 == this.currentBuffer.length) {
                    needNewBuffer(this.currentBuffer.length);
                    i4 = 0;
                }
                i3 = inputStream.read(this.currentBuffer, i4, this.currentBuffer.length - i4);
                i2 = i4;
            }
        }
        return i;
    }

    @Override
    public void write(int i) {
        synchronized (this) {
            int i2 = this.count - this.filledBufferSum;
            if (i2 == this.currentBuffer.length) {
                needNewBuffer(this.count + 1);
                i2 = 0;
            }
            this.currentBuffer[i2] = (byte) i;
            this.count++;
        }
    }

    @Override
    public void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i > bArr.length || i2 < 0 || i + i2 > bArr.length || i + i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        synchronized (this) {
            int i3 = this.count + i2;
            int i4 = this.count - this.filledBufferSum;
            int i5 = i2;
            while (i5 > 0) {
                int iMin = Math.min(i5, this.currentBuffer.length - i4);
                System.arraycopy(bArr, (i + i2) - i5, this.currentBuffer, i4, iMin);
                i5 -= iMin;
                if (i5 > 0) {
                    needNewBuffer(i3);
                    i4 = 0;
                }
            }
            this.count = i3;
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        synchronized (this) {
            int i = this.count;
            Iterator<byte[]> it = this.buffers.iterator();
            do {
                int i2 = i;
                if (!it.hasNext()) {
                    break;
                }
                byte[] next = it.next();
                int iMin = Math.min(next.length, i2);
                outputStream.write(next, 0, iMin);
                i = i2 - iMin;
            } while (i != 0);
        }
    }
}
