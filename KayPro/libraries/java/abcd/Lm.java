package abcd;

public final class Lm {
    public static final abcd.Lm.c j6 = null;
    private final abcd.Pt DW;
    private final abcd.Interfacens FH;

    public static class a implements abcd.Lm.c {
        private int j6;

        a() {
            this.j6 = -1;
        }

        @Override
        public int j6() {
            return this.j6;
        }

        @Override
        public void j6(int r1) {
            this.j6 = r1;
        }

        @Override
        public void j6(int r1, int r2, int r3) {
        }

        @Override
        public void j6(int r1, int r2, int r3, int r4) {
        }

        @Override
        public void j6(int r1, int r2, int r3, int r4, abcd.Qs r5, int r6) {
        }

        @Override
        public void j6(int r1, int r2, int r3, abcd.Qs r4) {
        }

        @Override
        public void j6(int r1, int r2, int r3, abcd.cn r4, int r5) {
        }

        @Override
        public void j6(int r1, int r2, int r3, abcd.Abstractms r4, int r5) {
        }

        @Override
        public void j6(int r1, int r2, abcd.Ks r3, java.util.ArrayList<abcd.Abstractms> r4) {
        }
    }

    class b extends abcd.Lm.a {
        abcd.Abstractms DW;
        int FH;
        int Hw;
        final abcd.Lm v5;

        b(abcd.Lm r1) {
            this.v5 = r1;
        }

        private void DW() {
            this.FH = 0;
        }

        @Override
        public int j6() {
            return -1;
        }

        @Override
        public void j6(int r1) {
        }

        @Override
        public void j6(int r1, int r2, int r3) {
            DW();
        }

        @Override
        public void j6(int r1, int r2, int r3, int r4) {
            DW();
        }

        @Override
        public void j6(int r1, int r2, int r3, int r4, abcd.Qs r5, int r6) {
            DW();
        }

        @Override
        public void j6(int r1, int r2, int r3, abcd.Qs r4) {
            DW();
        }

        @Override
        public void j6(int r1, int r2, int r3, abcd.cn r4, int r5) {
            DW();
        }

        @Override
        public void j6(int r1, int r2, int r3, abcd.Abstractms r4, int r5) {
            this.DW = r4;
            this.FH = r3;
            this.Hw = r5;
        }

        @Override
        public void j6(int r1, int r2, abcd.Ks r3, java.util.ArrayList<abcd.Abstractms> r4) {
            DW();
        }
    }

    public interface c {
        int j6();

        void j6(int r1);

        void j6(int r1, int r2, int r3);

        void j6(int r1, int r2, int r3, int r4);

        void j6(int r1, int r2, int r3, int r4, abcd.Qs r5, int r6);

        void j6(int r1, int r2, int r3, abcd.Qs r4);

        void j6(int r1, int r2, int r3, abcd.cn r4, int r5);

        void j6(int r1, int r2, int r3, abcd.Abstractms r4, int r5);

        void j6(int r1, int r2, abcd.Ks r3, java.util.ArrayList<abcd.Abstractms> r4);
    }

    static {
        j6 = new abcd.Lm.a();
    }

    public Lm(abcd.Pt r1, abcd.Interfacens r2) {
        if (r1 == null) goto L10;
        if (r2 == null) goto L8;
        this.DW = r1;
        this.FH = r2;
        return;
    L8:
        throw new java.lang.NullPointerException("pool == null");
    L10:
        throw new java.lang.NullPointerException("bytes == null");
    }

