package com.almlkaide.kaypro.aide.completion.apiversion;

public class AVUtils {
    public static String methodsParamToSmali(String str) {
        String strSubstring;
        try {
            strSubstring = str.substring(str.indexOf("(") + 1);
            try {
                strSubstring = strSubstring.substring(0, strSubstring.lastIndexOf(")"));
            } catch (Throwable th) {
            }
        } catch (Throwable th2) {
            strSubstring = str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str.substring(0, str.indexOf("(")));
        stringBuffer.append("(");
        String[] strArrSplit = strSubstring.split(",");
        for (String str2 : strArrSplit) {
            String strTrim = str2.trim();
            if (strTrim.contains(" ")) {
                strTrim = strTrim.substring(0, strTrim.indexOf(" "));
            }
            if (strTrim.contains("...")) {
                strTrim = strTrim.substring(0, strTrim.indexOf("..."));
            }
            String strTrim2 = strTrim.trim();
            if (strTrim2.length() != 0) {
                if (strTrim2.endsWith("[]")) {
                    int length = strTrim2.split("\\[").length - 1;
                    for (int i = 0; i < length; i++) {
                        stringBuffer.append("[");
                    }
                    stringBuffer.append(typeToSmali(strTrim2.substring(0, strTrim2.indexOf("["))));
                } else {
                    stringBuffer.append(typeToSmali(strTrim2));
                }
            }
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    private static String typeToSmali(String str) {
        if ("boolean".equals(str)) {
            return "Z";
        }
        if ("byte".equals(str)) {
            return "B";
        }
        if ("short".equals(str)) {
            return "S";
        }
        if ("char".equals(str)) {
            return "C";
        }
        if ("int".equals(str)) {
            return "I";
        }
        if ("long".equals(str)) {
            return "J";
        }
        if ("float".equals(str)) {
            return "F";
        }
        if ("double".equals(str)) {
            return "D";
        }
        if (str != null) {
            if (!str.contains(".")) {
                str = "java.lang.Object";
            }
            if (str.contains("<")) {
                str = str.substring(0, str.indexOf("<"));
            }
            return "L".concat(str.replace(".", "/")).concat(";");
        }
        return str;
    }
}
