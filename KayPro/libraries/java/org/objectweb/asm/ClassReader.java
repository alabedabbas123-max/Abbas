package org.objectweb.asm;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttAnnotationDefault;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttBootstrapMethods;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttCode;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttConstantValue;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttDeprecated;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttEnclosingMethod;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttExceptions;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttInnerClasses;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLineNumberTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTypeTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSignature;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSourceDebugExtension;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSourceFile;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSynthetic;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.FilenameUtils;

public class ClassReader {
    public static final int EXPAND_FRAMES = 8;
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;

    private final int[] f6441a;

    public final byte[] f6442b;

    private final String[] f6443c;

    private final int f6444d;
    public final int header;

    public ClassReader(InputStream inputStream) throws IOException {
        this(m8912a(inputStream, false));
    }

    public ClassReader(String str) throws IOException {
        this(m8912a(ClassLoader.getSystemResourceAsStream(new StringBuffer().append(str.replace(FilenameUtils.EXTENSION_SEPARATOR, '/')).append(".class").toString()), true));
    }

    public ClassReader(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ClassReader(byte[] bArr, int i, int i2) {
        int i3;
        this.f6442b = bArr;
        if (readShort(i + 6) > 52) {
            throw new IllegalArgumentException();
        }
        this.f6441a = new int[readUnsignedShort(i + 8)];
        int length = this.f6441a.length;
        this.f6443c = new String[length];
        int i4 = 0;
        int i5 = 1;
        int i6 = i + 10;
        while (i5 < length) {
            this.f6441a[i5] = i6 + 1;
            switch (bArr[i6]) {
                case 1:
                    int unsignedShort = readUnsignedShort(i6 + 1) + 3;
                    if (unsignedShort <= i4) {
                        i3 = unsignedShort;
                    } else {
                        i4 = unsignedShort;
                        i3 = unsignedShort;
                    }
                    break;
                case 2:
                case 7:
                case 8:
                case 13:
                case 14:
                case 16:
                case 17:
                default:
                    i3 = 3;
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                case 18:
                    i3 = 5;
                    break;
                case 5:
                case 6:
                    i3 = 9;
                    i5++;
                    break;
                case 15:
                    i3 = 4;
                    break;
            }
            i5++;
            i6 += i3;
        }
        this.f6444d = i4;
        this.header = i6;
    }

    private int m8900a() {
        int unsignedShort = (readUnsignedShort(this.header + 6) * 2) + this.header + 8;
        for (int unsignedShort2 = readUnsignedShort(unsignedShort); unsignedShort2 > 0; unsignedShort2--) {
            for (int unsignedShort3 = readUnsignedShort(unsignedShort + 8); unsignedShort3 > 0; unsignedShort3--) {
                unsignedShort += readInt(unsignedShort + 12) + 6;
            }
            unsignedShort += 8;
        }
        int i = unsignedShort + 2;
        for (int unsignedShort4 = readUnsignedShort(i); unsignedShort4 > 0; unsignedShort4--) {
            for (int unsignedShort5 = readUnsignedShort(i + 8); unsignedShort5 > 0; unsignedShort5--) {
                i += readInt(i + 12) + 6;
            }
            i += 8;
        }
        return i + 2;
    }

    private int m8901a(int i, boolean z, boolean z2, Context context) {
        int iM8906a;
        int i2;
        char[] cArr = context.f6489c;
        Label[] labelArr = context.f6494h;
        if (z) {
            iM8906a = i + 1;
            i2 = this.f6442b[i] & 255;
        } else {
            context.f6500o = -1;
            iM8906a = i;
            i2 = 255;
        }
        context.f6503r = 0;
        if (i2 < 64) {
            context.f6501p = 3;
            context.f6505t = 0;
        } else if (i2 < 128) {
            i2 -= 64;
            iM8906a = m8906a(context.f6506u, 0, iM8906a, cArr, labelArr);
            context.f6501p = 4;
            context.f6505t = 1;
        } else {
            int unsignedShort = readUnsignedShort(iM8906a);
            iM8906a += 2;
            if (i2 == 247) {
                iM8906a = m8906a(context.f6506u, 0, iM8906a, cArr, labelArr);
                context.f6501p = 4;
                context.f6505t = 1;
                i2 = unsignedShort;
            } else if (i2 >= 248 && i2 < 251) {
                context.f6501p = 2;
                context.f6503r = 251 - i2;
                context.f6502q -= context.f6503r;
                context.f6505t = 0;
                i2 = unsignedShort;
            } else if (i2 == 251) {
                context.f6501p = 3;
                context.f6505t = 0;
                i2 = unsignedShort;
            } else if (i2 < 255) {
                int i3 = i2 - 251;
                int i4 = z2 ? context.f6502q : 0;
                while (i3 > 0) {
                    iM8906a = m8906a(context.f6504s, i4, iM8906a, cArr, labelArr);
                    i3--;
                    i4++;
                }
                context.f6501p = 1;
                context.f6503r = i2 - 251;
                context.f6502q += context.f6503r;
                context.f6505t = 0;
                i2 = unsignedShort;
            } else {
                context.f6501p = 0;
                int unsignedShort2 = readUnsignedShort(iM8906a);
                int iM8906a2 = iM8906a + 2;
                context.f6503r = unsignedShort2;
                context.f6502q = unsignedShort2;
                int i5 = 0;
                int i6 = unsignedShort2;
                while (i6 > 0) {
                    iM8906a2 = m8906a(context.f6504s, i5, iM8906a2, cArr, labelArr);
                    i6--;
                    i5++;
                }
                int unsignedShort3 = readUnsignedShort(iM8906a2);
                iM8906a = iM8906a2 + 2;
                context.f6505t = unsignedShort3;
                int i7 = 0;
                int i8 = unsignedShort3;
                while (i8 > 0) {
                    iM8906a = m8906a(context.f6506u, i7, iM8906a, cArr, labelArr);
                    i8--;
                    i7++;
                }
                i2 = unsignedShort;
            }
        }
        context.f6500o += i2 + 1;
        readLabel(context.f6500o, labelArr);
        return iM8906a;
    }

    private int m8902a(int i, char[] cArr, String str, AnnotationVisitor annotationVisitor) {
        int i2 = 0;
        if (annotationVisitor == null) {
            switch (this.f6442b[i] & 255) {
                case 64:
                    return m8903a(i + 3, cArr, true, (AnnotationVisitor) null);
                case 91:
                    return m8903a(i + 1, cArr, false, (AnnotationVisitor) null);
                case 101:
                    return i + 5;
                default:
                    return i + 3;
            }
        }
        int i3 = i + 1;
        switch (this.f6442b[i] & 255) {
            case 64:
                return m8903a(i3 + 2, cArr, true, annotationVisitor.visitAnnotation(str, readUTF8(i3, cArr)));
            case 66:
                annotationVisitor.visit(str, new Byte((byte) readInt(this.f6441a[readUnsignedShort(i3)])));
                return i3 + 2;
            case 67:
                annotationVisitor.visit(str, new Character((char) readInt(this.f6441a[readUnsignedShort(i3)])));
                return i3 + 2;
            case 68:
            case 70:
            case 73:
            case 74:
                annotationVisitor.visit(str, readConst(readUnsignedShort(i3), cArr));
                return i3 + 2;
            case 83:
                annotationVisitor.visit(str, new Short((short) readInt(this.f6441a[readUnsignedShort(i3)])));
                return i3 + 2;
            case 90:
                annotationVisitor.visit(str, readInt(this.f6441a[readUnsignedShort(i3)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
                return i3 + 2;
            case 91:
                int unsignedShort = readUnsignedShort(i3);
                int i4 = i3 + 2;
                if (unsignedShort == 0) {
                    return m8903a(i4 - 2, cArr, false, annotationVisitor.visitArray(str));
                }
                int i5 = i4 + 1;
                switch (this.f6442b[i4] & 255) {
                    case 66:
                        byte[] bArr = new byte[unsignedShort];
                        while (i2 < unsignedShort) {
                            bArr[i2] = (byte) readInt(this.f6441a[readUnsignedShort(i5)]);
                            i5 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, bArr);
                        return i5 - 1;
                    case 67:
                        char[] cArr2 = new char[unsignedShort];
                        while (i2 < unsignedShort) {
                            cArr2[i2] = (char) readInt(this.f6441a[readUnsignedShort(i5)]);
                            i5 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, cArr2);
                        return i5 - 1;
                    case 68:
                        double[] dArr = new double[unsignedShort];
                        while (i2 < unsignedShort) {
                            dArr[i2] = Double.longBitsToDouble(readLong(this.f6441a[readUnsignedShort(i5)]));
                            i5 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, dArr);
                        return i5 - 1;
                    case 70:
                        float[] fArr = new float[unsignedShort];
                        while (i2 < unsignedShort) {
                            fArr[i2] = Float.intBitsToFloat(readInt(this.f6441a[readUnsignedShort(i5)]));
                            i5 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, fArr);
                        return i5 - 1;
                    case 73:
                        int[] iArr = new int[unsignedShort];
                        while (i2 < unsignedShort) {
                            iArr[i2] = readInt(this.f6441a[readUnsignedShort(i5)]);
                            i5 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, iArr);
                        return i5 - 1;
                    case 74:
                        long[] jArr = new long[unsignedShort];
                        while (i2 < unsignedShort) {
                            jArr[i2] = readLong(this.f6441a[readUnsignedShort(i5)]);
                            i5 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, jArr);
                        return i5 - 1;
                    case 83:
                        short[] sArr = new short[unsignedShort];
                        while (i2 < unsignedShort) {
                            sArr[i2] = (short) readInt(this.f6441a[readUnsignedShort(i5)]);
                            i5 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, sArr);
                        return i5 - 1;
                    case 90:
                        boolean[] zArr = new boolean[unsignedShort];
                        int i6 = i5;
                        for (int i7 = 0; i7 < unsignedShort; i7++) {
                            zArr[i7] = readInt(this.f6441a[readUnsignedShort(i6)]) != 0;
                            i6 += 3;
                        }
                        annotationVisitor.visit(str, zArr);
                        return i6 - 1;
                    default:
                        return m8903a(i5 - 3, cArr, false, annotationVisitor.visitArray(str));
                }
            case 99:
                annotationVisitor.visit(str, Type.getType(readUTF8(i3, cArr)));
                return i3 + 2;
            case 101:
                annotationVisitor.visitEnum(str, readUTF8(i3, cArr), readUTF8(i3 + 2, cArr));
                return i3 + 4;
            case 115:
                annotationVisitor.visit(str, readUTF8(i3, cArr));
                return i3 + 2;
            default:
                return i3;
        }
    }

    private int m8903a(int i, char[] cArr, boolean z, AnnotationVisitor annotationVisitor) {
        int unsignedShort = readUnsignedShort(i);
        int iM8902a = i + 2;
        if (z) {
            while (unsignedShort > 0) {
                iM8902a = m8902a(iM8902a + 2, cArr, readUTF8(iM8902a, cArr), annotationVisitor);
                unsignedShort--;
            }
        } else {
            while (unsignedShort > 0) {
                iM8902a = m8902a(iM8902a, cArr, (String) null, annotationVisitor);
                unsignedShort--;
            }
        }
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
        return iM8902a;
    }

    private int m8904a(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Attribute attribute;
        int i6;
        char[] cArr = context.f6489c;
        int unsignedShort = readUnsignedShort(i);
        String utf8 = readUTF8(i + 2, cArr);
        String utf9 = readUTF8(i + 4, cArr);
        int i7 = i + 6;
        String utf10 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        Object obj = null;
        Attribute attribute2 = null;
        int unsignedShort2 = readUnsignedShort(i7);
        int i12 = i7;
        while (unsignedShort2 > 0) {
            String utf11 = readUTF8(i12 + 2, cArr);
            if (AttConstantValue.ATTRIBUTE_NAME.equals(utf11)) {
                int unsignedShort3 = readUnsignedShort(i12 + 8);
                i2 = i8;
                i3 = i9;
                i4 = i10;
                i5 = i11;
                obj = unsignedShort3 == 0 ? null : readConst(unsignedShort3, cArr);
                attribute = attribute2;
                i6 = unsignedShort;
            } else if (AttSignature.ATTRIBUTE_NAME.equals(utf11)) {
                utf10 = readUTF8(i12 + 8, cArr);
                i2 = i8;
                i3 = i9;
                i4 = i10;
                i5 = i11;
                attribute = attribute2;
                i6 = unsignedShort;
            } else if (AttDeprecated.ATTRIBUTE_NAME.equals(utf11)) {
                i2 = i8;
                i3 = i9;
                i4 = i10;
                i5 = i11;
                attribute = attribute2;
                i6 = 131072 | unsignedShort;
            } else if (AttSynthetic.ATTRIBUTE_NAME.equals(utf11)) {
                i2 = i8;
                i3 = i9;
                i4 = i10;
                i5 = i11;
                attribute = attribute2;
                i6 = 266240 | unsignedShort;
            } else if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf11)) {
                i2 = i12 + 8;
                i3 = i9;
                i4 = i10;
                i5 = i11;
                attribute = attribute2;
                i6 = unsignedShort;
            } else if ("RuntimeVisibleTypeAnnotations".equals(utf11)) {
                i2 = i8;
                i3 = i9;
                i4 = i12 + 8;
                i5 = i11;
                attribute = attribute2;
                i6 = unsignedShort;
            } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf11)) {
                i2 = i8;
                i3 = i12 + 8;
                i4 = i10;
                i5 = i11;
                attribute = attribute2;
                i6 = unsignedShort;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(utf11)) {
                i2 = i8;
                i3 = i9;
                i4 = i10;
                i5 = i12 + 8;
                attribute = attribute2;
                i6 = unsignedShort;
            } else {
                Attribute attributeM8908a = m8908a(context.f6487a, utf11, i12 + 8, readInt(i12 + 4), cArr, -1, null);
                if (attributeM8908a != null) {
                    attributeM8908a.f6437a = attribute2;
                    i2 = i8;
                    i3 = i9;
                    i4 = i10;
                    i5 = i11;
                    attribute = attributeM8908a;
                    i6 = unsignedShort;
                } else {
                    i2 = i8;
                    i3 = i9;
                    i4 = i10;
                    i5 = i11;
                    attribute = attribute2;
                    i6 = unsignedShort;
                }
            }
            i12 += readInt(i12 + 4) + 6;
            unsignedShort2--;
            attribute2 = attribute;
            i11 = i5;
            i10 = i4;
            i9 = i3;
            i8 = i2;
            unsignedShort = i6;
        }
        int i13 = i12 + 2;
        FieldVisitor fieldVisitorVisitField = classVisitor.visitField(unsignedShort, utf8, utf9, utf10, obj);
        if (fieldVisitorVisitField != null) {
            if (i8 != 0) {
                int iM8903a = i8 + 2;
                for (int unsignedShort4 = readUnsignedShort(i8); unsignedShort4 > 0; unsignedShort4--) {
                    iM8903a = m8903a(iM8903a + 2, cArr, true, fieldVisitorVisitField.visitAnnotation(readUTF8(iM8903a, cArr), true));
                }
            }
            if (i9 != 0) {
                int iM8903a2 = i9 + 2;
                for (int unsignedShort5 = readUnsignedShort(i9); unsignedShort5 > 0; unsignedShort5--) {
                    iM8903a2 = m8903a(iM8903a2 + 2, cArr, true, fieldVisitorVisitField.visitAnnotation(readUTF8(iM8903a2, cArr), false));
                }
            }
            if (i10 != 0) {
                int iM8903a3 = i10 + 2;
                for (int unsignedShort6 = readUnsignedShort(i10); unsignedShort6 > 0; unsignedShort6--) {
                    int iM8905a = m8905a(context, iM8903a3);
                    iM8903a3 = m8903a(iM8905a + 2, cArr, true, fieldVisitorVisitField.visitTypeAnnotation(context.f6495i, context.f6496j, readUTF8(iM8905a, cArr), true));
                }
            }
            if (i11 != 0) {
                int iM8903a4 = i11 + 2;
                for (int unsignedShort7 = readUnsignedShort(i11); unsignedShort7 > 0; unsignedShort7--) {
                    int iM8905a2 = m8905a(context, iM8903a4);
                    iM8903a4 = m8903a(iM8905a2 + 2, cArr, true, fieldVisitorVisitField.visitTypeAnnotation(context.f6495i, context.f6496j, readUTF8(iM8905a2, cArr), false));
                }
            }
            while (attribute2 != null) {
                Attribute attribute3 = attribute2.f6437a;
                attribute2.f6437a = null;
                fieldVisitorVisitField.visitAttribute(attribute2);
                attribute2 = attribute3;
            }
            fieldVisitorVisitField.visitEnd();
        }
        return i13;
    }