    private int DW(int r10, abcd.Lm.c r11) {
        int r0 = (r10 + 4) & (-4);
        int r1 = r10 + 1;
        int r2 = 0;
        int r8 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r8 = (r8 << 8) | this.DW.v5(r1);
        r1 = r1 + 1;
        goto L3
    L5:
        int r3 = this.DW.DW(r0) + r10;
        int r4 = this.DW.DW(r0 + 4);
        int r5 = r0 + 8;
        abcd.cn r7 = new abcd.cn(r4);
    L6:
        if (r2 >= r4) goto L8;
        int r6 = this.DW.DW(r5);
        int r9 = this.DW.DW(r5 + 4) + r10;
        r5 = r5 + 8;
        r7.j6(r6, r9);
        r2 = r2 + 1;
        goto L6
    L8:
        r7.Hw(r3);
        r7.yS();
        r7.we();
        int r12 = r5 - r10;
        r11.j6(171, r10, r12, r7, r8);
        return r12;
    }

    private int FH(int r13, abcd.Lm.c r14) {
        int r0 = this.DW.v5(r13 + 1);
        switch(r0) {
            case 4: goto L13;
            case 5: goto L12;
            case 6: goto L11;
            case 7: goto L10;
            case 8: goto L9;
            case 9: goto L8;
            case 10: goto L7;
            case 11: goto L6;
            default: goto L5;
        };
    L6:
        abcd.Ks r1 = abcd.Ks.XL;
    L14:
        int r2 = r14.j6();
        abcd.Lm.b r3 = new abcd.Lm.b(this);
        int r4 = 0;
        if (r2 < 0) goto L21;
        j6(r2, r3);
        if ((r3.DW instanceof abcd.ys) == false) goto L21;
        if ((r3.FH + r2) != r13) goto L21;
        int r5 = r3.Hw;
    L22:
        int r6 = r13 + 2;
        java.util.ArrayList<abcd.Abstractms> r7 = new java.util.ArrayList();
        if (r5 == 0) goto L70;
        int r8 = 0;
    L25:
        int r9 = r6 + 1;
        if (this.DW.v5(r6) != 89) goto L68;
        j6(r9, r3);
        int r10 = r3.FH;
        if (r10 == 0) goto L68;
        if ((r3.DW instanceof abcd.ys) == false) goto L68;
        if (r3.Hw != r8) goto L68;
        int r11 = r9 + r10;
        j6(r11, r3);
        int r12 = r3.FH;
        if (r12 == 0) goto L68;
        abcd.Abstractms r15 = r3.DW;
        if ((r15 instanceof abcd.Ds) == false) goto L68;
        int r16 = r11 + r12;
        r7.add(r15);
        int r17 = r16 + 1;
        int r18 = this.DW.v5(r16);
        boolean r19 = true;
        switch(r0) {
            case 4: goto L62;
            case 5: goto L59;
            case 6: goto L56;
            case 7: goto L53;
            case 8: goto L62;
            case 9: goto L50;
            case 10: goto L47;
            case 11: goto L44;
            default: goto L65;
        };
    L65:
        if (r19 == true) goto L68;
        r8 = r8 + 1;
        r6 = r17;
        goto L25
    L44:
        if (r18 != 80) goto L65;
    L64:
        r19 = false;
        goto L65
    L47:
        if (r18 == 79) goto L64;
    L50:
        if (r18 == 86) goto L64;
    L53:
        if (r18 == 82) goto L64;
    L56:
        if (r18 == 81) goto L64;
    L59:
        if (r18 == 85) goto L64;
    L62:
        if (r18 == 84) goto L64;
    L68:
        r4 = r8;
    L70:
        if (r4 < 2) goto L75;
        if (r4 != r5) goto L75;
        int r20 = r6 - r13;
        r14.j6(r13, r20, r1, r7);
        return r20;
    L75:
        r14.j6(r13, 2, r1, null);
        return 2;
    L21:
        r5 = 0;
        goto L22
    L7:
        r1 = abcd.Ks.aM;
        goto L14
    L8:
        r1 = abcd.Ks.j3;
        goto L14
    L9:
        r1 = abcd.Ks.J0;
        goto L14
    L10:
        r1 = abcd.Ks.Ws;
        goto L14
    L11:
        r1 = abcd.Ks.QX;
        goto L14
    L12:
        r1 = abcd.Ks.J8;
        goto L14
    L13:
        r1 = abcd.Ks.we;
        goto L14
    L5:
        throw new abcd.an("bad newarray code " + abcd.Yt.Hw(r0));
    }

