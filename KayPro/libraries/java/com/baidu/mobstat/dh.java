package com.baidu.mobstat;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

public class dh {

    static final boolean f4479a;

    private static final byte[] f4480b;

    private static final byte[] f4481c;

    private static final byte[] f4482d;

    private static final byte[] f4483e;

    private static final byte[] f4484f;

    private static final byte[] f4485g;

    static {
        f4479a = !dh.class.desiredAssertionStatus();
        f4480b = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f4481c = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
        f4482d = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f4483e = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
        f4484f = new byte[]{45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
        f4485g = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    }

    private static final byte[] m6730b(int i) {
        if ((i & 16) == 16) {
            return f4482d;
        }
        if ((i & 32) == 32) {
            return f4484f;
        }
        return f4480b;
    }

    public static final byte[] m6733c(int i) {
        if ((i & 16) == 16) {
            return f4483e;
        }
        if ((i & 32) == 32) {
            return f4485g;
        }
        return f4481c;
    }

    private dh() {
    }

    public static byte[] m6732b(byte[] bArr, byte[] bArr2, int i, int i2) {
        m6727a(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static byte[] m6727a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] bArrM6730b = m6730b(i4);
        int i5 = (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0);
        switch (i2) {
            case 1:
                bArr2[i3] = bArrM6730b[i5 >>> 18];
                bArr2[i3 + 1] = bArrM6730b[(i5 >>> 12) & 63];
                bArr2[i3 + 2] = 61;
                bArr2[i3 + 3] = 61;
                return bArr2;
            case 2:
                bArr2[i3] = bArrM6730b[i5 >>> 18];
                bArr2[i3 + 1] = bArrM6730b[(i5 >>> 12) & 63];
                bArr2[i3 + 2] = bArrM6730b[(i5 >>> 6) & 63];
                bArr2[i3 + 3] = 61;
                return bArr2;
            case 3:
                bArr2[i3] = bArrM6730b[i5 >>> 18];
                bArr2[i3 + 1] = bArrM6730b[(i5 >>> 12) & 63];
                bArr2[i3 + 2] = bArrM6730b[(i5 >>> 6) & 63];
                bArr2[i3 + 3] = bArrM6730b[i5 & 63];
                return bArr2;
            default:
                return bArr2;
        }
    }

    public static String m6724a(byte[] bArr) throws Throwable {
        String strM6725a = null;
        try {
            strM6725a = m6725a(bArr, 0, bArr.length, 0);
        } catch (IOException e) {
            if (!f4479a) {
                throw new AssertionError(e.getMessage());
            }
        }
        if (f4479a || strM6725a != null) {
            return strM6725a;
        }
        throw new AssertionError();
    }

    public static String m6725a(byte[] bArr, int i, int i2, int i3) throws Throwable {
        byte[] bArrM6731b = m6731b(bArr, i, i2, i3);
        try {
            return new String(bArrM6731b, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            return new String(bArrM6731b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.baidu.mobstat.dh$a] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.baidu.mobstat.dh$a, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    public static byte[] m6731b(byte[] bArr, int i, int i2, int i3) throws Throwable {
        ?? r2 = 3;
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i2);
        }
        int i4 = i + i2;
        ?? length = bArr.length;
        if (i4 > length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
        }
        ?? aVar = i3 & 2;
        try {
            if (aVar == 0) {
                boolean z = (i3 & 8) != 0;
                int i5 = (i2 % 3 > 0 ? 4 : 0) + ((i2 / 3) * 4);
                if (z) {
                    i5 += i5 / 76;
                }
                byte[] bArr2 = new byte[i5];
                int i6 = i2 - 2;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i9 < i6) {
                    m6727a(bArr, i9 + i, 3, bArr2, i8, i3);
                    int i10 = i7 + 4;
                    if (z && i10 >= 76) {
                        bArr2[i8 + 4] = 10;
                        i8++;
                        i10 = 0;
                    }
                    i8 += 4;
                    i7 = i10;
                    i9 += 3;
                }
                if (i9 < i2) {
                    m6727a(bArr, i9 + i, i2 - i9, bArr2, i8, i3);
                    i8 += 4;
                }
                if (i8 > bArr2.length - 1) {
                    return bArr2;
                }
                byte[] bArr3 = new byte[i8];
                System.arraycopy(bArr2, 0, bArr3, 0, i8);
                return bArr3;
            }
            try {
                length = new ByteArrayOutputStream();
                try {
                    aVar = new a(length, i3 | 1);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(aVar);
                        try {
                            gZIPOutputStream.write(bArr, i, i2);
                            gZIPOutputStream.close();
                            try {
                                gZIPOutputStream.close();
                            } catch (Exception e) {
                            }
                            try {
                                aVar.close();
                            } catch (Exception e2) {
                            }
                            try {
                                length.close();
                            } catch (Exception e3) {
                            }
                            return length.toByteArray();
                        } catch (IOException e4) {
                            throw e4;
                        }
                    } catch (IOException e5) {
                        throw e5;
                    } catch (Throwable th) {
                        th = th;
                        r2 = 0;
                        try {
                            r2.close();
                        } catch (Exception e6) {
                        }
                        try {
                            aVar.close();
                        } catch (Exception e7) {
                        }
                        try {
                            length.close();
                            throw th;
                        } catch (Exception e8) {
                            throw th;
                        }
                    }
                } catch (IOException e9) {
                    throw e9;
                } catch (Throwable th2) {
                    th = th2;
                    aVar = 0;
                    r2 = 0;
                }
            } catch (IOException e10) {
                throw e10;
            } catch (Throwable th3) {
                th = th3;
                aVar = 0;
                r2 = 0;
                length = 0;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static int m6729b(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new NullPointerException("Destination array was null.");
        }
        if (i < 0 || i + 3 >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i)));
        }
        if (i2 < 0 || i2 + 2 >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i2)));
        }
        byte[] bArrM6733c = m6733c(i3);
        if (bArr[i + 2] == 61) {
            bArr2[i2] = (byte) ((((bArrM6733c[bArr[i]] & 255) << 18) | ((bArrM6733c[bArr[i + 1]] & 255) << 12)) >>> 16);
            return 1;
        }
        if (bArr[i + 3] == 61) {
            int i4 = ((bArrM6733c[bArr[i]] & 255) << 18) | ((bArrM6733c[bArr[i + 1]] & 255) << 12) | ((bArrM6733c[bArr[i + 2]] & 255) << 6);
            bArr2[i2] = (byte) (i4 >>> 16);
            bArr2[i2 + 1] = (byte) (i4 >>> 8);
            return 2;
        }
        int i5 = ((bArrM6733c[bArr[i]] & 255) << 18) | ((bArrM6733c[bArr[i + 1]] & 255) << 12) | ((bArrM6733c[bArr[i + 2]] & 255) << 6) | (bArrM6733c[bArr[i + 3]] & 255);
        bArr2[i2] = (byte) (i5 >> 16);
        bArr2[i2 + 1] = (byte) (i5 >> 8);
        bArr2[i2 + 2] = (byte) i5;
        return 3;
    }

    public static class a extends FilterOutputStream {

        private boolean f4486a;

        private int f4487b;

        private byte[] f4488c;

        private int f4489d;

        private int f4490e;

        private boolean f4491f;

        private byte[] f4492g;

        private boolean f4493h;

        private int f4494i;

        private byte[] f4495j;

        public a(OutputStream outputStream, int i) {
            super(outputStream);
            this.f4491f = (i & 8) != 0;
            this.f4486a = (i & 1) != 0;
            this.f4489d = this.f4486a ? 3 : 4;
            this.f4488c = new byte[this.f4489d];
            this.f4487b = 0;
            this.f4490e = 0;
            this.f4493h = false;
            this.f4492g = new byte[4];
            this.f4494i = i;
            this.f4495j = dh.m6733c(i);
        }

        @Override
        public void write(int i) throws IOException {
            if (this.f4493h) {
                this.out.write(i);
                return;
            }
            if (this.f4486a) {
                byte[] bArr = this.f4488c;
                int i2 = this.f4487b;
                this.f4487b = i2 + 1;
                bArr[i2] = (byte) i;
                if (this.f4487b >= this.f4489d) {
                    this.out.write(dh.m6732b(this.f4492g, this.f4488c, this.f4489d, this.f4494i));
                    this.f4490e += 4;
                    if (this.f4491f && this.f4490e >= 76) {
                        this.out.write(10);
                        this.f4490e = 0;
                    }
                    this.f4487b = 0;
                    return;
                }
                return;
            }
            if (this.f4495j[i & 127] > -5) {
                byte[] bArr2 = this.f4488c;
                int i3 = this.f4487b;
                this.f4487b = i3 + 1;
                bArr2[i3] = (byte) i;
                if (this.f4487b >= this.f4489d) {
                    this.out.write(this.f4492g, 0, dh.m6729b(this.f4488c, 0, this.f4492g, 0, this.f4494i));
                    this.f4487b = 0;
                    return;
                }
                return;
            }
            if (this.f4495j[i & 127] != -5) {
                throw new IOException("Invalid character in Base64 data.");
            }
        }

        @Override
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.f4493h) {
                this.out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }

        public void m6734a() throws IOException {
            if (this.f4487b > 0) {
                if (this.f4486a) {
                    this.out.write(dh.m6732b(this.f4492g, this.f4488c, this.f4487b, this.f4494i));
                    this.f4487b = 0;
                    return;
                }
                throw new IOException("Base64 input not properly padded.");
            }
        }

        @Override
        public void close() throws IOException {
            m6734a();
            super.close();
            this.f4488c = null;
            this.out = null;
        }
    }
}
