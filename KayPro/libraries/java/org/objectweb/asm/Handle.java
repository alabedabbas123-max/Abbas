package org.objectweb.asm;

import org.apache.commons.io.FilenameUtils;

public final class Handle {

    final int f6532a;

    final String f6533b;

    final String f6534c;

    final String f6535d;

    public Handle(int i, String str, String str2, String str3) {
        this.f6532a = i;
        this.f6533b = str;
        this.f6534c = str2;
        this.f6535d = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Handle)) {
            return false;
        }
        Handle handle = (Handle) obj;
        return this.f6532a == handle.f6532a && this.f6533b.equals(handle.f6533b) && this.f6534c.equals(handle.f6534c) && this.f6535d.equals(handle.f6535d);
    }

    public String getDesc() {
        return this.f6535d;
    }

    public String getName() {
        return this.f6534c;
    }

    public String getOwner() {
        return this.f6533b;
    }

    public int getTag() {
        return this.f6532a;
    }

    public int hashCode() {
        return this.f6532a + (this.f6533b.hashCode() * this.f6534c.hashCode() * this.f6535d.hashCode());
    }

    public String toString() {
        return new StringBuffer().append(this.f6533b).append(FilenameUtils.EXTENSION_SEPARATOR).append(this.f6534c).append(this.f6535d).append(" (").append(this.f6532a).append(')').toString();
    }
}
