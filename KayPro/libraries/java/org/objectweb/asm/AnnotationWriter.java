package org.objectweb.asm;

final class AnnotationWriter extends AnnotationVisitor {

    private final ClassWriter f6429a;

    private int f6430b;

    private final boolean f6431c;

    private final ByteVector f6432d;

    private final ByteVector f6433e;

    private final int f6434f;

    AnnotationWriter f6435g;

    AnnotationWriter f6436h;

    AnnotationWriter(ClassWriter classWriter, boolean z, ByteVector byteVector, ByteVector byteVector2, int i) {
        super(Opcodes.ASM5);
        this.f6429a = classWriter;
        this.f6431c = z;
        this.f6432d = byteVector;
        this.f6433e = byteVector2;
        this.f6434f = i;
    }

    static void m8889a(int i, TypePath typePath, ByteVector byteVector) {
        switch (i >>> 24) {
            case 0:
            case 1:
            case 22:
                byteVector.putShort(i >>> 16);
                break;
            case 19:
            case 20:
            case 21:
                byteVector.putByte(i >>> 24);
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                byteVector.putInt(i);
                break;
            default:
                byteVector.m8898b(i >>> 24, (16776960 & i) >> 8);
                break;
        }
        if (typePath == null) {
            byteVector.putByte(0);
        } else {
            byteVector.putByteArray(typePath.f6645a, typePath.f6646b, (typePath.f6645a[typePath.f6646b] * 2) + 1);
        }
    }

    static void m8890a(AnnotationWriter[] annotationWriterArr, int i, ByteVector byteVector) {
        int length = ((annotationWriterArr.length - i) * 2) + 1;
        for (int i2 = i; i2 < annotationWriterArr.length; i2++) {
            length += annotationWriterArr[i2] == null ? 0 : annotationWriterArr[i2].m8891a();
        }
        byteVector.putInt(length).putByte(annotationWriterArr.length - i);
        while (i < annotationWriterArr.length) {
            AnnotationWriter annotationWriter = null;
            int i3 = 0;
            for (AnnotationWriter annotationWriter2 = annotationWriterArr[i]; annotationWriter2 != null; annotationWriter2 = annotationWriter2.f6435g) {
                i3++;
                annotationWriter2.visitEnd();
                annotationWriter2.f6436h = annotationWriter;
                annotationWriter = annotationWriter2;
            }
            byteVector.putShort(i3);
            while (annotationWriter != null) {
                byteVector.putByteArray(annotationWriter.f6432d.f6439a, 0, annotationWriter.f6432d.f6440b);
                annotationWriter = annotationWriter.f6436h;
            }
            i++;
        }
    }

    int m8891a() {
        int i = 0;
        while (this != null) {
            i += this.f6432d.f6440b;
            this = this.f6435g;
        }
        return i;
    }

    void m8892a(ByteVector byteVector) {
        int i = 2;
        AnnotationWriter annotationWriter = null;
        int i2 = 0;
        for (AnnotationWriter annotationWriter2 = this; annotationWriter2 != null; annotationWriter2 = annotationWriter2.f6435g) {
            i2++;
            i += annotationWriter2.f6432d.f6440b;
            annotationWriter2.visitEnd();
            annotationWriter2.f6436h = annotationWriter;
            annotationWriter = annotationWriter2;
        }
        byteVector.putInt(i);
        byteVector.putShort(i2);
        while (annotationWriter != null) {
            byteVector.putByteArray(annotationWriter.f6432d.f6439a, 0, annotationWriter.f6432d.f6440b);
            annotationWriter = annotationWriter.f6436h;
        }
    }

