package a;

import a.aa;
import a.ae;
import a.f;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import a.b.f.ClassI;
import a.j.ClassK;

public class ClassL {

    private static final String[] f1357a = {"-keep", "-keepclassmembers", "-keepclasseswithmembers"};

    private final PrintWriter f1358b;

    private File f1359c;

    public ClassL(PrintWriter printWriter) {
        this.f1358b = printWriter;
    }

    private String m3221a(File file) {
        String absolutePath = file.getAbsolutePath();
        if (this.f1359c != null) {
            String str = this.f1359c.getAbsolutePath() + File.separator;
            if (absolutePath.startsWith(str)) {
                absolutePath = absolutePath.substring(str.length());
            }
        }
        return m3237b(absolutePath);
    }

    private void m3222a(String str) {
        if (str != null) {
            int i = 0;
            while (i < str.length()) {
                int iIndexOf = str.indexOf(10, i);
                if (iIndexOf < 0) {
                    iIndexOf = str.length();
                }
                this.f1358b.print('#');
                if (str.charAt(i) != ' ') {
                    this.f1358b.print(' ');
                }
                this.f1358b.println(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    private void m3223a(String str, int i) {
        if (i != 1) {
            this.f1358b.print(str);
            this.f1358b.print(' ');
            this.f1358b.println(i);
        }
    }

    private void m3224a(String str, f fVar) {
        this.f1358b.println();
        m3222a(fVar.a);
        this.f1358b.print(str);
        this.f1358b.print(' ');
        if (fVar.d != null) {
            this.f1358b.print("@");
            this.f1358b.print(ClassI.m802y(fVar.d));
            this.f1358b.print(' ');
        }
        this.f1358b.print(ClassI.m759b(fVar.c, "!"));
        this.f1358b.print(ClassI.m771f(fVar.b));
        if (((fVar.b | fVar.c) & 49664) == 0) {
            this.f1358b.print(SvgConstants.ATTR_CLASS);
        }
        this.f1358b.print(' ');
        this.f1358b.print(fVar.e != null ? ClassI.m764c(fVar.e) : "*");
        if (fVar.f != null || fVar.g != null) {
            this.f1358b.print(' ');
            this.f1358b.print("extends");
            this.f1358b.print(' ');
            if (fVar.f != null) {
                this.f1358b.print("@");
                this.f1358b.print(ClassI.m802y(fVar.f));
                this.f1358b.print(' ');
            }
            this.f1358b.print(fVar.g != null ? ClassI.m764c(fVar.g) : "*");
        }
        if (fVar.i == null && fVar.j == null) {
            this.f1358b.println();
            return;
        }
        this.f1358b.print(' ');
        this.f1358b.println("{");
        m3233a(fVar.i);
        m3239b(fVar.j);
        this.f1358b.println("}");
    }

    private void m3225a(String str, File file) {
        if (file != null) {
            if (file.getPath().length() <= 0) {
                this.f1358b.println(str);
                return;
            }
            this.f1358b.print(str);
            this.f1358b.print(' ');
            this.f1358b.println(m3221a(file));
        }
    }

    private void m3226a(String str, String str2) {
        m3228a(str, str2, false);
    }

    private void m3227a(String str, String str2, ClassD c0173d) {
        if (c0173d != null) {
            for (int i = 0; i < c0173d.m1295b(); i++) {
                ClassE c0243eM1292a = c0173d.m1292a(i);
                this.f1358b.print(c0243eM1292a.m1693c() ? str2 : str);
                this.f1358b.print(' ');
                this.f1358b.print(m3221a(c0243eM1292a.m1690b()));
                if (m3236a(m3236a(m3236a(m3236a(m3236a(m3236a(m3236a(m3236a(false, c0243eM1292a.m1710o()), c0243eM1292a.m1708m()), c0243eM1292a.m1714s()), c0243eM1292a.m1713r()), c0243eM1292a.m1712q()), c0243eM1292a.m1711p()), c0243eM1292a.m1709n()), c0243eM1292a.m1707l())) {
                    this.f1358b.print(")");
                }
                this.f1358b.println();
            }
        }
    }

    private void m3228a(String str, String str2, boolean z) {
        if (str2 != null) {
            if (z) {
                str2 = ClassI.m764c(str2);
            }
            this.f1358b.print(str);
            this.f1358b.print(' ');
            this.f1358b.println(m3237b(str2));
        }
    }

    private void m3229a(String str, URL url) {
        if (url != null) {
            if (url.getPath().length() <= 0) {
                this.f1358b.println(str);
                return;
            }
            String externalForm = url.toExternalForm();
            if (url.getProtocol().equals("file")) {
                try {
                    externalForm = m3221a(new File(url.toURI()));
                } catch (URISyntaxException e) {
                }
            }
            this.f1358b.print(str);
            this.f1358b.print(' ');
            this.f1358b.println(externalForm);
        }
    }

    private void m3230a(String str, List list) {
        m3231a(str, list, false);
    }

    private void m3231a(String str, List list, boolean z) {
        if (list != null) {
            if (list.isEmpty()) {
                this.f1358b.println(str);
                return;
            }
            if (z) {
                list = m3240c(list);
            }
            this.f1358b.print(str);
            this.f1358b.print(' ');
            this.f1358b.println(ClassK.m3157a(list, true));
        }
    }

    private void m3232a(String str, boolean z) {
        if (z) {
            this.f1358b.println(str);
        }
    }

    private void m3233a(List list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ae aeVar = (ae) list.get(i);
                this.f1358b.print("    ");
                if (aeVar.c != null) {
                    this.f1358b.print("@");
                    this.f1358b.println(ClassI.m802y(aeVar.c));
                    this.f1358b.print("    ");
                }
                this.f1358b.print(ClassI.m763c(aeVar.b, "!"));
                this.f1358b.print(ClassI.m775g(aeVar.a));
                String str = aeVar.d;
                String str2 = aeVar.e;
                this.f1358b.print(str2 == null ? str == null ? "<fields>" : "*** " + str : ClassI.m749a(0, str == null ? "*" : str, str2));
                this.f1358b.println(";");
            }
        }
    }

    private void m3234a(String[] strArr, aa aaVar) {
        char c;
        if (aaVar.r != null) {
            m3224a("-if", aaVar.r);
        }
        if (aaVar.l) {
            c = 2;
        } else {
            c = aaVar.k ? (char) 0 : (char) 1;
        }
        String str = strArr[c];
        if (aaVar.m) {
            str = str + ",includedescriptorclasses";
        }
        if (aaVar.n) {
            str = str + ",includecode";
        }
        if (aaVar.o) {
            str = str + ",allowshrinking";
        }
        if (aaVar.p) {
            str = str + ",allowoptimization";
        }
        if (aaVar.q) {
            str = str + ",allowobfuscation";
        }
        m3224a(str, (f) aaVar);
    }

    private void m3235a(String[] strArr, List list) {
        if (list == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return;
            }
            m3234a(strArr, (aa) list.get(i2));
            i = i2 + 1;
        }
    }

    private boolean m3236a(boolean z, List list) {
        if (z) {
            this.f1358b.print(";");
        }
        if (list == null) {
            return z;
        }
        if (!z) {
            this.f1358b.print("(");
        }
        this.f1358b.print(ClassK.m3157a(list, true));
        return true;
    }

    private String m3237b(String str) {
        return (str.length() == 0 || str.indexOf(32) >= 0 || str.indexOf(64) >= 0 || str.indexOf(123) >= 0 || str.indexOf(125) >= 0 || str.indexOf(40) >= 0 || str.indexOf(41) >= 0 || str.indexOf(58) >= 0 || str.indexOf(59) >= 0 || str.indexOf(44) >= 0) ? "'" + str + "'" : str;
    }

    private void m3238b(String str, List list) {
        if (list == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return;
            }
            m3224a(str, (f) list.get(i2));
            i = i2 + 1;
        }
    }

