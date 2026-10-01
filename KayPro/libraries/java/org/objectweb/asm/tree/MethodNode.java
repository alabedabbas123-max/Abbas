package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

public class MethodNode extends MethodVisitor {
    static Class class$org$objectweb$asm$tree$MethodNode = class$("org.objectweb.asm.tree.MethodNode");
    public int access;
    public Object annotationDefault;
    public List attrs;
    public String desc;
    public List exceptions;
    public InsnList instructions;
    public List invisibleAnnotations;
    public List invisibleLocalVariableAnnotations;
    public List[] invisibleParameterAnnotations;
    public List invisibleTypeAnnotations;
    public List localVariables;
    public int maxLocals;
    public int maxStack;
    public String name;
    public List parameters;
    public String signature;
    public List tryCatchBlocks;
    public List visibleAnnotations;
    public List visibleLocalVariableAnnotations;
    public List[] visibleParameterAnnotations;
    public List visibleTypeAnnotations;
    private boolean visited;

    public MethodNode() {
        this(Opcodes.ASM5);
        if (getClass() != class$org$objectweb$asm$tree$MethodNode) {
            throw new IllegalStateException();
        }
    }

    public MethodNode(int i) {
        super(i);
        this.instructions = new InsnList();
    }

    public MethodNode(int i, int i2, String str, String str2, String str3, String[] strArr) {
        super(i);
        this.access = i2;
        this.name = str;
        this.desc = str2;
        this.signature = str3;
        this.exceptions = new ArrayList(strArr == null ? 0 : strArr.length);
        if (!((i2 & 1024) != 0)) {
            this.localVariables = new ArrayList(5);
        }
        this.tryCatchBlocks = new ArrayList();
        if (strArr != null) {
            this.exceptions.addAll(Arrays.asList(strArr));
        }
        this.instructions = new InsnList();
    }

    public MethodNode(int i, String str, String str2, String str3, String[] strArr) {
        this(Opcodes.ASM5, i, str, str2, str3, strArr);
        if (getClass() != class$org$objectweb$asm$tree$MethodNode) {
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

    private Object[] getLabelNodes(Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= objArr.length) {
                return objArr2;
            }
            Object labelNode = objArr[i2];
            if (labelNode instanceof Label) {
                labelNode = getLabelNode((Label) labelNode);
            }
            objArr2[i2] = labelNode;
            i = i2 + 1;
        }
    }

    private LabelNode[] getLabelNodes(Label[] labelArr) {
        LabelNode[] labelNodeArr = new LabelNode[labelArr.length];
        for (int i = 0; i < labelArr.length; i++) {
            labelNodeArr[i] = getLabelNode(labelArr[i]);
        }
        return labelNodeArr;
    }

    public void accept(ClassVisitor classVisitor) {
        String[] strArr = new String[this.exceptions.size()];
        this.exceptions.toArray(strArr);
        MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(this.access, this.name, this.desc, this.signature, strArr);
        if (methodVisitorVisitMethod != null) {
            accept(methodVisitorVisitMethod);
        }
    }

