package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.IOCase;

public class PathFileComparator extends AbstractFileComparator implements Serializable {
    private static final long serialVersionUID = 6527501707585768673L;
    private final IOCase caseSensitivity;
    public static final Comparator<File> PATH_COMPARATOR = new PathFileComparator();
    public static final Comparator<File> PATH_REVERSE = new ReverseComparator(PATH_COMPARATOR);
    public static final Comparator<File> PATH_INSENSITIVE_COMPARATOR = new PathFileComparator(IOCase.INSENSITIVE);
    public static final Comparator<File> PATH_INSENSITIVE_REVERSE = new ReverseComparator(PATH_INSENSITIVE_COMPARATOR);
    public static final Comparator<File> PATH_SYSTEM_COMPARATOR = new PathFileComparator(IOCase.SYSTEM);
    public static final Comparator<File> PATH_SYSTEM_REVERSE = new ReverseComparator(PATH_SYSTEM_COMPARATOR);

    public PathFileComparator() {
        this.caseSensitivity = IOCase.SENSITIVE;
    }

    public PathFileComparator(IOCase iOCase) {
        this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
    }

    @Override
    public int compare(File file, File file2) {
        return this.caseSensitivity.checkCompareTo(file.getPath(), file2.getPath());
    }

    @Override
    public List sort(List list) {
        return super.sort((List<File>) list);
    }

    @Override
    public File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    @Override
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.caseSensitivity + "]";
    }
}
