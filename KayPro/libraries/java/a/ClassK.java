package a;

import a.a;
import a.aa;
import a.ae;
import a.ag;
import a.an;
import a.f;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import a.b.f.ClassI;
import a.j.ClassK;

public class ClassK {

    private final an f1353a;

    private final Properties f1354b;

    private String f1355c;

    private String f1356d;

    public ClassK(an anVar, Properties properties) {
        this.f1353a = anVar;
        this.f1354b = properties;
        m3217j();
    }

    public ClassK(String[] strArr, File file, Properties properties) {
        this((an) new a(strArr, file), properties);
    }

    public ClassK(String[] strArr, Properties properties) {
        this(strArr, null, properties);
    }

    private long m3185a(long j) throws ag {
        URL url;
        m3196a("configuration file name", true, true, false);
        URL urlE = this.f1353a.e();
        try {
            url = new URL(this.f1355c);
        } catch (MalformedURLException e) {
            url = null;
        }
        if (url != null) {
            this.f1353a.a(new ClassQ(url));
        } else if (urlE != null) {
            this.f1353a.a(new ClassQ(new URL(urlE, this.f1355c)));
        } else {
            URL resource = ClassK.class.getResource(this.f1355c);
            if (resource != null) {
                this.f1353a.a(new ClassQ(resource));
            } else {
                File fileM3201b = m3201b(this.f1355c);
                this.f1353a.a(new ClassQ(fileM3201b));
                long jLastModified = fileM3201b.lastModified();
                if (jLastModified > j) {
                    j = jLastModified;
                }
            }
        }
        m3217j();
        return j;
    }

    private aa m3186a(boolean z, boolean z2, boolean z3, f fVar) throws ag {
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = z3;
        while (true) {
            m3196a("keyword 'class', 'interface', or 'enum'", false, false, true);
            if (!",".equals(this.f1355c)) {
                return new aa(z, z2, z7, z6, z8, z5, z4, fVar, m3219a());
            }
            m3208d("keyword 'allowshrinking', 'allowoptimization', or 'allowobfuscation'");
            if ("includedescriptorclasses".startsWith(this.f1355c)) {
                z7 = true;
            } else if ("includecode".startsWith(this.f1355c)) {
                z6 = true;
            } else if ("allowshrinking".startsWith(this.f1355c)) {
                z8 = true;
            } else if ("allowoptimization".startsWith(this.f1355c)) {
                z5 = true;
            } else {
                if (!"allowobfuscation".startsWith(this.f1355c)) {
                    throw new ag("Expecting keyword 'includedescriptorclasses', 'includecode', 'allowshrinking', 'allowoptimization', or 'allowobfuscation' before " + this.f1353a.g());
                }
                z4 = true;
            }
        }
    }

