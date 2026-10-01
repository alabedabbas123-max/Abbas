package a.b.f;

import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;
import java.util.Stack;

public class ClassJ {

    private String f219a;

    private int f220b;

    private int f221c;

    private boolean f222d;

    private String f223e;

    private Stack f224f;

    public ClassJ(String str) {
        this.f219a = str;
    }

    private void m804f() {
        this.f220b = 0;
        this.f221c = 0;
        this.f222d = false;
        this.f223e = null;
        this.f224f = null;
    }

    public int m805a() {
        int i = 0;
        m804f();
        m807c();
        while (m806b()) {
            i++;
            m808d();
            m807c();
        }
        m804f();
        return i;
    }

    public boolean m806b() {
        return this.f220b < this.f219a.length();
    }

    public String m807c() {
        String str;
        int i;
        String str2;
        int i2;
        int i3 = this.f220b;
        while (this.f220b < this.f219a.length()) {
            String str3 = this.f219a;
            int i4 = this.f220b;
            this.f220b = i4 + 1;
            switch (str3.charAt(i4)) {
                case '.':
                    this.f222d = true;
                    return this.f219a.substring(i3, this.f220b);
                case ':':
                case '[':
                    continue;
                case ';':
                    this.f221c -= 2;
                    break;
                case '<':
                    this.f221c++;
                    if (this.f224f == null) {
                        this.f224f = new Stack();
                    }
                    this.f224f.push(this.f223e);
                    break;
                case ByteOps.ISTORE_3:
                    this.f221c--;
                    this.f223e = (String) this.f224f.pop();
                    continue;
                case 'L':
                    this.f221c += 2;
                    this.f222d = false;
                    return this.f219a.substring(i3, this.f220b);
                case 'T':
                    do {
                        str = this.f219a;
                        i = this.f220b;
                        this.f220b = i + 1;
                    } while (str.charAt(i) != ';');
                    break;
            }
            if (this.f221c == 1 && this.f219a.charAt(this.f220b) != '>') {
                do {
                    str2 = this.f219a;
                    i2 = this.f220b;
                    this.f220b = i2 + 1;
                } while (str2.charAt(i2) != ':');
            }
        }
        return this.f219a.substring(i3, this.f220b);
    }

    public String m808d() {
        int i = this.f220b;
        while (true) {
            switch (this.f219a.charAt(this.f220b)) {
                case '.':
                case ';':
                case '<':
                    String strSubstring = this.f219a.substring(i, this.f220b);
                    if (this.f222d) {
                        strSubstring = this.f223e + '$' + strSubstring;
                    }
                    this.f223e = strSubstring;
                    return this.f223e;
                default:
                    this.f220b++;
                    break;
            }
        }
    }

    public boolean m809e() {
        return this.f222d;
    }
}
