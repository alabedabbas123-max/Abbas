package org.b.a.a;

import com.baidu.mobstat.Config;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.b.a.b.Abstractf;
import org.b.a.b.Interfacee;

public class ClassD extends FilterInputStream {

    protected boolean f5426a;

    protected boolean f5427b;

    protected long f5428c;

    protected long f5429d;

    protected byte[] f5430e;

    protected ClassB f5431f;

    protected ClassC f5432g;

    protected byte[] f5433h;

    private final byte[] f5434i;

    private final byte[] f5435j;

    private final Interfacee f5436k;

    public ClassD(InputStream inputStream) {
        this(inputStream, 10240, 512);
    }

    public ClassD(InputStream inputStream, int i, int i2) {
        this(inputStream, i, i2, null);
    }

    public ClassD(InputStream inputStream, int i, int i2, String str) {
        super(inputStream);
        this.f5434i = new byte[8192];
        this.f5435j = new byte[256];
        this.f5431f = new ClassB(inputStream, i, i2);
        this.f5430e = null;
        this.f5433h = new byte[1];
        this.f5426a = false;
        this.f5427b = false;
        this.f5436k = Abstractf.m7557a(str);
    }

    private void m7538a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (Config.FEED_LIST_ITEM_PATH.equals(str)) {
                this.f5432g.m7517a(str2);
            } else if ("linkpath".equals(str)) {
                this.f5432g.m7523b(str2);
            } else if ("gid".equals(str)) {
                this.f5432g.m7522b(Long.parseLong(str2));
            } else if ("gname".equals(str)) {
                this.f5432g.m7529d(str2);
            } else if (Config.CUSTOM_USER_ID.equals(str)) {
                this.f5432g.m7516a(Long.parseLong(str2));
            } else if ("uname".equals(str)) {
                this.f5432g.m7526c(str2);
            } else if ("size".equals(str)) {
                this.f5432g.m7528d(Long.parseLong(str2));
            } else if ("mtime".equals(str)) {
                this.f5432g.m7525c((long) (Double.parseDouble(str2) * 1000.0d));
            } else if ("SCHILY.devminor".equals(str)) {
                this.f5432g.m7521b(Integer.parseInt(str2));
            } else if ("SCHILY.devmajor".equals(str)) {
                this.f5432g.m7515a(Integer.parseInt(str2));
            }
        }
    }

    private byte[] m7539c() throws IOException {
        if (this.f5427b) {
            return null;
        }
        byte[] bArrM7506b = this.f5431f.m7506b();
        if (bArrM7506b == null) {
            if (this.f5426a) {
                System.err.println("READ NULL RECORD");
            }
            this.f5427b = true;
        } else if (this.f5431f.m7505a(bArrM7506b)) {
            if (this.f5426a) {
                System.err.println("READ EOF RECORD");
            }
            this.f5427b = true;
        }
        if (this.f5427b) {
            return null;
        }
        return bArrM7506b;
    }

    private void m7540d() throws IOException {
        Map mapM7543a = m7543a(this);
        m7544a();
        m7538a(mapM7543a);
    }

    private void m7541e() throws IOException {
        byte[] bArrM7539c;
        if (this.f5432g.m7530e()) {
            do {
                bArrM7539c = m7539c();
                if (this.f5427b) {
                    this.f5432g = null;
                    return;
                }
            } while (new ClassA(bArrM7539c).m7501a());
        }
    }

    private boolean m7542f() {
        return this.f5432g != null && this.f5432g.m7535j();
    }

    Map m7543a(InputStream inputStream) throws IOException {
        int i;
        HashMap map = new HashMap();
        do {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = inputStream.read();
                if (i4 == -1) {
                    i = i4;
                    break;
                }
                i2++;
                if (i4 == 32) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i5 = inputStream.read();
                        if (i5 == -1) {
                            i = i5;
                            break;
                        }
                        i2++;
                        if (i5 == 61) {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            int i6 = i3 - i2;
                            byte[] bArr = new byte[i6];
                            int i7 = 0;
                            i = i5;
                            while (i7 < i6) {
                                i = inputStream.read();
                                if (i == -1) {
                                    break;
                                }
                                bArr[i7] = (byte) i;
                                i7++;
                            }
                            if (i7 == i6) {
                                map.put(string, new String(bArr, 0, i6 - 1, "UTF-8"));
                                break;
                            }
                            throw new IOException("Failed to read Paxheader. Expected " + i6 + " bytes, read " + i7);
                        }
                        byteArrayOutputStream.write((byte) i5);
                    }
                } else {
                    i3 = (i3 * 10) + (i4 - 48);
                }
            }
        } while (i != -1);
        return map;
    }

    public ClassC m7544a() throws IOException {
        if (this.f5427b) {
            return null;
        }
        if (this.f5432g != null) {
            long j = this.f5428c - this.f5429d;
            if (this.f5426a) {
                System.err.println("TarInputStream: SKIP currENTRY '" + this.f5432g.m7514a() + "' SZ " + this.f5428c + " OFF " + this.f5429d + "  skipping " + j + " bytes");
            }
            while (j > 0) {
                long jSkip = skip(j);
                if (jSkip <= 0) {
                    throw new IOException("failed to skip current tar entry");
                }
                j -= jSkip;
            }
            this.f5430e = null;
        }
        byte[] bArrM7539c = m7539c();
        if (this.f5427b) {
            this.f5432g = null;
            return null;
        }
        try {
            this.f5432g = new ClassC(bArrM7539c, this.f5436k);
            if (this.f5426a) {
                System.err.println("TarInputStream: SET CURRENTRY '" + this.f5432g.m7514a() + "' size = " + this.f5432g.m7527d());
            }
            this.f5429d = 0L;
            this.f5428c = this.f5432g.m7527d();
            if (this.f5432g.m7532g()) {
                byte[] bArrM7545b = m7545b();
                if (bArrM7545b == null) {
                    return null;
                }
                this.f5432g.m7523b(this.f5436k.mo7554a(bArrM7545b));
            }
            if (this.f5432g.m7533h()) {
                byte[] bArrM7545b2 = m7545b();
                if (bArrM7545b2 == null) {
                    return null;
                }
                this.f5432g.m7517a(this.f5436k.mo7554a(bArrM7545b2));
            }
            if (this.f5432g.m7534i()) {
                m7540d();
            }
            if (this.f5432g.m7531f()) {
                m7541e();
            }
            this.f5428c = this.f5432g.m7527d();
            return this.f5432g;
        } catch (IllegalArgumentException e) {
            IOException iOException = new IOException("Error detected parsing the header");
            iOException.initCause(e);
            throw iOException;
        }
    }

    @Override
    public int available() {
        if (m7542f()) {
            return 0;
        }
        if (this.f5428c - this.f5429d > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) (this.f5428c - this.f5429d);
    }

    protected byte[] m7545b() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = read(this.f5435j);
            if (i < 0) {
                break;
            }
            byteArrayOutputStream.write(this.f5435j, 0, i);
        }
        m7544a();
        if (this.f5432g == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        if (length == byteArray.length) {
            return byteArray;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 0, bArr, 0, length);
        return bArr;
    }

    @Override
    public void close() throws IOException {
        this.f5431f.m7508d();
    }

    @Override
    public void mark(int i) {
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() {
        if (read(this.f5433h, 0, 1) == -1) {
            return -1;
        }
        return this.f5433h[0] & 255;
    }

    @Override
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        if (this.f5429d >= this.f5428c || m7542f()) {
            return -1;
        }
        if (((long) i2) + this.f5429d > this.f5428c) {
            i2 = (int) (this.f5428c - this.f5429d);
        }
        if (this.f5430e != null) {
            int length = i2 > this.f5430e.length ? this.f5430e.length : i2;
            System.arraycopy(this.f5430e, 0, bArr, i, length);
            if (length >= this.f5430e.length) {
                this.f5430e = null;
            } else {
                int length2 = this.f5430e.length - length;
                byte[] bArr2 = new byte[length2];
                System.arraycopy(this.f5430e, length, bArr2, 0, length2);
                this.f5430e = bArr2;
            }
            i3 = 0 + length;
            i4 = i2 - length;
            i += length;
        } else {
            i3 = 0;
            i4 = i2;
        }
        while (i4 > 0) {
            byte[] bArrM7506b = this.f5431f.m7506b();
            if (bArrM7506b == null) {
                throw new IOException("unexpected EOF with " + i4 + " bytes unread");
            }
            int length3 = bArrM7506b.length;
            if (length3 > i4) {
                System.arraycopy(bArrM7506b, 0, bArr, i, i4);
                this.f5430e = new byte[length3 - i4];
                System.arraycopy(bArrM7506b, i4, this.f5430e, 0, length3 - i4);
                length3 = i4;
            } else {
                System.arraycopy(bArrM7506b, 0, bArr, i, length3);
            }
            i3 += length3;
            i4 -= length3;
            i += length3;
        }
        this.f5429d += (long) i3;
        return i3;
    }

    @Override
    public void reset() {
    }

    @Override
    public long skip(long j) throws IOException {
        if (j <= 0 || m7542f()) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            int i = read(this.f5434i, 0, (int) (j2 > ((long) this.f5434i.length) ? this.f5434i.length : j2));
            if (i == -1) {
                break;
            }
            j2 -= (long) i;
        }
        return j - j2;
    }
}
