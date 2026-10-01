package abcd;

class xK implements java.security.PrivilegedAction<java.lang.String> {
    final abcd.yK j6;

    xK(abcd.yK r1) {
        this.j6 = r1;
    }

    @Override
    public java.lang.String run() {
        return run2();
    }

    @Override
    public java.lang.String run2() {
        return java.lang.System.getenv("HOME");
    }
}
