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
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        this.FH = null;
                        this.Hw = abcd.ClassF.j6;
                        if (r1 == null) { $pc0 = 6; continue $sw0; }
                        this.j6 = r1.j6;
                        this.DW = r1.DW;
                        this.FH = r1.FH;
                        this.Hw = r1.Hw;
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public int getChangingConfigurations() {
            int r0 = 0;
            android.graphics.drawable.Drawable.ConstantState r1 = null;
            int r2 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = this.j6;
                        r1 = this.DW;
                        if (r1 == null) { $pc1 = 5; continue $sw1; }
                        r2 = r1.getChangingConfigurations();
                        $pc1 = 7; continue $sw1;
                    }
                    case 7: {
                        return r0 | r2;
                    }
                    case 5: {
                        r2 = 0;
                        { $pc1 = 7; continue $sw1; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        boolean j6() {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (this.DW == null) { $pc2 = 5; continue $sw2; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
        abcd.ClassF.a r0 = null;
        android.graphics.drawable.Drawable.ConstantState r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.v5;
                    if (r0 == null) { $pc3 = 8; continue $sw3; }
                    r1 = r0.DW;
                    if (r1 == null) { $pc3 = 9; continue $sw3; }
                    j6(j6(r1, r2));
                    return;
                }
                case 9: {
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(int[] r5) {
        abcd.ClassF.a r0 = null;
        android.content.res.ColorStateList r2 = null;
        android.graphics.PorterDuff.Mode r1 = null;
        int r6 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (j6() == true) { $pc4 = 5; continue $sw4; }
                    return false;
                }
                case 5: {
                    r0 = this.v5;
                    r2 = r0.FH;
                    r1 = r0.Hw;
                    if (r2 == null) { $pc4 = 16; continue $sw4; }
                    if (r1 == null) { $pc4 = 16; continue $sw4; }
                    r6 = r2.getColorForState(r5, r2.getDefaultColor());
                    if (this.Hw == true) { $pc4 = 11; continue $sw4; }
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    setColorFilter(r6, r1);
                    this.DW = r6;
                    this.FH = r1;
                    this.Hw = true;
                    return true;
                }
                case 11: {
                    if (r6 != this.DW) { $pc4 = 14; continue $sw4; }
                    if (r1 != this.FH) { $pc4 = 14; continue $sw4; }
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    return false;
                }
                case 16: {
                    this.Hw = false;
                    clearColorFilter();
                    { $pc4 = 17; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        int r0 = 0;
        abcd.ClassF.a r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = super.getChangingConfigurations();
                    r1 = this.v5;
                    if (r1 == null) { $pc5 = 5; continue $sw5; }
                    r2 = r1.getChangingConfigurations();
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    return (r0 | r2) | this.VH.getChangingConfigurations();
                }
                case 5: {
                    r2 = 0;
                    { $pc5 = 7; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        abcd.ClassF.a r0 = null;
        abcd.ClassF.a r1 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.v5;
                    if (r0 != null) { $pc6 = 5; continue $sw6; }
                    return null;
                }
                case 5: {
                    if (r0.j6() == false) { $pc6 = 10; continue $sw6; }
                    r1 = this.v5;
                    r1.j6 = getChangingConfigurations();
                    return this.v5;
                }
                case 10: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        abcd.ClassF.a r0 = null;
        android.content.res.ColorStateList r1 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (j6() == false) { $pc7 = 7; continue $sw7; }
                    r0 = this.v5;
                    if (r0 == null) { $pc7 = 7; continue $sw7; }
                    r1 = r0.FH;
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    if (r1 == null) { $pc7 = 12; continue $sw7; }
                    if (r1.isStateful() == false) { $pc7 = 12; continue $sw7; }
                    $pc7 = 13; continue $sw7;
                }
                case 13: {
                    return true;
                }
                case 12: {
                    if (this.VH.isStateful() == true) { $pc7 = 13; continue $sw7; }
                    return false;
                }
                case 7: {
                    r1 = null;
                    { $pc7 = 8; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected android.graphics.drawable.Drawable j6(android.graphics.drawable.Drawable.ConstantState r1, android.content.res.Resources r2) {
        return r1.newDrawable(r2);
    }

    public final void j6(android.graphics.drawable.Drawable r3) {
        android.graphics.drawable.Drawable r0 = null;
        abcd.ClassF.a r1 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.VH;
                    if (r0 == null) { $pc8 = 5; continue $sw8; }
                    r0.setCallback(null);
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    this.VH = r3;
                    if (r3 == null) { $pc8 = 10; continue $sw8; }
                    r3.setCallback(this);
                    setVisible(r3.isVisible(), true);
                    setState(r3.getState());
                    setLevel(r3.getLevel());
                    setBounds(r3.getBounds());
                    r1 = this.v5;
                    if (r1 == null) { $pc8 = 10; continue $sw8; }
                    r1.DW = r3.getConstantState();
                    $pc8 = 10; continue $sw8;
                }
                case 10: {
                    invalidateSelf();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        android.graphics.drawable.Drawable r0 = null;
        abcd.ClassF.a r1 = null;
        android.graphics.drawable.Drawable r2 = null;
        android.graphics.drawable.Drawable.ConstantState r3 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (this.Zo == false) { $pc9 = 5; continue $sw9; }
                    $pc9 = 17; continue $sw9;
                }
                case 17: {
                    return this;
                }
                case 5: {
                    if (super.mutate() != this) { $pc9 = 17; continue $sw9; }
                    this.v5 = DW();
                    r0 = this.VH;
                    if (r0 == null) { $pc9 = 9; continue $sw9; }
                    r0.mutate();
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    r1 = this.v5;
                    if (r1 == null) { $pc9 = 16; continue $sw9; }
                    r2 = this.VH;
                    if (r2 == null) { $pc9 = 14; continue $sw9; }
                    r3 = r2.getConstantState();
                    $pc9 = 15; continue $sw9;
                }
                case 15: {
                    r1.DW = r3;
                    { $pc9 = 16; continue $sw9; }
                }
                case 14: {
                    r3 = null;
                    $pc9 = 16; continue $sw9;
                }
                case 16: {
                    this.Zo = true;
                    { $pc9 = 17; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void onBoundsChange(android.graphics.Rect r2) {
        android.graphics.drawable.Drawable r0 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = this.VH;
                    if (r0 == null) { $pc10 = 6; continue $sw10; }
                    r0.setBounds(r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        boolean r0 = false;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = this.VH.setState(r2);
                    if (j6(r2) == true) { $pc11 = 7; continue $sw11; }
                    if (r0 == true) { $pc11 = 7; continue $sw11; }
                    return false;
                }
                case 7: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (super.setVisible(r2, r3) == false) { $pc12 = 5; continue $sw12; }
                    $pc12 = 8; continue $sw12;
                }
                case 8: {
                    return true;
                }
                case 5: {
                    if (this.VH.setVisible(r2, r3) == true) { $pc12 = 8; continue $sw12; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
        unscheduleSelf(r2);
    }
}
