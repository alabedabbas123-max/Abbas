package abcd;

public abstract class _w implements java.io.Serializable {
    public final java.lang.String DW;
    public final java.lang.String j6;

    public _w(java.lang.String r3, java.lang.String r4) {
        if (r3 == null) goto L14;
        if (r3.contains("|") == true) goto L12;
        if (r4 == null) goto L10;
        this.j6 = r3;
        this.DW = r4;
        return;
    L10:
        throw new java.lang.IllegalArgumentException("'secret' must be non-null");
    L12:
        throw new java.lang.IllegalArgumentException("'key' must not contain a \"|\" character: \"" + r3 + "\"");
    L14:
        throw new java.lang.IllegalArgumentException("'key' must be non-null");
    }

    public boolean equals(java.lang.Object r2) {
        if ((r2 instanceof abcd._w) == true) goto L5;
    L7:
        return false;
    L5:
        if (j6((abcd._w) r2) == false) goto L7;
        return true;
    }

    public int hashCode() {
        return this.j6.hashCode() ^ (this.DW.hashCode() << 1);
    }

    public boolean j6(abcd._w r3) {
        if (this.j6.equals(r3.j6) == true) goto L5;
    L7:
        return false;
    L5:
        if (this.DW.equals(r3.DW) == false) goto L7;
        return true;
    }

    public java.lang.String toString() {
        return "{key=\"" + this.j6 + "\", secret=\"" + this.DW.charAt(0) + "...\"}";
    }
}
