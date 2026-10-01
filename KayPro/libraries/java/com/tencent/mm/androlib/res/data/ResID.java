package com.tencent.mm.androlib.res.data;

public class ResID {
    public final int entry;

    public final int f5097id;
    public final int package_;
    public final int type;

    public ResID(int i) {
        this((i >> 24) & 255, (i >> 16) & 255, 65535 & i, i);
    }

    public ResID(int i, int i2, int i3) {
        this(i, i2, i3, (i << 24) + (i2 << 16) + i3);
    }

    public ResID(int i, int i2, int i3, int i4) {
        this.package_ = i;
        this.type = i2;
        this.entry = i3;
        this.f5097id = i4;
    }

    public boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.f5097id == ((ResID) obj).f5097id;
    }

    public int hashCode() {
        return this.f5097id + 527;
    }

    public String toString() {
        return String.format("0x%08x", new Integer(this.f5097id));
    }
}