    private int m8905a(Context context, int i) {
        int i2;
        int i3;
        int i4 = readInt(i);
        switch (i4 >>> 24) {
            case 0:
            case 1:
            case 22:
                i2 = (-65536) & i4;
                i3 = i + 2;
                break;
            case 19:
            case 20:
            case 21:
                i2 = (-16777216) & i4;
                i3 = i + 1;
                break;
            case 64:
            case 65:
                i2 = (-16777216) & i4;
                int unsignedShort = readUnsignedShort(i + 1);
                context.f6497l = new Label[unsignedShort];
                context.f6498m = new Label[unsignedShort];
                context.f6499n = new int[unsignedShort];
                i3 = i + 3;
                for (int i5 = 0; i5 < unsignedShort; i5++) {
                    int unsignedShort2 = readUnsignedShort(i3);
                    int unsignedShort3 = readUnsignedShort(i3 + 2);
                    context.f6497l[i5] = readLabel(unsignedShort2, context.f6494h);
                    context.f6498m[i5] = readLabel(unsignedShort2 + unsignedShort3, context.f6494h);
                    context.f6499n[i5] = readUnsignedShort(i3 + 4);
                    i3 += 6;
                }
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                i2 = (-16776961) & i4;
                i3 = i + 4;
                break;
            default:
                i2 = ((i4 >>> 24) < 67 ? -256 : -16777216) & i4;
                i3 = i + 3;
                break;
        }
        int i6 = readByte(i3);
        context.f6495i = i2;
        context.f6496j = i6 == 0 ? null : new TypePath(this.f6442b, i3);
        return i3 + 1 + (i6 * 2);
    }

    private int m8906a(Object[] objArr, int i, int i2, char[] cArr, Label[] labelArr) {
        int i3 = i2 + 1;
        switch (this.f6442b[i2] & 255) {
            case 0:
                objArr[i] = Opcodes.f6639TOP;
                return i3;
            case 1:
                objArr[i] = Opcodes.INTEGER;
                return i3;
            case 2:
                objArr[i] = Opcodes.FLOAT;
                return i3;
            case 3:
                objArr[i] = Opcodes.DOUBLE;
                return i3;
            case 4:
                objArr[i] = Opcodes.LONG;
                return i3;
            case 5:
                objArr[i] = Opcodes.NULL;
                return i3;
            case 6:
                objArr[i] = Opcodes.UNINITIALIZED_THIS;
                return i3;
            case 7:
                objArr[i] = readClass(i3, cArr);
                return i3 + 2;
            default:
                objArr[i] = readLabel(readUnsignedShort(i3), labelArr);
                return i3 + 2;
        }
    }

    private String m8907a(int i, int i2, char[] cArr) {
        int i3;
        byte[] bArr = this.f6442b;
        int i4 = i;
        char c = 0;
        int i5 = 0;
        char c2 = 0;
        while (i4 < i + i2) {
            int i6 = i4 + 1;
            byte b = bArr[i4];
            switch (c2) {
                case 0:
                    int i7 = b & 255;
                    if (i7 < 128) {
                        i3 = i5 + 1;
                        cArr[i5] = (char) i7;
                    } else if (i7 < 224 && i7 > 191) {
                        c = (char) (i7 & 31);
                        i3 = i5;
                        c2 = 1;
                    } else {
                        c = (char) (i7 & 15);
                        c2 = 2;
                        i3 = i5;
                    }
                    break;
                case 1:
                    i3 = i5 + 1;
                    cArr[i5] = (char) ((c << 6) | (b & 63));
                    c2 = 0;
                    break;
                case 2:
                    c = (char) ((c << 6) | (b & 63));
                    i3 = i5;
                    c2 = 1;
                    break;
                default:
                    i3 = i5;
                    break;
            }
            i4 = i6;
            i5 = i3;
        }
        return new String(cArr, 0, i5);
    }

