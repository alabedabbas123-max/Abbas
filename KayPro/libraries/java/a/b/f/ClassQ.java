package a.b.f;

import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;

public class ClassQ {

    private String f293a;

    private int f294b;

    private int f295c;

    private int f296d;

    private int f297e;

    public ClassQ(String str) {
        int i = 1;
        this.f293a = str;
        if (str.charAt(0) == '<') {
            this.f294b = 1;
            do {
                int i2 = this.f294b;
                this.f294b = i2 + 1;
                switch (str.charAt(i2)) {
                    case '<':
                        i++;
                        break;
                    case ByteOps.ISTORE_3:
                        i--;
                        break;
                }
            } while (i > 0);
        }
        this.f295c = str.indexOf(40, this.f294b);
        this.f296d = this.f295c >= 0 ? str.indexOf(41, this.f295c) : str.length();
        this.f297e = this.f295c >= 0 ? this.f295c + 1 : this.f294b;
    }

    private void m892g() {
        while (this.f293a.charAt(this.f297e) == '[') {
            this.f297e++;
        }
    }

    private void m893h() {
        while (true) {
            String str = this.f293a;
            int i = this.f297e;
            this.f297e = i + 1;
            switch (str.charAt(i)) {
                case ';':
                    return;
                case '<':
                    m894i();
                    break;
            }
        }
    }

    private void m894i() {
        int i = 1;
        do {
            String str = this.f293a;
            int i2 = this.f297e;
            this.f297e = i2 + 1;
            switch (str.charAt(i2)) {
                case '<':
                    i++;
                    break;
                case ByteOps.ISTORE_3:
                    i--;
                    break;
            }
        } while (i > 0);
    }

    public boolean m895a() {
        return this.f294b > 0;
    }

    public String m896b() {
        return this.f293a.substring(0, this.f294b);
    }

    public boolean m897c() {
        return this.f295c >= 0;
    }

    public boolean m898d() {
        return this.f297e < this.f296d;
    }

    public String m899e() {
        int i = this.f297e;
        m892g();
        String str = this.f293a;
        int i2 = this.f297e;
        this.f297e = i2 + 1;
        switch (str.charAt(i2)) {
            case '<':
                m894i();
                break;
            case 'L':
            case 'T':
                m893h();
                break;
        }
        return this.f293a.substring(i, this.f297e);
    }

    public String m900f() {
        return this.f293a.substring(this.f296d + 1);
    }
}
