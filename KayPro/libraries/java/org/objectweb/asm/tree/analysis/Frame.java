package org.objectweb.asm.tree.analysis;

import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;
import java.util.ArrayList;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.IincInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

public class Frame {
    private int locals;
    private Value returnValue;

    private int f6689top;
    private Value[] values;

    public Frame(int i, int i2) {
        this.values = new Value[i + i2];
        this.locals = i;
    }

    public Frame(Frame frame) {
        this(frame.locals, frame.values.length - frame.locals);
        init(frame);
    }

    public void clearStack() {
        this.f6689top = 0;
    }

    public void execute(AbstractInsnNode abstractInsnNode, Interpreter interpreter) throws AnalyzerException {
        Value local;
        switch (abstractInsnNode.getOpcode()) {
            case 0:
            case 167:
            case 169:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                push(interpreter.newOperation(abstractInsnNode));
                return;
            case 19:
            case 20:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 59:
            case 60:
            case 61:
            case ByteOps.ISTORE_3:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 196:
            default:
                throw new RuntimeException(new StringBuffer().append("Illegal opcode ").append(abstractInsnNode.getOpcode()).toString());
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                push(interpreter.copyOperation(abstractInsnNode, getLocal(((VarInsnNode) abstractInsnNode).f6686var)));
                return;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                push(interpreter.binaryOperation(abstractInsnNode, m9029pop(), m9029pop()));
                return;
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
                Value valueCopyOperation = interpreter.copyOperation(abstractInsnNode, m9029pop());
                int i = ((VarInsnNode) abstractInsnNode).f6686var;
                setLocal(i, valueCopyOperation);
                if (valueCopyOperation.getSize() == 2) {
                    setLocal(i + 1, interpreter.newValue(null));
                }
                if (i <= 0 || (local = getLocal(i - 1)) == null || local.getSize() != 2) {
                    return;
                }
                setLocal(i - 1, interpreter.newValue(null));
                return;
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
                interpreter.ternaryOperation(abstractInsnNode, m9029pop(), m9029pop(), m9029pop());
                return;
            case 87:
                if (m9029pop().getSize() == 2) {
                    throw new AnalyzerException(abstractInsnNode, "Illegal use of POP");
                }
                return;
            case 88:
                if (m9029pop().getSize() == 1 && m9029pop().getSize() != 1) {
                    throw new AnalyzerException(abstractInsnNode, "Illegal use of POP2");
                }
                return;
            case 89:
                Value valueM9029pop = m9029pop();
                if (valueM9029pop.getSize() != 1) {
                    throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP");
                }
                push(valueM9029pop);
                push(interpreter.copyOperation(abstractInsnNode, valueM9029pop));
                return;
            case 90:
                Value valueM9029pop2 = m9029pop();
                Value valueM9029pop3 = m9029pop();
                if (valueM9029pop2.getSize() != 1 || valueM9029pop3.getSize() != 1) {
                    throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP_X1");
                }
                push(interpreter.copyOperation(abstractInsnNode, valueM9029pop2));
                push(valueM9029pop3);
                push(valueM9029pop2);
                return;
            case 91:
                Value valueM9029pop4 = m9029pop();
                if (valueM9029pop4.getSize() == 1) {
                    Value valueM9029pop5 = m9029pop();
                    if (valueM9029pop5.getSize() != 1) {
                        push(interpreter.copyOperation(abstractInsnNode, valueM9029pop4));
                        push(valueM9029pop5);
                        push(valueM9029pop4);
                        return;
                    } else {
                        Value valueM9029pop6 = m9029pop();
                        if (valueM9029pop6.getSize() == 1) {
                            push(interpreter.copyOperation(abstractInsnNode, valueM9029pop4));
                            push(valueM9029pop6);
                            push(valueM9029pop5);
                            push(valueM9029pop4);
                            return;
                        }
                    }
                }
                throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP_X2");
            case 92:
                Value valueM9029pop7 = m9029pop();
                if (valueM9029pop7.getSize() != 1) {
                    push(valueM9029pop7);
                    push(interpreter.copyOperation(abstractInsnNode, valueM9029pop7));
                    return;
                }
                Value valueM9029pop8 = m9029pop();
                if (valueM9029pop8.getSize() != 1) {
                    throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP2");
                }
                push(valueM9029pop8);
                push(valueM9029pop7);
                push(interpreter.copyOperation(abstractInsnNode, valueM9029pop8));
                push(interpreter.copyOperation(abstractInsnNode, valueM9029pop7));
                return;
            case 93:
                Value valueM9029pop9 = m9029pop();
                if (valueM9029pop9.getSize() == 1) {
                    Value valueM9029pop10 = m9029pop();
                    if (valueM9029pop10.getSize() == 1) {
                        Value valueM9029pop11 = m9029pop();
                        if (valueM9029pop11.getSize() == 1) {
                            push(interpreter.copyOperation(abstractInsnNode, valueM9029pop10));
                            push(interpreter.copyOperation(abstractInsnNode, valueM9029pop9));
                            push(valueM9029pop11);
                            push(valueM9029pop10);
                            push(valueM9029pop9);
                            return;
                        }
                    }
                } else {
                    Value valueM9029pop12 = m9029pop();
                    if (valueM9029pop12.getSize() == 1) {
                        push(interpreter.copyOperation(abstractInsnNode, valueM9029pop9));
                        push(valueM9029pop12);
                        push(valueM9029pop9);
                        return;
                    }
                }
                throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP2_X1");
            case 94:
                Value valueM9029pop13 = m9029pop();
                if (valueM9029pop13.getSize() == 1) {
                    Value valueM9029pop14 = m9029pop();
                    if (valueM9029pop14.getSize() == 1) {
                        Value valueM9029pop15 = m9029pop();
                        if (valueM9029pop15.getSize() != 1) {
                            push(interpreter.copyOperation(abstractInsnNode, valueM9029pop14));
                            push(interpreter.copyOperation(abstractInsnNode, valueM9029pop13));
                            push(valueM9029pop15);
                            push(valueM9029pop14);
                            push(valueM9029pop13);
                            return;
                        }
                        Value valueM9029pop16 = m9029pop();
                        if (valueM9029pop16.getSize() == 1) {
                            push(interpreter.copyOperation(abstractInsnNode, valueM9029pop14));
                            push(interpreter.copyOperation(abstractInsnNode, valueM9029pop13));
                            push(valueM9029pop16);
                            push(valueM9029pop15);
                            push(valueM9029pop14);
                            push(valueM9029pop13);
                            return;
                        }
                    }
                } else {
                    Value valueM9029pop17 = m9029pop();
                    if (valueM9029pop17.getSize() != 1) {
                        push(interpreter.copyOperation(abstractInsnNode, valueM9029pop13));
                        push(valueM9029pop17);
                        push(valueM9029pop13);
                        return;
                    } else {
                        Value valueM9029pop18 = m9029pop();
                        if (valueM9029pop18.getSize() == 1) {
                            push(interpreter.copyOperation(abstractInsnNode, valueM9029pop13));
                            push(valueM9029pop18);
                            push(valueM9029pop17);
                            push(valueM9029pop13);
                            return;
                        }
                    }
                }
                throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP2_X2");
            case 95:
                Value valueM9029pop19 = m9029pop();
                Value valueM9029pop20 = m9029pop();
                if (valueM9029pop20.getSize() != 1 || valueM9029pop19.getSize() != 1) {
                    throw new AnalyzerException(abstractInsnNode, "Illegal use of SWAP");
                }
                push(interpreter.copyOperation(abstractInsnNode, valueM9029pop19));
                push(interpreter.copyOperation(abstractInsnNode, valueM9029pop20));
                return;
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
                push(interpreter.binaryOperation(abstractInsnNode, m9029pop(), m9029pop()));
                return;
            case 116:
            case 117:
            case 118:
            case 119:
                push(interpreter.unaryOperation(abstractInsnNode, m9029pop()));
                return;
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
                push(interpreter.binaryOperation(abstractInsnNode, m9029pop(), m9029pop()));
                return;
            case 132:
                int i2 = ((IincInsnNode) abstractInsnNode).f6677var;
                setLocal(i2, interpreter.unaryOperation(abstractInsnNode, getLocal(i2)));
                return;
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
                push(interpreter.unaryOperation(abstractInsnNode, m9029pop()));
                return;
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
                push(interpreter.binaryOperation(abstractInsnNode, m9029pop(), m9029pop()));
                return;
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
                interpreter.unaryOperation(abstractInsnNode, m9029pop());
                return;
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
                interpreter.binaryOperation(abstractInsnNode, m9029pop(), m9029pop());
                return;
            case 168:
                push(interpreter.newOperation(abstractInsnNode));
                return;
            case 170:
            case 171:
                interpreter.unaryOperation(abstractInsnNode, m9029pop());
                return;
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
                Value valueM9029pop21 = m9029pop();
                interpreter.unaryOperation(abstractInsnNode, valueM9029pop21);
                interpreter.returnOperation(abstractInsnNode, valueM9029pop21, this.returnValue);
                return;
            case 177:
                if (this.returnValue != null) {
                    throw new AnalyzerException(abstractInsnNode, "Incompatible return type");
                }
                return;
            case 178:
                push(interpreter.newOperation(abstractInsnNode));
                return;
            case 179:
                interpreter.unaryOperation(abstractInsnNode, m9029pop());
                return;
            case 180:
                push(interpreter.unaryOperation(abstractInsnNode, m9029pop()));
                return;
            case 181:
                interpreter.binaryOperation(abstractInsnNode, m9029pop(), m9029pop());
                return;
            case 182:
            case 183:
            case 184:
            case 185:
                ArrayList arrayList = new ArrayList();
                String str = ((MethodInsnNode) abstractInsnNode).desc;
                for (int length = Type.getArgumentTypes(str).length; length > 0; length--) {
                    arrayList.add(0, m9029pop());
                }
                if (abstractInsnNode.getOpcode() != 184) {
                    arrayList.add(0, m9029pop());
                }
                if (Type.getReturnType(str) == Type.VOID_TYPE) {
                    interpreter.naryOperation(abstractInsnNode, arrayList);
                    return;
                } else {
                    push(interpreter.naryOperation(abstractInsnNode, arrayList));
                    return;
                }
            case 186:
                ArrayList arrayList2 = new ArrayList();
                String str2 = ((InvokeDynamicInsnNode) abstractInsnNode).desc;
                for (int length2 = Type.getArgumentTypes(str2).length; length2 > 0; length2--) {
                    arrayList2.add(0, m9029pop());
                }
                if (Type.getReturnType(str2) == Type.VOID_TYPE) {
                    interpreter.naryOperation(abstractInsnNode, arrayList2);
                    return;
                } else {
                    push(interpreter.naryOperation(abstractInsnNode, arrayList2));
                    return;
                }
            case 187:
                push(interpreter.newOperation(abstractInsnNode));
                return;
            case 188:
            case 189:
            case 190:
                push(interpreter.unaryOperation(abstractInsnNode, m9029pop()));
                return;
            case 191:
                interpreter.unaryOperation(abstractInsnNode, m9029pop());
                return;
            case 192:
            case 193:
                push(interpreter.unaryOperation(abstractInsnNode, m9029pop()));
                return;
            case 194:
            case 195:
                interpreter.unaryOperation(abstractInsnNode, m9029pop());
                return;
            case 197:
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = ((MultiANewArrayInsnNode) abstractInsnNode).dims; i3 > 0; i3--) {
                    arrayList3.add(0, m9029pop());
                }
                push(interpreter.naryOperation(abstractInsnNode, arrayList3));
                return;
            case 198:
            case 199:
                interpreter.unaryOperation(abstractInsnNode, m9029pop());
                return;
        }
    }

    public Value getLocal(int i) throws IndexOutOfBoundsException {
        if (i >= this.locals) {
            throw new IndexOutOfBoundsException("Trying to access an inexistant local variable");
        }
        return this.values[i];
    }

    public int getLocals() {
        return this.locals;
    }

    public int getMaxStackSize() {
        return this.values.length - this.locals;
    }

    public Value getStack(int i) throws IndexOutOfBoundsException {
        return this.values[this.locals + i];
    }

    public int getStackSize() {
        return this.f6689top;
    }

    public Frame init(Frame frame) {
        this.returnValue = frame.returnValue;
        System.arraycopy(frame.values, 0, this.values, 0, this.values.length);
        this.f6689top = frame.f6689top;
        return this;
    }

    public boolean merge(Frame frame, Interpreter interpreter) throws AnalyzerException {
        boolean z = false;
        if (this.f6689top != frame.f6689top) {
            throw new AnalyzerException(null, "Incompatible stack heights");
        }
        int i = 0;
        while (true) {
            boolean z2 = z;
            if (i >= this.locals + this.f6689top) {
                return z2;
            }
            Value valueMerge = interpreter.merge(this.values[i], frame.values[i]);
            if (valueMerge.equals(this.values[i])) {
                z = z2;
            } else {
                this.values[i] = valueMerge;
                z = true;
            }
            i++;
        }
    }

    public boolean merge(Frame frame, boolean[] zArr) {
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = z;
            if (i >= this.locals) {
                return z2;
            }
            if (!zArr[i] && !this.values[i].equals(frame.values[i])) {
                this.values[i] = frame.values[i];
                z2 = true;
            }
            z = z2;
            i++;
        }
    }

    public Value m9029pop() throws IndexOutOfBoundsException {
        if (this.f6689top == 0) {
            throw new IndexOutOfBoundsException("Cannot pop operand off an empty stack.");
        }
        Value[] valueArr = this.values;
        int i = this.f6689top - 1;
        this.f6689top = i;
        return valueArr[i + this.locals];
    }

    public void push(Value value) throws IndexOutOfBoundsException {
        if (this.f6689top + this.locals >= this.values.length) {
            throw new IndexOutOfBoundsException("Insufficient maximum stack size.");
        }
        Value[] valueArr = this.values;
        int i = this.f6689top;
        this.f6689top = i + 1;
        valueArr[i + this.locals] = value;
    }

    public void setLocal(int i, Value value) throws IndexOutOfBoundsException {
        if (i >= this.locals) {
            throw new IndexOutOfBoundsException(new StringBuffer().append("Trying to access an inexistant local variable ").append(i).toString());
        }
        this.values[i] = value;
    }

    public void setReturn(Value value) {
        this.returnValue = value;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < getLocals(); i++) {
            stringBuffer.append(getLocal(i));
        }
        stringBuffer.append(' ');
        for (int i2 = 0; i2 < getStackSize(); i2++) {
            stringBuffer.append(getStack(i2).toString());
        }
        return stringBuffer.toString();
    }
}
