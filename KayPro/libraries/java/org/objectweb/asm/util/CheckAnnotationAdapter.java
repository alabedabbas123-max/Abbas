package org.objectweb.asm.util;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class CheckAnnotationAdapter extends AnnotationVisitor {

    private boolean f6694end;
    private final boolean named;

    public CheckAnnotationAdapter(AnnotationVisitor annotationVisitor) {
        this(annotationVisitor, true);
    }

    CheckAnnotationAdapter(AnnotationVisitor annotationVisitor, boolean z) {
        super(Opcodes.ASM5, annotationVisitor);
        this.named = z;
    }

    private void checkEnd() {
        if (this.f6694end) {
            throw new IllegalStateException("Cannot call a visit method after visitEnd has been called");
        }
    }

    private void checkName(String str) {
        if (this.named && str == null) {
            throw new IllegalArgumentException("Annotation value name must not be null");
        }
    }

    @Override
    public void visit(String str, Object obj) {
        checkEnd();
        checkName(str);
        if (!(obj instanceof Byte) && !(obj instanceof Boolean) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof Type) && !(obj instanceof byte[]) && !(obj instanceof boolean[]) && !(obj instanceof char[]) && !(obj instanceof short[]) && !(obj instanceof int[]) && !(obj instanceof long[]) && !(obj instanceof float[]) && !(obj instanceof double[])) {
            throw new IllegalArgumentException("Invalid annotation value");
        }
        if ((obj instanceof Type) && ((Type) obj).getSort() == 11) {
            throw new IllegalArgumentException("Invalid annotation value");
        }
        if (this.f6428av != null) {
            this.f6428av.visit(str, obj);
        }
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        checkEnd();
        checkName(str);
        CheckMethodAdapter.checkDesc(str2, false);
        return new CheckAnnotationAdapter(this.f6428av == null ? null : this.f6428av.visitAnnotation(str, str2));
    }

    @Override
    public AnnotationVisitor visitArray(String str) {
        checkEnd();
        checkName(str);
        return new CheckAnnotationAdapter(this.f6428av == null ? null : this.f6428av.visitArray(str), false);
    }

    @Override
    public void visitEnd() {
        checkEnd();
        this.f6694end = true;
        if (this.f6428av != null) {
            this.f6428av.visitEnd();
        }
    }

    @Override
    public void visitEnum(String str, String str2, String str3) {
        checkEnd();
        checkName(str);
        CheckMethodAdapter.checkDesc(str2, false);
        if (str3 == null) {
            throw new IllegalArgumentException("Invalid enum value");
        }
        if (this.f6428av != null) {
            this.f6428av.visitEnum(str, str2, str3);
        }
    }
}
