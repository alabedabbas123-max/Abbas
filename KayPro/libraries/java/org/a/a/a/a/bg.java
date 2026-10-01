package org.a.a.a.a;

public class bg extends Abstractax {

    static final boolean f5180c;

    public final Abstractax f5181a;

    public final int f5182b;

    static {
        f5180c = !bg.class.desiredAssertionStatus();
    }

    bg(Abstractax abstractC1709ax, int i) {
        super(abstractC1709ax != null ? m7289a(abstractC1709ax, i) : m7296d());
        if (!f5180c && i == -1) {
            throw new AssertionError();
        }
        this.f5181a = abstractC1709ax;
        this.f5182b = i;
    }

    public static bg m7307b(Abstractax abstractC1709ax, int i) {
        return (i == Integer.MAX_VALUE && abstractC1709ax == null) ? f5157d : new bg(abstractC1709ax, i);
    }

    @Override
    public Abstractax mo7297a(int i) {
        if (f5180c || i == 0) {
            return this.f5181a;
        }
        throw new AssertionError();
    }

    @Override
    public int mo7299b() {
        return 1;
    }

    @Override
    public int mo7300b(int i) {
        if (f5180c || i == 0) {
            return this.f5182b;
        }
        throw new AssertionError();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bg) && hashCode() == obj.hashCode()) {
            bg c1719bg = (bg) obj;
            return this.f5182b == c1719bg.f5182b && this.f5181a != null && this.f5181a.equals(c1719bg.f5181a);
        }
        return false;
    }

    public String toString() {
        String string = this.f5181a != null ? this.f5181a.toString() : "";
        if (string.length() == 0) {
            return this.f5182b == Integer.MAX_VALUE ? "$" : String.valueOf(this.f5182b);
        }
        return String.valueOf(String.valueOf(this.f5182b)) + " " + string;
    }
}