    private Attribute m8908a(Attribute[] attributeArr, String str, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        for (int i4 = 0; i4 < attributeArr.length; i4++) {
            if (attributeArr[i4].type.equals(str)) {
                return attributeArr[i4].read(this, i, i2, cArr, i3, labelArr);
            }
        }
        return new Attribute(str).read(this, i, i2, null, -1, null);
    }

    private void m8909a(ClassWriter classWriter, Item[] itemArr, char[] cArr) {
        boolean z;
        int iM8900a = m8900a();
        int unsignedShort = readUnsignedShort(iM8900a);
        int i = iM8900a;
        while (true) {
            if (unsignedShort <= 0) {
                z = false;
                break;
            } else if (AttBootstrapMethods.ATTRIBUTE_NAME.equals(readUTF8(i + 2, cArr))) {
                z = true;
                break;
            } else {
                unsignedShort--;
                i = readInt(i + 4) + 6 + i;
            }
        }
        if (z) {
            int unsignedShort2 = readUnsignedShort(i + 8);
            int i2 = i + 10;
            int i3 = 0;
            while (i3 < unsignedShort2) {
                int iHashCode = readConst(readUnsignedShort(i2), cArr).hashCode();
                int i4 = i2;
                for (int unsignedShort3 = readUnsignedShort(i2 + 2); unsignedShort3 > 0; unsignedShort3--) {
                    iHashCode ^= readConst(readUnsignedShort(i4 + 4), cArr).hashCode();
                    i4 += 2;
                }
                Item item = new Item(i3);
                item.m8958a((i2 - i) - 10, iHashCode & Integer.MAX_VALUE);
                int length = item.f6549j % itemArr.length;
                item.f6550k = itemArr[length];
                itemArr[length] = item;
                i3++;
                i2 = i4 + 4;
            }
            int i5 = readInt(i + 4);
            ByteVector byteVector = new ByteVector(i5 + 62);
            byteVector.putByteArray(this.f6442b, i + 10, i5 - 2);
            classWriter.f6486z = unsignedShort2;
            classWriter.f6448A = byteVector;
        }
    }

