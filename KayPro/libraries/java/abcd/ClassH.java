package abcd;

class ClassH extends abcd.ClassG {
    private static java.lang.reflect.Method gn;

    private static class a extends abcd.ClassF.a {
        a(abcd.ClassF.a r1, android.content.res.Resources r2) {
            super(r1, r2);
        }

        @Override
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
            return new abcd.ClassH(this, r2);
        }
    }

    ClassH(abcd.ClassF.a r1, android.content.res.Resources r2) {
        super(r1, r2);
        FH();
    }

    ClassH(android.graphics.drawable.Drawable r1) {
        super(r1);
        FH();
    }

    private void FH() {
        if (gn != null) goto L11;
        gn = android.graphics.drawable.Drawable.class.getDeclaredMethod("isProjected", new java.lang.Class[0]);     // Catch: java.lang.Exception -> L6
        return;
    L6:
        e = move-exception;
        android.util.Log.w("DrawableWrapperApi21", "Failed to retrieve Drawable#isProjected() method", e);
        return;
    }

    @Override
    abcd.ClassF.a DW() {
        return new abcd.ClassH.a(this.v5, null);
    }

    @Override
    public android.graphics.Rect getDirtyBounds() {
        return this.VH.getDirtyBounds();
    }

    @Override
    public void getOutline(android.graphics.Outline r2) {
        this.VH.getOutline(r2);
    }

    @Override
    protected boolean j6() {
        if (android.os.Build.VERSION.SDK_INT != 21) goto L14;
        android.graphics.drawable.Drawable r0 = this.VH;
        if ((r0 instanceof android.graphics.drawable.GradientDrawable) == false) goto L7;
    L12:
        return true;
    L7:
        if ((r0 instanceof android.graphics.drawable.DrawableContainer) == true) goto L12;
        if ((r0 instanceof android.graphics.drawable.InsetDrawable) == true) goto L12;
        if ((r0 instanceof android.graphics.drawable.RippleDrawable) == true) goto L12;
        return false;
    L14:
        return false;
    }

    @Override
    public void setHotspot(float r2, float r3) {
        this.VH.setHotspot(r2, r3);
    }

    @Override
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
        this.VH.setHotspotBounds(r2, r3, r4, r5);
    }

    @Override
    public boolean setState(int[] r1) {
        if (super.setState(r1) == false) goto L6;
        invalidateSelf();
        return true;
    L6:
        return false;
    }

    @Override
    public void setTint(int r2) {
        if (j6() == false) goto L5;
        super.setTint(r2);
        return;
    L5:
        this.VH.setTint(r2);
    }

    @Override
    public void setTintList(android.content.res.ColorStateList r2) {
        if (j6() == false) goto L5;
        super.setTintList(r2);
        return;
    L5:
        this.VH.setTintList(r2);
    }

    @Override
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
        if (j6() == false) goto L5;
        super.setTintMode(r2);
        return;
    L5:
        this.VH.setTintMode(r2);
    }
}
