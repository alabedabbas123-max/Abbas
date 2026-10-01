package abcd;

@abcd.Interfacexu
public class Ol {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2693602259610103341L)
    private int EQ;

    @abcd.Interfaceru(field = -3398941837127793152L)
    private java.lang.String[] FH;

    @abcd.Interfaceru(field = 2102366761741371545L)
    private java.util.Map<java.lang.String, java.lang.String> Hw;

    @abcd.Interfaceru(field = 3813042126725828867L)
    private java.io.InputStream J0;

    @abcd.Interfaceru(field = 3807907387294438264L)
    private java.io.InputStream J8;

    @abcd.Interfaceru(field = 3659560740905938544L)
    private java.io.File QX;

    @abcd.Interfaceru(field = -2544882255373434327L)
    private java.lang.Object VH;

    @abcd.Interfaceru(field = 3099757286347884348L)
    private abcd.Ol.a.C0003a Ws;

    @abcd.Interfaceru(field = 222346186673031072L)
    private boolean XL;

    @abcd.Interfaceru(field = 2102827008898223361L)
    private java.io.OutputStream Zo;

    @abcd.Interfaceru(field = 386087446644809556L)
    private boolean gn;

    @abcd.Interfaceru(field = 3284655062178565621L)
    private boolean tp;

    @abcd.Interfaceru(field = 4381688251359547947L)
    private int u7;

    @abcd.Interfaceru(field = 2107521290881278608L)
    private java.io.OutputStream v5;

    @abcd.Interfaceru(field = -313308225846080335L)
    private java.lang.Process we;

    @abcd.Interfacexu
    private class a extends java.lang.Thread {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacevu
        final abcd.Ol EQ;

        @abcd.Interfaceru(field = -1859497432553362016L)
        private abcd.Ol.a.C0003a FH;

        @abcd.Interfaceru(field = 606513933204623205L)
        private byte[] Hw;

        @abcd.Interfaceru(field = 574186784794800008L)
        private java.lang.Object VH;

        @abcd.Interfaceru(field = 1350026703805630699L)
        private int Zo;

        @abcd.Interfaceru(field = 1903633384320164112L)
        private java.io.OutputStream gn;

        @abcd.Interfaceru(field = 827342162842641501L)
        private boolean tp;

        @abcd.Interfaceru(field = 5159130034577110185L)
        private boolean u7;

        @abcd.Interfaceru(field = 505511047423624608L)
        private int v5;

        @abcd.Interfacexu
        private class C0003a extends java.io.OutputStream {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;
            final abcd.Ol.a FH;

            static {
                abcd.wu.j6(abcd.Ol.a.C0003a.class, -120385612213338735L, -120385612213338735L);
            }

            @abcd.Interfacesu(method = -539965008360063L)
            private C0003a(abcd.Ol.a r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -2249792973933113115L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-2249792973933113115L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            C0003a(abcd.Ol.a r8, abcd.Ll r9) {
            L7:
                th = move-exception;
                if (DW == false) goto L11;
                abcd.wu.j6(th, 439596837509699520L, null, r8, r9);
            L11:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(439596837509699520L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
            L5:
                this(r8);     // Catch: java.lang.Throwable -> L7
            }

            @Override
            @abcd.Interfacesu(method = 1785609361768822400L)
            public void close() {
            L14:
                th = move-exception;
                if (DW == false) goto L18;
                abcd.wu.j6(th, -1017336750159200128L, this);
            L18:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-1017336750159200128L, this);     // Catch: java.lang.Throwable -> L14
            L6:
                java.lang.Object r2 = abcd.Ol.a.j6(this.FH);     // Catch: java.lang.Throwable -> L14
                monitor-enter(r2);     // Catch: java.lang.Throwable -> L14
                abcd.Ol.a.j6(this.FH, true);     // Catch: java.lang.Throwable -> L11
                abcd.Ol.a.j6(this.FH).notify();     // Catch: java.lang.Throwable -> L11
                monitor-exit(r2);     // Catch: java.lang.Throwable -> L11
                return;
            L11:
                th = move-exception;
                throw th;     // Catch: java.lang.Throwable -> L14
            }

            @abcd.Interfacesu(method = -1379161298007902956L)
            public void j6() {
            L10:
                th = move-exception;
                if (DW == false) goto L14;
                abcd.wu.j6(th, 1382046774319839320L, this);
            L14:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(1382046774319839320L, this);     // Catch: java.lang.Throwable -> L10
            L6:
                this.FH.interrupt();     // Catch: java.lang.Throwable -> L10
                if (abcd.Ol.a.Zo(this.FH) == null) goto L17;
                abcd.Ol.a.Zo(this.FH).close();     // Catch: java.lang.Throwable -> L10
                return;
            }

            @Override
            @abcd.Interfacesu(method = 412015246771918532L)
            public void write(int r10) {
            L21:
                th = move-exception;
                if (DW == false) goto L25;
                abcd.wu.j6(th, 97712062145361960L, this, new java.lang.Integer(r10));
            L25:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(97712062145361960L, this, r10);     // Catch: java.lang.Throwable -> L21
            L6:
                java.lang.Object r2 = abcd.Ol.a.j6(this.FH);     // Catch: java.lang.Throwable -> L21
                monitor-enter(r2);     // Catch: java.lang.Throwable -> L21
            L18:
                th = move-exception;
                throw th;     // Catch: java.lang.Throwable -> L21
            L9:
                if (abcd.Ol.a.DW(this.FH) == true) goto L17;
                abcd.Ol.a.FH(this.FH)[abcd.Ol.a.Hw(this.FH)] = (byte) r10;     // Catch: java.lang.Throwable -> L18
                abcd.Ol.a.j6(this.FH, (abcd.Ol.a.Hw(this.FH) + 1) % abcd.Ol.a.FH(this.FH).length);     // Catch: java.lang.Throwable -> L18
                if (abcd.Ol.a.Hw(this.FH) != abcd.Ol.a.v5(this.FH)) goto L13;
                byte[] r3 = new byte[abcd.Ol.a.FH(this.FH).length * 2];     // Catch: java.lang.Throwable -> L18
                java.lang.System.arraycopy(abcd.Ol.a.FH(this.FH), abcd.Ol.a.v5(this.FH), r3, abcd.Ol.a.v5(this.FH), abcd.Ol.a.FH(this.FH).length - abcd.Ol.a.v5(this.FH));     // Catch: java.lang.Throwable -> L18
                java.lang.System.arraycopy(abcd.Ol.a.FH(this.FH), 0, r3, abcd.Ol.a.FH(this.FH).length, abcd.Ol.a.v5(this.FH));     // Catch: java.lang.Throwable -> L18
                abcd.Ol.a.j6(this.FH, abcd.Ol.a.FH(this.FH).length + abcd.Ol.a.v5(this.FH));     // Catch: java.lang.Throwable -> L18
                abcd.Ol.a.j6(this.FH, r3);     // Catch: java.lang.Throwable -> L18
            L13:
                abcd.Ol.a.j6(this.FH).notify();     // Catch: java.lang.Throwable -> L18
                monitor-exit(r2);     // Catch: java.lang.Throwable -> L18
                return;
            L17:
                throw new java.io.InterruptedIOException();     // Catch: java.lang.Throwable -> L18
            }
        }

        static {
            abcd.wu.j6(abcd.Ol.a.class, -1858495198310079361L, -1858495198310079361L);
        }

        @abcd.Interfacesu(method = 7536405745359386856L)
        public a(abcd.Ol r8, java.io.OutputStream r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 2580602789179259600L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(2580602789179259600L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.EQ = r8;     // Catch: java.lang.Throwable -> L7
            super("Process In [" + abcd.Ol.DW(r8)[0] + "]");     // Catch: java.lang.Throwable -> L7
            this.FH = new abcd.Ol.a.C0003a(this, null);     // Catch: java.lang.Throwable -> L7
            this.Hw = new byte[256];     // Catch: java.lang.Throwable -> L7
            this.VH = new java.lang.Object();     // Catch: java.lang.Throwable -> L7
            this.gn = r9;     // Catch: java.lang.Throwable -> L7
        }

        static boolean DW(abcd.Ol.a r0) {
            return r0.u7;
        }

        static byte[] FH(abcd.Ol.a r0) {
            return r0.Hw;
        }

        static int Hw(abcd.Ol.a r0) {
            return r0.v5;
        }

        static java.io.OutputStream Zo(abcd.Ol.a r0) {
            return r0.gn;
        }

        static int j6(abcd.Ol.a r0, int r1) {
            r0.v5 = r1;
            return r1;
        }

        static java.lang.Object j6(abcd.Ol.a r0) {
            return r0.VH;
        }

        static boolean j6(abcd.Ol.a r0, boolean r1) {
            r0.tp = r1;
            return r1;
        }

        static byte[] j6(abcd.Ol.a r0, byte[] r1) {
            r0.Hw = r1;
            return r1;
        }

        static int v5(abcd.Ol.a r0) {
            return r0.Zo;
        }

        @abcd.Interfacesu(method = -1358089233514371984L)
        public abcd.Ol.a.C0003a j6() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 2143137353993166375L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(2143137353993166375L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.FH;
        }

        @Override
        @abcd.Interfacesu(method = -2382024219810695635L)
        public void run() {
        L47:
            th = move-exception;
            if (DW == false) goto L52;
            abcd.wu.j6(th, -369431592813650448L, this);
        L52:
            throw th;
        L4:
            if (j6 == false) goto L57;
            abcd.wu.j6(-369431592813650448L, this);     // Catch: java.lang.Throwable -> L47
        L57:
            if (isInterrupted() == true) goto L39;
            java.lang.Object r3 = this.VH;     // Catch: java.lang.Throwable -> L54
            monitor-enter(r3);     // Catch: java.lang.Throwable -> L54
            if (this.v5 == this.Zo) goto L14;
        L16:
            boolean r6 = false;
            if (this.v5 != this.Zo) goto L18;
            if (this.tp == true) goto L24;
            monitor-exit(r3);     // Catch: java.lang.Throwable -> L36
            goto L57
        L24:
            byte r4 = 0;
            boolean r5 = false;
            r6 = true;
        L25:
            monitor-exit(r3);     // Catch: java.lang.Throwable -> L36
            if (this.gn == null) goto L57;
            if (r6 == true) goto L29;
            this.gn.write(r4);     // Catch: java.lang.Throwable -> L54 java.lang.Throwable -> L54 java.lang.Throwable -> L54
            if (r5 == false) goto L57;
            this.gn.flush();     // Catch: java.lang.Throwable -> L54 java.lang.Throwable -> L54 java.lang.Throwable -> L54
            goto L57
        L29:
            this.gn.close();     // Catch: java.lang.Throwable -> L54 java.lang.Throwable -> L54 java.lang.Throwable -> L54
            goto L39
        L18:
            r4 = this.Hw[this.Zo];     // Catch: java.lang.Throwable -> L36
            this.Zo = (this.Zo + 1) % this.Hw.length;     // Catch: java.lang.Throwable -> L36
            if (this.v5 != this.Zo) goto L21;
            r5 = true;
            goto L25
        L21:
            r5 = false;
            goto L25
        L14:
            if (this.tp == true) goto L16;
            this.VH.wait();     // Catch: java.lang.Throwable -> L36
        L36:
            th = move-exception;
            throw th;     // Catch: java.lang.Throwable -> L54 java.lang.Throwable -> L54 java.lang.Throwable -> L54
        L39:
            java.lang.Object r7 = this.VH;     // Catch: java.lang.Throwable -> L47
            monitor-enter(r7);     // Catch: java.lang.Throwable -> L47
            this.u7 = true;     // Catch: java.lang.Throwable -> L44
            monitor-exit(r7);     // Catch: java.lang.Throwable -> L44
            return;
        L44:
            th = move-exception;
            throw th;     // Catch: java.lang.Throwable -> L47
        }
    }

    static {
        abcd.wu.j6(abcd.Ol.class, -5925735092384612688L, -5925735092384612688L);
    }

    public Ol(java.lang.String[] r6) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 1727226469120942320L, null, r6);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1727226469120942320L, null, r6);     // Catch: java.lang.Throwable -> L14
    L6:
        this.gn = false;     // Catch: java.lang.Throwable -> L14
        monitor-enter(this);     // Catch: java.lang.Throwable -> L14
        this.FH = r6;     // Catch: java.lang.Throwable -> L11
        this.EQ = -1;     // Catch: java.lang.Throwable -> L11
        this.tp = false;     // Catch: java.lang.Throwable -> L11
        this.u7 = 0;     // Catch: java.lang.Throwable -> L11
        this.v5 = null;     // Catch: java.lang.Throwable -> L11
        this.Zo = null;     // Catch: java.lang.Throwable -> L11
        this.we = null;     // Catch: java.lang.Throwable -> L11
        this.Hw = null;     // Catch: java.lang.Throwable -> L11
        this.VH = new java.lang.Object();     // Catch: java.lang.Throwable -> L11
        monitor-exit(this);     // Catch: java.lang.Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    public Ol(java.lang.String[] r10, java.util.Map<java.lang.String, java.lang.String> r11, java.lang.String r12, boolean r13) {
    L19:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -406121450509460400L, null, r10, r11, r12, new java.lang.Boolean(r13));
    L23:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-406121450509460400L, null, r10, r11, r12, new java.lang.Boolean(r13));     // Catch: java.lang.Throwable -> L19
    L5:
        this(r10);     // Catch: java.lang.Throwable -> L19
        monitor-enter(this);     // Catch: java.lang.Throwable -> L19
        this.Hw = r11;     // Catch: java.lang.Throwable -> L16
        this.XL = r13;     // Catch: java.lang.Throwable -> L16
        if (r12 == null) goto L14;
        this.QX = new java.io.File(r12);     // Catch: java.lang.Throwable -> L16
        if (this.QX.exists() == true) goto L12;
    L13:
        this.QX = null;     // Catch: java.lang.Throwable -> L16
        goto L14
    L12:
        if (this.QX.isDirectory() == false) goto L13;
    L14:
        monitor-exit(this);     // Catch: java.lang.Throwable -> L16
        return;
    L16:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L19
    }

    static java.lang.String[] DW(abcd.Ol r0) {
        return r0.FH;
    }

    static java.io.OutputStream EQ(abcd.Ol r0) {
        return r0.Zo;
    }

    static int FH(abcd.Ol r0) {
        return r0.u7;
    }

    static int Hw(abcd.Ol r2) {
        int r0 = r2.u7;
        r2.u7 = r0 - 1;
        return r0;
    }

    static java.lang.Object VH(abcd.Ol r0) {
        return r0.VH;
    }

    static java.io.InputStream Zo(abcd.Ol r0) {
        return r0.J0;
    }

    static boolean gn(abcd.Ol r0) {
        return r0.gn;
    }

    static int j6(abcd.Ol r0, int r1) {
        r0.EQ = r1;
        return r1;
    }

    static java.lang.Process j6(abcd.Ol r0) {
        return r0.we;
    }

    static java.io.InputStream tp(abcd.Ol r0) {
        return r0.J8;
    }

    static java.io.OutputStream u7(abcd.Ol r0) {
        return r0.v5;
    }

    static abcd.Ol.a.C0003a v5(abcd.Ol r0) {
        return r0.Ws;
    }

    public synchronized void DW() {
        monitor-enter(this);
    L33:
        th = move-exception;
        if (DW == false) goto L37;
        abcd.wu.j6(th, -1763195182538995088L, this);     // Catch: java.lang.Throwable -> L31
    L37:
        throw th;     // Catch: java.lang.Throwable -> L31
    L5:
        if (j6 == false) goto L8;
        abcd.wu.j6(-1763195182538995088L, this);     // Catch: java.lang.Throwable -> L31 java.lang.Throwable -> L33
    L8:
        if (this.tp == true) goto L12;
        monitor-exit(this);
        return;
    L12:
        if (this.u7 > 0) goto L16;
        monitor-exit(this);
        return;
    L16:
        if (this.we == null) goto L18;
        this.we.destroy();     // Catch: java.lang.Throwable -> L31 java.lang.Throwable -> L33
    L18:
        this.u7 = 0;     // Catch: java.lang.Throwable -> L31 java.lang.Throwable -> L33
        this.Ws.j6();     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L31 java.lang.Throwable -> L33
    L20:
        java.lang.Object r2 = this.VH;     // Catch: java.lang.Throwable -> L31 java.lang.Throwable -> L33
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L31 java.lang.Throwable -> L33
        this.gn = true;     // Catch: java.lang.Throwable -> L28
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L28
        notifyAll();     // Catch: java.lang.Throwable -> L31 java.lang.Throwable -> L33
        monitor-exit(this);
        return;
    L28:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L31 java.lang.Throwable -> L33
    L31:
        th = move-exception;
        throw th;
    }

    public synchronized void DW(java.io.OutputStream r5) {
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
            r0 = -5121600589192519520(0xb8ec6b6647bfa0a0, double:-1.7104382100377907E-34)
            boolean r2 = abcd.Ol.j6     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
            if (r2 == 0) goto Ld
            abcd.wu.j6(r0, r4, r5)     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
        Ld:
            r4.v5 = r5     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
            monitor-exit(r4)
            return
        L11:
            r5 = move-exception
            goto L1c
        L13:
            r2 = move-exception
            boolean r3 = abcd.Ol.DW     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L1b
            abcd.wu.j6(r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L11
        L1b:
            throw r2     // Catch: java.lang.Throwable -> L11
        L1c:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.Ol.DW(java.io.OutputStream):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized java.io.OutputStream FH() {
        monitor-enter(this);
    L33:
        th = move-exception;
        throw th;
    L35:
        th = move-exception;
        if (DW == false) goto L39;
        abcd.wu.j6(th, -1121287333998411996L, this);     // Catch: java.lang.Throwable -> L33
    L39:
        throw th;     // Catch: java.lang.Throwable -> L33
    L5:
        if (j6 == false) goto L8;
        abcd.wu.j6(-1121287333998411996L, this);     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
    L8:
        if (this.tp == true) goto L32;
        this.tp = true;     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        java.lang.ProcessBuilder r3 = new java.lang.ProcessBuilder(this.FH);     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r3.redirectErrorStream(this.XL);     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r3.directory(this.QX);     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        if (this.Hw == null) goto L25;
        java.util.Map<java.lang.String, java.lang.String> r4 = r3.environment();     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        java.util.HashMap r5 = new java.util.HashMap();     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        java.util.Iterator r6 = r4.keySet().iterator();     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
    L14:
        if (r6.hasNext() == false) goto L16;
        java.lang.String r7 = (java.lang.String) r6.next();     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r5.put(r7.toUpperCase(java.util.Locale.US), r7);     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        goto L14
    L16:
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> r8 = this.Hw.entrySet().iterator();     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
    L18:
        if (r8.hasNext() == false) goto L25;
        java.util.Map.Entry<java.lang.String, java.lang.String> r9 = r8.next();     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        java.lang.String r10 = r9.getKey().toUpperCase(java.util.Locale.US);     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        if (r5.containsKey(r10) == true) goto L22;
        r4.put(r9.getKey(), r9.getValue());     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        goto L18
    L22:
        r4.put(r5.get(r10), r9.getValue());     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
    L25:
        this.we = r3.start();     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        this.J0 = this.we.getInputStream();     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        this.J8 = this.we.getErrorStream();     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        this.u7 = 3;     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L33 java.lang.Throwable -> L35
        abcd.Ll r11 = new abcd.Ll(this, "Process Exit Value [" + this.FH[0] + "]");     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        abcd.Ml r12 = new abcd.Ml(this, "Process Out [" + this.FH[0] + "]");     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        abcd.Nl r13 = new abcd.Nl(this, "Process Err [" + this.FH[0] + "]");     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        abcd.Ol.a r14 = new abcd.Ol.a(this, this.we.getOutputStream());     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        this.Ws = r14.j6();     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r11.setDaemon(true);     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r11.setPriority(5);     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r11.start();     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r12.setDaemon(true);     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r12.setPriority(5);     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r12.start();     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r13.setDaemon(true);     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r13.setPriority(5);     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r13.start();     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r14.setDaemon(true);     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r14.setPriority(5);     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        r14.start();     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        abcd.Ol.a.C0003a r0 = this.Ws;     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
        monitor-exit(this);
        return r0;
    L30:
        throw new java.io.IOException("Process could not be started.");     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
    L32:
        throw new java.io.IOException("Process has already been started.");     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L35
    }

    public synchronized void Hw() {
        monitor-enter(this);
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -316004360303675888L, this);     // Catch: java.lang.Throwable -> L14
    L20:
        throw th;     // Catch: java.lang.Throwable -> L14
    L14:
        th = move-exception;
        throw th;
    L5:
        if (j6 == false) goto L8;
        abcd.wu.j6(-316004360303675888L, this);     // Catch: java.lang.Throwable -> L14 java.lang.Throwable -> L16
    L8:
        if (this.tp == true) goto L10;
    L11:
        wait();     // Catch: java.lang.Throwable -> L14 java.lang.Throwable -> L16
    L12:
        monitor-exit(this);
        return;
    L10:
        if (this.u7 == 0) goto L12;
        goto L11
    }

    @abcd.Interfacesu(method = 974205147223711229L)
    protected void finalize() {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -862565052456196680L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-862565052456196680L, this);     // Catch: java.lang.Throwable -> L16
    L7:
        if (this.tp == true) goto L10;
        return;
    L10:
        if (this.u7 > 0) goto L13;
        return;
    L13:
        if (this.we == null) goto L23;
        this.we.destroy();     // Catch: java.lang.Throwable -> L16
        return;
    }

    public synchronized int j6() {
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
            r0 = -3933390470037522477(0xc969ca351e81b7d3, double:-4.60106709789842E45)
            boolean r2 = abcd.Ol.j6     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
            if (r2 == 0) goto Ld
            abcd.wu.j6(r0, r4)     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
        Ld:
            int r0 = r4.EQ     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
            monitor-exit(r4)
            return r0
        L11:
            r0 = move-exception
            goto L1c
        L13:
            r2 = move-exception
            boolean r3 = abcd.Ol.DW     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L1b
            abcd.wu.j6(r2, r0, r4)     // Catch: java.lang.Throwable -> L11
        L1b:
            throw r2     // Catch: java.lang.Throwable -> L11
        L1c:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.Ol.j6():int");
    }

    public synchronized void j6(java.io.OutputStream r5) {
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
            r0 = -4025626262061997149(0xc8221a3e4b4fa3a3, double:-3.079982991181459E39)
            boolean r2 = abcd.Ol.j6     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
            if (r2 == 0) goto Ld
            abcd.wu.j6(r0, r4, r5)     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
        Ld:
            r4.Zo = r5     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
            monitor-exit(r4)
            return
        L11:
            r5 = move-exception
            goto L1c
        L13:
            r2 = move-exception
            boolean r3 = abcd.Ol.DW     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L1b
            abcd.wu.j6(r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L11
        L1b:
            throw r2     // Catch: java.lang.Throwable -> L11
        L1c:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.Ol.j6(java.io.OutputStream):void");
    }
}
