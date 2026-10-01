package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypePath;

public class FieldNode extends FieldVisitor {
    static Class class$org$objectweb$asm$tree$FieldNode = class$("org.objectweb.asm.tree.FieldNode");
    public int access;
    public List attrs;
    public String desc;
    public List invisibleAnnotations;
    public List invisibleTypeAnnotations;
    public String name;
    public String signature;
    public Object value;
    public List visibleAnnotations;
    public List visibleTypeAnnotations;

    public FieldNode(int i, int i2, String str, String str2, String str3, Object obj) {
        super(i);
        this.access = i2;
        this.name = str;
        this.desc = str2;
        this.signature = str3;
        this.value = obj;
    }

    public FieldNode(int i, String str, String str2, String str3, Object obj) {
        this(Opcodes.ASM5, i, str, str2, str3, obj);
        if (getClass() != class$org$objectweb$asm$tree$FieldNode) {
            throw new IllegalStateException();
        }
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public void accept(ClassVisitor classVisitor) {
        FieldVisitor fieldVisitorVisitField = classVisitor.visitField(this.access, this.name, this.desc, this.signature, this.value);
        if (fieldVisitorVisitField == null) {
            return;
        }
        int size = this.visibleAnnotations == null ? 0 : this.visibleAnnotations.size();
        for (int i = 0; i < size; i++) {
            AnnotationNode annotationNode = (AnnotationNode) this.visibleAnnotations.get(i);
            annotationNode.accept(fieldVisitorVisitField.visitAnnotation(annotationNode.desc, true));
        }
        int size2 = this.invisibleAnnotations == null ? 0 : this.invisibleAnnotations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnnotationNode annotationNode2 = (AnnotationNode) this.invisibleAnnotations.get(i2);
            annotationNode2.accept(fieldVisitorVisitField.visitAnnotation(annotationNode2.desc, false));
        }
        int size3 = this.visibleTypeAnnotations == null ? 0 : this.visibleTypeAnnotations.size();
        for (int i3 = 0; i3 < size3; i3++) {
            TypeAnnotationNode typeAnnotationNode = (TypeAnnotationNode) this.visibleTypeAnnotations.get(i3);
            typeAnnotationNode.accept(fieldVisitorVisitField.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
        }
        int size4 = this.invisibleTypeAnnotations == null ? 0 : this.invisibleTypeAnnotations.size();
        for (int i4 = 0; i4 < size4; i4++) {
            TypeAnnotationNode typeAnnotationNode2 = (TypeAnnotationNode) this.invisibleTypeAnnotations.get(i4);
            typeAnnotationNode2.accept(fieldVisitorVisitField.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
        }
        int size5 = this.attrs == null ? 0 : this.attrs.size();
        for (int i5 = 0; i5 < size5; i5++) {
            fieldVisitorVisitField.visitAttribute((Attribute) this.attrs.get(i5));
        }
        fieldVisitorVisitField.visitEnd();
    }

    public void check(int i) {
        if (i == 262144) {
            if (this.visibleTypeAnnotations != null && this.visibleTypeAnnotations.size() > 0) {
                throw new RuntimeException();
            }
            if (this.invisibleTypeAnnotations != null && this.invisibleTypeAnnotations.size() > 0) {
                throw new RuntimeException();
            }
        }
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationNode annotationNode = new AnnotationNode(str);
        if (z) {
            if (this.visibleAnnotations == null) {
                this.visibleAnnotations = new ArrayList(1);
            }
            this.visibleAnnotations.add(annotationNode);
        } else {
            if (this.invisibleAnnotations == null) {
                this.invisibleAnnotations = new ArrayList(1);
            }
            this.invisibleAnnotations.add(annotationNode);
        }
        return annotationNode;
    }

    @Override
    public void visitAttribute(Attribute attribute) {
        if (this.attrs == null) {
            this.attrs = new ArrayList(1);
        }
        this.attrs.add(attribute);
    }

    @Override
    public void visitEnd() {
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i, typePath, str);
        if (z) {
            if (this.visibleTypeAnnotations == null) {
                this.visibleTypeAnnotations = new ArrayList(1);
            }
            this.visibleTypeAnnotations.add(typeAnnotationNode);
        } else {
            if (this.invisibleTypeAnnotations == null) {
                this.invisibleTypeAnnotations = new ArrayList(1);
            }
            this.invisibleTypeAnnotations.add(typeAnnotationNode);
        }
        return typeAnnotationNode;
    }
}
