package org.c.a.a.c.a.a.c;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttCode;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLineNumberTable;
import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.c.a.a.b.a.ClassB;
import org.c.a.a.b.a.ClassD;
import org.c.a.a.b.a.a.ag;
import org.c.a.a.b.a.a.ClassF;
import org.c.a.a.b.a.a.ClassK;
import org.c.a.a.b.a.a.ClassW;
import org.c.a.a.b.a.b.ClassG;
import org.c.a.a.b.a.b.ClassJ;
import org.c.a.a.c.a.a.a.a.ClassA;
import org.c.a.a.c.a.a.a.a.ClassE;
import org.c.a.a.c.a.a.a.a.ClassF;
import org.c.a.a.d.ClassC;

public class ClassK {

    protected static final ClassA f6140a = ClassA.f5966h;

    protected static final ClassL f6141b = new ClassL();

    /* JADX WARN: Multi-variable type inference failed */
    public static ClassF m8549a(ClassD c1877d) {
        ClassA c2085aM8256a;
        int i;
        int i2;
        ClassF c1841f = (ClassF) c1877d.m7684a(AttCode.ATTRIBUTE_NAME);
        if (c1841f == null) {
            return null;
        }
        ClassB c1862bM7687d = c1877d.m7687d();
        byte[] bArrM7635a = c1841f.m7635a();
        int length = bArrM7635a.length;
        ClassA[] c2085aArr = new ClassA[length];
        char[] cArr = new char[length];
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int[][] iArr3 = new int[length][];
        int[][] iArr4 = new int[length][];
        c2085aArr[0] = f6140a;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (i5 < length) {
            iArr[i3] = i5;
            switch (bArrM7635a[i5] & 255) {
                case 16:
                case 18:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 188:
                    i = i5 + 1;
                    break;
                case 17:
                case 19:
                case 20:
                case 178:
                case 180:
                case 187:
                case 189:
                case 192:
                case 193:
                    i = i5 + 2;
                    break;
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 133:
                case 134:
                case 135:
                case 136:
                case 137:
                case 138:
                case 139:
                case 140:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 190:
                default:
                    i = i5;
                    break;
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                    i = i5 + 1;
                    i4 = i;
                    break;
                case 59:
                case 60:
                case 61:
                case ByteOps.ISTORE_3:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 194:
                case 195:
                    i = i5;
                    i4 = i5;
                    break;
                case 132:
                    i = i5 + 2;
                    if (i4 + 3 == i && !m8550a(bArrM7635a, i, bArrM7635a[i - 1] & 255)) {
                        i4 = i;
                    }
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
                case 198:
                case 199:
                    if (i4 != -1) {
                        c2085aArr[i4 + 1] = f6140a;
                    }
                    int i6 = i5 + 1;
                    int i7 = (bArrM7635a[i6] & 255) << 8;
                    i = i6 + 1;
                    int i8 = ((short) (i7 | (bArrM7635a[i] & 255))) + i5;
                    c2085aArr[i8] = f6140a;
                    cArr[i] = 'c';
                    iArr2[i] = i8;
                    if (i + 1 < length) {
                        c2085aArr[i + 1] = f6140a;
                    }
                    i4 = i;
                    break;
                case 167:
                    char c = i4 + 1 == i5 ? 'g' : 'G';
                    if (i4 != -1) {
                        c2085aArr[i4 + 1] = f6140a;
                    }
                    cArr[i5] = c;
                    int i9 = i5 + 1;
                    int i10 = (bArrM7635a[i9] & 255) << 8;
                    i = i9 + 1;
                    int i11 = ((short) (i10 | (bArrM7635a[i] & 255))) + i5;
                    c2085aArr[i11] = f6140a;
                    cArr[i] = c;
                    iArr2[i] = i11;
                    if (i + 1 < length) {
                        c2085aArr[i + 1] = f6140a;
                    }
                    i4 = i;
                    break;
                case 168:
                    if (i4 != -1) {
                        c2085aArr[i4 + 1] = f6140a;
                    }
                    cArr[i5] = 'j';
                    int i12 = i5 + 1;
                    int i13 = (bArrM7635a[i12] & 255) << 8;
                    i = i12 + 1;
                    int i14 = ((short) (i13 | (bArrM7635a[i] & 255))) + i5;
                    c2085aArr[i14] = f6140a;
                    cArr[i] = 'j';
                    iArr2[i] = i14;
                    if (i + 1 < length) {
                        c2085aArr[i + 1] = f6140a;
                    }
                    i4 = i;
                    break;
                case 169:
                    i = i5 + 1;
                    cArr[i] = 'R';
                    if (i + 1 < length) {
                        c2085aArr[i + 1] = f6140a;
                    }
                    i4 = i;
                    break;
                case 170:
                    int i15 = (i5 + 4) & 65532;
                    int i16 = i15 + 1;
                    int i17 = i16 + 1;
                    int i18 = ((bArrM7635a[i15] & 255) << 24) | ((bArrM7635a[i16] & 255) << 16);
                    int i19 = i17 + 1;
                    int i20 = i18 | ((bArrM7635a[i17] & 255) << 8);
                    int i21 = i19 + 1;
                    int i22 = (i20 | (bArrM7635a[i19] & 255)) + i5;
                    c2085aArr[i22] = f6140a;
                    int i23 = i21 + 1;
                    int i24 = i23 + 1;
                    int i25 = ((bArrM7635a[i23] & 255) << 16) | ((bArrM7635a[i21] & 255) << 24);
                    int i26 = i24 + 1;
                    int i27 = i25 | ((bArrM7635a[i24] & 255) << 8);
                    int i28 = i26 + 1;
                    int i29 = (bArrM7635a[i26] & 255) | i27;
                    int i30 = i28 + 1;
                    int i31 = i30 + 1;
                    int i32 = ((bArrM7635a[i30] & 255) << 16) | ((bArrM7635a[i28] & 255) << 24);
                    int i33 = i31 + 1;
                    int i34 = ((bArrM7635a[i31] & 255) << 8) | i32;
                    int i35 = i33 + 1;
                    int i36 = (bArrM7635a[i33] & 255) | i34;
                    int[] iArr5 = new int[(i36 - i29) + 2];
                    int[] iArr6 = new int[(i36 - i29) + 2];
                    iArr6[0] = i22;
                    int i37 = (i36 - i29) + 2;
                    for (int i38 = 1; i38 < i37; i38++) {
                        iArr5[i38] = (i29 + i38) - 1;
                        int i39 = i35 + 1;
                        int i40 = i39 + 1;
                        int i41 = ((bArrM7635a[i35] & 255) << 24) | ((bArrM7635a[i39] & 255) << 16);
                        int i42 = i40 + 1;
                        int i43 = ((bArrM7635a[i40] & 255) << 8) | i41;
                        i35 = i42 + 1;
                        int i44 = ((bArrM7635a[i42] & 255) | i43) + i5;
                        iArr6[i38] = i44;
                        c2085aArr[i44] = f6140a;
                    }
                    i = i35 - 1;
                    cArr[i] = 's';
                    iArr3[i] = iArr5;
                    iArr4[i] = iArr6;
                    i4 = i;
                    break;
                case 171:
                    int i45 = (i5 + 4) & 65532;
                    int i46 = i45 + 1;
                    int i47 = i46 + 1;
                    int i48 = ((bArrM7635a[i45] & 255) << 24) | ((bArrM7635a[i46] & 255) << 16);
                    int i49 = i47 + 1;
                    int i50 = i48 | ((bArrM7635a[i47] & 255) << 8);
                    int i51 = i49 + 1;
                    int i52 = (i50 | (bArrM7635a[i49] & 255)) + i5;
                    c2085aArr[i52] = f6140a;
                    int i53 = i51 + 1;
                    int i54 = i53 + 1;
                    int i55 = ((bArrM7635a[i53] & 255) << 16) | ((bArrM7635a[i51] & 255) << 24);
                    int i56 = i54 + 1;
                    int i57 = ((bArrM7635a[i54] & 255) << 8) | i55;
                    int i58 = i56 + 1;
                    int i59 = (bArrM7635a[i56] & 255) | i57;
                    int[] iArr7 = new int[i59 + 1];
                    int[] iArr8 = new int[i59 + 1];
                    iArr8[0] = i52;
                    for (int i60 = 1; i60 <= i59; i60++) {
                        int i61 = i58 + 1;
                        int i62 = i61 + 1;
                        int i63 = ((bArrM7635a[i58] & 255) << 24) | ((bArrM7635a[i61] & 255) << 16);
                        int i64 = i62 + 1;
                        int i65 = i63 | ((bArrM7635a[i62] & 255) << 8);
                        int i66 = i64 + 1;
                        iArr7[i60] = i65 | (bArrM7635a[i64] & 255);
                        int i67 = i66 + 1;
                        int i68 = (bArrM7635a[i66] & 255) << 24;
                        int i69 = i67 + 1;
                        int i70 = ((bArrM7635a[i67] & 255) << 16) | i68;
                        int i71 = i69 + 1;
                        int i72 = ((bArrM7635a[i69] & 255) << 8) | i70;
                        i58 = i71 + 1;
                        int i73 = ((bArrM7635a[i71] & 255) | i72) + i5;
                        iArr8[i60] = i73;
                        c2085aArr[i73] = f6140a;
                    }
                    i = i58 - 1;
                    cArr[i] = 's';
                    iArr3[i] = iArr7;
                    iArr4[i] = iArr8;
                    i4 = i;
                    break;
                case 172:
                case 173:
                case 174:
                case 175:
                case 176:
                    cArr[i5] = 'v';
                    if (i5 + 1 < length) {
                        c2085aArr[i5 + 1] = f6140a;
                    }
                    i = i5;
                    i4 = i5;
                    break;
                case 177:
                    if (i4 != -1) {
                        c2085aArr[i4 + 1] = f6140a;
                    }
                    cArr[i5] = 'r';
                    if (i5 + 1 < length) {
                        c2085aArr[i5 + 1] = f6140a;
                    }
                    i = i5;
                    i4 = i5;
                    break;
                case 179:
                case 181:
                    i = i5 + 2;
                    i4 = i;
                    break;
                case 182:
                case 183:
                case 184:
                    int i74 = i5 + 1;
                    int i75 = i74 + 1;
                    String strM7663d = c1862bM7687d.m7663d(((ClassJ) c1862bM7687d.m7660a(((ClassG) c1862bM7687d.m7660a((bArrM7635a[i75] & 255) | ((bArrM7635a[i74] & 255) << 8))).m7672c())).m7676c());
                    if (strM7663d.charAt(strM7663d.length() - 1) == 'V') {
                        i = i75;
                        i4 = i75;
                    } else {
                        i = i75;
                    }
                    break;
                case 185:
                case 186:
                    int i76 = i5 + 1;
                    int i77 = i76 + 1;
                    String strM7663d2 = c1862bM7687d.m7663d(((ClassJ) c1862bM7687d.m7660a(((ClassG) c1862bM7687d.m7660a((bArrM7635a[i77] & 255) | ((bArrM7635a[i76] & 255) << 8))).m7672c())).m7676c());
                    i = i77 + 2;
                    if (strM7663d2.charAt(strM7663d2.length() - 1) == 'V') {
                        i4 = i;
                    }
                    break;
                case 191:
                    cArr[i5] = 't';
                    if (i5 + 1 < length) {
                        c2085aArr[i5 + 1] = f6140a;
                    }
                    i = i5;
                    i4 = i5;
                    break;
                case 196:
                    int i78 = i5 + 1;
                    switch (bArrM7635a[i78] & 255) {
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                            i2 = i78 + 2;
                            break;
                        case 132:
                            i = i78 + 4;
                            if (i4 + 6 != i) {
                                continue;
                            } else if (!m8550a(bArrM7635a, i, ((bArrM7635a[i - 3] & 255) << 8) | (bArrM7635a[i - 2] & 255))) {
                                i4 = i;
                            }
                            break;
                        case 169:
                            i = i78 + 2;
                            cArr[i] = 'R';
                            if (i + 1 < length) {
                                c2085aArr[i + 1] = f6140a;
                            }
                            i4 = i;
                            continue;
                        default:
                            i2 = i4;
                            break;
                    }
                    i4 = i2;
                    i = i78 + 2;
                    break;
                case 197:
                    i = i5 + 3;
                    break;
                case 200:
                    char c2 = i4 + 1 == i5 ? 'g' : 'G';
                    cArr[i5] = c2;
                    int i79 = i5 + 1;
                    int i80 = (bArrM7635a[i79] & 255) << 24;
                    int i81 = i79 + 1;
                    int i82 = i80 | ((bArrM7635a[i81] & 255) << 16);
                    int i83 = i81 + 1;
                    int i84 = i82 | ((bArrM7635a[i83] & 255) << 8);
                    i4 = i83 + 1;
                    int i85 = (i84 | (bArrM7635a[i4] & 255)) + i5;
                    c2085aArr[i85] = f6140a;
                    cArr[i4] = c2;
                    iArr2[i4] = i85;
                    if (i4 + 1 < length) {
                        c2085aArr[i4 + 1] = f6140a;
                    }
                    i = i4;
                    break;
                case 201:
                    if (i4 != -1) {
                        c2085aArr[i4 + 1] = f6140a;
                    }
                    cArr[i5] = 'j';
                    int i86 = i5 + 1;
                    int i87 = (bArrM7635a[i86] & 255) << 24;
                    int i88 = i86 + 1;
                    int i89 = i87 | ((bArrM7635a[i88] & 255) << 16);
                    int i90 = i88 + 1;
                    int i91 = i89 | ((bArrM7635a[i90] & 255) << 8);
                    i = i90 + 1;
                    int i92 = (i91 | (bArrM7635a[i] & 255)) + i5;
                    c2085aArr[i92] = f6140a;
                    cArr[i] = 'j';
                    iArr2[i] = i92;
                    if (i + 1 < length) {
                        c2085aArr[i + 1] = f6140a;
                    }
                    i4 = i;
                    break;
            }
            int i93 = i + 1;
            i3 = i5;
            i5 = i93;
        }
        iArr[i3] = length;
        ClassW[] c1858wArrM7636b = c1841f.m7636b();
        if (c1858wArrM7636b != null) {
            for (ClassW c1858w : c1858wArrM7636b) {
                c2085aArr[c1858w.m7654a()] = f6140a;
                c2085aArr[c1858w.m7656c()] = f6140a;
            }
        }
        ClassF c2090f = new ClassF(c1877d);
        ClassK c1846k = (ClassK) c1841f.m7634a(AttLineNumberTable.ATTRIBUTE_NAME);
        if (c1846k != null) {
            ag[] c1829agArrM7640a = c1846k.m7640a();
            int[] iArr9 = new int[length];
            int iM7612b = c1829agArrM7640a[0].m7612b();
            int length2 = c1829agArrM7640a.length;
            int iM7612b2 = iM7612b;
            int i94 = 0;
            for (int i95 = 1; i95 < length2; i95++) {
                ag c1829ag = c1829agArrM7640a[i95];
                int iM7611a = c1829ag.m7611a();
                while (i94 < iM7611a) {
                    iArr9[i94] = iM7612b2;
                    i94++;
                }
                if (iM7612b2 > c1829ag.m7612b()) {
                    c2085aArr[i94] = f6140a;
                }
                iM7612b2 = c1829ag.m7612b();
            }
            while (i94 < length) {
                iArr9[i94] = iM7612b2;
                i94++;
            }
            c2090f.m8260a(iArr9);
        }
        int i96 = 0;
        ClassA c2085aM8256a2 = c2090f.m8256a(1, 0, 0);
        for (int i97 = iArr[0]; i97 < length; i97 = iArr[i97]) {
            if (c2085aArr[i97] != null) {
                c2085aArr[i96] = c2090f.m8255a(i96, i97);
                i96 = i97;
            }
        }
        c2085aArr[i96] = c2090f.m8255a(i96, length);
        ClassC c2247cM8261b = c2090f.m8261b();
        ClassC<ClassA> c2247c = new ClassC(c2247cM8261b.size());
        ClassA c2085a = (ClassA) c2247cM8261b.get(1);
        c2085aM8256a2.m8209a(c2085a);
        c2085a.m8234o().add(c2085aM8256a2);
        int size = c2247cM8261b.size();
        for (int i98 = 1; i98 < size; i98++) {
            ClassA c2085a2 = (ClassA) c2247cM8261b.get(i98);
            int iM8222e = c2085a2.m8222e() - 1;
            switch (cArr[iM8222e]) {
                case 'G':
                    c2085a2.m8206a(268435456);
                    ClassA c2085a3 = c2085aArr[iArr2[iM8222e]];
                    c2085a2.m8209a(c2085a3);
                    c2085a3.m8234o().add(c2085a2);
                    break;
                case 'R':
                    c2085a2.m8206a(16384);
                    c2085a2.m8209a(ClassA.f5966h);
                    break;
                case 'c':
                    c2085a2.m8206a(32768);
                    ClassA c2085a4 = c2085aArr[c2085a2.m8222e()];
                    c2085a2.m8209a(c2085a4);
                    c2085a4.m8234o().add(c2085a2);
                    ClassA c2085a5 = c2085aArr[iArr2[iM8222e]];
                    c2085a2.m8215b(c2085a5);
                    c2085a5.m8234o().add(c2085a2);
                    break;
                case 'g':
                    c2085a2.m8206a(67108864);
                    ClassA c2085a6 = c2085aArr[iArr2[iM8222e]];
                    c2085a2.m8209a(c2085a6);
                    c2085a6.m8234o().add(c2085a2);
                    break;
                case 'j':
                    c2085a2.m8206a(8192);
                    ClassA c2085a7 = c2085aArr[c2085a2.m8222e()];
                    c2085a2.m8209a(c2085a7);
                    c2085a7.m8234o().add(c2085a2);
                    ClassA c2085a8 = c2085aArr[iArr2[iM8222e]];
                    c2085a2.m8215b(c2085a8);
                    c2085a8.m8234o().add(c2085a2);
                    break;
                case 'r':
                    c2085a2.m8206a(16);
                    c2085a2.m8209a(ClassA.f5966h);
                    break;
                case 's':
                    c2085a2.m8206a(64);
                    int[] iArr10 = iArr3[iM8222e];
                    int[] iArr11 = iArr4[iM8222e];
                    ClassC c2247c2 = new ClassC(iArr11.length);
                    int i99 = iArr11[0];
                    ClassA c2085a9 = c2085aArr[i99];
                    c2247c2.add(new ClassE(c2085a9));
                    c2085a9.m8234o().add(c2085a2);
                    int length3 = iArr11.length;
                    for (int i100 = 1; i100 < length3; i100++) {
                        int i101 = iArr11[i100];
                        if (i101 != i99) {
                            ClassA c2085a10 = c2085aArr[i101];
                            c2247c2.add(new ClassE(iArr10[i100], c2085a10));
                            c2085a10.m8234o().add(c2085a2);
                        }
                    }
                    c2085a2.m8211a(c2247c2);
                    break;
                case 't':
                    c2085a2.m8206a(8);
                    c2085a2.m8209a(ClassA.f5966h);
                    break;
                case 'v':
                    c2085a2.m8206a(32);
                    c2085a2.m8209a(ClassA.f5966h);
                    break;
                default:
                    c2085a2.m8206a(4);
                    ClassA c2085a11 = c2085aArr[c2085a2.m8222e()];
                    c2085a2.m8209a(c2085a11);
                    c2085a11.m8234o().add(c2085a2);
                    c2247c.add(c2085a2);
                    break;
            }
        }
        if (c1858wArrM7636b != null) {
            HashMap map = new HashMap();
            ClassB c1862bM7687d2 = c1877d.m7687d();
            Arrays.sort(c1858wArrM7636b, f6141b);
            for (ClassW c1858w2 : c1858wArrM7636b) {
                int iM7654a = c1858w2.m7654a();
                int iM7656c = c1858w2.m7656c();
                if (iM7654a != iM7656c && (cArr[iM7656c] != 'T' || iM7654a <= c2085aArr[iArr2[iM7656c]].m8219d())) {
                    int iM7657d = c1858w2.m7657d();
                    ClassA c2085a12 = (ClassA) map.get(c1858w2);
                    if (c2085a12 == null) {
                        int iM7655b = c1858w2.m7655b();
                        ClassA c2085a13 = c2085aArr[iM7654a];
                        c2085aM8256a = c2090f.m8256a(512, iM7654a, iM7655b);
                        c2085aM8256a.m8209a(c2085a13);
                        HashSet hashSetM8234o = c2085aM8256a.m8234o();
                        HashSet hashSetM8234o2 = c2085a13.m8234o();
                        Iterator it = hashSetM8234o2.iterator();
                        while (it.hasNext()) {
                            ClassA c2085a14 = (ClassA) it.next();
                            if (!c2085a13.m8225f(c2085a14)) {
                                c2085a14.m8210a(c2085a13, c2085aM8256a);
                                hashSetM8234o.add(c2085a14);
                                it.remove();
                            }
                        }
                        hashSetM8234o2.add(c2085aM8256a);
                        c2085aArr[iM7654a] = c2085aM8256a;
                        map.put(c1858w2, c2085aM8256a);
                    } else {
                        c2085aM8256a = c2085a12;
                    }
                    String strM7661b = iM7657d == 0 ? null : c1862bM7687d2.m7661b(iM7657d);
                    ClassA c2085a15 = c2085aArr[iM7656c];
                    c2085aM8256a.m8207a(strM7661b, c2085a15);
                    c2085a15.m8234o().add(c2085aM8256a);
                    iArr2[iM7656c] = iM7654a;
                    cArr[iM7656c] = 'T';
                }
            }
        }
        for (ClassA c2085a16 : c2247c) {
            ClassA c2085aM8227h = c2085a16.m8227h();
            if (c2085a16.m8216c() == 4 && c2085aM8227h.m8234o().size() == 1) {
                if (c2085aM8227h.m8216c() == 67108864 && ClassC.m8473a(c1862bM7687d, bArrM7635a, c2085a16) > 0) {
                    c2085a16.m8206a(268435456);
                    c2085a16.m8217c(c2085aM8227h.m8222e());
                    c2085a16.m8209a(c2085aM8227h.m8227h());
                    HashSet hashSetM8234o3 = c2085aM8227h.m8227h().m8234o();
                    hashSetM8234o3.remove(c2085aM8227h);
                    hashSetM8234o3.add(c2085a16);
                    c2085aM8227h.m8206a(0);
                } else if (c2085aM8227h.m8216c() == 32768 && ClassC.m8473a(c1862bM7687d, bArrM7635a, c2085a16) > 0) {
                    c2085a16.m8206a(32768);
                    c2085a16.m8217c(c2085aM8227h.m8222e());
                    c2085a16.m8209a(c2085aM8227h.m8227h());
                    HashSet hashSetM8234o4 = c2085aM8227h.m8227h().m8234o();
                    hashSetM8234o4.remove(c2085aM8227h);
                    hashSetM8234o4.add(c2085a16);
                    c2085a16.m8215b(c2085aM8227h.m8228i());
                    HashSet hashSetM8234o5 = c2085aM8227h.m8228i().m8234o();
                    hashSetM8234o5.remove(c2085aM8227h);
                    hashSetM8234o5.add(c2085a16);
                    c2085aM8227h.m8206a(0);
                }
            }
        }
        return c2090f;
    }

    protected static boolean m8550a(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        if (i3 < bArr.length) {
            int i4 = bArr[i3] & 255;
            if (i4 == 21) {
                if (i2 == (bArr[i3 + 1] & 255)) {
                    return true;
                }
            } else if (i4 == i2 + 26) {
                return true;
            }
        }
        return false;
    }
}
