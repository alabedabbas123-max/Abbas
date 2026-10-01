package com.jcraft.jsch;

public class SftpException extends java.lang.Exception {
    private java.lang.Throwable DW;
    public int j6;

    public SftpException(int r1, java.lang.String r2) {
        super(r2);
        this.DW = null;
        this.j6 = r1;
    }

    public SftpException(int r1, java.lang.String r2, java.lang.Throwable r3) {
        super(r2);
        this.DW = null;
        this.j6 = r1;
        this.DW = r3;
    }

    @Override
    public java.lang.Throwable getCause() {
        return this.DW;
    }

    @Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(this.j6) + ": " + getMessage();
    }
}
