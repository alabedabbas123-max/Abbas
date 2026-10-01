package org.a.a.a.c;

import android.os.Parcel;
import android.os.Parcelable;

class ClassI implements Parcelable.Creator {
    ClassI() {
    }

    @Override
    public ClassJ createFromParcel(Parcel parcel) {
        return new ClassJ(parcel.readInt(), parcel.readInt());
    }

    @Override
    public ClassJ[] newArray(int i) {
        return new ClassJ[i];
    }
}
