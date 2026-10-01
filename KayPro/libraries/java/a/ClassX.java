package a;

import a.aa;
import a.ac;
import a.ae;
import a.b.a.d.a;
import a.b.b;
import a.b.g.s;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttEnclosingMethod;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttInnerClasses;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSignature;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import a.b.d.a.ClassA;
import a.b.f.ClassF;
import a.b.f.ClassG;
import a.b.f.ClassH;
import a.b.f.ClassK;
import a.b.f.ClassL;
import a.b.f.ClassO;
import a.b.f.ClassX;
import a.b.f.ClassY;
import a.b.f.ClassZ;
import a.b.g.af;
import a.b.g.at;
import a.b.g.bi;
import a.b.g.ClassD;
import a.b.g.ClassJ;
import a.b.g.ClassK;
import a.b.g.ClassM;
import a.j.Abstractt;
import a.j.ClassC;
import a.j.ClassF;
import a.j.ClassJ;
import a.j.ClassL;
import a.j.ClassO;

public class ClassX {

    private final ClassH f1377a;

    public ClassX(ClassH c0467h) {
        this.f1377a = c0467h;
    }

    private Abstractt m3275a(List list, boolean z) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= list.size()) {
                    break;
                }
                aa aaVar = (aa) list.get(i2);
                if (aaVar.k || !z) {
                    String str = aaVar.e;
                    if (str != null && !m3276a(str)) {
                        arrayList.add(str);
                    }
                    String str2 = aaVar.g;
                    if (str2 != null && !m3276a(str2)) {
                        arrayList.add(str2);
                    }
                }
                i = i2 + 1;
            }
            if (arrayList.size() > 0) {
                return new ClassJ(new ClassC()).m3155a(arrayList);
            }
        }
        return null;
    }

    private static boolean m3276a(String str) {
        int iIndexOf;
        int iIndexOf2 = str.indexOf(60);
        if (iIndexOf2 < 0 || (iIndexOf = str.indexOf(62, iIndexOf2 + 1)) < 0) {
            return false;
        }
        try {
            Integer.parseInt(str.substring(iIndexOf2 + 1, iIndexOf));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private Abstractt m3277b(List list, boolean z) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                aa aaVar = (aa) list.get(i);
                List list2 = z ? aaVar.i : aaVar.j;
                if (list2 != null) {
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        String str = ((ae) list2.get(i2)).d;
                        if (str != null && !m3276a(str)) {
                            arrayList.add(str);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                return new ClassJ(new ClassO()).m3155a(arrayList);
            }
        }
        return null;
    }

    public void m3278a(b bVar, b bVar2) throws IOException {
        new PrintWriter((OutputStream) System.out, true);
        new PrintWriter((OutputStream) System.err, true);
        int iC = bVar2.c();
        ClassZ c0094z = new ClassZ(this.f1377a.f1223S);
        ClassR c0527r = new ClassR(bVar, bVar2, c0094z);
        c0527r.m3260a(this.f1377a.f1237i);
        c0527r.m3260a(this.f1377a.f1245q);
        c0527r.m3260a(this.f1377a.f1246r);
        c0527r.m3260a(this.f1377a.f1247s);
        c0527r.m3260a(this.f1377a.f1248t);
        Abstractt abstractC0515tM3155a = this.f1377a.f1213I != null ? new ClassJ(new ClassO()).m3155a(this.f1377a.f1213I) : new ClassF();
        ClassZ c0094z2 = new ClassZ(this.f1377a.f1223S);
        if (!abstractC0515tM3155a.mo3151a(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME)) {
            bVar.a(new a.b.b.a.b(new ClassT(c0094z2)));
        }
        ClassZ c0094z3 = new ClassZ(this.f1377a.f1223S);
        if (!abstractC0515tM3155a.mo3151a(AttSignature.ATTRIBUTE_NAME)) {
            bVar.a(new a.b.b.a.b(new ClassW(c0094z3)));
        }
        ClassZ c0094z4 = new ClassZ(this.f1377a.f1223S);
        if (!abstractC0515tM3155a.mo3151a(AttInnerClasses.ATTRIBUTE_NAME)) {
            bVar.a(new a.b.b.a.b(new ClassU(c0094z4)));
        }
        ClassZ c0094z5 = new ClassZ(this.f1377a.f1223S);
        if (!abstractC0515tM3155a.mo3151a(AttEnclosingMethod.ATTRIBUTE_NAME)) {
            bVar.a(new a.b.b.a.b(new ClassV(c0094z5)));
        }
        b bVar3 = this.f1377a.f1208D ? null : new b();
        ClassZ c0094z6 = new ClassZ(this.f1377a.f1224T);
        ClassZ c0094z7 = new ClassZ(this.f1377a.f1224T);
        bVar.a(new ClassH(bVar, bVar2, c0094z6, null));
        bVar2.a(new ClassH(bVar, bVar2, null, c0094z7));
        ClassZ c0094z8 = new ClassZ(this.f1377a.f1224T);
        ClassZ c0094z9 = new ClassZ(this.f1377a.f1224T);
        bVar.a(new ClassF(bVar, bVar2, c0094z6, c0094z8, c0094z9, null));
        if (bVar3 != null) {
            bVar.a(new bi(new af(new ClassM(bVar3))));
            bVar3.a(new ClassH(bVar, bVar2, c0094z6, null));
        }
        bVar.a(new a(true, new a.b.a.a.b.b(true, new ClassO())));
        ClassZ c0094z10 = new ClassZ(this.f1377a.f1223S);
        ClassZ c0094z11 = new ClassZ(this.f1377a.f1223S);
        bVar.a(new ClassD(new a(new ClassA(new ClassK(bVar, bVar2, c0094z10, null, c0094z11, m3275a(this.f1377a.f1237i, true))))));
        new ClassZ(this.f1377a.f1223S);
        ClassZ c0094z12 = new ClassZ(this.f1377a.f1223S);
        bVar.a(new ClassD(new a(new ClassL(bVar, bVar2, c0094z12, m3277b(this.f1377a.f1237i, true), m3277b(this.f1377a.f1237i, false)))));
        if (this.f1377a.f1216L != null) {
            bVar.a(new ClassK(this.f1377a.f1216L, (s) new a.b.b.a.b(new ClassX(bVar, bVar2))));
        }
        if (bVar3 != null) {
            bVar.a(new bi(new af(new ClassJ(true, true, true, false, new af(new ClassM(bVar3))))));
            bVar3.a(new ClassF(bVar, bVar2, null, null, null, c0094z7));
            bVar2.a();
            bVar3.a(new at(new ClassJ(true, true, true, false, new af(new ClassM(bVar2))), new bi(new af(new ClassJ(true, true, true, false, new af(new ClassM(bVar2)))))));
        } else {
            bVar2.a(new ClassF(bVar, bVar2, null, null, null, c0094z7));
        }
        bVar.a(new ClassG());
        bVar2.a(new ClassG());
        bVar.a(new ClassY());
        bVar2.a(new ClassY());
        ClassZ c0094z13 = new ClassZ(this.f1377a.f1223S);
        ClassC c0166c = new ClassC(bVar, c0094z13);
        c0166c.m1275a(this.f1377a.f1237i);
        c0166c.m1275a(this.f1377a.f1245q);
        c0166c.m1275a(this.f1377a.f1246r);
        c0166c.m1275a(this.f1377a.f1247s);
        c0166c.m1275a(this.f1377a.f1248t);
        ClassZ c0094z14 = new ClassZ(this.f1377a.f1223S);
        new ClassO(bVar, bVar2, c0094z14).m3251a(this.f1377a.f1237i);
        ClassZ c0094z15 = new ClassZ(this.f1377a.f1223S);
        new ac(bVar, bVar2, c0094z15).a(this.f1377a.f1237i);
        int iM940a = c0094z.m940a();
        if (iM940a > 0) {
            ClassL.m3161a("Note: there were " + iM940a + " references to unknown classes.");
            ClassL.m3161a("      You should check your configuration for typos.");
            ClassL.m3161a("      (http://proguard.sourceforge.net/manual/troubleshooting.html#unknownclass)");
        }
        int iM940a2 = c0094z13.m940a();
        if (iM940a2 > 0) {
            ClassL.m3161a("Note: there were " + iM940a2 + " references to unknown class members.");
            ClassL.m3161a("      You should check your configuration for typos.");
        }
        int iM940a3 = c0094z2.m940a();
        if (iM940a3 > 0) {
            ClassL.m3161a("Note: there were " + iM940a3 + " classes trying to access annotations using reflection.");
            ClassL.m3161a("      You should consider keeping the annotation attributes");
            ClassL.m3161a("      (using '-keepattributes *Annotation*').");
            ClassL.m3161a("      (http://proguard.sourceforge.net/manual/troubleshooting.html#attributes)");
        }
        int iM940a4 = c0094z3.m940a();
        if (iM940a4 > 0) {
            ClassL.m3161a("Note: there were " + iM940a4 + " classes trying to access generic signatures using reflection.");
            ClassL.m3161a("      You should consider keeping the signature attributes");
            ClassL.m3161a("      (using '-keepattributes Signature').");
            ClassL.m3161a("      (http://proguard.sourceforge.net/manual/troubleshooting.html#attributes)");
        }
        int iM940a5 = c0094z4.m940a();
        if (iM940a5 > 0) {
            ClassL.m3161a("Note: there were " + iM940a5 + " classes trying to access enclosing classes using reflection.");
            ClassL.m3161a("      You should consider keeping the inner classes attributes");
            ClassL.m3161a("      (using '-keepattributes InnerClasses').");
            ClassL.m3161a("      (http://proguard.sourceforge.net/manual/troubleshooting.html#attributes)");
        }
        int iM940a6 = c0094z5.m940a();
        if (iM940a6 > 0) {
            ClassL.m3161a("Note: there were " + iM940a6 + " classes trying to access enclosing methods using reflection.");
            ClassL.m3161a("      You should consider keeping the enclosing method attributes");
            ClassL.m3161a("      (using '-keepattributes InnerClasses,EnclosingMethod').");
            ClassL.m3161a("      (http://proguard.sourceforge.net/manual/troubleshooting.html#attributes)");
        }
        int iM940a7 = c0094z14.m940a();
        if (iM940a7 > 0) {
            ClassL.m3161a("Note: there were " + iM940a7 + " unkept descriptor classes in kept class members.");
            ClassL.m3161a("      You should consider explicitly keeping the mentioned classes");
            ClassL.m3161a("      (using '-keep').");
            ClassL.m3161a("      (http://proguard.sourceforge.net/manual/troubleshooting.html#descriptorclass)");
        }
        int iM940a8 = c0094z15.m940a();
        if (iM940a8 > 0) {
            ClassL.m3161a("Note: there were " + iM940a8 + " library classes explicitly being kept.");
            ClassL.m3161a("      You don't need to keep library classes; they are already left unchanged.");
            ClassL.m3161a("      (http://proguard.sourceforge.net/manual/troubleshooting.html#libraryclass)");
        }
        int iM940a9 = c0094z10.m940a();
        if (iM940a9 > 0) {
            ClassL.m3161a("Note: there were " + iM940a9 + " unresolved dynamic references to classes or interfaces.");
            ClassL.m3161a("      You should check if you need to specify additional program jars.");
            ClassL.m3161a("      (http://proguard.sourceforge.net/manual/troubleshooting.html#dynamicalclass)");
        }
        int iM940a10 = c0094z11.m940a();
        if (iM940a10 > 0) {
            ClassL.m3161a("Note: there were " + iM940a10 + " class casts of dynamically created class instances.");
            ClassL.m3161a("      You might consider explicitly keeping the mentioned classes and/or");
            ClassL.m3161a("      their implementations (using '-keep').");
            ClassL.m3161a("      (http://proguard.sourceforge.net/manual/troubleshooting.html#dynamicalclasscast)");
        }
        int iM940a11 = c0094z12.m940a();
        if (iM940a11 > 0) {
            ClassL.m3161a("Note: there were " + iM940a11 + " accesses to class members by means of introspection.");
            ClassL.m3161a("      You should consider explicitly keeping the mentioned class members");
            ClassL.m3161a("      (using '-keep' or '-keepclassmembers').");
            ClassL.m3161a("      (http://proguard.sourceforge.net/manual/troubleshooting.html#dynamicalclassmember)");
        }
        int iM940a12 = c0094z6.m940a();
        if (iM940a12 > 0) {
            ClassL.m3161a("Warning: there were " + iM940a12 + " unresolved references to classes or interfaces.");
            ClassL.m3161a("         You may need to add missing library jars or update their versions.");
            ClassL.m3161a("         If your code works fine without the missing classes, you can suppress");
            ClassL.m3161a("         the warnings with '-dontwarn' options.");
            if (this.f1377a.f1232d) {
                ClassL.m3161a("         You may also have to remove the option '-skipnonpubliclibraryclasses'.");
            }
            ClassL.m3161a("         (http://proguard.sourceforge.net/manual/troubleshooting.html#unresolvedclass)");
        }
        int iM940a13 = c0094z7.m940a();
        if (iM940a13 > 0) {
            ClassL.m3161a("Warning: there were " + iM940a13 + " instances of library classes depending on program classes.");
            ClassL.m3161a("         You must avoid such dependencies, since the program classes will");
            ClassL.m3161a("         be processed, while the library classes will remain unchanged.");
            ClassL.m3161a("         (http://proguard.sourceforge.net/manual/troubleshooting.html#dependency)");
        }
        int iM940a14 = c0094z8.m940a();
        if (iM940a14 > 0) {
            ClassL.m3161a("Warning: there were " + iM940a14 + " unresolved references to program class members.");
            ClassL.m3161a("         Your input classes appear to be inconsistent.");
            ClassL.m3161a("         You may need to recompile the code.");
            ClassL.m3161a("         (http://proguard.sourceforge.net/manual/troubleshooting.html#unresolvedprogramclassmember)");
        }
        int iM940a15 = c0094z9.m940a();
        if (iM940a15 > 0) {
            ClassL.m3161a("Warning: there were " + iM940a15 + " unresolved references to library class members.");
            ClassL.m3161a("         You probably need to update the library versions.");
            if (!this.f1377a.f1233e) {
                ClassL.m3161a("         Alternatively, you may have to specify the option ");
                ClassL.m3161a("         '-dontskipnonpubliclibraryclassmembers'.");
            }
            if (this.f1377a.f1232d) {
                ClassL.m3161a("         You may also have to remove the option '-skipnonpubliclibraryclasses'.");
            }
            ClassL.m3161a("         (http://proguard.sourceforge.net/manual/troubleshooting.html#unresolvedlibraryclassmember)");
        }
        if ((iM940a12 > 0 || iM940a13 > 0 || iM940a14 > 0 || iM940a15 > 0) && !this.f1377a.f1225U) {
            throw new IOException("Please correct the above warnings first.");
        }
        if ((this.f1377a.f1223S == null || !this.f1377a.f1223S.isEmpty()) && ((this.f1377a.f1224T != null && this.f1377a.f1224T.isEmpty()) || this.f1377a.f1225U)) {
            ClassL.m3161a("Note: you're ignoring all warnings!");
        }
        if (this.f1377a.f1222R) {
            ClassL.m3161a("Ignoring unused library classes...");
            ClassL.m3161a("  Original number of library classes: " + iC);
            ClassL.m3161a("  Final number of library classes:    " + bVar2.c());
        }
    }
}
