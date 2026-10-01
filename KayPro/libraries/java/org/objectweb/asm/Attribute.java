package org.objectweb.asm;

public class Attribute {

    Attribute f6437a;

    byte[] f6438b;
    public final String type;

    protected Attribute(String str) {
        this.type = str;
    }

    final int m8893a() {
        int i = 0;
        while (this != null) {
            i++;
            this = this.f6437a;
        }
        return i;
    }

    final int m8894a(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        Attribute attribute = this;
        while (attribute != null) {
            classWriter.newUTF8(attribute.type);
            int i5 = attribute.write(classWriter, bArr, i, i2, i3).f6440b + 6 + i4;
            attribute = attribute.f6437a;
            i4 = i5;
        }
        return i4;
    }

    final void m8895a(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3, ByteVector byteVector) {
        for (Attribute attribute = this; attribute != null; attribute = attribute.f6437a) {
            ByteVector byteVectorWrite = attribute.write(classWriter, bArr, i, i2, i3);
            byteVector.putShort(classWriter.newUTF8(attribute.type)).putInt(byteVectorWrite.f6440b);
            byteVector.putByteArray(byteVectorWrite.f6439a, 0, byteVectorWrite.f6440b);
        }
    }

    protected Label[] getLabels() {
        return null;
    }

    public boolean isCodeAttribute() {
        return false;
    }

    public boolean isUnknown() {
        return true;
    }

    protected Attribute read(ClassReader classReader, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        Attribute attribute = new Attribute(this.type);
        attribute.f6438b = new byte[i2];
        System.arraycopy(classReader.f6442b, i, attribute.f6438b, 0, i2);
        return attribute;
    }

    protected ByteVector write(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        ByteVector byteVector = new ByteVector();
        byteVector.f6439a = this.f6438b;
        byteVector.f6440b = this.f6438b.length;
        return byteVector;
    }
}
