package abcd;

class ClassF extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, abcd.Interfacee, abcd.Interfacei {
    static final android.graphics.PorterDuff.Mode j6 = null;
    private int DW;
    private android.graphics.PorterDuff.Mode FH;
    private boolean Hw;
    android.graphics.drawable.Drawable VH;
    private boolean Zo;
    abcd.ClassF.a v5;

    protected static abstract class a extends android.graphics.drawable.Drawable.ConstantState {
        android.graphics.drawable.Drawable.ConstantState DW;
        android.content.res.ColorStateList FH;
        android.graphics.PorterDuff.Mode Hw;
        int j6;

        a(abcd.ClassF.a r1, android.content.res.Resources r2) {
            this.FH = null;
            this.Hw = abcd.ClassF.j6;
            if (r1 == null) goto L6;
            this.j6 = r1.j6;
            this.DW = r1.DW;
            this.FH = r1.FH;
            this.Hw = r1.Hw;
            return;
        }

        @Override
        public int getChangingConfigurations() {
            int r0 = this.j6;
            android.graphics.drawable.Drawable.ConstantState r1 = this.DW;
            if (r1 == null) goto L5;
            int r2 = r1.getChangingConfigurations();
        L7:
            return r0 | r2;
        L5:
            r2 = 0;
            goto L7
        }

        boolean j6() {
            if (this.DW == null) goto L5;
            return true;
        L5:
            return false;
        }

