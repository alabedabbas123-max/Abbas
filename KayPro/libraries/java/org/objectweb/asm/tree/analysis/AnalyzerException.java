package org.objectweb.asm.tree.analysis;

import org.objectweb.asm.tree.AbstractInsnNode;

public class AnalyzerException extends Exception {
    public final AbstractInsnNode node;

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str) {
        super(str);
        this.node = abstractInsnNode;
    }

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str, Object obj, Value value) {
        super(new StringBuffer().append(str == null ? "Expected " : new StringBuffer().append(str).append(": expected ").toString()).append(obj).append(", but found ").append(value).toString());
        this.node = abstractInsnNode;
    }

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str, Throwable th) {
        super(str, th);
        this.node = abstractInsnNode;
    }
}
