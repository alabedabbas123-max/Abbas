package com.almlkaide.kaypro.android.dx.command.annotool;

import java.lang.annotation.ElementType;
import java.util.EnumSet;
import java.util.Locale;
import org.apache.commons.io.FilenameUtils;

public class Main {

    private static class InvalidArgumentException extends Exception {
        InvalidArgumentException() {
        }

        InvalidArgumentException(String str) {
            super(str);
        }
    }

    enum PrintType {
        CLASS,
        INNERCLASS,
        METHOD,
        PACKAGE;

        public static PrintType valueOf(String str) {
            for (PrintType printType : values()) {
                if (printType.name().equals(str)) {
                    return printType;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    static class Arguments {
        String aclass;
        EnumSet<ElementType> eTypes;
        String[] files;
        EnumSet<PrintType> printTypes;

        Arguments() {
            try {
                this.eTypes = EnumSet.noneOf(Class.forName("java.lang.annotation.ElementType"));
                try {
                    this.printTypes = EnumSet.noneOf(Class.forName("com.almlkaide.kaypro.android.dx.command.annotool.Main$PrintType"));
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            } catch (ClassNotFoundException e2) {
                throw new NoClassDefFoundError(e2.getMessage());
            }
        }

        void parse(String[] strArr) throws InvalidArgumentException {
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                if (str.startsWith("--annotation=")) {
                    String strSubstring = str.substring(str.indexOf(61) + 1);
                    if (this.aclass != null) {
                        throw new InvalidArgumentException("--annotation can only be specified once.");
                    }
                    this.aclass = strSubstring.replace(FilenameUtils.EXTENSION_SEPARATOR, '/');
                } else if (str.startsWith("--element=")) {
                    try {
                        String[] strArrSplit = str.substring(str.indexOf(61) + 1).split(",");
                        for (String str2 : strArrSplit) {
                            this.eTypes.add(ElementType.valueOf(str2.toUpperCase(Locale.ROOT)));
                        }
                    } catch (IllegalArgumentException e) {
                        throw new InvalidArgumentException("invalid --element");
                    }
                } else if (str.startsWith("--print=")) {
                    try {
                        String[] strArrSplit2 = str.substring(str.indexOf(61) + 1).split(",");
                        for (String str3 : strArrSplit2) {
                            this.printTypes.add(PrintType.valueOf(str3.toUpperCase(Locale.ROOT)));
                        }
                    } catch (IllegalArgumentException e2) {
                        throw new InvalidArgumentException("invalid --print");
                    }
                } else {
                    this.files = new String[strArr.length - i];
                    System.arraycopy(strArr, i, this.files, 0, this.files.length);
                    break;
                }
            }
            if (this.aclass == null) {
                throw new InvalidArgumentException("--annotation must be specified");
            }
            if (this.printTypes.isEmpty()) {
                this.printTypes.add(PrintType.CLASS);
            }
            if (this.eTypes.isEmpty()) {
                this.eTypes.add(ElementType.TYPE);
            }
            EnumSet<E> enumSetClone = this.eTypes.clone();
            enumSetClone.remove(ElementType.TYPE);
            enumSetClone.remove(ElementType.PACKAGE);
            if (!enumSetClone.isEmpty()) {
                throw new InvalidArgumentException(new StringBuffer().append("only --element parameters 'type' and 'package' ").append("supported").toString());
            }
        }
    }

    Main() {
    }

    public static void main(String[] strArr) {
        Arguments arguments = new Arguments();
        try {
            arguments.parse(strArr);
            new AnnotationLister(arguments).process();
        } catch (InvalidArgumentException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException("usage");
        }
    }
}
