package abcd;

class nK implements java.security.PrivilegedAction<java.lang.String> {
    final abcd.AbstractpK j6;

    nK(abcd.AbstractpK r1) {
        this.j6 = r1;
    }

    @Override
    public java.lang.String run() {
        return run2();
    }

    @Override
    public java.lang.String run2() {
        return java.lang.System.getProperty("user.home");
    }
}
