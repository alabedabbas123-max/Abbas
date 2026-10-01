package abcd;

final class Lx extends abcd.Ix {
    private final abcd.Jx DW;

    Lx() {
        this.DW = new abcd.Jx();
    }

    @Override
    public final void j6(java.lang.Throwable r3, java.lang.Throwable r4) {
        if (r4 == r3) goto L9;
        if (r4 == null) goto L7;
        this.DW.j6(r3, true).add(r4);
        return;
    L7:
        throw new java.lang.NullPointerException("The suppressed exception cannot be null.");
    L9:
        throw new java.lang.IllegalArgumentException("Self suppression is not allowed.", r4);
    }
}
