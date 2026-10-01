package com.almlkaide.kaypro.android.dx.util;

import java.util.Arrays;

public class FixedSizeList extends MutabilityControl implements ToHuman {

    private Object[] f5086arr;

    public FixedSizeList(int i) {
        super(i != 0);
        try {
            this.f5086arr = new Object[i];
        } catch (NegativeArraySizeException e) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f5086arr, ((FixedSizeList) obj).f5086arr);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5086arr);
    }

    public String toString() {
        String name = getClass().getName();
        return toString0(new StringBuffer().append(name.substring(name.lastIndexOf(46) + 1)).append('{').toString(), ", ", "}", false);
    }

    public String toHuman() {
        String name = getClass().getName();
        return toString0(new StringBuffer().append(name.substring(name.lastIndexOf(46) + 1)).append('{').toString(), ", ", "}", true);
    }

    public String toString(String str, String str2, String str3) {
        return toString0(str, str2, str3, false);
    }

    public String toHuman(String str, String str2, String str3) {
        return toString0(str, str2, str3, true);
    }

    public final int size() {
        return this.f5086arr.length;
    }

    public void shrinkToFit() {
        int length = this.f5086arr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f5086arr[i2] != null) {
                i++;
            }
        }
        if (length != i) {
            throwIfImmutable();
            Object[] objArr = new Object[i];
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                Object obj = this.f5086arr[i4];
                if (obj != null) {
                    objArr[i3] = obj;
                    i3++;
                }
            }
            this.f5086arr = objArr;
            if (i == 0) {
                setImmutable();
            }
        }
    }

    protected final Object get0(int i) {
        try {
            Object obj = this.f5086arr[i];
            if (obj == null) {
                throw new NullPointerException(new StringBuffer().append("unset: ").append(i).toString());
            }
            return obj;
        } catch (ArrayIndexOutOfBoundsException e) {
            return throwIndex(i);
        }
    }

    protected final Object getOrNull0(int i) {
        return this.f5086arr[i];
    }

    protected final void set0(int i, Object obj) {
        throwIfImmutable();
        try {
            this.f5086arr[i] = obj;
        } catch (ArrayIndexOutOfBoundsException e) {
            throwIndex(i);
        }
    }

    private Object throwIndex(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("n < 0");
        }
        throw new IndexOutOfBoundsException("n >= size()");
    }

    private String toString0(String str, String str2, String str3, boolean z) {
        int length = this.f5086arr.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb.append(str);
        }
        for (int i = 0; i < length; i++) {
            if (i != 0 && str2 != null) {
                sb.append(str2);
            }
            if (z) {
                sb.append(((ToHuman) this.f5086arr[i]).toHuman());
            } else {
                sb.append(this.f5086arr[i]);
            }
        }
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }
}
