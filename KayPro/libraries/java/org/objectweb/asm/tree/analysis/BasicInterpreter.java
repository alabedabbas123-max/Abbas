package org.objectweb.asm.tree.analysis;

import java.util.List;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

public class BasicInterpreter extends Interpreter implements Opcodes {
    public BasicInterpreter() {
        super(Opcodes.ASM5);
    }

    protected BasicInterpreter(int i) {
        super(i);
    }

    public BasicValue binaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
        switch (abstractInsnNode.getOpcode()) {
            case 46:
            case 51:
            case 52:
            case 53:
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
                return BasicValue.INT_VALUE;
            case 47:
            case 97:
            case 101:
            case 105:
            case 109:
            case 113:
            case 121:
            case 123:
            case 125:
            case 127:
            case 129:
            case 131:
                return BasicValue.LONG_VALUE;
            case 48:
            case 98:
            case 102:
            case 106:
            case 110:
            case 114:
                return BasicValue.FLOAT_VALUE;
            case 49:
            case 99:
            case 103:
            case 107:
            case 111:
            case 115:
                return BasicValue.DOUBLE_VALUE;
            case 50:
                return BasicValue.REFERENCE_VALUE;
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
                return BasicValue.INT_VALUE;
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 181:
                return null;
            default:
                throw new Error("Internal error.");
        }
    }

    @Override
    public Value binaryOperation(AbstractInsnNode abstractInsnNode, Value value, Value value2) throws AnalyzerException {
        return binaryOperation(abstractInsnNode, (BasicValue) value, (BasicValue) value2);
    }

    public BasicValue copyOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        return basicValue;
    }

    @Override
    public Value copyOperation(AbstractInsnNode abstractInsnNode, Value value) throws AnalyzerException {
        return copyOperation(abstractInsnNode, (BasicValue) value);
    }

    public BasicValue merge(BasicValue basicValue, BasicValue basicValue2) {
        return !basicValue.equals(basicValue2) ? BasicValue.UNINITIALIZED_VALUE : basicValue;
    }

    @Override
    public Value merge(Value value, Value value2) {
        return merge((BasicValue) value, (BasicValue) value2);
    }

    @Override
    public BasicValue naryOperation(AbstractInsnNode abstractInsnNode, List list) throws AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            return newValue(Type.getType(((MultiANewArrayInsnNode) abstractInsnNode).desc));
        }
        return opcode == 186 ? newValue(Type.getReturnType(((InvokeDynamicInsnNode) abstractInsnNode).desc)) : newValue(Type.getReturnType(((MethodInsnNode) abstractInsnNode).desc));
    }

    @Override
    public Value naryOperation(AbstractInsnNode abstractInsnNode, List list) throws AnalyzerException {
        return naryOperation(abstractInsnNode, list);
    }

    @Override
    public BasicValue newOperation(AbstractInsnNode abstractInsnNode) throws AnalyzerException {
        switch (abstractInsnNode.getOpcode()) {
            case 1:
                return newValue(Type.getObjectType("null"));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return BasicValue.INT_VALUE;
            case 9:
            case 10:
                return BasicValue.LONG_VALUE;
            case 11:
            case 12:
            case 13:
                return BasicValue.FLOAT_VALUE;
            case 14:
            case 15:
                return BasicValue.DOUBLE_VALUE;
            case 16:
            case 17:
                return BasicValue.INT_VALUE;
            case 18:
                Object obj = ((LdcInsnNode) abstractInsnNode).f6679cst;
                if (obj instanceof Integer) {
                    return BasicValue.INT_VALUE;
                }
                if (obj instanceof Float) {
                    return BasicValue.FLOAT_VALUE;
                }
                if (obj instanceof Long) {
                    return BasicValue.LONG_VALUE;
                }
                if (obj instanceof Double) {
                    return BasicValue.DOUBLE_VALUE;
                }
                if (obj instanceof String) {
                    return newValue(Type.getObjectType("java/lang/String"));
                }
                if (!(obj instanceof Type)) {
                    if (obj instanceof Handle) {
                        return newValue(Type.getObjectType("java/lang/invoke/MethodHandle"));
                    }
                    throw new IllegalArgumentException(new StringBuffer().append("Illegal LDC constant ").append(obj).toString());
                }
                int sort = ((Type) obj).getSort();
                if (sort == 10 || sort == 9) {
                    return newValue(Type.getObjectType("java/lang/Class"));
                }
                if (sort == 11) {
                    return newValue(Type.getObjectType("java/lang/invoke/MethodType"));
                }
                throw new IllegalArgumentException(new StringBuffer().append("Illegal LDC constant ").append(obj).toString());
            case 168:
                return BasicValue.RETURNADDRESS_VALUE;
            case 178:
                return newValue(Type.getType(((FieldInsnNode) abstractInsnNode).desc));
            case 187:
                return newValue(Type.getObjectType(((TypeInsnNode) abstractInsnNode).desc));
            default:
                throw new Error("Internal error.");
        }
    }

    @Override
    public Value newOperation(AbstractInsnNode abstractInsnNode) throws AnalyzerException {
        return newOperation(abstractInsnNode);
    }

    @Override
    public BasicValue newValue(Type type) {
        if (type == null) {
            return BasicValue.UNINITIALIZED_VALUE;
        }
        switch (type.getSort()) {
            case 0:
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return BasicValue.INT_VALUE;
            case 6:
                return BasicValue.FLOAT_VALUE;
            case 7:
                return BasicValue.LONG_VALUE;
            case 8:
                return BasicValue.DOUBLE_VALUE;
            case 9:
            case 10:
                return BasicValue.REFERENCE_VALUE;
            default:
                throw new Error("Internal error");
        }
    }

    @Override
    public Value newValue(Type type) {
        return newValue(type);
    }

    public void returnOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
    }

    @Override
    public void returnOperation(AbstractInsnNode abstractInsnNode, Value value, Value value2) throws AnalyzerException {
        returnOperation(abstractInsnNode, (BasicValue) value, (BasicValue) value2);
    }

    public BasicValue ternaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2, BasicValue basicValue3) throws AnalyzerException {
        return null;
    }

    @Override
    public Value ternaryOperation(AbstractInsnNode abstractInsnNode, Value value, Value value2, Value value3) throws AnalyzerException {
        return ternaryOperation(abstractInsnNode, (BasicValue) value, (BasicValue) value2, (BasicValue) value3);
    }

    public BasicValue unaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        switch (abstractInsnNode.getOpcode()) {
            case 116:
            case 132:
            case 136:
            case 139:
            case 142:
            case 145:
            case 146:
            case 147:
                return BasicValue.INT_VALUE;
            case 117:
            case 133:
            case 140:
            case 143:
                return BasicValue.LONG_VALUE;
            case 118:
            case 134:
            case 137:
            case 144:
                return BasicValue.FLOAT_VALUE;
            case 119:
            case 135:
            case 138:
            case 141:
                return BasicValue.DOUBLE_VALUE;
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
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 179:
            case 191:
            case 194:
            case 195:
            case 198:
            case 199:
                return null;
            case 180:
                return newValue(Type.getType(((FieldInsnNode) abstractInsnNode).desc));
            case 188:
                switch (((IntInsnNode) abstractInsnNode).operand) {
                    case 4:
                        return newValue(Type.getType("[Z"));
                    case 5:
                        return newValue(Type.getType("[C"));
                    case 6:
                        return newValue(Type.getType("[F"));
                    case 7:
                        return newValue(Type.getType("[D"));
                    case 8:
                        return newValue(Type.getType("[B"));
                    case 9:
                        return newValue(Type.getType("[S"));
                    case 10:
                        return newValue(Type.getType("[I"));
                    case 11:
                        return newValue(Type.getType("[J"));
                    default:
                        throw new AnalyzerException(abstractInsnNode, "Invalid array type");
                }
            case 189:
                return newValue(Type.getType(new StringBuffer().append("[").append(Type.getObjectType(((TypeInsnNode) abstractInsnNode).desc)).toString()));
            case 190:
                return BasicValue.INT_VALUE;
            case 192:
                return newValue(Type.getObjectType(((TypeInsnNode) abstractInsnNode).desc));
            case 193:
                return BasicValue.INT_VALUE;
        }
    }

    @Override
    public Value unaryOperation(AbstractInsnNode abstractInsnNode, Value value) throws AnalyzerException {
        return unaryOperation(abstractInsnNode, (BasicValue) value);
    }
}
