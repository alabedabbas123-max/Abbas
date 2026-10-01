package abcd;

public class TH {
    private static final java.lang.Iterable<abcd.TH> DW = null;
    private static int[] FH;
    private static final java.util.Map<java.lang.ref.WeakReference<abcd.TH>, java.lang.Boolean> j6 = null;
    private boolean BT;
    private java.util.zip.Deflater EQ;
    private final lK<abcd.MH>[] Hw;
    private final abcd.LH J0;
    private final abcd.NH J8;
    private byte[] Mr;
    private int P8;
    private final abcd.TH.a QX;
    private boolean U2;
    private java.util.List<abcd.BH> VH;
    private final abcd.TH.c Ws;
    private final java.lang.ref.WeakReference<abcd.TH> XL;
    private java.util.List<abcd.MH> Zo;
    private boolean a8;
    private abcd.TH.c.a aM;
    private java.util.Collection<? extends abcd.yE> ei;
    private boolean er;
    private boolean gW;
    private java.util.Set<abcd.yE> gn;
    private java.util.List<abcd.MH> j3;
    private boolean lg;
    private boolean rN;
    private abcd.AbstractbH tp;
    private abcd.AbstractbH[] u7;
    private final AE<abcd.MH> v5;
    private boolean vy;
    private final abcd.IE we;
    private boolean yS;

    private class a {
        private volatile abcd.TH.b DW;
        final abcd.TH FH;
        private final long j6;

        a(abcd.TH r5) {
            int r0 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        this.FH = r5;
                        this.DW = abcd.TH.b.j6;
                        if (abcd.TH.j6(r5).we() == false) { $pc0 = 8; continue $sw0; }
                        r0 = abcd.TH.j6(r5).tp();
                        if (r0 > 0) { $pc0 = 7; continue $sw0; }
                        r0 = java.lang.Runtime.getRuntime().availableProcessors();
                        $pc0 = 7; continue $sw0;
                    }
                    case 7: {
                        this.j6 = (((long) r0) * abcd.TH.j6(r5).v5()) + ((long) abcd.TH.j6(r5).j6());
                        return;
                    }
                    case 8: {
                        this.j6 = 0;
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static void j6(abcd.TH.a r0, abcd.TH.b r1) {
            r0.DW = r1;
        }
    }

    public static final class b extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.TH.b DW = null;
        public static final abcd.TH.b FH = null;
        public static final abcd.TH.b Hw = null;
        private static final abcd.TH.b[] Zo = null;
        public static final abcd.TH.b j6 = null;
        public static final abcd.TH.b v5 = null;

        static {
            j6 = new abcd.TH.b("COUNTING", 0);
            DW = new abcd.TH.b("GETTING_SIZES", 1);
            FH = new abcd.TH.b("FINDING_SOURCES", 2);
            Hw = new abcd.TH.b("COMPRESSING", 3);
            v5 = new abcd.TH.b("WRITING", 4);
            Zo = new abcd.TH.b[]{j6, DW, FH, Hw, v5};
        }

        private b(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.TH.b valueOf(java.lang.String r1) {
            return (abcd.TH.b) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.TH.b.values(), r1);
        }

