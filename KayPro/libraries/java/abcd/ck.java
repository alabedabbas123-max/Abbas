package abcd;

@abcd.Interfacexu
public class ck {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 4887464436083391736L)
    private int EQ;

    @abcd.Interfaceru(field = -2226007883273782845L)
    private java.lang.Object FH;

    @abcd.Interfaceru(field = -4863873756997046120L)
    private java.util.HashSet<java.lang.String> Hw;

    @abcd.Interfaceru(field = -7218176575508134464L)
    private java.util.HashMap<java.lang.String, java.util.List<com.aide.engine.SyntaxError>> J0;

    @abcd.Interfaceru(field = 671959081182101984L)
    private int J8;

    @abcd.Interfaceru(field = -686851500446748605L)
    private android.widget.Toast QX;

    @abcd.Interfaceru(field = 2543642664292346035L)
    private java.util.HashMap<java.lang.String, com.aide.engine.SyntaxError[]> VH;

    @abcd.Interfaceru(field = 3904056600187910725L)
    private java.util.Set<abcd.ck.a> Ws;

    @abcd.Interfaceru(field = 2846363599630113539L)
    private java.util.HashSet<java.lang.String> Zo;

    @abcd.Interfaceru(field = -1699830633004757019L)
    private int gn;

    @abcd.Interfaceru(field = 7580735089989095440L)
    private int tp;

    @abcd.Interfaceru(field = -5827013279424254533L)
    private int u7;

    @abcd.Interfaceru(field = -4069557312301949588L)
    private java.util.HashMap<java.lang.String, java.lang.Boolean> v5;

    @abcd.Interfaceru(field = -3935693940636718280L)
    private boolean we;

    public interface a {
        void j6();

        void j6(java.lang.String r1);
    }

    static {
        abcd.wu.j6(abcd.ck.class, 7280145652699390275L, 7280145652699390275L);
    }

    public ck() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4462276676758114725L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4462276676758114725L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new java.lang.Object();     // Catch: java.lang.Throwable -> L8
        this.Hw = new java.util.HashSet();     // Catch: java.lang.Throwable -> L8
        this.v5 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        this.Zo = new java.util.HashSet();     // Catch: java.lang.Throwable -> L8
        this.VH = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        this.J0 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        this.Ws = new java.util.HashSet();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 136434864307249792L)
    private com.aide.engine.SyntaxError DW(java.util.List<com.aide.engine.SyntaxError> r9, int r10, int r11) {
    L13:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -7646178790261864345L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L18:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-7646178790261864345L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L13
    L5:
        java.util.Collections.sort(r9, new abcd.ak(this));     // Catch: java.lang.Throwable -> L13
        java.util.Collections.reverse(r9);     // Catch: java.lang.Throwable -> L13
        java.util.Iterator<com.aide.engine.SyntaxError> r0 = r9.iterator();     // Catch: java.lang.Throwable -> L13
    L6:
        if (r0.hasNext() == false) goto L11;
        com.aide.engine.SyntaxError r1 = r0.next();     // Catch: java.lang.Throwable -> L13
        if (j6(r10, r11, r1.v5, r1.Zo) <= 0) goto L6;
        return r1;
    L11:
        return null;
    }

    static void DW(abcd.ck r0) {
        r0.EQ();
    }

    static void DW(abcd.ck r0, java.lang.String r1) {
        r0.v5(r1);
    }

    @abcd.Interfacesu(method = 2248988157178380288L)
    private void DW(java.lang.String r8, java.util.Map<java.lang.String, java.util.List<com.aide.engine.SyntaxError>> r9) {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 2482708222448227455L, this, r8, r9);
    L19:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2482708222448227455L, this, r8, r9);     // Catch: java.lang.Throwable -> L14
    L5:
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.List<com.aide.engine.SyntaxError>>> r0 = r9.entrySet().iterator();     // Catch: java.lang.Throwable -> L14
    L6:
        if (r0.hasNext() == false) goto L13;
        java.util.Map.Entry<java.lang.String, java.util.List<com.aide.engine.SyntaxError>> r1 = r0.next();     // Catch: java.lang.Throwable -> L14
        java.lang.String r2 = r1.getKey();     // Catch: java.lang.Throwable -> L14
        java.util.Iterator<com.aide.engine.SyntaxError> r3 = r1.getValue().iterator();     // Catch: java.lang.Throwable -> L14
    L10:
        if (r3.hasNext() == false) goto L6;
        j6(r2, r3.next());     // Catch: java.lang.Throwable -> L14
        goto L10
    }

    @abcd.Interfacesu(method = -110175885192975771L)
    private void DW(java.lang.String r8, com.aide.engine.SyntaxError[] r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -447719187341546100L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-447719187341546100L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.U.j6(new abcd.RunnableZj(this, r8));     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 2135059312680162960L)
    private boolean DW(java.lang.String r8, com.aide.engine.SyntaxError r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1118051786422299505L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L14;
        abcd.wu.j6(-1118051786422299505L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
        return false;
    L14:
        return false;
    }

    @abcd.Interfacesu(method = -4545681042702756780L)
    private void EQ() {
    L48:
        th = move-exception;
        if (DW == false) goto L53;
        abcd.wu.j6(th, -2877600955492365927L, this);
    L53:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2877600955492365927L, this);     // Catch: java.lang.Throwable -> L48
    L6:
        java.lang.Object r2 = this.FH;     // Catch: java.lang.Throwable -> L48
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L48
        java.util.HashMap<java.lang.String, java.lang.Boolean> r3 = this.v5;     // Catch: java.lang.Throwable -> L45
        this.v5 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L45
        int r4 = 0;
        this.we = false;     // Catch: java.lang.Throwable -> L45
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L45
        java.util.HashSet r5 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L48
        java.util.Iterator<java.lang.String> r6 = this.VH.keySet().iterator();     // Catch: java.lang.Throwable -> L48
        int r7 = 0;
    L12:
        if (r6.hasNext() == false) goto L21;
        java.lang.String r8 = r6.next();     // Catch: java.lang.Throwable -> L48
        if (this.Zo.contains(r8) == false) goto L15;
        if (this.Hw.contains(r8) == false) goto L12;
        int r9 = j6(r8, this.VH.get(r8));     // Catch: java.lang.Throwable -> L48
        if (r9 == 0) goto L12;
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L48
        r7 = r7 + r9;     // Catch: java.lang.Throwable -> L48
        goto L12
    L15:
        r5.add(r8);     // Catch: java.lang.Throwable -> L48
        r3.put(r8, java.lang.Boolean.TRUE);     // Catch: java.lang.Throwable -> L48
        goto L12
    L21:
        java.util.Iterator r10 = r5.iterator();     // Catch: java.lang.Throwable -> L48
    L23:
        if (r10.hasNext() == false) goto L32;
        java.lang.String r11 = (java.lang.String) r10.next();     // Catch: java.lang.Throwable -> L48
        java.lang.Object r12 = this.FH;     // Catch: java.lang.Throwable -> L48
        monitor-enter(r12);     // Catch: java.lang.Throwable -> L48
        this.VH.remove(r11);     // Catch: java.lang.Throwable -> L29
        monitor-exit(r12);     // Catch: java.lang.Throwable -> L29
    L29:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L48
    L32:
        java.lang.Object r13 = this.FH;     // Catch: java.lang.Throwable -> L48
        monitor-enter(r13);     // Catch: java.lang.Throwable -> L48
        this.u7 = r4;     // Catch: java.lang.Throwable -> L42
        this.gn = r7;     // Catch: java.lang.Throwable -> L42
        monitor-exit(r13);     // Catch: java.lang.Throwable -> L42
        java.util.Iterator<java.lang.String> r14 = r3.keySet().iterator();     // Catch: java.lang.Throwable -> L48
    L38:
        if (r14.hasNext() == false) goto L40;
        r3.get(r14.next());     // Catch: java.lang.Throwable -> L48
        java.lang.Boolean r15 = java.lang.Boolean.TRUE;     // Catch: java.lang.Throwable -> L48
        goto L38
    L40:
        J8();     // Catch: java.lang.Throwable -> L48
        return;
    L42:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L48
    L45:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L48
    }

    static void FH(abcd.ck r0) {
        r0.J0();
    }

    static void FH(abcd.ck r0, java.lang.String r1) {
        r0.VH(r1);
    }

    @abcd.Interfacesu(method = -1087324494910622041L)
    private void J0() {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 566554583035412552L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(566554583035412552L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.Ws == null) goto L13;
        java.util.Iterator<abcd.ck.a> r2 = this.Ws.iterator();     // Catch: java.lang.Throwable -> L14
    L9:
        if (r2.hasNext() == false) goto L24;
        r2.next().j6();     // Catch: java.lang.Throwable -> L14
        goto L9
    L24:
        return;
    }

    @abcd.Interfacesu(method = 3730877025401246240L)
    private void J8() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2774130755386903011L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2774130755386903011L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.U.j6(new abcd.Runnable_j(this));     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -1062017327055049999L)
    private void VH(java.lang.String r5) {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -2009814508936443180L, this, r5);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2009814508936443180L, this, r5);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.Ws == null) goto L13;
        java.util.Iterator<abcd.ck.a> r2 = this.Ws.iterator();     // Catch: java.lang.Throwable -> L14
    L9:
        if (r2.hasNext() == false) goto L24;
        r2.next().j6(r5);     // Catch: java.lang.Throwable -> L14
        goto L9
    L24:
        return;
    }

    @abcd.Interfacesu(method = 2349120047632909600L)
    private void Zo(java.lang.String r6) {
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
            this = this;
            r0 = -2092456225757620949(0xe2f61a2623a9952b, double:-5.21329141866406E168)
            boolean r2 = abcd.ck.j6     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto Lc
            abcd.wu.j6(r0, r5, r6)     // Catch: java.lang.Throwable -> L29
        Lc:
            java.lang.Object r2 = r5.FH     // Catch: java.lang.Throwable -> L29
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L29
            java.util.HashMap<java.lang.String, java.lang.Boolean> r3 = r5.v5     // Catch: java.lang.Throwable -> L26
            boolean r3 = r3.containsKey(r6)     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L1e
            java.util.HashMap<java.lang.String, java.lang.Boolean> r3 = r5.v5     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L26
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L26
        L1e:
            int r3 = r5.EQ     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + 1
            r5.EQ = r3     // Catch: java.lang.Throwable -> L26
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r3     // Catch: java.lang.Throwable -> L29
        L29:
            r2 = move-exception
            boolean r3 = abcd.ck.DW
            if (r3 == 0) goto L31
            abcd.wu.j6(r2, r0, r5, r6)
        L31:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.ck.Zo(java.lang.String):void");
    }

    @abcd.Interfacesu(method = 4305779849087798432L)
    private int j6(int r10, int r11, int r12, int r13) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -2322235505769476189L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L17:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2322235505769476189L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L13
    L5:
        if (r10 >= r12) goto L8;
        return -1;
    L8:
        if (r10 <= r12) goto L12;
        return 1;
    L12:
        return r11 - r13;
    }

    static int j6(abcd.ck r0, int r1, int r2, int r3, int r4) {
        return r0.j6(r1, r2, r3, r4);
    }

    @abcd.Interfacesu(method = -3344265392795872195L)
    private int j6(java.lang.String r8, com.aide.engine.SyntaxError[] r9) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, 535546948916449756L, this, r8, r9);
    L24:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(535546948916449756L, this, r8, r9);     // Catch: java.lang.Throwable -> L19
    L5:
        int r0 = 0;
        if (r9 != null) goto L8;
        return 0;
    L8:
        int r1 = 0;
    L9:
        if (r0 >= r9.length) goto L18;
        com.aide.engine.SyntaxError r2 = r9[r0];     // Catch: java.lang.Throwable -> L19
        if (DW(r8, r2) == false) goto L15;
    L17:
        r0 = r0 + 1;
        goto L9
    L15:
        if (r2.Hw() == false) goto L17;
        r1 = r1 + 1;
        goto L17
    L18:
        return r1;
    }

    @abcd.Interfacesu(method = 40998764434044944L)
    private com.aide.engine.SyntaxError j6(java.util.List<com.aide.engine.SyntaxError> r9, int r10, int r11) {
    L13:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 3435483604778707965L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L18:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3435483604778707965L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L13
    L5:
        java.util.Collections.sort(r9, new abcd.bk(this));     // Catch: java.lang.Throwable -> L13
        java.util.Iterator<com.aide.engine.SyntaxError> r0 = r9.iterator();     // Catch: java.lang.Throwable -> L13
    L6:
        if (r0.hasNext() == false) goto L11;
        com.aide.engine.SyntaxError r1 = r0.next();     // Catch: java.lang.Throwable -> L13
        if (j6(r10, r11, r1.v5, r1.Zo) >= 0) goto L6;
        return r1;
    L11:
        return null;
    }

    static void j6(abcd.ck r0) {
        r0.we();
    }

    static void j6(abcd.ck r0, java.lang.String r1) {
        r0.Zo(r1);
    }

    static void j6(abcd.ck r0, java.lang.String r1, com.aide.engine.SyntaxError[] r2, boolean r3) {
        r0.j6(r1, r2, r3);
    }

    @abcd.Interfacesu(method = -268548208628683180L)
    private void j6(java.lang.String r8, com.aide.engine.SyntaxError r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 4333707487388497323L, this, r8, r9);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4333707487388497323L, this, r8, r9);     // Catch: java.lang.Throwable -> L10
    L5:
        this.J8++;     // Catch: java.lang.Throwable -> L10
        if (this.J0.containsKey(r8) == true) goto L8;
        this.J0.put(r8, new java.util.ArrayList());     // Catch: java.lang.Throwable -> L10
    L8:
        this.J0.get(r8).add(r9);     // Catch: java.lang.Throwable -> L10
    }

    @abcd.Interfacesu(method = 536427937631784828L)
    private void j6(java.lang.String r9, com.aide.engine.SyntaxError[] r10, boolean r11) {
    L38:
        th = move-exception;
        if (DW == false) goto L42;
        abcd.wu.j6(th, 330580316906410845L, this, r9, r10, new java.lang.Boolean(r11));
    L42:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(330580316906410845L, this, r9, r10, new java.lang.Boolean(r11));     // Catch: java.lang.Throwable -> L38
    L5:
        java.lang.Object r0 = this.FH;     // Catch: java.lang.Throwable -> L38
        monitor-enter(r0);     // Catch: java.lang.Throwable -> L38
        if (r11 == false) goto L21;
        this.Hw.add(r9);     // Catch: java.lang.Throwable -> L35
        com.aide.engine.SyntaxError[] r1 = this.VH.get(r9);     // Catch: java.lang.Throwable -> L35
        int r2 = j6(r9, r1);     // Catch: java.lang.Throwable -> L35
        int r3 = j6(r9, r10);     // Catch: java.lang.Throwable -> L35
        if (r2 == r3) goto L15;
        this.gn += r3 - r2;     // Catch: java.lang.Throwable -> L35
        if (r3 != 0) goto L13;
        this.u7--;     // Catch: java.lang.Throwable -> L35
    L23:
        if (r10.length != 0) goto L25;
        this.VH.remove(r9);     // Catch: java.lang.Throwable -> L35
    L27:
        if (this.v5.containsKey(r9) == false) goto L30;
        this.v5.remove(r9);     // Catch: java.lang.Throwable -> L35
    L30:
        if (this.tp >= this.EQ) goto L32;
        this.tp++;     // Catch: java.lang.Throwable -> L35
    L32:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L35
        this.Zo.add(r9);     // Catch: java.lang.Throwable -> L38
        DW(r9, r10);     // Catch: java.lang.Throwable -> L38
        return;
    L25:
        this.VH.put(r9, r10);     // Catch: java.lang.Throwable -> L35
        goto L27
    L13:
        if (r2 != 0) goto L23;
        this.u7++;     // Catch: java.lang.Throwable -> L35
        goto L23
    L15:
        if (r2 != 0) goto L23;
        if (r3 != 0) goto L23;
        if (r10.length != 0) goto L23;
        if (r1 == null) goto L23;
        int r4 = r1.length;     // Catch: java.lang.Throwable -> L35
        goto L23
    L21:
        this.Hw.remove(r9);     // Catch: java.lang.Throwable -> L35
    L35:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L38
    }

    @abcd.Interfacesu(method = -759150220404530248L)
    private void j6(java.util.HashSet<java.lang.String> r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 3774102222032663053L, this, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3774102222032663053L, this, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.Iterator<java.lang.String> r2 = r5.iterator();     // Catch: java.lang.Throwable -> L12
    L8:
        if (r2.hasNext() == false) goto L10;
        VH(r2.next());     // Catch: java.lang.Throwable -> L12
        goto L8
    L10:
        J0();     // Catch: java.lang.Throwable -> L12
    }

    @abcd.Interfacesu(method = 246996406631547440L)
    private boolean j6(int r8, int r9, int r10, int r11, int r12, int r13) {
        if (j6 == false) goto L5;
        abcd.wu.j6(437965806155014507L, this, new java.lang.Object[]{new java.lang.Integer(r8), new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13)});
    L5:
        if (r8 != r10) goto L12;
        if (r12 != r8) goto L10;
        if (r9 > r13) goto L10;
        if (r11 < r13) goto L10;
        return true;
    L10:
        return false;
    L12:
        if (r8 >= r12) goto L14;
        if (r10 <= r12) goto L14;
        return true;
    L14:
        if (r8 != r12) goto L16;
        if (r9 > r13) goto L16;
        return true;
    L16:
        if (r10 != r12) goto L19;
        if (r11 < r13) goto L19;
        return true;
    L19:
        return false;
    }

    @abcd.Interfacesu(method = -901301393838274005L)
    private boolean j6(int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23) {
        if (j6 == false) goto L7;
        abcd.wu.j6(-5494258034984205432L, this, new java.lang.Object[]{new java.lang.Integer(r16), new java.lang.Integer(r17), new java.lang.Integer(r18), new java.lang.Integer(r19), new java.lang.Integer(r20), new java.lang.Integer(r21), new java.lang.Integer(r22), new java.lang.Integer(r23)});
    L7:
        if (j6(r16, r17, r18, r19, r20, r21) == false) goto L9;
        return true;
    L9:
        if (j6(r16, r17, r18, r19, r22, r23) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @abcd.Interfacesu(method = -4619245317439229905L)
    private void v5(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1175817815983409920L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1175817815983409920L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Zo.add(r5);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 2314398242636878464L)
    private void we() {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, 907185713538071625L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(907185713538071625L, this);     // Catch: java.lang.Throwable -> L16
    L6:
        this.Zo.clear();     // Catch: java.lang.Throwable -> L16
        java.lang.Object r2 = this.FH;     // Catch: java.lang.Throwable -> L16
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L16
        this.we = true;     // Catch: java.lang.Throwable -> L13
        this.tp = 0;     // Catch: java.lang.Throwable -> L13
        this.EQ = 0;     // Catch: java.lang.Throwable -> L13
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L13
        J8();     // Catch: java.lang.Throwable -> L16
        return;
    L13:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L16
    }

    public android.util.Pair<abcd.Tl, com.aide.engine.SyntaxError> DW(java.lang.String r19, int r20, int r21) {
    L40:
        th = th;
        int r9 = r20;
    L42:
        int r10 = r21;
    L44:
        if (DW == false) goto L47;
        abcd.wu.j6(th, 3736361243502609953L, this, r19, new java.lang.Integer(r9), new java.lang.Integer(r10));
    L47:
        throw th;
    L4:
        if (j6 == false) goto L12;
        r9 = r20;
        r10 = r21;
        abcd.wu.j6(3736361243502609953L, this, r19, new java.lang.Integer(r9), new java.lang.Integer(r10));     // Catch: java.lang.Throwable -> L38
    L13:
        java.util.List<java.lang.String> r0 = Hw();     // Catch: java.lang.Throwable -> L38
        java.util.Collections.sort(r0);     // Catch: java.lang.Throwable -> L38
        int r1 = r0.size() - 1;     // Catch: java.lang.Throwable -> L38
    L15:
        if (r1 < 0) goto L23;
        java.lang.String r4 = r0.get(r1);     // Catch: java.lang.Throwable -> L38
        if (r4.equals(r19) == true) goto L23;
        if (r4.compareTo(r19) < 0) goto L21;
        r1 = r1 - 1;     // Catch: java.lang.Throwable -> L38
        goto L15
    L21:
        r9 = 1000000;
        r10 = 1000000;
    L23:
        int r5 = r1;
        boolean r6 = false;
    L24:
        if (r5 >= 0) goto L26;
        r5 = r0.size() - 1;     // Catch: java.lang.Throwable -> L38
    L26:
        java.lang.String r13 = r0.get(r5);     // Catch: java.lang.Throwable -> L38
        com.aide.engine.SyntaxError r11 = DW(DW(r13), r9, r10);     // Catch: java.lang.Throwable -> L38
        if (r11 != null) goto L28;
        r5 = r5 - 1;
        if (r6 == true) goto L32;
        if (r5 != r1) goto L36;
        r6 = true;
    L37:
        r9 = 1000000;
        r10 = 1000000;
        goto L24
    L36:
        r6 = false;
        goto L37
    L32:
        return null;
    L28:
        return new android.util.Pair(new abcd.Tl(r13, r11.v5, r11.Zo, r11.VH, r11.gn), r11);
    L38:
        th = th;
    L10:
        th = th;
        goto L42
    L12:
        r9 = r20;
        r10 = r21;
        goto L13
    }

    public com.aide.engine.SyntaxError DW(java.lang.String r17, int r18, int r19, int r20, int r21) {
    L26:
        th = move-exception;
        if (DW == false) goto L31;
        abcd.wu.j6(th, -1879109525606687755L, this, r17, new java.lang.Integer(r18), new java.lang.Integer(r19), new java.lang.Integer(r20), new java.lang.Integer(r21));
    L31:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1879109525606687755L, this, r17, new java.lang.Integer(r18), new java.lang.Integer(r19), new java.lang.Integer(r20), new java.lang.Integer(r21));     // Catch: java.lang.Throwable -> L26
    L6:
        com.aide.engine.SyntaxError r0 = null;
        java.util.Iterator<com.aide.engine.SyntaxError> r14 = FH(r17).iterator();     // Catch: java.lang.Throwable -> L26
    L8:
        if (r14.hasNext() == false) goto L15;
        com.aide.engine.SyntaxError r15 = r14.next();     // Catch: java.lang.Throwable -> L26
        if (j6(r15.v5, r15.Zo, r15.VH, r15.gn, r18, r19, r20, r21) == false) goto L8;
        if (r0 == null) goto L14;
        if (r0.tp != null) goto L8;
    L14:
        r0 = r15;
        goto L8
    L15:
        if (r0 != null) goto L25;
        java.util.Iterator<com.aide.engine.SyntaxError> r16 = FH(r17).iterator();     // Catch: java.lang.Throwable -> L26
    L17:
        if (r16.hasNext() == false) goto L25;
        com.aide.engine.SyntaxError r110 = r16.next();     // Catch: java.lang.Throwable -> L26
        if (j6(r110.v5, 1, r110.VH, Integer.MAX_VALUE, r18, 1, r20, Integer.MAX_VALUE) == false) goto L17;
        if (r0 == null) goto L24;
        if (r0.tp != null) goto L17;
    L24:
        r0 = r110;
    L25:
        return r0;
    }

    public java.util.List<com.aide.engine.SyntaxError> DW(java.lang.String r10) {
    L27:
        th = move-exception;
        if (DW == false) goto L32;
        abcd.wu.j6(th, -881587552857227175L, this, r10);
    L32:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-881587552857227175L, this, r10);     // Catch: java.lang.Throwable -> L27
    L6:
        java.lang.Object r2 = this.FH;     // Catch: java.lang.Throwable -> L27
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L27
        java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L24
        if (r10 != null) goto L11;
    L18:
        if (r10 != null) goto L20;
    L22:
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L24
        return r3;
    L20:
        if (this.J0.containsKey(r10) == false) goto L22;
        r3.addAll(this.J0.get(r10));     // Catch: java.lang.Throwable -> L24
        goto L22
    L11:
        if (this.VH.containsKey(r10) == false) goto L18;
        com.aide.engine.SyntaxError[] r4 = this.VH.get(r10);     // Catch: java.lang.Throwable -> L24
        int r5 = r4.length;     // Catch: java.lang.Throwable -> L24
        int r6 = 0;
    L13:
        if (r6 >= r5) goto L18;
        com.aide.engine.SyntaxError r7 = r4[r6];     // Catch: java.lang.Throwable -> L24
        if (r7.Hw() == false) goto L17;
        r3.add(r7);     // Catch: java.lang.Throwable -> L24
    L17:
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L24
    L24:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L27
    }

    public void DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4510870918669962599L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4510870918669962599L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        java.util.HashSet<java.lang.String> r2 = new java.util.HashSet(this.J0.keySet());     // Catch: java.lang.Throwable -> L8
        this.J0.clear();     // Catch: java.lang.Throwable -> L8
        this.J8 = 0;     // Catch: java.lang.Throwable -> L8
        j6(r2);     // Catch: java.lang.Throwable -> L8
    }

    public void DW(abcd.ck.a r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 630563308902908004L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(630563308902908004L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Ws.remove(r5);     // Catch: java.lang.Throwable -> L8
    }

    public int FH() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -4828112959657813067L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4828112959657813067L, this);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.Object r2 = this.FH;     // Catch: java.lang.Throwable -> L14
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L14
        int r3 = this.gn + this.J8;     // Catch: java.lang.Throwable -> L11
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L11
        return r3;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    public java.util.List<com.aide.engine.SyntaxError> FH(java.lang.String r10) {
    L29:
        th = move-exception;
        if (DW == false) goto L34;
        abcd.wu.j6(th, 2348559977434942899L, this, r10);
    L34:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2348559977434942899L, this, r10);     // Catch: java.lang.Throwable -> L29
    L6:
        java.lang.Object r2 = this.FH;     // Catch: java.lang.Throwable -> L29
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L29
        java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L26
        if (r10 != null) goto L11;
    L20:
        if (r10 != null) goto L22;
    L24:
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L26
        return r3;
    L22:
        if (this.J0.containsKey(r10) == false) goto L24;
        r3.addAll(this.J0.get(r10));     // Catch: java.lang.Throwable -> L26
        goto L24
    L11:
        if (this.VH.containsKey(r10) == false) goto L20;
        com.aide.engine.SyntaxError[] r4 = this.VH.get(r10);     // Catch: java.lang.Throwable -> L26
        int r5 = r4.length;     // Catch: java.lang.Throwable -> L26
        int r6 = 0;
    L13:
        if (r6 >= r5) goto L20;
        com.aide.engine.SyntaxError r7 = r4[r6];     // Catch: java.lang.Throwable -> L26
        if (r7.Hw() == false) goto L17;
    L18:
        r3.add(r7);     // Catch: java.lang.Throwable -> L26
    L19:
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L26
        goto L13
    L17:
        if (r7.Zo() == false) goto L19;
    L26:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L29
    }

    public java.util.List<java.lang.String> Hw() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 474246063975623980L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(474246063975623980L, this);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.Object r2 = this.FH;     // Catch: java.lang.Throwable -> L14
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L14
        java.util.HashSet r3 = new java.util.HashSet(this.VH.keySet());     // Catch: java.lang.Throwable -> L11
        r3.addAll(this.J0.keySet());     // Catch: java.lang.Throwable -> L11
        java.util.ArrayList r4 = new java.util.ArrayList(r3);     // Catch: java.lang.Throwable -> L11
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L11
        return r4;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    public java.util.List<com.aide.engine.SyntaxError> Hw(java.lang.String r10) {
    L31:
        th = move-exception;
        if (DW == false) goto L36;
        abcd.wu.j6(th, 1044523065692054204L, this, r10);
    L36:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1044523065692054204L, this, r10);     // Catch: java.lang.Throwable -> L31
    L6:
        java.lang.Object r2 = this.FH;     // Catch: java.lang.Throwable -> L31
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L31
        java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L28
        if (r10 != null) goto L11;
    L22:
        if (r10 != null) goto L24;
    L26:
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L28
        return r3;
    L24:
        if (this.J0.containsKey(r10) == false) goto L26;
        r3.addAll(this.J0.get(r10));     // Catch: java.lang.Throwable -> L28
        goto L26
    L11:
        if (this.VH.containsKey(r10) == false) goto L22;
        com.aide.engine.SyntaxError[] r4 = this.VH.get(r10);     // Catch: java.lang.Throwable -> L28
        int r5 = r4.length;     // Catch: java.lang.Throwable -> L28
        int r6 = 0;
    L13:
        if (r6 >= r5) goto L22;
        com.aide.engine.SyntaxError r7 = r4[r6];     // Catch: java.lang.Throwable -> L28
        if (r7.Hw() == false) goto L17;
    L20:
        r3.add(r7);     // Catch: java.lang.Throwable -> L28
    L21:
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L28
        goto L13
    L17:
        if (r7.Zo() == true) goto L20;
        if (r7.FH() == false) goto L21;
    L28:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L31
    }

    public int VH() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -1551024376683851103L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1551024376683851103L, this);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.Object r2 = this.FH;     // Catch: java.lang.Throwable -> L14
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L14
        int r3 = this.EQ;     // Catch: java.lang.Throwable -> L11
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L11
        return r3;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    public int Zo() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -2240174328558790900L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2240174328558790900L, this);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.Object r2 = this.FH;     // Catch: java.lang.Throwable -> L14
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L14
        int r3 = this.tp;     // Catch: java.lang.Throwable -> L11
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L11
        return r3;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    public void gn() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2674153954221393960L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2674153954221393960L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.U.EQ().j6(new abcd.BinderYj(this));     // Catch: java.lang.Throwable -> L8
    }

    public android.util.Pair<abcd.Tl, com.aide.engine.SyntaxError> j6(java.lang.String r18, int r19, int r20) {
    L41:
        th = th;
        int r9 = r19;
    L43:
        int r10 = r20;
    L45:
        if (DW == false) goto L48;
        java.lang.Throwable r1 = th;
        abcd.wu.j6(r1, 1800493986015936211L, this, r18, new java.lang.Integer(r9), new java.lang.Integer(r10));
    L48:
        throw th;
    L4:
        if (j6 == false) goto L12;
        r9 = r19;
        java.lang.Integer r5 = new java.lang.Integer(r9);     // Catch: java.lang.Throwable -> L10
        r10 = r20;
        abcd.wu.j6(1800493986015936211L, this, r18, r5, new java.lang.Integer(r10));     // Catch: java.lang.Throwable -> L39
    L13:
        java.util.List<java.lang.String> r0 = Hw();     // Catch: java.lang.Throwable -> L39
        java.util.Collections.sort(r0);     // Catch: java.lang.Throwable -> L39
        int r2 = 0;
    L15:
        if (r2 >= r0.size()) goto L23;
        java.lang.String r3 = r0.get(r2);     // Catch: java.lang.Throwable -> L39
        if (r3.equals(r18) == true) goto L23;
        if (r3.compareTo(r18) > 0) goto L21;
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L39
        goto L15
    L21:
        r9 = 1;
        r10 = 1;
    L23:
        int r4 = r2;
        boolean r6 = false;
    L25:
        if (r4 < r0.size()) goto L27;
        r4 = 0;
    L27:
        java.lang.String r12 = r0.get(r4);     // Catch: java.lang.Throwable -> L39
        com.aide.engine.SyntaxError r7 = j6(DW(r12), r9, r10);     // Catch: java.lang.Throwable -> L39
        if (r7 != null) goto L29;
        r4 = r4 + 1;
        if (r6 == true) goto L33;
        if (r4 != r2) goto L37;
        r6 = true;
    L38:
        r9 = 1;
        r10 = 1;
        goto L25
    L37:
        r6 = false;
        goto L38
    L33:
        return null;
    L29:
        return new android.util.Pair(new abcd.Tl(r12, r7.v5, r7.Zo, r7.VH, r7.gn), r7);
    L39:
        th = th;
    L10:
        th = th;
        goto L43
    L12:
        r9 = r19;
        r10 = r20;
        goto L13
    }

    public com.aide.engine.SyntaxError j6(java.lang.String r17, int r18, int r19, int r20, int r21) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -567704102018040L, this, r17, new java.lang.Integer(r18), new java.lang.Integer(r19), new java.lang.Integer(r20), new java.lang.Integer(r21));
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-567704102018040L, this, r17, new java.lang.Integer(r18), new java.lang.Integer(r19), new java.lang.Integer(r20), new java.lang.Integer(r21));     // Catch: java.lang.Throwable -> L16
    L6:
        com.aide.engine.SyntaxError r0 = null;
        java.util.Iterator<com.aide.engine.SyntaxError> r14 = FH(r17).iterator();     // Catch: java.lang.Throwable -> L16
    L7:
        if (r14.hasNext() == false) goto L15;
        com.aide.engine.SyntaxError r15 = r14.next();     // Catch: java.lang.Throwable -> L16
        if (j6(r15.v5, r15.Zo, r15.VH, r15.gn, r18, r19, r20, r21) == false) goto L7;
        if (r0 == null) goto L14;
        if (r0.tp != null) goto L7;
    L14:
        r0 = r15;
        goto L7
    L15:
        return r0;
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -691422872440070927L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-691422872440070927L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        DW();     // Catch: java.lang.Throwable -> L8
        this.Hw.clear();     // Catch: java.lang.Throwable -> L8
        this.v5.clear();     // Catch: java.lang.Throwable -> L8
        this.Zo.clear();     // Catch: java.lang.Throwable -> L8
        this.VH.clear();     // Catch: java.lang.Throwable -> L8
        this.gn = 0;     // Catch: java.lang.Throwable -> L8
        this.u7 = 0;     // Catch: java.lang.Throwable -> L8
        J8();     // Catch: java.lang.Throwable -> L8
    }

    public void j6(abcd.ck.a r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -386385262987750513L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-386385262987750513L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Ws.add(r5);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(com.aide.engine.SyntaxError r6) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -3789978626481871455L, this, r6);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3789978626481871455L, this, r6);     // Catch: java.lang.Throwable -> L11
    L6:
        android.view.View r2 = android.view.LayoutInflater.from(com.aide.ui.U.Zo()).inflate(com.almlkaide.kaypro.R.layout.error_popup, null);     // Catch: java.lang.Throwable -> L11
        ((android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.errorPopupText)).setText(r6.j6());     // Catch: java.lang.Throwable -> L11
        if (this.QX == null) goto L9;
        this.QX.cancel();     // Catch: java.lang.Throwable -> L11
    L9:
        this.QX = new android.widget.Toast(com.aide.ui.U.Zo());     // Catch: java.lang.Throwable -> L11
        this.QX.setDuration(0);     // Catch: java.lang.Throwable -> L11
        this.QX.setView(r2);     // Catch: java.lang.Throwable -> L11
        this.QX.show();     // Catch: java.lang.Throwable -> L11
    }

    public void j6(java.lang.String r8, java.util.Map<java.lang.String, java.util.List<com.aide.engine.SyntaxError>> r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -3958357429281665280L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3958357429281665280L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        DW(r8, r9);     // Catch: java.lang.Throwable -> L7
        java.util.HashSet<java.lang.String> r0 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L7
        r0.addAll(this.J0.keySet());     // Catch: java.lang.Throwable -> L7
        j6(r0);     // Catch: java.lang.Throwable -> L7
    }

    public boolean j6(java.lang.String r8) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -4441585724885288L, this, r8);
    L24:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4441585724885288L, this, r8);     // Catch: java.lang.Throwable -> L19
    L6:
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.aide.engine.SyntaxError[]>> r2 = this.VH.entrySet().iterator();     // Catch: java.lang.Throwable -> L19
    L7:
        int r4 = 0;
        if (r2.hasNext() == false) goto L18;
        java.util.Map.Entry<java.lang.String, com.aide.engine.SyntaxError[]> r3 = r2.next();     // Catch: java.lang.Throwable -> L19
        if (r3.getKey().endsWith(r8) == false) goto L7;
        com.aide.engine.SyntaxError[] r5 = r3.getValue();     // Catch: java.lang.Throwable -> L19
        int r6 = r5.length;     // Catch: java.lang.Throwable -> L19
    L12:
        if (r4 >= r6) goto L7;
        if (r5[r4].Hw() == true) goto L15;
        r4 = r4 + 1;
        goto L12
    L15:
        return true;
    L18:
        return false;
    }

    public void tp() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 395281164242289600L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(395281164242289600L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Ws = null;     // Catch: java.lang.Throwable -> L8
    }

    public boolean u7() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -1939687651977980256L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1939687651977980256L, this);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.Object r2 = this.FH;     // Catch: java.lang.Throwable -> L14
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L14
        boolean r3 = this.we;     // Catch: java.lang.Throwable -> L11
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L11
        return r3;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    public java.util.List<java.lang.String> v5() {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -3024841889717324195L, this);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3024841889717324195L, this);     // Catch: java.lang.Throwable -> L18
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L18
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.aide.engine.SyntaxError[]>> r3 = this.VH.entrySet().iterator();     // Catch: java.lang.Throwable -> L18
    L7:
        if (r3.hasNext() == false) goto L17;
        java.util.Map.Entry<java.lang.String, com.aide.engine.SyntaxError[]> r4 = r3.next();     // Catch: java.lang.Throwable -> L18
        if (r4.getKey().endsWith(".java") == false) goto L7;
        com.aide.engine.SyntaxError[] r5 = r4.getValue();     // Catch: java.lang.Throwable -> L18
        int r6 = r5.length;     // Catch: java.lang.Throwable -> L18
        int r7 = 0;
    L12:
        if (r7 >= r6) goto L7;
        com.aide.engine.SyntaxError r8 = r5[r7];     // Catch: java.lang.Throwable -> L18
        if (r8.v5() == false) goto L16;
        r2.add(r8.DW());     // Catch: java.lang.Throwable -> L18
    L16:
        r7 = r7 + 1;
        goto L12
    L17:
        return r2;
    }
}
