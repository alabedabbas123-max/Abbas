package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.jvm.ByteCodes;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.List;

class ConstFold {
    private Symtab syms;
    protected static final Context.C0723Key<ConstFold> constFoldKey = new Context.C0723Key<>();
    static Integer minusOne = -1;
    static Integer zero = 0;

    static Integer f367one = 1;

    public static ConstFold instance(Context context) {
        ConstFold instance = (ConstFold) context.m501get(constFoldKey);
        if (instance == null) {
            return new ConstFold(context);
        }
        return instance;
    }

    private ConstFold(Context context) {
        context.m504put(constFoldKey, this);
        this.syms = Symtab.instance(context);
    }

    private static Integer m464b2i(boolean b) {
        return b ? f367one : zero;
    }

    private static int intValue(Object x) {
        return ((Number) x).intValue();
    }

    private static long longValue(Object x) {
        return ((Number) x).longValue();
    }

    private static float floatValue(Object x) {
        return ((Number) x).floatValue();
    }

    private static double doubleValue(Object x) {
        return ((Number) x).doubleValue();
    }

    Type fold(int opcode, List<Type> argtypes) {
        int argCount = argtypes.length();
        if (argCount == 1) {
            return fold1(opcode, argtypes.head);
        }
        if (argCount == 2) {
            return fold2(opcode, argtypes.head, argtypes.tail.head);
        }
        throw new AssertionError();
    }

