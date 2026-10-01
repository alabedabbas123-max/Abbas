package org.c.a.a.c.a.a.c;

import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttCode;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLineNumberTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTypeTable;
import org.apache.commons.io.FilenameUtils;
import org.c.a.a.b.a.ClassB;
import org.c.a.a.b.a.ClassD;
import org.c.a.a.b.a.a.ag;
import org.c.a.a.b.a.a.ah;
import org.c.a.a.b.a.a.ai;
import org.c.a.a.b.a.a.ClassF;
import org.c.a.a.b.a.a.ClassK;
import org.c.a.a.b.a.a.ClassL;
import org.c.a.a.b.a.a.ClassM;
import org.c.a.a.b.a.a.ClassW;
import org.c.a.a.b.a.b.Abstracta;
import org.c.a.a.b.a.b.ClassB;
import org.c.a.a.b.a.b.ClassC;
import org.c.a.a.b.a.b.ClassD;
import org.c.a.a.b.a.b.ClassE;
import org.c.a.a.b.a.b.ClassF;
import org.c.a.a.b.a.b.ClassG;
import org.c.a.a.b.a.b.ClassJ;
import org.c.a.a.b.a.b.ClassK;
import org.c.a.a.b.a.b.ClassL;

public class ClassG {

    protected static final String[] f6138a = {"nop", "aconst_null", "iconst_m1", "iconst_0", "iconst_1", "iconst_2", "iconst_3", "iconst_4", "iconst_5", "lconst_0", "lconst_1", "fconst_0", "fconst_1", "fconst_2", "dconst_0", "dconst_1", "bipush", "sipush", "ldc", "ldc_w", "ldc2_w", "iload", "lload", "fload", "dload", "aload", "iload_0", "iload_1", "iload_2", "iload_3", "lload_0", "lload_1", "lload_2", "lload_3", "fload_0", "fload_1", "fload_2", "fload_3", "dload_0", "dload_1", "dload_2", "dload_3", "aload_0", "aload_1", "aload_2", "aload_3", "iaload", "laload", "faload", "daload", "aaload", "baload", "caload", "saload", "istore", "lstore", "fstore", "dstore", "astore", "istore_0", "istore_1", "istore_2", "istore_3", "lstore_0", "lstore_1", "lstore_2", "lstore_3", "fstore_0", "fstore_1", "fstore_2", "fstore_3", "dstore_0", "dstore_1", "dstore_2", "dstore_3", "astore_0", "astore_1", "astore_2", "astore_3", "iastore", "lastore", "fastore", "dastore", "aastore", "bastore", "castore", "sastore", "pop", "pop2", "dup", "dup_x1", "dup_x2", "dup2", "dup2_x1", "dup2_x2", "swap", "iadd", "ladd", "fadd", "dadd", "isub", "lsub", "fsub", "dsub", "imul", "lmul", "fmul", "dmul", "idiv", "ldiv", "fdiv", "ddiv", "irem", "lrem", "frem", "drem", "ineg", "lneg", "fneg", "dneg", "ishl", "lshl", "ishr", "lshr", "iushr", "lushr", "iand", "land", "ior", "lor", "ixor", "lxor", "iinc", "i2l", "i2f", "i2d", "l2i", "l2f", "l2d", "f2i", "f2l", "f2d", "d2i", "d2l", "d2f", "i2b", "i2c", "i2s", "lcmp", "fcmpl", "fcmpg", "dcmpl", "dcmpg", "ifeq", "ifne", "iflt", "ifge", "ifgt", "ifle", "if_icmpeq", "if_icmpne", "if_icmplt", "if_icmpge", "if_icmpgt", "if_icmple", "if_acmpeq", "if_acmpne", "goto", "jsr", "ret", "tableswitch", "lookupswitch", "ireturn", "lreturn", "freturn", "dreturn", "areturn", "return", "getstatic", "putstatic", "getfield", "putfield", "invokevirtual", "invokespecial", "invokestatic", "invokeinterface", "<illegal opcode>", "new", "newarray", "anewarray", "arraylength", "athrow", "checkcast", "instanceof", "monitorenter", "monitorexit", "wide", "multianewarray", "ifnull", "ifnonnull", "goto_w", "jsr_w", "breakpoint", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "<illegal opcode>", "impdep1", "impdep2"};

