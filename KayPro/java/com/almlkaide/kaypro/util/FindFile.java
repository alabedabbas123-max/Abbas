package com.almlkaide.kaypro.util;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class FindFile {
    public static List<File> find(File file, FileFilter fileFilter) {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return arrayList;
        }
        for (File file2 : fileArrListFiles) {
            if (fileFilter.accept(file2)) {
                if (file2.isDirectory()) {
                    arrayList.addAll(find(file2, fileFilter));
                } else {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }
}
