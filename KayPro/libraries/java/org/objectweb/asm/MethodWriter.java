package org.objectweb.asm;

import android.support.v4.provider.FontsContractCompat;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttAnnotationDefault;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttCode;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttDeprecated;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttExceptions;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLineNumberTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTypeTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSignature;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSynthetic;
import com.almlkaide.kaypro.android.dx.io.Opcodes;

class MethodWriter extends MethodVisitor {

    private ByteVector f6564$;

    private int f6565A;

    private Handler f6566B;

    private Handler f6567C;

    private int f6568D;

    private ByteVector f6569E;

    private int f6570F;

    private ByteVector f6571G;

    private int f6572H;

    private ByteVector f6573I;

    private Attribute f6574J;

    private boolean f6575K;

    private int f6576L;

    private final int f6577M;

    private Label f6578N;

    private Label f6579O;

    private Label f6580P;

    private int f6581Q;

    private int f6582R;

    private int f6583S;

    private int f6584T;

    private AnnotationWriter f6585U;

    private AnnotationWriter f6586V;

    private AnnotationWriter f6587W;

    private AnnotationWriter f6588X;

    private int f6589Y;

    private int f6590Z;

    final ClassWriter f6591b;

    private int f6592c;

    private final int f6593d;

    private final int f6594e;

    private final String f6595f;

    String f6596g;

    int f6597h;

    int f6598i;

    int f6599j;

    int[] f6600k;

    private ByteVector f6601l;

    private AnnotationWriter f6602m;

    private AnnotationWriter f6603n;

    private AnnotationWriter[] f6604o;

    private AnnotationWriter[] f6605p;

    private Attribute f6606q;

    private ByteVector f6607r;

    private int f6608s;

    private int f6609t;

    private int f6610u;

    private ByteVector f6611v;

    private int f6612w;

    private int[] f6613x;

    private int[] f6614z;

    MethodWriter(ClassWriter classWriter, int i, String str, String str2, String str3, String[] strArr, boolean z, boolean z2) {
        super(Opcodes.ASM5);
        this.f6607r = new ByteVector();
        if (classWriter.f6451D == null) {
            classWriter.f6451D = this;
        } else {
            classWriter.f6452E.f6563mv = this;
        }
        classWriter.f6452E = this;
        this.f6591b = classWriter;
        this.f6592c = i;
        if ("<init>".equals(str)) {
            this.f6592c |= 524288;
        }
        this.f6593d = classWriter.newUTF8(str);
        this.f6594e = classWriter.newUTF8(str2);
        this.f6595f = str2;
        this.f6596g = str3;
        if (strArr != null && strArr.length > 0) {
            this.f6599j = strArr.length;
            this.f6600k = new int[this.f6599j];
            for (int i2 = 0; i2 < this.f6599j; i2++) {
                this.f6600k[i2] = classWriter.newClass(strArr[i2]);
            }
        }
        this.f6577M = z2 ? 0 : z ? 1 : 2;
        if (z || z2) {
            int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(this.f6595f) >> 2;
            argumentsAndReturnSizes = (i & 8) != 0 ? argumentsAndReturnSizes - 1 : argumentsAndReturnSizes;
            this.f6609t = argumentsAndReturnSizes;
            this.f6584T = argumentsAndReturnSizes;
            this.f6578N = new Label();
            this.f6578N.f6551a |= 8;
            visitLabel(this.f6578N);
        }
    }

    private int m8971a(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        if (this.f6614z == null || this.f6614z.length < i4) {
            this.f6614z = new int[i4];
        }
        this.f6614z[0] = i;
        this.f6614z[1] = i2;
        this.f6614z[2] = i3;
        return 3;
    }

