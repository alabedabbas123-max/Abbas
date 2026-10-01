package a;

public abstract class an {

    private java.io.File f21a;
    private java.net.URL b;
    private a.an c;
    private java.lang.String d;
    private int e;
    private int f;
    private java.lang.String g;
    private java.lang.String h;

    protected an(java.io.File r1) {
        this.f21a = r1;
    }

    private boolean a(char r2) {
        if (r2 != '-') goto L6;
        return true;
    L6:
        return false;
    }

    private boolean a(char r2, boolean r3) {
        if (r2 != '(') goto L5;
    L13:
        return true;
    L5:
        if (r2 == ')') goto L13;
        if (r2 == ',') goto L13;
        if (r2 == ';') goto L13;
        if (r3 == true) goto L12;
    L15:
        return false;
    L12:
        if (r2 != java.io.File.pathSeparatorChar) goto L15;
        goto L13
    }

    private boolean b(char r2) {
        if (r2 != '#') goto L6;
        return true;
    L6:
        return false;
    }

    private boolean c(char r2) {
        if (d(r2) == false) goto L5;
    L6:
        return true;
    L5:
        if (e(r2) == true) goto L6;
        return false;
    }

    private boolean d(char r2) {
        if (r2 != '@') goto L6;
        return true;
    L6:
        return false;
    }

    private boolean e(char r2) {
        if (r2 != '{') goto L5;
    L16:
        return true;
    L5:
        if (r2 == '}') goto L16;
        if (r2 == '(') goto L16;
        if (r2 == ')') goto L16;
        if (r2 == ',') goto L16;
        if (r2 == ';') goto L16;
        if (r2 == java.io.File.pathSeparatorChar) goto L16;
        return false;
    }

    private boolean f(char r2) {
        if (r2 != '\'') goto L5;
    L6:
        return true;
    L5:
        if (r2 == '\"') goto L6;
        return false;
    }

    protected abstract java.lang.String a();

    public java.lang.String a(boolean r6, boolean r7) {
        this.g = null;
        if (this.c == null) goto L10;
        this.g = this.c.a(r6, r7);
        if (this.g != null) goto L7;
        this.c.c();
        this.c = null;
        goto L10
    L7:
        return this.g;
    L10:
        if (this.d == null) goto L22;
    L12:
        if (this.f >= this.e) goto L17;
        if (java.lang.Character.isWhitespace(this.d.charAt(this.f)) == false) goto L17;
        this.f++;
    L17:
        if (this.f >= this.e) goto L22;
        if (b(this.d.charAt(this.f)) == false) goto L22;
        this.f = this.e;
    L22:
        if (this.d != null) goto L24;
    L25:
        this.d = a();
        if (this.d == null) goto L117;
        this.e = this.d.length();
        this.f = 0;
    L30:
        if (this.f >= this.e) goto L35;
        if (java.lang.Character.isWhitespace(this.d.charAt(this.f)) == false) goto L35;
        this.f++;
    L35:
        if (this.f >= this.e) goto L22;
        if (b(this.d.charAt(this.f)) == false) goto L22;
        java.lang.String r0 = this.d.substring(this.f + 1);
        if (this.h != null) goto L41;
    L40:
        this.h = r0;
        this.f = this.e;
        goto L22
    L41:
        r0 = this.h + '\n' + r0;
        goto L40
    L117:
        return null;
    L24:
        if (this.f == this.e) goto L25;
        int r2 = this.f;
        char r1 = this.d.charAt(r2);
        if (f(r1) == false) goto L53;
        int r3 = r2 + 1;
    L45:
        this.f++;
        if (this.f == this.e) goto L47;
        if (this.d.charAt(this.f) != r1) goto L45;
        int r4 = this.f;
        this.f = r4 + 1;
    L52:
        this.g = this.d.substring(r3, r4);
        return this.g;
    L47:
        this.g = this.d.substring(r3 - 1, this.f);
        throw new java.io.IOException("Missing closing quote for " + g());
    L53:
        if (r6 == false) goto L77;
        if (a(r1) == true) goto L77;
    L57:
        if (this.f >= this.e) goto L69;
        char r5 = this.d.charAt(this.f);
        if (r7 == true) goto L74;
        boolean r8 = true;
    L62:
        if (a(r5, r8) == true) goto L69;
        if (a(r5) == true) goto L68;
        if (b(r5) == true) goto L68;
    L75:
        this.f++;
    L68:
        if (java.lang.Character.isWhitespace(this.d.charAt(this.f - 1)) == false) goto L75;
    L74:
        r8 = false;
    L69:
        r4 = this.f;
    L70:
        if (r4 <= r2) goto L89;
        if (java.lang.Character.isWhitespace(this.d.charAt(r4 - 1)) == false) goto L89;
        r4 = r4 - 1;
    L89:
        r3 = r2;
    L77:
        if (c(r1) == false) goto L81;
        r4 = this.f + 1;
        this.f = r4;
        r3 = r2;
    L81:
        if (this.f >= this.e) goto L88;
        char r9 = this.d.charAt(this.f);
        if (e(r9) == true) goto L88;
        if (java.lang.Character.isWhitespace(r9) == true) goto L88;
        if (b(r9) == true) goto L88;
        this.f++;
    L88:
        r4 = this.f;
        r3 = r2;
        goto L52
    }

    public void a(a.an r2) {
        if (this.c != null) goto L6;
        this.c = r2;
        return;
    L6:
        this.c.a(r2);
    }

    public void a(java.io.File r2) {
        if (this.c == null) goto L6;
        this.c.a(r2);
        return;
    L6:
        this.f21a = r2;
    }

    protected abstract java.lang.String b();

    public void c() {
        if (this.c == null) goto L6;
        this.c.c();
        this.c = null;
        return;
    }

    public java.io.File d() {
        if (this.c == null) goto L7;
        return this.c.d();
    L7:
        return this.f21a;
    }

    public java.net.URL e() {
        if (this.c == null) goto L7;
        return this.c.e();
    L7:
        return this.b;
    }

    public java.lang.String f() {
        if (this.c != null) goto L7;
        java.lang.String r0 = this.h;
        this.h = null;
        return r0;
    L7:
        return this.c.f();
    }

    public java.lang.String g() {
        java.lang.StringBuilder r1 = new java.lang.StringBuilder();
        if (this.c == null) goto L5;
        java.lang.String r0 = this.c.g() + ",\n  included from ";
    L8:
        return r1.append(r0).append(b()).toString();
    L5:
        if (this.g != null) goto L9;
        r0 = "end of ";
        goto L8
    L9:
        r0 = "'" + this.g + "' in ";
        goto L8
    }
}
