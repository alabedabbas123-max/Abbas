package abcd;

class UG implements java.io.FilenameFilter {
    UG() {
    }

    @Override
    public boolean accept(java.io.File r1, java.lang.String r2) {
        return !r2.endsWith(".lock");
    }
}
