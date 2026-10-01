package org.xutils.common.util;

public class KeyValue {

    public final String f6724key;
    public final Object value;

    public KeyValue(String str, Object obj) {
        this.f6724key = str;
        this.value = obj;
    }

    public String getValueStrOrEmpty() {
        return this.value == null ? "" : this.value.toString();
    }

    public String getValueStrOrNull() {
        if (this.value == null) {
            return null;
        }
        return this.value.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeyValue keyValue = (KeyValue) obj;
        if (this.f6724key == null) {
            return keyValue.f6724key == null;
        }
        return this.f6724key.equals(keyValue.f6724key);
    }

    public int hashCode() {
        if (this.f6724key != null) {
            return this.f6724key.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "KeyValue{key='" + this.f6724key + "', value=" + this.value + '}';
    }
}
