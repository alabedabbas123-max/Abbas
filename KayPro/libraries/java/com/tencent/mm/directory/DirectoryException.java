package com.tencent.mm.directory;

public class DirectoryException extends Exception {
    private static final long serialVersionUID = -8871963042836625387L;

    public DirectoryException() {
    }

    public DirectoryException(String str) {
        super(str);
    }

    public DirectoryException(String str, Throwable th) {
        super(str, th);
    }

    public DirectoryException(Throwable th) {
        super(th);
    }
}
