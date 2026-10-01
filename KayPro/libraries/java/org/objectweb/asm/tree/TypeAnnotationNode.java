package org.objectweb.asm.tree;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypePath;

public class TypeAnnotationNode extends AnnotationNode {
    static Class class$org$objectweb$asm$tree$TypeAnnotationNode = class$("org.objectweb.asm.tree.TypeAnnotationNode");
    public TypePath typePath;
    public int typeRef;

    public TypeAnnotationNode(int i, int i2, TypePath typePath, String str) {
        super(i, str);
        this.typeRef = i2;
        this.typePath = typePath;
    }

    public TypeAnnotationNode(int i, TypePath typePath, String str) {
        this(Opcodes.ASM5, i, typePath, str);
        if (getClass() != class$org$objectweb$asm$tree$TypeAnnotationNode) {
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
}