    private int Hw(int r10, abcd.Lm.c r11) {
        int r0 = (r10 + 4) & (-4);
        int r1 = r10 + 1;
        int r2 = 0;
        int r8 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r8 = (r8 << 8) | this.DW.v5(r1);
        r1 = r1 + 1;
        goto L3
    L5:
        int r3 = this.DW.DW(r0) + r10;
        int r4 = this.DW.DW(r0 + 4);
        int r5 = this.DW.DW(r0 + 8);
        int r6 = (r5 - r4) + 1;
        int r7 = r0 + 12;
        if (r4 > r5) goto L13;
        abcd.cn r9 = new abcd.cn(r6);
    L8:
        if (r2 >= r6) goto L10;
        int r12 = this.DW.DW(r7) + r10;
        r7 = r7 + 4;
        r9.j6(r4 + r2, r12);
        r2 = r2 + 1;
        goto L8
    L10:
        r9.Hw(r3);
        r9.yS();
        r9.we();
        int r13 = r7 - r10;
        r11.j6(171, r10, r13, r9, r8);
        return r13;
    L13:
        throw new abcd.an("low / high inversion");
    }

    private int v5(int r12, abcd.Lm.c r13) {
        int r3 = this.DW.v5(r12 + 1);
        int r8 = this.DW.Zo(r12 + 2);
        if (r3 != 132) goto L5;
        int r0 = this.DW.Hw(r12 + 4);
        r13.j6(r3, r12, 6, r8, abcd.Qs.VH, r0);
        return 6;
    L5:
        if (r3 == 169) goto L30;
        switch(r3) {
            case 21: goto L28;
            case 22: goto L26;
            case 23: goto L24;
            case 24: goto L22;
            case 25: goto L20;
            default: goto L7;
        };
    L7:
        switch(r3) {
            case 54: goto L18;
            case 55: goto L16;
            case 56: goto L14;
            case 57: goto L12;
            case 58: goto L10;
            default: goto L8;
        };
    L8:
        r13.j6(196, r12, 1);
        return 1;
    L10:
        r13.j6(54, r12, 4, r8, abcd.Qs.QX, 0);
        return 4;
    L12:
        r13.j6(54, r12, 4, r8, abcd.Qs.v5, 0);
        return 4;
    L14:
        r13.j6(54, r12, 4, r8, abcd.Qs.Zo, 0);
        return 4;
    L16:
        r13.j6(54, r12, 4, r8, abcd.Qs.gn, 0);
        return 4;
    L18:
        r13.j6(54, r12, 4, r8, abcd.Qs.VH, 0);
        return 4;
    L20:
        r13.j6(21, r12, 4, r8, abcd.Qs.QX, 0);
        return 4;
    L22:
        r13.j6(21, r12, 4, r8, abcd.Qs.v5, 0);
        return 4;
    L24:
        r13.j6(21, r12, 4, r8, abcd.Qs.Zo, 0);
        return 4;
    L26:
        r13.j6(21, r12, 4, r8, abcd.Qs.gn, 0);
        return 4;
    L28:
        r13.j6(21, r12, 4, r8, abcd.Qs.VH, 0);
        return 4;
    L30:
        r13.j6(r3, r12, 4, r8, abcd.Qs.we, 0);
        return 4;
    }

    public abcd.Pt DW() {
        return this.DW;
    }

    public int FH() {
        return this.DW.FH();
    }

    public int j6() {
        return this.DW.FH() + 4;
    }