    Type fold1(int opcode, Type operand) {
        try {
            Object od = operand.constValue();
            if (opcode == 0) {
                return operand;
            }
            boolean z = true;
            if (opcode == 257) {
                Type type = this.syms.booleanType;
                if (intValue(od) != 0) {
                    z = false;
                }
                return type.constType(m464b2i(z));
            }
            if (opcode == 130) {
                return this.syms.intType.constType(Integer.valueOf(intValue(od) ^ (-1)));
            }
            if (opcode != 131) {
                switch (opcode) {
                    case ByteCodes.ineg:
                        return this.syms.intType.constType(Integer.valueOf(-intValue(od)));
                    case ByteCodes.lneg:
                        return this.syms.longType.constType(new Long(-longValue(od)));
                    case ByteCodes.fneg:
                        return this.syms.floatType.constType(new Float(-floatValue(od)));
                    case ByteCodes.dneg:
                        return this.syms.doubleType.constType(new Double(-doubleValue(od)));
                    default:
                        switch (opcode) {
                            case ByteCodes.ifeq:
                                Type type2 = this.syms.booleanType;
                                if (intValue(od) != 0) {
                                    z = false;
                                }
                                return type2.constType(m464b2i(z));
                            case ByteCodes.ifne:
                                Type type3 = this.syms.booleanType;
                                if (intValue(od) == 0) {
                                    z = false;
                                }
                                return type3.constType(m464b2i(z));
                            case ByteCodes.iflt:
                                Type type4 = this.syms.booleanType;
                                if (intValue(od) >= 0) {
                                    z = false;
                                }
                                return type4.constType(m464b2i(z));
                            case ByteCodes.ifge:
                                Type type5 = this.syms.booleanType;
                                if (intValue(od) < 0) {
                                    z = false;
                                }
                                return type5.constType(m464b2i(z));
                            case ByteCodes.ifgt:
                                Type type6 = this.syms.booleanType;
                                if (intValue(od) <= 0) {
                                    z = false;
                                }
                                return type6.constType(m464b2i(z));
                            case ByteCodes.ifle:
                                Type type7 = this.syms.booleanType;
                                if (intValue(od) > 0) {
                                    z = false;
                                }
                                return type7.constType(m464b2i(z));
                            default:
                                return null;
                        }
                }
            }
            return this.syms.longType.constType(new Long(longValue(od) ^ (-1)));
        } catch (ArithmeticException e) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02ae A[Catch: ArithmeticException -> 0x053d, TryCatch #0 {ArithmeticException -> 0x053d, blocks: (B:5:0x0007, B:8:0x0013, B:10:0x001a, B:16:0x0030, B:18:0x0035, B:19:0x0038, B:20:0x003b, B:21:0x003e, B:23:0x0042, B:27:0x004e, B:29:0x0057, B:31:0x0068, B:35:0x0078, B:37:0x0081, B:41:0x0091, B:43:0x009a, B:47:0x00aa, B:49:0x00b3, B:53:0x00c3, B:55:0x00cc, B:59:0x00dc, B:61:0x00e5, B:65:0x00f5, B:67:0x00fe, B:69:0x010a, B:71:0x0115, B:73:0x0121, B:75:0x012c, B:77:0x0138, B:81:0x0147, B:83:0x0152, B:85:0x015d, B:87:0x0169, B:89:0x0174, B:91:0x0180, B:93:0x018b, B:95:0x0197, B:99:0x01a6, B:101:0x01b1, B:103:0x01bc, B:105:0x01c8, B:107:0x01d3, B:109:0x01df, B:111:0x01ea, B:113:0x01f5, B:115:0x020c, B:117:0x0210, B:119:0x0219, B:118:0x0215, B:121:0x022b, B:123:0x0242, B:125:0x0246, B:127:0x024f, B:126:0x024b, B:129:0x0261, B:131:0x0278, B:133:0x027c, B:135:0x0285, B:134:0x0281, B:137:0x0297, B:139:0x02ae, B:141:0x02c4, B:143:0x02db, B:145:0x02f1, B:147:0x0308, B:149:0x031e, B:151:0x0335, B:153:0x034c, B:155:0x0363, B:157:0x0379, B:159:0x0390, B:161:0x03a7, B:163:0x03be, B:165:0x03d4, B:167:0x03ec, B:169:0x0404, B:171:0x041c, B:173:0x0433, B:175:0x044a, B:177:0x0461, B:179:0x0478, B:181:0x048e, B:183:0x04a5, B:185:0x04bc, B:187:0x04d3, B:189:0x04e9, B:193:0x04fa, B:195:0x0503, B:199:0x0514, B:201:0x051d), top: B:205:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x02c4 A[Catch: ArithmeticException -> 0x053d, TryCatch #0 {ArithmeticException -> 0x053d, blocks: (B:5:0x0007, B:8:0x0013, B:10:0x001a, B:16:0x0030, B:18:0x0035, B:19:0x0038, B:20:0x003b, B:21:0x003e, B:23:0x0042, B:27:0x004e, B:29:0x0057, B:31:0x0068, B:35:0x0078, B:37:0x0081, B:41:0x0091, B:43:0x009a, B:47:0x00aa, B:49:0x00b3, B:53:0x00c3, B:55:0x00cc, B:59:0x00dc, B:61:0x00e5, B:65:0x00f5, B:67:0x00fe, B:69:0x010a, B:71:0x0115, B:73:0x0121, B:75:0x012c, B:77:0x0138, B:81:0x0147, B:83:0x0152, B:85:0x015d, B:87:0x0169, B:89:0x0174, B:91:0x0180, B:93:0x018b, B:95:0x0197, B:99:0x01a6, B:101:0x01b1, B:103:0x01bc, B:105:0x01c8, B:107:0x01d3, B:109:0x01df, B:111:0x01ea, B:113:0x01f5, B:115:0x020c, B:117:0x0210, B:119:0x0219, B:118:0x0215, B:121:0x022b, B:123:0x0242, B:125:0x0246, B:127:0x024f, B:126:0x024b, B:129:0x0261, B:131:0x0278, B:133:0x027c, B:135:0x0285, B:134:0x0281, B:137:0x0297, B:139:0x02ae, B:141:0x02c4, B:143:0x02db, B:145:0x02f1, B:147:0x0308, B:149:0x031e, B:151:0x0335, B:153:0x034c, B:155:0x0363, B:157:0x0379, B:159:0x0390, B:161:0x03a7, B:163:0x03be, B:165:0x03d4, B:167:0x03ec, B:169:0x0404, B:171:0x041c, B:173:0x0433, B:175:0x044a, B:177:0x0461, B:179:0x0478, B:181:0x048e, B:183:0x04a5, B:185:0x04bc, B:187:0x04d3, B:189:0x04e9, B:193:0x04fa, B:195:0x0503, B:199:0x0514, B:201:0x051d), top: B:205:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x02db A[Catch: ArithmeticException -> 0x053d, TryCatch #0 {ArithmeticException -> 0x053d, blocks: (B:5:0x0007, B:8:0x0013, B:10:0x001a, B:16:0x0030, B:18:0x0035, B:19:0x0038, B:20:0x003b, B:21:0x003e, B:23:0x0042, B:27:0x004e, B:29:0x0057, B:31:0x0068, B:35:0x0078, B:37:0x0081, B:41:0x0091, B:43:0x009a, B:47:0x00aa, B:49:0x00b3, B:53:0x00c3, B:55:0x00cc, B:59:0x00dc, B:61:0x00e5, B:65:0x00f5, B:67:0x00fe, B:69:0x010a, B:71:0x0115, B:73:0x0121, B:75:0x012c, B:77:0x0138, B:81:0x0147, B:83:0x0152, B:85:0x015d, B:87:0x0169, B:89:0x0174, B:91:0x0180, B:93:0x018b, B:95:0x0197, B:99:0x01a6, B:101:0x01b1, B:103:0x01bc, B:105:0x01c8, B:107:0x01d3, B:109:0x01df, B:111:0x01ea, B:113:0x01f5, B:115:0x020c, B:117:0x0210, B:119:0x0219, B:118:0x0215, B:121:0x022b, B:123:0x0242, B:125:0x0246, B:127:0x024f, B:126:0x024b, B:129:0x0261, B:131:0x0278, B:133:0x027c, B:135:0x0285, B:134:0x0281, B:137:0x0297, B:139:0x02ae, B:141:0x02c4, B:143:0x02db, B:145:0x02f1, B:147:0x0308, B:149:0x031e, B:151:0x0335, B:153:0x034c, B:155:0x0363, B:157:0x0379, B:159:0x0390, B:161:0x03a7, B:163:0x03be, B:165:0x03d4, B:167:0x03ec, B:169:0x0404, B:171:0x041c, B:173:0x0433, B:175:0x044a, B:177:0x0461, B:179:0x0478, B:181:0x048e, B:183:0x04a5, B:185:0x04bc, B:187:0x04d3, B:189:0x04e9, B:193:0x04fa, B:195:0x0503, B:199:0x0514, B:201:0x051d), top: B:205:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02f1 A[Catch: ArithmeticException -> 0x053d, TryCatch #0 {ArithmeticException -> 0x053d, blocks: (B:5:0x0007, B:8:0x0013, B:10:0x001a, B:16:0x0030, B:18:0x0035, B:19:0x0038, B:20:0x003b, B:21:0x003e, B:23:0x0042, B:27:0x004e, B:29:0x0057, B:31:0x0068, B:35:0x0078, B:37:0x0081, B:41:0x0091, B:43:0x009a, B:47:0x00aa, B:49:0x00b3, B:53:0x00c3, B:55:0x00cc, B:59:0x00dc, B:61:0x00e5, B:65:0x00f5, B:67:0x00fe, B:69:0x010a, B:71:0x0115, B:73:0x0121, B:75:0x012c, B:77:0x0138, B:81:0x0147, B:83:0x0152, B:85:0x015d, B:87:0x0169, B:89:0x0174, B:91:0x0180, B:93:0x018b, B:95:0x0197, B:99:0x01a6, B:101:0x01b1, B:103:0x01bc, B:105:0x01c8, B:107:0x01d3, B:109:0x01df, B:111:0x01ea, B:113:0x01f5, B:115:0x020c, B:117:0x0210, B:119:0x0219, B:118:0x0215, B:121:0x022b, B:123:0x0242, B:125:0x0246, B:127:0x024f, B:126:0x024b, B:129:0x0261, B:131:0x0278, B:133:0x027c, B:135:0x0285, B:134:0x0281, B:137:0x0297, B:139:0x02ae, B:141:0x02c4, B:143:0x02db, B:145:0x02f1, B:147:0x0308, B:149:0x031e, B:151:0x0335, B:153:0x034c, B:155:0x0363, B:157:0x0379, B:159:0x0390, B:161:0x03a7, B:163:0x03be, B:165:0x03d4, B:167:0x03ec, B:169:0x0404, B:171:0x041c, B:173:0x0433, B:175:0x044a, B:177:0x0461, B:179:0x0478, B:181:0x048e, B:183:0x04a5, B:185:0x04bc, B:187:0x04d3, B:189:0x04e9, B:193:0x04fa, B:195:0x0503, B:199:0x0514, B:201:0x051d), top: B:205:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0308 A[Catch: ArithmeticException -> 0x053d, TryCatch #0 {ArithmeticException -> 0x053d, blocks: (B:5:0x0007, B:8:0x0013, B:10:0x001a, B:16:0x0030, B:18:0x0035, B:19:0x0038, B:20:0x003b, B:21:0x003e, B:23:0x0042, B:27:0x004e, B:29:0x0057, B:31:0x0068, B:35:0x0078, B:37:0x0081, B:41:0x0091, B:43:0x009a, B:47:0x00aa, B:49:0x00b3, B:53:0x00c3, B:55:0x00cc, B:59:0x00dc, B:61:0x00e5, B:65:0x00f5, B:67:0x00fe, B:69:0x010a, B:71:0x0115, B:73:0x0121, B:75:0x012c, B:77:0x0138, B:81:0x0147, B:83:0x0152, B:85:0x015d, B:87:0x0169, B:89:0x0174, B:91:0x0180, B:93:0x018b, B:95:0x0197, B:99:0x01a6, B:101:0x01b1, B:103:0x01bc, B:105:0x01c8, B:107:0x01d3, B:109:0x01df, B:111:0x01ea, B:113:0x01f5, B:115:0x020c, B:117:0x0210, B:119:0x0219, B:118:0x0215, B:121:0x022b, B:123:0x0242, B:125:0x0246, B:127:0x024f, B:126:0x024b, B:129:0x0261, B:131:0x0278, B:133:0x027c, B:135:0x0285, B:134:0x0281, B:137:0x0297, B:139:0x02ae, B:141:0x02c4, B:143:0x02db, B:145:0x02f1, B:147:0x0308, B:149:0x031e, B:151:0x0335, B:153:0x034c, B:155:0x0363, B:157:0x0379, B:159:0x0390, B:161:0x03a7, B:163:0x03be, B:165:0x03d4, B:167:0x03ec, B:169:0x0404, B:171:0x041c, B:173:0x0433, B:175:0x044a, B:177:0x0461, B:179:0x0478, B:181:0x048e, B:183:0x04a5, B:185:0x04bc, B:187:0x04d3, B:189:0x04e9, B:193:0x04fa, B:195:0x0503, B:199:0x0514, B:201:0x051d), top: B:205:0x0003 }] */
    Type fold2(int opcode, Type left, Type right) {
        try {
            if (opcode > 511) {
                Type t1 = fold2(opcode >> 9, left, right);
                return t1.constValue() == null ? t1 : fold1(opcode & 511, t1);
            }
            Object l = left.constValue();
            Object r = right.constValue();
            if (opcode == 256) {
                return this.syms.stringType.constType(left.stringValue() + right.stringValue());
            }
            boolean z = true;
            if (opcode == 258) {
                Type type = this.syms.booleanType;
                if ((intValue(l) & intValue(r)) == 0) {
                    z = false;
                }
                return type.constType(m464b2i(z));
            }
            if (opcode != 259) {
                switch (opcode) {
                    case ByteCodes.iadd:
                        return this.syms.intType.constType(Integer.valueOf(intValue(l) + intValue(r)));
                    case ByteCodes.ladd:
                        return this.syms.longType.constType(new Long(longValue(l) + longValue(r)));
                    case ByteCodes.fadd:
                        return this.syms.floatType.constType(new Float(floatValue(l) + floatValue(r)));
                    case ByteCodes.dadd:
                        return this.syms.doubleType.constType(new Double(doubleValue(l) + doubleValue(r)));
                    case ByteCodes.isub:
                        return this.syms.intType.constType(Integer.valueOf(intValue(l) - intValue(r)));
                    case ByteCodes.lsub:
                        return this.syms.longType.constType(new Long(longValue(l) - longValue(r)));
                    case ByteCodes.fsub:
                        return this.syms.floatType.constType(new Float(floatValue(l) - floatValue(r)));
                    case ByteCodes.dsub:
                        return this.syms.doubleType.constType(new Double(doubleValue(l) - doubleValue(r)));
                    case ByteCodes.imul:
                        return this.syms.intType.constType(Integer.valueOf(intValue(l) * intValue(r)));
                    case ByteCodes.lmul:
                        return this.syms.longType.constType(new Long(longValue(l) * longValue(r)));
                    case ByteCodes.fmul:
                        return this.syms.floatType.constType(new Float(floatValue(l) * floatValue(r)));
                    case ByteCodes.dmul:
                        return this.syms.doubleType.constType(new Double(doubleValue(l) * doubleValue(r)));
                    case ByteCodes.idiv:
                        return this.syms.intType.constType(Integer.valueOf(intValue(l) / intValue(r)));
                    case ByteCodes.ldiv:
                        return this.syms.longType.constType(new Long(longValue(l) / longValue(r)));
                    case ByteCodes.fdiv:
                        return this.syms.floatType.constType(new Float(floatValue(l) / floatValue(r)));
                    case ByteCodes.ddiv:
                        return this.syms.doubleType.constType(new Double(doubleValue(l) / doubleValue(r)));
                    case ByteCodes.imod:
                        return this.syms.intType.constType(Integer.valueOf(intValue(l) % intValue(r)));
                    case ByteCodes.lmod:
                        return this.syms.longType.constType(new Long(longValue(l) % longValue(r)));
                    case ByteCodes.fmod:
                        return this.syms.floatType.constType(new Float(floatValue(l) % floatValue(r)));
                    case ByteCodes.dmod:
                        return this.syms.doubleType.constType(new Double(doubleValue(l) % doubleValue(r)));
                    default:
                        switch (opcode) {
                            case ByteCodes.ishl:
                                return this.syms.intType.constType(Integer.valueOf(intValue(l) << intValue(r)));
                            case ByteCodes.lshl:
                                return this.syms.longType.constType(new Long(longValue(l) << intValue(r)));
                            case ByteCodes.ishr:
                                return this.syms.intType.constType(Integer.valueOf(intValue(l) >> intValue(r)));
                            case ByteCodes.lshr:
                                return this.syms.longType.constType(new Long(longValue(l) >> intValue(r)));
                            case ByteCodes.iushr:
                                return this.syms.intType.constType(Integer.valueOf(intValue(l) >>> intValue(r)));
                            case ByteCodes.lushr:
                                return this.syms.longType.constType(new Long(longValue(l) >>> intValue(r)));
                            case ByteCodes.iand:
                                return (left.f344tag == 8 ? this.syms.booleanType : this.syms.intType).constType(Integer.valueOf(intValue(l) & intValue(r)));
                            case 127:
                                return this.syms.longType.constType(new Long(longValue(l) & longValue(r)));
                            case 128:
                                return (left.f344tag == 8 ? this.syms.booleanType : this.syms.intType).constType(Integer.valueOf(intValue(l) | intValue(r)));
                            case ByteCodes.f416lor:
                                return this.syms.longType.constType(new Long(longValue(l) | longValue(r)));
                            case ByteCodes.ixor:
                                return (left.f344tag == 8 ? this.syms.booleanType : this.syms.intType).constType(Integer.valueOf(intValue(l) ^ intValue(r)));
                            case ByteCodes.lxor:
                                return this.syms.longType.constType(new Long(longValue(l) ^ longValue(r)));
                            default:
                                switch (opcode) {
                                    case ByteCodes.lcmp:
                                        if (longValue(l) < longValue(r)) {
                                            return this.syms.intType.constType(minusOne);
                                        }
                                        if (longValue(l) > longValue(r)) {
                                            return this.syms.intType.constType(f367one);
                                        }
                                        return this.syms.intType.constType(zero);
                                    case ByteCodes.fcmpl:
                                    case ByteCodes.fcmpg:
                                        if (floatValue(l) < floatValue(r)) {
                                            return this.syms.intType.constType(minusOne);
                                        }
                                        if (floatValue(l) > floatValue(r)) {
                                            return this.syms.intType.constType(f367one);
                                        }
                                        if (floatValue(l) == floatValue(r)) {
                                            return this.syms.intType.constType(zero);
                                        }
                                        if (opcode == 150) {
                                            return this.syms.intType.constType(f367one);
                                        }
                                        return this.syms.intType.constType(minusOne);
                                    case ByteCodes.dcmpl:
                                    case ByteCodes.dcmpg:
                                        if (doubleValue(l) < doubleValue(r)) {
                                            return this.syms.intType.constType(minusOne);
                                        }
                                        if (doubleValue(l) > doubleValue(r)) {
                                            return this.syms.intType.constType(f367one);
                                        }
                                        if (doubleValue(l) == doubleValue(r)) {
                                            return this.syms.intType.constType(zero);
                                        }
                                        if (opcode == 152) {
                                            return this.syms.intType.constType(f367one);
                                        }
                                        return this.syms.intType.constType(minusOne);
                                    default:
                                        switch (opcode) {
                                            case ByteCodes.if_icmpeq:
                                                Type type2 = this.syms.booleanType;
                                                if (intValue(l) != intValue(r)) {
                                                    z = false;
                                                }
                                                return type2.constType(m464b2i(z));
                                            case ByteCodes.if_icmpne:
                                                Type type3 = this.syms.booleanType;
                                                if (intValue(l) == intValue(r)) {
                                                    z = false;
                                                }
                                                return type3.constType(m464b2i(z));
                                            case ByteCodes.if_icmplt:
                                                Type type4 = this.syms.booleanType;
                                                if (intValue(l) >= intValue(r)) {
                                                    z = false;
                                                }
                                                return type4.constType(m464b2i(z));
                                            case ByteCodes.if_icmpge:
                                                Type type5 = this.syms.booleanType;
                                                if (intValue(l) < intValue(r)) {
                                                    z = false;
                                                }
                                                return type5.constType(m464b2i(z));
                                            case ByteCodes.if_icmpgt:
                                                Type type6 = this.syms.booleanType;
                                                if (intValue(l) <= intValue(r)) {
                                                    z = false;
                                                }
                                                return type6.constType(m464b2i(z));
                                            case ByteCodes.if_icmple:
                                                Type type7 = this.syms.booleanType;
                                                if (intValue(l) > intValue(r)) {
                                                    z = false;
                                                }
                                                return type7.constType(m464b2i(z));
                                            case ByteCodes.if_acmpeq:
                                                return this.syms.booleanType.constType(m464b2i(l.equals(r)));
                                            case ByteCodes.if_acmpne:
                                                Type type8 = this.syms.booleanType;
                                                if (l.equals(r)) {
                                                    z = false;
                                                }
                                                return type8.constType(m464b2i(z));
                                            default:
                                                switch (opcode) {
                                                    case ByteCodes.ishll:
                                                        return this.syms.intType.constType(Integer.valueOf(intValue(l) << intValue(r)));
                                                    case ByteCodes.lshll:
                                                        return this.syms.longType.constType(new Long(longValue(l) << intValue(r)));
                                                    case ByteCodes.ishrl:
                                                        return this.syms.intType.constType(Integer.valueOf(intValue(l) >> intValue(r)));
                                                    case ByteCodes.lshrl:
                                                        return this.syms.longType.constType(new Long(longValue(l) >> intValue(r)));
                                                    case ByteCodes.iushrl:
                                                        return this.syms.intType.constType(Integer.valueOf(intValue(l) >>> intValue(r)));
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
            }
            Type type9 = this.syms.booleanType;
            if ((intValue(l) | intValue(r)) == 0) {
                z = false;
            }
            return type9.constType(m464b2i(z));
        } catch (ArithmeticException e) {
            return null;
        }
    }

    Type coerce(Type etype, Type ttype) {
        if (etype.tsym.type == ttype.tsym.type) {
            return etype;
        }
        if (etype.f344tag <= 7) {
            Object n = etype.constValue();
            switch (ttype.f344tag) {
                case 1:
                    return this.syms.byteType.constType(Integer.valueOf(((byte) intValue(n)) + 0));
                case 2:
                    return this.syms.charType.constType(Integer.valueOf(((char) intValue(n)) + 0));
                case 3:
                    return this.syms.shortType.constType(Integer.valueOf(((short) intValue(n)) + 0));
                case 4:
                    return this.syms.intType.constType(Integer.valueOf(intValue(n)));
                case 5:
                    return this.syms.longType.constType(Long.valueOf(longValue(n)));
                case 6:
                    return this.syms.floatType.constType(Float.valueOf(floatValue(n)));
                case 7:
                    return this.syms.doubleType.constType(Double.valueOf(doubleValue(n)));
            }
        }
        return ttype;
    }
}
