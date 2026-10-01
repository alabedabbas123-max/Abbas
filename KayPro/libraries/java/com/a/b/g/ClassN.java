package com.a.b.g;

import java.util.Arrays;

public final class ClassN extends ClassT {

    public static final ClassN f3497a = new ClassN(0);

    private int[] f3498b;

    private int f3499c;

    private boolean f3500d;

    static {
        f3497a.mo3944c_();
    }

    public ClassN() {
        this(4);
    }

    public ClassN(int i) {
        super(true);
        try {
            this.f3498b = new int[i];
            this.f3499c = 0;
            this.f3500d = true;
        } catch (NegativeArraySizeException e) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    public static ClassN m5493a(int i) {
        ClassN c1316n = new ClassN(1);
        c1316n.m5499c(i);
        c1316n.mo3944c_();
        return c1316n;
    }

    public static ClassN m5494a(int i, int i2) {
        ClassN c1316n = new ClassN(2);
        c1316n.m5499c(i);
        c1316n.m5499c(i2);
        c1316n.mo3944c_();
        return c1316n;
    }

    private void m5495h() {
        if (this.f3499c == this.f3498b.length) {
            int[] iArr = new int[((this.f3499c * 3) / 2) + 10];
            System.arraycopy(this.f3498b, 0, iArr, 0, this.f3499c);
            this.f3498b = iArr;
        }
    }

    public int m5496b() {
        return this.f3499c;
    }

    public int m5497b(int i) {
        if (i >= this.f3499c) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            return this.f3498b[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    public void m5498b(int i, int i2) {
        m5518l();
        if (i >= this.f3499c) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            this.f3498b[i] = i2;
            this.f3500d = false;
        } catch (ArrayIndexOutOfBoundsException e) {
            if (i < 0) {
                throw new IllegalArgumentException("n < 0");
            }
        }
    }

    public void m5499c(int i) {
        m5518l();
        m5495h();
        int[] iArr = this.f3498b;
        int i2 = this.f3499c;
        this.f3499c = i2 + 1;
        iArr[i2] = i;
        if (!this.f3500d || this.f3499c <= 1) {
            return;
        }
        this.f3500d = i >= this.f3498b[this.f3499c + (-2)];
    }

    public void m5500c(int i, int i2) {
        if (i > this.f3499c) {
            throw new IndexOutOfBoundsException("n > size()");
        }
        m5495h();
        System.arraycopy(this.f3498b, i, this.f3498b, i + 1, this.f3499c - i);
        this.f3498b[i] = i2;
        this.f3499c++;
        this.f3500d = this.f3500d && (i == 0 || i2 > this.f3498b[i + (-1)]) && (i == this.f3499c + (-1) || i2 < this.f3498b[i + 1]);
    }

    public int m5501d() {
        return m5497b(this.f3499c - 1);
    }

    public void m5502d(int i) {
        if (i >= this.f3499c) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        System.arraycopy(this.f3498b, i + 1, this.f3498b, i, (this.f3499c - i) - 1);
        this.f3499c--;
    }

    public int m5503e() {
        m5518l();
        int iM5497b = m5497b(this.f3499c - 1);
        this.f3499c--;
        return iM5497b;
    }

    public void m5504e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i > this.f3499c) {
            throw new IllegalArgumentException("newSize > size");
        }
        m5518l();
        this.f3499c = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClassN)) {
            return false;
        }
        ClassN c1316n = (ClassN) obj;
        if (this.f3500d != c1316n.f3500d || this.f3499c != c1316n.f3499c) {
            return false;
        }
        for (int i = 0; i < this.f3499c; i++) {
            if (this.f3498b[i] != c1316n.f3498b[i]) {
                return false;
            }
        }
        return true;
    }

    public int m5505f(int i) {
        int iM5507g = m5507g(i);
        if (iM5507g >= 0) {
            return iM5507g;
        }
        return -1;
    }

    public ClassN m5506f() {
        int i = this.f3499c;
        ClassN c1316n = new ClassN(i);
        for (int i2 = 0; i2 < i; i2++) {
            c1316n.m5499c(this.f3498b[i2]);
        }
        return c1316n;
    }

    public int m5507g(int i) {
        int i2 = this.f3499c;
        if (!this.f3500d) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.f3498b[i3] == i) {
                    return i3;
                }
            }
            return -i2;
        }
        int i4 = i2;
        int i5 = -1;
        while (i4 > i5 + 1) {
            int i6 = ((i4 - i5) >> 1) + i5;
            if (i <= this.f3498b[i6]) {
                i4 = i6;
            } else {
                i5 = i6;
            }
        }
        if (i4 != i2) {
            return i != this.f3498b[i4] ? (-i4) - 1 : i4;
        }
        return (-i2) - 1;
    }

    public void m5508g() {
        m5518l();
        if (this.f3500d) {
            return;
        }
        Arrays.sort(this.f3498b, 0, this.f3499c);
        this.f3500d = true;
    }

    public boolean m5509h(int i) {
        return m5505f(i) >= 0;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.f3499c; i2++) {
            i = (i * 31) + this.f3498b[i2];
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f3499c * 5) + 10);
        sb.append('{');
        for (int i = 0; i < this.f3499c; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.f3498b[i]);
        }
        sb.append('}');
        return sb.toString();
    }
}
