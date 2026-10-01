package a.j;

import java.util.ArrayList;
import java.util.List;

public class ClassK {
    private static int m3156a(String str, int i) {
        while (i < str.length() && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static String m3157a(List list, boolean z) {
        if (list == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return stringBuffer.toString();
            }
            if (i2 > 0) {
                stringBuffer.append(',');
            }
            String strM3159b = (String) list.get(i2);
            if (z) {
                strM3159b = m3159b(strM3159b);
            }
            stringBuffer.append(strM3159b);
            i = i2 + 1;
        }
    }

    public static List m3158a(String str) {
        int iIndexOf;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int iM3156a = m3156a(str, i);
            if (iM3156a >= str.length()) {
                return arrayList;
            }
            if (str.charAt(iM3156a) == '\'') {
                iIndexOf = str.indexOf(39, iM3156a + 1);
                if (iIndexOf < 0) {
                    iIndexOf = str.length();
                }
                arrayList.add(str.substring(iM3156a + 1, iIndexOf));
            } else {
                iIndexOf = str.indexOf(44, iM3156a);
                if (iIndexOf < 0) {
                    iIndexOf = str.length();
                }
                String strTrim = str.substring(iM3156a, iIndexOf).trim();
                if (strTrim.length() > 0) {
                    arrayList.add(strTrim);
                }
            }
            i = iIndexOf + 1;
        }
    }

    private static String m3159b(String str) {
        return (str.length() == 0 || str.indexOf(32) >= 0 || str.indexOf(64) >= 0 || str.indexOf(123) >= 0 || str.indexOf(125) >= 0 || str.indexOf(40) >= 0 || str.indexOf(41) >= 0 || str.indexOf(58) >= 0 || str.indexOf(59) >= 0 || str.indexOf(44) >= 0) ? "'" + str + "'" : str;
    }
}
