package abcd;

@abcd.Interfacexu
class Runnablezk implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.yk.h FH;

    static {
        abcd.wu.j6(abcd.Runnablezk.class, 5034156381188612424L, 6639050920770608457L);
    }

    Runnablezk(abcd.yk.h r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 1859870921687461045L)
    public void run() {
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
            r0 = 1653122031737615703
            boolean r2 = abcd.Runnablezk.j6     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto Lc
            abcd.wu.j6(r0, r6)     // Catch: java.lang.Throwable -> L60
        Lc:
            abcd.yk$h r2 = r6.FH     // Catch: java.lang.Throwable -> L60
            java.lang.Object r2 = abcd.yk.h.j6(r2)     // Catch: java.lang.Throwable -> L60
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L60
            abcd.yk$h r3 = r6.FH     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            java.lang.Object r3 = abcd.yk.h.j6(r3)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            r4 = 600000
            r3.wait(r4)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L22
            goto L22
        L20:
            r3 = move-exception
            goto L5e
        L22:
            abcd.yk$h r3 = r6.FH     // Catch: java.lang.Throwable -> L20
            boolean r3 = abcd.yk.h.DW(r3)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L2c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            return
        L2c:
            abcd.yk$h r3 = r6.FH     // Catch: java.lang.Throwable -> L20
            org.json.JSONObject r3 = abcd.yk.h.FH(r3)     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L36
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            goto Lc
        L36:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L20 org.json.JSONException -> L58
            abcd.yk$h r4 = r6.FH     // Catch: java.lang.Throwable -> L20 org.json.JSONException -> L58
            org.json.JSONObject r4 = abcd.yk.h.FH(r4)     // Catch: java.lang.Throwable -> L20 org.json.JSONException -> L58
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L20 org.json.JSONException -> L58
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20 org.json.JSONException -> L58
            abcd.yk$h r4 = r6.FH     // Catch: java.lang.Throwable -> L20
            boolean r4 = abcd.yk.h.Hw(r4)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = abcd.yk.h.j6(r3, r4)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L60
            if (r2 == 0) goto Lc
            return
        L53:
            r2 = move-exception
            com.aide.common.ClassH.DW(r2)     // Catch: java.lang.Throwable -> L60
            goto Lc
        L58:
            r3 = move-exception
            com.aide.common.ClassH.DW(r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            goto Lc
        L5e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r3     // Catch: java.lang.Throwable -> L60
        L60:
            r2 = move-exception
            boolean r3 = abcd.Runnablezk.DW
            if (r3 == 0) goto L68
            abcd.wu.j6(r2, r0, r6)
        L68:
            goto L6a
        L69:
            throw r2
        L6a:
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.Runnablezk.run():void");
    }
}
