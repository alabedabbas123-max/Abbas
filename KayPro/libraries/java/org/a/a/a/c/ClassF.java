package org.a.a.a.c;

import java.util.Arrays;

public class ClassF {

    private static int[] f5276a = new int[0];

    private int[] f5277b = f5276a;

    private int f5278c;

    private void m7377d(int i) {
        if (i < 0 || i > 2147483639) {
            throw new OutOfMemoryError();
        }
        int length = this.f5277b.length == 0 ? 4 : this.f5277b.length;
        while (length < i) {
            length *= 2;
            if (length < 0 || length > 2147483639) {
                length = 2147483639;
            }
        }
        this.f5277b = Arrays.copyOf(this.f5277b, length);
    }

    public final void m7378a(int i) {
        if (this.f5277b.length == this.f5278c) {
            m7377d(this.f5278c + 1);
        }
        this.f5277b[this.f5278c] = i;
        this.f5278c++;
    }

    public final boolean m7379a() {
        return this.f5278c == 0;
    }

    public final int m7380b() {
        return this.f5278c;
    }

    public final int m7381b(int i) {
        if (i < 0 || i >= this.f5278c) {
            throw new IndexOutOfBoundsException();
        }
        return this.f5277b[i];
    }

    public final int m7382c(int i) {
        int iM7381b = m7381b(i);
        System.arraycopy(this.f5277b, i + 1, this.f5277b, i, (this.f5278c - i) - 1);
        this.f5277b[this.f5278c - 1] = 0;
        this.f5278c--;
        return iM7381b;
    }

    public final void m7383c() {
        Arrays.fill(this.f5277b, 0, this.f5278c, 0);
        this.f5278c = 0;
    }

    public final int[] m7384d() {
        return this.f5278c == 0 ? f5276a : Arrays.copyOf(this.f5277b, this.f5278c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClassF)) {
            return false;
        }
        ClassF c1769f = (ClassF) obj;
        if (this.f5278c != c1769f.f5278c) {
            return false;
        }
        for (int i = 0; i < this.f5278c; i++) {
            if (this.f5277b[i] != c1769f.f5277b[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5278c; i2++) {
            i = (i * 31) + this.f5277b[i2];
        }
        return i;
    }

    public String toString() {
        return Arrays.toString(m7384d());
    }
}