    public static String m8523a(String str, ClassD c1877d) {
        ClassF c1841f = (ClassF) c1877d.m7684a(AttCode.ATTRIBUTE_NAME);
        if (c1841f == null) {
            return null;
        }
        ClassB c1862bM7687d = c1877d.m7687d();
        StringBuilder sb = new StringBuilder(Config.MAX_CACHE_JSON_CAPACIT_EXCEPTION);
        m8525a(str, sb, c1862bM7687d, c1841f);
        m8524a(str, sb, c1841f);
        m8528b(str, sb, c1841f);
        m8529b(str, sb, c1862bM7687d, c1841f);
        return sb.toString();
    }

    protected static void m8524a(String str, StringBuilder sb, ClassF c1841f) {
        ClassK c1846k = (ClassK) c1841f.m7634a(AttLineNumberTable.ATTRIBUTE_NAME);
        if (c1846k != null) {
            sb.append(str).append("Line number table:\n");
            sb.append(str).append("  Java source line number -> byte code offset\n");
            ag[] c1829agArrM7640a = c1846k.m7640a();
            for (ag c1829ag : c1829agArrM7640a) {
                sb.append(str).append("  #");
                sb.append(c1829ag.m7612b()).append("\t-> ");
                sb.append(c1829ag.m7611a()).append('\n');
            }
        }
    }

    protected static void m8525a(String str, StringBuilder sb, ClassB c1862b, ClassF c1841f) {
        byte[] bArrM7635a = c1841f.m7635a();
        int length = bArrM7635a.length;
        sb.append(str).append("Byte code:\n");
        m8526a(str, sb, c1862b, bArrM7635a, 0, length);
    }

