package com.aide.ui.scm;

@abcd.Interfacexu
public class GitStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.ui.scm.GitStatus> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public final java.lang.String FH;
    public final java.util.List<com.aide.ui.scm.ModifiedFile> Hw;

    static {
        abcd.wu.j6(com.aide.ui.scm.GitStatus.class, -2288539808242855755L, -2288539808242855755L);     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(2848358967180819661L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        CREATOR = new com.aide.ui.scm.va();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2848358967180819661L, null);
    L12:
        throw th;
    }

    public GitStatus(android.os.Parcel r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1316280535937052981L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1316280535937052981L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        java.util.ArrayList r3 = new java.util.ArrayList(r6.readInt());     // Catch: java.lang.Throwable -> L8
        r6.readTypedList(r3, com.aide.ui.scm.ModifiedFile.CREATOR);     // Catch: java.lang.Throwable -> L8
        this.Hw = java.util.Collections.unmodifiableList(r3);     // Catch: java.lang.Throwable -> L8
        this.FH = r6.readString();     // Catch: java.lang.Throwable -> L8
    }

    public GitStatus(java.lang.String r8, java.util.Collection<com.aide.ui.scm.ModifiedFile> r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1079767636418695311L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1079767636418695311L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r8;     // Catch: java.lang.Throwable -> L7
        this.Hw = java.util.Collections.unmodifiableList(new java.util.ArrayList(r9));     // Catch: java.lang.Throwable -> L7
    }

    @Override
    public int describeContents() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4084759222303630228L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(4084759222303630228L, this);     // Catch: java.lang.Throwable -> L8
        return 0;
    L15:
        return 0;
    }

    public boolean j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2182983828349697912L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2182983828349697912L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw.isEmpty();
    }

    @Override
    public void writeToParcel(android.os.Parcel r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -89952901220952711L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-89952901220952711L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        r8.writeInt(this.Hw.size());     // Catch: java.lang.Throwable -> L7
        r8.writeTypedList(this.Hw);     // Catch: java.lang.Throwable -> L7
        r8.writeString(this.FH);     // Catch: java.lang.Throwable -> L7
    }
}
