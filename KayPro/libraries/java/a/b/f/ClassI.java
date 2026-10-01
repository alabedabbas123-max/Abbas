package a.b.f;

import com.baidu.android.common.util.BuildConfig;
import java.util.List;
import org.apache.commons.io.FilenameUtils;

public class ClassI {
    public static String m742A(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        ClassQ c0086q = new ClassQ(str);
        while (c0086q.m898d()) {
            stringBuffer.append(m802y(c0086q.m899e()));
            if (c0086q.m898d()) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    public static String m743B(String str) {
        String strM744C = m744C(str);
        int length = strM744C.length();
        return length > 0 ? strM744C.substring(0, length - 1) : "";
    }

    public static String m744C(String str) {
        return str.substring(0, str.lastIndexOf(47, str.length() - 2) + 1);
    }

    public static int m745a(int i, int i2) {
        return (i << 16) | i2;
    }

    public static int m746a(String str) {
        if (str.equals(BuildConfig.VERSION_NAME) || str.equals("1.1")) {
            return 2949123;
        }
        if (str.equals("1.2")) {
            return 3014656;
        }
        if (str.equals("1.3")) {
            return 3080192;
        }
        if (str.equals("1.4")) {
            return 3145728;
        }
        if (str.equals("5") || str.equals("1.5")) {
            return 3211264;
        }
        if (str.equals("6") || str.equals("1.6")) {
            return 3276800;
        }
        if (str.equals("7") || str.equals("1.7")) {
            return 3342336;
        }
        if (str.equals("8") || str.equals("1.8")) {
            return 3407872;
        }
        if (str.equals("9") || str.equals("1.9")) {
            return 3473408;
        }
        return str.equals("10") ? 3538944 : 0;
    }

    public static int m747a(String str, boolean z) {
        int iIndexOf = 1;
        int i = z ? 0 : 1;
        while (true) {
            int i2 = iIndexOf + 1;
            switch (str.charAt(iIndexOf)) {
                case ')':
                    return i;
                case 'L':
                    i++;
                    iIndexOf = str.indexOf(59, i2) + 1;
                    break;
                case '[':
                    iIndexOf = i2;
                    break;
                default:
                    i++;
                    iIndexOf = i2;
                    break;
            }
        }
    }

    public static String m748a(int i, String str) {
        return m771f(i) + m764c(str);
    }

    public static String m749a(int i, String str, String str2) {
        return m775g(i) + m802y(str2) + ' ' + str;
    }

    public static String m750a(String str, int i) {
        StringBuffer stringBuffer = new StringBuffer(str.length() + i + 2);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append('[');
        }
        return stringBuffer.append('L').append(str).append(';').toString();
    }

    public static String m751a(String str, int i, String str2, String str3) {
        return m777h(i) + m752a(str, str2, str3) + '(' + m742A(str3) + ')';
    }

    private static String m752a(String str, String str2, String str3) {
        return str2.equals("<init>") ? m769e(m764c(str)) : m803z(str3) + ' ' + str2;
    }

    public static String m753a(String str, List list) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                stringBuffer.append(')');
                stringBuffer.append(m800w(str));
                return stringBuffer.toString();
            }
            stringBuffer.append(m800w((String) list.get(i2)));
            i = i2 + 1;
        }
    }

    public static void m754a(int i) {
        if (i != -889275714) {
            throw new UnsupportedOperationException("Invalid magic number [" + Integer.toHexString(i) + "] in class");
        }
    }

    public static boolean m755a(char c) {
        return c == 'Z' || c == 'B' || c == 'C' || c == 'S' || c == 'I' || c == 'F' || c == 'J' || c == 'D';
    }

    public static int m756b(int i) {
        return i >>> 16;
    }

    public static int m757b(String str, int i) {
        return m747a(str, (i & 8) != 0);
    }

    public static int m758b(String str, boolean z) {
        int iIndexOf = 1;
        int i = z ? 0 : 1;
        while (true) {
            int i2 = iIndexOf + 1;
            switch (str.charAt(iIndexOf)) {
                case ')':
                    return i;
                case 'D':
                case 'J':
                    i += 2;
                    iIndexOf = i2;
                    break;
                case 'L':
                    i++;
                    iIndexOf = str.indexOf(59, i2) + 1;
                    break;
                case '[':
                    int i3 = i + 1;
                    int i4 = i2;
                    while (true) {
                        iIndexOf = i4 + 1;
                        char cCharAt = str.charAt(i4);
                        if (cCharAt == '[') {
                            i4 = iIndexOf;
                        } else if (cCharAt != 'L') {
                            i = i3;
                        } else {
                            iIndexOf = str.indexOf(59, iIndexOf) + 1;
                            i = i3;
                        }
                        break;
                    }
                    break;
                default:
                    i++;
                    iIndexOf = i2;
                    break;
            }
        }
    }

    public static String m759b(int i, String str) {
        if (i == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(50);
        if ((i & 1) != 0) {
            stringBuffer.append(str).append("public").append(' ');
        }
        if ((i & 2) != 0) {
            stringBuffer.append(str).append("private").append(' ');
        }
        if ((i & 4) != 0) {
            stringBuffer.append(str).append("protected").append(' ');
        }
        if ((i & 8) != 0) {
            stringBuffer.append(str).append("static").append(' ');
        }
        if ((i & 16) != 0) {
            stringBuffer.append(str).append("final").append(' ');
        }
        if ((i & 8192) != 0) {
            stringBuffer.append(str).append("@");
        }
        if ((i & 512) != 0) {
            stringBuffer.append(str).append("interface").append(' ');
        } else if ((i & 16384) != 0) {
            stringBuffer.append(str).append("enum").append(' ');
        } else if ((i & 1024) != 0) {
            stringBuffer.append(str).append("abstract").append(' ');
        } else if ((i & 4096) != 0) {
            stringBuffer.append(str).append("synthetic").append(' ');
        } else if ((32768 & i) != 0) {
            stringBuffer.append(str).append("module").append(' ');
        }
        return stringBuffer.toString();
    }

    public static String m760b(String str) {
        return str.replace(FilenameUtils.EXTENSION_SEPARATOR, '/');
    }

    public static int m761c(int i) {
        return 65535 & i;
    }

    public static int m762c(String str, int i) {
        return m758b(str, (i & 8) != 0);
    }

    public static String m763c(int i, String str) {
        if (i == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(50);
        if ((i & 1) != 0) {
            stringBuffer.append(str).append("public").append(' ');
        }
        if ((i & 2) != 0) {
            stringBuffer.append(str).append("private").append(' ');
        }
        if ((i & 4) != 0) {
            stringBuffer.append(str).append("protected").append(' ');
        }
        if ((i & 8) != 0) {
            stringBuffer.append(str).append("static").append(' ');
        }
        if ((i & 16) != 0) {
            stringBuffer.append(str).append("final").append(' ');
        }
        if ((i & 64) != 0) {
            stringBuffer.append(str).append("volatile").append(' ');
        }
        if ((i & 128) != 0) {
            stringBuffer.append(str).append("transient").append(' ');
        }
        if ((i & 4096) != 0) {
            stringBuffer.append(str).append("synthetic").append(' ');
        }
        return stringBuffer.toString();
    }

    public static String m764c(String str) {
        return str.replace('/', FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static String m765d(int i) {
        switch (i) {
            case 2949123:
                return BuildConfig.VERSION_NAME;
            case 3014656:
                return "1.2";
            case 3080192:
                return "1.3";
            case 3145728:
                return "1.4";
            case 3211264:
                return "1.5";
            case 3276800:
                return "1.6";
            case 3342336:
                return "1.7";
            case 3407872:
                return "1.8";
            case 3473408:
                return "1.9";
            case 3538944:
                return "10";
            default:
                return null;
        }
    }

    public static String m766d(int i, String str) {
        if (i == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(50);
        if ((i & 1) != 0) {
            stringBuffer.append(str).append("public").append(' ');
        }
        if ((i & 2) != 0) {
            stringBuffer.append(str).append("private").append(' ');
        }
        if ((i & 4) != 0) {
            stringBuffer.append(str).append("protected").append(' ');
        }
        if ((i & 8) != 0) {
            stringBuffer.append(str).append("static").append(' ');
        }
        if ((i & 16) != 0) {
            stringBuffer.append(str).append("final").append(' ');
        }
        if ((i & 32) != 0) {
            stringBuffer.append(str).append("synchronized").append(' ');
        }
        if ((i & 64) != 0) {
            stringBuffer.append(str).append("bridge").append(' ');
        }
        if ((i & 128) != 0) {
            stringBuffer.append(str).append("varargs").append(' ');
        }
        if ((i & 256) != 0) {
            stringBuffer.append(str).append("native").append(' ');
        }
        if ((i & 1024) != 0) {
            stringBuffer.append(str).append("abstract").append(' ');
        }
        if ((i & 2048) != 0) {
            stringBuffer.append(str).append("strictfp").append(' ');
        }
        if ((i & 4096) != 0) {
            stringBuffer.append(str).append("synthetic").append(' ');
        }
        return stringBuffer.toString();
    }

    public static String m767d(String str) {
        int iIndexOf = str.indexOf("[]");
        return iIndexOf >= 0 ? str.substring(0, iIndexOf) : str;
    }

    public static String m768e(int i, String str) {
        if (i == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(50);
        if ((i & 16) != 0) {
            stringBuffer.append(str).append("final").append(' ');
        }
        if ((i & 4096) != 0) {
            stringBuffer.append(str).append("synthetic").append(' ');
        }
        if ((32768 & i) != 0) {
            stringBuffer.append(str).append("mandated").append(' ');
        }
        return stringBuffer.toString();
    }

    public static String m769e(String str) {
        return str.substring(str.lastIndexOf(46) + 1);
    }

    public static void m770e(int i) {
        if (i < 2949123 || i > 3538944) {
            throw new UnsupportedOperationException("Unsupported version number [" + m756b(i) + "." + m761c(i) + "] (maximum 54.0, Java 10)");
        }
    }

    public static String m771f(int i) {
        return m759b(i, "");
    }

    public static String m772f(int i, String str) {
        if (i == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(50);
        if ((i & 32) != 0) {
            stringBuffer.append(str).append("open").append(' ');
        }
        if ((i & 4096) != 0) {
            stringBuffer.append(str).append("synthetic").append(' ');
        }
        if ((32768 & i) != 0) {
            stringBuffer.append(str).append("mandated").append(' ');
        }
        return stringBuffer.toString();
    }

    public static boolean m773f(String str) {
        return str.length() > 1 && str.charAt(0) == '[';
    }

    public static int m774g(String str) {
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        return i;
    }

    public static String m775g(int i) {
        return m763c(i, "");
    }

    public static String m776g(int i, String str) {
        if (i == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(50);
        if ((i & 32) != 0) {
            stringBuffer.append(str).append("transitive").append(' ');
        }
        if ((i & 64) != 0) {
            stringBuffer.append(str).append("static").append(' ');
        }
        if ((i & 4096) != 0) {
            stringBuffer.append(str).append("synthetic").append(' ');
        }
        if ((32768 & i) != 0) {
            stringBuffer.append(str).append("mandated").append(' ');
        }
        return stringBuffer.toString();
    }

    public static String m777h(int i) {
        return m766d(i, "");
    }

    public static String m778h(int i, String str) {
        if (i == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(50);
        if ((i & 4096) != 0) {
            stringBuffer.append(str).append("synthetic").append(' ');
        }
        if ((32768 & i) != 0) {
            stringBuffer.append(str).append("mandated").append(' ');
        }
        return stringBuffer.toString();
    }

    public static boolean m779h(String str) {
        return "java/lang/Object".equals(str) || "java/lang/Cloneable".equals(str) || "java/io/Serializable".equals(str);
    }

    public static String m780i(int i) {
        return m768e(i, "");
    }

    public static String m781i(int i, String str) {
        if (i == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(50);
        if ((i & 4096) != 0) {
            stringBuffer.append(str).append("synthetic").append(' ');
        }
        if ((32768 & i) != 0) {
            stringBuffer.append(str).append("mandated").append(' ');
        }
        return stringBuffer.toString();
    }

    public static boolean m782i(String str) {
        return m755a(str.charAt(0));
    }

    public static String m783j(int i) {
        return m772f(i, "");
    }

    public static boolean m784j(String str) {
        int length = str.length();
        return length > 1 && str.charAt(length + (-1)) == ';';
    }

    public static String m785k(int i) {
        return m776g(i, "");
    }

    public static String m786k(String str) {
        return m750a(str, 0);
    }

    public static String m787l(int i) {
        return m778h(i, "");
    }

    public static String m788l(String str) {
        return str.substring(str.lastIndexOf(91) + 1);
    }

    public static String m789m(int i) {
        return m781i(i, "");
    }

    public static String m790m(String str) {
        return m773f(str) ? str : m792o(str);
    }

    public static String m791n(String str) {
        return m773f(str) ? str : m786k(str);
    }

    public static String m792o(String str) {
        return m784j(str) ? str.substring(str.indexOf(76) + 1, str.length() - 1) : str;
    }

    public static String m793p(String str) {
        if (!m784j(str)) {
            return null;
        }
        if (m773f(str)) {
            str = m788l(str);
        }
        return m792o(str);
    }

    public static char m794q(String str) {
        if (str.equals("java/lang/Void")) {
            return 'V';
        }
        if (str.equals("java/lang/Boolean")) {
            return 'Z';
        }
        if (str.equals("java/lang/Byte")) {
            return 'B';
        }
        if (str.equals("java/lang/Character")) {
            return 'C';
        }
        if (str.equals("java/lang/Short")) {
            return 'S';
        }
        if (str.equals("java/lang/Integer")) {
            return 'I';
        }
        if (str.equals("java/lang/Long")) {
            return 'J';
        }
        if (str.equals("java/lang/Float")) {
            return 'F';
        }
        if (str.equals("java/lang/Double")) {
            return 'D';
        }
        if (str.equals("java/lang/reflect/Array")) {
            return '[';
        }
        throw new IllegalArgumentException("Unexpected primitive class name [" + str + "]");
    }

    public static boolean m795r(String str) {
        return str.equals("<clinit>") || str.equals("<init>");
    }

    public static String m796s(String str) {
        return str.substring(str.indexOf(41) + 1);
    }

    public static int m797t(String str) {
        return m747a(str, true);
    }

    public static int m798u(String str) {
        return m758b(str, true);
    }

    public static int m799v(String str) {
        if (str.length() == 1) {
            char cCharAt = str.charAt(0);
            if (cCharAt == 'J' || cCharAt == 'D') {
                return 2;
            }
            if (cCharAt == 'V') {
                return 0;
            }
        }
        return 1;
    }

    public static String m800w(String str) {
        char c;
        int iM801x = m801x(str);
        if (iM801x > 0) {
            str = str.substring(0, str.length() - ("[]".length() * iM801x));
        }
        if (str.equals("void")) {
            c = 'V';
        } else if (str.equals("boolean")) {
            c = 'Z';
        } else if (str.equals("byte")) {
            c = 'B';
        } else if (str.equals("char")) {
            c = 'C';
        } else if (str.equals("short")) {
            c = 'S';
        } else if (str.equals("int")) {
            c = 'I';
        } else if (str.equals("float")) {
            c = 'F';
        } else if (str.equals("long")) {
            c = 'J';
        } else if (str.equals("double")) {
            c = 'D';
        } else {
            c = str.equals("%") ? '%' : (char) 0;
        }
        String strValueOf = c != 0 ? String.valueOf(c) : 'L' + m760b(str) + ';';
        for (int i = 0; i < iM801x; i++) {
            strValueOf = '[' + strValueOf;
        }
        return strValueOf;
    }

    public static int m801x(String str) {
        int length = "[]".length();
        int i = 0;
        for (int length2 = str.length() - length; str.regionMatches(length2, "[]", 0, length); length2 -= length) {
            i++;
        }
        return i;
    }

    public static String m802y(String str) {
        String strM764c;
        int iM774g = m774g(str);
        if (iM774g > 0) {
            str = str.substring(iM774g);
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'V') {
            strM764c = "void";
        } else if (cCharAt == 'Z') {
            strM764c = "boolean";
        } else if (cCharAt == 'B') {
            strM764c = "byte";
        } else if (cCharAt == 'C') {
            strM764c = "char";
        } else if (cCharAt == 'S') {
            strM764c = "short";
        } else if (cCharAt == 'I') {
            strM764c = "int";
        } else if (cCharAt == 'F') {
            strM764c = "float";
        } else if (cCharAt == 'J') {
            strM764c = "long";
        } else if (cCharAt == 'D') {
            strM764c = "double";
        } else if (cCharAt == '%') {
            strM764c = "%";
        } else {
            strM764c = cCharAt == 'L' ? m764c(str.substring(1, str.indexOf(59))) : null;
        }
        if (strM764c == null) {
            throw new IllegalArgumentException("Unknown type [" + str + "]");
        }
        for (int i = 0; i < iM774g; i++) {
            strM764c = strM764c + "[]";
        }
        return strM764c;
    }

    public static String m803z(String str) {
        return m802y(m796s(str));
    }
}
