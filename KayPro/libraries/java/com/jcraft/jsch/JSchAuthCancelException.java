package com.jcraft.jsch;

class JSchAuthCancelException extends com.jcraft.jsch.JSchException {
    java.lang.String DW;

    JSchAuthCancelException() {
    }

    JSchAuthCancelException(java.lang.String r1) {
        super(r1);
        this.DW = r1;
    }
}
