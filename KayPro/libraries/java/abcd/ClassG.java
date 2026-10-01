package abcd;

class ClassG extends abcd.ClassF {

    private static class a extends abcd.ClassF.a {
        a(abcd.ClassF.a r1, android.content.res.Resources r2) {
            super(r1, r2);
        }

        @Override
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
            return new abcd.ClassG(this, r2);
        }
    }

    ClassG(abcd.ClassF.a r1, android.content.res.Resources r2) {
        super(r1, r2);
    }

    ClassG(android.graphics.drawable.Drawable r1) {
        super(r1);
    }

    @Override
    abcd.ClassF.a DW() {
        return new abcd.ClassG.a(this.v5, null);
    }

    @Override
    public boolean isAutoMirrored() {
        return this.VH.isAutoMirrored();
    }

    @Override
    public void setAutoMirrored(boolean r2) {
        this.VH.setAutoMirrored(r2);
    }
}
