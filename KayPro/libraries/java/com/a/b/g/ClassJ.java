package com.a.b.g;

import java.util.Arrays;

public class ClassJ extends ClassT implements Interfacew {

    private Object[] f3490a;

    public ClassJ(int i) {
        super(i != 0);
        try {
            this.f3490a = new Object[i];
        } catch (NegativeArraySizeException e) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    private Object m5471a(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("n < 0");
        }
        throw new IndexOutOfBoundsException("n >= size()");
    }

    private String m5472a(String str, String str2, String str3, boolean z) {
        int length = this.f3490a.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb.append(str);
        }
        for (int i = 0; i < length; i++) {
            if (i != 0 && str2 != null) {
                sb.append(str2);
            }
            if (z) {
                sb.append(((Interfacew) this.f3490a[i]).mo3828d());
            } else {
                sb.append(this.f3490a[i]);
            }
        }
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }

    public String m5473a(String str, String str2, String str3) {
        return m5472a(str, str2, str3, false);
    }

    protected final void m5474a(int i, Object obj) {
        m5518l();
        try {
            this.f3490a[i] = obj;
        } catch (ArrayIndexOutOfBoundsException e) {
            m5471a(i);
        }
    }

    public String m5475b(String str, String str2, String str3) {
        return m5472a(str, str2, str3, true);
    }

    public String mo3828d() {
        String name = getClass().getName();
        return m5472a(String.valueOf(name.substring(name.lastIndexOf(46) + 1)) + '{', ", ", "}", true);
    }

    public final int m5476d_() {
        return this.f3490a.length;
    }

    protected final Object m5477e(int i) {
        try {
            Object obj = this.f3490a[i];
            if (obj == null) {
                throw new NullPointerException("unset: " + i);
            }
            return obj;
        } catch (ArrayIndexOutOfBoundsException e) {
            return m5471a(i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3490a, ((ClassJ) obj).f3490a);
    }

    protected final Object m5478f(int i) {
        return this.f3490a[i];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f3490a);
    }

    public void mo5479i() {
        int i = 0;
        int length = this.f3490a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f3490a[i3] != null) {
                i2++;
            }
        }
        if (length == i2) {
            return;
        }
        m5518l();
        Object[] objArr = new Object[i2];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = this.f3490a[i4];
            if (obj != null) {
                objArr[i] = obj;
                i++;
            }
        }
        this.f3490a = objArr;
        if (i2 == 0) {
            mo3944c_();
        }
    }

    public String toString() {
        String name = getClass().getName();
        return m5472a(String.valueOf(name.substring(name.lastIndexOf(46) + 1)) + '{', ", ", "}", false);
    }
}