    private void m8910a(Context context) {
        int i = 1;
        String str = context.f6493g;
        Object[] objArr = context.f6504s;
        int i2 = 0;
        if ((context.f6491e & 8) == 0) {
            if ("<init>".equals(context.f6492f)) {
                objArr[0] = Opcodes.UNINITIALIZED_THIS;
                i2 = 1;
            } else {
                objArr[0] = readClass(this.header + 2, context.f6489c);
                i2 = 1;
            }
        }
        while (true) {
            int i3 = i + 1;
            switch (str.charAt(i)) {
                case 'B':
                case 'C':
                case 'I':
                case 'S':
                case 'Z':
                    objArr[i2] = Opcodes.INTEGER;
                    i2++;
                    i = i3;
                    break;
                case 'D':
                    objArr[i2] = Opcodes.DOUBLE;
                    i2++;
                    i = i3;
                    break;
                case 'F':
                    objArr[i2] = Opcodes.FLOAT;
                    i2++;
                    i = i3;
                    break;
                case 'J':
                    objArr[i2] = Opcodes.LONG;
                    i2++;
                    i = i3;
                    break;
                case 'L':
                    while (true) {
                        int i4 = i3;
                        if (str.charAt(i4) == ';') {
                            objArr[i2] = str.substring(i + 1, i4);
                            i2++;
                            i = i4 + 1;
                        } else {
                            i3 = i4 + 1;
                        }
                        break;
                    }
                    break;
                case '[':
                    while (str.charAt(i3) == '[') {
                        i3++;
                    }
                    if (str.charAt(i3) == 'L') {
                        int i5 = i3 + 1;
                        while (str.charAt(i5) != ';') {
                            i5++;
                        }
                        i3 = i5;
                    }
                    int i6 = i3 + 1;
                    objArr[i2] = str.substring(i, i6);
                    i2++;
                    i = i6;
                    break;
                default:
                    context.f6502q = i2;
                    return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:279:0x098d  */
    private void m8911a(MethodVisitor methodVisitor, Context context, int i) {
        Context context2;
        int i2;
        int unsignedShort;
        int unsignedShort2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        byte[] bArr = this.f6442b;
        char[] cArr = context.f6489c;
        int unsignedShort3 = readUnsignedShort(i);
        int unsignedShort4 = readUnsignedShort(i + 2);
        int i8 = readInt(i + 4);
        int i9 = i + 8;
        int i10 = i9 + i8;
        Label[] labelArr = new Label[i8 + 2];
        context.f6494h = labelArr;
        readLabel(i8 + 1, labelArr);
        int i11 = i9;
        while (i11 < i10) {
            int i12 = i11 - i9;
            switch (ClassWriter.f6447a[bArr[i11] & 255]) {
                case 0:
                case 4:
                    i7 = i11 + 1;
                    break;
                case 1:
                case 3:
                case 11:
                    i7 = i11 + 2;
                    break;
                case 2:
                case 5:
                case 6:
                case 12:
                case 13:
                    i7 = i11 + 3;
                    break;
                case 7:
                case 8:
                    i7 = i11 + 5;
                    break;
                case 9:
                    readLabel(readShort(i11 + 1) + i12, labelArr);
                    i7 = i11 + 3;
                    break;
                case 10:
                    readLabel(readInt(i11 + 1) + i12, labelArr);
                    i7 = i11 + 5;
                    break;
                case 14:
                    int i13 = (i11 + 4) - (i12 & 3);
                    readLabel(readInt(i13) + i12, labelArr);
                    for (int i14 = (readInt(i13 + 8) - readInt(i13 + 4)) + 1; i14 > 0; i14--) {
                        readLabel(readInt(i13 + 12) + i12, labelArr);
                        i13 += 4;
                    }
                    i7 = i13 + 12;
                    break;
                case 15:
                    int i15 = (i11 + 4) - (i12 & 3);
                    readLabel(readInt(i15) + i12, labelArr);
                    for (int i16 = readInt(i15 + 4); i16 > 0; i16--) {
                        readLabel(readInt(i15 + 12) + i12, labelArr);
                        i15 += 8;
                    }
                    i7 = i15 + 8;
                    break;
                case 16:
                default:
                    i7 = i11 + 4;
                    break;
                case 17:
                    i7 = (bArr[i11 + 1] & 255) == 132 ? i11 + 6 : i11 + 4;
                    break;
            }
            i11 = i7;
        }
        for (int unsignedShort5 = readUnsignedShort(i11); unsignedShort5 > 0; unsignedShort5--) {
            methodVisitor.visitTryCatchBlock(readLabel(readUnsignedShort(i11 + 2), labelArr), readLabel(readUnsignedShort(i11 + 4), labelArr), readLabel(readUnsignedShort(i11 + 6), labelArr), readUTF8(this.f6441a[readUnsignedShort(i11 + 8)], cArr));
            i11 += 8;
        }
        int i17 = i11 + 2;
        int[] iArrM8913a = null;
        int[] iArrM8913a2 = null;
        int unsignedShort6 = -1;
        int unsignedShort7 = -1;
        int i18 = 0;
        int i19 = 0;
        boolean z2 = true;
        boolean z3 = (context.f6488b & 8) != 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        Attribute attribute = null;
        int unsignedShort8 = readUnsignedShort(i17);
        while (unsignedShort8 > 0) {
            String utf8 = readUTF8(i17 + 2, cArr);
            if (AttLocalVariableTable.ATTRIBUTE_NAME.equals(utf8)) {
                if ((context.f6488b & 2) == 0) {
                    int i23 = i17 + 8;
                    int i24 = i17;
                    for (int unsignedShort9 = readUnsignedShort(i17 + 8); unsignedShort9 > 0; unsignedShort9--) {
                        int unsignedShort10 = readUnsignedShort(i24 + 10);
                        if (labelArr[unsignedShort10] == null) {
                            readLabel(unsignedShort10, labelArr).f6551a |= 1;
                        }
                        int unsignedShort11 = unsignedShort10 + readUnsignedShort(i24 + 12);
                        if (labelArr[unsignedShort11] == null) {
                            readLabel(unsignedShort11, labelArr).f6551a |= 1;
                        }
                        i24 += 10;
                    }
                    unsignedShort2 = i22;
                    i3 = i21;
                    i4 = i20;
                    z = z2;
                    i5 = i19;
                    i6 = i23;
                } else {
                    unsignedShort2 = i22;
                    i3 = i21;
                    i4 = i20;
                    z = z2;
                    i5 = i19;
                    i6 = i18;
                }
            } else if (AttLocalVariableTypeTable.ATTRIBUTE_NAME.equals(utf8)) {
                i5 = i17 + 8;
                unsignedShort2 = i22;
                i3 = i21;
                i4 = i20;
                z = z2;
                i6 = i18;
            } else if (AttLineNumberTable.ATTRIBUTE_NAME.equals(utf8)) {
                if ((context.f6488b & 2) == 0) {
                    int i25 = i17;
                    int unsignedShort12 = readUnsignedShort(i17 + 8);
                    while (unsignedShort12 > 0) {
                        int unsignedShort13 = readUnsignedShort(i25 + 10);
                        if (labelArr[unsignedShort13] == null) {
                            readLabel(unsignedShort13, labelArr).f6551a |= 1;
                        }
                        Label label = labelArr[unsignedShort13];
                        while (label.f6552b > 0) {
                            if (label.f6561k == null) {
                                label.f6561k = new Label();
                            }
                            label = label.f6561k;
                        }
                        label.f6552b = readUnsignedShort(i25 + 12);
                        unsignedShort12--;
                        i25 += 4;
                    }
                    unsignedShort2 = i22;
                    i3 = i21;
                    i4 = i20;
                    z = z2;
                    i5 = i19;
                    i6 = i18;
                } else {
                    unsignedShort2 = i22;
                    i3 = i21;
                    i4 = i20;
                    z = z2;
                    i5 = i19;
                    i6 = i18;
                }
            } else if ("RuntimeVisibleTypeAnnotations".equals(utf8)) {
                iArrM8913a = m8913a(methodVisitor, context, i17 + 8, true);
                unsignedShort2 = i22;
                i3 = i21;
                i4 = i20;
                z = z2;
                i5 = i19;
                i6 = i18;
                unsignedShort6 = (iArrM8913a.length == 0 || readByte(iArrM8913a[0]) < 67) ? -1 : readUnsignedShort(iArrM8913a[0] + 1);
            } else if ("RuntimeInvisibleTypeAnnotations".equals(utf8)) {
                iArrM8913a2 = m8913a(methodVisitor, context, i17 + 8, false);
                unsignedShort2 = i22;
                i3 = i21;
                i4 = i20;
                z = z2;
                i5 = i19;
                i6 = i18;
                unsignedShort7 = (iArrM8913a2.length == 0 || readByte(iArrM8913a2[0]) < 67) ? -1 : readUnsignedShort(iArrM8913a2[0] + 1);
            } else if ("StackMapTable".equals(utf8)) {
                if ((context.f6488b & 4) == 0) {
                    i4 = i17 + 10;
                    i3 = readInt(i17 + 4);
                    unsignedShort2 = readUnsignedShort(i17 + 8);
                    z = z2;
                    i5 = i19;
                    i6 = i18;
                } else {
                    unsignedShort2 = i22;
                    i3 = i21;
                    i4 = i20;
                    z = z2;
                    i5 = i19;
                    i6 = i18;
                }
            } else if (!"StackMap".equals(utf8)) {
                int i26 = 0;
                while (true) {
                    int i27 = i26;
                    Attribute attribute2 = attribute;
                    if (i27 < context.f6487a.length) {
                        if (!context.f6487a[i27].type.equals(utf8) || (attribute = context.f6487a[i27].read(this, i17 + 8, readInt(i17 + 4), cArr, i9 - 8, labelArr)) == null) {
                            attribute = attribute2;
                        } else {
                            attribute.f6437a = attribute2;
                        }
                        i26 = i27 + 1;
                    } else {
                        attribute = attribute2;
                        unsignedShort2 = i22;
                        i3 = i21;
                        i4 = i20;
                        z = z2;
                        i5 = i19;
                        i6 = i18;
                    }
                }
            } else if ((context.f6488b & 4) == 0) {
                z = false;
                i4 = i17 + 10;
                i3 = readInt(i17 + 4);
                unsignedShort2 = readUnsignedShort(i17 + 8);
                i5 = i19;
                i6 = i18;
            } else {
                unsignedShort2 = i22;
                i3 = i21;
                i4 = i20;
                z = z2;
                i5 = i19;
                i6 = i18;
            }
            i17 += readInt(i17 + 4) + 6;
            unsignedShort8--;
            i21 = i3;
            z2 = z;
            i19 = i5;
            i18 = i6;
            i22 = unsignedShort2;
            i20 = i4;
        }
        if (i20 != 0) {
            context.f6500o = -1;
            context.f6501p = 0;
            context.f6502q = 0;
            context.f6503r = 0;
            context.f6505t = 0;
            context.f6504s = new Object[unsignedShort4];
            context.f6506u = new Object[unsignedShort3];
            if (z3) {
                m8910a(context);
            }
            for (int i28 = i20; i28 < (i20 + i21) - 2; i28++) {
                if (bArr[i28] == 8 && (unsignedShort = readUnsignedShort(i28 + 1)) >= 0 && unsignedShort < i8 && (bArr[i9 + unsignedShort] & 255) == 187) {
                    readLabel(unsignedShort, labelArr);
                }
            }
            context2 = context;
        } else {
            context2 = null;
        }
        int i29 = 0;
        int i30 = 0;
        int i31 = unsignedShort7;
        int unsignedShort14 = unsignedShort6;
        for (int i32 = i9; i32 < i10; i32 = i2) {
            int i33 = i32 - i9;
            Label label2 = labelArr[i33];
            if (label2 != null) {
                label2.f6561k = null;
                methodVisitor.visitLabel(label2);
                if ((context.f6488b & 2) == 0 && label2.f6552b > 0) {
                    methodVisitor.visitLineNumber(label2.f6552b, label2);
                    for (Label label3 = label2.f6561k; label3 != null; label3 = label3.f6561k) {
                        methodVisitor.visitLineNumber(label3.f6552b, label2);
                    }
                }
            }
            Context context3 = context2;
            int i34 = i22;
            int iM8901a = i20;
            while (context3 != null && (context3.f6500o == i33 || context3.f6500o == -1)) {
                if (context3.f6500o != -1) {
                    if (!z2 || z3) {
                        methodVisitor.visitFrame(-1, context3.f6502q, context3.f6504s, context3.f6505t, context3.f6506u);
                    } else {
                        methodVisitor.visitFrame(context3.f6501p, context3.f6503r, context3.f6504s, context3.f6505t, context3.f6506u);
                    }
                }
                if (i34 > 0) {
                    i34--;
                    iM8901a = m8901a(iM8901a, z2, z3, context3);
                } else {
                    context3 = null;
                }
            }
            int i35 = bArr[i32] & 255;
            switch (ClassWriter.f6447a[i35]) {
                case 0:
                    methodVisitor.visitInsn(i35);
                    i2 = i32 + 1;
                    break;
                case 1:
                    methodVisitor.visitIntInsn(i35, bArr[i32 + 1]);
                    i2 = i32 + 2;
                    break;
                case 2:
                    methodVisitor.visitIntInsn(i35, readShort(i32 + 1));
                    i2 = i32 + 3;
                    break;
                case 3:
                    methodVisitor.visitVarInsn(i35, bArr[i32 + 1] & 255);
                    i2 = i32 + 2;
                    break;
                case 4:
                    if (i35 > 54) {
                        int i36 = i35 - 59;
                        methodVisitor.visitVarInsn((i36 >> 2) + 54, i36 & 3);
                    } else {
                        int i37 = i35 - 26;
                        methodVisitor.visitVarInsn((i37 >> 2) + 21, i37 & 3);
                    }
                    i2 = i32 + 1;
                    break;
                case 5:
                    methodVisitor.visitTypeInsn(i35, readClass(i32 + 1, cArr));
                    i2 = i32 + 3;
                    break;
                case 6:
                case 7:
                    int i38 = this.f6441a[readUnsignedShort(i32 + 1)];
                    boolean z4 = bArr[i38 + (-1)] == 11;
                    String str = readClass(i38, cArr);
                    int i39 = this.f6441a[readUnsignedShort(i38 + 2)];
                    String utf9 = readUTF8(i39, cArr);
                    String utf10 = readUTF8(i39 + 2, cArr);
                    if (i35 < 182) {
                        methodVisitor.visitFieldInsn(i35, str, utf9, utf10);
                    } else {
                        methodVisitor.visitMethodInsn(i35, str, utf9, utf10, z4);
                    }
                    i2 = i35 == 185 ? i32 + 5 : i32 + 3;
                    break;
                case 8:
                    int i40 = this.f6441a[readUnsignedShort(i32 + 1)];
                    int i41 = context.f6490d[readUnsignedShort(i40)];
                    Handle handle = (Handle) readConst(readUnsignedShort(i41), cArr);
                    int unsignedShort15 = readUnsignedShort(i41 + 2);
                    Object[] objArr = new Object[unsignedShort15];
                    int i42 = i41 + 4;
                    for (int i43 = 0; i43 < unsignedShort15; i43++) {
                        objArr[i43] = readConst(readUnsignedShort(i42), cArr);
                        i42 += 2;
                    }
                    int i44 = this.f6441a[readUnsignedShort(i40 + 2)];
                    methodVisitor.visitInvokeDynamicInsn(readUTF8(i44, cArr), readUTF8(i44 + 2, cArr), handle, objArr);
                    i2 = i32 + 5;
                    break;
                case 9:
                    methodVisitor.visitJumpInsn(i35, labelArr[readShort(i32 + 1) + i33]);
                    i2 = i32 + 3;
                    break;
                case 10:
                    methodVisitor.visitJumpInsn(i35 - 33, labelArr[readInt(i32 + 1) + i33]);
                    i2 = i32 + 5;
                    break;
                case 11:
                    methodVisitor.visitLdcInsn(readConst(bArr[i32 + 1] & 255, cArr));
                    i2 = i32 + 2;
                    break;
                case 12:
                    methodVisitor.visitLdcInsn(readConst(readUnsignedShort(i32 + 1), cArr));
                    i2 = i32 + 3;
                    break;
                case 13:
                    methodVisitor.visitIincInsn(bArr[i32 + 1] & 255, bArr[i32 + 2]);
                    i2 = i32 + 3;
                    break;
                case 14:
                    int i45 = (i32 + 4) - (i33 & 3);
                    int i46 = readInt(i45);
                    int i47 = readInt(i45 + 4);
                    int i48 = readInt(i45 + 8);
                    Label[] labelArr2 = new Label[(i48 - i47) + 1];
                    int i49 = i45 + 12;
                    for (int i50 = 0; i50 < labelArr2.length; i50++) {
                        labelArr2[i50] = labelArr[readInt(i49) + i33];
                        i49 += 4;
                    }
                    methodVisitor.visitTableSwitchInsn(i47, i48, labelArr[i33 + i46], labelArr2);
                    i2 = i49;
                    break;
                case 15:
                    int i51 = (i32 + 4) - (i33 & 3);
                    int i52 = readInt(i51);
                    int i53 = readInt(i51 + 4);
                    int[] iArr = new int[i53];
                    Label[] labelArr3 = new Label[i53];
                    i2 = i51 + 8;
                    for (int i54 = 0; i54 < i53; i54++) {
                        iArr[i54] = readInt(i2);
                        labelArr3[i54] = labelArr[readInt(i2 + 4) + i33];
                        i2 += 8;
                    }
                    methodVisitor.visitLookupSwitchInsn(labelArr[i33 + i52], iArr, labelArr3);
                    break;
                case 16:
                default:
                    methodVisitor.visitMultiANewArrayInsn(readClass(i32 + 1, cArr), bArr[i32 + 3] & 255);
                    i2 = i32 + 4;
                    break;
                case 17:
                    int i55 = bArr[i32 + 1] & 255;
                    if (i55 == 132) {
                        methodVisitor.visitIincInsn(readUnsignedShort(i32 + 2), readShort(i32 + 4));
                        i2 = i32 + 6;
                    } else {
                        methodVisitor.visitVarInsn(i55, readUnsignedShort(i32 + 2));
                        i2 = i32 + 4;
                    }
                    break;
            }
            while (iArrM8913a != null && i29 < iArrM8913a.length && unsignedShort14 <= i33) {
                if (unsignedShort14 == i33) {
                    int iM8905a = m8905a(context, iArrM8913a[i29]);
                    m8903a(iM8905a + 2, cArr, true, methodVisitor.visitInsnAnnotation(context.f6495i, context.f6496j, readUTF8(iM8905a, cArr), true));
                }
                i29++;
                unsignedShort14 = (i29 >= iArrM8913a.length || readByte(iArrM8913a[i29]) < 67) ? -1 : readUnsignedShort(iArrM8913a[i29] + 1);
            }
            int unsignedShort16 = i31;
            int i56 = i30;
            while (iArrM8913a2 != null && i56 < iArrM8913a2.length && unsignedShort16 <= i33) {
                if (unsignedShort16 == i33) {
                    int iM8905a2 = m8905a(context, iArrM8913a2[i56]);
                    m8903a(iM8905a2 + 2, cArr, true, methodVisitor.visitInsnAnnotation(context.f6495i, context.f6496j, readUTF8(iM8905a2, cArr), false));
                }
                int i57 = i56 + 1;
                unsignedShort16 = (i57 >= iArrM8913a2.length || readByte(iArrM8913a2[i57]) < 67) ? -1 : readUnsignedShort(iArrM8913a2[i57] + 1);
                i56 = i57;
            }
            i22 = i34;
            i30 = i56;
            context2 = context3;
            i20 = iM8901a;
            i31 = unsignedShort16;
            unsignedShort14 = unsignedShort14;
        }
        if (labelArr[i8] != null) {
            methodVisitor.visitLabel(labelArr[i8]);
        }
        if ((context.f6488b & 2) == 0 && i18 != 0) {
            int[] iArr2 = null;
            if (i19 != 0) {
                int i58 = i19 + 2;
                iArr2 = new int[readUnsignedShort(i19) * 3];
                int length = iArr2.length;
                while (length > 0) {
                    int i59 = length - 1;
                    iArr2[i59] = i58 + 6;
                    int i60 = i59 - 1;
                    iArr2[i60] = readUnsignedShort(i58 + 8);
                    length = i60 - 1;
                    iArr2[length] = readUnsignedShort(i58);
                    i58 += 10;
                }
            }
            int unsignedShort17 = readUnsignedShort(i18);
            int i61 = i18 + 2;
            while (unsignedShort17 > 0) {
                int unsignedShort18 = readUnsignedShort(i61);
                int unsignedShort19 = readUnsignedShort(i61 + 2);
                int unsignedShort20 = readUnsignedShort(i61 + 8);
                String utf11 = null;
                if (iArr2 != null) {
                    for (int i62 = 0; i62 < iArr2.length; i62 += 3) {
                        if (iArr2[i62] == unsignedShort18 && iArr2[i62 + 1] == unsignedShort20) {
                            utf11 = readUTF8(iArr2[i62 + 2], cArr);
                            break;
                        }
                    }
                }
                methodVisitor.visitLocalVariable(readUTF8(i61 + 4, cArr), readUTF8(i61 + 6, cArr), utf11, labelArr[unsignedShort18], labelArr[unsignedShort18 + unsignedShort19], unsignedShort20);
                unsignedShort17--;
                i61 += 10;
            }
        }
        if (iArrM8913a != null) {
            for (int i63 = 0; i63 < iArrM8913a.length; i63++) {
                if ((readByte(iArrM8913a[i63]) >> 1) == 32) {
                    int iM8905a3 = m8905a(context, iArrM8913a[i63]);
                    m8903a(iM8905a3 + 2, cArr, true, methodVisitor.visitLocalVariableAnnotation(context.f6495i, context.f6496j, context.f6497l, context.f6498m, context.f6499n, readUTF8(iM8905a3, cArr), true));
                }
            }
        }
        if (iArrM8913a2 != null) {
            for (int i64 = 0; i64 < iArrM8913a2.length; i64++) {
                if ((readByte(iArrM8913a2[i64]) >> 1) == 32) {
                    int iM8905a4 = m8905a(context, iArrM8913a2[i64]);
                    m8903a(iM8905a4 + 2, cArr, true, methodVisitor.visitLocalVariableAnnotation(context.f6495i, context.f6496j, context.f6497l, context.f6498m, context.f6499n, readUTF8(iM8905a4, cArr), false));
                }
            }
        }
        while (attribute != null) {
            Attribute attribute3 = attribute.f6437a;
            attribute.f6437a = null;
            methodVisitor.visitAttribute(attribute);
            attribute = attribute3;
        }
        methodVisitor.visitMaxs(unsignedShort3, unsignedShort4);
    }

    private static byte[] m8912a(InputStream inputStream, boolean z) throws IOException {
        int i = 0;
        if (inputStream == null) {
            throw new IOException("Class not found");
        }
        try {
            byte[] bArr = new byte[inputStream.available()];
            while (true) {
                int i2 = inputStream.read(bArr, i, bArr.length - i);
                if (i2 == -1) {
                    if (i < bArr.length) {
                        byte[] bArr2 = new byte[i];
                        System.arraycopy(bArr, 0, bArr2, 0, i);
                        bArr = bArr2;
                    }
                    if (!z) {
                        break;
                    }
                    break;
                }
                int i3 = i + i2;
                if (i3 == bArr.length) {
                    int i4 = inputStream.read();
                    if (i4 < 0) {
                        if (!z) {
                            break;
                        }
                        break;
                    }
                    byte[] bArr3 = new byte[bArr.length + 1000];
                    System.arraycopy(bArr, 0, bArr3, 0, i3);
                    i = i3 + 1;
                    bArr3[i3] = (byte) i4;
                    bArr = bArr3;
                } else {
                    i = i3;
                }
            }
            return bArr;
        } finally {
            if (z) {
                inputStream.close();
            }
        }
    }

    private int[] m8913a(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int i2;
        char[] cArr = context.f6489c;
        int[] iArr = new int[readUnsignedShort(i)];
        int iM8903a = i + 2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = iM8903a;
            int i4 = readInt(iM8903a);
            switch (i4 >>> 24) {
                case 0:
                case 1:
                case 22:
                    i2 = iM8903a + 2;
                    break;
                case 19:
                case 20:
                case 21:
                    i2 = iM8903a + 1;
                    break;
                case 64:
                case 65:
                    int i5 = iM8903a;
                    for (int unsignedShort = readUnsignedShort(iM8903a + 1); unsignedShort > 0; unsignedShort--) {
                        int unsignedShort2 = readUnsignedShort(i5 + 3);
                        int unsignedShort3 = readUnsignedShort(i5 + 5);
                        readLabel(unsignedShort2, context.f6494h);
                        readLabel(unsignedShort2 + unsignedShort3, context.f6494h);
                        i5 += 6;
                    }
                    i2 = i5 + 3;
                    break;
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                    i2 = iM8903a + 4;
                    break;
                default:
                    i2 = iM8903a + 3;
                    break;
            }
            int i6 = readByte(i2);
            if ((i4 >>> 24) == 66) {
                TypePath typePath = i6 == 0 ? null : new TypePath(this.f6442b, i2);
                int i7 = i2 + (i6 * 2) + 1;
                iM8903a = m8903a(i7 + 2, cArr, true, methodVisitor.visitTryCatchAnnotation(i4, typePath, readUTF8(i7, cArr), z));
            } else {
                iM8903a = m8903a(i2 + 3 + (i6 * 2), cArr, true, (AnnotationVisitor) null);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x038a A[LOOP:7: B:100:0x0388->B:101:0x038a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:103:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:105:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:107:0x03cb A[LOOP:8: B:106:0x03c9->B:107:0x03cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:112:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x02c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:81:0x02d4 A[LOOP:3: B:80:0x02d2->B:81:0x02d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x030b A[LOOP:4: B:88:0x0309->B:89:0x030b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0324  */
    /* JADX WARN: Code duplicated, block: B:93:0x0330 A[LOOP:5: B:92:0x032e->B:93:0x0330, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0349  */
    /* JADX WARN: Code duplicated, block: B:97:0x0355 A[LOOP:6: B:96:0x0353->B:97:0x0355, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x037e  */
    private int m8914b(ClassVisitor classVisitor, Context context, int i) {
        int unsignedShort;
        int iM8903a;
        int unsignedShort2;
        int iM8903a2;
        int unsignedShort3;
        int iM8903a3;
        int unsignedShort4;
        int iM8903a4;
        AnnotationVisitor annotationVisitorVisitAnnotationDefault;
        int i2;
        int i3;
        Attribute attributeM8908a;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String[] strArr;
        char[] cArr = context.f6489c;
        context.f6491e = readUnsignedShort(i);
        context.f6492f = readUTF8(i + 2, cArr);
        context.f6493g = readUTF8(i + 4, cArr);
        int i12 = i + 6;
        int i13 = 0;
        int i14 = 0;
        String[] strArr2 = null;
        String utf8 = null;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        Attribute attribute = null;
        int unsignedShort5 = readUnsignedShort(i12);
        int i23 = i12;
        while (unsignedShort5 > 0) {
            String utf9 = readUTF8(i23 + 2, cArr);
            if (AttCode.ATTRIBUTE_NAME.equals(utf9)) {
                if ((context.f6488b & 1) == 0) {
                    i13 = i23 + 8;
                    attributeM8908a = attribute;
                    i4 = i22;
                    i5 = i21;
                    i6 = i20;
                    i7 = i19;
                    i8 = i18;
                    i9 = i17;
                    i10 = i16;
                    i11 = i15;
                    strArr = strArr2;
                } else {
                    attributeM8908a = attribute;
                    i4 = i22;
                    i5 = i21;
                    i6 = i20;
                    i7 = i19;
                    i8 = i18;
                    i9 = i17;
                    i10 = i16;
                    i11 = i15;
                    strArr = strArr2;
                }
            } else if (AttExceptions.ATTRIBUTE_NAME.equals(utf9)) {
                strArr = new String[readUnsignedShort(i23 + 8)];
                int i24 = i23 + 10;
                for (int i25 = 0; i25 < strArr.length; i25++) {
                    strArr[i25] = readClass(i24, cArr);
                    i24 += 2;
                }
                attributeM8908a = attribute;
                i4 = i22;
                i5 = i21;
                i6 = i20;
                i7 = i19;
                i8 = i18;
                i9 = i17;
                i10 = i16;
                i11 = i15;
                i14 = i24;
            } else if (AttSignature.ATTRIBUTE_NAME.equals(utf9)) {
                utf8 = readUTF8(i23 + 8, cArr);
                attributeM8908a = attribute;
                i4 = i22;
                i5 = i21;
                i6 = i20;
                i7 = i19;
                i8 = i18;
                i9 = i17;
                i10 = i16;
                i11 = i15;
                strArr = strArr2;
            } else if (AttDeprecated.ATTRIBUTE_NAME.equals(utf9)) {
                context.f6491e |= 131072;
                attributeM8908a = attribute;
                i4 = i22;
                i5 = i21;
                i6 = i20;
                i7 = i19;
                i8 = i18;
                i9 = i17;
                i10 = i16;
                i11 = i15;
                strArr = strArr2;
            } else if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf9)) {
                i10 = i23 + 8;
                attributeM8908a = attribute;
                i4 = i22;
                i5 = i21;
                i6 = i20;
                i7 = i19;
                i8 = i18;
                i9 = i17;
                i11 = i15;
                strArr = strArr2;
            } else if ("RuntimeVisibleTypeAnnotations".equals(utf9)) {
                i8 = i23 + 8;
                attributeM8908a = attribute;
                i4 = i22;
                i5 = i21;
                i6 = i20;
                i7 = i19;
                i9 = i17;
                i10 = i16;
                i11 = i15;
                strArr = strArr2;
            } else if (AttAnnotationDefault.ATTRIBUTE_NAME.equals(utf9)) {
                i6 = i23 + 8;
                attributeM8908a = attribute;
                i4 = i22;
                i5 = i21;
                i7 = i19;
                i8 = i18;
                i9 = i17;
                i10 = i16;
                i11 = i15;
                strArr = strArr2;
            } else if (AttSynthetic.ATTRIBUTE_NAME.equals(utf9)) {
                context.f6491e |= 266240;
                attributeM8908a = attribute;
                i4 = i22;
                i5 = i21;
                i6 = i20;
                i7 = i19;
                i8 = i18;
                i9 = i17;
                i10 = i16;
                i11 = i15;
                strArr = strArr2;
            } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf9)) {
                i9 = i23 + 8;
                attributeM8908a = attribute;
                i4 = i22;
                i5 = i21;
                i6 = i20;
                i7 = i19;
                i8 = i18;
                i10 = i16;
                i11 = i15;
                strArr = strArr2;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(utf9)) {
                i7 = i23 + 8;
                attributeM8908a = attribute;
                i4 = i22;
                i5 = i21;
                i6 = i20;
                i8 = i18;
                i9 = i17;
                i10 = i16;
                i11 = i15;
                strArr = strArr2;
            } else if (AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME.equals(utf9)) {
                i5 = i23 + 8;
                attributeM8908a = attribute;
                i4 = i22;
                i6 = i20;
                i7 = i19;
                i8 = i18;
                i9 = i17;
                i10 = i16;
                i11 = i15;
                strArr = strArr2;
            } else if (AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME.equals(utf9)) {
                i4 = i23 + 8;
                attributeM8908a = attribute;
                i5 = i21;
                i6 = i20;
                i7 = i19;
                i8 = i18;
                i9 = i17;
                i10 = i16;
                i11 = i15;
                strArr = strArr2;
            } else if ("MethodParameters".equals(utf9)) {
                i11 = i23 + 8;
                attributeM8908a = attribute;
                i4 = i22;
                i5 = i21;
                i6 = i20;
                i7 = i19;
                i8 = i18;
                i9 = i17;
                i10 = i16;
                strArr = strArr2;
            } else {
                attributeM8908a = m8908a(context.f6487a, utf9, i23 + 8, readInt(i23 + 4), cArr, -1, null);
                if (attributeM8908a != null) {
                    attributeM8908a.f6437a = attribute;
                    i4 = i22;
                    i5 = i21;
                    i6 = i20;
                    i7 = i19;
                    i8 = i18;
                    i9 = i17;
                    i10 = i16;
                    i11 = i15;
                    strArr = strArr2;
                } else {
                    attributeM8908a = attribute;
                    i4 = i22;
                    i5 = i21;
                    i6 = i20;
                    i7 = i19;
                    i8 = i18;
                    i9 = i17;
                    i10 = i16;
                    i11 = i15;
                    strArr = strArr2;
                }
            }
            i23 += readInt(i23 + 4) + 6;
            unsignedShort5--;
            attribute = attributeM8908a;
            i22 = i4;
            i21 = i5;
            i20 = i6;
            i19 = i7;
            i18 = i8;
            i17 = i9;
            i16 = i10;
            i15 = i11;
            strArr2 = strArr;
        }
        int i26 = i23 + 2;
        MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(context.f6491e, context.f6492f, context.f6493g, utf8, strArr2);
        if (methodVisitorVisitMethod != null) {
            if (methodVisitorVisitMethod instanceof MethodWriter) {
                MethodWriter methodWriter = (MethodWriter) methodVisitorVisitMethod;
                if (methodWriter.f6591b.f6459M == this && utf8 == methodWriter.f6596g) {
                    boolean z = false;
                    if (strArr2 == null) {
                        z = methodWriter.f6599j == 0;
                    } else if (strArr2.length == methodWriter.f6599j) {
                        int length = strArr2.length - 1;
                        while (true) {
                            if (length < 0) {
                                z = true;
                                break;
                            }
                            i14 -= 2;
                            if (methodWriter.f6600k[length] != readUnsignedShort(i14)) {
                                z = false;
                                break;
                            }
                            length--;
                        }
                    }
                    if (z) {
                        methodWriter.f6597h = i12;
                        methodWriter.f6598i = i26 - i12;
                    } else {
                        if (i15 != 0) {
                            i2 = this.f6442b[i15] & 255;
                            i3 = i15 + 1;
                            while (i2 > 0) {
                                methodVisitorVisitMethod.visitParameter(readUTF8(i3, cArr), readUnsignedShort(i3 + 2));
                                i2--;
                                i3 += 4;
                            }
                        }
                        if (i20 != 0) {
                            annotationVisitorVisitAnnotationDefault = methodVisitorVisitMethod.visitAnnotationDefault();
                            m8902a(i20, cArr, (String) null, annotationVisitorVisitAnnotationDefault);
                            if (annotationVisitorVisitAnnotationDefault != null) {
                                annotationVisitorVisitAnnotationDefault.visitEnd();
                            }
                        }
                        if (i16 != 0) {
                            iM8903a4 = i16 + 2;
                            for (unsignedShort4 = readUnsignedShort(i16); unsignedShort4 > 0; unsignedShort4--) {
                                iM8903a4 = m8903a(iM8903a4 + 2, cArr, true, methodVisitorVisitMethod.visitAnnotation(readUTF8(iM8903a4, cArr), true));
                            }
                        }
                        if (i17 != 0) {
                            iM8903a3 = i17 + 2;
                            for (unsignedShort3 = readUnsignedShort(i17); unsignedShort3 > 0; unsignedShort3--) {
                                iM8903a3 = m8903a(iM8903a3 + 2, cArr, true, methodVisitorVisitMethod.visitAnnotation(readUTF8(iM8903a3, cArr), false));
                            }
                        }
                        if (i18 != 0) {
                            iM8903a2 = i18 + 2;
                            for (unsignedShort2 = readUnsignedShort(i18); unsignedShort2 > 0; unsignedShort2--) {
                                int iM8905a = m8905a(context, iM8903a2);
                                iM8903a2 = m8903a(iM8905a + 2, cArr, true, methodVisitorVisitMethod.visitTypeAnnotation(context.f6495i, context.f6496j, readUTF8(iM8905a, cArr), true));
                            }
                        }
                        if (i19 != 0) {
                            iM8903a = i19 + 2;
                            for (unsignedShort = readUnsignedShort(i19); unsignedShort > 0; unsignedShort--) {
                                int iM8905a2 = m8905a(context, iM8903a);
                                iM8903a = m8903a(iM8905a2 + 2, cArr, true, methodVisitorVisitMethod.visitTypeAnnotation(context.f6495i, context.f6496j, readUTF8(iM8905a2, cArr), false));
                            }
                        }
                        if (i21 != 0) {
                            m8915b(methodVisitorVisitMethod, context, i21, true);
                        }
                        if (i22 != 0) {
                            m8915b(methodVisitorVisitMethod, context, i22, false);
                        }
                        while (attribute != null) {
                            Attribute attribute2 = attribute.f6437a;
                            attribute.f6437a = null;
                            methodVisitorVisitMethod.visitAttribute(attribute);
                            attribute = attribute2;
                        }
                        if (i13 != 0) {
                            methodVisitorVisitMethod.visitCode();
                            m8911a(methodVisitorVisitMethod, context, i13);
                        }
                        methodVisitorVisitMethod.visitEnd();
                    }
                } else {
                    if (i15 != 0) {
                        i2 = this.f6442b[i15] & 255;
                        i3 = i15 + 1;
                        while (i2 > 0) {
                            methodVisitorVisitMethod.visitParameter(readUTF8(i3, cArr), readUnsignedShort(i3 + 2));
                            i2--;
                            i3 += 4;
                        }
                    }
                    if (i20 != 0) {
                        annotationVisitorVisitAnnotationDefault = methodVisitorVisitMethod.visitAnnotationDefault();
                        m8902a(i20, cArr, (String) null, annotationVisitorVisitAnnotationDefault);
                        if (annotationVisitorVisitAnnotationDefault != null) {
                            annotationVisitorVisitAnnotationDefault.visitEnd();
                        }
                    }
                    if (i16 != 0) {
                        iM8903a4 = i16 + 2;
                        while (unsignedShort4 > 0) {
                            iM8903a4 = m8903a(iM8903a4 + 2, cArr, true, methodVisitorVisitMethod.visitAnnotation(readUTF8(iM8903a4, cArr), true));
                        }
                    }
                    if (i17 != 0) {
                        iM8903a3 = i17 + 2;
                        while (unsignedShort3 > 0) {
                            iM8903a3 = m8903a(iM8903a3 + 2, cArr, true, methodVisitorVisitMethod.visitAnnotation(readUTF8(iM8903a3, cArr), false));
                        }
                    }
                    if (i18 != 0) {
                        iM8903a2 = i18 + 2;
                        while (unsignedShort2 > 0) {
                            int iM8905a3 = m8905a(context, iM8903a2);
                            iM8903a2 = m8903a(iM8905a3 + 2, cArr, true, methodVisitorVisitMethod.visitTypeAnnotation(context.f6495i, context.f6496j, readUTF8(iM8905a3, cArr), true));
                        }
                    }
                    if (i19 != 0) {
                        iM8903a = i19 + 2;
                        while (unsignedShort > 0) {
                            int iM8905a4 = m8905a(context, iM8903a);
                            iM8903a = m8903a(iM8905a4 + 2, cArr, true, methodVisitorVisitMethod.visitTypeAnnotation(context.f6495i, context.f6496j, readUTF8(iM8905a4, cArr), false));
                        }
                    }
                    if (i21 != 0) {
                        m8915b(methodVisitorVisitMethod, context, i21, true);
                    }
                    if (i22 != 0) {
                        m8915b(methodVisitorVisitMethod, context, i22, false);
                    }
                    while (attribute != null) {
                        Attribute attribute3 = attribute.f6437a;
                        attribute.f6437a = null;
                        methodVisitorVisitMethod.visitAttribute(attribute);
                        attribute = attribute3;
                    }
                    if (i13 != 0) {
                        methodVisitorVisitMethod.visitCode();
                        m8911a(methodVisitorVisitMethod, context, i13);
                    }
                    methodVisitorVisitMethod.visitEnd();
                }
            } else {
                if (i15 != 0) {
                    i2 = this.f6442b[i15] & 255;
                    i3 = i15 + 1;
                    while (i2 > 0) {
                        methodVisitorVisitMethod.visitParameter(readUTF8(i3, cArr), readUnsignedShort(i3 + 2));
                        i2--;
                        i3 += 4;
                    }
                }
                if (i20 != 0) {
                    annotationVisitorVisitAnnotationDefault = methodVisitorVisitMethod.visitAnnotationDefault();
                    m8902a(i20, cArr, (String) null, annotationVisitorVisitAnnotationDefault);
                    if (annotationVisitorVisitAnnotationDefault != null) {
                        annotationVisitorVisitAnnotationDefault.visitEnd();
                    }
                }
                if (i16 != 0) {
                    iM8903a4 = i16 + 2;
                    while (unsignedShort4 > 0) {
                        iM8903a4 = m8903a(iM8903a4 + 2, cArr, true, methodVisitorVisitMethod.visitAnnotation(readUTF8(iM8903a4, cArr), true));
                    }
                }
                if (i17 != 0) {
                    iM8903a3 = i17 + 2;
                    while (unsignedShort3 > 0) {
                        iM8903a3 = m8903a(iM8903a3 + 2, cArr, true, methodVisitorVisitMethod.visitAnnotation(readUTF8(iM8903a3, cArr), false));
                    }
                }
                if (i18 != 0) {
                    iM8903a2 = i18 + 2;
                    while (unsignedShort2 > 0) {
                        int iM8905a5 = m8905a(context, iM8903a2);
                        iM8903a2 = m8903a(iM8905a5 + 2, cArr, true, methodVisitorVisitMethod.visitTypeAnnotation(context.f6495i, context.f6496j, readUTF8(iM8905a5, cArr), true));
                    }
                }
                if (i19 != 0) {
                    iM8903a = i19 + 2;
                    while (unsignedShort > 0) {
                        int iM8905a6 = m8905a(context, iM8903a);
                        iM8903a = m8903a(iM8905a6 + 2, cArr, true, methodVisitorVisitMethod.visitTypeAnnotation(context.f6495i, context.f6496j, readUTF8(iM8905a6, cArr), false));
                    }
                }
                if (i21 != 0) {
                    m8915b(methodVisitorVisitMethod, context, i21, true);
                }
                if (i22 != 0) {
                    m8915b(methodVisitorVisitMethod, context, i22, false);
                }
                while (attribute != null) {
                    Attribute attribute4 = attribute.f6437a;
                    attribute.f6437a = null;
                    methodVisitorVisitMethod.visitAttribute(attribute);
                    attribute = attribute4;
                }
                if (i13 != 0) {
                    methodVisitorVisitMethod.visitCode();
                    m8911a(methodVisitorVisitMethod, context, i13);
                }
                methodVisitorVisitMethod.visitEnd();
            }
        }
        return i26;
    }

    private void m8915b(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int iM8903a = i + 1;
        int i2 = this.f6442b[i] & 255;
        int length = Type.getArgumentTypes(context.f6493g).length - i2;
        int i3 = 0;
        while (i3 < length) {
            AnnotationVisitor annotationVisitorVisitParameterAnnotation = methodVisitor.visitParameterAnnotation(i3, "Ljava/lang/Synthetic;", false);
            if (annotationVisitorVisitParameterAnnotation != null) {
                annotationVisitorVisitParameterAnnotation.visitEnd();
            }
            i3++;
        }
        char[] cArr = context.f6489c;
        while (true) {
            int i4 = i3;
            if (i4 >= i2 + length) {
                return;
            }
            iM8903a += 2;
            for (int unsignedShort = readUnsignedShort(iM8903a); unsignedShort > 0; unsignedShort--) {
                iM8903a = m8903a(iM8903a + 2, cArr, true, methodVisitor.visitParameterAnnotation(i4, readUTF8(iM8903a, cArr), z));
            }
            i3 = i4 + 1;
        }
    }

    void m8916a(ClassWriter classWriter) {
        char[] cArr = new char[this.f6444d];
        int length = this.f6441a.length;
        Item[] itemArr = new Item[length];
        int i = 1;
        while (i < length) {
            int i2 = this.f6441a[i];
            byte b = this.f6442b[i2 - 1];
            Item item = new Item(i);
            switch (b) {
                case 1:
                    String strM8907a = this.f6443c[i];
                    if (strM8907a == null) {
                        int i3 = this.f6441a[i];
                        String[] strArr = this.f6443c;
                        strM8907a = m8907a(i3 + 2, readUnsignedShort(i3), cArr);
                        strArr[i] = strM8907a;
                    }
                    item.m8959a(b, strM8907a, null, null);
                    break;
                case 2:
                case 7:
                case 8:
                case 13:
                case 14:
                case 16:
                case 17:
                default:
                    item.m8959a(b, readUTF8(i2, cArr), null, null);
                    break;
                case 3:
                    item.m8957a(readInt(i2));
                    break;
                case 4:
                    item.m8956a(Float.intBitsToFloat(readInt(i2)));
                    break;
                case 5:
                    item.m8960a(readLong(i2));
                    i++;
                    break;
                case 6:
                    item.m8955a(Double.longBitsToDouble(readLong(i2)));
                    i++;
                    break;
                case 9:
                case 10:
                case 11:
                    int i4 = this.f6441a[readUnsignedShort(i2 + 2)];
                    item.m8959a(b, readClass(i2, cArr), readUTF8(i4, cArr), readUTF8(i4 + 2, cArr));
                    break;
                case 12:
                    item.m8959a(b, readUTF8(i2, cArr), readUTF8(i2 + 2, cArr), null);
                    break;
                case 15:
                    int i5 = this.f6441a[readUnsignedShort(i2 + 1)];
                    int i6 = this.f6441a[readUnsignedShort(i5 + 2)];
                    item.m8959a(readByte(i2) + 20, readClass(i5, cArr), readUTF8(i6, cArr), readUTF8(i6 + 2, cArr));
                    break;
                case 18:
                    if (classWriter.f6448A == null) {
                        m8909a(classWriter, itemArr, cArr);
                    }
                    int i7 = this.f6441a[readUnsignedShort(i2 + 2)];
                    item.m8961a(readUTF8(i7, cArr), readUTF8(i7 + 2, cArr), readUnsignedShort(i2));
                    break;
            }
            int length2 = item.f6549j % itemArr.length;
            item.f6550k = itemArr[length2];
            itemArr[length2] = item;
            i++;
        }
        int i8 = this.f6441a[1] - 1;
        classWriter.f6464d.putByteArray(this.f6442b, i8, this.header - i8);
        classWriter.f6465e = itemArr;
        classWriter.f6466f = (int) (0.75d * ((double) length));
        classWriter.f6463c = length;
    }

    public void accept(ClassVisitor classVisitor, int i) {
        accept(classVisitor, new Attribute[0], i);
    }

    public void accept(ClassVisitor classVisitor, Attribute[] attributeArr, int i) {
        String strM8907a;
        String str;
        String utf8;
        String utf9;
        int i2;
        int i3;
        int i4;
        int i5 = this.header;
        char[] cArr = new char[this.f6444d];
        Context context = new Context();
        context.f6487a = attributeArr;
        context.f6488b = i;
        context.f6489c = cArr;
        int unsignedShort = readUnsignedShort(i5);
        String str2 = readClass(i5 + 2, cArr);
        String str3 = readClass(i5 + 4, cArr);
        String[] strArr = new String[readUnsignedShort(i5 + 6)];
        int i6 = i5 + 8;
        for (int i7 = 0; i7 < strArr.length; i7++) {
            strArr[i7] = readClass(i6, cArr);
            i6 += 2;
        }
        String utf10 = null;
        String utf11 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        Attribute attribute = null;
        int iM8900a = m8900a();
        int unsignedShort2 = readUnsignedShort(iM8900a);
        int i13 = iM8900a;
        while (unsignedShort2 > 0) {
            String utf12 = readUTF8(i13 + 2, cArr);
            if (AttSourceFile.ATTRIBUTE_NAME.equals(utf12)) {
                strM8907a = str4;
                str = str5;
                utf8 = str6;
                utf9 = str7;
                i2 = i8;
                i3 = i9;
                i4 = i10;
                utf11 = readUTF8(i13 + 8, cArr);
            } else if (AttInnerClasses.ATTRIBUTE_NAME.equals(utf12)) {
                i12 = i13 + 8;
                strM8907a = str4;
                str = str5;
                utf8 = str6;
                utf9 = str7;
                i2 = i8;
                i3 = i9;
                i4 = i10;
            } else if (AttEnclosingMethod.ATTRIBUTE_NAME.equals(utf12)) {
                str = readClass(i13 + 8, cArr);
                int unsignedShort3 = readUnsignedShort(i13 + 10);
                if (unsignedShort3 != 0) {
                    utf8 = readUTF8(this.f6441a[unsignedShort3], cArr);
                    utf9 = readUTF8(this.f6441a[unsignedShort3] + 2, cArr);
                } else {
                    utf9 = str7;
                    utf8 = str6;
                }
                strM8907a = str4;
                i2 = i8;
                i3 = i9;
                i4 = i10;
            } else if (AttSignature.ATTRIBUTE_NAME.equals(utf12)) {
                utf10 = readUTF8(i13 + 8, cArr);
                strM8907a = str4;
                str = str5;
                utf8 = str6;
                utf9 = str7;
                i2 = i8;
                i3 = i9;
                i4 = i10;
            } else if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf12)) {
                i2 = i13 + 8;
                strM8907a = str4;
                str = str5;
                utf8 = str6;
                utf9 = str7;
                i3 = i9;
                i4 = i10;
            } else if ("RuntimeVisibleTypeAnnotations".equals(utf12)) {
                i4 = i13 + 8;
                strM8907a = str4;
                str = str5;
                utf8 = str6;
                utf9 = str7;
                i2 = i8;
                i3 = i9;
            } else if (AttDeprecated.ATTRIBUTE_NAME.equals(utf12)) {
                unsignedShort |= 131072;
                strM8907a = str4;
                str = str5;
                utf8 = str6;
                utf9 = str7;
                i2 = i8;
                i3 = i9;
                i4 = i10;
            } else if (AttSynthetic.ATTRIBUTE_NAME.equals(utf12)) {
                unsignedShort |= 266240;
                strM8907a = str4;
                str = str5;
                utf8 = str6;
                utf9 = str7;
                i2 = i8;
                i3 = i9;
                i4 = i10;
            } else if (AttSourceDebugExtension.ATTRIBUTE_NAME.equals(utf12)) {
                int i14 = readInt(i13 + 4);
                strM8907a = m8907a(i13 + 8, i14, new char[i14]);
                str = str5;
                utf8 = str6;
                utf9 = str7;
                i2 = i8;
                i3 = i9;
                i4 = i10;
            } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf12)) {
                i3 = i13 + 8;
                strM8907a = str4;
                str = str5;
                utf8 = str6;
                utf9 = str7;
                i2 = i8;
                i4 = i10;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(utf12)) {
                i11 = i13 + 8;
                strM8907a = str4;
                str = str5;
                utf8 = str6;
                utf9 = str7;
                i2 = i8;
                i3 = i9;
                i4 = i10;
            } else if (AttBootstrapMethods.ATTRIBUTE_NAME.equals(utf12)) {
                int[] iArr = new int[readUnsignedShort(i13 + 8)];
                int unsignedShort4 = i13 + 10;
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr[i15] = unsignedShort4;
                    unsignedShort4 += (readUnsignedShort(unsignedShort4 + 2) + 2) << 1;
                }
                context.f6490d = iArr;
                strM8907a = str4;
                str = str5;
                utf8 = str6;
                utf9 = str7;
                i2 = i8;
                i3 = i9;
                i4 = i10;
            } else {
                Attribute attributeM8908a = m8908a(attributeArr, utf12, i13 + 8, readInt(i13 + 4), cArr, -1, null);
                if (attributeM8908a != null) {
                    attributeM8908a.f6437a = attribute;
                    strM8907a = str4;
                    str = str5;
                    utf8 = str6;
                    utf9 = str7;
                    i2 = i8;
                    i3 = i9;
                    i4 = i10;
                    attribute = attributeM8908a;
                } else {
                    strM8907a = str4;
                    str = str5;
                    utf8 = str6;
                    utf9 = str7;
                    i2 = i8;
                    i3 = i9;
                    i4 = i10;
                }
            }
            i13 += readInt(i13 + 4) + 6;
            unsignedShort2--;
            i10 = i4;
            i9 = i3;
            i8 = i2;
            str7 = utf9;
            str6 = utf8;
            str5 = str;
            str4 = strM8907a;
        }
        classVisitor.visit(readInt(this.f6441a[1] - 7), unsignedShort, str2, utf10, str3, strArr);
        if ((i & 2) == 0 && (utf11 != null || str4 != null)) {
            classVisitor.visitSource(utf11, str4);
        }
        if (str5 != null) {
            classVisitor.visitOuterClass(str5, str6, str7);
        }
        if (i8 != 0) {
            int iM8903a = i8 + 2;
            for (int unsignedShort5 = readUnsignedShort(i8); unsignedShort5 > 0; unsignedShort5--) {
                iM8903a = m8903a(iM8903a + 2, cArr, true, classVisitor.visitAnnotation(readUTF8(iM8903a, cArr), true));
            }
        }
        if (i9 != 0) {
            int iM8903a2 = i9 + 2;
            for (int unsignedShort6 = readUnsignedShort(i9); unsignedShort6 > 0; unsignedShort6--) {
                iM8903a2 = m8903a(iM8903a2 + 2, cArr, true, classVisitor.visitAnnotation(readUTF8(iM8903a2, cArr), false));
            }
        }
        if (i10 != 0) {
            int iM8903a3 = i10 + 2;
            for (int unsignedShort7 = readUnsignedShort(i10); unsignedShort7 > 0; unsignedShort7--) {
                int iM8905a = m8905a(context, iM8903a3);
                iM8903a3 = m8903a(iM8905a + 2, cArr, true, classVisitor.visitTypeAnnotation(context.f6495i, context.f6496j, readUTF8(iM8905a, cArr), true));
            }
        }
        if (i11 != 0) {
            int iM8903a4 = i11 + 2;
            for (int unsignedShort8 = readUnsignedShort(i11); unsignedShort8 > 0; unsignedShort8--) {
                int iM8905a2 = m8905a(context, iM8903a4);
                iM8903a4 = m8903a(iM8905a2 + 2, cArr, true, classVisitor.visitTypeAnnotation(context.f6495i, context.f6496j, readUTF8(iM8905a2, cArr), false));
            }
        }
        while (attribute != null) {
            Attribute attribute2 = attribute.f6437a;
            attribute.f6437a = null;
            classVisitor.visitAttribute(attribute);
            attribute = attribute2;
        }
        if (i12 != 0) {
            int i16 = i12 + 2;
            for (int unsignedShort9 = readUnsignedShort(i12); unsignedShort9 > 0; unsignedShort9--) {
                classVisitor.visitInnerClass(readClass(i16, cArr), readClass(i16 + 2, cArr), readUTF8(i16 + 4, cArr), readUnsignedShort(i16 + 6));
                i16 += 8;
            }
        }
        int length = this.header + 10 + (strArr.length * 2);
        for (int unsignedShort10 = readUnsignedShort(length - 2); unsignedShort10 > 0; unsignedShort10--) {
            length = m8904a(classVisitor, context, length);
        }
        int iM8914b = length + 2;
        for (int unsignedShort11 = readUnsignedShort(iM8914b - 2); unsignedShort11 > 0; unsignedShort11--) {
            iM8914b = m8914b(classVisitor, context, iM8914b);
        }
        classVisitor.visitEnd();
    }

