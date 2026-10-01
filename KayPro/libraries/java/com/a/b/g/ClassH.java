package com.a.b.g;

import com.a.a.ClassE;
import com.a.a.a.ClassB;
import com.a.a.a.Interfacea;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

public final class ClassH implements Interfacea, Interfacea {

    private final boolean f3480a;

    private byte[] f3481b;

    private int f3482c;

    private boolean f3483d;

    private ArrayList f3484e;

    private int f3485f;

    private int f3486g;

    public ClassH() {
        this(1000);
    }

    public ClassH(int i) {
        this(new byte[i], true);
    }

    public ClassH(byte[] bArr) {
        this(bArr, false);
    }

    private ClassH(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        this.f3480a = z;
        this.f3481b = bArr;
        this.f3482c = 0;
        this.f3483d = false;
        this.f3484e = null;
        this.f3485f = 0;
        this.f3486g = 0;
    }

    private static void m5447i() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    private void m5448i(int i) {
        if (this.f3481b.length < i) {
            byte[] bArr = new byte[(i * 2) + 1000];
            System.arraycopy(this.f3481b, 0, bArr, 0, this.f3482c);
            this.f3481b = bArr;
        }
    }

    @Override
    public void mo3755a(int i) {
        int i2 = this.f3482c;
        int i3 = i2 + 1;
        if (this.f3480a) {
            m5448i(i3);
        } else if (i3 > this.f3481b.length) {
            m5447i();
            return;
        }
        this.f3481b[i2] = (byte) i;
        this.f3482c = i3;
    }

    @Override
    public void mo5403a(int i, String str) {
        if (this.f3484e == null) {
            return;
        }
        mo5407c();
        int size = this.f3484e.size();
        int iM5468b = size == 0 ? 0 : ((ClassI) this.f3484e.get(size - 1)).m5468b();
        if (iM5468b <= this.f3482c) {
            iM5468b = this.f3482c;
        }
        this.f3484e.add(new ClassI(iM5468b, iM5468b + i, str));
    }

    public void m5449a(int i, boolean z) {
        int i2 = 6;
        if (this.f3484e != null || this.f3482c != 0) {
            throw new RuntimeException("cannot enable annotations");
        }
        if (i < 40) {
            throw new IllegalArgumentException("annotationWidth < 40");
        }
        int i3 = (((i - 7) / 15) + 1) & (-2);
        if (i3 >= 6) {
            i2 = i3 > 10 ? 10 : i3;
        }
        this.f3484e = new ArrayList(1000);
        this.f3485f = i;
        this.f3486g = i2;
        this.f3483d = z;
    }

    @Override
    public void mo5450a(long j) {
        int i = this.f3482c;
        int i2 = i + 8;
        if (this.f3480a) {
            m5448i(i2);
        } else if (i2 > this.f3481b.length) {
            m5447i();
            return;
        }
        int i3 = (int) j;
        this.f3481b[i] = (byte) i3;
        this.f3481b[i + 1] = (byte) (i3 >> 8);
        this.f3481b[i + 2] = (byte) (i3 >> 16);
        this.f3481b[i + 3] = (byte) (i3 >> 24);
        int i4 = (int) (j >> 32);
        this.f3481b[i + 4] = (byte) i4;
        this.f3481b[i + 5] = (byte) (i4 >> 8);
        this.f3481b[i + 6] = (byte) (i4 >> 16);
        this.f3481b[i + 7] = (byte) (i4 >> 24);
        this.f3482c = i2;
    }

    @Override
    public void mo5451a(ClassE c1307e) {
        int iM5436a = c1307e.m5436a();
        int i = this.f3482c;
        int i2 = iM5436a + i;
        if (this.f3480a) {
            m5448i(i2);
        } else if (i2 > this.f3481b.length) {
            m5447i();
            return;
        }
        c1307e.m5439a(this.f3481b, i);
        this.f3482c = i2;
    }

    public void m5452a(Writer writer) {
        String strM5470c;
        int iMo5408d = mo5408d();
        ClassX c1326x = new ClassX(writer, (this.f3485f - iMo5408d) - 1, iMo5408d, "|");
        Writer writerM5526a = c1326x.m5526a();
        Writer writerM5527b = c1326x.m5527b();
        int size = this.f3484e.size();
        int i = 0;
        int i2 = 0;
        while (i2 < this.f3482c && i < size) {
            ClassI c1311i = (ClassI) this.f3484e.get(i);
            int iM5466a = c1311i.m5466a();
            if (i2 < iM5466a) {
                strM5470c = "";
            } else {
                int iM5468b = c1311i.m5468b();
                i++;
                strM5470c = c1311i.m5470c();
                i2 = iM5466a;
                iM5466a = iM5468b;
            }
            writerM5526a.write(ClassK.m5482a(this.f3481b, i2, iM5466a - i2, i2, this.f3486g, 6));
            writerM5527b.write(strM5470c);
            c1326x.m5528c();
            i2 = iM5466a;
        }
        if (i2 < this.f3482c) {
            writerM5526a.write(ClassK.m5482a(this.f3481b, i2, this.f3482c - i2, i2, this.f3486g, 6));
        }
        while (i < size) {
            writerM5527b.write(((ClassI) this.f3484e.get(i)).m5470c());
            i++;
        }
        c1326x.m5528c();
    }

