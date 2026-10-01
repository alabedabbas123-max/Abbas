package com.jcraft.jsch;

class JSchPartialAuthException extends com.jcraft.jsch.JSchException {
    java.lang.String DW;

    public JSchPartialAuthException() {
    }

    public JSchPartialAuthException(java.lang.String r1) {
        super(r1);
        this.DW = r1;
    }

    public java.lang.String j6() {
        return this.DW;
    }
}
