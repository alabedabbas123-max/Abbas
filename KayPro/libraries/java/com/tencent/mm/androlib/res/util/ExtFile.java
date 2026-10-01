package com.tencent.mm.androlib.res.util;

import com.tencent.mm.directory.Directory;
import com.tencent.mm.directory.DirectoryException;
import com.tencent.mm.directory.FileDirectory;
import com.tencent.mm.directory.ZipRODirectory;
import java.io.File;
import java.net.URI;

public class ExtFile extends File {
    private Directory mDirectory;

    public ExtFile(File file) {
        super(file.getPath());
    }

    public ExtFile(File file, String str) {
        super(file, str);
    }

    public ExtFile(String str) {
        super(str);
    }

    public ExtFile(String str, String str2) {
        super(str, str2);
    }

    public ExtFile(URI uri) {
        super(uri);
    }

    public Directory getDirectory() throws DirectoryException {
        if (this.mDirectory == null) {
            if (isDirectory()) {
                this.mDirectory = new FileDirectory(this);
            } else {
                this.mDirectory = new ZipRODirectory(this);
            }
        }
        return this.mDirectory;
    }
}
