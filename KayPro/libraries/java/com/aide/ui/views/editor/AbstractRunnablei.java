package com.aide.ui.views.editor;

@abcd.Interfacexu
public abstract class AbstractRunnablei implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 3537216238390021900L)
    private boolean FH;

    @abcd.Interfaceru(field = -1757180693260834345L)
    private android.os.Handler Hw;

    @abcd.Interfaceru(field = 1673673698298780416L)
    private long v5;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.AbstractRunnablei.class, -1571460219253971400L, -1571460219253971400L);
    }

    public AbstractRunnablei() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4801445650845441675L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4801445650845441675L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this(0);     // Catch: java.lang.Throwable -> L8
    }

    public AbstractRunnablei(long r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5937304788005794736L, null, new java.lang.Long(r6));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5937304788005794736L, null, new java.lang.Long(r6));     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = new android.os.Handler();     // Catch: java.lang.Throwable -> L8
        this.v5 = r6;     // Catch: java.lang.Throwable -> L8
    }

    public synchronized void DW() {
        monitor-enter(this);
    L20:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -3700683644491600431L, this);     // Catch: java.lang.Throwable -> L18
    L24:
        throw th;     // Catch: java.lang.Throwable -> L18
    L5:
        if (j6 == false) goto L8;
        abcd.wu.j6(-3700683644491600431L, this);     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L20
    L8:
        if (this.FH == false) goto L12;
        monitor-exit(this);
        return;
    L12:
        this.FH = true;     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L20
        if (this.v5 != 0) goto L15;
        this.Hw.post(this);     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L20
    L16:
        monitor-exit(this);
        return;
    L15:
        this.Hw.postDelayed(this, this.v5);     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L20
    L18:
        th = move-exception;
        throw th;
    }

    public abstract void FH();

    public synchronized boolean j6() {
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
            monitor-enter(r4)
            r0 = 201566105637348565(0x2cc1b4e1d45e4d5, double:3.4381396509445665E-295)
            boolean r2 = com.aide.ui.views.editor.AbstractRunnablei.j6     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
            if (r2 == 0) goto Ld
            abcd.wu.j6(r0, r4)     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
        Ld:
            boolean r0 = r4.FH     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
            monitor-exit(r4)
            return r0
        L11:
            r0 = move-exception
            goto L1c
        L13:
            r2 = move-exception
            boolean r3 = com.aide.ui.views.editor.AbstractRunnablei.DW     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L1b
            abcd.wu.j6(r2, r0, r4)     // Catch: java.lang.Throwable -> L11
        L1b:
            throw r2     // Catch: java.lang.Throwable -> L11
        L1c:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.ui.views.editor.AbstractRunnablei.j6():boolean");
    }

    @Override
    public void run() {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -1777009534518923305L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1777009534518923305L, this);     // Catch: java.lang.Throwable -> L15
    L6:
        monitor-enter(this);     // Catch: java.lang.Throwable -> L15
        this.FH = false;     // Catch: java.lang.Throwable -> L12
        monitor-exit(this);     // Catch: java.lang.Throwable -> L12
        FH();     // Catch: java.lang.Throwable -> L15
        return;
    L12:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L15
    }
}
