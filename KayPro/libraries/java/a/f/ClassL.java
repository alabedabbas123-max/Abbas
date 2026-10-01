package a.f;

import com.baidu.mobstat.Config;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ClassL {

    private final File f712a;

    public ClassL(File file) {
        this.f712a = file;
    }

    private String m1831a(String str, Interfacek interfaceC0301k) {
        int iIndexOf;
        int iIndexOf2 = str.indexOf("->");
        if (iIndexOf2 < 0 || (iIndexOf = str.indexOf(58, iIndexOf2 + 2)) < 0) {
            return null;
        }
        String strTrim = str.substring(0, iIndexOf2).trim();
        if (!interfaceC0301k.mo1822a(strTrim, str.substring(iIndexOf2 + 2, iIndexOf).trim())) {
            strTrim = null;
        }
        return strTrim;
    }

    private void m1832a(String str, String str2, Interfacek interfaceC0301k) {
        int i;
        String strSubstring;
        int i2;
        int i3;
        int iIndexOf = str2.indexOf(58);
        int iIndexOf2 = iIndexOf < 0 ? -1 : str2.indexOf(58, iIndexOf + 1);
        int iIndexOf3 = str2.indexOf(32, iIndexOf2 + 2);
        int iIndexOf4 = str2.indexOf(40, iIndexOf3 + 1);
        int iIndexOf5 = iIndexOf4 < 0 ? -1 : str2.indexOf(41, iIndexOf4 + 1);
        int iIndexOf6 = iIndexOf5 < 0 ? -1 : str2.indexOf(58, iIndexOf5 + 1);
        int iIndexOf7 = iIndexOf6 < 0 ? -1 : str2.indexOf(58, iIndexOf6 + 1);
        if (iIndexOf7 >= 0) {
            i = iIndexOf7;
        } else if (iIndexOf6 >= 0) {
            i = iIndexOf6;
        } else {
            i = iIndexOf5 >= 0 ? iIndexOf5 : iIndexOf3;
        }
        int iIndexOf8 = str2.indexOf("->", i + 1);
        if (iIndexOf3 < 0 || iIndexOf8 < 0) {
            return;
        }
        String strTrim = str2.substring(iIndexOf2 + 1, iIndexOf3).trim();
        String strTrim2 = str2.substring(iIndexOf3 + 1, iIndexOf4 >= 0 ? iIndexOf4 : iIndexOf8).trim();
        String strTrim3 = str2.substring(iIndexOf8 + 2).trim();
        int iLastIndexOf = strTrim2.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            strSubstring = strTrim2.substring(0, iLastIndexOf);
            strTrim2 = strTrim2.substring(iLastIndexOf + 1);
        } else {
            strSubstring = str;
        }
        if (strTrim.length() <= 0 || strTrim2.length() <= 0 || strTrim3.length() <= 0) {
            return;
        }
        if (iIndexOf5 < 0) {
            interfaceC0301k.mo1821a(strSubstring, strTrim, strTrim2, str, strTrim3);
            return;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        if (iIndexOf2 >= 0) {
            i5 = Integer.parseInt(str2.substring(0, iIndexOf).trim());
            i6 = Integer.parseInt(str2.substring(iIndexOf + 1, iIndexOf2).trim());
            i4 = i6;
            i2 = i5;
        } else {
            i2 = 0;
        }
        if (iIndexOf6 >= 0) {
            int i7 = Integer.parseInt(str2.substring(iIndexOf6 + 1, iIndexOf7 > 0 ? iIndexOf7 : iIndexOf8).trim());
            i4 = iIndexOf7 < 0 ? i7 : Integer.parseInt(str2.substring(iIndexOf7 + 1, iIndexOf8).trim());
            i3 = i7;
        } else {
            i3 = i2;
        }
        interfaceC0301k.mo1820a(strSubstring, i3, i4, strTrim, strTrim2, str2.substring(iIndexOf4 + 1, iIndexOf5).trim(), str, i5, i6, strTrim3);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1833a(Interfacek interfaceC0301k) {
        LineNumberReader lineNumberReader = new LineNumberReader(new BufferedReader(new FileReader(this.f712a)));
        String strM1831a = null;
        while (true) {
            try {
                String line = lineNumberReader.readLine();
                if (line == null) {
                    try {
                        lineNumberReader.close();
                        return;
                    } catch (IOException e) {
                        return;
                    }
                }
                String strTrim = line.trim();
                if (!strTrim.startsWith("#")) {
                    if (strTrim.endsWith(Config.TRACE_TODAY_VISIT_SPLIT)) {
                        strM1831a = m1831a(strTrim, interfaceC0301k);
                    } else if (strM1831a != null) {
                        m1832a(strM1831a, strTrim, interfaceC0301k);
                    }
                }
            } catch (IOException e2) {
                throw new IOException("Can't process mapping file (" + e2.getMessage() + ")");
            }
        }
    }
}
