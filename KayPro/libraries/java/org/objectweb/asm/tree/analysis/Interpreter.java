package org.objectweb.asm.tree.analysis;

import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;

public abstract class Interpreter {

    protected final int f6690api;

    protected Interpreter(int i) {
        this.f6690api = i;
    }

    public abstract Value binaryOperation(AbstractInsnNode abstractInsnNode, Value value, Value value2) throws AnalyzerException;

    public abstract Value copyOperation(AbstractInsnNode abstractInsnNode, Value value) throws AnalyzerException;

    public abstract Value merge(Value value, Value value2);

    public abstract Value naryOperation(AbstractInsnNode abstractInsnNode, List list) throws AnalyzerException;

    public abstract Value newOperation(AbstractInsnNode abstractInsnNode) throws AnalyzerException;

    public abstract Value newValue(Type type);

    public abstract void returnOperation(AbstractInsnNode abstractInsnNode, Value value, Value value2) throws AnalyzerException;

    public abstract Value ternaryOperation(AbstractInsnNode abstractInsnNode, Value value, Value value2, Value value3) throws AnalyzerException;

    public abstract Value unaryOperation(AbstractInsnNode abstractInsnNode, Value value) throws AnalyzerException;
}
