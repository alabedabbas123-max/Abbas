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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -4801445650845441675L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-4801445650845441675L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this(0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public AbstractRunnablei(long r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 5937304788005794736L, null, new java.lang.Long(r6));
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(5937304788005794736L, null, new java.lang.Long(r6));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.Hw = new android.os.Handler();
                        this.v5 = r6;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public synchronized void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    monitor-enter(this);
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 24; continue $sw2; }
                    try {
                        abcd.wu.j6(th, -3700683644491600431L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 18; continue $sw2;
                    }
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 18; continue $sw2;
                    }
                }
                case 5: {
                    if (j6 == false) { $pc2 = 8; continue $sw2; }
                    try {
                        abcd.wu.j6(-3700683644491600431L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 20; continue $sw2; }
                        $pc2 = 18; continue $sw2;
                    }
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    if (this.FH == false) { $pc2 = 12; continue $sw2; }
                    monitor-exit(this);
                    return;
                }
                case 12: {
                    try {
                        this.FH = true;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 20; continue $sw2; }
                        $pc2 = 18; continue $sw2;
                    }
                    if (this.v5 != 0) { $pc2 = 15; continue $sw2; }
                    try {
                        this.Hw.post(this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 20; continue $sw2; }
                        $pc2 = 18; continue $sw2;
                    }
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    monitor-exit(this);
                    return;
                }
                case 15: {
                    try {
                        this.Hw.postDelayed(this, this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Throwable) { $pc2 = 20; continue $sw2; }
                        $pc2 = 18; continue $sw2;
                    }
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    th = $ex2;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
            r0 = 201566105637348565
            boolean r2 = com.aide.ui.views.editor.AbstractRunnablei.j6     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
            if (r2 == 0) goto Ld
            abcd.wu.j6(r0, r4)     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
        Ld:
            boolean r0 = r4.FH     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
            monitor-exit(r4)
            return r0
        L11:
            r0 = move-exception;
            goto L1c
        L13:
            r2 = move-exception;
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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 15: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 19; continue $sw3; }
                    abcd.wu.j6(th, -1777009534518923305L, this);
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-1777009534518923305L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 15; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        monitor-enter(this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 15; continue $sw3;
                    }
                    try {
                        this.FH = false;
                        monitor-exit(this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 12; continue $sw3;
                    }
                    try {
                        FH();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 15; continue $sw3;
                    }
                    return;
                }
                case 12: {
                    th = $ex3;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 15; continue $sw3;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
