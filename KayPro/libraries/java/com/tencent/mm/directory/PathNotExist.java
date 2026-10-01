package com.tencent.mm.directory;

public class PathNotExist extends DirectoryException {
    private static final long serialVersionUID = -6949242015506342032L;

    public PathNotExist() {
    }

    public PathNotExist(String str) {
        super(str);
    }

    public PathNotExist(String str, Throwable th) {
        super(str, th);
    }

    public PathNotExist(Throwable th) {
        super(th);
    }
}
