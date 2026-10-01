package org.c.a.a.c.c.a.a;

public class ClassC {
    public static String m8760a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\' || cCharAt == '\"' || cCharAt < ' ') {
                StringBuilder sb = new StringBuilder(length * 2);
                sb.append(str.substring(0, i));
                while (i < length) {
                    char cCharAt2 = str.charAt(i);
                    switch (cCharAt2) {
                        case '\b':
                            sb.append("\\b");
                            break;
                        case '\t':
                            sb.append("\\t");
                            break;
                        case '\n':
                            sb.append("\\n");
                            break;
                        case '\f':
                            sb.append("\\f");
                            break;
                        case '\r':
                            sb.append("\\r");
                            break;
                        case '\"':
                            sb.append("\\\"");
                            break;
                        case '\\':
                            sb.append("\\\\");
                            break;
                        default:
                            if (cCharAt2 >= ' ') {
                                sb.append(cCharAt2);
                            } else {
                                sb.append("\\0");
                                sb.append((char) ((cCharAt2 >> 3) + 48));
                                sb.append((char) ((cCharAt2 & 7) + 48));
                            }
                            break;
                    }
                    i++;
                }
                return sb.toString();
            }
            i++;
        }
        return str;
    }
}
