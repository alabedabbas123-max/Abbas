package org.objectweb.asm.commons;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypePath;

public class RemappingFieldAdapter extends FieldVisitor {
    private final Remapper remapper;

    protected RemappingFieldAdapter(int i, FieldVisitor fieldVisitor, Remapper remapper) {
        super(i, fieldVisitor);
        this.remapper = remapper;
    }

    public RemappingFieldAdapter(FieldVisitor fieldVisitor, Remapper remapper) {
        this(Opcodes.ASM5, fieldVisitor, remapper);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitAnnotation = this.f6511fv.visitAnnotation(this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitAnnotation == null) {
            return null;
        }
        return new RemappingAnnotationAdapter(annotationVisitorVisitAnnotation, this.remapper);
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitTypeAnnotation = super.visitTypeAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitTypeAnnotation == null) {
            return null;
        }
        return new RemappingAnnotationAdapter(annotationVisitorVisitTypeAnnotation, this.remapper);
    }
}
