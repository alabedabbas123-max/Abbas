package com.jcraft.jsch;

public class JSchException extends java.lang.Exception {
    private java.lang.Throwable j6;

    public JSchException() {
        this.j6 = null;
    }

    public JSchException(java.lang.String r1) {
        super(r1);
        this.j6 = null;
    }

    public JSchException(java.lang.String r1, java.lang.Throwable r2) {
        super(r1);
        this.j6 = null;
        this.j6 = r2;
    }

    @Override
    public java.lang.Throwable getCause() {
        return this.j6;
    }
}
