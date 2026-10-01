package com.a.b.f;

import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

public class ClassE {

    private final ap f3407a;

    private final int f3408b;

    private final BitSet f3409c;

    private final ArrayList[] f3410d;

    private ClassE(ap c1270ap) {
        this.f3407a = c1270ap;
        this.f3408b = c1270ap.m5294g();
        this.f3409c = new BitSet(this.f3408b);
        this.f3410d = this.f3407a.m5300m();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.$r8$lambda$3Jn-YhBaujEHu2U7RtYHYfrstds(FixTypesVisitor.java:0)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor$$ExternalSyntheticLambda8.apply(D8$$SyntheticClass:0)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void m5334a() {
        m5338b();
        HashSet hashSet = new HashSet();
        this.f3407a.m5280a(new ClassF(this.f3409c));
        while (true) {
            int iNextSetBit = this.f3409c.nextSetBit(0);
            if (iNextSetBit < 0) {
                this.f3407a.m5281a(hashSet);
                return;
            }
            this.f3409c.clear(iNextSetBit);
            if (this.f3410d[iNextSetBit].size() == 0 || m5336a(iNextSetBit, null)) {
                Abstractan abstractC1268anM5288c = this.f3407a.m5288c(iNextSetBit);
                if (!hashSet.contains(abstractC1268anM5288c)) {
                    ClassX c1197xMo5171b = abstractC1268anM5288c.mo5171b();
                    int iD_ = c1197xMo5171b.m5476d_();
                    for (int i = 0; i < iD_; i++) {
                        ClassU c1194uM4916b = c1197xMo5171b.m4916b(i);
                        this.f3410d[c1194uM4916b.m4894g()].remove(abstractC1268anM5288c);
                        if (!m5339b(this.f3407a.m5288c(c1194uM4916b.m4894g()))) {
                            this.f3409c.set(c1194uM4916b.m4894g());
                        }
                    }
                    hashSet.add(abstractC1268anM5288c);
                }
            }
        }
    }

    public static void m5335a(ap c1270ap) {
        new ClassE(c1270ap).m5334a();
    }

    private boolean m5336a(int i, BitSet bitSet) {
        if (bitSet != null && bitSet.get(i)) {
            return true;
        }
        Iterator it = this.f3410d[i].iterator();
        while (it.hasNext()) {
            if (m5339b((Abstractan) it.next())) {
                return false;
            }
        }
        if (bitSet == null) {
            bitSet = new BitSet(this.f3408b);
        }
        bitSet.set(i);
        Iterator it2 = this.f3410d[i].iterator();
        while (it2.hasNext()) {
            ClassU c1194uM5261o = ((Abstractan) it2.next()).m5261o();
            if (c1194uM5261o == null || !m5336a(c1194uM5261o.m4894g(), bitSet)) {
                return false;
            }
        }
        return true;
    }

    private void m5338b() {
        HashSet hashSet = new HashSet();
        BitSet bitSetM5298k = this.f3407a.m5298k();
        ArrayList arrayListM5297j = this.f3407a.m5297j();
        int i = 0;
        while (true) {
            int iNextClearBit = bitSetM5298k.nextClearBit(i);
            if (iNextClearBit >= arrayListM5297j.size()) {
                this.f3407a.m5281a(hashSet);
                return;
            }
            aj c1264aj = (aj) arrayListM5297j.get(iNextClearBit);
            int i2 = iNextClearBit + 1;
            for (int i3 = 0; i3 < c1264aj.m5222c().size(); i3++) {
                Abstractan abstractC1268an = (Abstractan) c1264aj.m5222c().get(i3);
                ClassX c1197xMo5171b = abstractC1268an.mo5171b();
                int iD_ = c1197xMo5171b.m5476d_();
                if (iD_ != 0) {
                    hashSet.add(abstractC1268an);
                }
                for (int i4 = 0; i4 < iD_; i4++) {
                    this.f3410d[c1197xMo5171b.m4916b(i4).m4894g()].remove(abstractC1268an);
                }
                ClassU c1194uM5261o = abstractC1268an.m5261o();
                if (c1194uM5261o != null) {
                    for (Abstractan abstractC1268an2 : this.f3410d[c1194uM5261o.m4894g()]) {
                        if (abstractC1268an2 instanceof ac) {
                            ((ac) abstractC1268an2).m5165a(c1194uM5261o);
                        }
                    }
                }
            }
            i = i2;
        }
    }

    public static boolean m5339b(Abstractan abstractC1268an) {
        if (abstractC1268an == null) {
            return true;
        }
        return abstractC1268an.mo5178m();
    }
}
