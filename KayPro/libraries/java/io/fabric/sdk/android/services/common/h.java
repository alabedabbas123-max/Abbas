package io.fabric.sdk.android.services.common;

class h implements java.util.Comparator<java.io.File> {
    h() {
    }

    @Override
    public int compare(java.io.File r1, java.io.File r2) {
        return j6(r1, r2);
    }

    public int j6(java.io.File r3, java.io.File r4) {
        return (int) (r3.lastModified() - r4.lastModified());
    }
}