    @Override
    public void visit(String str, Object obj) {
        int i = 0;
        this.f6430b++;
        if (this.f6431c) {
            this.f6432d.putShort(this.f6429a.newUTF8(str));
        }
        if (obj instanceof String) {
            this.f6432d.m8898b(115, this.f6429a.newUTF8((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            this.f6432d.m8898b(66, this.f6429a.m8927a((int) ((Byte) obj).byteValue()).f6542a);
            return;
        }
        if (obj instanceof Boolean) {
            this.f6432d.m8898b(90, this.f6429a.m8927a(((Boolean) obj).booleanValue() ? 1 : 0).f6542a);
            return;
        }
        if (obj instanceof Character) {
            this.f6432d.m8898b(67, this.f6429a.m8927a((int) ((Character) obj).charValue()).f6542a);
            return;
        }
        if (obj instanceof Short) {
            this.f6432d.m8898b(83, this.f6429a.m8927a((int) ((Short) obj).shortValue()).f6542a);
            return;
        }
        if (obj instanceof Type) {
            this.f6432d.m8898b(99, this.f6429a.newUTF8(((Type) obj).getDescriptor()));
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            this.f6432d.m8898b(91, bArr.length);
            while (i < bArr.length) {
                this.f6432d.m8898b(66, this.f6429a.m8927a((int) bArr[i]).f6542a);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            this.f6432d.m8898b(91, zArr.length);
            for (boolean z : zArr) {
                this.f6432d.m8898b(90, this.f6429a.m8927a(z ? 1 : 0).f6542a);
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            this.f6432d.m8898b(91, sArr.length);
            while (i < sArr.length) {
                this.f6432d.m8898b(83, this.f6429a.m8927a((int) sArr[i]).f6542a);
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            this.f6432d.m8898b(91, cArr.length);
            while (i < cArr.length) {
                this.f6432d.m8898b(67, this.f6429a.m8927a((int) cArr[i]).f6542a);
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            this.f6432d.m8898b(91, iArr.length);
            while (i < iArr.length) {
                this.f6432d.m8898b(73, this.f6429a.m8927a(iArr[i]).f6542a);
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            this.f6432d.m8898b(91, jArr.length);
            while (i < jArr.length) {
                this.f6432d.m8898b(74, this.f6429a.m8929a(jArr[i]).f6542a);
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            this.f6432d.m8898b(91, fArr.length);
            while (i < fArr.length) {
                this.f6432d.m8898b(70, this.f6429a.m8926a(fArr[i]).f6542a);
                i++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            Item itemM8930a = this.f6429a.m8930a(obj);
            this.f6432d.m8898b(".s.IFJDCS".charAt(itemM8930a.f6543b), itemM8930a.f6542a);
            return;
        }
        double[] dArr = (double[]) obj;
        this.f6432d.m8898b(91, dArr.length);
        while (i < dArr.length) {
            this.f6432d.m8898b(68, this.f6429a.m8925a(dArr[i]).f6542a);
            i++;
        }
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        this.f6430b++;
        if (this.f6431c) {
            this.f6432d.putShort(this.f6429a.newUTF8(str));
        }
        this.f6432d.m8898b(64, this.f6429a.newUTF8(str2)).putShort(0);
        return new AnnotationWriter(this.f6429a, true, this.f6432d, this.f6432d, this.f6432d.f6440b - 2);
    }

    @Override
    public AnnotationVisitor visitArray(String str) {
        this.f6430b++;
        if (this.f6431c) {
            this.f6432d.putShort(this.f6429a.newUTF8(str));
        }
        this.f6432d.m8898b(91, 0);
        return new AnnotationWriter(this.f6429a, false, this.f6432d, this.f6432d, this.f6432d.f6440b - 2);
    }

    @Override
    public void visitEnd() {
        if (this.f6433e != null) {
            byte[] bArr = this.f6433e.f6439a;
            bArr[this.f6434f] = (byte) (this.f6430b >>> 8);
            bArr[this.f6434f + 1] = (byte) this.f6430b;
        }
    }

    @Override
    public void visitEnum(String str, String str2, String str3) {
        this.f6430b++;
        if (this.f6431c) {
            this.f6432d.putShort(this.f6429a.newUTF8(str));
        }
        this.f6432d.m8898b(101, this.f6429a.newUTF8(str2)).putShort(this.f6429a.newUTF8(str3));
    }
}
