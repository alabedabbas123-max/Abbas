package org.objectweb.asm;

import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;
import com.almlkaide.kaypro.android.dx.io.Opcodes;

final class Frame {

    static final int[] f6523a;

    Label f6524b;

    int[] f6525c;

    int[] f6526d;

    private int[] f6527e;

    private int[] f6528f;

    private int f6529g;

    private int f6530h;

    private int[] f6531i;

    static {
        _clinit_();
        int[] iArr = new int[Opcodes.REM_FLOAT_2ADDR];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE".charAt(i) - 'E';
        }
        f6523a = iArr;
    }

    Frame() {
    }

    static void _clinit_() {
    }

    private int m8940a() {
        if (this.f6529g > 0) {
            int[] iArr = this.f6528f;
            int i = this.f6529g - 1;
            this.f6529g = i;
            return iArr[i];
        }
        Label label = this.f6524b;
        int i2 = label.f6556f - 1;
        label.f6556f = i2;
        return 50331648 | (-i2);
    }

    private int m8941a(int i) {
        if (this.f6527e == null || i >= this.f6527e.length) {
            return 33554432 | i;
        }
        int i2 = this.f6527e[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = 33554432 | i;
        this.f6527e[i] = i3;
        return i3;
    }

    private int m8942a(ClassWriter classWriter, int i) {
        int iM8936c;
        if (i == 16777222) {
            iM8936c = classWriter.m8936c(classWriter.f6455I) | 24117248;
        } else {
            if (((-1048576) & i) != 25165824) {
                return i;
            }
            iM8936c = classWriter.m8936c(classWriter.f6454H[1048575 & i].f6546g) | 24117248;
        }
        for (int i2 = 0; i2 < this.f6530h; i2++) {
            int i3 = this.f6531i[i2];
            int i4 = (-268435456) & i3;
            int i5 = 251658240 & i3;
            if (i5 == 33554432) {
                i3 = this.f6525c[i3 & 8388607] + i4;
            } else if (i5 == 50331648) {
                i3 = this.f6526d[this.f6526d.length - (i3 & 8388607)] + i4;
            }
            if (i == i3) {
                return iM8936c;
            }
        }
        return i;
    }

    private void m8943a(int i, int i2) {
        if (this.f6527e == null) {
            this.f6527e = new int[10];
        }
        int length = this.f6527e.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.f6527e, 0, iArr, 0, length);
            this.f6527e = iArr;
        }
        this.f6527e[i] = i2;
    }

    private void m8944a(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            m8949c((Type.getArgumentsAndReturnSizes(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            m8949c(2);
        } else {
            m8949c(1);
        }
    }

    private void m8945a(ClassWriter classWriter, String str) {
        int iM8947b = m8947b(classWriter, str);
        if (iM8947b != 0) {
            m8948b(iM8947b);
            if (iM8947b == 16777220 || iM8947b == 16777219) {
                m8948b(16777216);
            }
        }
    }

    private static boolean m8946a(ClassWriter classWriter, int i, int[] iArr, int i2) {
        int i3;
        int iMin;
        int i4 = iArr[i2];
        if (i4 == i) {
            return false;
        }
        if ((268435455 & i) != 16777221) {
            i3 = i;
        } else {
            if (i4 == 16777221) {
                return false;
            }
            i3 = 16777221;
        }
        if (i4 == 0) {
            iArr[i2] = i3;
            return true;
        }
        if ((i4 & 267386880) == 24117248 || (i4 & (-268435456)) != 0) {
            if (i3 == 16777221) {
                return false;
            }
            if (((-1048576) & i3) == ((-1048576) & i4)) {
                iMin = (i4 & 267386880) == 24117248 ? (i3 & (-268435456)) | 24117248 | classWriter.m8923a(1048575 & i3, 1048575 & i4) : ((i4 & (-268435456)) - 268435456) | 24117248 | classWriter.m8936c("java/lang/Object");
            } else if ((i3 & 267386880) == 24117248 || (i3 & (-268435456)) != 0) {
                iMin = Math.min((i3 & (-268435456)) + (((i3 & (-268435456)) == 0 || (i3 & 267386880) == 24117248) ? 0 : -268435456), (((i4 & (-268435456)) == 0 || (i4 & 267386880) == 24117248) ? 0 : -268435456) + ((-268435456) & i4)) | 24117248 | classWriter.m8936c("java/lang/Object");
            } else {
                iMin = 16777216;
            }
        } else if (i4 == 16777221) {
            iMin = ((i3 & 267386880) == 24117248 || (i3 & (-268435456)) != 0) ? i3 : 16777216;
        } else {
            iMin = 16777216;
        }
        if (i4 == iMin) {
            return false;
        }
        iArr[i2] = iMin;
        return true;
    }

    private static int m8947b(ClassWriter classWriter, String str) {
        int iM8936c = 16777217;
        int iIndexOf = str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0;
        switch (str.charAt(iIndexOf)) {
            case 'B':
            case 'C':
            case 'I':
            case 'S':
            case 'Z':
                return 16777217;
            case 'D':
                return 16777219;
            case 'F':
                return 16777218;
            case 'J':
                return 16777220;
            case 'L':
                return 24117248 | classWriter.m8936c(str.substring(iIndexOf + 1, str.length() - 1));
            case 'V':
                return 0;
            default:
                int i = iIndexOf + 1;
                while (str.charAt(i) == '[') {
                    i++;
                }
                switch (str.charAt(i)) {
                    case 'B':
                        iM8936c = 16777226;
                        break;
                    case 'C':
                        iM8936c = 16777227;
                        break;
                    case 'D':
                        iM8936c = 16777219;
                        break;
                    case 'F':
                        iM8936c = 16777218;
                        break;
                    case 'I':
                        break;
                    case 'J':
                        iM8936c = 16777220;
                        break;
                    case 'S':
                        iM8936c = 16777228;
                        break;
                    case 'Z':
                        iM8936c = 16777225;
                        break;
                    default:
                        iM8936c = 24117248 | classWriter.m8936c(str.substring(i + 1, str.length() - 1));
                        break;
                }
                return ((i - iIndexOf) << 28) | iM8936c;
        }
    }

    private void m8948b(int i) {
        if (this.f6528f == null) {
            this.f6528f = new int[10];
        }
        int length = this.f6528f.length;
        if (this.f6529g >= length) {
            int[] iArr = new int[Math.max(this.f6529g + 1, length * 2)];
            System.arraycopy(this.f6528f, 0, iArr, 0, length);
            this.f6528f = iArr;
        }
        int[] iArr2 = this.f6528f;
        int i2 = this.f6529g;
        this.f6529g = i2 + 1;
        iArr2[i2] = i;
        int i3 = this.f6524b.f6556f + this.f6529g;
        if (i3 > this.f6524b.f6557g) {
            this.f6524b.f6557g = i3;
        }
    }

    private void m8949c(int i) {
        if (this.f6529g >= i) {
            this.f6529g -= i;
            return;
        }
        this.f6524b.f6556f -= i - this.f6529g;
        this.f6529g = 0;
    }

    private void m8950d(int i) {
        if (this.f6531i == null) {
            this.f6531i = new int[2];
        }
        int length = this.f6531i.length;
        if (this.f6530h >= length) {
            int[] iArr = new int[Math.max(this.f6530h + 1, length * 2)];
            System.arraycopy(this.f6531i, 0, iArr, 0, length);
            this.f6531i = iArr;
        }
        int[] iArr2 = this.f6531i;
        int i2 = this.f6530h;
        this.f6530h = i2 + 1;
        iArr2[i2] = i;
    }

    void m8951a(int i, int i2, ClassWriter classWriter, Item item) {
        switch (i) {
            case 0:
            case 116:
            case 117:
            case 118:
            case 119:
            case 145:
            case 146:
            case 147:
            case 167:
            case 177:
                return;
            case 1:
                m8948b(16777221);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
            case 21:
                m8948b(16777217);
                return;
            case 9:
            case 10:
            case 22:
                m8948b(16777220);
                m8948b(16777216);
                return;
            case 11:
            case 12:
            case 13:
            case 23:
                m8948b(16777218);
                return;
            case 14:
            case 15:
            case 24:
                m8948b(16777219);
                m8948b(16777216);
                return;
            case 18:
                switch (item.f6543b) {
                    case 3:
                        m8948b(16777217);
                        return;
                    case 4:
                        m8948b(16777218);
                        return;
                    case 5:
                        m8948b(16777220);
                        m8948b(16777216);
                        return;
                    case 6:
                        m8948b(16777219);
                        m8948b(16777216);
                        return;
                    case 7:
                        m8948b(24117248 | classWriter.m8936c("java/lang/Class"));
                        return;
                    case 8:
                        m8948b(24117248 | classWriter.m8936c("java/lang/String"));
                        return;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    default:
                        m8948b(24117248 | classWriter.m8936c("java/lang/invoke/MethodHandle"));
                        return;
                    case 16:
                        m8948b(24117248 | classWriter.m8936c("java/lang/invoke/MethodType"));
                        return;
                }
            case 19:
            case 20:
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
            case 196:
            case 197:
            default:
                m8949c(i2);
                m8945a(classWriter, item.f6546g);
                return;
            case 25:
                m8948b(m8941a(i2));
                return;
            case 46:
            case 51:
            case 52:
            case 53:
                m8949c(2);
                m8948b(16777217);
                return;
            case 47:
            case 143:
                m8949c(2);
                m8948b(16777220);
                m8948b(16777216);
                return;
            case 48:
                m8949c(2);
                m8948b(16777218);
                return;
            case 49:
            case 138:
                m8949c(2);
                m8948b(16777219);
                m8948b(16777216);
                return;
            case 50:
                m8949c(1);
                m8948b((-268435456) + m8940a());
                return;
            case 54:
            case 56:
            case 58:
                m8943a(i2, m8940a());
                if (i2 > 0) {
                    int iM8941a = m8941a(i2 - 1);
                    if (iM8941a == 16777220 || iM8941a == 16777219) {
                        m8943a(i2 - 1, 16777216);
                        return;
                    } else {
                        if ((251658240 & iM8941a) != 16777216) {
                            m8943a(i2 - 1, iM8941a | 8388608);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 55:
            case 57:
                m8949c(1);
                m8943a(i2, m8940a());
                m8943a(i2 + 1, 16777216);
                if (i2 > 0) {
                    int iM8941a2 = m8941a(i2 - 1);
                    if (iM8941a2 == 16777220 || iM8941a2 == 16777219) {
                        m8943a(i2 - 1, 16777216);
                        return;
                    } else {
                        if ((251658240 & iM8941a2) != 16777216) {
                            m8943a(i2 - 1, iM8941a2 | 8388608);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 79:
            case 81:
            case 83:
            case 84:
            case 85:
            case 86:
                m8949c(3);
                return;
            case 80:
            case 82:
                m8949c(4);
                return;
            case 87:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 170:
            case 171:
            case 172:
            case 174:
            case 176:
            case 191:
            case 194:
            case 195:
            case 198:
            case 199:
                m8949c(1);
                return;
            case 88:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 173:
            case 175:
                m8949c(2);
                return;
            case 89:
                int iM8940a = m8940a();
                m8948b(iM8940a);
                m8948b(iM8940a);
                return;
            case 90:
                int iM8940a2 = m8940a();
                int iM8940a3 = m8940a();
                m8948b(iM8940a2);
                m8948b(iM8940a3);
                m8948b(iM8940a2);
                return;
            case 91:
                int iM8940a4 = m8940a();
                int iM8940a5 = m8940a();
                int iM8940a6 = m8940a();
                m8948b(iM8940a4);
                m8948b(iM8940a6);
                m8948b(iM8940a5);
                m8948b(iM8940a4);
                return;
            case 92:
                int iM8940a7 = m8940a();
                int iM8940a8 = m8940a();
                m8948b(iM8940a8);
                m8948b(iM8940a7);
                m8948b(iM8940a8);
                m8948b(iM8940a7);
                return;
            case 93:
                int iM8940a9 = m8940a();
                int iM8940a10 = m8940a();
                int iM8940a11 = m8940a();
                m8948b(iM8940a10);
                m8948b(iM8940a9);
                m8948b(iM8940a11);
                m8948b(iM8940a10);
                m8948b(iM8940a9);
                return;
            case 94:
                int iM8940a12 = m8940a();
                int iM8940a13 = m8940a();
                int iM8940a14 = m8940a();
                int iM8940a15 = m8940a();
                m8948b(iM8940a13);
                m8948b(iM8940a12);
                m8948b(iM8940a15);
                m8948b(iM8940a14);
                m8948b(iM8940a13);
                m8948b(iM8940a12);
                return;
            case 95:
                int iM8940a16 = m8940a();
                int iM8940a17 = m8940a();
                m8948b(iM8940a16);
                m8948b(iM8940a17);
                return;
            case 96:
            case 100:
            case 104:
            case 108:
            case 112:
            case 120:
            case 122:
            case 124:
            case 126:
            case 128:
            case 130:
            case 136:
            case 142:
            case 149:
            case 150:
                m8949c(2);
                m8948b(16777217);
                return;
            case 97:
            case 101:
            case 105:
            case 109:
            case 113:
            case 127:
            case 129:
            case 131:
                m8949c(4);
                m8948b(16777220);
                m8948b(16777216);
                return;
            case 98:
            case 102:
            case 106:
            case 110:
            case 114:
            case 137:
            case 144:
                m8949c(2);
                m8948b(16777218);
                return;
            case 99:
            case 103:
            case 107:
            case 111:
            case 115:
                m8949c(4);
                m8948b(16777219);
                m8948b(16777216);
                return;
            case 121:
            case 123:
            case 125:
                m8949c(3);
                m8948b(16777220);
                m8948b(16777216);
                return;
            case 132:
                m8943a(i2, 16777217);
                return;
            case 133:
            case 140:
                m8949c(1);
                m8948b(16777220);
                m8948b(16777216);
                return;
            case 134:
                m8949c(1);
                m8948b(16777218);
                return;
            case 135:
            case 141:
                m8949c(1);
                m8948b(16777219);
                m8948b(16777216);
                return;
            case 139:
            case 190:
            case 193:
                m8949c(1);
                m8948b(16777217);
                return;
            case 148:
            case 151:
            case 152:
                m8949c(4);
                m8948b(16777217);
                return;
            case 168:
            case 169:
                throw new RuntimeException("JSR/RET are not supported with computeFrames option");
            case 178:
                m8945a(classWriter, item.f6548i);
                return;
            case 179:
                m8944a(item.f6548i);
                return;
            case 180:
                m8949c(1);
                m8945a(classWriter, item.f6548i);
                return;
            case 181:
                m8944a(item.f6548i);
                m8940a();
                return;
            case 182:
            case 183:
            case 184:
            case 185:
                m8944a(item.f6548i);
                if (i != 184) {
                    int iM8940a18 = m8940a();
                    if (i == 183 && item.f6547h.charAt(0) == '<') {
                        m8950d(iM8940a18);
                    }
                }
                m8945a(classWriter, item.f6548i);
                return;
            case 186:
                m8944a(item.f6547h);
                m8945a(classWriter, item.f6547h);
                return;
            case 187:
                m8948b(25165824 | classWriter.m8924a(item.f6546g, i2));
                return;
            case 188:
                m8940a();
                switch (i2) {
                    case 4:
                        m8948b(285212681);
                        return;
                    case 5:
                        m8948b(285212683);
                        return;
                    case 6:
                        m8948b(285212674);
                        return;
                    case 7:
                        m8948b(285212675);
                        return;
                    case 8:
                        m8948b(285212682);
                        return;
                    case 9:
                        m8948b(285212684);
                        return;
                    case 10:
                        m8948b(285212673);
                        return;
                    default:
                        m8948b(285212676);
                        return;
                }
            case 189:
                String str = item.f6546g;
                m8940a();
                if (str.charAt(0) == '[') {
                    m8945a(classWriter, new StringBuffer().append('[').append(str).toString());
                    return;
                } else {
                    m8948b(classWriter.m8936c(str) | 292552704);
                    return;
                }
            case 192:
                String str2 = item.f6546g;
                m8940a();
                if (str2.charAt(0) == '[') {
                    m8945a(classWriter, str2);
                    return;
                } else {
                    m8948b(classWriter.m8936c(str2) | 24117248);
                    return;
                }
        }
    }

    void m8952a(ClassWriter classWriter, int i, Type[] typeArr, int i2) {
        int i3 = 1;
        this.f6525c = new int[i2];
        this.f6526d = new int[0];
        if ((i & 8) != 0) {
            i3 = 0;
        } else if ((524288 & i) == 0) {
            this.f6525c[0] = 24117248 | classWriter.m8936c(classWriter.f6455I);
        } else {
            this.f6525c[0] = 16777222;
        }
        for (Type type : typeArr) {
            int iM8947b = m8947b(classWriter, type.getDescriptor());
            int i4 = i3 + 1;
            this.f6525c[i3] = iM8947b;
            if (iM8947b == 16777220 || iM8947b == 16777219) {
                i3 = i4 + 1;
                this.f6525c[i4] = 16777216;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.f6525c[i3] = 16777216;
            i3++;
        }
    }

    boolean m8953a(ClassWriter classWriter, Frame frame, int i) {
        boolean z;
        int iM8942a;
        boolean z2 = false;
        int length = this.f6525c.length;
        int length2 = this.f6526d.length;
        if (frame.f6525c == null) {
            frame.f6525c = new int[length];
            z2 = true;
        }
        int i2 = 0;
        boolean zM8946a = z2;
        while (i2 < length) {
            if (this.f6527e == null || i2 >= this.f6527e.length || (iM8942a = this.f6527e[i2]) == 0) {
                iM8942a = this.f6525c[i2];
            } else {
                int i3 = (-268435456) & iM8942a;
                int i4 = 251658240 & iM8942a;
                if (i4 != 16777216) {
                    int i5 = i4 == 33554432 ? i3 + this.f6525c[8388607 & iM8942a] : i3 + this.f6526d[length2 - (8388607 & iM8942a)];
                    iM8942a = ((iM8942a & 8388608) == 0 || !(i5 == 16777220 || i5 == 16777219)) ? i5 : 16777216;
                }
            }
            if (this.f6531i != null) {
                iM8942a = m8942a(classWriter, iM8942a);
            }
            zM8946a |= m8946a(classWriter, iM8942a, frame.f6525c, i2);
            i2++;
        }
        if (i > 0) {
            boolean zM8946a2 = zM8946a;
            for (int i6 = 0; i6 < length; i6++) {
                zM8946a2 |= m8946a(classWriter, this.f6525c[i6], frame.f6525c, i6);
            }
            if (frame.f6526d == null) {
                frame.f6526d = new int[1];
                zM8946a2 = true;
            }
            return m8946a(classWriter, i, frame.f6526d, 0) | zM8946a2;
        }
        int length3 = this.f6526d.length + this.f6524b.f6556f;
        if (frame.f6526d == null) {
            frame.f6526d = new int[this.f6529g + length3];
            z = true;
        } else {
            z = zM8946a;
        }
        boolean zM8946a3 = z;
        for (int i7 = 0; i7 < length3; i7++) {
            int iM8942a2 = this.f6526d[i7];
            if (this.f6531i != null) {
                iM8942a2 = m8942a(classWriter, iM8942a2);
            }
            zM8946a3 |= m8946a(classWriter, iM8942a2, frame.f6526d, i7);
        }
        for (int i8 = 0; i8 < this.f6529g; i8++) {
            int iM8942a3 = this.f6528f[i8];
            int i9 = (-268435456) & iM8942a3;
            int i10 = 251658240 & iM8942a3;
            if (i10 != 16777216) {
                int i11 = i10 == 33554432 ? i9 + this.f6525c[8388607 & iM8942a3] : i9 + this.f6526d[length2 - (8388607 & iM8942a3)];
                iM8942a3 = ((iM8942a3 & 8388608) == 0 || !(i11 == 16777220 || i11 == 16777219)) ? i11 : 16777216;
            }
            if (this.f6531i != null) {
                iM8942a3 = m8942a(classWriter, iM8942a3);
            }
            zM8946a3 |= m8946a(classWriter, iM8942a3, frame.f6526d, length3 + i8);
        }
        return zM8946a3;
    }
}
