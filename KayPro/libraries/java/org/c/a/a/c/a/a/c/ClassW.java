package org.c.a.a.c.a.a.c;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttInnerClasses;
import java.util.HashMap;
import org.apache.commons.io.FilenameUtils;
import org.c.a.a.a.a.Interfacea;
import org.c.a.a.b.a.b.ClassB;
import org.c.a.a.b.d.e.ClassH;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.c.b.a.ClassB;
import org.c.a.a.c.b.a.ClassC;

public class ClassW {

    static final boolean f6161d;

    protected Interfacea f6164c;

    protected HashMap f6162a = new HashMap(1024);

    protected HashMap f6163b = new HashMap(1024);

    private Object[] f6165e = new Object[1000];

    private Interfacez f6166f = new ClassX(this);

    private Interfacez f6167g = new ClassY(this);

    static {
        f6161d = !ClassW.class.desiredAssertionStatus();
    }

    public ClassW(Interfacea interfaceC1817a) {
        this.f6164c = interfaceC1817a;
        this.f6162a.put("java/lang/Class", ClassI.f5833f);
        this.f6162a.put("java/lang/Object", ClassI.f5839l);
        this.f6162a.put("java/lang/String", ClassI.f5841n);
    }

    public String m8623a(String str, String str2, Interfacez interfaceC2171z) {
        byte[] bArrMo7046b = this.f6164c.mo7046b(str);
        if (bArrMo7046b == null) {
            return null;
        }
        ClassC c2207c = new ClassC(bArrMo7046b);
        if (c2207c.m8713d() != -889275714) {
            throw new ClassB("Invalid CLASS file");
        }
        c2207c.m8709a(4);
        Object[] objArrM8627a = m8627a(c2207c);
        c2207c.m8709a(4);
        int iM8712c = c2207c.m8712c();
        String str3 = iM8712c == 0 ? null : (String) objArrM8627a[((ClassB) objArrM8627a[iM8712c]).m7666b()];
        int iM8712c2 = c2207c.m8712c();
        String[] strArr = new String[iM8712c2 + 1];
        strArr[0] = str3;
        for (int i = 1; i <= iM8712c2; i++) {
            strArr[i] = (String) objArrM8627a[((ClassB) objArrM8627a[c2207c.m8712c()]).m7666b()];
        }
        this.f6163b.put(str, strArr);
        int iM8712c3 = c2207c.m8712c();
        for (int i2 = 0; i2 < iM8712c3; i2++) {
            c2207c.m8709a(6);
            m8630b(c2207c);
        }
        int iM8712c4 = c2207c.m8712c();
        for (int i3 = 0; i3 < iM8712c4; i3++) {
            c2207c.m8709a(6);
            m8630b(c2207c);
        }
        int iM8712c5 = c2207c.m8712c();
        for (int i4 = 0; i4 < iM8712c5; i4++) {
            int iM8712c6 = c2207c.m8712c();
            int iM8713d = c2207c.m8713d();
            if (AttInnerClasses.ATTRIBUTE_NAME.equals((String) objArrM8627a[iM8712c6])) {
                return interfaceC2171z.mo8638a(c2207c, str, str2);
            }
            c2207c.m8709a(iM8713d);
        }
        return null;
    }

    private boolean m8625a(String str, String str2) {
        String[] strArr;
        if (str2.equals("java/lang/Object")) {
            return false;
        }
        String[] strArr2 = (String[]) this.f6163b.get(str2);
        if (strArr2 == null) {
            try {
                if (!this.f6164c.mo7045a(str2)) {
                    return getClass().getClassLoader().loadClass(str.replace('/', FilenameUtils.EXTENSION_SEPARATOR)).isAssignableFrom(getClass().getClassLoader().loadClass(str2.replace('/', FilenameUtils.EXTENSION_SEPARATOR)));
                }
                m8631c(str2);
                strArr = (String[]) this.f6163b.get(str2);
            } catch (Exception e) {
                return false;
            }
        } else {
            strArr = strArr2;
        }
        if (strArr != null) {
            for (String str3 : strArr) {
                if (str.equals(str3)) {
                    return true;
                }
            }
            for (String str4 : strArr) {
                if (m8625a(str, str4)) {
                    return true;
                }
            }
        }
        return false;
    }

    private Object[] m8627a(ClassC c2207c) {
        int iM8712c = c2207c.m8712c();
        if (iM8712c == 0) {
            return null;
        }
        if (this.f6165e.length < iM8712c) {
            this.f6165e = new Object[iM8712c];
        }
        int i = 1;
        while (i < iM8712c) {
            switch (c2207c.m8708a()) {
                case 1:
                    this.f6165e[i] = c2207c.m8717h();
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new ClassB("Invalid constant pool entry");
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                case 17:
                case 18:
                    c2207c.m8709a(4);
                    break;
                case 5:
                case 6:
                    c2207c.m8709a(8);
                    i++;
                    break;
                case 7:
                    this.f6165e[i] = new ClassB(c2207c.m8712c());
                    break;
                case 8:
                case 16:
                case 19:
                case 20:
                    c2207c.m8709a(2);
                    break;
                case 15:
                    c2207c.m8709a(3);
                    break;
            }
            i++;
        }
        return this.f6165e;
    }

    private ClassI m8628b(String str) {
        if (!f6161d && (str == null || str.endsWith(";"))) {
            throw new AssertionError();
        }
        ClassI c2049i = (ClassI) this.f6162a.get(str);
        if (c2049i != null) {
            return c2049i;
        }
        ClassI c2049iM8631c = m8631c(str);
        if (c2049iM8631c == null) {
            c2049iM8631c = m8632d(str);
        }
        return c2049iM8631c == null ? m8633e(str) : c2049iM8631c;
    }

