package abcd;

public final class _r {
    public static java.lang.String DW(int r2) {
        switch(r2) {
            case 1: goto L115;
            case 2: goto L113;
            case 3: goto L111;
            case 4: goto L109;
            case 5: goto L107;
            case 6: goto L105;
            case 7: goto L103;
            case 8: goto L101;
            case 9: goto L99;
            case 10: goto L97;
            case 11: goto L95;
            case 12: goto L93;
            case 13: goto L91;
            case 14: goto L89;
            case 15: goto L87;
            case 16: goto L85;
            case 17: goto L83;
            case 18: goto L81;
            case 19: goto L79;
            case 20: goto L77;
            case 21: goto L75;
            case 22: goto L73;
            case 23: goto L71;
            case 24: goto L69;
            case 25: goto L67;
            case 26: goto L65;
            case 27: goto L63;
            case 28: goto L61;
            case 29: goto L59;
            case 30: goto L57;
            case 31: goto L55;
            case 32: goto L53;
            case 33: goto L51;
            case 34: goto L49;
            case 35: goto L47;
            case 36: goto L45;
            case 37: goto L43;
            case 38: goto L41;
            case 39: goto L39;
            case 40: goto L37;
            case 41: goto L35;
            case 42: goto L33;
            case 43: goto L31;
            case 44: goto L29;
            case 45: goto L27;
            case 46: goto L25;
            case 47: goto L23;
            case 48: goto L21;
            case 49: goto L19;
            case 50: goto L17;
            case 51: goto L15;
            case 52: goto L13;
            case 53: goto L11;
            case 54: goto L4;
            case 55: goto L9;
            case 56: goto L7;
            case 57: goto L5;
            default: goto L4;
        };
    L5:
        return "fill-array-data";
    L7:
        return "move-result-pseudo";
    L9:
        return "move-result";
    L11:
        return "invoke-interface";
    L13:
        return "invoke-direct";
    L15:
        return "invoke-super";
    L17:
        return "invoke-virtual";
    L19:
        return "invoke-static";
    L21:
        return "put-static";
    L23:
        return "put-field";
    L25:
        return "get-static";
    L27:
        return "get-field";
    L29:
        return "instance-of";
    L31:
        return "check-cast";
    L33:
        return "filled-new-array";
    L35:
        return "new-array";
    L37:
        return "new-instance";
    L39:
        return "aput";
    L41:
        return "aget";
    L43:
        return "monitor-exit";
    L45:
        return "monitor-enter";
    L47:
        return "throw";
    L49:
        return "array-length";
    L51:
        return "return";
    L53:
        return "to-short";
    L55:
        return "to-char";
    L57:
        return "to-byte";
    L59:
        return "conv";
    L61:
        return "cmpg";
    L63:
        return "cmpl";
    L65:
        return "not";
    L67:
        return "ushr";
    L69:
        return "shr";
    L71:
        return "shl";
    L73:
        return "xor";
    L75:
        return "or";
    L77:
        return "and";
    L79:
        return "neg";
    L81:
        return "rem";
    L83:
        return "div";
    L85:
        return "mul";
    L87:
        return "sub";
    L89:
        return "add";
    L91:
        return "switch";
    L93:
        return "if-gt";
    L95:
        return "if-le";
    L97:
        return "if-ge";
    L99:
        return "if-lt";
    L101:
        return "if-ne";
    L103:
        return "if-eq";
    L105:
        return "goto";
    L107:
        return "const";
    L109:
        return "move-exception";
    L111:
        return "move-param";
    L113:
        return "move";
    L115:
        return "nop";
    L4:
        return "unknown-" + abcd.Yt.Hw(r2);
    }

    public static int j6(int r3) {
        switch(r3) {
            case 7: goto L13;
            case 8: goto L13;
            case 9: goto L11;
            case 10: goto L9;
            case 11: goto L7;
            case 12: goto L5;
            default: goto L4;
        };
    L5:
        return 9;
    L7:
        return 10;
    L9:
        return 11;
    L11:
        return 12;
    L13:
        return r3;
    L4:
        throw new java.lang.RuntimeException("Unrecognized IF regop: " + r3);
    }
}