        public static abcd.TH.b[] values() {
            abcd.TH.b[] r0 = Zo;
            int r1 = r0.length;
            abcd.TH.b[] r2 = new abcd.TH.b[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public static class c {
        java.util.Set<abcd.yE> DW;
        long EQ;
        java.util.Collection<abcd.BH> FH;
        int Hw;
        long J0;
        long J8;
        long QX;
        long VH;
        long Ws;
        long XL;
        int Zo;
        abcd.TH.c.a[] aM;
        long gn;
        java.util.Set<abcd.yE> j6;
        long tp;
        long u7;
        int v5;
        long we;

        public static class a {
            long DW;
            long FH;
            long Hw;
            long Zo;
            long j6;
            long v5;

            public a() {
            }
        }

        public c() {
            this.aM = new abcd.TH.c.a[5];
            this.aM[1] = new abcd.TH.c.a();
            this.aM[2] = new abcd.TH.c.a();
            this.aM[3] = new abcd.TH.c.a();
            this.aM[4] = new abcd.TH.c.a();
        }

        public long DW() {
            return this.XL;
        }

        public java.lang.String j6() {
            return java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().packWriterStatistics, new java.lang.Object[]{java.lang.Long.valueOf(this.VH), java.lang.Long.valueOf(this.gn), java.lang.Long.valueOf(this.u7), java.lang.Long.valueOf(this.tp)});
        }
    }

    static {
        j6 = new java.util.concurrent.ConcurrentHashMap();
        DW = new abcd.QH();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TH(abcd.NH r6, abcd.IE r7) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.Hw = new abcd.lK[5];
                    this.Hw[1] = new abcd.lK();
                    this.Hw[2] = new abcd.lK();
                    this.Hw[3] = new abcd.lK();
                    this.Hw[4] = new abcd.lK();
                    this.v5 = new abcd.AE();
                    this.Zo = new abcd.lK();
                    this.VH = new java.util.ArrayList(2);
                    this.gn = java.util.Collections.emptySet();
                    this.gW = true;
                    this.J8 = r6;
                    this.we = r7;
                    if ((r7 instanceof abcd.LH) == false) { $pc1 = 5; continue $sw1; }
                    this.J0 = (abcd.LH) r7;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    this.U2 = r6.EQ();
                    this.a8 = r6.J0();
                    this.rN = true;
                    this.Ws = new abcd.TH.c();
                    this.QX = new abcd.TH.a(this);
                    this.XL = new java.lang.ref.WeakReference(this);
                    j6.put(this.XL, java.lang.Boolean.TRUE);
                    return;
                }
                case 5: {
                    this.J0 = null;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.util.Map DW() {
        return j6;
    }

    private void DW(abcd.LE r19) {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
            	at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
            	at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
            	at java.util.Objects.checkIndex(Objects.java:371)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:354)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3$jadx-core-codegen-ClassGen(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen$$ExternalSyntheticLambda2.accept(D8$$SyntheticClass:0)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.util.stream.SortedOps$RefSortingSink$$ExternalSyntheticLambda0.accept(D8$$SyntheticClass:0)
            	at java.util.ArrayList.forEach(ArrayList.java:1621)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:263)
            	at java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:301)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:575)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:564)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:135)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:267)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:657)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
            	at jadx.core.codegen.CodeGen$$ExternalSyntheticLambda1.call(D8$$SyntheticClass:0)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            */
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.TH.DW(abcd.LE):void");
    }

    private void DW(abcd.LE r24, abcd._F r25, java.util.Set<? extends abcd.yE> r26, java.util.Set<? extends abcd.yE> r27) {
        long r10 = 0L;
        java.util.Set<? extends abcd.yE> r2 = null;
        abcd.TH.c r0 = null;
        abcd.TH.c r1 = null;
        java.util.ArrayList r3 = null;
        java.util.HashMap r14 = null;
        abcd.fG r15 = null;
        abcd.fG r6 = null;
        abcd.fG r5 = null;
        abcd.hG r4 = null;
        int r16 = 0;
        java.util.List<abcd.AbstractiG> r12 = null;
        java.util.List<abcd.AbstractiG> r13 = null;
        java.util.ArrayList r7 = null;
        abcd.MF r17 = null;
        abcd.AbstractiG r8 = null;
        abcd.hG r21 = null;
        abcd.fG r22 = null;
        long r18 = 0L;
        java.util.List<abcd.AbstractiG> r28 = null;
        abcd.fG r19 = null;
        java.util.List<abcd.AbstractiG> r11 = null;
        java.util.ArrayList r9 = null;
        java.util.Iterator r20 = null;
        abcd.MF r23 = null;
        abcd.TF.b r29 = null;
        java.util.Iterator<abcd.AbstractiG> r30 = null;
        java.util.Collection<? extends abcd.yE> r31 = null;
        java.util.Iterator<? extends abcd.yE> r32 = null;
        java.util.Iterator<abcd.AbstractiG> r33 = null;
        java.util.List<abcd.AbstractiG> r210 = null;
        int r34 = 0;
        java.util.HashSet r35 = null;
        abcd.lK r36 = null;
        abcd.dG r37 = null;
        long r110 = 0L;
        abcd.fG r111 = null;
        abcd.BH r112 = null;
        abcd.hG r38 = null;
        java.util.List<abcd.AbstractiG> r39 = null;
        java.util.Iterator r40 = null;
        abcd.zH r41 = null;
        abcd.AbstractiG r42 = null;
        int r43 = 0;
        byte[] r44 = null;
        int r45 = 0;
        java.util.Iterator<abcd.BH> r46 = null;
        abcd.TH.c r47 = null;
        abcd.AbstractiG r48 = null;
        java.util.Iterator r113 = null;
        int r49 = 0;
        boolean r114 = false;
        abcd.dG r50 = null;
        int r51 = 0;
        abcd.AbstractiG r52 = null;
        java.util.Iterator<abcd.yE> r53 = null;
        abcd.AbstractiG r54 = null;
        java.util.Iterator<abcd.AbstractiG> r55 = null;
        java.util.List<abcd.AbstractiG> r211 = null;
        java.util.HashSet r115 = null;
        java.util.LinkedList r56 = null;
        java.util.Iterator<abcd.BH> r116 = null;
        java.util.Iterator<abcd.BH> r117 = null;
        abcd.BH r118 = null;
        java.util.Iterator<abcd.yE> r57 = null;
        java.util.Iterator<abcd.yE> r212 = null;
        abcd.yE r58 = null;
        java.util.Iterator r59 = null;
        abcd.TH.c r60 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r10 = java.lang.System.currentTimeMillis();
                    j6(abcd.TH.b.j6, r24, 0);
                    if (r27 != null) { $pc2 = 5; continue $sw2; }
                    r2 = java.util.Collections.emptySet();
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r0 = this.Ws;
                    r0.j6 = java.util.Collections.unmodifiableSet(new java.util.HashSet(r26));
                    r1 = this.Ws;
                    r1.DW = java.util.Collections.unmodifiableSet(new java.util.HashSet(r2));
                    r3 = new java.util.ArrayList(r26.size() + r2.size());
                    r3.addAll(r26);
                    r3.addAll(r2);
                    r14 = new java.util.HashMap();
                    r15 = r25.j6("inCachedPack");
                    r6 = r25.j6("include");
                    r5 = r25.j6("added");
                    r4 = new abcd.hG();
                    r4.j6(r15);
                    r25.j6(false);
                    r25.j6(r6);
                    r16 = r2.size();
                    if (r2.isEmpty() == false) { $pc2 = 34; continue $sw2; }
                    r25.DW(abcd.EnumkG.DW);
                    if (this.yS == true) { $pc2 = 11; continue $sw2; }
                    $pc2 = 37; continue $sw2;
                }
                case 37: {
                    r12 = new java.util.ArrayList(r26.size());
                    r13 = new java.util.ArrayList(r16);
                    r7 = new java.util.ArrayList(r26.size());
                    r17 = r25.j6(r3, true);
                    $pc2 = 202; continue $sw2;
                }
                case 202: {
                    try {
                        r8 = r17.next();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof abcd.fD) { $pc2 = 191; continue $sw2; }
                        $pc2 = 189; continue $sw2;
                    }
                    if (r8 == null) { $pc2 = 40; continue $sw2; }
                    r21 = r4;
                    r22 = r5;
                    r18 = r10;
                    r28 = r12;
                    r19 = r6;
                    if (r14.containsKey(r8) == false) { $pc2 = 170; continue $sw2; }
                    try {
                        r8.j6(r15);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof abcd.fD) { $pc2 = 186; continue $sw2; }
                        $pc2 = 189; continue $sw2;
                    }
                    $pc2 = 170; continue $sw2;
                }
                case 170: {
                    if (r2.contains(r8) == false) { $pc2 = 211; continue $sw2; }
                    try {
                        r13.add(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof abcd.fD) { $pc2 = 186; continue $sw2; }
                        $pc2 = 189; continue $sw2;
                    }
                    $pc2 = 211; continue $sw2;
                }
                case 211: {
                    $pc2 = 184; continue $sw2;
                }
                case 184: {
                    e = e;
                    $pc2 = 188; continue $sw2;
                }
                case 188: {
                    r11 = r28;
                    $pc2 = 194; continue $sw2;
                }
                case 194: {
                    if (this.gW == false) { $pc2 = 198; continue $sw2; }
                    if (r2.contains(e.j6()) == false) { $pc2 = 198; continue $sw2; }
                    $pc2 = 197; continue $sw2;
                }
                case 197: {
                    r6 = r19;
                    r4 = r21;
                    r5 = r22;
                    r12 = r11;
                    r10 = r18;
                    $pc2 = 198; continue $sw2;
                }
                case 198: {
                    try {
                        throw e;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 189; continue $sw2;
                    }
                }
                case 174: {
                    if (r26.contains(r8) == true) { $pc2 = 175; continue $sw2; }
                    r6 = r19;
                    r10 = r18;
                    r4 = r21;
                    r5 = r22;
                    r12 = r28;
                    { $pc2 = 202; continue $sw2; }
                }
                case 175: {
                    try {
                        r8.j6(r19);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof abcd.fD) { $pc2 = 184; continue $sw2; }
                        $pc2 = 189; continue $sw2;
                    }
                    r11 = r28;
                    try {
                        r11.add(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof abcd.fD) { $pc2 = 181; continue $sw2; }
                        $pc2 = 189; continue $sw2;
                    }
                    if ((r8 instanceof abcd.lG) == false) { $pc2 = 197; continue $sw2; }
                    try {
                        r7.add((abcd.lG) r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof abcd.fD) { $pc2 = 181; continue $sw2; }
                        $pc2 = 189; continue $sw2;
                    }
                    $pc2 = 181; continue $sw2;
                }
                case 181: {
                    e = e;
                    $pc2 = 186; continue $sw2;
                }
                case 186: {
                    e = e;
                    { $pc2 = 188; continue $sw2; }
                }
                case 40: {
                    r17.j6();
                    if (r7.isEmpty() == true) { $pc2 = 54; continue $sw2; }
                    r9 = new java.util.ArrayList(r7.size());
                    r20 = r7.iterator();
                    $pc2 = 44; continue $sw2;
                }
                case 44: {
                    if (r20.hasNext() == false) { $pc2 = 45; continue $sw2; }
                    r9.add(((abcd.lG) r20.next()).j3());
                    { $pc2 = 44; continue $sw2; }
                }
                case 45: {
                    r23 = r25.j6(r9, true);
                    $pc2 = 204; continue $sw2;
                }
                case 204: {
                    if (r23.next() != null) { $pc2 = 204; continue $sw2; }
                    r23.j6();
                    $pc2 = 49; continue $sw2;
                }
                case 49: {
                    th = $ex2;
                    r23.j6();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 54: {
                    if ((r25 instanceof abcd.TF.b) == false) { $pc2 = 66; continue $sw2; }
                    r29 = (abcd.TF.b) r25;
                    r30 = r12.iterator();
                    $pc2 = 57; continue $sw2;
                }
                case 57: {
                    if (r30.hasNext() == false) { $pc2 = 58; continue $sw2; }
                    r29.Zo(r30.next());
                    { $pc2 = 57; continue $sw2; }
                }
                case 58: {
                    r31 = this.ei;
                    if (r31 == null) { $pc2 = 69; continue $sw2; }
                    r32 = r31.iterator();
                    $pc2 = 62; continue $sw2;
                }
                case 62: {
                    if (r32.hasNext() == false) { $pc2 = 69; continue $sw2; }
                    r29.VH(r25.Zo(r32.next()));
                    $pc2 = 69; continue $sw2;
                }
                case 69: {
                    r33 = r13.iterator();
                    $pc2 = 71; continue $sw2;
                }
                case 71: {
                    if (r33.hasNext() == false) { $pc2 = 72; continue $sw2; }
                    r210 = r12;
                    r25.v5(r33.next());
                    r6 = r6;
                    r4 = r4;
                    r5 = r5;
                    r12 = r210;
                    { $pc2 = 71; continue $sw2; }
                }
                case 72: {
                    r34 = this.J8.Zo();
                    r35 = new java.util.HashSet();
                    r36 = new abcd.lK();
                    $pc2 = 73; continue $sw2;
                }
                case 73: {
                    r37 = r25.tp();
                    if (r37 == null) { $pc2 = 76; continue $sw2; }
                    if (FH(r37) == false) { $pc2 = 150; continue $sw2; }
                    r4 = r4;
                    r5 = r5;
                    r110 = r10;
                    r12 = r12;
                    r35 = r35;
                    r111 = r6;
                    $pc2 = 162; continue $sw2;
                }
                case 162: {
                    r35 = r35;
                    r6 = r111;
                    r10 = r110;
                    r4 = r4;
                    r5 = r5;
                    r12 = r12;
                    { $pc2 = 73; continue $sw2; }
                }
                case 150: {
                    if (r37.DW(r15) == false) { $pc2 = 155; continue $sw2; }
                    r110 = r10;
                    r112 = (abcd.BH) r14.get(r37);
                    if (j6(r112, r6, r25) == false) { $pc2 = 156; continue $sw2; }
                    r35 = r35;
                    r38 = r4;
                    r4 = r4;
                    r39 = r12;
                    r5 = r5;
                    r12 = r12;
                    r111 = r6;
                    j6(r25, r38, r39, r13, r112);
                    r36 = new abcd.lK();
                    j6(r24);
                    j6(abcd.TH.b.j6, r24, 0);
                    $pc2 = 156; continue $sw2;
                }
                case 156: {
                    r111 = r6;
                    if (r37.DW(abcd.fG.j6) == true) { $pc2 = 159; continue $sw2; }
                    r36.add(r37);
                    r24.update(1);
                    { $pc2 = 162; continue $sw2; }
                }
                case 159: {
                    if (r35.size() > r34) { $pc2 = 162; continue $sw2; }
                    r35.add(r37.yS());
                    { $pc2 = 162; continue $sw2; }
                }
                case 155: {
                    r110 = r10;
                    { $pc2 = 156; continue $sw2; }
                }
                case 76: {
                    if (this.vy == false) { $pc2 = 82; continue $sw2; }
                    r40 = r36.iterator();
                    $pc2 = 79; continue $sw2;
                }
                case 79: {
                    if (r40.hasNext() == false) { $pc2 = 86; continue $sw2; }
                    j6((abcd.dG) r40.next(), 0);
                    $pc2 = 86; continue $sw2;
                }
                case 86: {
                    if (this.er == false) { $pc2 = 100; continue $sw2; }
                    if (r35.isEmpty() == true) { $pc2 = 100; continue $sw2; }
                    r41 = new abcd.zH(r24, r35, this.v5, this.Zo, this.we);
                    $pc2 = 90; continue $sw2;
                }
                case 90: {
                    r42 = r25.yS();
                    if (r42 == null) { $pc2 = 102; continue $sw2; }
                    if (r42.DW(abcd.fG.j6) == true) { $pc2 = 90; continue $sw2; }
                    if (FH(r42) == true) { $pc2 = 90; continue $sw2; }
                    r43 = r25.QX();
                    r44 = r25.Ws();
                    r45 = r25.XL();
                    r41.j6(r42.aM(), r44, r45, r43);
                    j6(r42, r43);
                    r24.update(1);
                    $pc2 = 102; continue $sw2;
                }
                case 102: {
                    r46 = this.VH.iterator();
                    $pc2 = 104; continue $sw2;
                }
                case 104: {
                    if (r46.hasNext() == false) { $pc2 = 105; continue $sw2; }
                    r24.update((int) r46.next().DW());
                    { $pc2 = 104; continue $sw2; }
                }
                case 105: {
                    j6(r24);
                    r47 = this.Ws;
                    r47.J0 = java.lang.System.currentTimeMillis() - r10;
                    return;
                }
                case 100: {
                    r48 = r25.yS();
                    if (r48 == null) { $pc2 = 102; continue $sw2; }
                    if (r48.DW(abcd.fG.j6) == true) { $pc2 = 100; continue $sw2; }
                    if (FH(r48) == true) { $pc2 = 100; continue $sw2; }
                    j6(r48, r25.QX());
                    r24.update(1);
                    { $pc2 = 100; continue $sw2; }
                }
                case 82: {
                    r113 = r36.iterator();
                    r49 = 0;
                    r114 = false;
                    $pc2 = 84; continue $sw2;
                }
                case 84: {
                    if (r113.hasNext() == false) { $pc2 = 86; continue $sw2; }
                    r50 = (abcd.dG) r113.next();
                    if (r50.DW(r5) == true) { $pc2 = 118; continue $sw2; }
                    r50.j6(r5);
                    j6(r50, 0);
                    r49 = r49 + 1;
                    $pc2 = 118; continue $sw2;
                }
                case 118: {
                    r49 = r49;
                    r51 = 0;
                    $pc2 = 120; continue $sw2;
                }
                case 120: {
                    if (r51 >= r50.lg()) { $pc2 = 121; continue $sw2; }
                    r52 = r50.DW(r51);
                    if (r52.DW(r5) == true) { $pc2 = 144; continue $sw2; }
                    if (r52.DW(abcd.fG.j6) == true) { $pc2 = 144; continue $sw2; }
                    r52.j6(r5);
                    j6(r52, 0);
                    r49 = r49 + 1;
                    $pc2 = 144; continue $sw2;
                }
                case 144: {
                    r51 = r51 + 1;
                    { $pc2 = 120; continue $sw2; }
                }
                case 121: {
                    if (r114 == true) { $pc2 = 84; continue $sw2; }
                    if (4096 >= r49) { $pc2 = 84; continue $sw2; }
                    r53 = this.gn.iterator();
                    $pc2 = 126; continue $sw2;
                }
                case 126: {
                    if (r53.hasNext() == false) { $pc2 = 127; continue $sw2; }
                    r54 = r25.Hw(r53.next());
                    if ((r54 instanceof abcd.dG) == false) { $pc2 = 126; continue $sw2; }
                    if (r54.DW(r6) == false) { $pc2 = 126; continue $sw2; }
                    if (r54.DW(abcd.fG.j6) == true) { $pc2 = 126; continue $sw2; }
                    if (r54.DW(r5) == true) { $pc2 = 126; continue $sw2; }
                    r54.j6(r5);
                    j6(r54, 0);
                    { $pc2 = 126; continue $sw2; }
                }
                case 127: {
                    r114 = true;
                    { $pc2 = 84; continue $sw2; }
                }
                case 66: {
                    r55 = r12.iterator();
                    $pc2 = 68; continue $sw2;
                }
                case 68: {
                    if (r55.hasNext() == false) { $pc2 = 69; continue $sw2; }
                    r211 = r12;
                    r25.Hw(r55.next());
                    r6 = r6;
                    r4 = r4;
                    r5 = r5;
                    r12 = r211;
                    $pc2 = 191; continue $sw2;
                }
                case 191: {
                    e = e;
                    r21 = r4;
                    r22 = r5;
                    r18 = r10;
                    r11 = r12;
                    r19 = r6;
                    $pc2 = 189; continue $sw2;
                }
                case 189: {
                    th = $ex2;
                    r17.j6();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 11: {
                    if (this.J0 == null) { $pc2 = 37; continue $sw2; }
                    r115 = new java.util.HashSet(r26);
                    r56 = new java.util.LinkedList();
                    r116 = this.J0.j6().iterator();
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    if (r116.hasNext() == false) { $pc2 = 16; continue $sw2; }
                    r117 = r116;
                    r118 = r116.next();
                    if (r115.containsAll(r118.FH()) == false) { $pc2 = 29; continue $sw2; }
                    r115.removeAll(r118.FH());
                    r56.add(r118);
                    $pc2 = 29; continue $sw2;
                }
                case 29: {
                    r57 = r118.FH().iterator();
                    $pc2 = 31; continue $sw2;
                }
                case 31: {
                    if (r57.hasNext() == false) { $pc2 = 32; continue $sw2; }
                    r212 = r57;
                    r58 = r57.next();
                    r14.put(r58, r118);
                    r3.add(r58);
                    r57 = r212;
                    { $pc2 = 31; continue $sw2; }
                }
                case 32: {
                    r116 = r117;
                    { $pc2 = 14; continue $sw2; }
                }
                case 16: {
                    if (r115.isEmpty() == true) { $pc2 = 18; continue $sw2; }
                    $pc2 = 25; continue $sw2;
                }
                case 25: {
                    r16 = r16 + r14.size();
                    { $pc2 = 37; continue $sw2; }
                }
                case 18: {
                    if (r56.isEmpty() == true) { $pc2 = 25; continue $sw2; }
                    this.VH.addAll(r56);
                    r59 = r56.iterator();
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    if (r59.hasNext() == false) { $pc2 = 22; continue $sw2; }
                    r24.update((int) ((abcd.BH) r59.next()).DW());
                    { $pc2 = 21; continue $sw2; }
                }
                case 22: {
                    j6(r24);
                    r60 = this.Ws;
                    r60.J0 = java.lang.System.currentTimeMillis() - r10;
                    return;
                }
                case 34: {
                    r25.DW(abcd.EnumkG.FH);
                    if (this.er == false) { $pc2 = 37; continue $sw2; }
                    r25.j6(abcd.EnumkG.v5, true);
                    { $pc2 = 37; continue $sw2; }
                }
                case 5: {
                    r2 = r27;
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.OH r3) {
        j6(r3, this.Hw[1]);
        j6(r3, this.Hw[4]);
        j6(r3, this.Hw[2]);
        j6(r3, this.Hw[3]);
    }

    private void DW(abcd.OH r2, abcd.MH r3) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r3 != null) { $pc3 = 4; continue $sw3; }
                    return;
                }
                case 4: {
                    if (r3.nw() == false) { $pc3 = 6; continue $sw3; }
                    return;
                }
                case 6: {
                    if (r3.P8() == true) { $pc3 = 11; continue $sw3; }
                    Hw(r2, r3);
                    return;
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean DW(abcd.MH r3) {
        int r4 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r4 = r3.yS();
                    if (r4 == 1) { $pc4 = 15; continue $sw4; }
                    if (r4 != 2) { $pc4 = 7; continue $sw4; }
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    return true;
                }
                case 7: {
                    if (r4 == 3) { $pc4 = 13; continue $sw4; }
                    if (r4 == 4) { $pc4 = 11; continue $sw4; }
                    return true;
                }
                case 11: {
                    return false;
                }
                case 15: {
                    return this.lg;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] DW(abcd.YD r3) {
        return j6(this.J8, this.we, r3);
    }

    private void FH(abcd.LE r12) {
        long r2 = 0L;
        long r7 = 0L;
        abcd.lK r0 = null;
        abcd.TH.c r13 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r2 = (((((long) this.Hw[1].size()) + 0) + ((long) this.Hw[2].size())) + ((long) this.Hw[3].size())) + ((long) this.Hw[4].size());
                    r7 = java.lang.System.currentTimeMillis();
                    j6(abcd.TH.b.FH, r12, r2);
                    if (r2 > 4096) { $pc5 = 7; continue $sw5; }
                    r0 = new abcd.lK((int) r2);
                    r0.FH(this.Hw[4]);
                    r0.FH(this.Hw[1]);
                    r0.FH(this.Hw[2]);
                    r0.FH(this.Hw[3]);
                    j6(r12, r0);
                    if (this.BT == false) { $pc5 = 8; continue $sw5; }
                    j6(this.Hw[1]);
                    j6(this.Hw[2]);
                    j6(this.Hw[3]);
                    j6(this.Hw[4]);
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    j6(r12);
                    r13 = this.Ws;
                    r13.J8 = java.lang.System.currentTimeMillis() - r7;
                    return;
                }
                case 7: {
                    j6(r12, this.Hw[4]);
                    j6(r12, this.Hw[1]);
                    j6(r12, this.Hw[2]);
                    j6(r12, this.Hw[3]);
                    { $pc5 = 8; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(abcd.OH r6, abcd.MH r7) {
        abcd.CH.a r0 = null;
        byte[] r1 = null;
        abcd.RK.c r2 = null;
        java.util.zip.Deflater r3 = null;
        java.util.zip.DeflaterOutputStream r4 = null;
        abcd.TH.c.a r5 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    DW(r6, r7.a8());
                    r6.Zo();
                    r7.j6(r6.v5());
                    r0 = r7.KD();
                    if (r0 == null) { $pc6 = 8; continue $sw6; }
                    r1 = r0.get();
                    if (r1 == null) { $pc6 = 8; continue $sw6; }
                    r6.j6(r7, r7.U2());
                    r6.write(r1);
                    return;
                }
                case 8: {
                    r2 = j6(r7);
                    r6.j6(r7, r2.DW());
                    r3 = gn();
                    r3.reset();
                    r4 = new java.util.zip.DeflaterOutputStream(r6, r3);
                    r2.j6(r4, null);
                    r4.finish();
                    r5 = this.aM;
                    r5.DW++;
                    r5.Zo += r6.v5() - r7.getOffset();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean FH(abcd.YD r8) {
        abcd.AbstractbH[] r0 = null;
        int r3 = 0;
        int r4 = 0;
        abcd.AbstractbH r5 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (this.u7 != null) { $pc7 = 6; continue $sw7; }
                    return false;
                }
                case 6: {
                    if (this.tp.FH(r8) == false) { $pc7 = 8; continue $sw7; }
                    return true;
                }
                case 8: {
                    r0 = this.u7;
                    r3 = r0.length;
                    r4 = 0;
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    if (r4 >= r3) { $pc7 = 10; continue $sw7; }
                    r5 = r0[r4];
                    if (r5.FH(r8) == true) { $pc7 = 13; continue $sw7; }
                    r4 = r4 + 1;
                    { $pc7 = 9; continue $sw7; }
                }
                case 13: {
                    this.tp = r5;
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw(abcd.OH r8, abcd.MH r9) {
        abcd.YC r10 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r9.sh() == false) { $pc8 = 5; continue $sw8; }
                    this.a8 = false;
                    r9.j3();
                    r9.Mr();
                    this.J0.j6(this, abcd.vE.j6, java.util.Collections.singleton(r9));
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    r9.SI();
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if (r9.ei() == false) { $pc8 = 9; continue $sw8; }
                    DW(r8, r9.a8());
                    if (r9.nw() == true) { $pc8 = 16; continue $sw8; }
                    r8.Zo();
                    r9.j6(r8.v5());
                    try {
                        this.J0.j6(r8, r9, this.rN);
                        r8.j6();
                        r9.DW(r8.DW());
                        this.aM.FH++;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof abcd.tD) { $pc8 = 22; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r9.BT() == false) { $pc8 = 21; continue $sw8; }
                    try {
                        this.aM.Hw++;
                        this.aM.Zo += r8.v5() - r9.getOffset();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof abcd.tD) { $pc8 = 22; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 21: {
                    return;
                }
                case 22: {
                    e = $ex8;
                    if (r9.getOffset() != r8.v5()) { $pc8 = 26; continue $sw8; }
                    r9.j6(0);
                    r9.j3();
                    r9.Mr();
                    this.J0.j6(this, abcd.vE.j6, java.util.Collections.singleton(r9));
                    { $pc8 = 7; continue $sw8; }
                }
                case 26: {
                    r10 = new abcd.YC(r9, "");
                    r10.initCause(e);
                    throw r10;
                }
                case 16: {
                    return;
                }
                case 9: {
                    if (r9.BT() == false) { $pc8 = 11; continue $sw8; }
                    FH(r8, r9);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    r8.j6();
                    r9.DW(r8.DW());
                    return;
                }
                case 11: {
                    v5(r8, r9);
                    { $pc8 = 12; continue $sw8; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.util.zip.Deflater gn() {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (this.EQ != null) { $pc9 = 6; continue $sw9; }
                    this.EQ = new java.util.zip.Deflater(this.J8.DW());
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    return this.EQ;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(abcd.MH[] r3, int r4, int r5) {
        java.util.Iterator r6 = null;
        abcd.MH r0 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r6 = this.Hw[r5].iterator();
                    $pc10 = 4; continue $sw10;
                }
                case 4: {
                    if (r6.hasNext() == false) { $pc10 = 5; continue $sw10; }
                    r0 = (abcd.MH) r6.next();
                    if (r0.vy() == true) { $pc10 = 4; continue $sw10; }
                    if (r0.BT() == true) { $pc10 = 4; continue $sw10; }
                    r0.Zo(0);
                    r3[r4] = r0;
                    r4 = r4 + 1;
                    { $pc10 = 4; continue $sw10; }
                }
                case 5: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.NH j6(abcd.TH r0) {
        return r0.J8;
    }

    private abcd.RK.c j6(abcd.MH r4) {
        abcd.EH r0 = new abcd.EH(DW(r4.lg()));
        byte[] r5 = DW(r4);
        abcd.RK.c r1 = new abcd.RK.c(r5.length);
        r0.j6(r1, r5);
        return r1;
    }

    private void j6(abcd.LE r1) {
        r1.j6();
    }

    private void j6(abcd.LE r2, java.util.List<abcd.MH> r3) {
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    this.BT = false;
                    this.J0.j6(this, r2, r3);
                    if (this.BT == false) { $pc11 = 6; continue $sw11; }
                    j6(r3);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.LE r20, abcd.MH[] r21, int r22) {
        int r2 = 0;
        int r12 = 0;
        int r13 = 0;
        abcd.VH r14 = null;
        abcd.lF r15 = null;
        int r0 = 0;
        int r3 = 0;
        int r9 = 0;
        java.util.ArrayList r8 = null;
        int r1 = 0;
        int r4 = 0;
        int r7 = 0;
        int r17 = 0;
        java.util.ArrayList r16 = null;
        int r5 = 0;
        java.util.concurrent.Executor r6 = null;
        java.util.List<java.lang.Throwable> r10 = null;
        java.lang.Throwable r11 = null;
        java.io.IOException r18 = null;
        java.util.concurrent.ExecutorService r19 = null;
        java.util.Iterator<abcd.HH> r23 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r2 = this.J8.tp();
                    if (r2 != 0) { $pc12 = 5; continue $sw12; }
                    r2 = java.lang.Runtime.getRuntime().availableProcessors();
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    r12 = r2;
                    r13 = 0;
                    if (r12 > 1) { $pc12 = 8; continue $sw12; }
                    $pc12 = 70; continue $sw12;
                }
                case 70: {
                    new abcd.IH(this.J8, new abcd.CH(this.J8), this.we).j6(r20, r21, 0, r22);
                    return;
                }
                case 8: {
                    if (r22 <= (this.J8.Zo() * 2)) { $pc12 = 70; continue $sw12; }
                    r14 = new abcd.VH(this.J8);
                    r15 = new abcd.lF(r20);
                    r0 = r12 * 2;
                    r3 = r22 / r0;
                    if (r3 >= (this.J8.Zo() * 2)) { $pc12 = 13; continue $sw12; }
                    r3 = this.J8.Zo() * 2;
                    $pc12 = 13; continue $sw12;
                }
                case 13: {
                    r9 = r3;
                    r8 = new java.util.ArrayList(r0);
                    r1 = 0;
                    $pc12 = 14; continue $sw12;
                }
                case 14: {
                    if (r1 >= r22) { $pc12 = 15; continue $sw12; }
                    r4 = r22 - r1;
                    if (r4 >= r9) { $pc12 = 62; continue $sw12; }
                    $pc12 = 61; continue $sw12;
                }
                case 61: {
                    r7 = r4;
                    r17 = r12;
                    r16 = r8;
                    r16.add(new abcd.HH(this.J8, this.we, r14, r15, r7, r1, r21));
                    r8 = r16;
                    r1 = r1 + r7;
                    r12 = r17;
                    r9 = r9;
                    r13 = 0;
                    { $pc12 = 14; continue $sw12; }
                }
                case 62: {
                    r5 = r1 + r9;
                    $pc12 = 63; continue $sw12;
                }
                case 63: {
                    if (r5 >= r22) { $pc12 = 68; continue $sw12; }
                    if (r21[r5 - 1].er() != r21[r5].er()) { $pc12 = 68; continue $sw12; }
                    r5 = r5 + 1;
                    $pc12 = 68; continue $sw12;
                }
                case 68: {
                    r4 = r5 - r1;
                    { $pc12 = 61; continue $sw12; }
                }
                case 15: {
                    r15.j6(r8.size());
                    r6 = this.J8.VH();
                    r10 = java.util.Collections.synchronizedList(new java.util.ArrayList());
                    if ((r6 instanceof java.util.concurrent.ExecutorService) == false) { $pc12 = 18; continue $sw12; }
                    j6((java.util.concurrent.ExecutorService) r6, r15, r8, r10);
                    $pc12 = 40; continue $sw12;
                }
                case 40: {
                    if (r10.isEmpty() == true) { $pc12 = 55; continue $sw12; }
                    r11 = r10.get(r13);
                    if ((r11 instanceof java.lang.Error) == true) { $pc12 = 54; continue $sw12; }
                    if ((r11 instanceof java.lang.RuntimeException) == true) { $pc12 = 52; continue $sw12; }
                    if ((r11 instanceof java.io.IOException) == true) { $pc12 = 48; continue $sw12; }
                    r18 = new java.io.IOException(r11.getMessage());
                    r18.initCause(r11);
                    throw r18;
                }
                case 48: {
                    throw ((java.io.IOException) r11);
                }
                case 52: {
                    throw ((java.lang.RuntimeException) r11);
                }
                case 54: {
                    throw ((java.lang.Error) r11);
                }
                case 55: {
                    return;
                }
                case 18: {
                    if (r6 != null) { $pc12 = 35; continue $sw12; }
                    r19 = java.util.concurrent.Executors.newFixedThreadPool(r12);
                    try {
                        j6(r19, r15, r8, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 27; continue $sw12;
                    }
                    r19.shutdown();
                    $pc12 = 78; continue $sw12;
                }
                case 78: {
                    if (r19.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS) == false) { $pc12 = 78; continue $sw12; }
                    $pc12 = 26; continue $sw12;
                }
                case 26: {
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packingCancelledDuringObjectsWriting);
                }
                case 27: {
                    th = $ex12;
                    r19.shutdown();
                    $pc12 = 72; continue $sw12;
                }
                case 72: {
                    if (r19.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS) == false) { $pc12 = 72; continue $sw12; }
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 34: {
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packingCancelledDuringObjectsWriting);
                }
                case 35: {
                    r23 = r8.iterator();
                    $pc12 = 37; continue $sw12;
                }
                case 37: {
                    if (r23.hasNext() == false) { $pc12 = 76; continue $sw12; }
                    r6.execute(new abcd.SH(this, r23.next(), r10));
                    { $pc12 = 37; continue $sw12; }
                }
                case 76: {
                    try {
                        r15.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc12 = 56; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc12 = 57; continue $sw12;
                }
                case 57: {
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packingCancelledDuringObjectsWriting);
                }
                case 56: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.OH r2) {
        this.Mr = r2.Hw();
        r2.write(this.Mr);
    }

    private void j6(abcd.OH r8, java.util.List<abcd.MH> r9) {
        long r0 = 0L;
        abcd.LH r2 = null;
        java.util.Iterator<abcd.MH> r3 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (r9.isEmpty() == false) { $pc13 = 5; continue $sw13; }
                    return;
                }
                case 5: {
                    this.aM = this.Ws.aM[r9.get(0).yS()];
                    r0 = r8.v5();
                    r2 = this.J0;
                    if (r2 == null) { $pc13 = 8; continue $sw13; }
                    r2.j6(r8, r9);
                    $pc13 = 11; continue $sw13;
                }
                case 11: {
                    this.aM.v5 += r8.v5() - r0;
                    this.aM.j6 = r9.size();
                    return;
                }
                case 8: {
                    r3 = r9.iterator();
                    $pc13 = 10; continue $sw13;
                }
                case 10: {
                    if (r3.hasNext() == false) { $pc13 = 11; continue $sw13; }
                    r8.j6(r3.next());
                    { $pc13 = 10; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.TH.b r4, abcd.LE r5, long r6) {
        int r0 = 0;
        java.lang.String r7 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    abcd.TH.a.j6(this.QX, r4);
                    r0 = j6()[r4.ordinal()];
                    if (r0 != 1) { $pc14 = 5; continue $sw14; }
                    r7 = org.eclipse.jgit.JGitText.j6().countingObjects;
                    $pc14 = 19; continue $sw14;
                }
                case 19: {
                    r5.j6(r7, (int) r6);
                    return;
                }
                case 5: {
                    if (r0 != 2) { $pc14 = 7; continue $sw14; }
                    r7 = org.eclipse.jgit.JGitText.j6().searchForSizes;
                    { $pc14 = 19; continue $sw14; }
                }
                case 7: {
                    if (r0 != 3) { $pc14 = 9; continue $sw14; }
                    r7 = org.eclipse.jgit.JGitText.j6().searchForReuse;
                    { $pc14 = 19; continue $sw14; }
                }
                case 9: {
                    if (r0 != 4) { $pc14 = 11; continue $sw14; }
                    r7 = org.eclipse.jgit.JGitText.j6().compressingObjects;
                    { $pc14 = 19; continue $sw14; }
                }
                case 11: {
                    if (r0 != 5) { $pc14 = 14; continue $sw14; }
                    r7 = org.eclipse.jgit.JGitText.j6().writingObjects;
                    { $pc14 = 19; continue $sw14; }
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().illegalPackingPhase, new java.lang.Object[]{r4}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd._F r2, abcd.hG r3, java.util.List<abcd.AbstractiG> r4, java.util.List<abcd.AbstractiG> r5, abcd.BH r6) {
        java.util.Iterator<abcd.yE> r7 = null;
        java.util.Iterator<abcd.AbstractiG> r0 = null;
        java.util.Iterator<abcd.AbstractiG> r8 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    this.VH.add(r6);
                    r7 = r6.FH().iterator();
                    $pc15 = 4; continue $sw15;
                }
                case 4: {
                    if (r7.hasNext() == false) { $pc15 = 5; continue $sw15; }
                    r5.add(r2.Hw(r7.next()));
                    { $pc15 = 4; continue $sw15; }
                }
                case 5: {
                    Hw(true);
                    r2.j6(r3);
                    r2.DW(abcd.EnumkG.FH);
                    r2.j6(abcd.EnumkG.v5, true);
                    r0 = r4.iterator();
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    if (r0.hasNext() == false) { $pc15 = 8; continue $sw15; }
                    r2.Hw(r0.next());
                    { $pc15 = 7; continue $sw15; }
                }
                case 8: {
                    r8 = r5.iterator();
                    $pc15 = 10; continue $sw15;
                }
                case 10: {
                    if (r8.hasNext() == false) { $pc15 = 11; continue $sw15; }
                    r2.v5(r8.next());
                    { $pc15 = 10; continue $sw15; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.AbstractiG r2, int r3) {
        abcd.LH r0 = null;
        abcd.MH r1 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = this.J0;
                    if (r0 == null) { $pc16 = 5; continue $sw16; }
                    r1 = r0.j6(r2);
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    r1.v5(r3);
                    this.Hw[r2.aM()].add(r1);
                    this.v5.j6(r1);
                    return;
                }
                case 5: {
                    r1 = new abcd.MH(r2);
                    { $pc16 = 6; continue $sw16; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(java.util.List<abcd.MH> r5) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        abcd.MH r3 = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r0 = r5.size();
                    r1 = 0;
                    r2 = 0;
                    $pc17 = 3; continue $sw17;
                }
                case 3: {
                    if (r1 >= r0) { $pc17 = 5; continue $sw17; }
                    r3 = r5.get(r1);
                    if (r3.P8() == true) { $pc17 = 14; continue $sw17; }
                    if (r2 == r1) { $pc17 = 13; continue $sw17; }
                    r5.set(r2, r3);
                    $pc17 = 13; continue $sw17;
                }
                case 13: {
                    r2 = r2 + 1;
                    $pc17 = 14; continue $sw17;
                }
                case 14: {
                    r1 = r1 + 1;
                    $pc17 = 5; continue $sw17;
                }
                case 5: {
                    if (r2 >= r5.size()) { $pc17 = 6; continue $sw17; }
                    r5.remove(r5.size() - 1);
                    { $pc17 = 5; continue $sw17; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.util.concurrent.ExecutorService r3, abcd.lF r4, java.util.List<abcd.HH> r5, java.util.List<java.lang.Throwable> r6) {
        java.util.ArrayList r0 = null;
        java.util.Iterator<abcd.HH> r7 = null;
        java.util.Iterator r8 = null;
        java.util.Iterator r9 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r0 = new java.util.ArrayList(r5.size());
                    r7 = r5.iterator();
                    $pc18 = 4; continue $sw18;
                }
                case 4: {
                    if (r7.hasNext() == false) { $pc18 = 22; continue $sw18; }
                    r0.add(r3.submit(r7.next()));
                    { $pc18 = 4; continue $sw18; }
                }
                case 22: {
                    try {
                        r4.FH();
                        r8 = r0.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc18 = 15; continue $sw18; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    if (r8.hasNext() == false) { $pc18 = 8; continue $sw18; }
                    try {
                        ((java.util.concurrent.Future) r8.next()).get();
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        if ($t instanceof java.util.concurrent.ExecutionException) { $pc18 = 12; continue $sw18; }
                        if ($t instanceof java.lang.InterruptedException) { $pc18 = 15; continue $sw18; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc18 = 12; continue $sw18;
                }
                case 12: {
                    e = $ex18;
                    try {
                        r6.add(e.getCause());
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc18 = 15; continue $sw18; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc18 = 6; continue $sw18; }
                }
                case 8: {
                    return;
                }
                case 15: {
                    r9 = r0.iterator();
                    $pc18 = 17; continue $sw18;
                }
                case 17: {
                    if (r9.hasNext() == false) { $pc18 = 20; continue $sw18; }
                    ((java.util.concurrent.Future) r9.next()).cancel(true);
                    { $pc18 = 17; continue $sw18; }
                }
                case 20: {
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packingCancelledDuringObjectsWriting);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(abcd.BH r1, abcd.fG r2, abcd._F r3) {
        java.util.Iterator<abcd.yE> r4 = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r4 = r1.FH().iterator();
                    $pc19 = 4; continue $sw19;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc19 = 5; continue $sw19; }
                    if (r3.Hw(r4.next()).DW(r2) == true) { $pc19 = 4; continue $sw19; }
                    return false;
                }
                case 5: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static byte[] j6(abcd.NH r0, abcd.IE r1, abcd.YD r2) {
        return r1.FH(r2).DW(r0.j6());
    }

    static int[] j6() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    r0 = FH;
                    if (r0 == null) { $pc20 = 5; continue $sw20; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.TH.b.values().length];
                    try {
                        r1[abcd.TH.b.Hw.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc20 = 13; continue $sw20; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc20 = 18; continue $sw20;
                }
                case 18: {
                    try {
                        r1[abcd.TH.b.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc20 = 14; continue $sw20; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc20 = 24; continue $sw20;
                }
                case 24: {
                    try {
                        r1[abcd.TH.b.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc20 = 15; continue $sw20; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc20 = 26; continue $sw20;
                }
                case 26: {
                    try {
                        r1[abcd.TH.b.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc20 = 16; continue $sw20; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc20 = 20; continue $sw20;
                }
                case 20: {
                    try {
                        r1[abcd.TH.b.v5.ordinal()] = 5;
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc20 = 17; continue $sw20; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc20 = 11; continue $sw20;
                }
                case 11: {
                    FH = r1;
                    return r1;
                }
                case 13: {
                    $pc20 = 14; continue $sw20;
                }
                case 14: {
                    $pc20 = 15; continue $sw20;
                }
                case 15: {
                    $pc20 = 16; continue $sw20;
                }
                case 16: {
                    $pc20 = 17; continue $sw20;
                }
                case 17: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.util.List<abcd.MH> u7() {
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    if (this.j3 != null) { $pc21 = 6; continue $sw21; }
                    this.j3 = new abcd.lK((((this.Hw[1].size() + 0) + this.Hw[2].size()) + this.Hw[3].size()) + this.Hw[4].size());
                    this.j3.addAll(this.Hw[1]);
                    this.j3.addAll(this.Hw[2]);
                    this.j3.addAll(this.Hw[3]);
                    this.j3.addAll(this.Hw[4]);
                    java.util.Collections.sort(this.j3);
                    $pc21 = 6; continue $sw21;
                }
                case 6: {
                    return this.j3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void v5(abcd.OH r5, abcd.MH r6) {
        java.util.zip.Deflater r0 = gn();
        abcd.FE r1 = this.we.Hw(r6, r6.yS());
        r5.Zo();
        r6.j6(r5.v5());
        r5.j6(r6, r1.DW());
        r0.reset();
        java.util.zip.DeflaterOutputStream r7 = new java.util.zip.DeflaterOutputStream(r5, r0);
        r1.j6(r7);
        r7.finish();
    }

    public void DW(boolean r1) {
        this.lg = r1;
    }

    public abcd.yE FH() {
        byte[] r1 = null;
        java.security.MessageDigest r2 = null;
        java.util.Iterator<abcd.MH> r3 = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r1 = new byte[20];
                    r2 = abcd.hE.j6();
                    r3 = u7().iterator();
                    $pc22 = 4; continue $sw22;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc22 = 6; continue $sw22; }
                    r3.next().DW(r1, 0);
                    r2.update(r1, 0, 20);
                    { $pc22 = 4; continue $sw22; }
                }
                case 6: {
                    return abcd.yE.j6(r2.digest());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(boolean r1) {
        this.rN = r1;
    }

    public long Hw() {
        long r0 = 0L;
        long r1 = 0L;
        java.util.Iterator<abcd.BH> r2 = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    r0 = this.Ws.VH;
                    if (r0 != 0) { $pc23 = 9; continue $sw23; }
                    r1 = (((((long) this.Hw[1].size()) + 0) + ((long) this.Hw[2].size())) + ((long) this.Hw[3].size())) + ((long) this.Hw[4].size());
                    r2 = this.VH.iterator();
                    $pc23 = 6; continue $sw23;
                }
                case 6: {
                    if (r2.hasNext() == false) { $pc23 = 7; continue $sw23; }
                    r1 = r1 + r2.next().DW();
                    { $pc23 = 6; continue $sw23; }
                }
                case 7: {
                    return r1;
                }
                case 9: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw(boolean r1) {
        this.er = r1;
    }

    public void VH() {
        java.util.zip.Deflater r0 = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    this.we.FH();
                    r0 = this.EQ;
                    if (r0 == null) { $pc24 = 5; continue $sw24; }
                    r0.end();
                    this.EQ = null;
                    $pc24 = 5; continue $sw24;
                }
                case 5: {
                    j6.remove(this.XL);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Zo() {
        return this.U2;
    }

    public void j6(int r2, java.util.Collection<? extends abcd.yE> r3) {
        this.vy = true;
        this.P8 = r2;
        this.ei = r3;
    }

    public void j6(abcd.LE r13, abcd.LE r14, java.io.OutputStream r15) {
        int r1 = 0;
        boolean r0 = false;
        long r2 = 0L;
        abcd.OH r16 = null;
        long r3 = 0L;
        long r4 = 0L;
        abcd.TH.c.a[] r17 = null;
        int r5 = 0;
        int r6 = 0;
        abcd.TH.c.a r7 = null;
        java.util.Iterator<abcd.BH> r8 = null;
        abcd.BH r18 = null;
        long r9 = 0L;
        abcd.TH.c r10 = null;
        abcd.TH.c r19 = null;
        abcd.TH.c.a[] r110 = null;
        int r11 = 0;
        abcd.TH.c.a r111 = null;
        long r12 = 0L;
        long r20 = 0L;
        abcd.TH.c r21 = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    if (r13 != null) { $pc25 = 4; continue $sw25; }
                    r13 = abcd.vE.j6;
                    $pc25 = 4; continue $sw25;
                }
                case 4: {
                    if (r14 != null) { $pc25 = 6; continue $sw25; }
                    r14 = abcd.vE.j6;
                    $pc25 = 6; continue $sw25;
                }
                case 6: {
                    this.u7 = null;
                    this.tp = null;
                    r1 = 0;
                    if (this.J0 != null) { $pc25 = 9; continue $sw25; }
                    $pc25 = 15; continue $sw25;
                }
                case 15: {
                    r0 = false;
                    $pc25 = 17; continue $sw25;
                }
                case 17: {
                    if ((r13 instanceof abcd.AbstracteE) == false) { $pc25 = 24; continue $sw25; }
                    r2 = 1000;
                    if (r0 == true) { $pc25 = 21; continue $sw25; }
                    $pc25 = 23; continue $sw25;
                }
                case 23: {
                    ((abcd.AbstracteE) r13).j6(r2, java.util.concurrent.TimeUnit.MILLISECONDS);
                    { $pc25 = 24; continue $sw25; }
                }
                case 21: {
                    if (this.J8.we() == false) { $pc25 = 23; continue $sw25; }
                    r2 = 500;
                    $pc25 = 24; continue $sw25;
                }
                case 24: {
                    if (r0 == false) { $pc25 = 27; continue $sw25; }
                    FH(r13);
                    $pc25 = 27; continue $sw25;
                }
                case 27: {
                    if (this.J8.we() == false) { $pc25 = 29; continue $sw25; }
                    DW(r13);
                    $pc25 = 29; continue $sw25;
                }
                case 29: {
                    r16 = new abcd.OH(r14, r15, this);
                    r3 = Hw();
                    this.Ws.VH = r3;
                    j6(abcd.TH.b.v5, r14, r3);
                    r4 = java.lang.System.currentTimeMillis();
                    r16.j6(2, r3);
                    r16.flush();
                    DW(r16);
                    if (this.Zo.isEmpty() == true) { $pc25 = 32; continue $sw25; }
                    $pc25 = 33; continue $sw25;
                }
                case 33: {
                    r17 = this.Ws.aM;
                    r5 = r17.length;
                    r6 = 0;
                    $pc25 = 34; continue $sw25;
                }
                case 34: {
                    if (r6 >= r5) { $pc25 = 35; continue $sw25; }
                    r7 = r17[r6];
                    if (r7 == null) { $pc25 = 52; continue $sw25; }
                    this.Ws.we += r7.v5;
                    $pc25 = 52; continue $sw25;
                }
                case 52: {
                    r6 = r6 + 1;
                    $pc25 = 35; continue $sw25;
                }
                case 35: {
                    r8 = this.VH.iterator();
                    $pc25 = 37; continue $sw25;
                }
                case 37: {
                    if (r8.hasNext() == false) { $pc25 = 38; continue $sw25; }
                    r18 = r8.next();
                    r9 = r18.j6();
                    this.Ws.u7 += r18.DW();
                    r10 = this.Ws;
                    r10.tp += r9;
                    r10.gn += r9;
                    this.J0.j6(r16, r18, this.rN);
                    { $pc25 = 37; continue $sw25; }
                }
                case 38: {
                    j6(r16);
                    r16.flush();
                    this.Ws.XL = java.lang.System.currentTimeMillis() - r4;
                    this.Ws.EQ = r16.v5();
                    this.Ws.FH = java.util.Collections.unmodifiableList(this.VH);
                    r19 = this.Ws;
                    r19.Hw = this.P8;
                    r110 = r19.aM;
                    r11 = r110.length;
                    $pc25 = 39; continue $sw25;
                }
                case 39: {
                    if (r1 >= r11) { $pc25 = 40; continue $sw25; }
                    r111 = r110[r1];
                    if (r111 == null) { $pc25 = 46; continue $sw25; }
                    r12 = r111.DW;
                    r20 = r111.Hw;
                    r111.DW = r12 + r20;
                    r21 = this.Ws;
                    r21.u7 += r111.FH;
                    r21.tp += r20;
                    r21.gn += r111.DW;
                    $pc25 = 46; continue $sw25;
                }
                case 46: {
                    r1 = r1 + 1;
                    { $pc25 = 39; continue $sw25; }
                }
                case 40: {
                    this.we.FH();
                    j6(r14);
                    return;
                }
                case 32: {
                    if (this.VH.isEmpty() == true) { $pc25 = 35; continue $sw25; }
                    $pc25 = 9; continue $sw25;
                }
                case 9: {
                    if (this.a8 == false) { $pc25 = 11; continue $sw25; }
                    $pc25 = 14; continue $sw25;
                }
                case 14: {
                    r0 = true;
                    { $pc25 = 17; continue $sw25; }
                }
                case 11: {
                    if (this.J8.J8() == true) { $pc25 = 14; continue $sw25; }
                    if (this.VH.isEmpty() == true) { $pc25 = 15; continue $sw25; }
                    { $pc25 = 14; continue $sw25; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.LE r3, abcd._F r4, java.util.Set<? extends abcd.yE> r5, java.util.Set<? extends abcd.yE> r6) {
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    if (r3 != null) { $pc26 = 5; continue $sw26; }
                    r3 = abcd.vE.j6;
                    $pc26 = 5; continue $sw26;
                }
                case 5: {
                    if (this.vy == true) { $pc26 = 7; continue $sw26; }
                    $pc26 = 9; continue $sw26;
                }
                case 9: {
                    DW(r3, r4, r5, r6);
                    return;
                }
                case 7: {
                    if ((r4 instanceof abcd.TF.b) == true) { $pc26 = 9; continue $sw26; }
                    r4 = new abcd.TF.b(this.we, this.P8);
                    { $pc26 = 9; continue $sw26; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.LE r4, java.util.Set<? extends abcd.yE> r5, java.util.Set<? extends abcd.yE> r6) {
        abcd._F r0 = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    if (this.vy == false) { $pc27 = 5; continue $sw27; }
                    r0 = new abcd.TF.b(this.we, this.P8);
                    $pc27 = 6; continue $sw27;
                }
                case 6: {
                    j6(r4, r0, r5, r6);
                    return;
                }
                case 5: {
                    r0 = new abcd._F(this.we);
                    { $pc27 = 6; continue $sw27; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.MH r5, abcd.UH r6) {
        int r0 = 0;
        int r1 = 0;
        abcd.yE r2 = null;
        abcd.MH r3 = null;
        boolean r4 = false;
        boolean r7 = false;
        java.util.Iterator<abcd.BH> r8 = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = -1;
        $sw28: while (true) {
            switch ($pc28) {
                case -1: {
                    r0 = r6.DW();
                    if (this.VH.isEmpty() == false) { $pc28 = 5; continue $sw28; }
                    $pc28 = 23; continue $sw28;
                }
                case 23: {
                    if (r0 == 0) { $pc28 = 25; continue $sw28; }
                    $pc28 = 40; continue $sw28;
                }
                case 40: {
                    if (r0 == 1) { $pc28 = 42; continue $sw28; }
                    $pc28 = 51; continue $sw28;
                }
                case 51: {
                    r5.j3();
                    r5.Mr();
                    $pc28 = 52; continue $sw28;
                }
                case 52: {
                    r5.j6(r6);
                    return;
                }
                case 42: {
                    if (this.J8.J8() == false) { $pc28 = 51; continue $sw28; }
                    r1 = r6.FH();
                    if (r5.ei() == true) { $pc28 = 46; continue $sw28; }
                    $pc28 = 50; continue $sw28;
                }
                case 50: {
                    r5.j3();
                    r5.cn();
                    r5.Zo(r1);
                    { $pc28 = 52; continue $sw28; }
                }
                case 46: {
                    if (r5.BT() == true) { $pc28 = 50; continue $sw28; }
                    if (r5.gW() > r1) { $pc28 = 50; continue $sw28; }
                    return;
                }
                case 25: {
                    if (this.a8 == false) { $pc28 = 40; continue $sw28; }
                    if (DW(r5) == false) { $pc28 = 40; continue $sw28; }
                    r2 = r6.j6();
                    r3 = (abcd.MH) this.v5.DW(r2);
                    if (r3 == null) { $pc28 = 34; continue $sw28; }
                    if (r3.P8() == true) { $pc28 = 34; continue $sw28; }
                    r5.DW(r3);
                    r5.cn();
                    $pc28 = 34; continue $sw28;
                }
                case 34: {
                    if (this.er == false) { $pc28 = 39; continue $sw28; }
                    if (r3 == null) { $pc28 = 39; continue $sw28; }
                    if (r3.P8() == false) { $pc28 = 39; continue $sw28; }
                    r5.DW(r2);
                    r5.cn();
                    $pc28 = 39; continue $sw28;
                }
                case 39: {
                    r5.j3();
                    r5.Mr();
                    { $pc28 = 52; continue $sw28; }
                }
                case 5: {
                    if (r5.P8() == false) { $pc28 = 7; continue $sw28; }
                    return;
                }
                case 7: {
                    r4 = false;
                    if (r0 != 1) { $pc28 = 10; continue $sw28; }
                    r7 = true;
                    $pc28 = 11; continue $sw28;
                }
                case 11: {
                    if (r0 != 0) { $pc28 = 14; continue $sw28; }
                    r4 = true;
                    $pc28 = 14; continue $sw28;
                }
                case 14: {
                    if ((r4 | r7) == false) { $pc28 = 23; continue $sw28; }
                    r8 = this.VH.iterator();
                    $pc28 = 17; continue $sw28;
                }
                case 17: {
                    if (r8.hasNext() == false) { $pc28 = 23; continue $sw28; }
                    if (r8.next().j6(r5, r6) == false) { $pc28 = 17; continue $sw28; }
                    r5.ro();
                    r5.j3();
                    r5.Mr();
                    this.BT = true;
                    return;
                }
                case 10: {
                    r7 = false;
                    { $pc28 = 11; continue $sw28; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.OH r2, abcd.MH r3) {
        java.lang.Throwable $ex29 = null;
        int $pc29 = -1;
        $sw29: while (true) {
            switch ($pc29) {
                case -1: {
                    if (r3.nw() == true) { $pc29 = 6; continue $sw29; }
                    Hw(r2, r3);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.AbstractiG r2) {
        java.lang.Throwable $ex30 = null;
        int $pc30 = -1;
        $sw30: while (true) {
            switch ($pc30) {
                case -1: {
                    if (FH(r2) == true) { $pc30 = 6; continue $sw30; }
                    j6(r2, 0);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.io.OutputStream r7) {
        long r0 = 0L;
        java.util.List<abcd.MH> r2 = null;
        int r3 = 0;
        abcd.AbstractgH r8 = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = -1;
        $sw31: while (true) {
            switch ($pc31) {
                case -1: {
                    if (this.VH.isEmpty() == false) { $pc31 = 11; continue $sw31; }
                    r0 = java.lang.System.currentTimeMillis();
                    r2 = u7();
                    r3 = this.J8.gn();
                    if (r3 > 0) { $pc31 = 7; continue $sw31; }
                    r8 = abcd.AbstractgH.j6(r7, r2);
                    $pc31 = 8; continue $sw31;
                }
                case 8: {
                    r8.j6(r2, this.Mr);
                    this.Ws.XL += java.lang.System.currentTimeMillis() - r0;
                    return;
                }
                case 7: {
                    r8 = abcd.AbstractgH.j6(r7, r3);
                    { $pc31 = 8; continue $sw31; }
                }
                case 11: {
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().cachedPacksPreventsIndexCreation);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.util.Set<abcd.yE> r1) {
        this.gn = r1;
    }

    public void j6(boolean r1) {
        this.U2 = r1;
    }

    public boolean j6(abcd.YD r2) {
        abcd.MH r3 = null;
        java.lang.Throwable $ex32 = null;
        int $pc32 = -1;
        $sw32: while (true) {
            switch ($pc32) {
                case -1: {
                    r3 = (abcd.MH) this.v5.DW(r2);
                    if (r3 != null) { $pc32 = 5; continue $sw32; }
                    return false;
                }
                case 5: {
                    if (r3.P8() == true) { $pc32 = 10; continue $sw32; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.TH.c v5() {
        return this.Ws;
    }

    public void v5(boolean r1) {
        this.yS = r1;
    }
}
