package com.aide.ui.scm;

@abcd.Interfacexu
public class ModifiedFile implements android.os.Parcelable, com.aide.ui.scm.Interfacef {
    public static final android.os.Parcelable.Creator<com.aide.ui.scm.ModifiedFile> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public final java.lang.String FH;
    public final int Hw;

    static {
        abcd.wu.j6(com.aide.ui.scm.ModifiedFile.class, -3685332166428264928L, -3685332166428264928L);     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(-2127181596935992395L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        CREATOR = new com.aide.ui.scm.ya();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2127181596935992395L, null);
    L12:
        throw th;
    }

    public ModifiedFile(android.os.Parcel r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -832904971195898640L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-832904971195898640L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = r6.readInt();     // Catch: java.lang.Throwable -> L8
        this.FH = r6.readString();     // Catch: java.lang.Throwable -> L8
    }

    public ModifiedFile(java.lang.String r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -2713532887566778283L, null, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2713532887566778283L, null, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r8;     // Catch: java.lang.Throwable -> L7
        this.Hw = r9;     // Catch: java.lang.Throwable -> L7
    }

    public boolean DW() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 1699161796823953605L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1699161796823953605L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        if ((this.Hw & 1) != 0) goto L19;
        return false;
    L19:
        return true;
    }

    public boolean FH() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 2341259825944939177L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2341259825944939177L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        if ((this.Hw & 2) == 0) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean Hw() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -2412247080641203701L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2412247080641203701L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        if ((this.Hw & 64) == 0) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean VH() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -1244044106580671643L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1244044106580671643L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        if ((this.Hw & 4) == 0) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean Zo() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 3494945443422642688L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3494945443422642688L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        if ((this.Hw & 16) == 0) goto L10;
        return true;
    L10:
        return false;
    }

    @Override
    public int describeContents() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2766844239460399812L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(2766844239460399812L, this);     // Catch: java.lang.Throwable -> L8
        return 0;
    L15:
        return 0;
    }

    public boolean gn() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 526371838696924160L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(526371838696924160L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        if ((this.Hw & 32) == 0) goto L10;
        return true;
    L10:
        return false;
    }

    public java.lang.String j6() {
    L32:
        th = move-exception;
        if (DW == false) goto L36;
        abcd.wu.j6(th, -3135486143350736176L, this);
    L36:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3135486143350736176L, this);     // Catch: java.lang.Throwable -> L32
    L6:
        java.lang.StringBuilder r2 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L32
        if (DW() == false) goto L10;
        r2.append("added, ");     // Catch: java.lang.Throwable -> L32
    L10:
        if (FH() == false) goto L13;
        r2.append("changed, ");     // Catch: java.lang.Throwable -> L32
    L13:
        if (VH() == false) goto L16;
        r2.append("removed, ");     // Catch: java.lang.Throwable -> L32
    L16:
        if (v5() == false) goto L19;
        r2.append("missing, ");     // Catch: java.lang.Throwable -> L32
    L19:
        if (Zo() == false) goto L22;
        r2.append("modified, ");     // Catch: java.lang.Throwable -> L32
    L22:
        if (gn() == false) goto L25;
        r2.append("untracked, ");     // Catch: java.lang.Throwable -> L32
    L25:
        if (Hw() == false) goto L28;
        r2.append("conflicting, ");     // Catch: java.lang.Throwable -> L32
    L28:
        if (r2.length() == 0) goto L30;
        r2.setLength(r2.length() - 2);     // Catch: java.lang.Throwable -> L32
    L30:
        return r2.toString();
    }

    public boolean v5() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -2530485829208135817L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2530485829208135817L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        if ((this.Hw & 8) == 0) goto L10;
        return true;
    L10:
        return false;
    }

    @Override
    public void writeToParcel(android.os.Parcel r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -2584402057559894879L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2584402057559894879L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        r8.writeInt(this.Hw);     // Catch: java.lang.Throwable -> L7
        r8.writeString(this.FH);     // Catch: java.lang.Throwable -> L7
    }
}