    protected static void m8526a(String str, StringBuilder sb, ClassB c1862b, byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i;
        while (i4 < i2) {
            int i5 = bArr[i4] & 255;
            sb.append(str).append("  ").append(i4).append(": ").append(f6138a[i5]);
            switch (i5) {
                case 16:
                    i3 = i4 + 1;
                    sb.append(" #").append((int) ((byte) (bArr[i3] & 255)));
                    break;
                case 17:
                    StringBuilder sbAppend = sb.append(" #");
                    int i6 = i4 + 1;
                    int i7 = (bArr[i6] & 255) << 8;
                    i3 = i6 + 1;
                    sbAppend.append((int) ((short) (i7 | (bArr[i3] & 255))));
                    break;
                case 18:
                    i3 = i4 + 1;
                    m8527a(sb, c1862b, c1862b.m7660a(bArr[i3] & 255));
                    break;
                case 19:
                case 20:
                    int i8 = i4 + 1;
                    int i9 = (bArr[i8] & 255) << 8;
                    i3 = i8 + 1;
                    m8527a(sb, c1862b, c1862b.m7660a(i9 | (bArr[i3] & 255)));
                    break;
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 169:
                    i3 = i4 + 1;
                    sb.append(" #").append(bArr[i3] & 255);
                    break;
                case 132:
                    int i10 = i4 + 1;
                    i3 = i10 + 1;
                    sb.append(" #").append(bArr[i10] & 255).append(", ").append((int) ((byte) (bArr[i3] & 255)));
                    break;
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                    StringBuilder sbAppend2 = sb.append(" -> ");
                    int i11 = i4 + 1;
                    int i12 = (bArr[i11] & 255) << 8;
                    i3 = i11 + 1;
                    sbAppend2.append(i4 + ((short) (i12 | (bArr[i3] & 255))));
                    break;
                case 170:
                    int i13 = (i4 + 4) & 65532;
                    StringBuilder sbAppend3 = sb.append(" default").append(" -> ");
                    int i14 = i13 + 1;
                    int i15 = i14 + 1;
                    int i16 = ((bArr[i13] & 255) << 24) | ((bArr[i14] & 255) << 16);
                    int i17 = i15 + 1;
                    int i18 = i16 | ((bArr[i15] & 255) << 8);
                    int i19 = i17 + 1;
                    sbAppend3.append((i18 | (bArr[i17] & 255)) + i4);
                    int i20 = i19 + 1;
                    int i21 = i20 + 1;
                    int i22 = i21 + 1;
                    int i23 = ((bArr[i20] & 255) << 16) | ((bArr[i19] & 255) << 24) | ((bArr[i21] & 255) << 8);
                    int i24 = i22 + 1;
                    int i25 = i24 + 1;
                    int i26 = i25 + 1;
                    int i27 = ((bArr[i25] & 255) << 16) | ((bArr[i24] & 255) << 24);
                    int i28 = i26 + 1;
                    int i29 = ((bArr[i26] & 255) << 8) | i27;
                    int i30 = i28 + 1;
                    int i31 = (bArr[i28] & 255) | i29;
                    for (int i32 = i23 | (bArr[i22] & 255); i32 <= i31; i32++) {
                        StringBuilder sbAppend4 = sb.append(", ").append(i32).append(" -> ");
                        int i33 = i30 + 1;
                        int i34 = i33 + 1;
                        int i35 = ((bArr[i30] & 255) << 24) | ((bArr[i33] & 255) << 16);
                        int i36 = i34 + 1;
                        int i37 = ((bArr[i34] & 255) << 8) | i35;
                        i30 = i36 + 1;
                        sbAppend4.append(((bArr[i36] & 255) | i37) + i4);
                    }
                    i3 = i30 - 1;
                    break;
                case 171:
                    int i38 = (i4 + 4) & 65532;
                    StringBuilder sbAppend5 = sb.append(" default").append(" -> ");
                    int i39 = i38 + 1;
                    int i40 = i39 + 1;
                    int i41 = ((bArr[i38] & 255) << 24) | ((bArr[i39] & 255) << 16);
                    int i42 = i40 + 1;
                    int i43 = i41 | ((bArr[i40] & 255) << 8);
                    int i44 = i42 + 1;
                    sbAppend5.append((i43 | (bArr[i42] & 255)) + i4);
                    int i45 = i44 + 1;
                    int i46 = (bArr[i44] & 255) << 24;
                    int i47 = i45 + 1;
                    int i48 = i47 + 1;
                    int i49 = ((bArr[i45] & 255) << 16) | i46 | ((bArr[i47] & 255) << 8);
                    int i50 = i48 + 1;
                    int i51 = (bArr[i48] & 255) | i49;
                    for (int i52 = 0; i52 < i51; i52++) {
                        StringBuilder sbAppend6 = sb.append(", ");
                        int i53 = i50 + 1;
                        int i54 = i53 + 1;
                        int i55 = ((bArr[i50] & 255) << 24) | ((bArr[i53] & 255) << 16);
                        int i56 = i54 + 1;
                        int i57 = i55 | ((bArr[i54] & 255) << 8);
                        int i58 = i56 + 1;
                        sbAppend6.append(i57 | (bArr[i56] & 255));
                        StringBuilder sbAppend7 = sb.append(" -> ");
                        int i59 = i58 + 1;
                        int i60 = (bArr[i58] & 255) << 24;
                        int i61 = i59 + 1;
                        int i62 = ((bArr[i59] & 255) << 16) | i60;
                        int i63 = i61 + 1;
                        int i64 = ((bArr[i61] & 255) << 8) | i62;
                        i50 = i63 + 1;
                        sbAppend7.append(((bArr[i63] & 255) | i64) + i4);
                    }
                    i3 = i50 - 1;
                    break;
                case 178:
                case 179:
                    int i65 = i4 + 1;
                    int i66 = i65 + 1;
                    ClassG c1869g = (ClassG) c1862b.m7660a((bArr[i66] & 255) | ((bArr[i65] & 255) << 8));
                    String strM7661b = c1862b.m7661b(c1869g.m7671b());
                    ClassJ c1872j = (ClassJ) c1862b.m7660a(c1869g.m7672c());
                    sb.append(" ").append(strM7661b).append(FilenameUtils.EXTENSION_SEPARATOR).append(c1862b.m7663d(c1872j.m7675b())).append(" : ").append(c1862b.m7663d(c1872j.m7676c()));
                    i3 = i66;
                    break;
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                    int i67 = i4 + 1;
                    int i68 = i67 + 1;
                    ClassJ c1872j2 = (ClassJ) c1862b.m7660a(((ClassG) c1862b.m7660a((bArr[i68] & 255) | ((bArr[i67] & 255) << 8))).m7672c());
                    sb.append(" ").append(c1862b.m7663d(c1872j2.m7675b())).append(" : ").append(c1862b.m7663d(c1872j2.m7676c()));
                    i3 = i68;
                    break;
                case 185:
                case 186:
                    int i69 = i4 + 1;
                    int i70 = i69 + 1;
                    ClassJ c1872j3 = (ClassJ) c1862b.m7660a(((ClassG) c1862b.m7660a((bArr[i70] & 255) | ((bArr[i69] & 255) << 8))).m7672c());
                    sb.append(" ").append(c1862b.m7663d(c1872j3.m7675b())).append(" : ").append(c1862b.m7663d(c1872j3.m7676c()));
                    i3 = i70 + 2;
                    break;
                case 187:
                case 189:
                case 192:
                case 193:
                    int i71 = i4 + 1;
                    int i72 = (bArr[i71] & 255) << 8;
                    i3 = i71 + 1;
                    sb.append(" ").append(c1862b.m7661b(i72 | (bArr[i3] & 255)));
                    break;
                case 188:
                    i3 = i4 + 1;
                    switch (bArr[i3] & 255) {
                        case 4:
                            sb.append(" boolean");
                            break;
                        case 5:
                            sb.append(" char");
                            break;
                        case 6:
                            sb.append(" float");
                            break;
                        case 7:
                            sb.append(" double");
                            break;
                        case 8:
                            sb.append(" byte");
                            break;
                        case 9:
                            sb.append(" short");
                            break;
                        case 10:
                            sb.append(" int");
                            break;
                        case 11:
                            sb.append(" long");
                            break;
                    }
                    break;
                case 196:
                    int i73 = i4 + 1;
                    int i74 = bArr[i73] & 255;
                    int i75 = i73 + 1;
                    int i76 = (bArr[i75] & 255) << 8;
                    i3 = i75 + 1;
                    int i77 = i76 | (bArr[i3] & 255);
                    if (i74 == 132) {
                        StringBuilder sbAppend8 = sb.append(" iinc #").append(i77).append(' ');
                        int i78 = i3 + 1;
                        int i79 = (bArr[i78] & 255) << 8;
                        i3 = i78 + 1;
                        sbAppend8.append((int) ((short) (i79 | (bArr[i3] & 255))));
                        break;
                    } else {
                        switch (i74) {
                            case 21:
                                sb.append(" iload #").append(i77);
                                break;
                            case 22:
                                sb.append(" lload #").append(i77);
                                break;
                            case 23:
                                sb.append(" fload #").append(i77);
                                break;
                            case 24:
                                sb.append(" dload #").append(i77);
                                break;
                            case 25:
                                sb.append(" aload #").append(i77);
                                break;
                            case 54:
                                sb.append(" istore #").append(i77);
                                break;
                            case 55:
                                sb.append(" lstore #").append(i77);
                                break;
                            case 56:
                                sb.append(" fstore #").append(i77);
                                break;
                            case 57:
                                sb.append(" dstore #").append(i77);
                                break;
                            case 58:
                                sb.append(" astore #").append(i77);
                                break;
                            case 169:
                                sb.append(" ret #").append(i77);
                                break;
                        }
                    }
                    break;
                case 197:
                    int i80 = i4 + 1;
                    int i81 = (bArr[i80] & 255) << 8;
                    int i82 = i80 + 1;
                    StringBuilder sbAppend9 = sb.append(c1862b.m7661b(i81 | (bArr[i82] & 255))).append(' ');
                    i3 = i82 + 1;
                    sbAppend9.append(bArr[i3] & 255);
                    break;
                case 198:
                case 199:
                    StringBuilder sbAppend10 = sb.append(" -> ");
                    int i83 = i4 + 1;
                    int i84 = (bArr[i83] & 255) << 8;
                    i3 = i83 + 1;
                    sbAppend10.append(i4 + ((short) (i84 | (bArr[i3] & 255))));
                    break;
                case 200:
                case 201:
                    StringBuilder sbAppend11 = sb.append(" -> ");
                    int i85 = i4 + 1;
                    int i86 = (bArr[i85] & 255) << 24;
                    int i87 = i85 + 1;
                    int i88 = i86 | ((bArr[i87] & 255) << 16);
                    int i89 = i87 + 1;
                    int i90 = i88 | ((bArr[i89] & 255) << 8);
                    i3 = i89 + 1;
                    sbAppend11.append(i4 + (i90 | (bArr[i3] & 255)));
                    break;
                default:
                    i3 = i4;
                    break;
            }
            sb.append('\n');
            i4 = i3 + 1;
        }
    }