    public int getAccess() {
        return readUnsignedShort(this.header);
    }

    public String getClassName() {
        return readClass(this.header + 2, new char[this.f6444d]);
    }

    public String[] getInterfaces() {
        int i = this.header + 6;
        int unsignedShort = readUnsignedShort(i);
        String[] strArr = new String[unsignedShort];
        if (unsignedShort > 0) {
            char[] cArr = new char[this.f6444d];
            for (int i2 = 0; i2 < unsignedShort; i2++) {
                i += 2;
                strArr[i2] = readClass(i, cArr);
            }
        }
        return strArr;
    }

    public int getItem(int i) {
        return this.f6441a[i];
    }

    public int getItemCount() {
        return this.f6441a.length;
    }

    public int getMaxStringLength() {
        return this.f6444d;
    }

    public String getSuperName() {
        return readClass(this.header + 4, new char[this.f6444d]);
    }

    public int readByte(int i) {
        return this.f6442b[i] & 255;
    }

    public String readClass(int i, char[] cArr) {
        return readUTF8(this.f6441a[readUnsignedShort(i)], cArr);
    }

    public Object readConst(int i, char[] cArr) {
        int i2 = this.f6441a[i];
        switch (this.f6442b[i2 - 1]) {
            case 3:
                return new Integer(readInt(i2));
            case 4:
                return new Float(Float.intBitsToFloat(readInt(i2)));
            case 5:
                return new Long(readLong(i2));
            case 6:
                return new Double(Double.longBitsToDouble(readLong(i2)));
            case 7:
                return Type.getObjectType(readUTF8(i2, cArr));
            case 8:
                return readUTF8(i2, cArr);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                int i3 = readByte(i2);
                int[] iArr = this.f6441a;
                int i4 = iArr[readUnsignedShort(i2 + 1)];
                String str = readClass(i4, cArr);
                int i5 = iArr[readUnsignedShort(i4 + 2)];
                return new Handle(i3, str, readUTF8(i5, cArr), readUTF8(i5 + 2, cArr));
            case 16:
                return Type.getMethodType(readUTF8(i2, cArr));
        }
    }

    public int readInt(int i) {
        byte[] bArr = this.f6442b;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    protected Label readLabel(int i, Label[] labelArr) {
        if (labelArr[i] == null) {
            labelArr[i] = new Label();
        }
        return labelArr[i];
    }

    public long readLong(int i) {
        return (((long) readInt(i)) << 32) | (((long) readInt(i + 4)) & 4294967295L);
    }

    public short readShort(int i) {
        byte[] bArr = this.f6442b;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public String readUTF8(int i, char[] cArr) {
        int unsignedShort = readUnsignedShort(i);
        if (i == 0 || unsignedShort == 0) {
            return null;
        }
        String str = this.f6443c[unsignedShort];
        if (str != null) {
            return str;
        }
        int i2 = this.f6441a[unsignedShort];
        String[] strArr = this.f6443c;
        String strM8907a = m8907a(i2 + 2, readUnsignedShort(i2), cArr);
        strArr[unsignedShort] = strM8907a;
        return strM8907a;
    }

    public int readUnsignedShort(int i) {
        byte[] bArr = this.f6442b;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }
}
