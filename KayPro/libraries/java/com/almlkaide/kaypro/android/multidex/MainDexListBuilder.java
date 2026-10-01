package com.almlkaide.kaypro.android.multidex;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.direct.DirectClassFile;
import com.almlkaide.kaypro.android.dx.cf.iface.Attribute;
import com.almlkaide.kaypro.android.dx.cf.iface.FieldList;
import com.almlkaide.kaypro.android.dx.cf.iface.HasAttribute;
import com.almlkaide.kaypro.android.dx.cf.iface.MethodList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipFile;

public class MainDexListBuilder {
    private static final String CLASS_EXTENSION = ".class";
    private static final String DISABLE_ANNOTATION_RESOLUTION_WORKAROUND = "--disable-annotation-resolution-workaround";
    private static final int STATUS_ERROR = 1;
    private Set<String> filesToKeep = new HashSet();

    private static final String f5089EOL = System.getProperty("line.separator");
    private static final String USAGE_MESSAGE = new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Usage:").append(f5089EOL).toString()).append(f5089EOL).toString()).append("Short version: Don't use this.").toString()).append(f5089EOL).toString()).append(f5089EOL).toString()).append("Slightly longer version: This tool is used by mainDexClasses script to build").toString()).append(f5089EOL).toString()).append("the main dex list.").toString()).append(f5089EOL).toString();

    public static void main(String[] strArr) {
        boolean z = true;
        int i = 0;
        while (i < strArr.length - 2) {
            if (strArr[i].equals(DISABLE_ANNOTATION_RESOLUTION_WORKAROUND)) {
                z = false;
            } else {
                System.err.println(new StringBuffer().append("Invalid option ").append(strArr[i]).toString());
                printUsage();
                System.exit(1);
            }
            i++;
        }
        if (strArr.length - i != 2) {
            printUsage();
            System.exit(1);
        }
        try {
            printList(new MainDexListBuilder(z, strArr[i], strArr[i + 1]).getMainDexList());
        } catch (IOException e) {
            System.err.println(new StringBuffer().append("A fatal error occured: ").append(e.getMessage()).toString());
            System.exit(1);
        }
    }

    public MainDexListBuilder(boolean z, String str, String str2) throws Throwable {
        ZipFile zipFile;
        ZipFile zipFile2 = (ZipFile) null;
        Path path = (Path) null;
        try {
            try {
                zipFile = new ZipFile(str);
                try {
                    Path path2 = new Path(str2);
                    try {
                        ClassReferenceListBuilder classReferenceListBuilder = new ClassReferenceListBuilder(path2);
                        classReferenceListBuilder.addRoots(zipFile);
                        Iterator<String> it = classReferenceListBuilder.getClassNames().iterator();
                        while (it.hasNext()) {
                            this.filesToKeep.add(new StringBuffer().append(it.next()).append(CLASS_EXTENSION).toString());
                        }
                        if (z) {
                            keepAnnotated(path2);
                        }
                        try {
                            zipFile.close();
                        } catch (IOException e) {
                        }
                        if (path2 != null) {
                            Iterator<ClassPathElement> it2 = path2.elements.iterator();
                            while (it2.hasNext()) {
                                try {
                                    it2.next().close();
                                } catch (IOException e2) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        path = path2;
                        try {
                            zipFile.close();
                        } catch (IOException e3) {
                        }
                        if (path == null) {
                            throw th;
                        }
                        Iterator<ClassPathElement> it3 = path.elements.iterator();
                        while (it3.hasNext()) {
                            try {
                                it3.next().close();
                            } catch (IOException e4) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                zipFile = zipFile2;
            }
        } catch (IOException e5) {
            throw new IOException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("\"").append(str).toString()).append("\" can not be read as a zip archive. (").toString()).append(e5.getMessage()).toString()).append(")").toString(), e5);
        }
    }

    public Set<String> getMainDexList() {
        return this.filesToKeep;
    }

    private static void printUsage() {
        System.err.print(USAGE_MESSAGE);
    }

    private static void printList(Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private void keepAnnotated(Path path) throws FileNotFoundException {
        Iterator<ClassPathElement> it = path.getElements().iterator();
        while (it.hasNext()) {
            for (String str : it.next().list()) {
                if (str.endsWith(CLASS_EXTENSION)) {
                    DirectClassFile directClassFile = path.getClass(str);
                    if (hasRuntimeVisibleAnnotation(directClassFile)) {
                        this.filesToKeep.add(str);
                    } else {
                        MethodList methods = directClassFile.getMethods();
                        int i = 0;
                        while (true) {
                            if (i >= methods.size()) {
                                FieldList fields = directClassFile.getFields();
                                for (int i2 = 0; i2 < fields.size(); i2++) {
                                    if (hasRuntimeVisibleAnnotation(fields.mo7139get(i2))) {
                                        this.filesToKeep.add(str);
                                        break;
                                    }
                                }
                                break;
                            }
                            if (hasRuntimeVisibleAnnotation(methods.mo7140get(i))) {
                                this.filesToKeep.add(str);
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    private boolean hasRuntimeVisibleAnnotation(HasAttribute hasAttribute) {
        Attribute attributeFindFirst = hasAttribute.getAttributes().findFirst(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
        return attributeFindFirst != null && ((AttRuntimeVisibleAnnotations) attributeFindFirst).getAnnotations().size() > 0;
    }
}
