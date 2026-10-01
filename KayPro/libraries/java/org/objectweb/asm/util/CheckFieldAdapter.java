package org.objectweb.asm.util;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypePath;

public class CheckFieldAdapter extends FieldVisitor {
    static Class class$org$objectweb$asm$util$CheckFieldAdapter = class$("org.objectweb.asm.util.CheckFieldAdapter");

    private boolean f6696end;

    protected CheckFieldAdapter(int i, FieldVisitor fieldVisitor) {
        super(i, fieldVisitor);
    }

    public CheckFieldAdapter(FieldVisitor fieldVisitor) {
        this(Opcodes.ASM5, fieldVisitor);
        if (getClass() != class$org$objectweb$asm$util$CheckFieldAdapter) {
            throw new IllegalStateException();
        }
    }

    private void checkEnd() {
        if (this.f6696end) {
            throw new IllegalStateException("Cannot call a visit method after visitEnd has been called");
        }
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        checkEnd();
        CheckMethodAdapter.checkDesc(str, false);
        return new CheckAnnotationAdapter(super.visitAnnotation(str, z));
    }

    @Override
    public void visitAttribute(Attribute attribute) {
        checkEnd();
        if (attribute == null) {
            throw new IllegalArgumentException("Invalid attribute (must not be null)");
        }
        super.visitAttribute(attribute);
    }

    @Override
    public void visitEnd() {
        checkEnd();
        this.f6696end = true;
        super.visitEnd();
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        checkEnd();
        int i2 = i >>> 24;
        if (i2 != 19) {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid type reference sort 0x").append(Integer.toHexString(i2)).toString());
        }
        CheckClassAdapter.checkTypeRefAndPath(i, typePath);
        CheckMethodAdapter.checkDesc(str, false);
        return new CheckAnnotationAdapter(super.visitTypeAnnotation(i, typePath, str, z));
    }
}