    private void m3239b(List list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ae aeVar = (ae) list.get(i);
                this.f1358b.print("    ");
                if (aeVar.c != null) {
                    this.f1358b.print("@");
                    this.f1358b.println(ClassI.m802y(aeVar.c));
                    this.f1358b.print("    ");
                }
                this.f1358b.print(ClassI.m766d(aeVar.b, "!"));
                this.f1358b.print(ClassI.m777h(aeVar.a));
                String str = aeVar.d;
                String str2 = aeVar.e;
                this.f1358b.print(str2 == null ? str == null ? "<methods>" : "*** " + str + "(...)" : ClassI.m751a("<init>", 0, str == null ? "*" : str, str2));
                this.f1358b.println(";");
            }
        }
    }

    private List m3240c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return arrayList;
            }
            arrayList.add(ClassI.m764c((String) list.get(i2)));
            i = i2 + 1;
        }
    }

    public void m3241a(ClassH c0467h) throws IOException {
        m3227a("-injars", "-outjars", c0467h.f1230b);
        this.f1358b.println();
        m3227a("-libraryjars", "-libraryjars", c0467h.f1231c);
        this.f1358b.println();
        m3232a("-skipnonpubliclibraryclasses", c0467h.f1232d);
        m3232a("-dontskipnonpubliclibraryclassmembers", !c0467h.f1233e);
        m3230a("-keepdirectories", c0467h.f1234f);
        m3226a("-target", ClassI.m765d(c0467h.f1235g));
        m3232a("-forceprocessing", c0467h.f1236h == Long.MAX_VALUE);
        m3232a("-dontshrink", !c0467h.f1239k);
        m3225a("-printusage", c0467h.f1240l);
        m3232a("-dontoptimize", !c0467h.f1242n);
        m3230a("-optimizations", c0467h.f1243o);
        m3223a("-optimizationpasses", c0467h.f1244p);
        m3232a("-allowaccessmodification", c0467h.f1249u);
        m3232a("-mergeinterfacesaggressively", c0467h.f1250v);
        m3232a("-dontobfuscate", !c0467h.f1251w);
        m3225a("-printmapping", c0467h.f1252x);
        m3225a("-applymapping", c0467h.f1253y);
        m3229a("-obfuscationdictionary", c0467h.f1254z);
        m3229a("-classobfuscationdictionary", c0467h.f1205A);
        m3229a("-packageobfuscationdictionary", c0467h.f1206B);
        m3232a("-overloadaggressively", c0467h.f1207C);
        m3232a("-useuniqueclassmembernames", c0467h.f1208D);
        m3232a("-dontusemixedcaseclassnames", !c0467h.f1209E);
        m3231a("-keeppackagenames", c0467h.f1210F, true);
        m3228a("-flattenpackagehierarchy", c0467h.f1211G, true);
        m3228a("-repackageclasses", c0467h.f1212H, true);
        m3230a("-keepattributes", c0467h.f1213I);
        m3232a("-keepparameternames", c0467h.f1214J);
        m3226a("-renamesourcefileattribute", c0467h.f1215K);
        m3231a("-adaptclassstrings", c0467h.f1216L, true);
        m3230a("-adaptresourcefilenames", c0467h.f1217M);
        m3230a("-adaptresourcefilecontents", c0467h.f1218N);
        m3232a("-dontpreverify", c0467h.f1219O ? false : true);
        m3232a("-microedition", c0467h.f1220P);
        m3232a("-android", c0467h.f1221Q);
        m3232a("-verbose", c0467h.f1222R);
        m3231a("-dontnote", c0467h.f1223S, true);
        m3231a("-dontwarn", c0467h.f1224T, true);
        m3232a("-ignorewarnings", c0467h.f1225U);
        m3225a("-printconfiguration", c0467h.f1226V);
        m3225a("-dump", c0467h.f1227W);
        m3232a("-addconfigurationdebugging", c0467h.f1228X);
        m3225a("-printseeds", c0467h.f1238j);
        this.f1358b.println();
        m3238b("-whyareyoukeeping", c0467h.f1241m);
        this.f1358b.println();
        m3235a(f1357a, c0467h.f1237i);
        m3238b("-assumenosideeffects", c0467h.f1245q);
        m3238b("-assumenoexternalsideeffects", c0467h.f1246r);
        m3238b("-assumenoescapingparameters", c0467h.f1247s);
        m3238b("-assumenoexternalreturnvalues", c0467h.f1248t);
        if (this.f1358b.checkError()) {
            throw new IOException("Can't write configuration");
        }
    }
}
