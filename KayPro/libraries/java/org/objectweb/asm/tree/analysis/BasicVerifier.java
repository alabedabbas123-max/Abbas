package org.objectweb.asm.tree.analysis;

import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

public class BasicVerifier extends BasicInterpreter {
    public BasicVerifier() {
        super(Opcodes.ASM5);
    }

    protected BasicVerifier(int i) {
        super(i);
    }

    @Override
    public BasicValue binaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
        BasicValue basicValueNewValue;
        BasicValue basicValueNewValue2;
        switch (abstractInsnNode.getOpcode()) {
            case 46:
                basicValueNewValue = newValue(Type.getType("[I"));
                basicValueNewValue2 = BasicValue.INT_VALUE;
                break;
            case 47:
                basicValueNewValue = newValue(Type.getType("[J"));
                basicValueNewValue2 = BasicValue.INT_VALUE;
                break;
            case 48:
                basicValueNewValue = newValue(Type.getType("[F"));
                basicValueNewValue2 = BasicValue.INT_VALUE;
                break;
            case 49:
                basicValueNewValue = newValue(Type.getType("[D"));
                basicValueNewValue2 = BasicValue.INT_VALUE;
                break;
            case 50:
                basicValueNewValue = newValue(Type.getType("[Ljava/lang/Object;"));
                basicValueNewValue2 = BasicValue.INT_VALUE;
                break;
            case 51:
                basicValueNewValue = isSubTypeOf(basicValue, newValue(Type.getType("[Z"))) ? newValue(Type.getType("[Z")) : newValue(Type.getType("[B"));
                basicValueNewValue2 = BasicValue.INT_VALUE;
                break;
            case 52:
                basicValueNewValue = newValue(Type.getType("[C"));
                basicValueNewValue2 = BasicValue.INT_VALUE;
                break;
            case 53:
                basicValueNewValue = newValue(Type.getType("[S"));
                basicValueNewValue2 = BasicValue.INT_VALUE;
                break;
            case 96:
            case 100:
            case 104:
            case 108:
            case 112:
            case 120:
            case 122:
            case 124:
            case 126:
            case 128:
            case 130:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
                basicValueNewValue = BasicValue.INT_VALUE;
                basicValueNewValue2 = BasicValue.INT_VALUE;
                break;
            case 97:
            case 101:
            case 105:
            case 109:
            case 113:
            case 127:
            case 129:
            case 131:
            case 148:
                basicValueNewValue = BasicValue.LONG_VALUE;
                basicValueNewValue2 = BasicValue.LONG_VALUE;
                break;
            case 98:
            case 102:
            case 106:
            case 110:
            case 114:
            case 149:
            case 150:
                basicValueNewValue = BasicValue.FLOAT_VALUE;
                basicValueNewValue2 = BasicValue.FLOAT_VALUE;
                break;
            case 99:
            case 103:
            case 107:
            case 111:
            case 115:
            case 151:
            case 152:
                basicValueNewValue = BasicValue.DOUBLE_VALUE;
                basicValueNewValue2 = BasicValue.DOUBLE_VALUE;
                break;
            case 121:
            case 123:
            case 125:
                basicValueNewValue = BasicValue.LONG_VALUE;
                basicValueNewValue2 = BasicValue.INT_VALUE;
                break;
            case 165:
            case 166:
                basicValueNewValue = BasicValue.REFERENCE_VALUE;
                basicValueNewValue2 = BasicValue.REFERENCE_VALUE;
                break;
            case 181:
                FieldInsnNode fieldInsnNode = (FieldInsnNode) abstractInsnNode;
                basicValueNewValue = newValue(Type.getObjectType(fieldInsnNode.owner));
                basicValueNewValue2 = newValue(Type.getType(fieldInsnNode.desc));
                break;
            default:
                throw new Error("Internal error.");
        }
        if (!isSubTypeOf(basicValue, basicValueNewValue)) {
            throw new AnalyzerException(abstractInsnNode, "First argument", basicValueNewValue, basicValue);
        }
        if (isSubTypeOf(basicValue2, basicValueNewValue2)) {
            return abstractInsnNode.getOpcode() == 50 ? getElementValue(basicValue) : super.binaryOperation(abstractInsnNode, basicValue, basicValue2);
        }
        throw new AnalyzerException(abstractInsnNode, "Second argument", basicValueNewValue2, basicValue2);
    }

    @Override
    public Value binaryOperation(AbstractInsnNode abstractInsnNode, Value value, Value value2) throws AnalyzerException {
        return binaryOperation(abstractInsnNode, (BasicValue) value, (BasicValue) value2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override
    public BasicValue copyOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        BasicValue basicValue2;
        switch (abstractInsnNode.getOpcode()) {
            case 21:
            case 54:
                basicValue2 = BasicValue.INT_VALUE;
                break;
            case 22:
            case 55:
                basicValue2 = BasicValue.LONG_VALUE;
                break;
            case 23:
            case 56:
                basicValue2 = BasicValue.FLOAT_VALUE;
                break;
            case 24:
            case 57:
                basicValue2 = BasicValue.DOUBLE_VALUE;
                break;
            case 25:
                if (!basicValue.isReference()) {
                    throw new AnalyzerException(abstractInsnNode, null, "an object reference", basicValue);
                }
                return basicValue;
            case 58:
                if (!basicValue.isReference() && !BasicValue.RETURNADDRESS_VALUE.equals(basicValue)) {
                    throw new AnalyzerException(abstractInsnNode, null, "an object reference or a return address", basicValue);
                }
                return basicValue;
            default:
                return basicValue;
        }
        if (!basicValue2.equals(basicValue)) {
            throw new AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
        }
        return basicValue;
    }

    @Override
    public Value copyOperation(AbstractInsnNode abstractInsnNode, Value value) throws AnalyzerException {
        return copyOperation(abstractInsnNode, (BasicValue) value);
    }

    protected BasicValue getElementValue(BasicValue basicValue) throws AnalyzerException {
        return BasicValue.REFERENCE_VALUE;
    }

    protected boolean isArrayValue(BasicValue basicValue) {
        return basicValue.isReference();
    }

    protected boolean isSubTypeOf(BasicValue basicValue, BasicValue basicValue2) {
        return basicValue.equals(basicValue2);
    }

    @Override
    public BasicValue naryOperation(AbstractInsnNode abstractInsnNode, List list) throws AnalyzerException {
        int i;
        int i2 = 0;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (!BasicValue.INT_VALUE.equals(list.get(i3))) {
                    throw new AnalyzerException(abstractInsnNode, null, BasicValue.INT_VALUE, (Value) list.get(i3));
                }
            }
        } else {
            if (opcode == 184 || opcode == 186) {
                i = 0;
            } else {
                Type objectType = Type.getObjectType(((MethodInsnNode) abstractInsnNode).owner);
                i = 1;
                if (!isSubTypeOf((BasicValue) list.get(0), newValue(objectType))) {
                    throw new AnalyzerException(abstractInsnNode, "Method owner", newValue(objectType), (Value) list.get(0));
                }
            }
            Type[] argumentTypes = Type.getArgumentTypes(opcode == 186 ? ((InvokeDynamicInsnNode) abstractInsnNode).desc : ((MethodInsnNode) abstractInsnNode).desc);
            int i4 = i;
            while (i4 < list.size()) {
                int i5 = i2 + 1;
                BasicValue basicValueNewValue = newValue(argumentTypes[i2]);
                int i6 = i4 + 1;
                BasicValue basicValue = (BasicValue) list.get(i4);
                if (!isSubTypeOf(basicValue, basicValueNewValue)) {
                    throw new AnalyzerException(abstractInsnNode, new StringBuffer().append("Argument ").append(i5).toString(), basicValueNewValue, basicValue);
                }
                i2 = i5;
                i4 = i6;
            }
        }
        return super.naryOperation(abstractInsnNode, list);
    }

    @Override
    public Value naryOperation(AbstractInsnNode abstractInsnNode, List list) throws AnalyzerException {
        return naryOperation(abstractInsnNode, list);
    }

    @Override
    public void returnOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
        if (!isSubTypeOf(basicValue, basicValue2)) {
            throw new AnalyzerException(abstractInsnNode, "Incompatible return type", basicValue2, basicValue);
        }
    }

    @Override
    public void returnOperation(AbstractInsnNode abstractInsnNode, Value value, Value value2) throws AnalyzerException {
        returnOperation(abstractInsnNode, (BasicValue) value, (BasicValue) value2);
    }

    @Override
    public BasicValue ternaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2, BasicValue basicValue3) throws AnalyzerException {
        BasicValue basicValue4;
        BasicValue basicValueNewValue;
        switch (abstractInsnNode.getOpcode()) {
            case 79:
                basicValueNewValue = newValue(Type.getType("[I"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            case 80:
                basicValueNewValue = newValue(Type.getType("[J"));
                basicValue4 = BasicValue.LONG_VALUE;
                break;
            case 81:
                basicValueNewValue = newValue(Type.getType("[F"));
                basicValue4 = BasicValue.FLOAT_VALUE;
                break;
            case 82:
                basicValueNewValue = newValue(Type.getType("[D"));
                basicValue4 = BasicValue.DOUBLE_VALUE;
                break;
            case 83:
                basicValue4 = BasicValue.REFERENCE_VALUE;
                basicValueNewValue = basicValue;
                break;
            case 84:
                basicValueNewValue = isSubTypeOf(basicValue, newValue(Type.getType("[Z"))) ? newValue(Type.getType("[Z")) : newValue(Type.getType("[B"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            case 85:
                basicValueNewValue = newValue(Type.getType("[C"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            case 86:
                basicValueNewValue = newValue(Type.getType("[S"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            default:
                throw new Error("Internal error.");
        }
        if (!isSubTypeOf(basicValue, basicValueNewValue)) {
            throw new AnalyzerException(abstractInsnNode, "First argument", new StringBuffer().append("a ").append(basicValueNewValue).append(" array reference").toString(), basicValue);
        }
        if (!BasicValue.INT_VALUE.equals(basicValue2)) {
            throw new AnalyzerException(abstractInsnNode, "Second argument", BasicValue.INT_VALUE, basicValue2);
        }
        if (isSubTypeOf(basicValue3, basicValue4)) {
            return null;
        }
        throw new AnalyzerException(abstractInsnNode, "Third argument", basicValue4, basicValue3);
    }

    @Override
    public Value ternaryOperation(AbstractInsnNode abstractInsnNode, Value value, Value value2, Value value3) throws AnalyzerException {
        return ternaryOperation(abstractInsnNode, (BasicValue) value, (BasicValue) value2, (BasicValue) value3);
    }

    @Override
    public BasicValue unaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        BasicValue basicValueNewValue;
        switch (abstractInsnNode.getOpcode()) {
            case 116:
            case 132:
            case 133:
            case 134:
            case 135:
            case 145:
            case 146:
            case 147:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 170:
            case 171:
            case 172:
            case 188:
            case 189:
                basicValueNewValue = BasicValue.INT_VALUE;
                break;
            case 117:
            case 136:
            case 137:
            case 138:
            case 173:
                basicValueNewValue = BasicValue.LONG_VALUE;
                break;
            case 118:
            case 139:
            case 140:
            case 141:
            case 174:
                basicValueNewValue = BasicValue.FLOAT_VALUE;
                break;
            case 119:
            case 142:
            case 143:
            case 144:
            case 175:
                basicValueNewValue = BasicValue.DOUBLE_VALUE;
                break;
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 177:
            case 178:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 196:
            case 197:
            default:
                throw new Error("Internal error.");
            case 176:
            case 191:
            case 193:
            case 194:
            case 195:
            case 198:
            case 199:
                if (basicValue.isReference()) {
                    return super.unaryOperation(abstractInsnNode, basicValue);
                }
                throw new AnalyzerException(abstractInsnNode, null, "an object reference", basicValue);
            case 179:
                basicValueNewValue = newValue(Type.getType(((FieldInsnNode) abstractInsnNode).desc));
                break;
            case 180:
                basicValueNewValue = newValue(Type.getObjectType(((FieldInsnNode) abstractInsnNode).owner));
                break;
            case 190:
                if (isArrayValue(basicValue)) {
                    return super.unaryOperation(abstractInsnNode, basicValue);
                }
                throw new AnalyzerException(abstractInsnNode, null, "an array reference", basicValue);
            case 192:
                if (basicValue.isReference()) {
                    return super.unaryOperation(abstractInsnNode, basicValue);
                }
                throw new AnalyzerException(abstractInsnNode, null, "an object reference", basicValue);
        }
        if (isSubTypeOf(basicValue, basicValueNewValue)) {
            return super.unaryOperation(abstractInsnNode, basicValue);
        }
        throw new AnalyzerException(abstractInsnNode, null, basicValueNewValue, basicValue);
    }

    @Override
    public Value unaryOperation(AbstractInsnNode abstractInsnNode, Value value) throws AnalyzerException {
        return unaryOperation(abstractInsnNode, (BasicValue) value);
    }
}
