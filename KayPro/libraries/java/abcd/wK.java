package abcd;

class wK implements java.security.PrivilegedAction<java.lang.String> {
    wK() {
    }

    @Override
    public java.lang.String run() {
        return run2();
    }

    @Override
    public java.lang.String run2() {
        return java.lang.System.getProperty("java.library.path");
    }
}
