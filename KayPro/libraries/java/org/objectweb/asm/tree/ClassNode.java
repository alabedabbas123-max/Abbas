package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypePath;

public class ClassNode extends ClassVisitor {
    static Class class$org$objectweb$asm$tree$ClassNode = class$("org.objectweb.asm.tree.ClassNode");
    public int access;
    public List attrs;
    public List fields;
    public List innerClasses;
    public List interfaces;
    public List invisibleAnnotations;
    public List invisibleTypeAnnotations;
    public List methods;
    public String name;
    public String outerClass;
    public String outerMethod;
    public String outerMethodDesc;
    public String signature;
    public String sourceDebug;
    public String sourceFile;
    public String superName;
    public int version;
    public List visibleAnnotations;
    public List visibleTypeAnnotations;

    public ClassNode() {
        this(Opcodes.ASM5);
        if (getClass() != class$org$objectweb$asm$tree$ClassNode) {
            throw new IllegalStateException();
        }
    }

    public ClassNode(int i) {
        super(i);
        this.interfaces = new ArrayList();
        this.innerClasses = new ArrayList();
        this.fields = new ArrayList();
        this.methods = new ArrayList();
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public void accept(ClassVisitor classVisitor) {
        String[] strArr = new String[this.interfaces.size()];
        this.interfaces.toArray(strArr);
        classVisitor.visit(this.version, this.access, this.name, this.signature, this.superName, strArr);
        if (this.sourceFile != null || this.sourceDebug != null) {
            classVisitor.visitSource(this.sourceFile, this.sourceDebug);
        }
        if (this.outerClass != null) {
            classVisitor.visitOuterClass(this.outerClass, this.outerMethod, this.outerMethodDesc);
        }
        int size = this.visibleAnnotations == null ? 0 : this.visibleAnnotations.size();
        for (int i = 0; i < size; i++) {
            AnnotationNode annotationNode = (AnnotationNode) this.visibleAnnotations.get(i);
            annotationNode.accept(classVisitor.visitAnnotation(annotationNode.desc, true));
        }
        int size2 = this.invisibleAnnotations == null ? 0 : this.invisibleAnnotations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnnotationNode annotationNode2 = (AnnotationNode) this.invisibleAnnotations.get(i2);
            annotationNode2.accept(classVisitor.visitAnnotation(annotationNode2.desc, false));
        }
        int size3 = this.visibleTypeAnnotations == null ? 0 : this.visibleTypeAnnotations.size();
        for (int i3 = 0; i3 < size3; i3++) {
            TypeAnnotationNode typeAnnotationNode = (TypeAnnotationNode) this.visibleTypeAnnotations.get(i3);
            typeAnnotationNode.accept(classVisitor.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
        }
        int size4 = this.invisibleTypeAnnotations == null ? 0 : this.invisibleTypeAnnotations.size();
        for (int i4 = 0; i4 < size4; i4++) {
            TypeAnnotationNode typeAnnotationNode2 = (TypeAnnotationNode) this.invisibleTypeAnnotations.get(i4);
            typeAnnotationNode2.accept(classVisitor.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
        }
        int size5 = this.attrs == null ? 0 : this.attrs.size();
        for (int i5 = 0; i5 < size5; i5++) {
            classVisitor.visitAttribute((Attribute) this.attrs.get(i5));
        }
        for (int i6 = 0; i6 < this.innerClasses.size(); i6++) {
            ((InnerClassNode) this.innerClasses.get(i6)).accept(classVisitor);
        }
        for (int i7 = 0; i7 < this.fields.size(); i7++) {
            ((FieldNode) this.fields.get(i7)).accept(classVisitor);
        }
        for (int i8 = 0; i8 < this.methods.size(); i8++) {
            ((MethodNode) this.methods.get(i8)).accept(classVisitor);
        }
        classVisitor.visitEnd();
    }

    public void check(int i) {
        if (i == 262144) {
            if (this.visibleTypeAnnotations != null && this.visibleTypeAnnotations.size() > 0) {
                throw new RuntimeException();
            }
            if (this.invisibleTypeAnnotations != null && this.invisibleTypeAnnotations.size() > 0) {
                throw new RuntimeException();
            }
            Iterator it = this.fields.iterator();
            while (it.hasNext()) {
                ((FieldNode) it.next()).check(i);
            }
            Iterator it2 = this.methods.iterator();
            while (it2.hasNext()) {
                ((MethodNode) it2.next()).check(i);
            }
        }
    }

    @Override
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.version = i;
        this.access = i2;
        this.name = str;
        this.signature = str2;
        this.superName = str3;
        if (strArr != null) {
            this.interfaces.addAll(Arrays.asList(strArr));
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
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        FieldNode fieldNode = new FieldNode(i, str, str2, str3, obj);
        this.fields.add(fieldNode);
        return fieldNode;
    }

    @Override
    public void visitInnerClass(String str, String str2, String str3, int i) {
        this.innerClasses.add(new InnerClassNode(str, str2, str3, i));
    }

    @Override
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        MethodNode methodNode = new MethodNode(i, str, str2, str3, strArr);
        this.methods.add(methodNode);
        return methodNode;
    }

    @Override
    public void visitOuterClass(String str, String str2, String str3) {
        this.outerClass = str;
        this.outerMethod = str2;
        this.outerMethodDesc = str3;
    }

    @Override
    public void visitSource(String str, String str2) {
        this.sourceFile = str;
        this.sourceDebug = str2;
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
