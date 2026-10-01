package com.almlkaide.kaypro.android.dx.command.annotool;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.BaseAnnotations;
import com.almlkaide.kaypro.android.dx.cf.direct.ClassPathOpener;
import com.almlkaide.kaypro.android.dx.cf.direct.DirectClassFile;
import com.almlkaide.kaypro.android.dx.cf.direct.StdAttributeFactory;
import com.almlkaide.kaypro.android.dx.cf.iface.Attribute;
import com.almlkaide.kaypro.android.dx.cf.iface.AttributeList;
import com.almlkaide.kaypro.android.dx.rop.annotation.Annotation;
import com.almlkaide.kaypro.android.dx.util.ByteArray;
import java.io.File;
import java.lang.annotation.ElementType;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.io.FilenameUtils;

class AnnotationLister {
    private static final String PACKAGE_INFO = "package-info";
    private final Main.Arguments args;
    HashSet<String> matchInnerClassesOf = new HashSet<>();
    HashSet<String> matchPackages = new HashSet<>();

    AnnotationLister(Main.Arguments arguments) {
        this.args = arguments;
    }

    void process() {
        for (String str : this.args.files) {
            new ClassPathOpener(str, true, new ClassPathOpener.Consumer(this) {
                private final AnnotationLister this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onProcessArchiveStart(File file) {
                }

                @Override
                public boolean processFileBytes(String str2, long j, byte[] bArr) {
                    if (str2.endsWith(".class")) {
                        DirectClassFile directClassFile = new DirectClassFile(new ByteArray(bArr), str2, true);
                        directClassFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
                        AttributeList attributes = directClassFile.getAttributes();
                        String className = directClassFile.getThisClass().getClassType().getClassName();
                        if (className.endsWith("package-info")) {
                            for (Attribute attributeFindFirst = attributes.findFirst(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME); attributeFindFirst != null; attributeFindFirst = attributes.findNext(attributeFindFirst)) {
                                this.this$0.visitPackageAnnotation(directClassFile, (BaseAnnotations) attributeFindFirst);
                            }
                            for (Attribute attributeFindFirst2 = attributes.findFirst(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME); attributeFindFirst2 != null; attributeFindFirst2 = attributes.findNext(attributeFindFirst2)) {
                                this.this$0.visitPackageAnnotation(directClassFile, (BaseAnnotations) attributeFindFirst2);
                            }
                        } else if (this.this$0.isMatchingInnerClass(className) || this.this$0.isMatchingPackage(className)) {
                            this.this$0.printMatch(directClassFile);
                        } else {
                            for (Attribute attributeFindFirst3 = attributes.findFirst(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME); attributeFindFirst3 != null; attributeFindFirst3 = attributes.findNext(attributeFindFirst3)) {
                                this.this$0.visitClassAnnotation(directClassFile, (BaseAnnotations) attributeFindFirst3);
                            }
                            for (Attribute attributeFindFirst4 = attributes.findFirst(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME); attributeFindFirst4 != null; attributeFindFirst4 = attributes.findNext(attributeFindFirst4)) {
                                this.this$0.visitClassAnnotation(directClassFile, (BaseAnnotations) attributeFindFirst4);
                            }
                        }
                    }
                    return true;
                }

                @Override
                public void onException(Exception exc) {
                    throw new RuntimeException(exc);
                }
            }).process();
        }
    }

    public void visitClassAnnotation(DirectClassFile directClassFile, BaseAnnotations baseAnnotations) {
        if (this.args.eTypes.contains(ElementType.TYPE)) {
            Iterator<Annotation> it = baseAnnotations.getAnnotations().getAnnotations().iterator();
            while (it.hasNext()) {
                if (this.args.aclass.equals(it.next().getType().getClassType().getClassName())) {
                    printMatch(directClassFile);
                }
            }
        }
    }

    public void visitPackageAnnotation(DirectClassFile directClassFile, BaseAnnotations baseAnnotations) {
        String strSubstring;
        if (this.args.eTypes.contains(ElementType.PACKAGE)) {
            String className = directClassFile.getThisClass().getClassType().getClassName();
            int iLastIndexOf = className.lastIndexOf(47);
            if (iLastIndexOf == -1) {
                strSubstring = "";
            } else {
                strSubstring = className.substring(0, iLastIndexOf);
            }
            Iterator<Annotation> it = baseAnnotations.getAnnotations().getAnnotations().iterator();
            while (it.hasNext()) {
                if (this.args.aclass.equals(it.next().getType().getClassType().getClassName())) {
                    printMatchPackage(strSubstring);
                }
            }
        }
    }

    private void printMatchPackage(String str) {
        for (Main.PrintType printType : this.args.printTypes) {
            if (printType == Main.PrintType.CLASS || printType == Main.PrintType.INNERCLASS || printType == Main.PrintType.METHOD) {
                this.matchPackages.add(str);
            } else if (printType == Main.PrintType.PACKAGE) {
                System.out.println(str.replace('/', FilenameUtils.EXTENSION_SEPARATOR));
            }
        }
    }

    public void printMatch(DirectClassFile directClassFile) {
        for (Main.PrintType printType : this.args.printTypes) {
            if (printType == Main.PrintType.CLASS) {
                System.out.println(directClassFile.getThisClass().getClassType().getClassName().replace('/', FilenameUtils.EXTENSION_SEPARATOR));
            } else if (printType == Main.PrintType.INNERCLASS) {
                this.matchInnerClassesOf.add(directClassFile.getThisClass().getClassType().getClassName());
            } else if (printType == Main.PrintType.METHOD || printType == Main.PrintType.PACKAGE) {
            }
        }
    }

    public boolean isMatchingInnerClass(String str) {
        do {
            int iLastIndexOf = str.lastIndexOf(36);
            if (iLastIndexOf <= 0) {
                return false;
            }
            str = str.substring(0, iLastIndexOf);
        } while (!this.matchInnerClassesOf.contains(str));
        return true;
    }

    public boolean isMatchingPackage(String str) {
        String strSubstring;
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf == -1) {
            strSubstring = "";
        } else {
            strSubstring = str.substring(0, iLastIndexOf);
        }
        return this.matchPackages.contains(strSubstring);
    }
}
