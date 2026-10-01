package com.aide.uidesigner;

@abcd.Interfacexu
public class ProxyRelativeLayoutParams {

    @abcd.Interfacetu
    private static boolean $ON_ENTER_TOGGLE;

    @abcd.Interfaceuu
    private static boolean $ON_THROW_TOGGLE;

    @abcd.Interfaceru(field = 2354254769533777571L)
    private android.widget.RelativeLayout.LayoutParams params;

    static {
        abcd.wu.j6(com.aide.uidesigner.ProxyRelativeLayoutParams.class, -389194419645797985L, -389194419645797985L);
    }

    public ProxyRelativeLayoutParams(java.lang.Object r6) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 2954636932345957632L, null, r6);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2954636932345957632L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params = (android.widget.RelativeLayout.LayoutParams) r6;     // Catch: java.lang.Throwable -> L8
    }

    public void setAbove(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 351313704835149179L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(351313704835149179L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.addRule(2, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setAlignBaseline(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -4035279434312668752L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-4035279434312668752L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.addRule(4, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setAlignBottom(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -1932823365356494600L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-1932823365356494600L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.addRule(8, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setAlignEnd(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 2570169126489297984L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2570169126489297984L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.addRule(19, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setAlignLeft(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -2372962782707906524L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-2372962782707906524L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.addRule(5, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setAlignParentBottom(boolean r5) {
    L9:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L13;
        abcd.wu.j6(th, 2969576307459771904L, this, new java.lang.Boolean(r5));
    L13:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2969576307459771904L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        if (r5 == false) goto L16;
        this.params.addRule(12);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void setAlignParentEnd(boolean r5) {
    L9:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L13;
        abcd.wu.j6(th, 3172574055961403604L, this, new java.lang.Boolean(r5));
    L13:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(3172574055961403604L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        if (r5 == false) goto L16;
        this.params.addRule(21);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void setAlignParentLeft(boolean r5) {
    L9:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L13;
        abcd.wu.j6(th, 3586729133284682840L, this, new java.lang.Boolean(r5));
    L13:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(3586729133284682840L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        if (r5 == false) goto L16;
        this.params.addRule(9);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void setAlignParentRight(boolean r5) {
    L9:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L13;
        abcd.wu.j6(th, 842196217786340003L, this, new java.lang.Boolean(r5));
    L13:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(842196217786340003L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        if (r5 == false) goto L16;
        this.params.addRule(11);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void setAlignParentStart(boolean r5) {
    L9:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L13;
        abcd.wu.j6(th, -1359012129573390911L, this, new java.lang.Boolean(r5));
    L13:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-1359012129573390911L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        if (r5 == false) goto L16;
        this.params.addRule(20);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void setAlignParentTop(boolean r5) {
    L9:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L13;
        abcd.wu.j6(th, -3738004472086642800L, this, new java.lang.Boolean(r5));
    L13:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-3738004472086642800L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        if (r5 == false) goto L16;
        this.params.addRule(10);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void setAlignRight(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 3167475234302662125L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(3167475234302662125L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.addRule(7, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setAlignStart(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 2114645965581280235L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2114645965581280235L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.addRule(18, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setAlignTop(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -200161507569705676L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-200161507569705676L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.addRule(6, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setBelow(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -9587429901181501L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-9587429901181501L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.addRule(3, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setCenterHorizontal(boolean r5) {
    L9:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L13;
        abcd.wu.j6(th, -1326466154422937945L, this, new java.lang.Boolean(r5));
    L13:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-1326466154422937945L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        if (r5 == false) goto L16;
        this.params.addRule(14);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void setCenterInParent(boolean r5) {
    L9:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L13;
        abcd.wu.j6(th, 2915411688807723560L, this, new java.lang.Boolean(r5));
    L13:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2915411688807723560L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        if (r5 == false) goto L16;
        this.params.addRule(13);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void setCenterVertical(boolean r5) {
    L9:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L13;
        abcd.wu.j6(th, -2205803525017509359L, this, new java.lang.Boolean(r5));
    L13:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-2205803525017509359L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        if (r5 == false) goto L16;
        this.params.addRule(15);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void setEndOf(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 730128286533663744L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(730128286533663744L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.addRule(17, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setLeftOf(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -1215017786158701280L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-1215017786158701280L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.addRule(0, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setRightOf(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -682603269297202665L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-682603269297202665L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.addRule(1, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setStartOf(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -491966975264983855L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-491966975264983855L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.addRule(16, r5);     // Catch: java.lang.Throwable -> L8
    }
}
