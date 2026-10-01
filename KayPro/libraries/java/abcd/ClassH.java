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
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (gn != null) { $pc0 = 11; continue $sw0; }
                    try {
                        gn = android.graphics.drawable.Drawable.class.getDeclaredMethod("isProjected", new java.lang.Class[0]);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 6; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 6: {
                    e = $ex0;
                    android.util.Log.w("DrawableWrapperApi21", "Failed to retrieve Drawable#isProjected() method", e);
                    return;
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        android.graphics.drawable.Drawable r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (android.os.Build.VERSION.SDK_INT != 21) { $pc1 = 14; continue $sw1; }
                    r0 = this.VH;
                    if ((r0 instanceof android.graphics.drawable.GradientDrawable) == false) { $pc1 = 7; continue $sw1; }
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    return true;
                }
                case 7: {
                    if ((r0 instanceof android.graphics.drawable.DrawableContainer) == true) { $pc1 = 12; continue $sw1; }
                    if ((r0 instanceof android.graphics.drawable.InsetDrawable) == true) { $pc1 = 12; continue $sw1; }
                    if ((r0 instanceof android.graphics.drawable.RippleDrawable) == true) { $pc1 = 12; continue $sw1; }
                    return false;
                }
                case 14: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (super.setState(r1) == false) { $pc2 = 6; continue $sw2; }
                    invalidateSelf();
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void setTint(int r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (j6() == false) { $pc3 = 5; continue $sw3; }
                    super.setTint(r2);
                    return;
                }
                case 5: {
                    this.VH.setTint(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void setTintList(android.content.res.ColorStateList r2) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (j6() == false) { $pc4 = 5; continue $sw4; }
                    super.setTintList(r2);
                    return;
                }
                case 5: {
                    this.VH.setTintList(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (j6() == false) { $pc5 = 5; continue $sw5; }
                    super.setTintMode(r2);
                    return;
                }
                case 5: {
                    this.VH.setTintMode(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