    public int j6(int r12, abcd.Lm.c r13) {
        if (r13 != null) goto L5;
        r13 = j6;
    L5:
        abcd.Lm.c r1 = r13;
        int r2 = this.DW.v5(r12);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        abcd.Km.j6(r2);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        switch(r2) {
            case 0: goto L185;
            case 1: goto L183;
            case 2: goto L181;
            case 3: goto L179;
            case 4: goto L177;
            case 5: goto L175;
            case 6: goto L173;
            case 7: goto L171;
            case 8: goto L169;
            case 9: goto L167;
            case 10: goto L165;
            case 11: goto L163;
            case 12: goto L161;
            case 13: goto L159;
            case 14: goto L157;
            case 15: goto L155;
            case 16: goto L153;
            case 17: goto L151;
            case 18: goto L145;
            case 19: goto L139;
            case 20: goto L137;
            case 21: goto L135;
            case 22: goto L133;
            case 23: goto L131;
            case 24: goto L129;
            case 25: goto L127;
            case 26: goto L125;
            case 27: goto L125;
            case 28: goto L125;
            case 29: goto L125;
            case 30: goto L123;
            case 31: goto L123;
            case 32: goto L123;
            case 33: goto L123;
            case 34: goto L121;
            case 35: goto L121;
            case 36: goto L121;
            case 37: goto L121;
            case 38: goto L119;
            case 39: goto L119;
            case 40: goto L119;
            case 41: goto L119;
            case 42: goto L117;
            case 43: goto L117;
            case 44: goto L117;
            case 45: goto L117;
            case 46: goto L115;
            case 47: goto L113;
            case 48: goto L111;
            case 49: goto L109;
            case 50: goto L107;
            case 51: goto L105;
            case 52: goto L103;
            case 53: goto L101;
            case 54: goto L99;
            case 55: goto L97;
            case 56: goto L95;
            case 57: goto L93;
            case 58: goto L91;
            case 59: goto L89;
            case 60: goto L89;
            case 61: goto L89;
            case 62: goto L89;
            case 63: goto L87;
            case 64: goto L87;
            case 65: goto L87;
            case 66: goto L87;
            case 67: goto L85;
            case 68: goto L85;
            case 69: goto L85;
            case 70: goto L85;
            case 71: goto L83;
            case 72: goto L83;
            case 73: goto L83;
            case 74: goto L83;
            case 75: goto L81;
            case 76: goto L81;
            case 77: goto L81;
            case 78: goto L81;
            case 79: goto L79;
            case 80: goto L77;
            case 81: goto L75;
            case 82: goto L73;
            case 83: goto L71;
            case 84: goto L69;
            case 85: goto L67;
            case 86: goto L65;
            case 87: goto L63;
            case 88: goto L63;
            case 89: goto L63;
            case 90: goto L63;
            case 91: goto L63;
            case 92: goto L63;
            case 93: goto L63;
            case 94: goto L63;
            case 95: goto L63;
            case 96: goto L61;
            case 97: goto L59;
            case 98: goto L57;
            case 99: goto L55;
            case 100: goto L61;
            case 101: goto L59;
            case 102: goto L57;
            case 103: goto L55;
            case 104: goto L61;
            case 105: goto L59;
            case 106: goto L57;
            case 107: goto L55;
            case 108: goto L61;
            case 109: goto L59;
            case 110: goto L57;
            case 111: goto L55;
            case 112: goto L61;
            case 113: goto L59;
            case 114: goto L57;
            case 115: goto L55;
            case 116: goto L61;
            case 117: goto L59;
            case 118: goto L57;
            case 119: goto L55;
            case 120: goto L61;
            case 121: goto L59;
            case 122: goto L61;
            case 123: goto L59;
            case 124: goto L61;
            case 125: goto L59;
            case 126: goto L61;
            case 127: goto L59;
            case 128: goto L61;
            case 129: goto L59;
            case 130: goto L61;
            case 131: goto L59;
            case 132: goto L53;
            case 133: goto L51;
            case 134: goto L49;
            case 135: goto L47;
            case 136: goto L45;
            case 137: goto L49;
            case 138: goto L47;
            case 139: goto L45;
            case 140: goto L51;
            case 141: goto L47;
            case 142: goto L45;
            case 143: goto L51;
            case 144: goto L49;
            case 145: goto L45;
            case 146: goto L45;
            case 147: goto L45;
            case 148: goto L45;
            case 149: goto L45;
            case 150: goto L45;
            case 151: goto L45;
            case 152: goto L45;
            case 153: goto L43;
            case 154: goto L43;
            case 155: goto L43;
            case 156: goto L43;
            case 157: goto L43;
            case 158: goto L43;
            case 159: goto L43;
            case 160: goto L43;
            case 161: goto L43;
            case 162: goto L43;
            case 163: goto L43;
            case 164: goto L43;
            case 165: goto L43;
            case 166: goto L43;
            case 167: goto L43;
            case 168: goto L43;
            case 169: goto L41;
            case 170: goto L40;
            case 171: goto L38;
            case 172: goto L35;
            case 173: goto L33;
            case 174: goto L31;
            case 175: goto L29;
            case 176: goto L27;
            case 177: goto L25;
            case 178: goto L23;
            case 179: goto L23;
            case 180: goto L23;
            case 181: goto L23;
            case 182: goto L23;
            case 183: goto L23;
            case 184: goto L23;
            case 185: goto L21;
            case 186: goto L8;
            case 187: goto L23;
            case 188: goto L20;
            case 189: goto L23;
            case 190: goto L45;
            case 191: goto L25;
            case 192: goto L23;
            case 193: goto L23;
            case 194: goto L25;
            case 195: goto L25;
            case 196: goto L18;
            case 197: goto L15;
            case 198: goto L43;
            case 199: goto L43;
            case 200: goto L9;
            case 201: goto L9;
            default: goto L8;
        };     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
    L8:
        r1.j6(r2, r12, 1);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
    L186:
        return 1;
    L9:
        int r14 = this.DW.DW(r12 + 1) + r12;     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        if (r2 != 200) goto L12;
        int r3 = 167;
    L13:
        r1.j6(r3, r12, 5, r14);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 5;
    L12:
        r3 = 168;
        goto L13
    L15:
        int r15 = this.DW.Zo(r12 + 1);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        r1.j6(r2, r12, 4, this.FH.get(r15), this.DW.v5(r12 + 3));     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 4;
    L21:
        r1.j6(r2, r12, 5, this.FH.get(this.DW.Zo(r12 + 1)), this.DW.v5(r12 + 3) | (this.DW.v5(r12 + 4) << 8));     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 5;
    L23:
        r1.j6(r2, r12, 3, this.FH.get(this.DW.Zo(r12 + 1)), 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 3;
    L25:
        r1.j6(r2, r12, 1, abcd.Qs.tp);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L27:
        r1.j6(172, r12, 1, abcd.Qs.QX);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L29:
        r1.j6(172, r12, 1, abcd.Qs.v5);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L31:
        r1.j6(172, r12, 1, abcd.Qs.Zo);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L33:
        r1.j6(172, r12, 1, abcd.Qs.gn);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L35:
        r1.j6(172, r12, 1, abcd.Qs.VH);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L41:
        r1.j6(r2, r12, 2, this.DW.v5(r12 + 1), abcd.Qs.we, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 2;
    L43:
        r1.j6(r2, r12, 3, this.DW.Hw(r12 + 1) + r12);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 3;
    L45:
        r1.j6(r2, r12, 1, abcd.Qs.VH);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L47:
        r1.j6(r2, r12, 1, abcd.Qs.v5);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L49:
        r1.j6(r2, r12, 1, abcd.Qs.Zo);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L51:
        r1.j6(r2, r12, 1, abcd.Qs.gn);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L53:
        r1.j6(r2, r12, 3, this.DW.v5(r12 + 1), abcd.Qs.VH, this.DW.j6(r12 + 2));     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 3;
    L55:
        r1.j6(r2 - 3, r12, 1, abcd.Qs.v5);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L57:
        r1.j6(r2 - 2, r12, 1, abcd.Qs.Zo);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L59:
        r1.j6(r2 - 1, r12, 1, abcd.Qs.gn);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L61:
        r1.j6(r2, r12, 1, abcd.Qs.VH);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L63:
        r1.j6(r2, r12, 1, abcd.Qs.tp);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L65:
        r1.j6(79, r12, 1, abcd.Qs.u7);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L67:
        r1.j6(79, r12, 1, abcd.Qs.Hw);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L69:
        r1.j6(79, r12, 1, abcd.Qs.FH);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L71:
        r1.j6(79, r12, 1, abcd.Qs.QX);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L73:
        r1.j6(79, r12, 1, abcd.Qs.v5);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L75:
        r1.j6(79, r12, 1, abcd.Qs.Zo);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L77:
        r1.j6(79, r12, 1, abcd.Qs.gn);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L79:
        r1.j6(79, r12, 1, abcd.Qs.VH);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L81:
        r1.j6(54, r12, 1, r2 - 75, abcd.Qs.QX, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L83:
        r1.j6(54, r12, 1, r2 - 71, abcd.Qs.v5, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L85:
        r1.j6(54, r12, 1, r2 - 67, abcd.Qs.Zo, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L87:
        r1.j6(54, r12, 1, r2 - 63, abcd.Qs.gn, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L89:
        r1.j6(54, r12, 1, r2 - 59, abcd.Qs.VH, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L91:
        r1.j6(54, r12, 2, this.DW.v5(r12 + 1), abcd.Qs.QX, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 2;
    L93:
        r1.j6(54, r12, 2, this.DW.v5(r12 + 1), abcd.Qs.v5, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 2;
    L95:
        r1.j6(54, r12, 2, this.DW.v5(r12 + 1), abcd.Qs.Zo, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 2;
    L97:
        r1.j6(54, r12, 2, this.DW.v5(r12 + 1), abcd.Qs.gn, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 2;
    L99:
        r1.j6(54, r12, 2, this.DW.v5(r12 + 1), abcd.Qs.VH, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 2;
    L101:
        r1.j6(46, r12, 1, abcd.Qs.u7);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L103:
        r1.j6(46, r12, 1, abcd.Qs.Hw);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L105:
        r1.j6(46, r12, 1, abcd.Qs.FH);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L107:
        r1.j6(46, r12, 1, abcd.Qs.QX);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L109:
        r1.j6(46, r12, 1, abcd.Qs.v5);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L111:
        r1.j6(46, r12, 1, abcd.Qs.Zo);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L113:
        r1.j6(46, r12, 1, abcd.Qs.gn);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L115:
        r1.j6(46, r12, 1, abcd.Qs.VH);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L117:
        r1.j6(21, r12, 1, r2 - 42, abcd.Qs.QX, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L119:
        r1.j6(21, r12, 1, r2 - 38, abcd.Qs.v5, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L121:
        r1.j6(21, r12, 1, r2 - 34, abcd.Qs.Zo, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L123:
        r1.j6(21, r12, 1, r2 - 30, abcd.Qs.gn, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L125:
        r1.j6(21, r12, 1, r2 - 26, abcd.Qs.VH, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L127:
        r1.j6(21, r12, 2, this.DW.v5(r12 + 1), abcd.Qs.QX, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 2;
    L129:
        r1.j6(21, r12, 2, this.DW.v5(r12 + 1), abcd.Qs.v5, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 2;
    L131:
        r1.j6(21, r12, 2, this.DW.v5(r12 + 1), abcd.Qs.Zo, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 2;
    L133:
        r1.j6(21, r12, 2, this.DW.v5(r12 + 1), abcd.Qs.gn, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 2;
    L135:
        r1.j6(21, r12, 2, this.DW.v5(r12 + 1), abcd.Qs.VH, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 2;
    L137:
        r1.j6(20, r12, 3, this.FH.get(this.DW.Zo(r12 + 1)), 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 3;
    L139:
        abcd.Abstractms r5 = this.FH.get(this.DW.Zo(r12 + 1));     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        if ((r5 instanceof abcd.ys) == false) goto L142;
        int r6 = ((abcd.ys) r5).rN();     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
    L143:
        r1.j6(18, r12, 3, r5, r6);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 3;
    L142:
        r6 = 0;
        goto L143
    L145:
        abcd.Abstractms r7 = this.FH.get(this.DW.v5(r12 + 1));     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        if ((r7 instanceof abcd.ys) == false) goto L148;
        int r8 = ((abcd.ys) r7).rN();     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
    L149:
        r1.j6(18, r12, 2, r7, r8);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 2;
    L148:
        r8 = 0;
        goto L149
    L151:
        int r9 = this.DW.Hw(r12 + 1);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        r1.j6(18, r12, 3, abcd.ys.j6(r9), r9);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 3;
    L153:
        int r10 = this.DW.j6(r12 + 1);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        r1.j6(18, r12, 2, abcd.ys.j6(r10), r10);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 2;
    L155:
        r1.j6(18, r12, 1, abcd.us.FH, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L157:
        r1.j6(18, r12, 1, abcd.us.DW, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L159:
        r1.j6(18, r12, 1, abcd.xs.Hw, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L161:
        r1.j6(18, r12, 1, abcd.xs.FH, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L163:
        r1.j6(18, r12, 1, abcd.xs.DW, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L165:
        r1.j6(18, r12, 1, abcd.Es.FH, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L167:
        r1.j6(18, r12, 1, abcd.Es.DW, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L169:
        r1.j6(18, r12, 1, abcd.ys.u7, 5);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L171:
        r1.j6(18, r12, 1, abcd.ys.gn, 4);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L173:
        r1.j6(18, r12, 1, abcd.ys.VH, 3);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L175:
        r1.j6(18, r12, 1, abcd.ys.Zo, 2);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L177:
        r1.j6(18, r12, 1, abcd.ys.v5, 1);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L179:
        r1.j6(18, r12, 1, abcd.ys.Hw, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L181:
        r1.j6(18, r12, 1, abcd.ys.FH, -1);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L183:
        r1.j6(18, r12, 1, abcd.As.j6, 0);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        return 1;
    L185:
        r1.j6(r2, r12, 1, abcd.Qs.tp);     // Catch: java.lang.RuntimeException -> L187 abcd.an -> L190
        goto L186
    L18:
        return v5(r12, r1);
    L20:
        return FH(r12, r1);
    L38:
        return DW(r12, r1);
    L40:
        return Hw(r12, r1);
    L190:
        e = move-exception;
        e.j6("...at bytecode offset " + abcd.Yt.gn(r12));
        throw e;
    L187:
        e = move-exception;
        abcd.an r4 = new abcd.an(e);
        r4.j6("...at bytecode offset " + abcd.Yt.gn(r12));
        throw r4;
    }

    public void j6(abcd.Lm.c r4) {
        int r0 = this.DW.FH();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r1 = r1 + j6(r1, r4);
        goto L3
    }

    public void j6(int[] r2, abcd.Lm.c r3) {
        if (r3 == null) goto L8;
    L3:
        int r0 = abcd.Ot.DW(r2, 0);
        if (r0 < 0) goto L5;
        abcd.Ot.j6(r2, r0);
        j6(r0, r3);
        r3.j6(r0);
        goto L3
    L5:
        return;
    L8:
        throw new java.lang.NullPointerException("visitor == null");
    }
}
