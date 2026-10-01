package abcd;

class xI implements java.security.PrivilegedAction<java.lang.String> {
    xI() {
    }

    @Override
    public java.lang.String run() {
        return run2();
    }

    @Override
    public java.lang.String run2() {
        return java.lang.System.getProperty("user.name");
    }
}
