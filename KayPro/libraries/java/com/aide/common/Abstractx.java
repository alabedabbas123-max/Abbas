package com.aide.common;

@abcd.Interfacexu
public abstract class Abstractx<T> extends android.widget.BaseAdapter {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 3180481086576429344L)
    private java.util.List<T> FH;

    static {
        abcd.wu.j6(com.aide.common.Abstractx.class, -3083238532034305587L, -3083238532034305587L);
    }

    public Abstractx() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 110292199891660189L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(110292199891660189L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public int getCount() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3357068759467736896L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3357068759467736896L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.size();
    }

    @Override
    public java.lang.Object getItem(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 231045427725003927L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(231045427725003927L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.get(r5);
    }

    @Override
    public long getItemId(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 98067406383910656L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(98067406383910656L, this, r5);     // Catch: java.lang.Throwable -> L8
    L7:
        return r5;
    }

    public T j6(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -275818735594604896L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-275818735594604896L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.get(r5);
    }

    public void j6(java.util.List<T> r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1012674603829350507L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1012674603829350507L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r5;     // Catch: java.lang.Throwable -> L8
        notifyDataSetChanged();     // Catch: java.lang.Throwable -> L8
    }
}
