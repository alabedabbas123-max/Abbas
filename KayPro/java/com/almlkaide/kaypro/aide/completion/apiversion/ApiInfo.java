package com.almlkaide.kaypro.aide.completion.apiversion;

import com.almlkaide.kaypro.util.Utils;

public class ApiInfo {
    public int deprecated;
    public String name;
    public int removed;
    public int since;
    public Type type;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        boolean zIsCN = Utils.isCN();
        if (this.since > 1) {
            stringBuffer.append(String.format(zIsCN ? "在 API %d 中添加" : "Added in API level %d", new Integer(this.since)));
        }
        if (this.deprecated > 1) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(String.format(zIsCN ? "在 API %d 中弃用" : "Deprecated in API level %d", new Integer(this.deprecated)));
        }
        if (this.removed > 1) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(String.format(zIsCN ? "在 API %d 中移除" : "Removed in API level %d", new Integer(this.removed)));
        }
        return stringBuffer.toString();
    }

    public enum Type {
        CLASS,
        FIELD,
        METHOD;

        public static Type valueOf(String str) {
            for (Type type : values()) {
                if (type.name().equals(str)) {
                    return type;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
