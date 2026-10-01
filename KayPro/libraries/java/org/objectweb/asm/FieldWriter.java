package org.objectweb.asm;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttConstantValue;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttDeprecated;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSignature;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSynthetic;

final class FieldWriter extends FieldVisitor {

    private final ClassWriter f6512b;

    private final int f6513c;

    private final int f6514d;

    private final int f6515e;

    private int f6516f;

    private int f6517g;

    private AnnotationWriter f6518h;

    private AnnotationWriter f6519i;

    private Attribute f6520j;

    private AnnotationWriter f6521k;

    private AnnotationWriter f6522l;

    FieldWriter(ClassWriter classWriter, int i, String str, String str2, String str3, Object obj) {
        super(Opcodes.ASM5);
        if (classWriter.f6449B == null) {
            classWriter.f6449B = this;
        } else {
            classWriter.f6450C.f6511fv = this;
        }
        classWriter.f6450C = this;
        this.f6512b = classWriter;
        this.f6513c = i;
        this.f6514d = classWriter.newUTF8(str);
        this.f6515e = classWriter.newUTF8(str2);
        if (str3 != null) {
            this.f6516f = classWriter.newUTF8(str3);
        }
        if (obj != null) {
            this.f6517g = classWriter.m8930a(obj).f6542a;
        }
    }

    int m8938a() {
        int iM8891a;
        int iM8891a2 = 8;
        if (this.f6517g != 0) {
            this.f6512b.newUTF8(AttConstantValue.ATTRIBUTE_NAME);
            iM8891a2 = 16;
        }
        if ((this.f6513c & 4096) != 0 && ((this.f6512b.f6462b & 65535) < 49 || (this.f6513c & 262144) != 0)) {
            this.f6512b.newUTF8(AttSynthetic.ATTRIBUTE_NAME);
            iM8891a2 += 6;
        }
        if ((this.f6513c & 131072) != 0) {
            this.f6512b.newUTF8(AttDeprecated.ATTRIBUTE_NAME);
            iM8891a2 += 6;
        }
        if (this.f6516f != 0) {
            this.f6512b.newUTF8(AttSignature.ATTRIBUTE_NAME);
            iM8891a2 += 8;
        }
        if (this.f6518h != null) {
            this.f6512b.newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
            iM8891a2 += this.f6518h.m8891a() + 8;
        }
        if (this.f6519i != null) {
            this.f6512b.newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME);
            iM8891a2 += this.f6519i.m8891a() + 8;
        }
        if (this.f6521k != null) {
            this.f6512b.newUTF8("RuntimeVisibleTypeAnnotations");
            iM8891a2 += this.f6521k.m8891a() + 8;
        }
        if (this.f6522l != null) {
            this.f6512b.newUTF8("RuntimeInvisibleTypeAnnotations");
            iM8891a = iM8891a2 + this.f6522l.m8891a() + 8;
        } else {
            iM8891a = iM8891a2;
        }
        return this.f6520j != null ? iM8891a + this.f6520j.m8894a(this.f6512b, null, 0, -1, -1) : iM8891a;
    }

    void m8939a(ByteVector byteVector) {
        byteVector.putShort(((((this.f6513c & 262144) / 64) | 393216) ^ (-1)) & this.f6513c).putShort(this.f6514d).putShort(this.f6515e);
        int iM8893a = this.f6517g != 0 ? 1 : 0;
        if ((this.f6513c & 4096) != 0 && ((this.f6512b.f6462b & 65535) < 49 || (this.f6513c & 262144) != 0)) {
            iM8893a++;
        }
        if ((this.f6513c & 131072) != 0) {
            iM8893a++;
        }
        if (this.f6516f != 0) {
            iM8893a++;
        }
        if (this.f6518h != null) {
            iM8893a++;
        }
        if (this.f6519i != null) {
            iM8893a++;
        }
        if (this.f6521k != null) {
            iM8893a++;
        }
        if (this.f6522l != null) {
            iM8893a++;
        }
        if (this.f6520j != null) {
            iM8893a += this.f6520j.m8893a();
        }
        byteVector.putShort(iM8893a);
        if (this.f6517g != 0) {
            byteVector.putShort(this.f6512b.newUTF8(AttConstantValue.ATTRIBUTE_NAME));
            byteVector.putInt(2).putShort(this.f6517g);
        }
        if ((this.f6513c & 4096) != 0 && ((this.f6512b.f6462b & 65535) < 49 || (this.f6513c & 262144) != 0)) {
            byteVector.putShort(this.f6512b.newUTF8(AttSynthetic.ATTRIBUTE_NAME)).putInt(0);
        }
        if ((this.f6513c & 131072) != 0) {
            byteVector.putShort(this.f6512b.newUTF8(AttDeprecated.ATTRIBUTE_NAME)).putInt(0);
        }
        if (this.f6516f != 0) {
            byteVector.putShort(this.f6512b.newUTF8(AttSignature.ATTRIBUTE_NAME));
            byteVector.putInt(2).putShort(this.f6516f);
        }
        if (this.f6518h != null) {
            byteVector.putShort(this.f6512b.newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME));
            this.f6518h.m8892a(byteVector);
        }
        if (this.f6519i != null) {
            byteVector.putShort(this.f6512b.newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME));
            this.f6519i.m8892a(byteVector);
        }
        if (this.f6521k != null) {
            byteVector.putShort(this.f6512b.newUTF8("RuntimeVisibleTypeAnnotations"));
            this.f6521k.m8892a(byteVector);
        }
        if (this.f6522l != null) {
            byteVector.putShort(this.f6512b.newUTF8("RuntimeInvisibleTypeAnnotations"));
            this.f6522l.m8892a(byteVector);
        }
        if (this.f6520j != null) {
            this.f6520j.m8895a(this.f6512b, null, 0, -1, -1, byteVector);
        }
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.f6512b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f6512b, true, byteVector, byteVector, 2);
        if (z) {
            annotationWriter.f6435g = this.f6518h;
            this.f6518h = annotationWriter;
        } else {
            annotationWriter.f6435g = this.f6519i;
            this.f6519i = annotationWriter;
        }
        return annotationWriter;
    }

    @Override
    public void visitAttribute(Attribute attribute) {
        attribute.f6437a = this.f6520j;
        this.f6520j = attribute;
    }

    @Override
    public void visitEnd() {
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.m8889a(i, typePath, byteVector);
        byteVector.putShort(this.f6512b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f6512b, true, byteVector, byteVector, byteVector.f6440b - 2);
        if (z) {
            annotationWriter.f6435g = this.f6521k;
            this.f6521k = annotationWriter;
        } else {
            annotationWriter.f6435g = this.f6522l;
            this.f6522l = annotationWriter;
        }
        return annotationWriter;
    }
}