    private ClassD m3187a(ClassD c0173d, boolean z) throws ag {
        int i;
        if (c0173d == null) {
            c0173d = new ClassD();
        }
        do {
            m3196a("jar or directory name", true, false, false);
            ClassE c0243e = new ClassE(m3201b(this.f1355c), z);
            m3217j();
            if (!m3218k() && "(".equals(this.f1355c)) {
                List[] listArr = new List[7];
                int i2 = 0;
                while (true) {
                    i = i2 + 1;
                    listArr[i2] = m3189a("filter", true, true, true, true, false, true, true, false, false, null);
                    if (i >= listArr.length || !";".equals(this.f1355c)) {
                        break;
                    }
                    i2 = i;
                }
                if (!")".equals(this.f1355c)) {
                    throw new ag("Expecting separating ',' or ';', or closing ')' before " + this.f1353a.g());
                }
                int i3 = i - 1;
                c0243e.m1689a(listArr[i3]);
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    c0243e.m1692c(listArr[i4]);
                    if (i4 > 0) {
                        int i5 = i4 - 1;
                        c0243e.m1696e(listArr[i5]);
                        if (i5 > 0) {
                            int i6 = i5 - 1;
                            c0243e.m1698f(listArr[i6]);
                            if (i6 > 0) {
                                int i7 = i6 - 1;
                                c0243e.m1700g(listArr[i7]);
                                if (i7 > 0) {
                                    int i8 = i7 - 1;
                                    c0243e.m1702h(listArr[i8]);
                                    if (i8 > 0) {
                                        int i9 = i8 - 1;
                                        c0243e.m1691b(listArr[i9]);
                                        if (i9 > 0) {
                                            c0243e.m1694d(listArr[i9 - 1]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                m3217j();
            }
            c0173d.m1294a(c0243e);
            if (m3218k()) {
                return c0173d;
            }
        } while (this.f1355c.equals(ClassJ.f1323a));
        throw new ag("Expecting class path separator '" + ClassJ.f1323a + "' before " + this.f1353a.g());
    }

    private URL m3188a(String str) throws ag {
        String strM3206c = m3206c(str);
        try {
            return new URL(strM3206c);
        } catch (MalformedURLException e) {
            URL urlE = this.f1353a.e();
            if (urlE != null) {
                return new URL(urlE, strM3206c);
            }
            URL resource = ClassK.class.getResource(strM3206c);
            if (resource != null) {
                return resource;
            }
            File file = new File(strM3206c);
            if (!file.isAbsolute()) {
                file = new File(this.f1353a.d(), strM3206c);
            }
            return file.toURI().toURL();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b A[LOOP:0: B:7:0x0010->B:32:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x004b A[EDGE_INSN: B:34:0x004b->B:20:0x004b BREAK  A[LOOP:0: B:7:0x0010->B:32:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    private List m3189a(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, List list) throws ag {
        List arrayList = list == null ? new ArrayList() : list;
        if (z) {
            if (!z2) {
                m3196a(str, z4, true, false);
            } else if (z3) {
                m3196a(str, z4, true, false);
                if (this.f1355c.length() == 0) {
                    m3208d("closing ')'");
                } else if (!this.f1355c.equals(")")) {
                }
            } else {
                m3197a(z4, true);
                if (!m3218k()) {
                }
            }
            while (true) {
                if (z5) {
                    m3195a("java type", z6);
                }
                if (z7) {
                    this.f1355c = m3206c(this.f1355c);
                }
                if (z8) {
                    this.f1355c = ClassI.m760b(this.f1355c);
                }
                if (z9) {
                    this.f1355c = ClassI.m800w(this.f1355c);
                }
                arrayList.add(this.f1355c);
                if (z3) {
                    m3208d("separating ',' or closing ')'");
                } else {
                    m3217j();
                }
                if (!",".equals(this.f1355c)) {
                    break;
                    break;
                }
                m3196a(str, z4, true, false);
            }
        } else {
            while (true) {
                if (z5) {
                    m3195a("java type", z6);
                }
                if (z7) {
                    this.f1355c = m3206c(this.f1355c);
                }
                if (z8) {
                    this.f1355c = ClassI.m760b(this.f1355c);
                }
                if (z9) {
                    this.f1355c = ClassI.m800w(this.f1355c);
                }
                arrayList.add(this.f1355c);
                if (z3) {
                    m3208d("separating ',' or closing ')'");
                } else {
                    m3217j();
                }
                if (!",".equals(this.f1355c)) {
                    break;
                }
                m3196a(str, z4, true, false);
            }
        }
        return arrayList;
    }

    private List m3190a(List list) throws ag {
        m3196a("keyword 'class', 'interface', or 'enum'", false, false, true);
        f fVarM3219a = m3219a();
        if (this.f1355c == null) {
            throw new ag("Expecting '-keep' option after '-if' option, before " + this.f1353a.g());
        }
        if ("-keep".startsWith(this.f1355c)) {
            return m3191a(list, true, false, false, fVarM3219a);
        }
        if ("-keepclassmembers".startsWith(this.f1355c)) {
            return m3191a(list, false, false, false, fVarM3219a);
        }
        if ("-keepclasseswithmembers".startsWith(this.f1355c)) {
            return m3191a(list, false, true, false, fVarM3219a);
        }
        if ("-keepnames".startsWith(this.f1355c)) {
            return m3191a(list, true, false, true, fVarM3219a);
        }
        if ("-keepclassmembernames".startsWith(this.f1355c)) {
            return m3191a(list, false, false, true, fVarM3219a);
        }
        if ("-keepclasseswithmembernames".startsWith(this.f1355c)) {
            return m3191a(list, false, true, true, fVarM3219a);
        }
        throw new ag("Expecting '-keep' option after '-if' option, before " + this.f1353a.g());
    }

    private List m3191a(List list, boolean z, boolean z2, boolean z3, f fVar) {
        if (list == null) {
            list = new ArrayList();
        }
        list.add(m3186a(z, z2, z3, fVar));
        return list;
    }

    private List m3192a(boolean z, List list) throws ag {
        if (list == null) {
            list = new ArrayList();
        }
        if (z) {
            m3196a("keyword 'class', 'interface', or 'enum'", false, false, true);
        }
        list.add(m3219a());
        return list;
    }

    private void m3193a(int i, int i2) throws ag {
        if (((i | i2) & (-20704)) != 0) {
            throw new ag("Invalid method access modifier for field before " + this.f1353a.g());
        }
    }

    private void m3194a(String str, f fVar) throws ag {
        int i;
        int i2;
        int i3;
        String strM3157a = null;
        int i4 = 0;
        int i5 = 0;
        while (!m3204b(true)) {
            if ("@".equals(this.f1355c)) {
                strM3157a = ClassK.m3157a(m3189a("annotation type", true, false, false, false, true, false, false, false, true, null), false);
            } else {
                String strSubstring = this.f1355c.startsWith("!") ? this.f1355c.substring(1) : this.f1355c;
                if (strSubstring.equals("public")) {
                    i = 1;
                } else if (strSubstring.equals("private")) {
                    i = 2;
                } else if (strSubstring.equals("protected")) {
                    i = 4;
                } else if (strSubstring.equals("static")) {
                    i = 8;
                } else if (strSubstring.equals("final")) {
                    i = 16;
                } else if (strSubstring.equals("synchronized")) {
                    i = 32;
                } else if (strSubstring.equals("volatile")) {
                    i = 64;
                } else if (strSubstring.equals("transient")) {
                    i = 128;
                } else if (strSubstring.equals("bridge")) {
                    i = 64;
                } else if (strSubstring.equals("varargs")) {
                    i = 128;
                } else if (strSubstring.equals("native")) {
                    i = 256;
                } else if (strSubstring.equals("abstract")) {
                    i = 1024;
                } else if (strSubstring.equals("strictfp")) {
                    i = 2048;
                } else {
                    i = strSubstring.equals("synthetic") ? 4096 : 0;
                }
                if (i == 0) {
                    break;
                }
                if (strSubstring.equals(this.f1355c)) {
                    i3 = i | i5;
                    i2 = i4;
                } else {
                    i2 = i4 | i;
                    i3 = i5;
                }
                if ((i3 & i2) != 0) {
                    throw new ag("Conflicting class member access modifiers for " + this.f1353a.g());
                }
                m3208d("class member description");
                i4 = i2;
                i5 = i3;
            }
        }
        if ("*".equals(this.f1355c) || "<fields>".equals(this.f1355c) || "<methods>".equals(this.f1355c)) {
            if ("*".equals(this.f1355c)) {
                m3193a(i5, i4);
                m3203b(i5, i4);
                fVar.a(new ae(i5, i4, strM3157a, (String) null, (String) null));
                fVar.b(new ae(i5, i4, strM3157a, (String) null, (String) null));
            } else if ("<fields>".equals(this.f1355c)) {
                m3193a(i5, i4);
                fVar.a(new ae(i5, i4, strM3157a, (String) null, (String) null));
            } else if ("<methods>".equals(this.f1355c)) {
                m3203b(i5, i4);
                fVar.b(new ae(i5, i4, strM3157a, (String) null, (String) null));
            }
            m3208d("separator ';'");
            if (!";".equals(this.f1355c)) {
                throw new ag("Expecting separator ';' before " + this.f1353a.g());
            }
            return;
        }
        m3210e("java type");
        String str2 = this.f1355c;
        m3208d("class member name");
        String str3 = this.f1355c;
        if (!"(".equals(str3)) {
            m3210e("class member name");
            m3208d("opening '(' or separator ';'");
        } else {
            if (!str2.equals("<init>") && !str2.equals(str) && !str2.equals(ClassI.m769e(str))) {
                throw new ag("Expecting type and name instead of just '" + str2 + "' before " + this.f1353a.g());
            }
            str2 = "void";
            str3 = "<init>";
        }
        if (";".equals(this.f1355c)) {
            m3193a(i5, i4);
            fVar.a(new ae(i5, i4, strM3157a, str3, ClassI.m800w(str2)));
        } else {
            if (!"(".equals(this.f1355c)) {
                throw new ag("Expecting opening '(' or separator ';' before " + this.f1353a.g());
            }
            m3203b(i5, i4);
            String strM753a = ClassI.m753a(str2, m3189a("argument", true, true, true, false, true, false, false, false, false, null));
            if (!")".equals(this.f1355c)) {
                throw new ag("Expecting separating ',' or closing ')' before " + this.f1353a.g());
            }
            m3208d("separator ';'");
            if (!";".equals(this.f1355c)) {
                throw new ag("Expecting separator ';' before " + this.f1353a.g());
            }
            fVar.b(new ae(i5, i4, strM3157a, str3, strM753a));
        }
    }

    private void m3195a(String str, boolean z) throws ag {
        if (!m3212f(this.f1355c)) {
            throw new ag("Expecting " + str + " before " + this.f1353a.g());
        }
        if (!z && m3214g(this.f1355c)) {
            throw new ag("Use of generics not allowed for " + str + " at " + this.f1353a.g());
        }
    }

    private void m3196a(String str, boolean z, boolean z2, boolean z3) throws ag {
        m3197a(z, z2);
        if (m3204b(z3)) {
            throw new ag("Expecting " + str + " before " + this.f1353a.g());
        }
    }

    private void m3197a(boolean z, boolean z2) {
        this.f1355c = this.f1353a.a(z, z2);
    }

    private boolean m3198a(String str, int i) {
        int iIndexOf;
        int iIndexOf2 = str.indexOf(60, i);
        if (iIndexOf2 < 0 || (iIndexOf = str.indexOf(62, i + iIndexOf2 + 1)) < 0) {
            return false;
        }
        try {
            Integer.parseInt(str.substring(iIndexOf2 + 1, iIndexOf));
            return m3198a(str, iIndexOf);
        } catch (NumberFormatException e) {
            return true;
        }
    }

    private boolean m3199a(boolean z) {
        m3217j();
        return z;
    }

    private long m3200b(long j) {
        m3217j();
        return j;
    }

    private File m3201b(String str) throws ag {
        String strM3206c = m3206c(str);
        File file = new File(strM3206c);
        return !file.isAbsolute() ? new File(this.f1353a.d(), strM3206c) : file;
    }

    private void m3202b() throws ag {
        m3196a("base directory name", true, true, false);
        this.f1353a.a(m3201b(this.f1355c));
        m3217j();
    }

    private void m3203b(int i, int i2) throws ag {
        if (((i | i2) & (-7680)) != 0) {
            throw new ag("Invalid field access modifier for method before " + this.f1353a.g());
        }
    }

    private boolean m3204b(boolean z) {
        return this.f1355c == null || this.f1355c.startsWith("-") || (!z && this.f1355c.equals("@"));
    }

    private int m3205c() throws ag {
        m3208d("java version");
        int iM746a = ClassI.m746a(this.f1355c);
        if (iM746a == 0) {
            throw new ag("Unsupported java version " + this.f1353a.g());
        }
        m3217j();
        return iM746a;
    }

    private String m3206c(String str) throws ag {
        int iIndexOf;
        int length = 0;
        while (true) {
            int iIndexOf2 = str.indexOf(60, length);
            if (iIndexOf2 < 0 || (iIndexOf = str.indexOf(62, iIndexOf2 + 1)) < 0) {
                break;
            }
            String strSubstring = str.substring(iIndexOf2 + 1, iIndexOf);
            String property = this.f1354b.getProperty(strSubstring);
            if (property == null) {
                throw new ag("Value of system property '" + strSubstring + "' is undefined in " + this.f1353a.g());
            }
            str = str.substring(0, iIndexOf2) + property + str.substring(iIndexOf + 1);
            length = iIndexOf2 + property.length();
        }
        return str;
    }

    private int m3207d() throws ag {
        try {
            m3208d("integer");
            int i = Integer.parseInt(this.f1355c);
            if (i <= 0) {
                throw new ag("Expecting value larger than 0, instead of '" + this.f1355c + "' before " + this.f1353a.g());
            }
            m3217j();
            return i;
        } catch (NumberFormatException e) {
            throw new ag("Expecting integer argument instead of '" + this.f1355c + "' before " + this.f1353a.g());
        }
    }

    private void m3208d(String str) throws ag {
        m3196a(str, false, false, false);
    }

    private URL m3209e() throws ag {
        m3196a("file name", true, true, false);
        URL urlM3188a = m3188a(this.f1355c);
        m3217j();
        return urlM3188a;
    }

    private void m3210e(String str) throws ag {
        m3195a(str, true);
    }

    private File m3211f() throws ag {
        m3196a("file name", true, true, false);
        File fileM3201b = m3201b(this.f1355c);
        m3217j();
        return fileM3201b;
    }

    private boolean m3212f(String str) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isJavaIdentifierPart(cCharAt) && cCharAt != '.' && cCharAt != '[' && cCharAt != ']' && cCharAt != '<' && cCharAt != '>' && cCharAt != '-' && cCharAt != '!' && cCharAt != '*' && cCharAt != '?' && cCharAt != '%') {
                return false;
            }
        }
        return true;
    }

    private File m3213g() throws ag {
        m3197a(true, true);
        if (m3218k()) {
            return ClassH.f1204a;
        }
        File fileM3201b = m3201b(this.f1355c);
        m3217j();
        return fileM3201b;
    }

    private boolean m3214g(String str) {
        return m3198a(str, 0);
    }

    private String m3215h() {
        m3217j();
        if (m3218k()) {
            return "";
        }
        String str = this.f1355c;
        m3217j();
        return str;
    }

    private int m3216i() throws ag {
        throw new ag("Unexpected keyword " + this.f1353a.g());
    }

    private void m3217j() {
        m3197a(false, false);
    }

    private boolean m3218k() {
        return m3204b(false);
    }

    public f m3219a() throws ag {
        String str;
        int iM3216i;
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        String strM3157a = null;
        while (!SvgConstants.ATTR_CLASS.equals(this.f1355c)) {
            boolean zStartsWith = this.f1355c.startsWith("!");
            String strSubstring = zStartsWith ? this.f1355c.substring(1) : this.f1355c;
            if (strSubstring.equals("public")) {
                iM3216i = 1;
            } else if (strSubstring.equals("final")) {
                iM3216i = 16;
            } else if (strSubstring.equals("interface")) {
                iM3216i = 512;
            } else if (strSubstring.equals("abstract")) {
                iM3216i = 1024;
            } else if (strSubstring.equals("synthetic")) {
                iM3216i = 4096;
            } else if (strSubstring.equals("@")) {
                iM3216i = 8192;
            } else {
                iM3216i = strSubstring.equals("enum") ? 16384 : m3216i();
            }
            if (iM3216i == 8192) {
                m3196a("annotation type or keyword 'interface'", false, false, false);
                if (!this.f1355c.equals("interface") && !this.f1355c.equals("enum") && !this.f1355c.equals(SvgConstants.ATTR_CLASS)) {
                    strM3157a = ClassK.m3157a(m3189a("annotation type", false, false, false, false, true, false, false, false, true, null), false);
                }
            }
            if (zStartsWith) {
                i = i3 | iM3216i;
                i2 = i4;
            } else {
                i2 = i4 | iM3216i;
                i = i3;
            }
            if ((i2 & i) != 0) {
                throw new ag("Conflicting class access modifiers for '" + strSubstring + "' before " + this.f1353a.g());
            }
            if (strSubstring.equals("interface") || strSubstring.equals("enum")) {
                i3 = i;
                i4 = i2;
                break;
            }
            if (strSubstring.equals(SvgConstants.ATTR_CLASS)) {
                i3 = i;
                i4 = i2;
                break;
            }
            if (iM3216i != 8192) {
                m3196a("keyword 'class', 'interface', or 'enum'", false, false, true);
            }
            i3 = i;
            i4 = i2;
        }
        String strM3157a2 = ClassK.m3157a(m3189a("class name or interface name", true, false, false, false, true, false, false, false, false, null), false);
        String strM760b = "*".equals(strM3157a2) ? null : ClassI.m760b(strM3157a2);
        String strM760b2 = null;
        if (m3218k() || !("implements".equals(this.f1355c) || "extends".equals(this.f1355c))) {
            str = null;
        } else {
            m3196a("class name or interface name", false, false, true);
            String strM3157a3 = "@".equals(this.f1355c) ? ClassK.m3157a(m3189a("annotation type", true, false, false, false, true, false, false, false, true, null), false) : null;
            String strM3157a4 = ClassK.m3157a(m3189a("class name or interface name", false, false, false, false, true, false, false, false, false, null), false);
            strM760b2 = "*".equals(strM3157a4) ? null : ClassI.m760b(strM3157a4);
            str = strM3157a3;
        }
        f fVar = new f(this.f1356d, i4, i3, strM3157a, strM760b, str, strM760b2);
        if (!m3218k()) {
            if (!"{".equals(this.f1355c)) {
                throw new ag("Expecting opening '{' at " + this.f1353a.g());
            }
            while (true) {
                m3196a("class member description or closing '}'", false, false, true);
                if (this.f1355c.equals("}")) {
                    break;
                }
                m3194a(strM3157a2, fVar);
            }
            m3217j();
        }
        return fVar;
    }

    public void m3220a(ClassH c0467h) throws ag {
        while (this.f1355c != null) {
            this.f1356d = this.f1353a.f();
            if ("@".startsWith(this.f1355c) || "-include".startsWith(this.f1355c)) {
                c0467h.f1236h = m3185a(c0467h.f1236h);
            } else if ("-basedirectory".startsWith(this.f1355c)) {
                m3202b();
            } else if ("-injars".startsWith(this.f1355c)) {
                c0467h.f1230b = m3187a(c0467h.f1230b, false);
            } else if ("-outjars".startsWith(this.f1355c)) {
                c0467h.f1230b = m3187a(c0467h.f1230b, true);
            } else if ("-libraryjars".startsWith(this.f1355c)) {
                c0467h.f1231c = m3187a(c0467h.f1231c, false);
            } else {
                if ("-resourcejars".startsWith(this.f1355c)) {
                    throw new ag("The '-resourcejars' option is no longer supported. Please use the '-injars' option for all input");
                }
                if ("-skipnonpubliclibraryclasses".startsWith(this.f1355c)) {
                    c0467h.f1232d = m3199a(true);
                } else if ("-dontskipnonpubliclibraryclasses".startsWith(this.f1355c)) {
                    c0467h.f1232d = m3199a(false);
                } else if ("-dontskipnonpubliclibraryclassmembers".startsWith(this.f1355c)) {
                    c0467h.f1233e = m3199a(false);
                } else if ("-target".startsWith(this.f1355c)) {
                    c0467h.f1235g = m3205c();
                } else if ("-forceprocessing".startsWith(this.f1355c)) {
                    c0467h.f1236h = m3200b(Long.MAX_VALUE);
                } else if ("-if".startsWith(this.f1355c)) {
                    c0467h.f1237i = m3190a(c0467h.f1237i);
                } else if ("-keep".startsWith(this.f1355c)) {
                    c0467h.f1237i = m3191a(c0467h.f1237i, true, false, false, null);
                } else if ("-keepclassmembers".startsWith(this.f1355c)) {
                    c0467h.f1237i = m3191a(c0467h.f1237i, false, false, false, null);
                } else if ("-keepclasseswithmembers".startsWith(this.f1355c)) {
                    c0467h.f1237i = m3191a(c0467h.f1237i, false, true, false, null);
                } else if ("-keepnames".startsWith(this.f1355c)) {
                    c0467h.f1237i = m3191a(c0467h.f1237i, true, false, true, null);
                } else if ("-keepclassmembernames".startsWith(this.f1355c)) {
                    c0467h.f1237i = m3191a(c0467h.f1237i, false, false, true, null);
                } else if ("-keepclasseswithmembernames".startsWith(this.f1355c)) {
                    c0467h.f1237i = m3191a(c0467h.f1237i, false, true, true, null);
                } else if ("-printseeds".startsWith(this.f1355c)) {
                    c0467h.f1238j = m3213g();
                } else if ("-keepdirectories".startsWith(this.f1355c)) {
                    c0467h.f1234f = m3189a("directory name", true, true, false, true, false, true, true, false, false, c0467h.f1234f);
                } else if ("-dontshrink".startsWith(this.f1355c)) {
                    c0467h.f1239k = m3199a(false);
                } else if ("-printusage".startsWith(this.f1355c)) {
                    c0467h.f1240l = m3213g();
                } else if ("-whyareyoukeeping".startsWith(this.f1355c)) {
                    c0467h.f1241m = m3192a(true, c0467h.f1241m);
                } else if ("-dontoptimize".startsWith(this.f1355c)) {
                    c0467h.f1242n = m3199a(false);
                } else if ("-optimizationpasses".startsWith(this.f1355c)) {
                    c0467h.f1244p = m3207d();
                } else if ("-optimizations".startsWith(this.f1355c)) {
                    c0467h.f1243o = m3189a("optimization name", true, false, false, false, false, true, false, false, false, c0467h.f1243o);
                } else if ("-assumenosideeffects".startsWith(this.f1355c)) {
                    c0467h.f1245q = m3192a(true, c0467h.f1245q);
                } else if ("-assumenoexternalsideeffects".startsWith(this.f1355c)) {
                    c0467h.f1246r = m3192a(true, c0467h.f1246r);
                } else if ("-assumenoescapingparameters".startsWith(this.f1355c)) {
                    c0467h.f1247s = m3192a(true, c0467h.f1247s);
                } else if ("-assumenoexternalreturnvalues".startsWith(this.f1355c)) {
                    c0467h.f1248t = m3192a(true, c0467h.f1248t);
                } else if ("-allowaccessmodification".startsWith(this.f1355c)) {
                    c0467h.f1249u = m3199a(true);
                } else if ("-mergeinterfacesaggressively".startsWith(this.f1355c)) {
                    c0467h.f1250v = m3199a(true);
                } else if ("-dontobfuscate".startsWith(this.f1355c)) {
                    c0467h.f1251w = m3199a(false);
                } else if ("-printmapping".startsWith(this.f1355c)) {
                    c0467h.f1252x = m3213g();
                } else if ("-applymapping".startsWith(this.f1355c)) {
                    c0467h.f1253y = m3211f();
                } else if ("-obfuscationdictionary".startsWith(this.f1355c)) {
                    c0467h.f1254z = m3209e();
                } else if ("-classobfuscationdictionary".startsWith(this.f1355c)) {
                    c0467h.f1205A = m3209e();
                } else if ("-packageobfuscationdictionary".startsWith(this.f1355c)) {
                    c0467h.f1206B = m3209e();
                } else if ("-overloadaggressively".startsWith(this.f1355c)) {
                    c0467h.f1207C = m3199a(true);
                } else if ("-useuniqueclassmembernames".startsWith(this.f1355c)) {
                    c0467h.f1208D = m3199a(true);
                } else if ("-dontusemixedcaseclassnames".startsWith(this.f1355c)) {
                    c0467h.f1209E = m3199a(false);
                } else if ("-keeppackagenames".startsWith(this.f1355c)) {
                    c0467h.f1210F = m3189a("package name", true, true, false, false, true, false, false, true, false, c0467h.f1210F);
                } else if ("-flattenpackagehierarchy".startsWith(this.f1355c)) {
                    c0467h.f1211G = ClassI.m760b(m3215h());
                } else if ("-repackageclasses".startsWith(this.f1355c)) {
                    c0467h.f1212H = ClassI.m760b(m3215h());
                } else if ("-defaultpackage".startsWith(this.f1355c)) {
                    c0467h.f1212H = ClassI.m760b(m3215h());
                } else if ("-keepattributes".startsWith(this.f1355c)) {
                    c0467h.f1213I = m3189a("attribute name", true, true, false, false, true, false, false, false, false, c0467h.f1213I);
                } else if ("-keepparameternames".startsWith(this.f1355c)) {
                    c0467h.f1214J = m3199a(true);
                } else if ("-renamesourcefileattribute".startsWith(this.f1355c)) {
                    c0467h.f1215K = m3215h();
                } else if ("-adaptclassstrings".startsWith(this.f1355c)) {
                    c0467h.f1216L = m3189a("class name", true, true, false, false, true, false, false, true, false, c0467h.f1216L);
                } else if ("-adaptresourcefilenames".startsWith(this.f1355c)) {
                    c0467h.f1217M = m3189a("resource file name", true, true, false, true, false, true, false, false, false, c0467h.f1217M);
                } else if ("-adaptresourcefilecontents".startsWith(this.f1355c)) {
                    c0467h.f1218N = m3189a("resource file name", true, true, false, true, false, true, false, false, false, c0467h.f1218N);
                } else if ("-dontpreverify".startsWith(this.f1355c)) {
                    c0467h.f1219O = m3199a(false);
                } else if ("-microedition".startsWith(this.f1355c)) {
                    c0467h.f1220P = m3199a(true);
                } else if ("-android".startsWith(this.f1355c)) {
                    c0467h.f1221Q = m3199a(true);
                } else if ("-verbose".startsWith(this.f1355c)) {
                    c0467h.f1222R = m3199a(true);
                } else if ("-dontnote".startsWith(this.f1355c)) {
                    c0467h.f1223S = m3189a("class name", true, true, false, false, true, false, false, true, false, c0467h.f1223S);
                } else if ("-dontwarn".startsWith(this.f1355c)) {
                    c0467h.f1224T = m3189a("class name", true, true, false, false, true, false, false, true, false, c0467h.f1224T);
                } else if ("-ignorewarnings".startsWith(this.f1355c)) {
                    c0467h.f1225U = m3199a(true);
                } else if ("-printconfiguration".startsWith(this.f1355c)) {
                    c0467h.f1226V = m3213g();
                } else if ("-dump".startsWith(this.f1355c)) {
                    c0467h.f1227W = m3213g();
                } else {
                    if (!"-addconfigurationdebugging".startsWith(this.f1355c)) {
                        throw new ag("Unknown option " + this.f1353a.g());
                    }
                    c0467h.f1228X = m3199a(true);
                }
            }
        }
    }
}
