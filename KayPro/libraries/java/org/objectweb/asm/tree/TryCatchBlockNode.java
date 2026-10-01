package org.objectweb.asm.tree;

import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.MethodVisitor;

public class TryCatchBlockNode {

    public LabelNode f6685end;
    public LabelNode handler;
    public List invisibleTypeAnnotations;
    public LabelNode start;
    public String type;
    public List visibleTypeAnnotations;

    public TryCatchBlockNode(LabelNode labelNode, LabelNode labelNode2, LabelNode labelNode3, String str) {
        this.start = labelNode;
        this.f6685end = labelNode2;
        this.handler = labelNode3;
        this.type = str;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitTryCatchBlock(this.start.getLabel(), this.f6685end.getLabel(), this.handler == null ? null : this.handler.getLabel(), this.type);
        int size = this.visibleTypeAnnotations == null ? 0 : this.visibleTypeAnnotations.size();
        for (int i = 0; i < size; i++) {
            TypeAnnotationNode typeAnnotationNode = (TypeAnnotationNode) this.visibleTypeAnnotations.get(i);
            typeAnnotationNode.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
        }
        int size2 = this.invisibleTypeAnnotations == null ? 0 : this.invisibleTypeAnnotations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            TypeAnnotationNode typeAnnotationNode2 = (TypeAnnotationNode) this.invisibleTypeAnnotations.get(i2);
            typeAnnotationNode2.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
        }
    }

    public void updateIndex(int i) {
        int i2 = (i << 8) | 1107296256;
        if (this.visibleTypeAnnotations != null) {
            Iterator it = this.visibleTypeAnnotations.iterator();
            while (it.hasNext()) {
                ((TypeAnnotationNode) it.next()).typeRef = i2;
            }
        }
        if (this.invisibleTypeAnnotations != null) {
            Iterator it2 = this.invisibleTypeAnnotations.iterator();
            while (it2.hasNext()) {
                ((TypeAnnotationNode) it2.next()).typeRef = i2;
            }
        }
    }
}
