package abcd;

class FJ implements java.util.Comparator<java.lang.String> {
    private final java.util.HashMap DW;
    final abcd.GJ.a j6;

    FJ(abcd.GJ.a r1, java.util.HashMap r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public int compare(java.lang.String r1, java.lang.String r2) {
        return j6(r1, r2);
    }

    public int j6(java.lang.String r2, java.lang.String r3) {
        return ((java.lang.Integer) this.DW.get(r3)).intValue() - ((java.lang.Integer) this.DW.get(r2)).intValue();
    }
}