    private static void m8630b(ClassC c2207c) {
        int iM8712c = c2207c.m8712c();
        for (int i = 0; i < iM8712c; i++) {
            c2207c.m8709a(2);
            c2207c.m8709a(c2207c.m8713d());
        }
    }

    private ClassI m8631c(String str) {
        ClassI c2048h = (ClassI) this.f6162a.get(str);
        if (c2048h == null && this.f6164c.mo7045a(str)) {
            String strM8634f = m8634f(str);
            if (strM8634f == null) {
                int iLastIndexOf = str.lastIndexOf(47);
                String strReplace = str.replace('/', FilenameUtils.EXTENSION_SEPARATOR);
                c2048h = new ClassI(str, strReplace, strReplace.substring(iLastIndexOf + 1));
            } else {
                ClassI c2049iM8631c = m8631c(strM8634f);
                if (!f6161d && c2049iM8631c == null) {
                    throw new AssertionError();
                }
                String strSubstring = str.substring((str.length() > strM8634f.length() + 1 ? strM8634f.length() : str.lastIndexOf(36)) + 1);
                c2048h = Character.isDigit(strSubstring.charAt(0)) ? new ClassH(str, null, m8635g(strSubstring), c2049iM8631c) : new ClassH(str, String.valueOf(c2049iM8631c.m8151i()) + FilenameUtils.EXTENSION_SEPARATOR + strSubstring, strSubstring, c2049iM8631c);
            }
            this.f6162a.put(str, c2048h);
        }
        return c2048h;
    }

    private ClassI m8632d(String str) {
        ClassI c2049i = (ClassI) this.f6162a.get(str);
        if (c2049i == null) {
            try {
                Class<?> clsLoadClass = getClass().getClassLoader().loadClass(str.replace('/', FilenameUtils.EXTENSION_SEPARATOR));
                String canonicalName = clsLoadClass.getCanonicalName();
                String simpleName = clsLoadClass.getSimpleName();
                if (clsLoadClass.isMemberClass()) {
                    c2049i = new ClassH(str, canonicalName, simpleName, m8632d(simpleName.isEmpty() ? str.substring(0, str.lastIndexOf(36)) : str.substring(0, (str.length() - simpleName.length()) - 1)));
                } else {
                    c2049i = new ClassI(str, canonicalName, simpleName);
                }
            } catch (ClassNotFoundException e) {
            }
            this.f6162a.put(str, c2049i);
        }
        return c2049i;
    }

    private ClassI m8633e(String str) {
        ClassI c2049i;
        int iLastIndexOf = str.lastIndexOf(47);
        int iLastIndexOf2 = str.lastIndexOf(36);
        if (iLastIndexOf < iLastIndexOf2) {
            String strSubstring = str.substring(0, iLastIndexOf2);
            ClassI c2049iM8633e = m8633e(strSubstring);
            String strSubstring2 = str.substring(strSubstring.length() + 1);
            c2049i = Character.isDigit(strSubstring2.charAt(0)) ? new ClassH(str, null, m8635g(strSubstring2), c2049iM8633e) : new ClassH(str, String.valueOf(c2049iM8633e.m8151i()) + FilenameUtils.EXTENSION_SEPARATOR + strSubstring2, strSubstring2, c2049iM8633e);
        } else {
            String strReplace = str.replace('/', FilenameUtils.EXTENSION_SEPARATOR);
            c2049i = new ClassI(str, strReplace, strReplace.substring(iLastIndexOf + 1));
        }
        this.f6162a.put(str, c2049i);
        return c2049i;
    }

    private String m8634f(String str) {
        return m8623a(str, null, this.f6167g);
    }

    private static String m8635g(String str) {
        int i = 0;
        if (!Character.isDigit(str.charAt(0))) {
            return str;
        }
        int length = str.length();
        while (i < length && Character.isDigit(str.charAt(i))) {
            i++;
        }
        if (i == length) {
            return null;
        }
        return str.substring(i);
    }

    public ClassI m8636a(String str) {
        int i = 1;
        try {
            if (str.charAt(0) != '[') {
                return (str.charAt(0) == 'L' && str.charAt(str.length() + (-1)) == ';') ? m8628b(str.substring(1, str.length() - 1)) : m8628b(str);
            }
            ClassI c2049i = (ClassI) this.f6162a.get(str);
            if (c2049i != null) {
                return c2049i;
            }
            while (str.charAt(i) == '[') {
                i++;
            }
            if (str.charAt(i) != 'L' || !str.endsWith(";")) {
                return c2049i;
            }
            ClassI c2049iM8628b = m8628b(str.substring(i + 1, str.length() - 1));
            ClassI c2049i2 = new ClassI(c2049iM8628b.m8150g(), c2049iM8628b.m8151i(), c2049iM8628b.m8152j(), i);
            this.f6162a.put(str, c2049i2);
            return c2049i2;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean m8637a(ClassI c2049i, ClassI c2049i2) {
        if (c2049i == ClassI.f5843p) {
            return true;
        }
        if (c2049i.mo8145d() > 0) {
            return c2049i.mo8145d() == c2049i2.mo8145d() && c2049i.m8150g().equals(c2049i2.m8150g());
        }
        String strM8150g = c2049i.m8150g();
        String strM8150g2 = c2049i2.m8150g();
        if (strM8150g.equals(strM8150g2) || strM8150g.equals("java/lang/Object")) {
            return true;
        }
        return m8625a(strM8150g, strM8150g2);
    }
}
