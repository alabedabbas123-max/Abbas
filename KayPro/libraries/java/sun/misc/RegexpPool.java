package sun.misc;

import java.io.PrintStream;

public class RegexpPool {

    private static final int f602BIG = Integer.MAX_VALUE;
    private RegexpPool2 prefixMachine = new RegexpPool2();
    private RegexpPool2 suffixMachine = new RegexpPool2();
    private int lastDepth = Integer.MAX_VALUE;

    public void m545add(String re, Object ret) throws REException {
        m544add(re, ret, false);
    }

    public void replace(String re, Object ret) {
        try {
            m544add(re, ret, true);
        } catch (Exception e) {
        }
    }

    public Object delete(String re) {
        RegexpPool2 p = this.prefixMachine;
        RegexpPool2 best = p;
        int len = re.length() - 1;
        boolean prefix = true;
        if (!re.startsWith("*") || !re.endsWith("*")) {
            len++;
        }
        if (len <= 0) {
            return null;
        }
        int i = 0;
        while (p != null) {
            if (p.result != null && p.depth < Integer.MAX_VALUE && (!p.exact || i == len)) {
                best = p;
            }
            if (i >= len) {
                break;
            }
            p = p.find(re.charAt(i));
            i++;
        }
        RegexpPool2 p2 = this.suffixMachine;
        int i2 = len;
        while (true) {
            i2--;
            if (i2 < 0 || p2 == null) {
                break;
            }
            if (p2.result != null && p2.depth < Integer.MAX_VALUE) {
                prefix = false;
                best = p2;
            }
            p2 = p2.find(re.charAt(i2));
        }
        if (prefix) {
            if (!re.equals(best.f601re)) {
                return null;
            }
            Object o = best.result;
            best.result = null;
            return o;
        }
        if (!re.equals(best.f601re)) {
            return null;
        }
        Object o2 = best.result;
        best.result = null;
        return o2;
    }

    public Object match(String s) {
        return matchAfter(s, Integer.MAX_VALUE);
    }

    public Object matchNext(String s) {
        return matchAfter(s, this.lastDepth);
    }

    private void m544add(String re, Object ret, boolean replace) throws REException {
        RegexpPool2 p;
        int len = re.length();
        if (re.charAt(0) == '*') {
            p = this.suffixMachine;
            while (len > 1) {
                len--;
                p = p.m543add(re.charAt(len));
            }
        } else {
            boolean exact = false;
            if (re.charAt(len - 1) == '*') {
                len--;
            } else {
                exact = true;
            }
            RegexpPool2 p2 = this.prefixMachine;
            for (int i = 0; i < len; i++) {
                p2 = p2.m543add(re.charAt(i));
            }
            p2.exact = exact;
            p = p2;
        }
        if (p.result != null && !replace) {
            throw new REException(re + " is a duplicate");
        }
        p.f601re = re;
        p.result = ret;
    }

    private Object matchAfter(String s, int lastMatchDepth) {
        RegexpPool2 p = this.prefixMachine;
        RegexpPool2 best = p;
        int bst = 0;
        int bend = 0;
        int len = s.length();
        if (len <= 0) {
            return null;
        }
        int i = 0;
        while (p != null) {
            if (p.result != null && p.depth < lastMatchDepth && (!p.exact || i == len)) {
                this.lastDepth = p.depth;
                best = p;
                bst = i;
                bend = len;
            }
            if (i >= len) {
                break;
            }
            p = p.find(s.charAt(i));
            i++;
        }
        RegexpPool2 p2 = this.suffixMachine;
        int i2 = len;
        while (true) {
            i2--;
            if (i2 < 0 || p2 == null) {
                break;
            }
            if (p2.result != null && p2.depth < lastMatchDepth) {
                this.lastDepth = p2.depth;
                best = p2;
                bst = 0;
                bend = i2 + 1;
            }
            p2 = p2.find(s.charAt(i2));
        }
        Object o = best.result;
        if (o != null && (o instanceof RegexpTarget)) {
            return ((RegexpTarget) o).found(s.substring(bst, bend));
        }
        return o;
    }

    public void reset() {
        this.lastDepth = Integer.MAX_VALUE;
    }

    public void print(PrintStream out) {
        out.print("Regexp pool:\n");
        if (this.suffixMachine.firstchild != null) {
            out.print(" Suffix machine: ");
            this.suffixMachine.firstchild.print(out);
            out.print("\n");
        }
        if (this.prefixMachine.firstchild != null) {
            out.print(" Prefix machine: ");
            this.prefixMachine.firstchild.print(out);
            out.print("\n");
        }
    }
}
