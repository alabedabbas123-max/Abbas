package org.dom4j.dtd;

import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;

public class InternalEntityDecl {
    private String name;
    private String value;

    public InternalEntityDecl() {
    }

    public InternalEntityDecl(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    private String escapeEntityValue(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            switch (cCharAt) {
                case '\"':
                    stringBuffer.append("&#34;");
                    break;
                case '&':
                    stringBuffer.append("&#38;#38;");
                    break;
                case '\'':
                    stringBuffer.append("&#39;");
                    break;
                case '<':
                    stringBuffer.append("&#38;#60;");
                    break;
                case ByteOps.ISTORE_3:
                    stringBuffer.append("&#62;");
                    break;
                default:
                    if (cCharAt < ' ') {
                        stringBuffer.append(new StringBuffer().append("&#").append((int) cCharAt).append(";").toString());
                    } else {
                        stringBuffer.append(cCharAt);
                    }
                    break;
            }
        }
        return stringBuffer.toString();
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("<!ENTITY ");
        if (this.name.startsWith("%")) {
            stringBuffer.append("% ");
            stringBuffer.append(this.name.substring(1));
        } else {
            stringBuffer.append(this.name);
        }
        stringBuffer.append(" \"");
        stringBuffer.append(escapeEntityValue(this.value));
        stringBuffer.append("\">");
        return stringBuffer.toString();
    }
}
