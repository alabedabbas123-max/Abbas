package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public abstract class AbstractInsnNode {
    public static final int FIELD_INSN = 4;
    public static final int FRAME = 14;
    public static final int IINC_INSN = 10;
    public static final int INSN = 0;
    public static final int INT_INSN = 1;
    public static final int INVOKE_DYNAMIC_INSN = 6;
    public static final int JUMP_INSN = 7;
    public static final int LABEL = 8;
    public static final int LDC_INSN = 9;
    public static final int LINE = 15;
    public static final int LOOKUPSWITCH_INSN = 12;
    public static final int METHOD_INSN = 5;
    public static final int MULTIANEWARRAY_INSN = 13;
    public static final int TABLESWITCH_INSN = 11;
    public static final int TYPE_INSN = 3;
    public static final int VAR_INSN = 2;
    int index = -1;
    public List invisibleTypeAnnotations;
    AbstractInsnNode next;
    protected int opcode;
    AbstractInsnNode prev;
    public List visibleTypeAnnotations;

    protected AbstractInsnNode(int i) {
        this.opcode = i;
    }

    static LabelNode clone(LabelNode labelNode, Map map) {
        return (LabelNode) map.get(labelNode);
    }

    static LabelNode[] clone(List list, Map map) {
        LabelNode[] labelNodeArr = new LabelNode[list.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= labelNodeArr.length) {
                return labelNodeArr;
            }
            labelNodeArr[i2] = (LabelNode) map.get(list.get(i2));
            i = i2 + 1;
        }
    }

    public abstract void accept(MethodVisitor methodVisitor);

    protected final void acceptAnnotations(MethodVisitor methodVisitor) {
        int size = this.visibleTypeAnnotations == null ? 0 : this.visibleTypeAnnotations.size();
        for (int i = 0; i < size; i++) {
            TypeAnnotationNode typeAnnotationNode = (TypeAnnotationNode) this.visibleTypeAnnotations.get(i);
            typeAnnotationNode.accept(methodVisitor.visitInsnAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
        }
        int size2 = this.invisibleTypeAnnotations == null ? 0 : this.invisibleTypeAnnotations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            TypeAnnotationNode typeAnnotationNode2 = (TypeAnnotationNode) this.invisibleTypeAnnotations.get(i2);
            typeAnnotationNode2.accept(methodVisitor.visitInsnAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
        }
    }

    public abstract AbstractInsnNode clone(Map map);

    protected final AbstractInsnNode cloneAnnotations(AbstractInsnNode abstractInsnNode) {
        if (abstractInsnNode.visibleTypeAnnotations != null) {
            this.visibleTypeAnnotations = new ArrayList();
            for (int i = 0; i < abstractInsnNode.visibleTypeAnnotations.size(); i++) {
                TypeAnnotationNode typeAnnotationNode = (TypeAnnotationNode) abstractInsnNode.visibleTypeAnnotations.get(i);
                TypeAnnotationNode typeAnnotationNode2 = new TypeAnnotationNode(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc);
                typeAnnotationNode.accept(typeAnnotationNode2);
                this.visibleTypeAnnotations.add(typeAnnotationNode2);
            }
        }
        if (abstractInsnNode.invisibleTypeAnnotations != null) {
            this.invisibleTypeAnnotations = new ArrayList();
            for (int i2 = 0; i2 < abstractInsnNode.invisibleTypeAnnotations.size(); i2++) {
                TypeAnnotationNode typeAnnotationNode3 = (TypeAnnotationNode) abstractInsnNode.invisibleTypeAnnotations.get(i2);
                TypeAnnotationNode typeAnnotationNode4 = new TypeAnnotationNode(typeAnnotationNode3.typeRef, typeAnnotationNode3.typePath, typeAnnotationNode3.desc);
                typeAnnotationNode3.accept(typeAnnotationNode4);
                this.invisibleTypeAnnotations.add(typeAnnotationNode4);
            }
        }
        return this;
    }

    public AbstractInsnNode getNext() {
        return this.next;
    }

    public int getOpcode() {
        return this.opcode;
    }

    public AbstractInsnNode getPrevious() {
        return this.prev;
    }

    public abstract int getType();
}
