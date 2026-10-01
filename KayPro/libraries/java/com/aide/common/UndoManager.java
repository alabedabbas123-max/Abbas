package com.aide.common;

@abcd.Interfacexu
public class UndoManager {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -3741163752241171333L)
    private java.util.Stack<com.aide.common.UndoManager.Change> FH;

    @abcd.Interfaceru(field = 848776193189042559L)
    private java.util.Stack<com.aide.common.UndoManager.Change> Hw;

    @abcd.Interfaceru(field = 2159268741301985208L)
    private java.util.List<com.aide.common.UndoManager.a> v5;

    @abcd.Interfacexu
    private static class Change implements android.os.Parcelable {

        @abcd.Interfaceru(field = -1852108972899249685L)
        public static final android.os.Parcelable.Creator<com.aide.common.UndoManager.Change> CREATOR = null;

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -2900198444050481952L)
        public java.lang.String FH;

        @abcd.Interfaceru(field = -38503772974051616L)
        public java.lang.String Hw;

        @abcd.Interfaceru(field = 2658837491522325253L)
        public int v5;

        static {
            abcd.wu.j6(com.aide.common.UndoManager.Change.class, -3939864719947814112L, -3939864719947814112L);     // Catch: java.lang.Throwable -> L8
            if (j6 == false) goto L6;
            abcd.wu.j6(1306105219292752593L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            CREATOR = new com.aide.common._a();     // Catch: java.lang.Throwable -> L8
            return;
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1306105219292752593L, null);
        L12:
            throw th;
        }

        @abcd.Interfacesu(method = -206820081837883096L)
        public Change(android.os.Parcel r7) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1587993151461272849L, null, r7);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1587993151461272849L, null, r7);     // Catch: java.lang.Throwable -> L8
        L6:
            this(r7.readString(), r7.readString(), r7.readInt());     // Catch: java.lang.Throwable -> L8
        }

        @abcd.Interfacesu(method = 470051140639841199L)
        public Change(java.lang.String r9, java.lang.String r10, int r11) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 322067234983942444L, null, r9, r10, new java.lang.Integer(r11));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(322067234983942444L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
        L5:
            this.FH = r9;     // Catch: java.lang.Throwable -> L7
            this.Hw = r10;     // Catch: java.lang.Throwable -> L7
            this.v5 = r11;     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = 2272687715882419935L)
        public int describeContents() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -5364907973463609908L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(-5364907973463609908L, this);     // Catch: java.lang.Throwable -> L8
            return 0;
        L15:
            return 0;
        }

        @Override
        @abcd.Interfacesu(method = 1404192200456920112L)
        public void writeToParcel(android.os.Parcel r8, int r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 411343048803299725L, this, r8, new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(411343048803299725L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            r8.writeString(this.FH);     // Catch: java.lang.Throwable -> L7
            r8.writeString(this.Hw);     // Catch: java.lang.Throwable -> L7
            r8.writeInt(this.v5);     // Catch: java.lang.Throwable -> L7
        }
    }

    public interface a {
        void DW();

        void j6(java.lang.String r1, java.lang.String r2, int r3);
    }

    static {
        abcd.wu.j6(com.aide.common.UndoManager.class, -1448330021796408100L, -1448330021796408100L);
    }

    public UndoManager() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3687910594584982755L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3687910594584982755L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new java.util.Stack();     // Catch: java.lang.Throwable -> L8
        this.Hw = new java.util.Stack();     // Catch: java.lang.Throwable -> L8
        this.v5 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -1916791605002349257L)
    private java.lang.String j6(java.lang.String r5) {
    L15:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, 845527716254720367L, this, r5);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(845527716254720367L, this, r5);     // Catch: java.lang.Throwable -> L15
    L6:
        int r2 = this.FH.size() - 1;     // Catch: java.lang.Throwable -> L15
    L7:
        if (r2 < 0) goto L13;
        if (this.FH.get(r2).FH.equals(r5) == true) goto L10;
        r2 = r2 - 1;     // Catch: java.lang.Throwable -> L15
        goto L7
    L10:
        r5 = this.FH.get(r2).Hw;     // Catch: java.lang.Throwable -> L15
        return r5;
    L13:
        return "";
    }

    @abcd.Interfacesu(method = -968731425726789392L)
    private void j6(com.aide.common.UndoManager.Change r8) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -3429191467663332592L, this, r8);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3429191467663332592L, this, r8);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.Iterator<com.aide.common.UndoManager.a> r2 = this.v5.iterator();     // Catch: java.lang.Throwable -> L12
    L7:
        if (r2.hasNext() == false) goto L11;
        com.aide.common.UndoManager.a r3 = r2.next();     // Catch: java.lang.Throwable -> L12
        r3.DW();     // Catch: java.lang.Throwable -> L12
        r3.j6(r8.FH, j6(r8.FH), r8.v5);     // Catch: java.lang.Throwable -> L12
        goto L7
    }

    @abcd.Interfacesu(method = 113770261290318255L)
    private void v5() {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -151464885855749865L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-151464885855749865L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.Iterator<com.aide.common.UndoManager.a> r2 = this.v5.iterator();     // Catch: java.lang.Throwable -> L12
    L7:
        if (r2.hasNext() == false) goto L11;
        r2.next().DW();     // Catch: java.lang.Throwable -> L12
        goto L7
    }

    public void DW(android.os.Bundle r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4490399858109587205L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4490399858109587205L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        r6.putParcelableArrayList("undo", new java.util.ArrayList(this.FH));     // Catch: java.lang.Throwable -> L8
        r6.putParcelableArrayList("redo", new java.util.ArrayList(this.Hw));     // Catch: java.lang.Throwable -> L8
    }

    public void DW(com.aide.common.UndoManager.a r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1185633639697176747L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1185633639697176747L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5.remove(r5);     // Catch: java.lang.Throwable -> L8
    }

    public void DW(java.lang.String r9, java.lang.String r10, int r11) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1274582641144818576L, this, r9, r10, new java.lang.Integer(r11));
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1274582641144818576L, this, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L8
    L5:
        if (r9 == null) goto L15;
        this.Hw.clear();     // Catch: java.lang.Throwable -> L8
        this.FH.push(new com.aide.common.UndoManager.Change(r9, r10, r11));     // Catch: java.lang.Throwable -> L8
        v5();     // Catch: java.lang.Throwable -> L8
        return;
    }

    public boolean DW() {
    L15:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, 1830752858474875648L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1830752858474875648L, this);     // Catch: java.lang.Throwable -> L15
    L6:
        java.util.HashSet r2 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L15
        int r3 = this.FH.size() - 1;     // Catch: java.lang.Throwable -> L15
    L7:
        if (r3 < 0) goto L13;
        java.lang.String r5 = this.FH.get(r3).FH;     // Catch: java.lang.Throwable -> L15
        if (r2.contains(r5) == true) goto L10;
        r2.add(r5);     // Catch: java.lang.Throwable -> L15
        r3 = r3 - 1;
        goto L7
    L10:
        return true;
    L13:
        return false;
    }

    public void FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1835590263964797056L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1835590263964797056L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.UndoManager.Change r2 = this.Hw.pop();     // Catch: java.lang.Throwable -> L8
        this.FH.push(r2);     // Catch: java.lang.Throwable -> L8
        j6(r2);     // Catch: java.lang.Throwable -> L8
    }

    public void Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1835745965886851060L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1835745965886851060L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.UndoManager.Change r2 = this.FH.pop();     // Catch: java.lang.Throwable -> L8
        this.Hw.push(r2);     // Catch: java.lang.Throwable -> L8
        j6(r2);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(android.os.Bundle r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 5809451549120746528L, this, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5809451549120746528L, this, r5);     // Catch: java.lang.Throwable -> L13
    L6:
        this.FH.clear();     // Catch: java.lang.Throwable -> L13
        java.util.ArrayList r2 = r5.getParcelableArrayList("undo");     // Catch: java.lang.Throwable -> L13
        if (r2 == null) goto L9;
        this.FH.addAll(r2);     // Catch: java.lang.Throwable -> L13
    L9:
        this.Hw.clear();     // Catch: java.lang.Throwable -> L13
        java.util.ArrayList r3 = r5.getParcelableArrayList("redo");     // Catch: java.lang.Throwable -> L13
        if (r3 == null) goto L20;
        this.Hw.addAll(r3);     // Catch: java.lang.Throwable -> L13
        return;
    }

    public void j6(com.aide.common.UndoManager.a r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1266516184012427776L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1266516184012427776L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5.add(r5);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(java.lang.String r9, java.lang.String r10, int r11) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -173016216841515021L, this, r9, r10, new java.lang.Integer(r11));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-173016216841515021L, this, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L10
    L5:
        if (r9 != null) goto L7;
        return;
    L7:
        if (r10.equals(j6(r9)) == true) goto L18;
        this.Hw.clear();     // Catch: java.lang.Throwable -> L10
        this.FH.push(new com.aide.common.UndoManager.Change(r9, r10, r11));     // Catch: java.lang.Throwable -> L10
        v5();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public boolean j6() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 1823030156117842840L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1823030156117842840L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (this.Hw.size() <= 0) goto L9;
        return true;
    L9:
        return false;
    }
}
