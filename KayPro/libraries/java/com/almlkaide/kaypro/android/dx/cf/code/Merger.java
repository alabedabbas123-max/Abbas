package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class Merger {
    Merger() {
    }

    public static OneLocalsArray mergeLocals(OneLocalsArray oneLocalsArray, OneLocalsArray oneLocalsArray2) {
        if (oneLocalsArray != oneLocalsArray2) {
            int maxLocals = oneLocalsArray.getMaxLocals();
            OneLocalsArray oneLocalsArrayCopy = (OneLocalsArray) null;
            if (oneLocalsArray2.getMaxLocals() != maxLocals) {
                throw new SimException("mismatched maxLocals values");
            }
            for (int i = 0; i < maxLocals; i++) {
                TypeBearer orNull = oneLocalsArray.getOrNull(i);
                TypeBearer typeBearerMergeType = mergeType(orNull, oneLocalsArray2.getOrNull(i));
                if (typeBearerMergeType != orNull) {
                    if (oneLocalsArrayCopy == null) {
                        oneLocalsArrayCopy = oneLocalsArray.copy();
                    }
                    if (typeBearerMergeType == null) {
                        oneLocalsArrayCopy.invalidate(i);
                    } else {
                        oneLocalsArrayCopy.mo7133set(i, typeBearerMergeType);
                    }
                }
            }
            if (oneLocalsArrayCopy != null) {
                oneLocalsArrayCopy.setImmutable();
                return oneLocalsArrayCopy;
            }
            return oneLocalsArray;
        }
        return oneLocalsArray;
    }

    public static ExecutionStack mergeStack(ExecutionStack executionStack, ExecutionStack executionStack2) {
        if (executionStack != executionStack2) {
            int size = executionStack.size();
            ExecutionStack executionStackCopy = (ExecutionStack) null;
            if (executionStack2.size() != size) {
                throw new SimException("mismatched stack depths");
            }
            for (int i = 0; i < size; i++) {
                TypeBearer typeBearerPeek = executionStack.peek(i);
                TypeBearer typeBearerPeek2 = executionStack2.peek(i);
                TypeBearer typeBearerMergeType = mergeType(typeBearerPeek, typeBearerPeek2);
                if (typeBearerMergeType != typeBearerPeek) {
                    if (executionStackCopy == null) {
                        executionStackCopy = executionStack.copy();
                    }
                    if (typeBearerMergeType == null) {
                        throw new SimException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("incompatible: ").append(typeBearerPeek).toString()).append(", ").toString()).append(typeBearerPeek2).toString());
                    }
                    try {
                        executionStackCopy.change(i, typeBearerMergeType);
                    } catch (SimException e) {
                        e.addContext(new StringBuffer().append(new StringBuffer().append("...while merging stack[").append(Hex.m7225u2(i)).toString()).append("]").toString());
                        throw e;
                    }
                    e.addContext(new StringBuffer().append(new StringBuffer().append("...while merging stack[").append(Hex.m7225u2(i)).toString()).append("]").toString());
                    throw e;
                }
            }
            if (executionStackCopy != null) {
                executionStackCopy.setImmutable();
                return executionStackCopy;
            }
            return executionStack;
        }
        return executionStack;
    }

    public static TypeBearer mergeType(TypeBearer typeBearer, TypeBearer typeBearer2) {
        if (typeBearer == null || typeBearer.equals(typeBearer2)) {
            return typeBearer;
        }
        if (typeBearer2 == null) {
            return (TypeBearer) null;
        }
        Type type = typeBearer.getType();
        Type type2 = typeBearer2.getType();
        if (type == type2) {
            return type;
        }
        if (type.isReference() && type2.isReference()) {
            if (type == Type.KNOWN_NULL) {
                return type2;
            }
            if (type2 == Type.KNOWN_NULL) {
                return type;
            }
            if (type.isArray() && type2.isArray()) {
                TypeBearer typeBearerMergeType = mergeType(type.getComponentType(), type2.getComponentType());
                if (typeBearerMergeType == null) {
                    return Type.OBJECT;
                }
                return ((Type) typeBearerMergeType).getArrayType();
            }
            return Type.OBJECT;
        }
        if (type.isIntlike() && type2.isIntlike()) {
            return Type.f5078INT;
        }
        return (TypeBearer) null;
    }

    public static boolean isPossiblyAssignableFrom(TypeBearer typeBearer, TypeBearer typeBearer2) {
        Type type = typeBearer.getType();
        Type type2 = typeBearer2.getType();
        if (type.equals(type2)) {
            return true;
        }
        int basicType = type.getBasicType();
        int basicType2 = type2.getBasicType();
        if (basicType == 10) {
            type = Type.OBJECT;
            basicType = 9;
        }
        if (basicType2 == 10) {
            type2 = Type.OBJECT;
            basicType2 = 9;
        }
        if (basicType != 9 || basicType2 != 9) {
            return type.isIntlike() && type2.isIntlike();
        }
        if (type == Type.KNOWN_NULL) {
            return false;
        }
        if (type2 == Type.KNOWN_NULL || type == Type.OBJECT) {
            return true;
        }
        if (type.isArray()) {
            if (!type2.isArray()) {
                return false;
            }
            Type componentType = type2;
            Type componentType2 = type;
            do {
                componentType2 = componentType2.getComponentType();
                componentType = componentType.getComponentType();
                if (!componentType2.isArray()) {
                    break;
                }
            } while (componentType.isArray());
            return isPossiblyAssignableFrom(componentType2, componentType);
        }
        if (type2.isArray()) {
            return type == Type.SERIALIZABLE || type == Type.CLONEABLE;
        }
        return true;
    }
}
