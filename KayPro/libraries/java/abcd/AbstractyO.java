package abcd;

public abstract class AbstractyO implements abcd.InterfacetO {
    static final long[] j6 = null;
    private byte[] DW;
    protected long EQ;
    private int FH;
    private long Hw;
    protected long J0;
    private long[] J8;
    protected long VH;
    private int Ws;
    protected long Zo;
    protected long gn;
    protected long tp;
    protected long u7;
    private long v5;
    protected long we;

    static {
        j6 = new long[]{4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    }

    protected AbstractyO() {
        this.J8 = new long[80];
        this.DW = new byte[8];
        this.FH = 0;
        reset();
    }

    private long DW(long r7) {
        long r0 = ((r7 << 45) | (r7 >>> 19)) ^ ((r7 << 3) | (r7 >>> 61));
        return (r7 >>> 6) ^ r0;
    }

    private long DW(long r3, long r5, long r7) {
        long r0 = r3 & r5;
        return ((r3 & r7) ^ r0) ^ (r5 & r7);
    }

    private long FH(long r7) {
        long r0 = ((r7 << 36) | (r7 >>> 28)) ^ ((r7 << 30) | (r7 >>> 34));
        long r2 = r7 << 25;
        return ((r7 >>> 39) | r2) ^ r0;
    }

    private long Hw(long r7) {
        long r0 = ((r7 << 50) | (r7 >>> 14)) ^ ((r7 << 46) | (r7 >>> 18));
        long r2 = r7 << 23;
        return ((r7 >>> 41) | r2) ^ r0;
    }

    private long j6(long r7) {
        long r0 = ((r7 << 63) | (r7 >>> 1)) ^ ((r7 << 56) | (r7 >>> 8));
        return (r7 >>> 7) ^ r0;
    }

    private long j6(long r3, long r5, long r7) {
        long r6 = r5 & r3;
        return ((r3 ^ (-1)) & r7) ^ r6;
    }

    private void v5() {
        long r0 = this.Hw;
        if (r0 <= 2305843009213693951L) goto L6;
        this.v5 += r0 >>> 61;
        this.Hw = r0 & 2305843009213693951L;
        return;
    }

    protected void DW(byte[] r3, int r4) {
        this.J8[this.Ws] = abcd.ZO.DW(r3, r4);
        int r5 = this.Ws + 1;
        this.Ws = r5;
        if (r5 != 16) goto L6;
        Hw();
        return;
    }

    public void FH() {
        v5();
        long r0 = this.Hw << 3;
        long r2 = this.v5;
        j6((byte) -128);
    L4:
        if (this.FH == 0) goto L5;
        j6((byte) 0);
        goto L4
    L5:
        j6(r0, r2);
        Hw();
    }

    protected void Hw() {
        v5();
        int r0 = 16;
    L4:
        if (r0 > 79) goto L5;
        long[] r1 = this.J8;
        long r2 = DW(r1[r0 - 2]);
        long[] r4 = this.J8;
        r1[r0] = ((r2 + r4[r0 - 7]) + j6(r4[r0 - 15])) + this.J8[r0 - 16];
        r0 = r0 + 1;
        goto L4
    L5:
        long r3 = this.Zo;
        long r5 = this.VH;
        long r6 = this.gn;
        long r9 = this.u7;
        long r11 = this.tp;
        long r13 = this.EQ;
        int r10 = 0;
        long r22 = r5;
        long r24 = r6;
        long r20 = r9;
        long r7 = r3;
        long r18 = this.we;
        long r16 = r13;
        int r8 = 0;
        int r12 = 0;
        long r14 = r11;
        long r15 = this.J0;
    L7:
        if (r8 >= 10) goto L8;
        long r28 = r7;
        int r30 = r12 + 1;
        long r17 = r15 + (((Hw(r14) + j6(r14, r16, r18)) + j6[r12]) + this.J8[r12]);
        long r19 = r20 + r17;
        long r110 = r17 + (FH(r28) + DW(r28, r22, r24));
        int r21 = r30 + 1;
        long r111 = r18 + (((Hw(r19) + j6(r19, r14, r16)) + j6[r30]) + this.J8[r30]);
        long r23 = r24 + r111;
        long r25 = r111 + (FH(r110) + DW(r110, r28, r22));
        int r112 = r21 + 1;
        long r113 = r16 + (((Hw(r23) + j6(r23, r19, r14)) + j6[r21]) + this.J8[r21]);
        long r26 = r22 + r113;
        long r27 = r113 + (FH(r25) + DW(r25, r110, r28));
        int r29 = r112 + 1;
        long r114 = r14 + (((Hw(r26) + j6(r26, r23, r19)) + j6[r112]) + this.J8[r112]);
        long r31 = r28 + r114;
        long r115 = r114 + (FH(r27) + DW(r27, r25, r110));
        int r116 = r29 + 1;
        long r117 = r19 + (((Hw(r31) + j6(r31, r26, r23)) + j6[r29]) + this.J8[r29]);
        long r32 = r110 + r117;
        long r33 = r117 + (FH(r115) + DW(r115, r27, r25));
        int r210 = r116 + 1;
        long r118 = r23 + (((Hw(r32) + j6(r32, r31, r26)) + j6[r116]) + this.J8[r116]);
        long r34 = r25 + r118;
        long r35 = r118 + (FH(r33) + DW(r33, r115, r27));
        int r211 = r210 + 1;
        long r119 = r26 + (((Hw(r34) + j6(r34, r32, r31)) + j6[r210]) + this.J8[r210]);
        long r36 = r27 + r119;
        long r37 = r119 + (FH(r35) + DW(r35, r33, r115));
        long r120 = r31 + (((Hw(r36) + j6(r36, r34, r32)) + j6[r211]) + this.J8[r211]);
        long r212 = r115 + r120;
        r7 = r120 + (FH(r37) + DW(r37, r35, r33));
        r16 = r36;
        r20 = r33;
        r18 = r34;
        r8 = r8 + 1;
        r12 = r211 + 1;
        r22 = r37;
        r10 = 0;
        r15 = r32;
        r14 = r212;
        r24 = r35;
        goto L7
    L8:
        this.Zo += r7;
        this.VH += r22;
        this.gn += r24;
        this.u7 += r20;
        this.tp += r14;
        this.EQ += r16;
        this.we += r18;
        this.J0 += r15;
        this.Ws = r10;
    L9:
        if (r10 >= 16) goto L10;
        this.J8[r10] = 0;
        r10 = r10 + 1;
        goto L9
    }

    @Override
    public void j6(byte r5) {
        byte[] r0 = this.DW;
        int r1 = this.FH;
        this.FH = r1 + 1;
        r0[r1] = r5;
        if (this.FH != r0.length) goto L5;
        DW(r0, 0);
        this.FH = 0;
    L5:
        this.Hw++;
    }

    protected void j6(long r3, long r5) {
        if (this.Ws <= 14) goto L5;
        Hw();
    L5:
        long[] r0 = this.J8;
        r0[14] = r5;
        r0[15] = r3;
    }

    @Override
    public void reset() {
        this.Hw = 0;
        this.v5 = 0;
        int r2 = 0;
        this.FH = 0;
        int r3 = 0;
    L3:
        byte[] r4 = this.DW;
        if (r3 >= r4.length) goto L5;
        r4[r3] = 0;
        r3 = r3 + 1;
        goto L3
    L5:
        this.Ws = 0;
    L6:
        long[] r5 = this.J8;
        if (r2 == r5.length) goto L8;
        r5[r2] = 0;
        r2 = r2 + 1;
        goto L6
    }

    @Override
    public void update(byte[] r6, int r7, int r8) {
    L3:
        if (this.FH == 0) goto L8;
        if (r8 <= 0) goto L8;
        j6(r6[r7]);
        r7 = r7 + 1;
        r8 = r8 - 1;
    L8:
        if (r8 <= this.DW.length) goto L9;
        DW(r6, r7);
        byte[] r0 = this.DW;
        r7 = r7 + r0.length;
        r8 = r8 - r0.length;
        this.Hw += (long) r0.length;
    L9:
        if (r8 <= 0) goto L10;
        j6(r6[r7]);
        r7 = r7 + 1;
        r8 = r8 - 1;
        goto L9
    }
}
