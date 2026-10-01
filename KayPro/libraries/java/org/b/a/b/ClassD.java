package org.b.a.b;

final class ClassD implements Comparable {

    public final char f5443a;

    public final byte f5444b;

    ClassD(byte b, char c) {
        this.f5444b = b;
        this.f5443a = c;
    }

    @Override
    public int compareTo(ClassD c1812d) {
        return this.f5443a - c1812d.f5443a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ClassD)) {
            return false;
        }
        ClassD c1812d = (ClassD) obj;
        return this.f5443a == c1812d.f5443a && this.f5444b == c1812d.f5444b;
    }

    public int hashCode() {
        return this.f5443a;
    }

    public String toString() {
        return "0x" + Integer.toHexString(65535 & this.f5443a) + "->0x" + Integer.toHexString(this.f5444b & 255);
    }
}
