package abcd;

class bw implements java.io.FilenameFilter {
    final abcd.fw j6;

    bw(abcd.fw r1) {
        this.j6 = r1;
    }

    @Override
    public boolean accept(java.io.File r1, java.lang.String r2) {
        return false;
    }

    public boolean accept_(java.io.File r1, java.lang.String r2) {
        return r2.endsWith(".json");
    }
}