        @Override
        public android.graphics.drawable.Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override
        public abstract android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1);
    }

    private static class b extends abcd.ClassF.a {
        b(abcd.ClassF.a r1, android.content.res.Resources r2) {
            super(r1, r2);
        }

        @Override
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
            return new abcd.ClassF(this, r2);
        }
    }

    static {
        j6 = android.graphics.PorterDuff.Mode.SRC_IN;
    }

    ClassF(abcd.ClassF.a r1, android.content.res.Resources r2) {
        this.v5 = r1;
        j6(r2);
    }

    ClassF(android.graphics.drawable.Drawable r2) {
        this.v5 = DW();
        j6(r2);
    }

    private void j6(android.content.res.Resources r2) {
        abcd.ClassF.a r0 = this.v5;
        if (r0 == null) goto L8;
        android.graphics.drawable.Drawable.ConstantState r1 = r0.DW;
        if (r1 == null) goto L9;
        j6(j6(r1, r2));
        return;
    L9:
        return;
    }

    private boolean j6(int[] r5) {
        if (j6() == true) goto L5;
        return false;
    L5:
        abcd.ClassF.a r0 = this.v5;
        android.content.res.ColorStateList r2 = r0.FH;
        android.graphics.PorterDuff.Mode r1 = r0.Hw;
        if (r2 == null) goto L16;
        if (r1 == null) goto L16;
        int r6 = r2.getColorForState(r5, r2.getDefaultColor());
        if (this.Hw == true) goto L11;
    L14:
        setColorFilter(r6, r1);
        this.DW = r6;
        this.FH = r1;
        this.Hw = true;
        return true;
    L11:
        if (r6 != this.DW) goto L14;
        if (r1 != this.FH) goto L14;
    L17:
        return false;
    L16:
        this.Hw = false;
        clearColorFilter();
        goto L17
    }

    abcd.ClassF.a DW() {
        return new abcd.ClassF.b(this.v5, null);
    }

    @Override
    public void draw(android.graphics.Canvas r2) {
        this.VH.draw(r2);
    }

    @Override
    public int getChangingConfigurations() {
        int r0 = super.getChangingConfigurations();
        abcd.ClassF.a r1 = this.v5;
        if (r1 == null) goto L5;
        int r2 = r1.getChangingConfigurations();
    L7:
        return (r0 | r2) | this.VH.getChangingConfigurations();
    L5:
        r2 = 0;
        goto L7
    }

    @Override
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        abcd.ClassF.a r0 = this.v5;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.j6() == false) goto L10;
        abcd.ClassF.a r1 = this.v5;
        r1.j6 = getChangingConfigurations();
        return this.v5;
    L10:
        return null;
    }

    @Override
    public android.graphics.drawable.Drawable getCurrent() {
        return this.VH.getCurrent();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.VH.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.VH.getIntrinsicWidth();
    }

    @Override
    public int getMinimumHeight() {
        return this.VH.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        return this.VH.getMinimumWidth();
    }

    @Override
    public int getOpacity() {
        return this.VH.getOpacity();
    }

    @Override
    public boolean getPadding(android.graphics.Rect r2) {
        return this.VH.getPadding(r2);
    }

    @Override
    public int[] getState() {
        return this.VH.getState();
    }

    @Override
    public android.graphics.Region getTransparentRegion() {
        return this.VH.getTransparentRegion();
    }

    @Override
    public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
        invalidateSelf();
    }

    @Override
    public boolean isStateful() {
        if (j6() == false) goto L7;
        abcd.ClassF.a r0 = this.v5;
        if (r0 == null) goto L7;
        android.content.res.ColorStateList r1 = r0.FH;
    L8:
        if (r1 == null) goto L12;
        if (r1.isStateful() == false) goto L12;
    L13:
        return true;
    L12:
        if (this.VH.isStateful() == true) goto L13;
        return false;
    L7:
        r1 = null;
        goto L8
    }

    protected android.graphics.drawable.Drawable j6(android.graphics.drawable.Drawable.ConstantState r1, android.content.res.Resources r2) {
        return r1.newDrawable(r2);
    }

    public final void j6(android.graphics.drawable.Drawable r3) {
        android.graphics.drawable.Drawable r0 = this.VH;
        if (r0 == null) goto L5;
        r0.setCallback(null);
    L5:
        this.VH = r3;
        if (r3 == null) goto L10;
        r3.setCallback(this);
        setVisible(r3.isVisible(), true);
        setState(r3.getState());
        setLevel(r3.getLevel());
        setBounds(r3.getBounds());
        abcd.ClassF.a r1 = this.v5;
        if (r1 == null) goto L10;
        r1.DW = r3.getConstantState();
    L10:
        invalidateSelf();
    }

    protected boolean j6() {
        return true;
    }

    @Override
    public void jumpToCurrentState() {
        this.VH.jumpToCurrentState();
    }

    @Override
    public android.graphics.drawable.Drawable mutate() {
        if (this.Zo == false) goto L5;
    L17:
        return this;
    L5:
        if (super.mutate() != this) goto L17;
        this.v5 = DW();
        android.graphics.drawable.Drawable r0 = this.VH;
        if (r0 == null) goto L9;
        r0.mutate();
    L9:
        abcd.ClassF.a r1 = this.v5;
        if (r1 == null) goto L16;
        android.graphics.drawable.Drawable r2 = this.VH;
        if (r2 == null) goto L14;
        android.graphics.drawable.Drawable.ConstantState r3 = r2.getConstantState();
    L15:
        r1.DW = r3;
        goto L16
    L14:
        r3 = null;
    L16:
        this.Zo = true;
        goto L17
    }

    @Override
    protected void onBoundsChange(android.graphics.Rect r2) {
        android.graphics.drawable.Drawable r0 = this.VH;
        if (r0 == null) goto L6;
        r0.setBounds(r2);
        return;
    }

    @Override
    protected boolean onLevelChange(int r2) {
        return this.VH.setLevel(r2);
    }

    @Override
    public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
        scheduleSelf(r2, r3);
    }

    @Override
    public void setAlpha(int r2) {
        this.VH.setAlpha(r2);
    }

    @Override
    public void setChangingConfigurations(int r2) {
        this.VH.setChangingConfigurations(r2);
    }

    @Override
    public void setColorFilter(android.graphics.ColorFilter r2) {
        this.VH.setColorFilter(r2);
    }

    @Override
    public void setDither(boolean r2) {
        this.VH.setDither(r2);
    }

    @Override
    public void setFilterBitmap(boolean r2) {
        this.VH.setFilterBitmap(r2);
    }

    @Override
    public boolean setState(int[] r2) {
        boolean r0 = this.VH.setState(r2);
        if (j6(r2) == true) goto L7;
        if (r0 == true) goto L7;
        return false;
    L7:
        return true;
    }

    @Override
    public void setTint(int r1) {
        setTintList(android.content.res.ColorStateList.valueOf(r1));
    }

    @Override
    public void setTintList(android.content.res.ColorStateList r2) {
        this.v5.FH = r2;
        j6(getState());
    }

    @Override
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
        this.v5.Hw = r2;
        j6(getState());
    }

    @Override
    public boolean setVisible(boolean r2, boolean r3) {
        if (super.setVisible(r2, r3) == false) goto L5;
    L8:
        return true;
    L5:
        if (this.VH.setVisible(r2, r3) == true) goto L8;
        return false;
    }

    @Override
    public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
        unscheduleSelf(r2);
    }
}