    static int m8972a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    static int m8973a(int[] iArr, int[] iArr2, int i, int i2) {
        int i3 = i2 - i;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (i < iArr[i4] && iArr[i4] <= i2) {
                i3 += iArr2[i4];
            } else if (i2 < iArr[i4] && iArr[i4] <= i) {
                i3 -= iArr2[i4];
            }
        }
        return i3;
    }

    private void m8974a(int i, int i2) {
        while (i < i2) {
            int i3 = this.f6614z[i];
            int i4 = (-268435456) & i3;
            if (i4 == 0) {
                int i5 = i3 & 1048575;
                switch (i3 & 267386880) {
                    case 24117248:
                        this.f6611v.putByte(7).putShort(this.f6591b.newClass(this.f6591b.f6454H[i5].f6546g));
                        break;
                    case 25165824:
                        this.f6611v.putByte(8).putShort(this.f6591b.f6454H[i5].f6544c);
                        break;
                    default:
                        this.f6611v.putByte(i5);
                        break;
                }
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                int i6 = i4 >> 28;
                while (true) {
                    int i7 = i6 - 1;
                    if (i6 > 0) {
                        stringBuffer.append('[');
                        i6 = i7;
                    } else {
                        if ((i3 & 267386880) != 24117248) {
                            switch (i3 & 15) {
                                case 1:
                                    stringBuffer.append('I');
                                    break;
                                case 2:
                                    stringBuffer.append('F');
                                    break;
                                case 3:
                                    stringBuffer.append('D');
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                default:
                                    stringBuffer.append('J');
                                    break;
                                case 9:
                                    stringBuffer.append('Z');
                                    break;
                                case 10:
                                    stringBuffer.append('B');
                                    break;
                                case 11:
                                    stringBuffer.append('C');
                                    break;
                                case 12:
                                    stringBuffer.append('S');
                                    break;
                            }
                        } else {
                            stringBuffer.append('L');
                            stringBuffer.append(this.f6591b.f6454H[i3 & 1048575].f6546g);
                            stringBuffer.append(';');
                        }
                        this.f6611v.putByte(7).putShort(this.f6591b.newClass(stringBuffer.toString()));
                    }
                }
            }
            i++;
        }
    }

    private void m8975a(int i, Label label) {
        Edge edge = new Edge();
        edge.f6507a = i;
        edge.f6508b = label;
        edge.f6509c = this.f6580P.f6560j;
        this.f6580P.f6560j = edge;
    }

    private void m8976a(Object obj) {
        if (obj instanceof String) {
            this.f6611v.putByte(7).putShort(this.f6591b.newClass((String) obj));
        } else if (obj instanceof Integer) {
            this.f6611v.putByte(((Integer) obj).intValue());
        } else {
            this.f6611v.putByte(8).putShort(((Label) obj).f6553c);
        }
    }

    private void m8977a(Label label, Label[] labelArr) {
        if (this.f6580P != null) {
            if (this.f6577M == 0) {
                this.f6580P.f6558h.m8951a(171, 0, (ClassWriter) null, (Item) null);
                m8975a(0, label);
                label.m8964a().f6551a |= 16;
                for (int i = 0; i < labelArr.length; i++) {
                    m8975a(0, labelArr[i]);
                    labelArr[i].m8964a().f6551a |= 16;
                }
            } else {
                this.f6581Q--;
                m8975a(this.f6581Q, label);
                for (Label label2 : labelArr) {
                    m8975a(this.f6581Q, label2);
                }
            }
            m8986e();
        }
    }

    static void m8978a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >>> 8);
        bArr[i + 1] = (byte) i2;
    }

    static void m8979a(int[] iArr, int[] iArr2, Label label) {
        if ((label.f6551a & 4) == 0) {
            label.f6553c = m8973a(iArr, iArr2, 0, label.f6553c);
            label.f6551a |= 4;
        }
    }

    static short m8980b(byte[] bArr, int i) {
        return (short) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255));
    }

    private void m8981b() {
        if (this.f6613x != null) {
            if (this.f6611v == null) {
                this.f6611v = new ByteVector();
            }
            m8984c();
            this.f6610u++;
        }
        this.f6613x = this.f6614z;
        this.f6614z = null;
    }

    private void m8982b(Frame frame) {
        int[] iArr = frame.f6525c;
        int[] iArr2 = frame.f6526d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < iArr.length) {
            int i4 = iArr[i];
            if (i4 == 16777216) {
                i3++;
            } else {
                i2 += i3 + 1;
                i3 = 0;
            }
            if (i4 == 16777220 || i4 == 16777219) {
                i++;
            }
            i++;
        }
        int i5 = 0;
        int i6 = 0;
        while (i6 < iArr2.length) {
            int i7 = iArr2[i6];
            i5++;
            if (i7 == 16777220 || i7 == 16777219) {
                i6++;
            }
            i6++;
        }
        int iM8971a = m8971a(frame.f6524b.f6553c, i2, i5);
        int i8 = 0;
        int i9 = i2;
        while (i9 > 0) {
            int i10 = iArr[i8];
            int i11 = iM8971a + 1;
            this.f6614z[iM8971a] = i10;
            if (i10 == 16777220 || i10 == 16777219) {
                i8++;
            }
            i8++;
            i9--;
            iM8971a = i11;
        }
        int i12 = iM8971a;
        int i13 = 0;
        while (i13 < iArr2.length) {
            int i14 = iArr2[i13];
            int i15 = i12 + 1;
            this.f6614z[i12] = i14;
            if (i14 == 16777220 || i14 == 16777219) {
                i13++;
            }
            i13++;
            i12 = i15;
        }
        m8981b();
    }

    static int m8983c(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 8) | (bArr[i + 1] & 255);
    }

    private void m8984c() {
        int i;
        char c;
        int i2;
        int i3 = this.f6614z[1];
        int i4 = this.f6614z[2];
        if ((this.f6591b.f6462b & 65535) < 50) {
            this.f6611v.putShort(this.f6614z[0]).putShort(i3);
            m8974a(3, i3 + 3);
            this.f6611v.putShort(i4);
            m8974a(i3 + 3, i3 + 3 + i4);
        }
        int i5 = this.f6613x[1];
        int i6 = this.f6610u == 0 ? this.f6614z[0] : (this.f6614z[0] - this.f6613x[0]) - 1;
        if (i4 == 0) {
            int i7 = i3 - i5;
            switch (i7) {
                case FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR:
                case -2:
                case -1:
                    c = 248;
                    i = i3;
                    i2 = i7;
                    break;
                case 0:
                    c = i6 < 64 ? (char) 0 : (char) 251;
                    i = i5;
                    i2 = i7;
                    break;
                case 1:
                case 2:
                case 3:
                    c = 252;
                    i = i5;
                    i2 = i7;
                    break;
                default:
                    i = i5;
                    c = 255;
                    i2 = i7;
                    break;
            }
        } else if (i3 == i5 && i4 == 1) {
            c = i6 >= 63 ? (char) 247 : '@';
            i = i5;
            i2 = 0;
        } else {
            i = i5;
            c = 255;
            i2 = 0;
        }
        if (c != 255) {
            int i8 = 3;
            int i9 = 0;
            while (i9 < i) {
                if (this.f6614z[i8] != this.f6613x[i8]) {
                    c = 255;
                } else {
                    i9++;
                    i8++;
                }
            }
        }
        switch (c) {
            case 0:
                this.f6611v.putByte(i6);
                break;
            case '@':
                this.f6611v.putByte(i6 + 64);
                m8974a(i3 + 3, i3 + 4);
                break;
            case 247:
                this.f6611v.putByte(247).putShort(i6);
                m8974a(i3 + 3, i3 + 4);
                break;
            case 248:
                this.f6611v.putByte(i2 + Opcodes.INVOKE_POLYMORPHIC_RANGE).putShort(i6);
                break;
            case Opcodes.INVOKE_POLYMORPHIC_RANGE:
                this.f6611v.putByte(Opcodes.INVOKE_POLYMORPHIC_RANGE).putShort(i6);
                break;
            case Opcodes.INVOKE_CUSTOM:
                this.f6611v.putByte(i2 + Opcodes.INVOKE_POLYMORPHIC_RANGE).putShort(i6);
                m8974a(i + 3, i3 + 3);
                break;
            default:
                this.f6611v.putByte(255).putShort(i6).putShort(i3);
                m8974a(3, i3 + 3);
                this.f6611v.putShort(i4);
                m8974a(i3 + 3, i3 + 3 + i4);
                break;
        }
    }

    private void m8985d() {
        int i;
        int iM8980b;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM8980b2;
        int i6;
        int[] iArr;
        byte[] bArr = this.f6607r.f6439a;
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        boolean[] zArr = new boolean[this.f6607r.f6440b];
        int i7 = 3;
        while (true) {
            if (i7 == 3) {
                i7 = 2;
            }
            int iM8972a = 0;
            int i8 = i7;
            while (iM8972a < bArr.length) {
                int i9 = bArr[iM8972a] & 255;
                switch (ClassWriter.f6447a[i9]) {
                    case 0:
                    case 4:
                        iM8972a++;
                        i3 = 0;
                        break;
                    case 1:
                    case 3:
                    case 11:
                        iM8972a += 2;
                        i3 = 0;
                        break;
                    case 2:
                    case 5:
                    case 6:
                    case 12:
                    case 13:
                        iM8972a += 3;
                        i3 = 0;
                        break;
                    case 7:
                    case 8:
                        iM8972a += 5;
                        i3 = 0;
                        break;
                    case 9:
                        if (i9 > 201) {
                            i9 = i9 < 218 ? i9 - 49 : i9 - 20;
                            iM8980b2 = m8983c(bArr, iM8972a + 1) + iM8972a;
                        } else {
                            iM8980b2 = m8980b(bArr, iM8972a + 1) + iM8972a;
                        }
                        int iM8973a = m8973a(iArr2, iArr3, iM8972a, iM8980b2);
                        if ((iM8973a < -32768 || iM8973a > 32767) && !zArr[iM8972a]) {
                            i6 = (i9 == 167 || i9 == 168) ? 2 : 5;
                            zArr[iM8972a] = true;
                        } else {
                            i6 = 0;
                        }
                        iM8972a += 3;
                        i3 = i6;
                        break;
                    case 10:
                        iM8972a += 5;
                        i3 = 0;
                        break;
                    case 14:
                        if (i8 == 1) {
                            i5 = -(m8973a(iArr2, iArr3, 0, iM8972a) & 3);
                        } else if (zArr[iM8972a]) {
                            i5 = 0;
                        } else {
                            i5 = iM8972a & 3;
                            zArr[iM8972a] = true;
                        }
                        int i10 = (iM8972a + 4) - (iM8972a & 3);
                        iM8972a = i10 + (((m8972a(bArr, i10 + 8) - m8972a(bArr, i10 + 4)) + 1) * 4) + 12;
                        i3 = i5;
                        break;
                    case 15:
                        if (i8 == 1) {
                            i4 = -(m8973a(iArr2, iArr3, 0, iM8972a) & 3);
                        } else if (zArr[iM8972a]) {
                            i4 = 0;
                        } else {
                            i4 = iM8972a & 3;
                            zArr[iM8972a] = true;
                        }
                        int i11 = (iM8972a + 4) - (iM8972a & 3);
                        iM8972a = i11 + (m8972a(bArr, i11 + 4) * 8) + 8;
                        i3 = i4;
                        break;
                    case 16:
                    default:
                        iM8972a += 4;
                        i3 = 0;
                        break;
                    case 17:
                        if ((bArr[iM8972a + 1] & 255) == 132) {
                            iM8972a += 6;
                            i3 = 0;
                        } else {
                            iM8972a += 4;
                            i3 = 0;
                        }
                        break;
                }
                if (i3 != 0) {
                    iArr = new int[iArr2.length + 1];
                    int[] iArr4 = new int[iArr3.length + 1];
                    System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                    iArr[iArr2.length] = iM8972a;
                    iArr4[iArr3.length] = i3;
                    if (i3 > 0) {
                        i8 = 3;
                        iArr3 = iArr4;
                    } else {
                        iArr3 = iArr4;
                    }
                } else {
                    iArr = iArr2;
                }
                iArr2 = iArr;
            }
            if (i8 < 3) {
                i8--;
            }
            if (i8 == 0) {
                ByteVector byteVector = new ByteVector(this.f6607r.f6440b);
                int i12 = 0;
                while (i12 < this.f6607r.f6440b) {
                    int i13 = bArr[i12] & 255;
                    switch (ClassWriter.f6447a[i13]) {
                        case 0:
                        case 4:
                            byteVector.putByte(i13);
                            i12++;
                            continue;
                        case 1:
                        case 3:
                        case 11:
                            byteVector.putByteArray(bArr, i12, 2);
                            i12 += 2;
                            continue;
                        case 2:
                        case 5:
                        case 6:
                        case 12:
                        case 13:
                            byteVector.putByteArray(bArr, i12, 3);
                            i12 += 3;
                            continue;
                        case 7:
                        case 8:
                            byteVector.putByteArray(bArr, i12, 5);
                            i12 += 5;
                            continue;
                        case 9:
                            if (i13 > 201) {
                                i13 = i13 < 218 ? i13 - 49 : i13 - 20;
                                iM8980b = m8983c(bArr, i12 + 1) + i12;
                            } else {
                                iM8980b = m8980b(bArr, i12 + 1) + i12;
                            }
                            int iM8973a2 = m8973a(iArr2, iArr3, i12, iM8980b);
                            if (zArr[i12]) {
                                if (i13 == 167) {
                                    byteVector.putByte(200);
                                    i2 = iM8973a2;
                                } else if (i13 == 168) {
                                    byteVector.putByte(201);
                                    i2 = iM8973a2;
                                } else {
                                    byteVector.putByte(i13 <= 166 ? ((i13 + 1) ^ 1) - 1 : i13 ^ 1);
                                    byteVector.putShort(8);
                                    byteVector.putByte(200);
                                    i2 = iM8973a2 - 3;
                                }
                                byteVector.putInt(i2);
                            } else {
                                byteVector.putByte(i13);
                                byteVector.putShort(iM8973a2);
                            }
                            i12 += 3;
                            continue;
                        case 10:
                            int iM8973a3 = m8973a(iArr2, iArr3, i12, m8972a(bArr, i12 + 1) + i12);
                            byteVector.putByte(i13);
                            byteVector.putInt(iM8973a3);
                            i12 += 5;
                            continue;
                        case 14:
                            int i14 = (i12 + 4) - (i12 & 3);
                            byteVector.putByte(170);
                            byteVector.putByteArray(null, 0, (4 - (byteVector.f6440b % 4)) % 4);
                            int iM8972a2 = m8972a(bArr, i14);
                            int i15 = i14 + 4;
                            byteVector.putInt(m8973a(iArr2, iArr3, i12, iM8972a2 + i12));
                            int iM8972a3 = m8972a(bArr, i15);
                            int i16 = i15 + 4;
                            byteVector.putInt(iM8972a3);
                            i = i16 + 4;
                            byteVector.putInt(m8972a(bArr, i - 4));
                            for (int iM8972a4 = (m8972a(bArr, i16) - iM8972a3) + 1; iM8972a4 > 0; iM8972a4--) {
                                int iM8972a5 = m8972a(bArr, i);
                                i += 4;
                                byteVector.putInt(m8973a(iArr2, iArr3, i12, iM8972a5 + i12));
                            }
                            break;
                        case 15:
                            int i17 = (i12 + 4) - (i12 & 3);
                            byteVector.putByte(171);
                            byteVector.putByteArray(null, 0, (4 - (byteVector.f6440b % 4)) % 4);
                            int iM8972a6 = m8972a(bArr, i17);
                            int i18 = i17 + 4;
                            byteVector.putInt(m8973a(iArr2, iArr3, i12, iM8972a6 + i12));
                            int iM8972a7 = m8972a(bArr, i18);
                            i = i18 + 4;
                            byteVector.putInt(iM8972a7);
                            while (iM8972a7 > 0) {
                                byteVector.putInt(m8972a(bArr, i));
                                int i19 = i + 4;
                                int iM8972a8 = m8972a(bArr, i19);
                                i = i19 + 4;
                                byteVector.putInt(m8973a(iArr2, iArr3, i12, iM8972a8 + i12));
                                iM8972a7--;
                            }
                            break;
                        case 16:
                        default:
                            byteVector.putByteArray(bArr, i12, 4);
                            i12 += 4;
                            continue;
                        case 17:
                            if ((bArr[i12 + 1] & 255) == 132) {
                                byteVector.putByteArray(bArr, i12, 6);
                                i12 += 6;
                            } else {
                                byteVector.putByteArray(bArr, i12, 4);
                                i12 += 4;
                                continue;
                            }
                            break;
                    }
                    i12 = i;
                }
                if (this.f6577M == 0) {
                    for (Label label = this.f6578N; label != null; label = label.f6559i) {
                        int i20 = label.f6553c - 3;
                        if (i20 >= 0 && zArr[i20]) {
                            label.f6551a |= 16;
                        }
                        m8979a(iArr2, iArr3, label);
                    }
                    if (this.f6591b.f6454H != null) {
                        for (int i21 = 0; i21 < this.f6591b.f6454H.length; i21++) {
                            Item item = this.f6591b.f6454H[i21];
                            if (item != null && item.f6543b == 31) {
                                item.f6544c = m8973a(iArr2, iArr3, 0, item.f6544c);
                            }
                        }
                    }
                } else if (this.f6610u > 0) {
                    this.f6591b.f6458L = true;
                }
                for (Handler handler = this.f6566B; handler != null; handler = handler.f6541f) {
                    m8979a(iArr2, iArr3, handler.f6536a);
                    m8979a(iArr2, iArr3, handler.f6537b);
                    m8979a(iArr2, iArr3, handler.f6538c);
                }
                int i22 = 0;
                while (i22 < 2) {
                    ByteVector byteVector2 = i22 == 0 ? this.f6569E : this.f6571G;
                    if (byteVector2 != null) {
                        byte[] bArr2 = byteVector2.f6439a;
                        for (int i23 = 0; i23 < byteVector2.f6440b; i23 += 10) {
                            int iM8983c = m8983c(bArr2, i23);
                            int iM8973a4 = m8973a(iArr2, iArr3, 0, iM8983c);
                            m8978a(bArr2, i23, iM8973a4);
                            m8978a(bArr2, i23 + 2, m8973a(iArr2, iArr3, 0, iM8983c + m8983c(bArr2, i23 + 2)) - iM8973a4);
                        }
                    }
                    i22++;
                }
                if (this.f6573I != null) {
                    byte[] bArr3 = this.f6573I.f6439a;
                    for (int i24 = 0; i24 < this.f6573I.f6440b; i24 += 4) {
                        m8978a(bArr3, i24, m8973a(iArr2, iArr3, 0, m8983c(bArr3, i24)));
                    }
                }
                for (Attribute attribute = this.f6574J; attribute != null; attribute = attribute.f6437a) {
                    Label[] labels = attribute.getLabels();
                    if (labels != null) {
                        for (int length = labels.length - 1; length >= 0; length--) {
                            m8979a(iArr2, iArr3, labels[length]);
                        }
                    }
                }
                this.f6607r = byteVector;
                return;
            }
            i7 = i8;
        }
    }

    private void m8986e() {
        if (this.f6577M == 0) {
            Label label = new Label();
            label.f6558h = new Frame();
            label.f6558h.f6524b = label;
            label.m8969a(this, this.f6607r.f6440b, this.f6607r.f6439a);
            this.f6579O.f6559i = label;
            this.f6579O = label;
        } else {
            this.f6580P.f6557g = this.f6582R;
        }
        this.f6580P = null;
    }

    private void m8987f() {
        int i;
        int iM8971a = m8971a(0, this.f6595f.length() + 1, 0);
        if ((this.f6592c & 8) != 0) {
            i = iM8971a;
        } else if ((this.f6592c & 524288) == 0) {
            i = iM8971a + 1;
            this.f6614z[iM8971a] = this.f6591b.m8936c(this.f6591b.f6455I) | 24117248;
        } else {
            i = iM8971a + 1;
            this.f6614z[iM8971a] = 6;
        }
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            switch (this.f6595f.charAt(i2)) {
                case 'B':
                case 'C':
                case 'I':
                case 'S':
                case 'Z':
                    this.f6614z[i] = 1;
                    i++;
                    i2 = i3;
                    break;
                case 'D':
                    this.f6614z[i] = 3;
                    i++;
                    i2 = i3;
                    break;
                case 'F':
                    this.f6614z[i] = 2;
                    i++;
                    i2 = i3;
                    break;
                case 'J':
                    this.f6614z[i] = 4;
                    i++;
                    i2 = i3;
                    break;
                case 'L':
                    while (this.f6595f.charAt(i3) != ';') {
                        i3++;
                    }
                    this.f6614z[i] = this.f6591b.m8936c(this.f6595f.substring(i2 + 1, i3)) | 24117248;
                    i++;
                    i2 = i3 + 1;
                    break;
                case '[':
                    while (this.f6595f.charAt(i3) == '[') {
                        i3++;
                    }
                    if (this.f6595f.charAt(i3) == 'L') {
                        do {
                            i3++;
                        } while (this.f6595f.charAt(i3) != ';');
                    }
                    int i4 = i3 + 1;
                    this.f6614z[i] = this.f6591b.m8936c(this.f6595f.substring(i2, i4)) | 24117248;
                    i++;
                    i2 = i4;
                    break;
                default:
                    this.f6614z[1] = i - 3;
                    m8981b();
                    return;
            }
        }
    }

    final int m8988a() {
        int length;
        if (this.f6597h != 0) {
            return this.f6598i + 6;
        }
        int iM8891a = 8;
        if (this.f6607r.f6440b > 0) {
            if (this.f6607r.f6440b > 65536) {
                throw new RuntimeException("Method code too large!");
            }
            this.f6591b.newUTF8(AttCode.ATTRIBUTE_NAME);
            int iM8891a2 = this.f6607r.f6440b + 18 + (this.f6565A * 8) + 8;
            if (this.f6569E != null) {
                this.f6591b.newUTF8(AttLocalVariableTable.ATTRIBUTE_NAME);
                iM8891a2 += this.f6569E.f6440b + 8;
            }
            if (this.f6571G != null) {
                this.f6591b.newUTF8(AttLocalVariableTypeTable.ATTRIBUTE_NAME);
                iM8891a2 += this.f6571G.f6440b + 8;
            }
            if (this.f6573I != null) {
                this.f6591b.newUTF8(AttLineNumberTable.ATTRIBUTE_NAME);
                iM8891a2 += this.f6573I.f6440b + 8;
            }
            if (this.f6611v != null) {
                this.f6591b.newUTF8((this.f6591b.f6462b & 65535) >= 50 ? "StackMapTable" : "StackMap");
                iM8891a2 += this.f6611v.f6440b + 8;
            }
            if (this.f6587W != null) {
                this.f6591b.newUTF8("RuntimeVisibleTypeAnnotations");
                iM8891a2 += this.f6587W.m8891a() + 8;
            }
            if (this.f6588X != null) {
                this.f6591b.newUTF8("RuntimeInvisibleTypeAnnotations");
                iM8891a = iM8891a2 + this.f6588X.m8891a() + 8;
            } else {
                iM8891a = iM8891a2;
            }
            if (this.f6574J != null) {
                iM8891a += this.f6574J.m8894a(this.f6591b, this.f6607r.f6439a, this.f6607r.f6440b, this.f6608s, this.f6609t);
            }
        }
        if (this.f6599j > 0) {
            this.f6591b.newUTF8(AttExceptions.ATTRIBUTE_NAME);
            iM8891a += (this.f6599j * 2) + 8;
        }
        if ((this.f6592c & 4096) != 0 && ((this.f6591b.f6462b & 65535) < 49 || (this.f6592c & 262144) != 0)) {
            this.f6591b.newUTF8(AttSynthetic.ATTRIBUTE_NAME);
            iM8891a += 6;
        }
        if ((this.f6592c & 131072) != 0) {
            this.f6591b.newUTF8(AttDeprecated.ATTRIBUTE_NAME);
            iM8891a += 6;
        }
        if (this.f6596g != null) {
            this.f6591b.newUTF8(AttSignature.ATTRIBUTE_NAME);
            this.f6591b.newUTF8(this.f6596g);
            iM8891a += 8;
        }
        if (this.f6564$ != null) {
            this.f6591b.newUTF8("MethodParameters");
            iM8891a += this.f6564$.f6440b + 7;
        }
        if (this.f6601l != null) {
            this.f6591b.newUTF8(AttAnnotationDefault.ATTRIBUTE_NAME);
            iM8891a += this.f6601l.f6440b + 6;
        }
        if (this.f6602m != null) {
            this.f6591b.newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
            iM8891a += this.f6602m.m8891a() + 8;
        }
        if (this.f6603n != null) {
            this.f6591b.newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME);
            iM8891a += this.f6603n.m8891a() + 8;
        }
        if (this.f6585U != null) {
            this.f6591b.newUTF8("RuntimeVisibleTypeAnnotations");
            iM8891a += this.f6585U.m8891a() + 8;
        }
        if (this.f6586V != null) {
            this.f6591b.newUTF8("RuntimeInvisibleTypeAnnotations");
            iM8891a += this.f6586V.m8891a() + 8;
        }
        if (this.f6604o != null) {
            this.f6591b.newUTF8(AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME);
            length = iM8891a + ((this.f6604o.length - this.f6583S) * 2) + 7;
            int length2 = this.f6604o.length;
            while (true) {
                length2--;
                if (length2 < this.f6583S) {
                    break;
                }
                length += this.f6604o[length2] == null ? 0 : this.f6604o[length2].m8891a();
            }
        } else {
            length = iM8891a;
        }
        if (this.f6605p != null) {
            this.f6591b.newUTF8(AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME);
            length += ((this.f6605p.length - this.f6583S) * 2) + 7;
            int length3 = this.f6605p.length;
            while (true) {
                length3--;
                if (length3 < this.f6583S) {
                    break;
                }
                length += this.f6605p[length3] == null ? 0 : this.f6605p[length3].m8891a();
            }
        }
        int i = length;
        return this.f6606q != null ? this.f6606q.m8894a(this.f6591b, null, 0, -1, -1) + i : i;
    }

    final void m8989a(ByteVector byteVector) {
        byteVector.putShort(((((this.f6592c & 262144) / 64) | 917504) ^ (-1)) & this.f6592c).putShort(this.f6593d).putShort(this.f6594e);
        if (this.f6597h != 0) {
            byteVector.putByteArray(this.f6591b.f6459M.f6442b, this.f6597h, this.f6598i);
            return;
        }
        int iM8893a = this.f6607r.f6440b > 0 ? 1 : 0;
        if (this.f6599j > 0) {
            iM8893a++;
        }
        if ((this.f6592c & 4096) != 0 && ((this.f6591b.f6462b & 65535) < 49 || (this.f6592c & 262144) != 0)) {
            iM8893a++;
        }
        if ((this.f6592c & 131072) != 0) {
            iM8893a++;
        }
        if (this.f6596g != null) {
            iM8893a++;
        }
        if (this.f6564$ != null) {
            iM8893a++;
        }
        if (this.f6601l != null) {
            iM8893a++;
        }
        if (this.f6602m != null) {
            iM8893a++;
        }
        if (this.f6603n != null) {
            iM8893a++;
        }
        if (this.f6585U != null) {
            iM8893a++;
        }
        if (this.f6586V != null) {
            iM8893a++;
        }
        if (this.f6604o != null) {
            iM8893a++;
        }
        if (this.f6605p != null) {
            iM8893a++;
        }
        if (this.f6606q != null) {
            iM8893a += this.f6606q.m8893a();
        }
        byteVector.putShort(iM8893a);
        if (this.f6607r.f6440b > 0) {
            int iM8891a = this.f6607r.f6440b + 12 + (this.f6565A * 8);
            if (this.f6569E != null) {
                iM8891a += this.f6569E.f6440b + 8;
            }
            if (this.f6571G != null) {
                iM8891a += this.f6571G.f6440b + 8;
            }
            if (this.f6573I != null) {
                iM8891a += this.f6573I.f6440b + 8;
            }
            if (this.f6611v != null) {
                iM8891a += this.f6611v.f6440b + 8;
            }
            if (this.f6587W != null) {
                iM8891a += this.f6587W.m8891a() + 8;
            }
            int iM8891a2 = this.f6588X != null ? iM8891a + this.f6588X.m8891a() + 8 : iM8891a;
            if (this.f6574J != null) {
                iM8891a2 += this.f6574J.m8894a(this.f6591b, this.f6607r.f6439a, this.f6607r.f6440b, this.f6608s, this.f6609t);
            }
            byteVector.putShort(this.f6591b.newUTF8(AttCode.ATTRIBUTE_NAME)).putInt(iM8891a2);
            byteVector.putShort(this.f6608s).putShort(this.f6609t);
            byteVector.putInt(this.f6607r.f6440b).putByteArray(this.f6607r.f6439a, 0, this.f6607r.f6440b);
            byteVector.putShort(this.f6565A);
            if (this.f6565A > 0) {
                for (Handler handler = this.f6566B; handler != null; handler = handler.f6541f) {
                    byteVector.putShort(handler.f6536a.f6553c).putShort(handler.f6537b.f6553c).putShort(handler.f6538c.f6553c).putShort(handler.f6540e);
                }
            }
            int iM8893a2 = this.f6569E != null ? 1 : 0;
            if (this.f6571G != null) {
                iM8893a2++;
            }
            if (this.f6573I != null) {
                iM8893a2++;
            }
            if (this.f6611v != null) {
                iM8893a2++;
            }
            if (this.f6587W != null) {
                iM8893a2++;
            }
            if (this.f6588X != null) {
                iM8893a2++;
            }
            if (this.f6574J != null) {
                iM8893a2 += this.f6574J.m8893a();
            }
            byteVector.putShort(iM8893a2);
            if (this.f6569E != null) {
                byteVector.putShort(this.f6591b.newUTF8(AttLocalVariableTable.ATTRIBUTE_NAME));
                byteVector.putInt(this.f6569E.f6440b + 2).putShort(this.f6568D);
                byteVector.putByteArray(this.f6569E.f6439a, 0, this.f6569E.f6440b);
            }
            if (this.f6571G != null) {
                byteVector.putShort(this.f6591b.newUTF8(AttLocalVariableTypeTable.ATTRIBUTE_NAME));
                byteVector.putInt(this.f6571G.f6440b + 2).putShort(this.f6570F);
                byteVector.putByteArray(this.f6571G.f6439a, 0, this.f6571G.f6440b);
            }
            if (this.f6573I != null) {
                byteVector.putShort(this.f6591b.newUTF8(AttLineNumberTable.ATTRIBUTE_NAME));
                byteVector.putInt(this.f6573I.f6440b + 2).putShort(this.f6572H);
                byteVector.putByteArray(this.f6573I.f6439a, 0, this.f6573I.f6440b);
            }
            if (this.f6611v != null) {
                byteVector.putShort(this.f6591b.newUTF8((this.f6591b.f6462b & 65535) >= 50 ? "StackMapTable" : "StackMap"));
                byteVector.putInt(this.f6611v.f6440b + 2).putShort(this.f6610u);
                byteVector.putByteArray(this.f6611v.f6439a, 0, this.f6611v.f6440b);
            }
            if (this.f6587W != null) {
                byteVector.putShort(this.f6591b.newUTF8("RuntimeVisibleTypeAnnotations"));
                this.f6587W.m8892a(byteVector);
            }
            if (this.f6588X != null) {
                byteVector.putShort(this.f6591b.newUTF8("RuntimeInvisibleTypeAnnotations"));
                this.f6588X.m8892a(byteVector);
            }
            if (this.f6574J != null) {
                this.f6574J.m8895a(this.f6591b, this.f6607r.f6439a, this.f6607r.f6440b, this.f6609t, this.f6608s, byteVector);
            }
        }
        if (this.f6599j > 0) {
            byteVector.putShort(this.f6591b.newUTF8(AttExceptions.ATTRIBUTE_NAME)).putInt((this.f6599j * 2) + 2);
            byteVector.putShort(this.f6599j);
            for (int i = 0; i < this.f6599j; i++) {
                byteVector.putShort(this.f6600k[i]);
            }
        }
        if ((this.f6592c & 4096) != 0 && ((this.f6591b.f6462b & 65535) < 49 || (this.f6592c & 262144) != 0)) {
            byteVector.putShort(this.f6591b.newUTF8(AttSynthetic.ATTRIBUTE_NAME)).putInt(0);
        }
        if ((this.f6592c & 131072) != 0) {
            byteVector.putShort(this.f6591b.newUTF8(AttDeprecated.ATTRIBUTE_NAME)).putInt(0);
        }
        if (this.f6596g != null) {
            byteVector.putShort(this.f6591b.newUTF8(AttSignature.ATTRIBUTE_NAME)).putInt(2).putShort(this.f6591b.newUTF8(this.f6596g));
        }
        if (this.f6564$ != null) {
            byteVector.putShort(this.f6591b.newUTF8("MethodParameters"));
            byteVector.putInt(this.f6564$.f6440b + 1).putByte(this.f6590Z);
            byteVector.putByteArray(this.f6564$.f6439a, 0, this.f6564$.f6440b);
        }
        if (this.f6601l != null) {
            byteVector.putShort(this.f6591b.newUTF8(AttAnnotationDefault.ATTRIBUTE_NAME));
            byteVector.putInt(this.f6601l.f6440b);
            byteVector.putByteArray(this.f6601l.f6439a, 0, this.f6601l.f6440b);
        }
        if (this.f6602m != null) {
            byteVector.putShort(this.f6591b.newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME));
            this.f6602m.m8892a(byteVector);
        }
        if (this.f6603n != null) {
            byteVector.putShort(this.f6591b.newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME));
            this.f6603n.m8892a(byteVector);
        }
        if (this.f6585U != null) {
            byteVector.putShort(this.f6591b.newUTF8("RuntimeVisibleTypeAnnotations"));
            this.f6585U.m8892a(byteVector);
        }
        if (this.f6586V != null) {
            byteVector.putShort(this.f6591b.newUTF8("RuntimeInvisibleTypeAnnotations"));
            this.f6586V.m8892a(byteVector);
        }
        if (this.f6604o != null) {
            byteVector.putShort(this.f6591b.newUTF8(AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME));
            AnnotationWriter.m8890a(this.f6604o, this.f6583S, byteVector);
        }
        if (this.f6605p != null) {
            byteVector.putShort(this.f6591b.newUTF8(AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME));
            AnnotationWriter.m8890a(this.f6605p, this.f6583S, byteVector);
        }
        if (this.f6606q != null) {
            this.f6606q.m8895a(this.f6591b, null, 0, -1, -1, byteVector);
        }
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.f6591b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f6591b, true, byteVector, byteVector, 2);
        if (z) {
            annotationWriter.f6435g = this.f6602m;
            this.f6602m = annotationWriter;
        } else {
            annotationWriter.f6435g = this.f6603n;
            this.f6603n = annotationWriter;
        }
        return annotationWriter;
    }

    @Override
    public AnnotationVisitor visitAnnotationDefault() {
        this.f6601l = new ByteVector();
        return new AnnotationWriter(this.f6591b, false, this.f6601l, null, 0);
    }

    @Override
    public void visitAttribute(Attribute attribute) {
        if (attribute.isCodeAttribute()) {
            attribute.f6437a = this.f6574J;
            this.f6574J = attribute;
        } else {
            attribute.f6437a = this.f6606q;
            this.f6606q = attribute;
        }
    }

    @Override
    public void visitCode() {
    }

    @Override
    public void visitEnd() {
    }

    @Override
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        int i2;
        int i3 = 1;
        int i4 = -2;
        this.f6589Y = this.f6607r.f6440b;
        Item itemM8933a = this.f6591b.m8933a(str, str2, str3);
        if (this.f6580P != null) {
            if (this.f6577M == 0) {
                this.f6580P.f6558h.m8951a(i, 0, this.f6591b, itemM8933a);
            } else {
                char cCharAt = str3.charAt(0);
                switch (i) {
                    case 178:
                        i2 = ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1) + this.f6581Q;
                        break;
                    case 179:
                        int i5 = this.f6581Q;
                        if (cCharAt != 'D' && cCharAt != 'J') {
                            i4 = -1;
                        }
                        i2 = i4 + i5;
                        break;
                    case 180:
                        int i6 = this.f6581Q;
                        if (cCharAt != 'D' && cCharAt != 'J') {
                            i3 = 0;
                        }
                        i2 = i6 + i3;
                        break;
                    default:
                        i2 = ((cCharAt == 'D' || cCharAt == 'J') ? -3 : -2) + this.f6581Q;
                        break;
                }
                if (i2 > this.f6582R) {
                    this.f6582R = i2;
                }
                this.f6581Q = i2;
            }
        }
        this.f6607r.m8898b(i, itemM8933a.f6542a);
    }

    @Override
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (this.f6577M == 0) {
            return;
        }
        if (i == -1) {
            if (this.f6613x == null) {
                m8987f();
            }
            this.f6584T = i2;
            int iM8971a = m8971a(this.f6607r.f6440b, i2, i3);
            int i8 = 0;
            while (i8 < i2) {
                if (objArr[i8] instanceof String) {
                    i6 = iM8971a + 1;
                    this.f6614z[iM8971a] = this.f6591b.m8936c((String) objArr[i8]) | 24117248;
                } else if (objArr[i8] instanceof Integer) {
                    i6 = iM8971a + 1;
                    this.f6614z[iM8971a] = ((Integer) objArr[i8]).intValue();
                } else {
                    i6 = iM8971a + 1;
                    this.f6614z[iM8971a] = this.f6591b.m8924a("", ((Label) objArr[i8]).f6553c) | 25165824;
                }
                i8++;
                iM8971a = i6;
            }
            while (i7 < i3) {
                if (objArr2[i7] instanceof String) {
                    i5 = iM8971a + 1;
                    this.f6614z[iM8971a] = this.f6591b.m8936c((String) objArr2[i7]) | 24117248;
                } else if (objArr2[i7] instanceof Integer) {
                    i5 = iM8971a + 1;
                    this.f6614z[iM8971a] = ((Integer) objArr2[i7]).intValue();
                } else {
                    i5 = iM8971a + 1;
                    this.f6614z[iM8971a] = this.f6591b.m8924a("", ((Label) objArr2[i7]).f6553c) | 25165824;
                }
                i7++;
                iM8971a = i5;
            }
            m8981b();
        } else {
            if (this.f6611v == null) {
                this.f6611v = new ByteVector();
                i4 = this.f6607r.f6440b;
            } else {
                i4 = (this.f6607r.f6440b - this.f6612w) - 1;
                if (i4 < 0) {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    return;
                }
            }
            switch (i) {
                case 0:
                    this.f6584T = i2;
                    this.f6611v.putByte(255).putShort(i4).putShort(i2);
                    for (int i9 = 0; i9 < i2; i9++) {
                        m8976a(objArr[i9]);
                    }
                    this.f6611v.putShort(i3);
                    while (i7 < i3) {
                        m8976a(objArr2[i7]);
                        i7++;
                    }
                    break;
                case 1:
                    this.f6584T += i2;
                    this.f6611v.putByte(i2 + Opcodes.INVOKE_POLYMORPHIC_RANGE).putShort(i4);
                    for (int i10 = 0; i10 < i2; i10++) {
                        m8976a(objArr[i10]);
                    }
                    break;
                case 2:
                    this.f6584T -= i2;
                    this.f6611v.putByte(251 - i2).putShort(i4);
                    break;
                case 3:
                    if (i4 < 64) {
                        this.f6611v.putByte(i4);
                    } else {
                        this.f6611v.putByte(Opcodes.INVOKE_POLYMORPHIC_RANGE).putShort(i4);
                    }
                    break;
                case 4:
                    if (i4 < 64) {
                        this.f6611v.putByte(i4 + 64);
                    } else {
                        this.f6611v.putByte(247).putShort(i4);
                    }
                    m8976a(objArr2[0]);
                    break;
            }
            this.f6612w = this.f6607r.f6440b;
            this.f6610u++;
        }
        this.f6608s = Math.max(this.f6608s, i3);
        this.f6609t = Math.max(this.f6609t, this.f6584T);
    }

    @Override
    public void visitIincInsn(int i, int i2) {
        int i3;
        this.f6589Y = this.f6607r.f6440b;
        if (this.f6580P != null && this.f6577M == 0) {
            this.f6580P.f6558h.m8951a(132, i, (ClassWriter) null, (Item) null);
        }
        if (this.f6577M != 2 && (i3 = i + 1) > this.f6609t) {
            this.f6609t = i3;
        }
        if (i > 255 || i2 > 127 || i2 < -128) {
            this.f6607r.putByte(196).m8898b(132, i).putShort(i2);
        } else {
            this.f6607r.putByte(132).m8897a(i, i2);
        }
    }

    @Override
    public void visitInsn(int i) {
        this.f6589Y = this.f6607r.f6440b;
        this.f6607r.putByte(i);
        if (this.f6580P != null) {
            if (this.f6577M == 0) {
                this.f6580P.f6558h.m8951a(i, 0, (ClassWriter) null, (Item) null);
            } else {
                int i2 = this.f6581Q + Frame.f6523a[i];
                if (i2 > this.f6582R) {
                    this.f6582R = i2;
                }
                this.f6581Q = i2;
            }
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            m8986e();
        }
    }

    @Override
    public AnnotationVisitor visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.m8889a(((-16776961) & i) | (this.f6589Y << 8), typePath, byteVector);
        byteVector.putShort(this.f6591b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f6591b, true, byteVector, byteVector, byteVector.f6440b - 2);
        if (z) {
            annotationWriter.f6435g = this.f6587W;
            this.f6587W = annotationWriter;
        } else {
            annotationWriter.f6435g = this.f6588X;
            this.f6588X = annotationWriter;
        }
        return annotationWriter;
    }

    @Override
    public void visitIntInsn(int i, int i2) {
        this.f6589Y = this.f6607r.f6440b;
        if (this.f6580P != null) {
            if (this.f6577M == 0) {
                this.f6580P.f6558h.m8951a(i, i2, (ClassWriter) null, (Item) null);
            } else if (i != 188) {
                int i3 = this.f6581Q + 1;
                if (i3 > this.f6582R) {
                    this.f6582R = i3;
                }
                this.f6581Q = i3;
            }
        }
        if (i == 17) {
            this.f6607r.m8898b(i, i2);
        } else {
            this.f6607r.m8897a(i, i2);
        }
    }

    @Override
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.f6589Y = this.f6607r.f6440b;
        Item itemM8935a = this.f6591b.m8935a(str, str2, handle, objArr);
        int argumentsAndReturnSizes = itemM8935a.f6544c;
        if (this.f6580P != null) {
            if (this.f6577M == 0) {
                this.f6580P.f6558h.m8951a(186, 0, this.f6591b, itemM8935a);
            } else {
                if (argumentsAndReturnSizes == 0) {
                    argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str2);
                    itemM8935a.f6544c = argumentsAndReturnSizes;
                }
                int i = (argumentsAndReturnSizes & 3) + (this.f6581Q - (argumentsAndReturnSizes >> 2)) + 1;
                if (i > this.f6582R) {
                    this.f6582R = i;
                }
                this.f6581Q = i;
            }
        }
        this.f6607r.m8898b(186, itemM8935a.f6542a);
        this.f6607r.putShort(0);
    }

    @Override
    public void visitJumpInsn(int i, Label label) {
        Label label2 = null;
        this.f6589Y = this.f6607r.f6440b;
        if (this.f6580P != null) {
            if (this.f6577M == 0) {
                this.f6580P.f6558h.m8951a(i, 0, (ClassWriter) null, (Item) null);
                label.m8964a().f6551a |= 16;
                m8975a(0, label);
                if (i != 167) {
                    label2 = new Label();
                }
            } else if (i == 168) {
                if ((label.f6551a & 512) == 0) {
                    label.f6551a |= 512;
                    this.f6576L++;
                }
                this.f6580P.f6551a |= 128;
                m8975a(this.f6581Q + 1, label);
                label2 = new Label();
            } else {
                this.f6581Q += Frame.f6523a[i];
                m8975a(this.f6581Q, label);
            }
        }
        if ((label.f6551a & 2) == 0 || label.f6553c - this.f6607r.f6440b >= -32768) {
            this.f6607r.putByte(i);
            label.m8966a(this, this.f6607r, this.f6607r.f6440b - 1, false);
        } else {
            if (i == 167) {
                this.f6607r.putByte(200);
            } else if (i == 168) {
                this.f6607r.putByte(201);
            } else {
                if (label2 != null) {
                    label2.f6551a |= 16;
                }
                this.f6607r.putByte(i <= 166 ? ((i + 1) ^ 1) - 1 : i ^ 1);
                this.f6607r.putShort(8);
                this.f6607r.putByte(200);
            }
            label.m8966a(this, this.f6607r, this.f6607r.f6440b - 1, true);
        }
        if (this.f6580P != null) {
            if (label2 != null) {
                visitLabel(label2);
            }
            if (i == 167) {
                m8986e();
            }
        }
    }

    @Override
    public void visitLabel(Label label) {
        this.f6575K |= label.m8969a(this, this.f6607r.f6440b, this.f6607r.f6439a);
        if ((label.f6551a & 1) != 0) {
            return;
        }
        if (this.f6577M != 0) {
            if (this.f6577M == 1) {
                if (this.f6580P != null) {
                    this.f6580P.f6557g = this.f6582R;
                    m8975a(this.f6581Q, label);
                }
                this.f6580P = label;
                this.f6581Q = 0;
                this.f6582R = 0;
                if (this.f6579O != null) {
                    this.f6579O.f6559i = label;
                }
                this.f6579O = label;
                return;
            }
            return;
        }
        if (this.f6580P != null) {
            if (label.f6553c == this.f6580P.f6553c) {
                this.f6580P.f6551a |= label.f6551a & 16;
                label.f6558h = this.f6580P.f6558h;
                return;
            }
            m8975a(0, label);
        }
        this.f6580P = label;
        if (label.f6558h == null) {
            label.f6558h = new Frame();
            label.f6558h.f6524b = label;
        }
        if (this.f6579O != null) {
            if (label.f6553c == this.f6579O.f6553c) {
                this.f6579O.f6551a |= label.f6551a & 16;
                label.f6558h = this.f6579O.f6558h;
                this.f6580P = this.f6579O;
                return;
            }
            this.f6579O.f6559i = label;
        }
        this.f6579O = label;
    }

    @Override
    public void visitLdcInsn(Object obj) {
        this.f6589Y = this.f6607r.f6440b;
        Item itemM8930a = this.f6591b.m8930a(obj);
        if (this.f6580P != null) {
            if (this.f6577M == 0) {
                this.f6580P.f6558h.m8951a(18, 0, this.f6591b, itemM8930a);
            } else {
                int i = (itemM8930a.f6543b == 5 || itemM8930a.f6543b == 6) ? this.f6581Q + 2 : this.f6581Q + 1;
                if (i > this.f6582R) {
                    this.f6582R = i;
                }
                this.f6581Q = i;
            }
        }
        int i2 = itemM8930a.f6542a;
        if (itemM8930a.f6543b == 5 || itemM8930a.f6543b == 6) {
            this.f6607r.m8898b(20, i2);
        } else if (i2 >= 256) {
            this.f6607r.m8898b(19, i2);
        } else {
            this.f6607r.m8897a(18, i2);
        }
    }

    @Override
    public void visitLineNumber(int i, Label label) {
        if (this.f6573I == null) {
            this.f6573I = new ByteVector();
        }
        this.f6572H++;
        this.f6573I.putShort(label.f6553c);
        this.f6573I.putShort(i);
    }

    @Override
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        int i2 = 2;
        if (str3 != null) {
            if (this.f6571G == null) {
                this.f6571G = new ByteVector();
            }
            this.f6570F++;
            this.f6571G.putShort(label.f6553c).putShort(label2.f6553c - label.f6553c).putShort(this.f6591b.newUTF8(str)).putShort(this.f6591b.newUTF8(str3)).putShort(i);
        }
        if (this.f6569E == null) {
            this.f6569E = new ByteVector();
        }
        this.f6568D++;
        this.f6569E.putShort(label.f6553c).putShort(label2.f6553c - label.f6553c).putShort(this.f6591b.newUTF8(str)).putShort(this.f6591b.newUTF8(str2)).putShort(i);
        if (this.f6577M != 2) {
            char cCharAt = str2.charAt(0);
            if (cCharAt != 'J' && cCharAt != 'D') {
                i2 = 1;
            }
            int i3 = i2 + i;
            if (i3 > this.f6609t) {
                this.f6609t = i3;
            }
        }
    }

    @Override
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putByte(i >>> 24).putShort(labelArr.length);
        for (int i2 = 0; i2 < labelArr.length; i2++) {
            byteVector.putShort(labelArr[i2].f6553c).putShort(labelArr2[i2].f6553c - labelArr[i2].f6553c).putShort(iArr[i2]);
        }
        if (typePath == null) {
            byteVector.putByte(0);
        } else {
            byteVector.putByteArray(typePath.f6645a, typePath.f6646b, (typePath.f6645a[typePath.f6646b] * 2) + 1);
        }
        byteVector.putShort(this.f6591b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f6591b, true, byteVector, byteVector, byteVector.f6440b - 2);
        if (z) {
            annotationWriter.f6435g = this.f6587W;
            this.f6587W = annotationWriter;
        } else {
            annotationWriter.f6435g = this.f6588X;
            this.f6588X = annotationWriter;
        }
        return annotationWriter;
    }

    @Override
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.f6589Y = this.f6607r.f6440b;
        int i = this.f6607r.f6440b;
        this.f6607r.putByte(171);
        this.f6607r.putByteArray(null, 0, (4 - (this.f6607r.f6440b % 4)) % 4);
        label.m8966a(this, this.f6607r, i, true);
        this.f6607r.putInt(labelArr.length);
        for (int i2 = 0; i2 < labelArr.length; i2++) {
            this.f6607r.putInt(iArr[i2]);
            labelArr[i2].m8966a(this, this.f6607r, i, true);
        }
        m8977a(label, labelArr);
    }

    @Override
    public void visitMaxs(int i, int i2) {
        Label label;
        if (this.f6575K) {
            m8985d();
        }
        if (this.f6577M != 0) {
            if (this.f6577M != 1) {
                this.f6608s = i;
                this.f6609t = i2;
                return;
            }
            for (Handler handler = this.f6566B; handler != null; handler = handler.f6541f) {
                Label label2 = handler.f6538c;
                Label label3 = handler.f6537b;
                for (Label label4 = handler.f6536a; label4 != label3; label4 = label4.f6559i) {
                    Edge edge = new Edge();
                    edge.f6507a = Integer.MAX_VALUE;
                    edge.f6508b = label2;
                    if ((label4.f6551a & 128) == 0) {
                        edge.f6509c = label4.f6560j;
                        label4.f6560j = edge;
                    } else {
                        edge.f6509c = label4.f6560j.f6509c.f6509c;
                        label4.f6560j.f6509c.f6509c = edge;
                    }
                }
            }
            if (this.f6576L > 0) {
                this.f6578N.m8970b(null, 1L, this.f6576L);
                int i3 = 0;
                for (Label label5 = this.f6578N; label5 != null; label5 = label5.f6559i) {
                    if ((label5.f6551a & 128) != 0) {
                        Label label6 = label5.f6560j.f6509c.f6508b;
                        if ((label6.f6551a & 1024) == 0) {
                            i3++;
                            label6.m8970b(null, ((((long) i3) / 32) << 32) | (1 << (i3 % 32)), this.f6576L);
                        }
                    }
                }
                for (Label label7 = this.f6578N; label7 != null; label7 = label7.f6559i) {
                    if ((label7.f6551a & 128) != 0) {
                        for (Label label8 = this.f6578N; label8 != null; label8 = label8.f6559i) {
                            label8.f6551a &= -2049;
                        }
                        label7.f6560j.f6509c.f6508b.m8970b(label7, 0L, this.f6576L);
                    }
                }
            }
            int i4 = 0;
            Label label9 = this.f6578N;
            while (label9 != null) {
                Label label10 = label9.f6561k;
                int i5 = label9.f6556f;
                int i6 = label9.f6557g + i5;
                if (i6 <= i4) {
                    i6 = i4;
                }
                Edge edge2 = label9.f6560j;
                Edge edge3 = (label9.f6551a & 128) != 0 ? edge2.f6509c : edge2;
                while (edge3 != null) {
                    Label label11 = edge3.f6508b;
                    if ((label11.f6551a & 8) == 0) {
                        label11.f6556f = edge3.f6507a == Integer.MAX_VALUE ? 1 : edge3.f6507a + i5;
                        label11.f6551a |= 8;
                        label11.f6561k = label10;
                        label = label11;
                    } else {
                        label = label10;
                    }
                    edge3 = edge3.f6509c;
                    label10 = label;
                }
                i4 = i6;
                label9 = label10;
            }
            this.f6608s = Math.max(i, i4);
            return;
        }
        for (Handler handler2 = this.f6566B; handler2 != null; handler2 = handler2.f6541f) {
            Label labelM8964a = handler2.f6536a.m8964a();
            Label labelM8964a2 = handler2.f6538c.m8964a();
            Label labelM8964a3 = handler2.f6537b.m8964a();
            int iM8936c = this.f6591b.m8936c(handler2.f6539d == null ? "java/lang/Throwable" : handler2.f6539d);
            labelM8964a2.f6551a |= 16;
            for (Label label12 = labelM8964a; label12 != labelM8964a3; label12 = label12.f6559i) {
                Edge edge4 = new Edge();
                edge4.f6507a = 24117248 | iM8936c;
                edge4.f6508b = labelM8964a2;
                edge4.f6509c = label12.f6560j;
                label12.f6560j = edge4;
            }
        }
        Frame frame = this.f6578N.f6558h;
        frame.m8952a(this.f6591b, this.f6592c, Type.getArgumentTypes(this.f6595f), this.f6609t);
        m8982b(frame);
        Label label13 = this.f6578N;
        int i7 = 0;
        while (label13 != null) {
            Label label14 = label13.f6561k;
            label13.f6561k = null;
            Frame frame2 = label13.f6558h;
            if ((label13.f6551a & 16) != 0) {
                label13.f6551a |= 32;
            }
            label13.f6551a |= 64;
            int length = frame2.f6526d.length + label13.f6557g;
            if (length > i7) {
                i7 = length;
            }
            Edge edge5 = label13.f6560j;
            label13 = label14;
            while (edge5 != null) {
                Label labelM8964a4 = edge5.f6508b.m8964a();
                if (frame2.m8953a(this.f6591b, labelM8964a4.f6558h, edge5.f6507a) && labelM8964a4.f6561k == null) {
                    labelM8964a4.f6561k = label13;
                } else {
                    labelM8964a4 = label13;
                }
                edge5 = edge5.f6509c;
                label13 = labelM8964a4;
            }
        }
        int iMax = i7;
        for (Label label15 = this.f6578N; label15 != null; label15 = label15.f6559i) {
            Frame frame3 = label15.f6558h;
            if ((label15.f6551a & 32) != 0) {
                m8982b(frame3);
            }
            if ((label15.f6551a & 64) == 0) {
                Label label16 = label15.f6559i;
                int i8 = label15.f6553c;
                int i9 = (label16 == null ? this.f6607r.f6440b : label16.f6553c) - 1;
                if (i9 >= i8) {
                    iMax = Math.max(iMax, 1);
                    for (int i10 = i8; i10 < i9; i10++) {
                        this.f6607r.f6439a[i10] = (byte) 0;
                    }
                    this.f6607r.f6439a[i9] = (byte) (-65);
                    this.f6614z[m8971a(i8, 0, 1)] = this.f6591b.m8936c("java/lang/Throwable") | 24117248;
                    m8981b();
                    this.f6566B = Handler.m8954a(this.f6566B, label15, label16);
                }
            }
        }
        this.f6565A = 0;
        for (Handler handler3 = this.f6566B; handler3 != null; handler3 = handler3.f6541f) {
            this.f6565A++;
        }
        this.f6608s = iMax;
    }

    @Override
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        this.f6589Y = this.f6607r.f6440b;
        Item itemM8934a = this.f6591b.m8934a(str, str2, str3, z);
        int argumentsAndReturnSizes = itemM8934a.f6544c;
        if (this.f6580P != null) {
            if (this.f6577M == 0) {
                this.f6580P.f6558h.m8951a(i, 0, this.f6591b, itemM8934a);
            } else {
                if (argumentsAndReturnSizes == 0) {
                    argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str3);
                    itemM8934a.f6544c = argumentsAndReturnSizes;
                }
                int i2 = argumentsAndReturnSizes;
                int i3 = i == 184 ? (this.f6581Q - (i2 >> 2)) + (i2 & 3) + 1 : (this.f6581Q - (i2 >> 2)) + (i2 & 3);
                if (i3 > this.f6582R) {
                    this.f6582R = i3;
                }
                this.f6581Q = i3;
                argumentsAndReturnSizes = i2;
            }
        }
        if (i != 185) {
            this.f6607r.m8898b(i, itemM8934a.f6542a);
            return;
        }
        if (argumentsAndReturnSizes == 0) {
            argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str3);
            itemM8934a.f6544c = argumentsAndReturnSizes;
        }
        this.f6607r.m8898b(185, itemM8934a.f6542a).m8897a(argumentsAndReturnSizes >> 2, 0);
    }

    @Override
    public void visitMultiANewArrayInsn(String str, int i) {
        this.f6589Y = this.f6607r.f6440b;
        Item itemM8931a = this.f6591b.m8931a(str);
        if (this.f6580P != null) {
            if (this.f6577M == 0) {
                this.f6580P.f6558h.m8951a(197, i, this.f6591b, itemM8931a);
            } else {
                this.f6581Q += 1 - i;
            }
        }
        this.f6607r.m8898b(197, itemM8931a.f6542a).putByte(i);
    }

    @Override
    public void visitParameter(String str, int i) {
        if (this.f6564$ == null) {
            this.f6564$ = new ByteVector();
        }
        this.f6590Z++;
        this.f6564$.putShort(str == null ? 0 : this.f6591b.newUTF8(str)).putShort(i);
    }

    @Override
    public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        if ("Ljava/lang/Synthetic;".equals(str)) {
            this.f6583S = Math.max(this.f6583S, i + 1);
            return new AnnotationWriter(this.f6591b, false, byteVector, null, 0);
        }
        byteVector.putShort(this.f6591b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f6591b, true, byteVector, byteVector, 2);
        if (z) {
            if (this.f6604o == null) {
                this.f6604o = new AnnotationWriter[Type.getArgumentTypes(this.f6595f).length];
            }
            annotationWriter.f6435g = this.f6604o[i];
            this.f6604o[i] = annotationWriter;
            return annotationWriter;
        }
        if (this.f6605p == null) {
            this.f6605p = new AnnotationWriter[Type.getArgumentTypes(this.f6595f).length];
        }
        annotationWriter.f6435g = this.f6605p[i];
        this.f6605p[i] = annotationWriter;
        return annotationWriter;
    }

    @Override
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        this.f6589Y = this.f6607r.f6440b;
        int i3 = this.f6607r.f6440b;
        this.f6607r.putByte(170);
        this.f6607r.putByteArray(null, 0, (4 - (this.f6607r.f6440b % 4)) % 4);
        label.m8966a(this, this.f6607r, i3, true);
        this.f6607r.putInt(i).putInt(i2);
        for (Label label2 : labelArr) {
            label2.m8966a(this, this.f6607r, i3, true);
        }
        m8977a(label, labelArr);
    }

    @Override
    public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.m8889a(i, typePath, byteVector);
        byteVector.putShort(this.f6591b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f6591b, true, byteVector, byteVector, byteVector.f6440b - 2);
        if (z) {
            annotationWriter.f6435g = this.f6587W;
            this.f6587W = annotationWriter;
        } else {
            annotationWriter.f6435g = this.f6588X;
            this.f6588X = annotationWriter;
        }
        return annotationWriter;
    }

    @Override
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.f6565A++;
        Handler handler = new Handler();
        handler.f6536a = label;
        handler.f6537b = label2;
        handler.f6538c = label3;
        handler.f6539d = str;
        handler.f6540e = str != null ? this.f6591b.newClass(str) : 0;
        if (this.f6567C == null) {
            this.f6566B = handler;
        } else {
            this.f6567C.f6541f = handler;
        }
        this.f6567C = handler;
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.m8889a(i, typePath, byteVector);
        byteVector.putShort(this.f6591b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f6591b, true, byteVector, byteVector, byteVector.f6440b - 2);
        if (z) {
            annotationWriter.f6435g = this.f6585U;
            this.f6585U = annotationWriter;
        } else {
            annotationWriter.f6435g = this.f6586V;
            this.f6586V = annotationWriter;
        }
        return annotationWriter;
    }

    @Override
    public void visitTypeInsn(int i, String str) {
        this.f6589Y = this.f6607r.f6440b;
        Item itemM8931a = this.f6591b.m8931a(str);
        if (this.f6580P != null) {
            if (this.f6577M == 0) {
                this.f6580P.f6558h.m8951a(i, this.f6607r.f6440b, this.f6591b, itemM8931a);
            } else if (i == 187) {
                int i2 = this.f6581Q + 1;
                if (i2 > this.f6582R) {
                    this.f6582R = i2;
                }
                this.f6581Q = i2;
            }
        }
        this.f6607r.m8898b(i, itemM8931a.f6542a);
    }

    @Override
    public void visitVarInsn(int i, int i2) {
        this.f6589Y = this.f6607r.f6440b;
        if (this.f6580P != null) {
            if (this.f6577M == 0) {
                this.f6580P.f6558h.m8951a(i, i2, (ClassWriter) null, (Item) null);
            } else if (i == 169) {
                this.f6580P.f6551a |= 256;
                this.f6580P.f6556f = this.f6581Q;
                m8986e();
            } else {
                int i3 = this.f6581Q + Frame.f6523a[i];
                if (i3 > this.f6582R) {
                    this.f6582R = i3;
                }
                this.f6581Q = i3;
            }
        }
        if (this.f6577M != 2) {
            int i4 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
            if (i4 > this.f6609t) {
                this.f6609t = i4;
            }
        }
        if (i2 < 4 && i != 169) {
            this.f6607r.putByte(i < 54 ? ((i - 21) << 2) + 26 + i2 : ((i - 54) << 2) + 59 + i2);
        } else if (i2 >= 256) {
            this.f6607r.putByte(196).m8898b(i, i2);
        } else {
            this.f6607r.m8897a(i, i2);
        }
        if (i < 54 || this.f6577M != 0 || this.f6565A <= 0) {
            return;
        }
        visitLabel(new Label());
    }
}
