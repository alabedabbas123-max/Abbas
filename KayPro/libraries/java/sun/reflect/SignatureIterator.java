package sun.reflect;

public class SignatureIterator {

    private int f636idx;

    private String f637sig;

    public SignatureIterator(String sig) {
        this.f637sig = sig;
        reset();
    }

    public void reset() {
        this.f636idx = 1;
    }

    public boolean atEnd() {
        return this.f637sig.charAt(this.f636idx) == ')';
    }

    public String next() {
        if (atEnd()) {
            return null;
        }
        char c = this.f637sig.charAt(this.f636idx);
        if (c != '[' && c != 'L') {
            this.f636idx++;
            return new String(new char[]{c});
        }
        int endIdx = this.f636idx;
        if (c == '[') {
            while (true) {
                char cCharAt = this.f637sig.charAt(endIdx);
                c = cCharAt;
                if (cCharAt != '[') {
                    break;
                }
                endIdx++;
            }
        }
        if (c == 'L') {
            while (this.f637sig.charAt(endIdx) != ';') {
                endIdx++;
            }
        }
        int beginIdx = this.f636idx;
        int i = endIdx + 1;
        this.f636idx = i;
        return this.f637sig.substring(beginIdx, i);
    }

    public String returnType() {
        if (!atEnd()) {
            throw new InternalError("Illegal use of SignatureIterator");
        }
        String str = this.f637sig;
        return str.substring(this.f636idx + 1, str.length());
    }
}