    @Override
    public void mo5404a(String str) {
        if (this.f3484e == null) {
            return;
        }
        mo5407c();
        this.f3484e.add(new ClassI(this.f3482c, str));
    }

    @Override
    public void mo5453a(byte[] bArr) {
        m5454a(bArr, 0, bArr.length);
    }

    public void m5454a(byte[] bArr, int i, int i2) {
        int i3 = this.f3482c;
        int i4 = i3 + i2;
        int i5 = i + i2;
        if ((i | i2 | i4) < 0 || i5 > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; " + i + "..!" + i4);
        }
        if (this.f3480a) {
            m5448i(i4);
        } else if (i4 > this.f3481b.length) {
            m5447i();
            return;
        }
        System.arraycopy(bArr, i, this.f3481b, i3, i2);
        this.f3482c = i4;
    }

    @Override
    public boolean mo5405a() {
        return this.f3484e != null;
    }

    @Override
    public void mo5455b(int i) {
        if (this.f3482c != i) {
            throw new ClassB("expected cursor " + i + "; actual value: " + this.f3482c);
        }
    }

    @Override
    public boolean mo5406b() {
        return this.f3483d;
    }

    @Override
    public void mo5407c() {
        int size;
        if (this.f3484e == null || (size = this.f3484e.size()) == 0) {
            return;
        }
        ((ClassI) this.f3484e.get(size - 1)).m5467a(this.f3482c);
    }

    @Override
    public void mo5456c(int i) {
        int i2 = this.f3482c;
        int i3 = i2 + 2;
        if (this.f3480a) {
            m5448i(i3);
        } else if (i3 > this.f3481b.length) {
            m5447i();
            return;
        }
        this.f3481b[i2] = (byte) i;
        this.f3481b[i2 + 1] = (byte) (i >> 8);
        this.f3482c = i3;
    }

    @Override
    public int mo5408d() {
        return this.f3485f - (((this.f3486g * 2) + 8) + (this.f3486g / 2));
    }

    @Override
    public void mo5457d(int i) {
        int i2 = this.f3482c;
        int i3 = i2 + 4;
        if (this.f3480a) {
            m5448i(i3);
        } else if (i3 > this.f3481b.length) {
            m5447i();
            return;
        }
        this.f3481b[i2] = (byte) i;
        this.f3481b[i2 + 1] = (byte) (i >> 8);
        this.f3481b[i2 + 2] = (byte) (i >> 16);
        this.f3481b[i2 + 3] = (byte) (i >> 24);
        this.f3482c = i3;
    }

    @Override
    public int mo5458e(int i) {
        if (this.f3480a) {
            m5448i(this.f3482c + 5);
        }
        int i2 = this.f3482c;
        ClassE.m3763a(this, i);
        return this.f3482c - i2;
    }

    public byte[] m5459e() {
        return this.f3481b;
    }

    public int m5460f(int i) {
        if (this.f3480a) {
            m5448i(this.f3482c + 5);
        }
        int i2 = this.f3482c;
        ClassE.m3764b(this, i);
        return this.f3482c - i2;
    }

    public byte[] m5461f() {
        byte[] bArr = new byte[this.f3482c];
        System.arraycopy(this.f3481b, 0, bArr, 0, this.f3482c);
        return bArr;
    }

    @Override
    public int mo5462g() {
        return this.f3482c;
    }

    @Override
    public void mo5463g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        int i2 = this.f3482c + i;
        if (this.f3480a) {
            m5448i(i2);
        } else if (i2 > this.f3481b.length) {
            m5447i();
            return;
        }
        Arrays.fill(this.f3481b, this.f3482c, i2, (byte) 0);
        this.f3482c = i2;
    }

    public void m5464h() {
        mo5407c();
        if (this.f3484e != null) {
            for (int size = this.f3484e.size(); size > 0; size--) {
                ClassI c1311i = (ClassI) this.f3484e.get(size - 1);
                if (c1311i.m5466a() <= this.f3482c) {
                    if (c1311i.m5468b() > this.f3482c) {
                        c1311i.m5469b(this.f3482c);
                        return;
                    }
                    return;
                }
                this.f3484e.remove(size - 1);
            }
        }
    }

    @Override
    public void mo5465h(int i) {
        int i2 = i - 1;
        if (i < 0 || (i2 & i) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (i2 ^ (-1)) & (this.f3482c + i2);
        if (this.f3480a) {
            m5448i(i3);
        } else if (i3 > this.f3481b.length) {
            m5447i();
            return;
        }
        Arrays.fill(this.f3481b, this.f3482c, i3, (byte) 0);
        this.f3482c = i3;
    }
}
