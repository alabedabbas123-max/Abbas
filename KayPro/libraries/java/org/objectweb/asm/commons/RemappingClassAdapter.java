package org.objectweb.asm.commons;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypePath;

public class RemappingClassAdapter extends ClassVisitor {
    protected String className;
    protected final Remapper remapper;

    protected RemappingClassAdapter(int i, ClassVisitor classVisitor, Remapper remapper) {
        super(i, classVisitor);
        this.remapper = remapper;
    }

    public RemappingClassAdapter(ClassVisitor classVisitor, Remapper remapper) {
        this(Opcodes.ASM5, classVisitor, remapper);
    }

    protected AnnotationVisitor createRemappingAnnotationAdapter(AnnotationVisitor annotationVisitor) {
        return new RemappingAnnotationAdapter(annotationVisitor, this.remapper);
    }

    protected FieldVisitor createRemappingFieldAdapter(FieldVisitor fieldVisitor) {
        return new RemappingFieldAdapter(fieldVisitor, this.remapper);
    }

    protected MethodVisitor createRemappingMethodAdapter(int i, String str, MethodVisitor methodVisitor) {
        return new RemappingMethodAdapter(i, str, methodVisitor, this.remapper);
    }

    @Override
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.className = str;
        super.visit(i, i2, this.remapper.mapType(str), this.remapper.mapSignature(str2, false), this.remapper.mapType(str3), strArr == null ? null : this.remapper.mapTypes(strArr));
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitAnnotation = super.visitAnnotation(this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitAnnotation == null) {
            return null;
        }
        return createRemappingAnnotationAdapter(annotationVisitorVisitAnnotation);
    }

    @Override
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        FieldVisitor fieldVisitorVisitField = super.visitField(i, this.remapper.mapFieldName(this.className, str, str2), this.remapper.mapDesc(str2), this.remapper.mapSignature(str3, true), this.remapper.mapValue(obj));
        if (fieldVisitorVisitField == null) {
            return null;
        }
        return createRemappingFieldAdapter(fieldVisitorVisitField);
    }

    @Override
    public void visitInnerClass(String str, String str2, String str3, int i) {
        super.visitInnerClass(this.remapper.mapType(str), str2 == null ? null : this.remapper.mapType(str2), str3, i);
    }

    @Override
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        String strMapMethodDesc = this.remapper.mapMethodDesc(str2);
        MethodVisitor methodVisitorVisitMethod = super.visitMethod(i, this.remapper.mapMethodName(this.className, str, str2), strMapMethodDesc, this.remapper.mapSignature(str3, false), strArr == null ? null : this.remapper.mapTypes(strArr));
        if (methodVisitorVisitMethod == null) {
            return null;
        }
        return createRemappingMethodAdapter(i, strMapMethodDesc, methodVisitorVisitMethod);
    }

    @Override
    public void visitOuterClass(String str, String str2, String str3) {
        super.visitOuterClass(this.remapper.mapType(str), str2 == null ? null : this.remapper.mapMethodName(str, str2, str3), str3 != null ? this.remapper.mapMethodDesc(str3) : null);
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitTypeAnnotation = super.visitTypeAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitTypeAnnotation == null) {
            return null;
        }
        return createRemappingAnnotationAdapter(annotationVisitorVisitTypeAnnotation);
    }
}
