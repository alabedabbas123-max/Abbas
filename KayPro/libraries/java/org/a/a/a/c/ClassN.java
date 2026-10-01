package org.a.a.a.c;

public class ClassN {
    public static String m7409a(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == ' ' && z) {
                sb.append((char) 183);
            } else if (c == '\t') {
                sb.append("\\t");
            } else if (c == '\n') {
                sb.append("\\n");
            } else if (c == '\r') {
                sb.append("\\r");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