    public void accept(MethodVisitor methodVisitor) {
        int size = this.parameters == null ? 0 : this.parameters.size();
        for (int i = 0; i < size; i++) {
            ParameterNode parameterNode = (ParameterNode) this.parameters.get(i);
            methodVisitor.visitParameter(parameterNode.name, parameterNode.access);
        }
        if (this.annotationDefault != null) {
            AnnotationVisitor annotationVisitorVisitAnnotationDefault = methodVisitor.visitAnnotationDefault();
            AnnotationNode.accept(annotationVisitorVisitAnnotationDefault, null, this.annotationDefault);
            if (annotationVisitorVisitAnnotationDefault != null) {
                annotationVisitorVisitAnnotationDefault.visitEnd();
            }
        }
        int size2 = this.visibleAnnotations == null ? 0 : this.visibleAnnotations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnnotationNode annotationNode = (AnnotationNode) this.visibleAnnotations.get(i2);
            annotationNode.accept(methodVisitor.visitAnnotation(annotationNode.desc, true));
        }
        int size3 = this.invisibleAnnotations == null ? 0 : this.invisibleAnnotations.size();
        for (int i3 = 0; i3 < size3; i3++) {
            AnnotationNode annotationNode2 = (AnnotationNode) this.invisibleAnnotations.get(i3);
            annotationNode2.accept(methodVisitor.visitAnnotation(annotationNode2.desc, false));
        }
        int size4 = this.visibleTypeAnnotations == null ? 0 : this.visibleTypeAnnotations.size();
        for (int i4 = 0; i4 < size4; i4++) {
            TypeAnnotationNode typeAnnotationNode = (TypeAnnotationNode) this.visibleTypeAnnotations.get(i4);
            typeAnnotationNode.accept(methodVisitor.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
        }
        int size5 = this.invisibleTypeAnnotations == null ? 0 : this.invisibleTypeAnnotations.size();
        for (int i5 = 0; i5 < size5; i5++) {
            TypeAnnotationNode typeAnnotationNode2 = (TypeAnnotationNode) this.invisibleTypeAnnotations.get(i5);
            typeAnnotationNode2.accept(methodVisitor.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
        }
        int length = this.visibleParameterAnnotations == null ? 0 : this.visibleParameterAnnotations.length;
        for (int i6 = 0; i6 < length; i6++) {
            List list = this.visibleParameterAnnotations[i6];
            if (list != null) {
                for (int i7 = 0; i7 < list.size(); i7++) {
                    AnnotationNode annotationNode3 = (AnnotationNode) list.get(i7);
                    annotationNode3.accept(methodVisitor.visitParameterAnnotation(i6, annotationNode3.desc, true));
                }
            }
        }
        int length2 = this.invisibleParameterAnnotations == null ? 0 : this.invisibleParameterAnnotations.length;
        for (int i8 = 0; i8 < length2; i8++) {
            List list2 = this.invisibleParameterAnnotations[i8];
            if (list2 != null) {
                for (int i9 = 0; i9 < list2.size(); i9++) {
                    AnnotationNode annotationNode4 = (AnnotationNode) list2.get(i9);
                    annotationNode4.accept(methodVisitor.visitParameterAnnotation(i8, annotationNode4.desc, false));
                }
            }
        }
        if (this.visited) {
            this.instructions.resetLabels();
        }
        int size6 = this.attrs == null ? 0 : this.attrs.size();
        for (int i10 = 0; i10 < size6; i10++) {
            methodVisitor.visitAttribute((Attribute) this.attrs.get(i10));
        }
        if (this.instructions.size() > 0) {
            methodVisitor.visitCode();
            int size7 = this.tryCatchBlocks == null ? 0 : this.tryCatchBlocks.size();
            for (int i11 = 0; i11 < size7; i11++) {
                ((TryCatchBlockNode) this.tryCatchBlocks.get(i11)).updateIndex(i11);
                ((TryCatchBlockNode) this.tryCatchBlocks.get(i11)).accept(methodVisitor);
            }
            this.instructions.accept(methodVisitor);
            int size8 = this.localVariables == null ? 0 : this.localVariables.size();
            for (int i12 = 0; i12 < size8; i12++) {
                ((LocalVariableNode) this.localVariables.get(i12)).accept(methodVisitor);
            }
            int size9 = this.visibleLocalVariableAnnotations == null ? 0 : this.visibleLocalVariableAnnotations.size();
            for (int i13 = 0; i13 < size9; i13++) {
                ((LocalVariableAnnotationNode) this.visibleLocalVariableAnnotations.get(i13)).accept(methodVisitor, true);
            }
            int size10 = this.invisibleLocalVariableAnnotations == null ? 0 : this.invisibleLocalVariableAnnotations.size();
            for (int i14 = 0; i14 < size10; i14++) {
                ((LocalVariableAnnotationNode) this.invisibleLocalVariableAnnotations.get(i14)).accept(methodVisitor, false);
            }
            methodVisitor.visitMaxs(this.maxStack, this.maxLocals);
            this.visited = true;
        }
        methodVisitor.visitEnd();
    }

    public void check(int i) {
        if (i == 262144) {
            if (this.visibleTypeAnnotations != null && this.visibleTypeAnnotations.size() > 0) {
                throw new RuntimeException();
            }
            if (this.invisibleTypeAnnotations != null && this.invisibleTypeAnnotations.size() > 0) {
                throw new RuntimeException();
            }
            int size = this.tryCatchBlocks == null ? 0 : this.tryCatchBlocks.size();
            for (int i2 = 0; i2 < size; i2++) {
                TryCatchBlockNode tryCatchBlockNode = (TryCatchBlockNode) this.tryCatchBlocks.get(i2);
                if (tryCatchBlockNode.visibleTypeAnnotations != null && tryCatchBlockNode.visibleTypeAnnotations.size() > 0) {
                    throw new RuntimeException();
                }
                if (tryCatchBlockNode.invisibleTypeAnnotations != null && tryCatchBlockNode.invisibleTypeAnnotations.size() > 0) {
                    throw new RuntimeException();
                }
            }
            for (int i3 = 0; i3 < this.instructions.size(); i3++) {
                AbstractInsnNode abstractInsnNodeM9027get = this.instructions.m9027get(i3);
                if (abstractInsnNodeM9027get.visibleTypeAnnotations != null && abstractInsnNodeM9027get.visibleTypeAnnotations.size() > 0) {
                    throw new RuntimeException();
                }
                if (abstractInsnNodeM9027get.invisibleTypeAnnotations != null && abstractInsnNodeM9027get.invisibleTypeAnnotations.size() > 0) {
                    throw new RuntimeException();
                }
                if (abstractInsnNodeM9027get instanceof MethodInsnNode) {
                    if (((MethodInsnNode) abstractInsnNodeM9027get).f6682itf != (abstractInsnNodeM9027get.opcode == 185)) {
                        throw new RuntimeException();
                    }
                }
            }
            if (this.visibleLocalVariableAnnotations != null && this.visibleLocalVariableAnnotations.size() > 0) {
                throw new RuntimeException();
            }
            if (this.invisibleLocalVariableAnnotations != null && this.invisibleLocalVariableAnnotations.size() > 0) {
                throw new RuntimeException();
            }
        }
    }

    protected LabelNode getLabelNode(Label label) {
        if (!(label.info instanceof LabelNode)) {
            label.info = new LabelNode();
        }
        return (LabelNode) label.info;
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
    public AnnotationVisitor visitAnnotationDefault() {
        return new AnnotationNode(new ArrayList(this, 0) {
            final MethodNode this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean add(Object obj) {
                this.this$0.annotationDefault = obj;
                return super.add(obj);
            }
        });
    }

    @Override
    public void visitAttribute(Attribute attribute) {
        if (this.attrs == null) {
            this.attrs = new ArrayList(1);
        }
        this.attrs.add(attribute);
    }

    @Override
    public void visitCode() {
    }

    @Override
    public void visitEnd() {
    }

    @Override
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        this.instructions.m9025add(new FieldInsnNode(i, str, str2, str3));
    }

    @Override
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        this.instructions.m9025add(new FrameNode(i, i2, objArr == null ? null : getLabelNodes(objArr), i3, objArr2 != null ? getLabelNodes(objArr2) : null));
    }

