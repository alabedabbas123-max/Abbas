package org.a.a.a;

public class ClassX {
    public static String m7482a(String str) {
        int iIndexOf = str.indexOf(46);
        int iIndexOf2 = iIndexOf >= 0 ? str.indexOf(46, iIndexOf + 1) : -1;
        int iIndexOf3 = str.indexOf(45);
        int length = str.length();
        int iMin = iIndexOf2 >= 0 ? Math.min(length, iIndexOf2) : length;
        if (iIndexOf3 >= 0) {
            iMin = Math.min(iMin, iIndexOf3);
        }
        return str.substring(0, iMin);
    }

    public static void m7483a(String str, String str2) {
        boolean z = (str == null || "4.7.2".equals(str) || m7482a("4.7.2").equals(m7482a(str))) ? false : true;
        boolean z2 = ("4.7.2".equals(str2) || m7482a("4.7.2").equals(m7482a(str2))) ? false : true;
        if (z) {
            System.err.printf("ANTLR Tool version %s used for code generation does not match the current runtime version %s", str, "4.7.2");
        }
        if (z2) {
            System.err.printf("ANTLR Runtime version %s used for parser compilation does not match the current runtime version %s", str2, "4.7.2");
        }
    }
}
