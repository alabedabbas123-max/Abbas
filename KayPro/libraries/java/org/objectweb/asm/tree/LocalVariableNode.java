package org.objectweb.asm.tree;

import org.objectweb.asm.MethodVisitor;

public class LocalVariableNode {
    public String desc;

    public LabelNode f6681end;
    public int index;
    public String name;
    public String signature;
    public LabelNode start;

    public LocalVariableNode(String str, String str2, String str3, LabelNode labelNode, LabelNode labelNode2, int i) {
        this.name = str;
        this.desc = str2;
        this.signature = str3;
        this.start = labelNode;
        this.f6681end = labelNode2;
        this.index = i;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitLocalVariable(this.name, this.desc, this.signature, this.start.getLabel(), this.f6681end.getLabel(), this.index);
    }
}
