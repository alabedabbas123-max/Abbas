package org.a.a.a.c;

import android.os.Parcel;
import android.os.Parcelable;

public class ClassH implements Parcelable {

    public static final Parcelable.Creator f5279a = new ClassI();

    public static final ClassH f5280b = new ClassH(-1, -2);

    static ClassH[] f5281c = new ClassH[1001];

    public static int f5282f = 0;

    public static int f5283g = 0;

    public static int f5284h = 0;

    public static int f5285i = 0;

    public int f5286d;

    public int f5287e;

    public ClassH(int i, int i2) {
        this.f5286d = i;
        this.f5287e = i2;
    }

    public static ClassH m7387a(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new ClassH(i, i2);
        }
        if (f5281c[i] == null) {
            f5281c[i] = new ClassH(i, i);
        }
        return f5281c[i];
    }

    public boolean m7388a(ClassH c1771h) {
        return this.f5286d < c1771h.f5286d && this.f5287e < c1771h.f5286d;
    }

    public boolean m7389b(ClassH c1771h) {
        return this.f5286d > c1771h.f5287e;
    }

    public boolean m7390c(ClassH c1771h) {
        return m7388a(c1771h) || m7389b(c1771h);
    }

    public boolean m7391d(ClassH c1771h) {
        return this.f5286d == c1771h.f5287e + 1 || this.f5287e == c1771h.f5286d + (-1);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public ClassH m7392e(ClassH c1771h) {
        return m7387a(Math.min(this.f5286d, c1771h.f5286d), Math.max(this.f5287e, c1771h.f5287e));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ClassH)) {
            return false;
        }
        ClassH c1771h = (ClassH) obj;
        return this.f5286d == c1771h.f5286d && this.f5287e == c1771h.f5287e;
    }

    public int hashCode() {
        return ((this.f5286d + 713) * 31) + this.f5287e;
    }

    public String toString() {
        return String.valueOf(this.f5286d) + ".." + this.f5287e;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5286d);
        parcel.writeInt(this.f5287e);
    }
}
