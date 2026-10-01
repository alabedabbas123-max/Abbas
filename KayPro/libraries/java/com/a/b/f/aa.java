package com.a.b.f;

import com.a.b.e.b.ab;
import com.a.b.e.b.Interfaceah;
import com.a.b.f.a.ClassM;
import java.util.EnumSet;

public class aa {

    private static boolean f3329a = true;

    private static Interfaceah f3330b;

    private static ab m5155a(ab c1168ab, int i, boolean z, EnumSet enumSet) {
        ap c1270apM5243a = am.m5243a(c1168ab, i, z);
        EnumSet enumSetClone = enumSet.clone();
        enumSetClone.remove(Enumab.CONST_COLLECTOR);
        m5158a(c1270apM5243a, enumSetClone);
        return ClassM.m5145a(c1270apM5243a, true);
    }

    public static ab m5156a(ab c1168ab, int i, boolean z, boolean z2, Interfaceah interfaceC1174ah) {
        return m5157a(c1168ab, i, z, z2, interfaceC1174ah, EnumSet.allOf(Enumab.class));
    }

    public static ab m5157a(ab c1168ab, int i, boolean z, boolean z2, Interfaceah interfaceC1174ah, EnumSet enumSet) {
        f3329a = z2;
        f3330b = interfaceC1174ah;
        ap c1270apM5243a = am.m5243a(c1168ab, i, z);
        m5158a(c1270apM5243a, enumSet);
        ab c1168abM5145a = ClassM.m5145a(c1270apM5243a, false);
        return c1168abM5145a.m4746a().m4826e() > f3330b.mo4810a() ? m5155a(c1168ab, i, z, enumSet) : c1168abM5145a;
    }

    private static void m5158a(ap c1270ap, EnumSet enumSet) {
        boolean z = false;
        boolean z2 = true;
        if (enumSet.contains(Enumab.MOVE_PARAM_COMBINER)) {
            ClassW.m5397a(c1270ap);
        }
        if (enumSet.contains(Enumab.SCCP)) {
            ah.m5192a(c1270ap);
            ClassE.m5335a(c1270ap);
            z2 = false;
        }
        if (enumSet.contains(Enumab.LITERAL_UPGRADE)) {
            ClassS.m5377a(c1270ap);
            ClassE.m5335a(c1270ap);
            z2 = false;
        }
        enumSet.remove(Enumab.ESCAPE_ANALYSIS);
        if (enumSet.contains(Enumab.ESCAPE_ANALYSIS)) {
            ClassL.m5361a(c1270ap);
            ClassE.m5335a(c1270ap);
            z2 = false;
        }
        if (enumSet.contains(Enumab.CONST_COLLECTOR)) {
            ClassB.m5330a(c1270ap);
            ClassE.m5335a(c1270ap);
        } else {
            z = z2;
        }
        if (z) {
            ClassE.m5335a(c1270ap);
        }
        af.m5181a(c1270ap);
    }

    public static boolean m5159a() {
        return f3329a;
    }

    public static Interfaceah m5160b() {
        return f3330b;
    }
}
