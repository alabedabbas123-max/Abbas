package a;

import java.io.IOException;
import a.b.f.ClassZ;
import a.j.ClassL;

public class ClassI {

    private final ClassH f1268a;

    public ClassI(ClassH c0467h) {
        this.f1268a = c0467h;
    }

    private void m2934a(ClassD c0173d, ClassD c0173d2) throws IOException {
        if (c0173d == null || c0173d2 == null) {
            return;
        }
        for (int i = 0; i < c0173d.m1295b(); i++) {
            ClassE c0243eM1292a = c0173d.m1292a(i);
            for (int i2 = 0; i2 < c0173d2.m1295b(); i2++) {
                if (c0173d != c0173d2 || i != i2) {
                    ClassE c0243eM1292a2 = c0173d2.m1292a(i2);
                    if (!c0243eM1292a2.m1688a().equals(c0243eM1292a.m1688a())) {
                        continue;
                    } else {
                        if (c0243eM1292a.m1693c()) {
                            if (!c0243eM1292a2.m1693c()) {
                                throw new IOException("Input jars and output jars must be different [" + c0243eM1292a.m1688a() + "].");
                            }
                            throw new IOException("The same output jar [" + c0243eM1292a.m1688a() + "] is specified twice.");
                        }
                        if (c0243eM1292a2.m1693c()) {
                            throw new IOException("Input jars and output jars must be different [" + c0243eM1292a.m1688a() + "].");
                        }
                        if (!c0243eM1292a.m1706k() || !c0243eM1292a2.m1706k()) {
                            throw new IOException("The same input jar [" + c0243eM1292a.m1688a() + "] is specified twice.");
                        }
                    }
                }
            }
        }
    }

    public void m2935a() throws IOException {
        ClassD c0173d = this.f1268a.f1230b;
        ClassD c0173d2 = this.f1268a.f1231c;
        if (c0173d == null) {
            throw new IOException("The input is empty. You have to specify one or more '-injars' options.");
        }
        ClassE c0243eM1292a = c0173d.m1292a(0);
        if (c0243eM1292a.m1693c()) {
            throw new IOException("The output jar [" + c0243eM1292a.m1688a() + "] must be specified after an input jar, or it will be empty.");
        }
        for (int i = 0; i < c0173d.m1295b() - 1; i++) {
            ClassE c0243eM1292a2 = c0173d.m1292a(i);
            if (c0243eM1292a2.m1693c() && !c0243eM1292a2.m1706k() && c0173d.m1292a(i + 1).m1693c()) {
                throw new IOException("The output jar [" + c0243eM1292a2.m1688a() + "] must have a filter, or all subsequent output jars will be empty.");
            }
        }
        m2934a(c0173d, c0173d);
        m2934a(c0173d, c0173d2);
        m2934a(c0173d2, c0173d2);
        if (this.f1268a.f1223S == null || !this.f1268a.f1223S.isEmpty()) {
            if (this.f1268a.f1251w && this.f1268a.f1209E && this.f1268a.f1205A == null) {
                String lowerCase = System.getProperty("os.name").toLowerCase();
                if (lowerCase.startsWith("windows") || lowerCase.startsWith("mac os")) {
                    for (int i2 = 0; i2 < c0173d.m1295b(); i2++) {
                        ClassE c0243eM1292a3 = c0173d.m1292a(i2);
                        if (c0243eM1292a3.m1693c() && !c0243eM1292a3.m1695d() && !c0243eM1292a3.m1697e() && !c0243eM1292a3.m1699f() && !c0243eM1292a3.m1701g() && !c0243eM1292a3.m1703h() && !c0243eM1292a3.m1704i() && !c0243eM1292a3.m1705j()) {
                            ClassL.m3161a("Note: you're writing the processed class files to a directory [" + c0243eM1292a3.m1688a() + "].");
                            ClassL.m3161a("      This will likely cause problems with obfuscated mixed-case class names.");
                            ClassL.m3161a("      You should consider writing the output to a jar file, or otherwise");
                            ClassL.m3161a("      specify '-dontusemixedcaseclassnames'.");
                            break;
                        }
                    }
                }
            }
            if (this.f1268a.f1218N != null && (this.f1268a.f1218N.isEmpty() || this.f1268a.f1218N.get(0).equals("**"))) {
                ClassL.m3161a("Note: you're specifying '-adaptresourcefilecontents' for all resource files.");
                ClassL.m3161a("      This will most likely cause problems with binary files.");
            }
            ClassZ c0094z = new ClassZ(this.f1268a.f1223S);
            new ClassZ(c0094z).m3283a(this.f1268a.f1237i);
            ClassZ c0094z2 = new ClassZ(this.f1268a.f1223S);
            new ClassB(c0094z2).m0a(this.f1268a.f1245q);
            int iM940a = c0094z.m940a();
            if (iM940a > 0) {
                ClassL.m3161a("Note: there were " + iM940a + " '-keepclassmembers' options that didn't specify class");
                ClassL.m3161a("      members. You should specify at least some class members or consider");
                ClassL.m3161a("      if you just need '-keep'.");
                ClassL.m3161a("      (http://proguard.sourceforge.net/manual/troubleshooting.html#classmembers)");
            }
            int iM940a2 = c0094z2.m940a();
            if (iM940a2 > 0) {
                ClassL.m3161a("Note: there were " + iM940a2 + " '-assumenosideeffects' options that try to match all");
                ClassL.m3161a("      methods with wildcards. This will likely cause problems with methods like");
                ClassL.m3161a("      'wait()' and 'notify()'. You should specify the methods more precisely.");
                ClassL.m3161a("      (http://proguard.sourceforge.net/manual/troubleshooting.html#nosideeffects)");
            }
        }
    }
}