    @Override
    public void visitIincInsn(int i, int i2) {
        this.instructions.m9025add(new IincInsnNode(i, i2));
    }

    @Override
    public void visitInsn(int i) {
        this.instructions.m9025add(new InsnNode(i));
    }

    @Override
    public AnnotationVisitor visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        AbstractInsnNode last = this.instructions.getLast();
        while (last.getOpcode() == -1) {
            last = last.getPrevious();
        }
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i, typePath, str);
        if (z) {
            if (last.visibleTypeAnnotations == null) {
                last.visibleTypeAnnotations = new ArrayList(1);
            }
            last.visibleTypeAnnotations.add(typeAnnotationNode);
        } else {
            if (last.invisibleTypeAnnotations == null) {
                last.invisibleTypeAnnotations = new ArrayList(1);
            }
            last.invisibleTypeAnnotations.add(typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    @Override
    public void visitIntInsn(int i, int i2) {
        this.instructions.m9025add(new IntInsnNode(i, i2));
    }

    @Override
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.instructions.m9025add(new InvokeDynamicInsnNode(str, str2, handle, objArr));
    }

    @Override
    public void visitJumpInsn(int i, Label label) {
        this.instructions.m9025add(new JumpInsnNode(i, getLabelNode(label)));
    }

    @Override
    public void visitLabel(Label label) {
        this.instructions.m9025add(getLabelNode(label));
    }

    @Override
    public void visitLdcInsn(Object obj) {
        this.instructions.m9025add(new LdcInsnNode(obj));
    }

    @Override
    public void visitLineNumber(int i, Label label) {
        this.instructions.m9025add(new LineNumberNode(i, getLabelNode(label)));
    }

    @Override
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        this.localVariables.add(new LocalVariableNode(str, str2, str3, getLabelNode(label), getLabelNode(label2), i));
    }

    @Override
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        LocalVariableAnnotationNode localVariableAnnotationNode = new LocalVariableAnnotationNode(i, typePath, getLabelNodes(labelArr), getLabelNodes(labelArr2), iArr, str);
        if (z) {
            if (this.visibleLocalVariableAnnotations == null) {
                this.visibleLocalVariableAnnotations = new ArrayList(1);
            }
            this.visibleLocalVariableAnnotations.add(localVariableAnnotationNode);
        } else {
            if (this.invisibleLocalVariableAnnotations == null) {
                this.invisibleLocalVariableAnnotations = new ArrayList(1);
            }
            this.invisibleLocalVariableAnnotations.add(localVariableAnnotationNode);
        }
        return localVariableAnnotationNode;
    }

    @Override
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.instructions.m9025add(new LookupSwitchInsnNode(getLabelNode(label), iArr, getLabelNodes(labelArr)));
    }

    @Override
    public void visitMaxs(int i, int i2) {
        this.maxStack = i;
        this.maxLocals = i2;
    }

    @Override
    public void visitMethodInsn(int i, String str, String str2, String str3) {
        if (this.f6562api >= 327680) {
            super.visitMethodInsn(i, str, str2, str3);
        } else {
            this.instructions.m9025add(new MethodInsnNode(i, str, str2, str3));
        }
    }

    @Override
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.f6562api < 327680) {
            super.visitMethodInsn(i, str, str2, str3, z);
        } else {
            this.instructions.m9025add(new MethodInsnNode(i, str, str2, str3, z));
        }
    }

    @Override
    public void visitMultiANewArrayInsn(String str, int i) {
        this.instructions.m9025add(new MultiANewArrayInsnNode(str, i));
    }

    @Override
    public void visitParameter(String str, int i) {
        if (this.parameters == null) {
            this.parameters = new ArrayList(5);
        }
        this.parameters.add(new ParameterNode(str, i));
    }

    @Override
    public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
        AnnotationNode annotationNode = new AnnotationNode(str);
        if (z) {
            if (this.visibleParameterAnnotations == null) {
                this.visibleParameterAnnotations = new List[Type.getArgumentTypes(this.desc).length];
            }
            if (this.visibleParameterAnnotations[i] == null) {
                this.visibleParameterAnnotations[i] = new ArrayList(1);
            }
            this.visibleParameterAnnotations[i].add(annotationNode);
        } else {
            if (this.invisibleParameterAnnotations == null) {
                this.invisibleParameterAnnotations = new List[Type.getArgumentTypes(this.desc).length];
            }
            if (this.invisibleParameterAnnotations[i] == null) {
                this.invisibleParameterAnnotations[i] = new ArrayList(1);
            }
            this.invisibleParameterAnnotations[i].add(annotationNode);
        }
        return annotationNode;
    }

    @Override
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        this.instructions.m9025add(new TableSwitchInsnNode(i, i2, getLabelNode(label), getLabelNodes(labelArr)));
    }

    @Override
    public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        TryCatchBlockNode tryCatchBlockNode = (TryCatchBlockNode) this.tryCatchBlocks.get((16776960 & i) >> 8);
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i, typePath, str);
        if (z) {
            if (tryCatchBlockNode.visibleTypeAnnotations == null) {
                tryCatchBlockNode.visibleTypeAnnotations = new ArrayList(1);
            }
            tryCatchBlockNode.visibleTypeAnnotations.add(typeAnnotationNode);
        } else {
            if (tryCatchBlockNode.invisibleTypeAnnotations == null) {
                tryCatchBlockNode.invisibleTypeAnnotations = new ArrayList(1);
            }
            tryCatchBlockNode.invisibleTypeAnnotations.add(typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    @Override
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.tryCatchBlocks.add(new TryCatchBlockNode(getLabelNode(label), getLabelNode(label2), getLabelNode(label3), str));
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

    @Override
    public void visitTypeInsn(int i, String str) {
        this.instructions.m9025add(new TypeInsnNode(i, str));
    }

    @Override
    public void visitVarInsn(int i, int i2) {
        this.instructions.m9025add(new VarInsnNode(i, i2));
    }
}
