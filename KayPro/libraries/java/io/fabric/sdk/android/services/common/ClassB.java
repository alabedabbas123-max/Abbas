package io.fabric.sdk.android.services.common;

class ClassB {
    public final boolean DW;
    public final java.lang.String j6;

    ClassB(java.lang.String r1, boolean r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public boolean equals(java.lang.Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L22:
        return false;
    L8:
        if (io.fabric.sdk.android.services.common.ClassB.class != r5.getClass()) goto L22;
        io.fabric.sdk.android.services.common.ClassB r6 = (io.fabric.sdk.android.services.common.ClassB) r5;
        if (this.DW == r6.DW) goto L13;
        return false;
    L13:
        java.lang.String r2 = this.j6;
        if (r2 == null) goto L19;
        if (r2.equals(r6.j6) == false) goto L20;
    L21:
        return true;
    L20:
        return false;
    L19:
        if (r6.j6 == null) goto L21;
        goto L20
    }

    public int hashCode() {
        java.lang.String r0 = this.j6;
        if (r0 == null) goto L5;
        int r1 = r0.hashCode();
    L7:
        return (r1 * 31) + (this.DW ? 1 : 0);
    L5:
        r1 = 0;
        goto L7
    }
}