    protected static void m8527a(StringBuilder sb, ClassB c1862b, Abstracta abstractC1863a) {
        switch (abstractC1863a.m7665a()) {
            case 3:
                sb.append(' ').append(((ClassE) abstractC1863a).m7669b());
                break;
            case 4:
                sb.append(' ').append(((ClassD) abstractC1863a).m7668b());
                break;
            case 5:
                sb.append(' ').append(((ClassF) abstractC1863a).m7670b());
                break;
            case 6:
                sb.append(' ').append(((ClassC) abstractC1863a).m7667b());
                break;
            case 7:
                sb.append(' ').append(((ClassL) c1862b.m7660a(((ClassB) abstractC1863a).m7666b())).m7678b());
                break;
            case 8:
                sb.append(" '");
                for (char c : c1862b.m7663d(((ClassK) abstractC1863a).m7677b()).toCharArray()) {
                    switch (c) {
                        case '\b':
                            sb.append("\\\\b");
                            break;
                        case '\t':
                            sb.append("\\\\t");
                            break;
                        case '\n':
                            sb.append("\\\\n");
                            break;
                        case 11:
                        default:
                            sb.append(c);
                            break;
                        case '\f':
                            sb.append("\\\\f");
                            break;
                        case '\r':
                            sb.append("\\\\r");
                            break;
                    }
                }
                sb.append("'");
                break;
        }
    }

