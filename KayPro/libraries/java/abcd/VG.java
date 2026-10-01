package abcd;

class VG extends java.io.OutputStream {
    private final java.io.OutputStream DW;
    final abcd.WG j6;

    VG(abcd.WG r1, java.io.OutputStream r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public void close() {
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
            abcd.WG r0 = r2.j6     // Catch: java.lang.Error -> L22 java.lang.RuntimeException -> L29 java.io.IOException -> L30
            boolean r0 = abcd.WG.j6(r0)     // Catch: java.lang.Error -> L22 java.lang.RuntimeException -> L29 java.io.IOException -> L30
            if (r0 == 0) goto L16
            abcd.WG r0 = r2.j6     // Catch: java.lang.Error -> L22 java.lang.RuntimeException -> L29 java.io.IOException -> L30
            java.io.FileOutputStream r0 = abcd.WG.DW(r0)     // Catch: java.lang.Error -> L22 java.lang.RuntimeException -> L29 java.io.IOException -> L30
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.lang.Error -> L22 java.lang.RuntimeException -> L29 java.io.IOException -> L30
            r1 = 1
            r0.force(r1)     // Catch: java.lang.Error -> L22 java.lang.RuntimeException -> L29 java.io.IOException -> L30
        L16:
            java.io.OutputStream r0 = r2.DW     // Catch: java.lang.Error -> L22 java.lang.RuntimeException -> L29 java.io.IOException -> L30
            r0.close()     // Catch: java.lang.Error -> L22 java.lang.RuntimeException -> L29 java.io.IOException -> L30
            abcd.WG r0 = r2.j6     // Catch: java.lang.Error -> L22 java.lang.RuntimeException -> L29 java.io.IOException -> L30
            r1 = 0
            abcd.WG.j6(r0, r1)     // Catch: java.lang.Error -> L22 java.lang.RuntimeException -> L29 java.io.IOException -> L30
            return
        L22:
            r0 = move-exception
            abcd.WG r1 = r2.j6
            r1.v5()
            throw r0
        L29:
            r0 = move-exception
            abcd.WG r1 = r2.j6
            r1.v5()
            throw r0
        L30:
            r0 = move-exception
            abcd.WG r1 = r2.j6
            r1.v5()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.VG.close():void");
    }

    @Override
    public void write(int r2) {
        this.DW.write(r2);
    }

    @Override
    public void write(byte[] r2) {
        this.DW.write(r2);
    }

    @Override
    public void write(byte[] r2, int r3, int r4) {
        this.DW.write(r2, r3, r4);
    }
}
