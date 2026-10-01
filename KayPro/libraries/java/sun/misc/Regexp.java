package sun.misc;

public class Regexp {
    public boolean exact;

    public String f599exp;
    public boolean ignoreCase;
    public String[] mids;
    public String prefix;
    public int prefixLen;
    public String suffix;
    public int suffixLen;
    public int totalLen;

    public Regexp(String s) {
        this.f599exp = s;
        int firstst = s.indexOf(42);
        int lastst = s.lastIndexOf(42);
        if (firstst < 0) {
            this.totalLen = s.length();
            this.exact = true;
            return;
        }
        this.prefixLen = firstst;
        if (firstst == 0) {
            this.prefix = null;
        } else {
            this.prefix = s.substring(0, firstst);
        }
        int length = (s.length() - lastst) - 1;
        this.suffixLen = length;
        if (length == 0) {
            this.suffix = null;
        } else {
            this.suffix = s.substring(lastst + 1);
        }
        int nmids = 0;
        int pos = firstst;
        while (pos < lastst && pos >= 0) {
            nmids++;
            pos = s.indexOf(42, pos + 1);
        }
        this.totalLen = this.prefixLen + this.suffixLen;
        if (nmids > 0) {
            this.mids = new String[nmids];
            int pos2 = firstst;
            for (int i = 0; i < nmids; i++) {
                int pos3 = pos2 + 1;
                int npos = s.indexOf(42, pos3);
                if (pos3 < npos) {
                    this.mids[i] = s.substring(pos3, npos);
                    this.totalLen += this.mids[i].length();
                }
                pos2 = npos;
            }
        }
    }

    final boolean matches(String s) {
        return matches(s, 0, s.length());
    }

    boolean matches(String s, int offset, int len) {
        int i;
        if (this.exact) {
            return len == this.totalLen && this.f599exp.regionMatches(this.ignoreCase, 0, s, offset, len);
        }
        if (len < this.totalLen) {
            return false;
        }
        int i2 = this.prefixLen;
        if ((i2 > 0 && !this.prefix.regionMatches(this.ignoreCase, 0, s, offset, i2)) || ((i = this.suffixLen) > 0 && !this.suffix.regionMatches(this.ignoreCase, 0, s, (offset + len) - i, i))) {
            return false;
        }
        String[] strArr = this.mids;
        if (strArr == null) {
            return true;
        }
        int nmids = strArr.length;
        int spos = offset + this.prefixLen;
        int limit = (offset + len) - this.suffixLen;
        for (int i3 = 0; i3 < nmids; i3++) {
            String ms = this.mids[i3];
            int ml = ms.length();
            while (spos + ml <= limit && !ms.regionMatches(this.ignoreCase, 0, s, spos, ml)) {
                spos++;
            }
            if (spos + ml > limit) {
                return false;
            }
            spos += ml;
        }
        return true;
    }
}
