package sun.misc;

import com.sun.tools.javac.jvm.ByteCodes;
import java.io.PrintStream;

class RegexpPool2 {

    char f600c;
    int depth;
    boolean exact;
    RegexpPool2 firstchild;
    RegexpPool2 nextsibling;

    String f601re;
    Object result;

    RegexpPool2() {
        this.f601re = null;
        this.f600c = '#';
        this.depth = 0;
    }

    RegexpPool2(char C, int depth) {
        this.f601re = null;
        this.f600c = C;
        this.depth = depth;
    }

    RegexpPool2 m543add(char C) {
        RegexpPool2 p;
        RegexpPool2 p2 = this.firstchild;
        if (p2 == null) {
            p = new RegexpPool2(C, this.depth + 1);
        } else {
            while (p2 != null) {
                if (p2.f600c == C) {
                    return p2;
                }
                p2 = p2.nextsibling;
            }
            p = new RegexpPool2(C, this.depth + 1);
            p.nextsibling = this.firstchild;
        }
        this.firstchild = p;
        return p;
    }

    RegexpPool2 find(char C) {
        for (RegexpPool2 p = this.firstchild; p != null; p = p.nextsibling) {
            if (p.f600c == C) {
                return p;
            }
        }
        return null;
    }

    void print(PrintStream out) {
        if (this.nextsibling != null) {
            RegexpPool2 p = this;
            out.print("(");
            while (p != null) {
                out.write(p.f600c);
                RegexpPool2 regexpPool2 = p.firstchild;
                if (regexpPool2 != null) {
                    regexpPool2.print(out);
                }
                p = p.nextsibling;
                out.write(p != null ? ByteCodes.iushr : 41);
            }
            return;
        }
        out.write(this.f600c);
        RegexpPool2 regexpPool3 = this.firstchild;
        if (regexpPool3 != null) {
            regexpPool3.print(out);
        }
    }
}
