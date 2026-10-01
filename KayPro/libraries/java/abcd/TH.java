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
            this.FH = r5;
            this.DW = abcd.TH.b.j6;
            if (abcd.TH.j6(r5).we() == false) goto L8;
            int r0 = abcd.TH.j6(r5).tp();
            if (r0 > 0) goto L7;
            r0 = java.lang.Runtime.getRuntime().availableProcessors();
        L7:
            this.j6 = (((long) r0) * abcd.TH.j6(r5).v5()) + ((long) abcd.TH.j6(r5).j6());
            return;
        L8:
            this.j6 = 0;
        }

        static void j6(abcd.TH.a r0, abcd.TH.b r1) {
            r0.DW = r1;
        }
    }

    public static final enum b extends java.lang.Enum<abcd.TH.b> {
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
            return (abcd.TH.b) java.lang.Enum.valueOf(abcd.TH.b.class, r1);
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
        if ((r7 instanceof abcd.LH) == false) goto L5;
        this.J0 = (abcd.LH) r7;
    L6:
        this.U2 = r6.EQ();
        this.a8 = r6.J0();
        this.rN = true;
        this.Ws = new abcd.TH.c();
        this.QX = new abcd.TH.a(this);
        this.XL = new java.lang.ref.WeakReference(this);
        j6.put(this.XL, java.lang.Boolean.TRUE);
        return;
    L5:
        this.J0 = null;
        goto L6
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
        long r10 = java.lang.System.currentTimeMillis();
        j6(abcd.TH.b.j6, r24, 0);
        if (r27 != null) goto L5;
        java.util.Set<? extends abcd.yE> r2 = java.util.Collections.emptySet();
    L6:
        abcd.TH.c r0 = this.Ws;
        r0.j6 = java.util.Collections.unmodifiableSet(new java.util.HashSet(r26));
        abcd.TH.c r1 = this.Ws;
        r1.DW = java.util.Collections.unmodifiableSet(new java.util.HashSet(r2));
        java.util.ArrayList r3 = new java.util.ArrayList(r26.size() + r2.size());
        r3.addAll(r26);
        r3.addAll(r2);
        java.util.HashMap r14 = new java.util.HashMap();
        abcd.fG r15 = r25.j6("inCachedPack");
        abcd.fG r6 = r25.j6("include");
        abcd.fG r5 = r25.j6("added");
        abcd.hG r4 = new abcd.hG();
        r4.j6(r15);
        r25.j6(false);
        r25.j6(r6);
        int r16 = r2.size();
        if (r2.isEmpty() == false) goto L34;
        r25.DW(abcd.EnumkG.DW);
        if (this.yS == true) goto L11;
    L37:
        java.util.List<abcd.AbstractiG> r12 = new java.util.ArrayList(r26.size());
        java.util.List<abcd.AbstractiG> r13 = new java.util.ArrayList(r16);
        java.util.ArrayList r7 = new java.util.ArrayList(r26.size());
        abcd.MF r17 = r25.j6(r3, true);
    L202:
        abcd.AbstractiG r8 = r17.next();     // Catch: java.lang.Throwable -> L189 abcd.fD -> L191
        if (r8 == null) goto L40;
        abcd.hG r21 = r4;
        abcd.fG r22 = r5;
        long r18 = r10;
        java.util.List<abcd.AbstractiG> r28 = r12;
        abcd.fG r19 = r6;
        if (r14.containsKey(r8) == false) goto L170;
        r8.j6(r15);     // Catch: abcd.fD -> L186 java.lang.Throwable -> L189
    L170:
        if (r2.contains(r8) == false) goto L211;
        r13.add(r8);     // Catch: abcd.fD -> L186 java.lang.Throwable -> L189
    L211:
    L184:
        e = e;
    L188:
        java.util.List<abcd.AbstractiG> r11 = r28;
    L194:
        if (this.gW == false) goto L198;
        if (r2.contains(e.j6()) == false) goto L198;
    L197:
        r6 = r19;
        r4 = r21;
        r5 = r22;
        r12 = r11;
        r10 = r18;
    L198:
        throw e;     // Catch: java.lang.Throwable -> L189
    L174:
        if (r26.contains(r8) == true) goto L175;
        r6 = r19;
        r10 = r18;
        r4 = r21;
        r5 = r22;
        r12 = r28;
        goto L202
    L175:
        r8.j6(r19);     // Catch: abcd.fD -> L184 java.lang.Throwable -> L189
        r11 = r28;
        r11.add(r8);     // Catch: abcd.fD -> L181 java.lang.Throwable -> L189
        if ((r8 instanceof abcd.lG) == false) goto L197;
        r7.add((abcd.lG) r8);     // Catch: abcd.fD -> L181 java.lang.Throwable -> L189
    L181:
        e = e;
    L186:
        e = e;
        goto L188
    L40:
        r17.j6();
        if (r7.isEmpty() == true) goto L54;
        java.util.ArrayList r9 = new java.util.ArrayList(r7.size());
        java.util.Iterator r20 = r7.iterator();
    L44:
        if (r20.hasNext() == false) goto L45;
        r9.add(((abcd.lG) r20.next()).j3());
        goto L44
    L45:
        abcd.MF r23 = r25.j6(r9, true);
    L204:
        if (r23.next() != null) goto L204;
        r23.j6();
    L49:
        th = move-exception;
        r23.j6();
        throw th;
    L54:
        if ((r25 instanceof abcd.TF.b) == false) goto L66;
        abcd.TF.b r29 = (abcd.TF.b) r25;
        java.util.Iterator<abcd.AbstractiG> r30 = r12.iterator();
    L57:
        if (r30.hasNext() == false) goto L58;
        r29.Zo(r30.next());
        goto L57
    L58:
        java.util.Collection<? extends abcd.yE> r31 = this.ei;
        if (r31 == null) goto L69;
        java.util.Iterator<? extends abcd.yE> r32 = r31.iterator();
    L62:
        if (r32.hasNext() == false) goto L69;
        r29.VH(r25.Zo(r32.next()));
    L69:
        java.util.Iterator<abcd.AbstractiG> r33 = r13.iterator();
    L71:
        if (r33.hasNext() == false) goto L72;
        java.util.List<abcd.AbstractiG> r210 = r12;
        r25.v5(r33.next());
        r6 = r6;
        r4 = r4;
        r5 = r5;
        r12 = r210;
        goto L71
    L72:
        int r34 = this.J8.Zo();
        java.util.HashSet r35 = new java.util.HashSet();
        abcd.lK r36 = new abcd.lK();
    L73:
        abcd.dG r37 = r25.tp();
        if (r37 == null) goto L76;
        if (FH(r37) == false) goto L150;
        r4 = r4;
        r5 = r5;
        long r110 = r10;
        r12 = r12;
        r35 = r35;
        abcd.fG r111 = r6;
    L162:
        r35 = r35;
        r6 = r111;
        r10 = r110;
        r4 = r4;
        r5 = r5;
        r12 = r12;
        goto L73
    L150:
        if (r37.DW(r15) == false) goto L155;
        r110 = r10;
        abcd.BH r112 = (abcd.BH) r14.get(r37);
        if (j6(r112, r6, r25) == false) goto L156;
        r35 = r35;
        abcd.hG r38 = r4;
        r4 = r4;
        java.util.List<abcd.AbstractiG> r39 = r12;
        r5 = r5;
        r12 = r12;
        r111 = r6;
        j6(r25, r38, r39, r13, r112);
        r36 = new abcd.lK();
        j6(r24);
        j6(abcd.TH.b.j6, r24, 0);
    L156:
        r111 = r6;
        if (r37.DW(abcd.fG.j6) == true) goto L159;
        r36.add(r37);
        r24.update(1);
        goto L162
    L159:
        if (r35.size() > r34) goto L162;
        r35.add(r37.yS());
        goto L162
    L155:
        r110 = r10;
        goto L156
    L76:
        if (this.vy == false) goto L82;
        java.util.Iterator r40 = r36.iterator();
    L79:
        if (r40.hasNext() == false) goto L86;
        j6((abcd.dG) r40.next(), 0);
    L86:
        if (this.er == false) goto L100;
        if (r35.isEmpty() == true) goto L100;
        abcd.zH r41 = new abcd.zH(r24, r35, this.v5, this.Zo, this.we);
    L90:
        abcd.AbstractiG r42 = r25.yS();
        if (r42 == null) goto L102;
        if (r42.DW(abcd.fG.j6) == true) goto L90;
        if (FH(r42) == true) goto L90;
        int r43 = r25.QX();
        byte[] r44 = r25.Ws();
        int r45 = r25.XL();
        r41.j6(r42.aM(), r44, r45, r43);
        j6(r42, r43);
        r24.update(1);
    L102:
        java.util.Iterator<abcd.BH> r46 = this.VH.iterator();
    L104:
        if (r46.hasNext() == false) goto L105;
        r24.update((int) r46.next().DW());
        goto L104
    L105:
        j6(r24);
        abcd.TH.c r47 = this.Ws;
        r47.J0 = java.lang.System.currentTimeMillis() - r10;
        return;
    L100:
        abcd.AbstractiG r48 = r25.yS();
        if (r48 == null) goto L102;
        if (r48.DW(abcd.fG.j6) == true) goto L100;
        if (FH(r48) == true) goto L100;
        j6(r48, r25.QX());
        r24.update(1);
        goto L100
    L82:
        java.util.Iterator r113 = r36.iterator();
        int r49 = 0;
        boolean r114 = false;
    L84:
        if (r113.hasNext() == false) goto L86;
        abcd.dG r50 = (abcd.dG) r113.next();
        if (r50.DW(r5) == true) goto L118;
        r50.j6(r5);
        j6(r50, 0);
        r49 = r49 + 1;
    L118:
        r49 = r49;
        int r51 = 0;
    L120:
        if (r51 >= r50.lg()) goto L121;
        abcd.AbstractiG r52 = r50.DW(r51);
        if (r52.DW(r5) == true) goto L144;
        if (r52.DW(abcd.fG.j6) == true) goto L144;
        r52.j6(r5);
        j6(r52, 0);
        r49 = r49 + 1;
    L144:
        r51 = r51 + 1;
        goto L120
    L121:
        if (r114 == true) goto L84;
        if (4096 >= r49) goto L84;
        java.util.Iterator<abcd.yE> r53 = this.gn.iterator();
    L126:
        if (r53.hasNext() == false) goto L127;
        abcd.AbstractiG r54 = r25.Hw(r53.next());
        if ((r54 instanceof abcd.dG) == false) goto L126;
        if (r54.DW(r6) == false) goto L126;
        if (r54.DW(abcd.fG.j6) == true) goto L126;
        if (r54.DW(r5) == true) goto L126;
        r54.j6(r5);
        j6(r54, 0);
        goto L126
    L127:
        r114 = true;
        goto L84
    L66:
        java.util.Iterator<abcd.AbstractiG> r55 = r12.iterator();
    L68:
        if (r55.hasNext() == false) goto L69;
        java.util.List<abcd.AbstractiG> r211 = r12;
        r25.Hw(r55.next());
        r6 = r6;
        r4 = r4;
        r5 = r5;
        r12 = r211;
    L191:
        e = e;
        r21 = r4;
        r22 = r5;
        r18 = r10;
        r11 = r12;
        r19 = r6;
    L189:
        th = move-exception;
        r17.j6();
        throw th;
    L11:
        if (this.J0 == null) goto L37;
        java.util.HashSet r115 = new java.util.HashSet(r26);
        java.util.LinkedList r56 = new java.util.LinkedList();
        java.util.Iterator<abcd.BH> r116 = this.J0.j6().iterator();
    L14:
        if (r116.hasNext() == false) goto L16;
        java.util.Iterator<abcd.BH> r117 = r116;
        abcd.BH r118 = r116.next();
        if (r115.containsAll(r118.FH()) == false) goto L29;
        r115.removeAll(r118.FH());
        r56.add(r118);
    L29:
        java.util.Iterator<abcd.yE> r57 = r118.FH().iterator();
    L31:
        if (r57.hasNext() == false) goto L32;
        java.util.Iterator<abcd.yE> r212 = r57;
        abcd.yE r58 = r57.next();
        r14.put(r58, r118);
        r3.add(r58);
        r57 = r212;
        goto L31
    L32:
        r116 = r117;
        goto L14
    L16:
        if (r115.isEmpty() == true) goto L18;
    L25:
        r16 = r16 + r14.size();
        goto L37
    L18:
        if (r56.isEmpty() == true) goto L25;
        this.VH.addAll(r56);
        java.util.Iterator r59 = r56.iterator();
    L21:
        if (r59.hasNext() == false) goto L22;
        r24.update((int) ((abcd.BH) r59.next()).DW());
        goto L21
    L22:
        j6(r24);
        abcd.TH.c r60 = this.Ws;
        r60.J0 = java.lang.System.currentTimeMillis() - r10;
        return;
    L34:
        r25.DW(abcd.EnumkG.FH);
        if (this.er == false) goto L37;
        r25.j6(abcd.EnumkG.v5, true);
        goto L37
    L5:
        r2 = r27;
        goto L6
    }

    private void DW(abcd.OH r3) {
        j6(r3, this.Hw[1]);
        j6(r3, this.Hw[4]);
        j6(r3, this.Hw[2]);
        j6(r3, this.Hw[3]);
    }

    private void DW(abcd.OH r2, abcd.MH r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.nw() == false) goto L6;
        return;
    L6:
        if (r3.P8() == true) goto L11;
        Hw(r2, r3);
        return;
    }

    private boolean DW(abcd.MH r3) {
        int r4 = r3.yS();
        if (r4 == 1) goto L15;
        if (r4 != 2) goto L7;
    L13:
        return true;
    L7:
        if (r4 == 3) goto L13;
        if (r4 == 4) goto L11;
        return true;
    L11:
        return false;
    L15:
        return this.lg;
    }

    private byte[] DW(abcd.YD r3) {
        return j6(this.J8, this.we, r3);
    }

    private void FH(abcd.LE r12) {
        long r2 = (((((long) this.Hw[1].size()) + 0) + ((long) this.Hw[2].size())) + ((long) this.Hw[3].size())) + ((long) this.Hw[4].size());
        long r7 = java.lang.System.currentTimeMillis();
        j6(abcd.TH.b.FH, r12, r2);
        if (r2 > 4096) goto L7;
        abcd.lK r0 = new abcd.lK((int) r2);
        r0.FH(this.Hw[4]);
        r0.FH(this.Hw[1]);
        r0.FH(this.Hw[2]);
        r0.FH(this.Hw[3]);
        j6(r12, r0);
        if (this.BT == false) goto L8;
        j6(this.Hw[1]);
        j6(this.Hw[2]);
        j6(this.Hw[3]);
        j6(this.Hw[4]);
    L8:
        j6(r12);
        abcd.TH.c r13 = this.Ws;
        r13.J8 = java.lang.System.currentTimeMillis() - r7;
        return;
    L7:
        j6(r12, this.Hw[4]);
        j6(r12, this.Hw[1]);
        j6(r12, this.Hw[2]);
        j6(r12, this.Hw[3]);
        goto L8
    }

    private void FH(abcd.OH r6, abcd.MH r7) {
        DW(r6, r7.a8());
        r6.Zo();
        r7.j6(r6.v5());
        abcd.CH.a r0 = r7.KD();
        if (r0 == null) goto L8;
        byte[] r1 = r0.get();
        if (r1 == null) goto L8;
        r6.j6(r7, r7.U2());
        r6.write(r1);
        return;
    L8:
        abcd.RK.c r2 = j6(r7);
        r6.j6(r7, r2.DW());
        java.util.zip.Deflater r3 = gn();
        r3.reset();
        java.util.zip.DeflaterOutputStream r4 = new java.util.zip.DeflaterOutputStream(r6, r3);
        r2.j6(r4, null);
        r4.finish();
        abcd.TH.c.a r5 = this.aM;
        r5.DW++;
        r5.Zo += r6.v5() - r7.getOffset();
    }

    private boolean FH(abcd.YD r8) {
        if (this.u7 != null) goto L6;
        return false;
    L6:
        if (this.tp.FH(r8) == false) goto L8;
        return true;
    L8:
        abcd.AbstractbH[] r0 = this.u7;
        int r3 = r0.length;
        int r4 = 0;
    L9:
        if (r4 >= r3) goto L10;
        abcd.AbstractbH r5 = r0[r4];
        if (r5.FH(r8) == true) goto L13;
        r4 = r4 + 1;
        goto L9
    L13:
        this.tp = r5;
        return true;
    L10:
        return false;
    }

    private void Hw(abcd.OH r8, abcd.MH r9) {
        if (r9.sh() == false) goto L5;
        this.a8 = false;
        r9.j3();
        r9.Mr();
        this.J0.j6(this, abcd.vE.j6, java.util.Collections.singleton(r9));
    L5:
        r9.SI();
    L7:
        if (r9.ei() == false) goto L9;
        DW(r8, r9.a8());
        if (r9.nw() == true) goto L16;
        r8.Zo();
        r9.j6(r8.v5());
        this.J0.j6(r8, r9, this.rN);     // Catch: abcd.tD -> L22
        r8.j6();     // Catch: abcd.tD -> L22
        r9.DW(r8.DW());     // Catch: abcd.tD -> L22
        this.aM.FH++;     // Catch: abcd.tD -> L22
        if (r9.BT() == false) goto L21;
        this.aM.Hw++;     // Catch: abcd.tD -> L22
        this.aM.Zo += r8.v5() - r9.getOffset();     // Catch: abcd.tD -> L22
        return;
    L21:
        return;
    L22:
        e = move-exception;
        if (r9.getOffset() != r8.v5()) goto L26;
        r9.j6(0);
        r9.j3();
        r9.Mr();
        this.J0.j6(this, abcd.vE.j6, java.util.Collections.singleton(r9));
        goto L7
    L26:
        abcd.YC r10 = new abcd.YC(r9, "");
        r10.initCause(e);
        throw r10;
    L16:
        return;
    L9:
        if (r9.BT() == false) goto L11;
        FH(r8, r9);
    L12:
        r8.j6();
        r9.DW(r8.DW());
        return;
    L11:
        v5(r8, r9);
        goto L12
    }

    private java.util.zip.Deflater gn() {
        if (this.EQ != null) goto L6;
        this.EQ = new java.util.zip.Deflater(this.J8.DW());
    L6:
        return this.EQ;
    }

    private int j6(abcd.MH[] r3, int r4, int r5) {
        java.util.Iterator r6 = this.Hw[r5].iterator();
    L4:
        if (r6.hasNext() == false) goto L5;
        abcd.MH r0 = (abcd.MH) r6.next();
        if (r0.vy() == true) goto L4;
        if (r0.BT() == true) goto L4;
        r0.Zo(0);
        r3[r4] = r0;
        r4 = r4 + 1;
        goto L4
    L5:
        return r4;
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
        this.BT = false;
        this.J0.j6(this, r2, r3);
        if (this.BT == false) goto L6;
        j6(r3);
        return;
    }

    private void j6(abcd.LE r20, abcd.MH[] r21, int r22) {
        int r2 = this.J8.tp();
        if (r2 != 0) goto L5;
        r2 = java.lang.Runtime.getRuntime().availableProcessors();
    L5:
        int r12 = r2;
        int r13 = 0;
        if (r12 > 1) goto L8;
    L70:
        new abcd.IH(this.J8, new abcd.CH(this.J8), this.we).j6(r20, r21, 0, r22);
        return;
    L8:
        if (r22 <= (this.J8.Zo() * 2)) goto L70;
        abcd.VH r14 = new abcd.VH(this.J8);
        abcd.lF r15 = new abcd.lF(r20);
        int r0 = r12 * 2;
        int r3 = r22 / r0;
        if (r3 >= (this.J8.Zo() * 2)) goto L13;
        r3 = this.J8.Zo() * 2;
    L13:
        int r9 = r3;
        java.util.ArrayList r8 = new java.util.ArrayList(r0);
        int r1 = 0;
    L14:
        if (r1 >= r22) goto L15;
        int r4 = r22 - r1;
        if (r4 >= r9) goto L62;
    L61:
        int r7 = r4;
        int r17 = r12;
        java.util.ArrayList r16 = r8;
        r16.add(new abcd.HH(this.J8, this.we, r14, r15, r7, r1, r21));
        r8 = r16;
        r1 = r1 + r7;
        r12 = r17;
        r9 = r9;
        r13 = 0;
        goto L14
    L62:
        int r5 = r1 + r9;
    L63:
        if (r5 >= r22) goto L68;
        if (r21[r5 - 1].er() != r21[r5].er()) goto L68;
        r5 = r5 + 1;
    L68:
        r4 = r5 - r1;
        goto L61
    L15:
        r15.j6(r8.size());
        java.util.concurrent.Executor r6 = this.J8.VH();
        java.util.List<java.lang.Throwable> r10 = java.util.Collections.synchronizedList(new java.util.ArrayList());
        if ((r6 instanceof java.util.concurrent.ExecutorService) == false) goto L18;
        j6((java.util.concurrent.ExecutorService) r6, r15, r8, r10);
    L40:
        if (r10.isEmpty() == true) goto L55;
        java.lang.Throwable r11 = r10.get(r13);
        if ((r11 instanceof java.lang.Error) == true) goto L54;
        if ((r11 instanceof java.lang.RuntimeException) == true) goto L52;
        if ((r11 instanceof java.io.IOException) == true) goto L48;
        java.io.IOException r18 = new java.io.IOException(r11.getMessage());
        r18.initCause(r11);
        throw r18;
    L48:
        throw ((java.io.IOException) r11);
    L52:
        throw ((java.lang.RuntimeException) r11);
    L54:
        throw ((java.lang.Error) r11);
    L55:
        return;
    L18:
        if (r6 != null) goto L35;
        java.util.concurrent.ExecutorService r19 = java.util.concurrent.Executors.newFixedThreadPool(r12);
        j6(r19, r15, r8, r10);     // Catch: java.lang.Throwable -> L27
        r19.shutdown();
    L78:
        if (r19.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS) == false) goto L78;
    L26:
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packingCancelledDuringObjectsWriting);
    L27:
        th = move-exception;
        r19.shutdown();
    L72:
        if (r19.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS) == false) goto L72;
        throw th;
    L34:
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packingCancelledDuringObjectsWriting);
    L35:
        java.util.Iterator<abcd.HH> r23 = r8.iterator();
    L37:
        if (r23.hasNext() == false) goto L76;
        r6.execute(new abcd.SH(this, r23.next(), r10));
        goto L37
    L76:
        r15.FH();     // Catch: java.lang.InterruptedException -> L56
    L57:
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packingCancelledDuringObjectsWriting);
    }

    private void j6(abcd.OH r2) {
        this.Mr = r2.Hw();
        r2.write(this.Mr);
    }

    private void j6(abcd.OH r8, java.util.List<abcd.MH> r9) {
        if (r9.isEmpty() == false) goto L5;
        return;
    L5:
        this.aM = this.Ws.aM[r9.get(0).yS()];
        long r0 = r8.v5();
        abcd.LH r2 = this.J0;
        if (r2 == null) goto L8;
        r2.j6(r8, r9);
    L11:
        this.aM.v5 += r8.v5() - r0;
        this.aM.j6 = r9.size();
        return;
    L8:
        java.util.Iterator<abcd.MH> r3 = r9.iterator();
    L10:
        if (r3.hasNext() == false) goto L11;
        r8.j6(r3.next());
        goto L10
    }

    private void j6(abcd.TH.b r4, abcd.LE r5, long r6) {
        abcd.TH.a.j6(this.QX, r4);
        int r0 = j6()[r4.ordinal()];
        if (r0 != 1) goto L5;
        java.lang.String r7 = org.eclipse.jgit.JGitText.j6().countingObjects;
    L19:
        r5.j6(r7, (int) r6);
        return;
    L5:
        if (r0 != 2) goto L7;
        r7 = org.eclipse.jgit.JGitText.j6().searchForSizes;
        goto L19
    L7:
        if (r0 != 3) goto L9;
        r7 = org.eclipse.jgit.JGitText.j6().searchForReuse;
        goto L19
    L9:
        if (r0 != 4) goto L11;
        r7 = org.eclipse.jgit.JGitText.j6().compressingObjects;
        goto L19
    L11:
        if (r0 != 5) goto L14;
        r7 = org.eclipse.jgit.JGitText.j6().writingObjects;
        goto L19
    L14:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().illegalPackingPhase, new java.lang.Object[]{r4}));
    }

    private void j6(abcd._F r2, abcd.hG r3, java.util.List<abcd.AbstractiG> r4, java.util.List<abcd.AbstractiG> r5, abcd.BH r6) {
        this.VH.add(r6);
        java.util.Iterator<abcd.yE> r7 = r6.FH().iterator();
    L4:
        if (r7.hasNext() == false) goto L5;
        r5.add(r2.Hw(r7.next()));
        goto L4
    L5:
        Hw(true);
        r2.j6(r3);
        r2.DW(abcd.EnumkG.FH);
        r2.j6(abcd.EnumkG.v5, true);
        java.util.Iterator<abcd.AbstractiG> r0 = r4.iterator();
    L7:
        if (r0.hasNext() == false) goto L8;
        r2.Hw(r0.next());
        goto L7
    L8:
        java.util.Iterator<abcd.AbstractiG> r8 = r5.iterator();
    L10:
        if (r8.hasNext() == false) goto L11;
        r2.v5(r8.next());
        goto L10
    }

    private void j6(abcd.AbstractiG r2, int r3) {
        abcd.LH r0 = this.J0;
        if (r0 == null) goto L5;
        abcd.MH r1 = r0.j6(r2);
    L6:
        r1.v5(r3);
        this.Hw[r2.aM()].add(r1);
        this.v5.j6(r1);
        return;
    L5:
        r1 = new abcd.MH(r2);
        goto L6
    }

    private static void j6(java.util.List<abcd.MH> r5) {
        int r0 = r5.size();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L5;
        abcd.MH r3 = r5.get(r1);
        if (r3.P8() == true) goto L14;
        if (r2 == r1) goto L13;
        r5.set(r2, r3);
    L13:
        r2 = r2 + 1;
    L14:
        r1 = r1 + 1;
    L5:
        if (r2 >= r5.size()) goto L6;
        r5.remove(r5.size() - 1);
        goto L5
    }

    private void j6(java.util.concurrent.ExecutorService r3, abcd.lF r4, java.util.List<abcd.HH> r5, java.util.List<java.lang.Throwable> r6) {
        java.util.ArrayList r0 = new java.util.ArrayList(r5.size());
        java.util.Iterator<abcd.HH> r7 = r5.iterator();
    L4:
        if (r7.hasNext() == false) goto L22;
        r0.add(r3.submit(r7.next()));
        goto L4
    L22:
        r4.FH();     // Catch: java.lang.InterruptedException -> L15
        java.util.Iterator r8 = r0.iterator();     // Catch: java.lang.InterruptedException -> L15
    L6:
        if (r8.hasNext() == false) goto L8;
        ((java.util.concurrent.Future) r8.next()).get();     // Catch: java.util.concurrent.ExecutionException -> L12 java.lang.InterruptedException -> L15
    L12:
        e = move-exception;
        r6.add(e.getCause());     // Catch: java.lang.InterruptedException -> L15
        goto L6
    L8:
        return;
    L15:
        java.util.Iterator r9 = r0.iterator();
    L17:
        if (r9.hasNext() == false) goto L20;
        ((java.util.concurrent.Future) r9.next()).cancel(true);
        goto L17
    L20:
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packingCancelledDuringObjectsWriting);
    }

    private static boolean j6(abcd.BH r1, abcd.fG r2, abcd._F r3) {
        java.util.Iterator<abcd.yE> r4 = r1.FH().iterator();
    L4:
        if (r4.hasNext() == false) goto L5;
        if (r3.Hw(r4.next()).DW(r2) == true) goto L4;
        return false;
    L5:
        return true;
    }

    static byte[] j6(abcd.NH r0, abcd.IE r1, abcd.YD r2) {
        return r1.FH(r2).DW(r0.j6());
    }

    static int[] j6() {
        int[] r0 = FH;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.TH.b.values().length];
        r1[abcd.TH.b.Hw.ordinal()] = 4;     // Catch: java.lang.NoSuchFieldError -> L13
    L18:
        r1[abcd.TH.b.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L14
    L24:
        r1[abcd.TH.b.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L15
    L26:
        r1[abcd.TH.b.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L16
    L20:
        r1[abcd.TH.b.v5.ordinal()] = 5;     // Catch: java.lang.NoSuchFieldError -> L17
    L11:
        FH = r1;
        return r1;
    }

    private java.util.List<abcd.MH> u7() {
        if (this.j3 != null) goto L6;
        this.j3 = new abcd.lK((((this.Hw[1].size() + 0) + this.Hw[2].size()) + this.Hw[3].size()) + this.Hw[4].size());
        this.j3.addAll(this.Hw[1]);
        this.j3.addAll(this.Hw[2]);
        this.j3.addAll(this.Hw[3]);
        this.j3.addAll(this.Hw[4]);
        java.util.Collections.sort(this.j3);
    L6:
        return this.j3;
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
        byte[] r1 = new byte[20];
        java.security.MessageDigest r2 = abcd.hE.j6();
        java.util.Iterator<abcd.MH> r3 = u7().iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        r3.next().DW(r1, 0);
        r2.update(r1, 0, 20);
        goto L4
    L6:
        return abcd.yE.j6(r2.digest());
    }

    public void FH(boolean r1) {
        this.rN = r1;
    }

    public long Hw() {
        long r0 = this.Ws.VH;
        if (r0 != 0) goto L9;
        long r1 = (((((long) this.Hw[1].size()) + 0) + ((long) this.Hw[2].size())) + ((long) this.Hw[3].size())) + ((long) this.Hw[4].size());
        java.util.Iterator<abcd.BH> r2 = this.VH.iterator();
    L6:
        if (r2.hasNext() == false) goto L7;
        r1 = r1 + r2.next().DW();
        goto L6
    L7:
        return r1;
    L9:
        return r0;
    }

    public void Hw(boolean r1) {
        this.er = r1;
    }

    public void VH() {
        this.we.FH();
        java.util.zip.Deflater r0 = this.EQ;
        if (r0 == null) goto L5;
        r0.end();
        this.EQ = null;
    L5:
        j6.remove(this.XL);
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
        if (r13 != null) goto L4;
        r13 = abcd.vE.j6;
    L4:
        if (r14 != null) goto L6;
        r14 = abcd.vE.j6;
    L6:
        this.u7 = null;
        this.tp = null;
        int r1 = 0;
        if (this.J0 != null) goto L9;
    L15:
        boolean r0 = false;
    L17:
        if ((r13 instanceof abcd.AbstracteE) == false) goto L24;
        long r2 = 1000;
        if (r0 == true) goto L21;
    L23:
        ((abcd.AbstracteE) r13).j6(r2, java.util.concurrent.TimeUnit.MILLISECONDS);
        goto L24
    L21:
        if (this.J8.we() == false) goto L23;
        r2 = 500;
    L24:
        if (r0 == false) goto L27;
        FH(r13);
    L27:
        if (this.J8.we() == false) goto L29;
        DW(r13);
    L29:
        abcd.OH r16 = new abcd.OH(r14, r15, this);
        long r3 = Hw();
        this.Ws.VH = r3;
        j6(abcd.TH.b.v5, r14, r3);
        long r4 = java.lang.System.currentTimeMillis();
        r16.j6(2, r3);
        r16.flush();
        DW(r16);
        if (this.Zo.isEmpty() == true) goto L32;
    L33:
        abcd.TH.c.a[] r17 = this.Ws.aM;
        int r5 = r17.length;
        int r6 = 0;
    L34:
        if (r6 >= r5) goto L35;
        abcd.TH.c.a r7 = r17[r6];
        if (r7 == null) goto L52;
        this.Ws.we += r7.v5;
    L52:
        r6 = r6 + 1;
    L35:
        java.util.Iterator<abcd.BH> r8 = this.VH.iterator();
    L37:
        if (r8.hasNext() == false) goto L38;
        abcd.BH r18 = r8.next();
        long r9 = r18.j6();
        this.Ws.u7 += r18.DW();
        abcd.TH.c r10 = this.Ws;
        r10.tp += r9;
        r10.gn += r9;
        this.J0.j6(r16, r18, this.rN);
        goto L37
    L38:
        j6(r16);
        r16.flush();
        this.Ws.XL = java.lang.System.currentTimeMillis() - r4;
        this.Ws.EQ = r16.v5();
        this.Ws.FH = java.util.Collections.unmodifiableList(this.VH);
        abcd.TH.c r19 = this.Ws;
        r19.Hw = this.P8;
        abcd.TH.c.a[] r110 = r19.aM;
        int r11 = r110.length;
    L39:
        if (r1 >= r11) goto L40;
        abcd.TH.c.a r111 = r110[r1];
        if (r111 == null) goto L46;
        long r12 = r111.DW;
        long r20 = r111.Hw;
        r111.DW = r12 + r20;
        abcd.TH.c r21 = this.Ws;
        r21.u7 += r111.FH;
        r21.tp += r20;
        r21.gn += r111.DW;
    L46:
        r1 = r1 + 1;
        goto L39
    L40:
        this.we.FH();
        j6(r14);
        return;
    L32:
        if (this.VH.isEmpty() == true) goto L35;
    L9:
        if (this.a8 == false) goto L11;
    L14:
        r0 = true;
        goto L17
    L11:
        if (this.J8.J8() == true) goto L14;
        if (this.VH.isEmpty() == true) goto L15;
        goto L14
    }

    public void j6(abcd.LE r3, abcd._F r4, java.util.Set<? extends abcd.yE> r5, java.util.Set<? extends abcd.yE> r6) {
        if (r3 != null) goto L5;
        r3 = abcd.vE.j6;
    L5:
        if (this.vy == true) goto L7;
    L9:
        DW(r3, r4, r5, r6);
        return;
    L7:
        if ((r4 instanceof abcd.TF.b) == true) goto L9;
        r4 = new abcd.TF.b(this.we, this.P8);
        goto L9
    }

    public void j6(abcd.LE r4, java.util.Set<? extends abcd.yE> r5, java.util.Set<? extends abcd.yE> r6) {
        if (this.vy == false) goto L5;
        abcd._F r0 = new abcd.TF.b(this.we, this.P8);
    L6:
        j6(r4, r0, r5, r6);
        return;
    L5:
        r0 = new abcd._F(this.we);
        goto L6
    }

    public void j6(abcd.MH r5, abcd.UH r6) {
        int r0 = r6.DW();
        if (this.VH.isEmpty() == false) goto L5;
    L23:
        if (r0 == 0) goto L25;
    L40:
        if (r0 == 1) goto L42;
    L51:
        r5.j3();
        r5.Mr();
    L52:
        r5.j6(r6);
        return;
    L42:
        if (this.J8.J8() == false) goto L51;
        int r1 = r6.FH();
        if (r5.ei() == true) goto L46;
    L50:
        r5.j3();
        r5.cn();
        r5.Zo(r1);
        goto L52
    L46:
        if (r5.BT() == true) goto L50;
        if (r5.gW() > r1) goto L50;
        return;
    L25:
        if (this.a8 == false) goto L40;
        if (DW(r5) == false) goto L40;
        abcd.yE r2 = r6.j6();
        abcd.MH r3 = (abcd.MH) this.v5.DW(r2);
        if (r3 == null) goto L34;
        if (r3.P8() == true) goto L34;
        r5.DW(r3);
        r5.cn();
    L34:
        if (this.er == false) goto L39;
        if (r3 == null) goto L39;
        if (r3.P8() == false) goto L39;
        r5.DW(r2);
        r5.cn();
    L39:
        r5.j3();
        r5.Mr();
        goto L52
    L5:
        if (r5.P8() == false) goto L7;
        return;
    L7:
        boolean r4 = false;
        if (r0 != 1) goto L10;
        boolean r7 = true;
    L11:
        if (r0 != 0) goto L14;
        r4 = true;
    L14:
        if ((r4 | r7) == false) goto L23;
        java.util.Iterator<abcd.BH> r8 = this.VH.iterator();
    L17:
        if (r8.hasNext() == false) goto L23;
        if (r8.next().j6(r5, r6) == false) goto L17;
        r5.ro();
        r5.j3();
        r5.Mr();
        this.BT = true;
        return;
    L10:
        r7 = false;
        goto L11
    }

    void j6(abcd.OH r2, abcd.MH r3) {
        if (r3.nw() == true) goto L6;
        Hw(r2, r3);
        return;
    }

    public void j6(abcd.AbstractiG r2) {
        if (FH(r2) == true) goto L6;
        j6(r2, 0);
        return;
    }

    public void j6(java.io.OutputStream r7) {
        if (this.VH.isEmpty() == false) goto L11;
        long r0 = java.lang.System.currentTimeMillis();
        java.util.List<abcd.MH> r2 = u7();
        int r3 = this.J8.gn();
        if (r3 > 0) goto L7;
        abcd.AbstractgH r8 = abcd.AbstractgH.j6(r7, r2);
    L8:
        r8.j6(r2, this.Mr);
        this.Ws.XL += java.lang.System.currentTimeMillis() - r0;
        return;
    L7:
        r8 = abcd.AbstractgH.j6(r7, r3);
        goto L8
    L11:
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().cachedPacksPreventsIndexCreation);
    }

    public void j6(java.util.Set<abcd.yE> r1) {
        this.gn = r1;
    }

    public void j6(boolean r1) {
        this.U2 = r1;
    }

    public boolean j6(abcd.YD r2) {
        abcd.MH r3 = (abcd.MH) this.v5.DW(r2);
        if (r3 != null) goto L5;
        return false;
    L5:
        if (r3.P8() == true) goto L10;
        return true;
    L10:
        return false;
    }

    public abcd.TH.c v5() {
        return this.Ws;
    }

    public void v5(boolean r1) {
        this.yS = r1;
    }
}
