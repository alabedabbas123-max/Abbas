package com.tencent.mm.directory;

public class PathAlreadyExists extends DirectoryException {
    private static final long serialVersionUID = 3776428251424428904L;

    public PathAlreadyExists() {
    }

    public PathAlreadyExists(String str) {
        super(str);
    }

    public PathAlreadyExists(String str, Throwable th) {
        super(str, th);
    }

    public PathAlreadyExists(Throwable th) {
        super(th);
    }
}
