package org.c.a.a.c.a.a.c;

final class ae {

    public String f6084a;

    public char[] f6085b;

    public int f6086c;

    public int f6087d;

    public ae(String str) {
        this(str, 0);
    }

    public ae(String str, int i) {
        this.f6087d = 0;
        this.f6084a = str;
        this.f6085b = str.toCharArray();
        this.f6086c = this.f6085b.length;
        this.f6087d = i;
    }

    public char m8426a() {
        char[] cArr = this.f6085b;
        int i = this.f6087d;
        this.f6087d = i + 1;
        return cArr[i];
    }

    public String m8427a(int i) {
        return new String(this.f6085b, i, this.f6087d - i);
    }

    public boolean m8428a(char c) {
        return this.f6087d < this.f6086c && this.f6085b[this.f6087d] == c;
    }

    public char m8429b() {
        int length = this.f6085b.length;
        while (this.f6087d < length) {
            char c = this.f6085b[this.f6087d];
            if (c == '<' || c == ';') {
                return c;
            }
            this.f6087d++;
        }
        return (char) 0;
    }

    public boolean m8430b(char c) {
        int length = this.f6085b.length;
        for (int i = this.f6087d; i < length; i++) {
            if (this.f6085b[i] == c) {
                this.f6087d = i;
                return true;
            }
        }
        return false;
    }

    public boolean m8431c() {
        return this.f6087d < this.f6086c;
    }

    public String toString() {
        return "SignatureReader{index=" + this.f6087d + ", nextChars=" + new String(this.f6085b, this.f6087d, this.f6086c - this.f6087d) + "}";
    }
}
