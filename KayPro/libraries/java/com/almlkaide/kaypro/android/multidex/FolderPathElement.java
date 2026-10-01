package com.almlkaide.kaypro.android.multidex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

class FolderPathElement implements ClassPathElement {
    private final File baseFolder;

    @Override
    public void close() {
    }

    public FolderPathElement(File file) {
        this.baseFolder = file;
    }

    @Override
    public InputStream open(String str) throws FileNotFoundException {
        return new FileInputStream(new File(this.baseFolder, str.replace('/', File.separatorChar)));
    }

    @Override
    public Iterable<String> list() {
        ArrayList<String> arrayList = new ArrayList<>();
        collect(this.baseFolder, "", arrayList);
        return arrayList;
    }

    private void collect(File file, String str, ArrayList<String> arrayList) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                collect(file2, new StringBuffer().append(new StringBuffer().append(str).append('/').toString()).append(file2.getName()).toString(), arrayList);
            } else {
                arrayList.add(new StringBuffer().append(new StringBuffer().append(str).append('/').toString()).append(file2.getName()).toString());
            }
        }
    }
}
