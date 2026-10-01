package com.almlkaide.kaypro.android.dx.util;

import java.util.Arrays;

public final class IntList extends MutabilityControl {
    public static final IntList EMPTY = new IntList(0);
    private int size;
    private boolean sorted;
    private int[] values;

    static {
        EMPTY.setImmutable();
    }

    public static IntList makeImmutable(int i) {
        IntList intList = new IntList(1);
        intList.m7230add(i);
        intList.setImmutable();
        return intList;
    }

    public static IntList makeImmutable(int i, int i2) {
        IntList intList = new IntList(2);
        intList.m7230add(i);
        intList.m7230add(i2);
        intList.setImmutable();
        return intList;
    }

    public IntList() {
        this(4);
    }

    public IntList(int i) {
        super(true);
        try {
            this.values = new int[i];
            this.size = 0;
            this.sorted = true;
        } catch (NegativeArraySizeException e) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 < this.size) {
                i = (i3 * 31) + this.values[i2];
                i2++;
            } else {
                return i3;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntList)) {
            return false;
        }
        IntList intList = (IntList) obj;
        if (this.sorted) {
            if (!intList.sorted) {
                return false;
            }
        } else if (intList.sorted) {
            return false;
        }
        if (this.size != intList.size) {
            return false;
        }
        for (int i = 0; i < this.size; i++) {
            if (this.values[i] != intList.values[i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.size * 5) + 10);
        sb.append('{');
        for (int i = 0; i < this.size; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.values[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    public int size() {
        return this.size;
    }

    public int m7231get(int i) {
        if (i >= this.size) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            return this.values[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    public void m7234set(int i, int i2) {
        throwIfImmutable();
        if (i >= this.size) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            this.values[i] = i2;
            this.sorted = false;
        } catch (ArrayIndexOutOfBoundsException e) {
            if (i < 0) {
                throw new IllegalArgumentException("n < 0");
            }
        }
    }

    public void m7230add(int i) {
        throwIfImmutable();
        growIfNeeded();
        int[] iArr = this.values;
        int i2 = this.size;
        this.size = i2 + 1;
        iArr[i2] = i;
        if (!this.sorted || this.size <= 1) {
            return;
        }
        this.sorted = i >= this.values[this.size + (-2)];
    }

    public void insert(int i, int i2) {
        if (i > this.size) {
            throw new IndexOutOfBoundsException("n > size()");
        }
        growIfNeeded();
        System.arraycopy(this.values, i, this.values, i + 1, this.size - i);
        this.values[i] = i2;
        this.size++;
        this.sorted = this.sorted && (i == 0 || i2 > this.values[i + (-1)]) && (i == this.size + (-1) || i2 < this.values[i + 1]);
    }

    public void removeIndex(int i) {
        if (i >= this.size) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        System.arraycopy(this.values, i + 1, this.values, i, (this.size - i) - 1);
        this.size--;
    }

    private void growIfNeeded() {
        if (this.size == this.values.length) {
            int[] iArr = new int[((this.size * 3) / 2) + 10];
            System.arraycopy(this.values, 0, iArr, 0, this.size);
            this.values = iArr;
        }
    }

    public int m7235top() {
        return m7231get(this.size - 1);
    }

    public int m7232pop() {
        throwIfImmutable();
        int iM7231get = m7231get(this.size - 1);
        this.size--;
        return iM7231get;
    }

    public void m7233pop(int i) {
        throwIfImmutable();
        this.size -= i;
    }

    public void shrink(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i > this.size) {
            throw new IllegalArgumentException("newSize > size");
        }
        throwIfImmutable();
        this.size = i;
    }

    public IntList mutableCopy() {
        int i = this.size;
        IntList intList = new IntList(i);
        for (int i2 = 0; i2 < i; i2++) {
            intList.m7230add(this.values[i2]);
        }
        return intList;
    }

    public void sort() {
        throwIfImmutable();
        if (this.sorted) {
            return;
        }
        Arrays.sort(this.values, 0, this.size);
        this.sorted = true;
    }

    public int indexOf(int i) {
        int iBinarysearch = binarysearch(i);
        if (iBinarysearch >= 0) {
            return iBinarysearch;
        }
        return -1;
    }

    public int binarysearch(int i) {
        int i2 = this.size;
        if (!this.sorted) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.values[i3] == i) {
                    return i3;
                }
            }
            return -i2;
        }
        int i4 = i2;
        int i5 = -1;
        while (i4 > i5 + 1) {
            int i6 = ((i4 - i5) >> 1) + i5;
            if (i <= this.values[i6]) {
                i4 = i6;
            } else {
                i5 = i6;
            }
        }
        if (i4 != i2) {
            return i != this.values[i4] ? (-i4) - 1 : i4;
        }
        return (-i2) - 1;
    }

    public boolean contains(int i) {
        return indexOf(i) >= 0;
    }
}
