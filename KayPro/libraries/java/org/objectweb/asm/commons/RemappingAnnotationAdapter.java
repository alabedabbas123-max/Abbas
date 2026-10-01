package org.objectweb.asm.commons;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Opcodes;

public class RemappingAnnotationAdapter extends AnnotationVisitor {
    protected final Remapper remapper;

    protected RemappingAnnotationAdapter(int i, AnnotationVisitor annotationVisitor, Remapper remapper) {
        super(i, annotationVisitor);
        this.remapper = remapper;
    }

    public RemappingAnnotationAdapter(AnnotationVisitor annotationVisitor, Remapper remapper) {
        this(Opcodes.ASM5, annotationVisitor, remapper);
    }

    @Override
    public void visit(String str, Object obj) {
        this.f6428av.visit(str, this.remapper.mapValue(obj));
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        AnnotationVisitor annotationVisitorVisitAnnotation = this.f6428av.visitAnnotation(str, this.remapper.mapDesc(str2));
        if (annotationVisitorVisitAnnotation == null) {
            return null;
        }
        return annotationVisitorVisitAnnotation != this.f6428av ? new RemappingAnnotationAdapter(annotationVisitorVisitAnnotation, this.remapper) : this;
    }

    @Override
    public AnnotationVisitor visitArray(String str) {
        AnnotationVisitor annotationVisitorVisitArray = this.f6428av.visitArray(str);
        if (annotationVisitorVisitArray == null) {
            return null;
        }
        return annotationVisitorVisitArray != this.f6428av ? new RemappingAnnotationAdapter(annotationVisitorVisitArray, this.remapper) : this;
    }

    @Override
    public void visitEnum(String str, String str2, String str3) {
        this.f6428av.visitEnum(str, this.remapper.mapDesc(str2), str3);
    }
}
