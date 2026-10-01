package a.j;

import java.io.File;

public class ClassH implements Interfaceu {
    /* JADX WARN: Code duplicated, block: B:18:0x0085  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    @Override
    public Abstractt mo3150a(String str) {
        Abstractt c0519y;
        ClassF c0501f = new ClassF();
        int i = 0;
        while (i < str.length()) {
            if (str.regionMatches(i, "**", 0, 2)) {
                c0519y = new ClassY(null, null, 0, Integer.MAX_VALUE, mo3150a(str.substring(i + 2)));
            } else if (str.charAt(i) == '*') {
                c0519y = new ClassY(null, new char[]{File.pathSeparatorChar, '/'}, 0, Integer.MAX_VALUE, mo3150a(str.substring(i + 1)));
            } else if (str.charAt(i) == '?') {
                c0519y = new ClassY(null, new char[]{File.pathSeparatorChar, '/'}, 1, 1, mo3150a(str.substring(i + 1)));
            } else {
                i++;
            }
            return i != 0 ? new ClassI(str.substring(0, i), c0519y) : c0519y;
        }
        c0519y = c0501f;
        if (i != 0) {
        }
    }
}
