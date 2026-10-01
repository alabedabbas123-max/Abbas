package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

public class MagicNumberFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -547733176983104172L;
    private final long byteOffset;
    private final byte[] magicNumbers;

    public MagicNumberFileFilter(String str) {
        this(str, 0L);
    }

    public MagicNumberFileFilter(String str, long j) {
        if (str == null) {
            throw new IllegalArgumentException("The magic number cannot be null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (j < 0) {
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        this.magicNumbers = str.getBytes(Charset.defaultCharset());
        this.byteOffset = j;
    }

    public MagicNumberFileFilter(byte[] bArr) {
        this(bArr, 0L);
    }

    public MagicNumberFileFilter(byte[] bArr, long j) {
        if (bArr == null) {
            throw new IllegalArgumentException("The magic number cannot be null");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (j < 0) {
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        this.magicNumbers = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.magicNumbers, 0, bArr.length);
        this.byteOffset = j;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[Catch: IOException -> 0x0049, TRY_LEAVE, TryCatch #1 {IOException -> 0x0049, blocks: (B:8:0x000f, B:13:0x002c, B:17:0x0038, B:25:0x0045, B:31:0x0050, B:30:0x004c, B:26:0x0048), top: B:37:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override
    public boolean accept(File file) throws Throwable {
        Throwable th;
        if (file == null || !file.isFile() || !file.canRead()) {
            return false;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            Throwable th2 = null;
            try {
                byte[] bArr = new byte[this.magicNumbers.length];
                randomAccessFile.seek(this.byteOffset);
                if (randomAccessFile.read(bArr) != this.magicNumbers.length) {
                    if (randomAccessFile == null) {
                        return false;
                    }
                    randomAccessFile.close();
                    return false;
                }
                boolean zEquals = Arrays.equals(this.magicNumbers, bArr);
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                return zEquals;
            } catch (Throwable th3) {
                th = th3;
                if (randomAccessFile != null) {
                    if (th2 != null) {
                        randomAccessFile.close();
                    } else {
                        randomAccessFile.close();
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "(" + new String(this.magicNumbers, Charset.defaultCharset()) + "," + this.byteOffset + ")";
    }
}