    protected static void m8528b(String str, StringBuilder sb, ClassF c1841f) {
        ClassL c1847l = (ClassL) c1841f.m7634a(AttLocalVariableTable.ATTRIBUTE_NAME);
        if (c1847l != null) {
            sb.append(str).append("Local variable table:\n");
            sb.append(str).append("  start\tlength\tslot\tname\tdescriptor\n");
            ah[] c1830ahArrM7641a = c1847l.m7641a();
            for (ah c1830ah : c1830ahArrM7641a) {
                sb.append(str).append("  ");
                sb.append(c1830ah.m7613a()).append('\t');
                sb.append(c1830ah.m7614b()).append('\t');
                sb.append(c1830ah.m7617e()).append('\t');
                sb.append(c1830ah.m7615c()).append('\t');
                sb.append(c1830ah.m7616d()).append('\n');
            }
        }
        ClassM c1848m = (ClassM) c1841f.m7634a(AttLocalVariableTypeTable.ATTRIBUTE_NAME);
        if (c1848m != null) {
            sb.append(str).append("Local variable type table:\n");
            sb.append(str).append("  start\tlength\tslot\tname\tsignature\n");
            ai[] c1831aiArrM7642a = c1848m.m7642a();
            for (ai c1831ai : c1831aiArrM7642a) {
                sb.append(str).append("  ");
                sb.append(c1831ai.m7618a()).append('\t');
                sb.append(c1831ai.m7619b()).append('\t');
                sb.append(c1831ai.m7622e()).append('\t');
                sb.append(c1831ai.m7620c()).append('\t');
                sb.append(c1831ai.m7621d()).append('\n');
            }
        }
    }

    protected static void m8529b(String str, StringBuilder sb, ClassB c1862b, ClassF c1841f) {
        ClassW[] c1858wArrM7636b = c1841f.m7636b();
        if (c1858wArrM7636b != null) {
            sb.append(str).append("Exception table:\n");
            sb.append(str).append("  from\tto\ttarget\ttype\n");
            for (ClassW c1858w : c1858wArrM7636b) {
                sb.append(str).append("  ");
                sb.append(c1858w.m7654a()).append('\t');
                sb.append(c1858w.m7655b()).append('\t');
                sb.append(c1858w.m7656c()).append('\t');
                if (c1858w.m7657d() == 0) {
                    sb.append("finally");
                } else {
                    sb.append(c1862b.m7661b(c1858w.m7657d()));
                }
                sb.append('\n');
            }
        }
    }
}
