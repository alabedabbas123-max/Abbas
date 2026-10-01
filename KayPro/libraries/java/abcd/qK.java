package abcd;

class qK implements java.security.PrivilegedAction<java.lang.String> {
    qK() {
    }

    @Override
    public java.lang.String run() {
        return run2();
    }

    @Override
    public java.lang.String run2() {
        return java.lang.System.getProperty("os.name");
    }
}
