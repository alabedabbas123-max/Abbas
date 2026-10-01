package org.objectweb.asm.commons;

import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class AnalyzerAdapter extends MethodVisitor {
    static Class class$org$objectweb$asm$commons$AnalyzerAdapter = class$("org.objectweb.asm.commons.AnalyzerAdapter");
    private List labels;
    public List locals;
    private int maxLocals;
    private int maxStack;
    private String owner;
    public List stack;
    public Map uninitializedTypes;

    protected AnalyzerAdapter(int i, String str, int i2, String str2, String str3, MethodVisitor methodVisitor) {
        super(i, methodVisitor);
        this.owner = str;
        this.locals = new ArrayList();
        this.stack = new ArrayList();
        this.uninitializedTypes = new HashMap();
        if ((i2 & 8) == 0) {
            if ("<init>".equals(str2)) {
                this.locals.add(Opcodes.UNINITIALIZED_THIS);
            } else {
                this.locals.add(str);
            }
        }
        Type[] argumentTypes = Type.getArgumentTypes(str3);
        for (int i3 = 0; i3 < argumentTypes.length; i3++) {
            switch (argumentTypes[i3].getSort()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.locals.add(Opcodes.INTEGER);
                    break;
                case 6:
                    this.locals.add(Opcodes.FLOAT);
                    break;
                case 7:
                    this.locals.add(Opcodes.LONG);
                    this.locals.add(Opcodes.f6639TOP);
                    break;
                case 8:
                    this.locals.add(Opcodes.DOUBLE);
                    this.locals.add(Opcodes.f6639TOP);
                    break;
                case 9:
                    this.locals.add(argumentTypes[i3].getDescriptor());
                    break;
                default:
                    this.locals.add(argumentTypes[i3].getInternalName());
                    break;
            }
        }
        this.maxLocals = this.locals.size();
    }

    public AnalyzerAdapter(String str, int i, String str2, String str3, MethodVisitor methodVisitor) {
        this(Opcodes.ASM5, str, i, str2, str3, methodVisitor);
        if (getClass() != class$org$objectweb$asm$commons$AnalyzerAdapter) {
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

    private void doVisitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.f6563mv != null) {
            this.f6563mv.visitMethodInsn(i, str, str2, str3, z);
        }
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        m8996pop(str3);
        if (i != 184) {
            Object objM8994pop = m8994pop();
            if (i == 183 && str2.charAt(0) == '<') {
                Object obj = objM8994pop == Opcodes.UNINITIALIZED_THIS ? this.owner : this.uninitializedTypes.get(objM8994pop);
                for (int i2 = 0; i2 < this.locals.size(); i2++) {
                    if (this.locals.get(i2) == objM8994pop) {
                        this.locals.set(i2, obj);
                    }
                }
                for (int i3 = 0; i3 < this.stack.size(); i3++) {
                    if (this.stack.get(i3) == objM8994pop) {
                        this.stack.set(i3, obj);
                    }
                }
            }
        }
        pushDesc(str3);
        this.labels = null;
    }

    private void execute(int i, int i2, String str) {
        Object objM8993get;
        Object objM8993get2;
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        switch (i) {
            case 0:
            case 116:
            case 117:
            case 118:
            case 119:
            case 145:
            case 146:
            case 147:
            case 167:
            case 177:
                break;
            case 1:
                push(Opcodes.NULL);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                push(Opcodes.INTEGER);
                break;
            case 9:
            case 10:
                push(Opcodes.LONG);
                push(Opcodes.f6639TOP);
                break;
            case 11:
            case 12:
            case 13:
                push(Opcodes.FLOAT);
                break;
            case 14:
            case 15:
                push(Opcodes.DOUBLE);
                push(Opcodes.f6639TOP);
                break;
            case 18:
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
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 196:
            case 197:
            default:
                m8995pop(i2);
                pushDesc(str);
                break;
            case 21:
            case 23:
            case 25:
                push(m8993get(i2));
                break;
            case 22:
            case 24:
                push(m8993get(i2));
                push(Opcodes.f6639TOP);
                break;
            case 46:
            case 51:
            case 52:
            case 53:
                m8995pop(2);
                push(Opcodes.INTEGER);
                break;
            case 47:
            case 143:
                m8995pop(2);
                push(Opcodes.LONG);
                push(Opcodes.f6639TOP);
                break;
            case 48:
                m8995pop(2);
                push(Opcodes.FLOAT);
                break;
            case 49:
            case 138:
                m8995pop(2);
                push(Opcodes.DOUBLE);
                push(Opcodes.f6639TOP);
                break;
            case 50:
                m8995pop(1);
                Object objM8994pop = m8994pop();
                if (!(objM8994pop instanceof String)) {
                    push("java/lang/Object");
                } else {
                    pushDesc(((String) objM8994pop).substring(1));
                }
                break;
            case 54:
            case 56:
            case 58:
                m8997set(i2, m8994pop());
                if (i2 > 0 && ((objM8993get2 = m8993get(i2 - 1)) == Opcodes.LONG || objM8993get2 == Opcodes.DOUBLE)) {
                    m8997set(i2 - 1, Opcodes.f6639TOP);
                }
                break;
            case 55:
            case 57:
                m8995pop(1);
                m8997set(i2, m8994pop());
                m8997set(i2 + 1, Opcodes.f6639TOP);
                if (i2 > 0 && ((objM8993get = m8993get(i2 - 1)) == Opcodes.LONG || objM8993get == Opcodes.DOUBLE)) {
                    m8997set(i2 - 1, Opcodes.f6639TOP);
                }
                break;
            case 79:
            case 81:
            case 83:
            case 84:
            case 85:
            case 86:
                m8995pop(3);
                break;
            case 80:
            case 82:
                m8995pop(4);
                break;
            case 87:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 170:
            case 171:
            case 172:
            case 174:
            case 176:
            case 191:
            case 194:
            case 195:
            case 198:
            case 199:
                m8995pop(1);
                break;
            case 88:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 173:
            case 175:
                m8995pop(2);
                break;
            case 89:
                Object objM8994pop2 = m8994pop();
                push(objM8994pop2);
                push(objM8994pop2);
                break;
            case 90:
                Object objM8994pop3 = m8994pop();
                Object objM8994pop4 = m8994pop();
                push(objM8994pop3);
                push(objM8994pop4);
                push(objM8994pop3);
                break;
            case 91:
                Object objM8994pop5 = m8994pop();
                Object objM8994pop6 = m8994pop();
                Object objM8994pop7 = m8994pop();
                push(objM8994pop5);
                push(objM8994pop7);
                push(objM8994pop6);
                push(objM8994pop5);
                break;
            case 92:
                Object objM8994pop8 = m8994pop();
                Object objM8994pop9 = m8994pop();
                push(objM8994pop9);
                push(objM8994pop8);
                push(objM8994pop9);
                push(objM8994pop8);
                break;
            case 93:
                Object objM8994pop10 = m8994pop();
                Object objM8994pop11 = m8994pop();
                Object objM8994pop12 = m8994pop();
                push(objM8994pop11);
                push(objM8994pop10);
                push(objM8994pop12);
                push(objM8994pop11);
                push(objM8994pop10);
                break;
            case 94:
                Object objM8994pop13 = m8994pop();
                Object objM8994pop14 = m8994pop();
                Object objM8994pop15 = m8994pop();
                Object objM8994pop16 = m8994pop();
                push(objM8994pop14);
                push(objM8994pop13);
                push(objM8994pop16);
                push(objM8994pop15);
                push(objM8994pop14);
                push(objM8994pop13);
                break;
            case 95:
                Object objM8994pop17 = m8994pop();
                Object objM8994pop18 = m8994pop();
                push(objM8994pop17);
                push(objM8994pop18);
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
            case 136:
            case 142:
            case 149:
            case 150:
                m8995pop(2);
                push(Opcodes.INTEGER);
                break;
            case 97:
            case 101:
            case 105:
            case 109:
            case 113:
            case 127:
            case 129:
            case 131:
                m8995pop(4);
                push(Opcodes.LONG);
                push(Opcodes.f6639TOP);
                break;
            case 98:
            case 102:
            case 106:
            case 110:
            case 114:
            case 137:
            case 144:
                m8995pop(2);
                push(Opcodes.FLOAT);
                break;
            case 99:
            case 103:
            case 107:
            case 111:
            case 115:
                m8995pop(4);
                push(Opcodes.DOUBLE);
                push(Opcodes.f6639TOP);
                break;
            case 121:
            case 123:
            case 125:
                m8995pop(3);
                push(Opcodes.LONG);
                push(Opcodes.f6639TOP);
                break;
            case 132:
                m8997set(i2, Opcodes.INTEGER);
                break;
            case 133:
            case 140:
                m8995pop(1);
                push(Opcodes.LONG);
                push(Opcodes.f6639TOP);
                break;
            case 134:
                m8995pop(1);
                push(Opcodes.FLOAT);
                break;
            case 135:
            case 141:
                m8995pop(1);
                push(Opcodes.DOUBLE);
                push(Opcodes.f6639TOP);
                break;
            case 139:
            case 190:
            case 193:
                m8995pop(1);
                push(Opcodes.INTEGER);
                break;
            case 148:
            case 151:
            case 152:
                m8995pop(4);
                push(Opcodes.INTEGER);
                break;
            case 168:
            case 169:
                throw new RuntimeException("JSR/RET are not supported");
            case 178:
                pushDesc(str);
                break;
            case 179:
                m8996pop(str);
                break;
            case 180:
                m8995pop(1);
                pushDesc(str);
                break;
            case 181:
                m8996pop(str);
                m8994pop();
                break;
            case 187:
                push(this.labels.get(0));
                break;
            case 188:
                m8994pop();
                switch (i2) {
                    case 4:
                        pushDesc("[Z");
                        break;
                    case 5:
                        pushDesc("[C");
                        break;
                    case 6:
                        pushDesc("[F");
                        break;
                    case 7:
                        pushDesc("[D");
                        break;
                    case 8:
                        pushDesc("[B");
                        break;
                    case 9:
                        pushDesc("[S");
                        break;
                    case 10:
                        pushDesc("[I");
                        break;
                    default:
                        pushDesc("[J");
                        break;
                }
                break;
            case 189:
                m8994pop();
                pushDesc(new StringBuffer().append("[").append(Type.getObjectType(str)).toString());
                break;
            case 192:
                m8994pop();
                pushDesc(Type.getObjectType(str).getDescriptor());
                break;
        }
        this.labels = null;
    }

    private Object m8993get(int i) {
        this.maxLocals = Math.max(this.maxLocals, i + 1);
        return i < this.locals.size() ? this.locals.get(i) : Opcodes.f6639TOP;
    }

    private Object m8994pop() {
        return this.stack.remove(this.stack.size() - 1);
    }

    private void m8995pop(int i) {
        int size = this.stack.size();
        for (int i2 = size - 1; i2 >= size - i; i2--) {
            this.stack.remove(i2);
        }
    }

    private void m8996pop(String str) {
        int i = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt != '(') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                m8995pop(2);
                return;
            } else {
                m8995pop(1);
                return;
            }
        }
        Type[] argumentTypes = Type.getArgumentTypes(str);
        int size = 0;
        while (true) {
            int i2 = i;
            if (i2 >= argumentTypes.length) {
                m8995pop(size);
                return;
            } else {
                size += argumentTypes[i2].getSize();
                i = i2 + 1;
            }
        }
    }

    private void push(Object obj) {
        this.stack.add(obj);
        this.maxStack = Math.max(this.maxStack, this.stack.size());
    }

    private void pushDesc(String str) {
        int iIndexOf = str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0;
        switch (str.charAt(iIndexOf)) {
            case 'B':
            case 'C':
            case 'I':
            case 'S':
            case 'Z':
                push(Opcodes.INTEGER);
                break;
            case 'D':
                push(Opcodes.DOUBLE);
                push(Opcodes.f6639TOP);
                break;
            case 'F':
                push(Opcodes.FLOAT);
                break;
            case 'J':
                push(Opcodes.LONG);
                push(Opcodes.f6639TOP);
                break;
            case 'V':
                break;
            case '[':
                if (iIndexOf != 0) {
                    push(str.substring(iIndexOf, str.length()));
                } else {
                    push(str);
                }
                break;
            default:
                if (iIndexOf != 0) {
                    push(str.substring(iIndexOf + 1, str.length() - 1));
                } else {
                    push(str.substring(1, str.length() - 1));
                }
                break;
        }
    }

    private void m8997set(int i, Object obj) {
        this.maxLocals = Math.max(this.maxLocals, i + 1);
        while (i >= this.locals.size()) {
            this.locals.add(Opcodes.f6639TOP);
        }
        this.locals.set(i, obj);
    }

    private static void visitFrameTypes(int i, Object[] objArr, List list) {
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            list.add(obj);
            if (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) {
                list.add(Opcodes.f6639TOP);
            }
        }
    }

    @Override
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        if (this.f6563mv != null) {
            this.f6563mv.visitFieldInsn(i, str, str2, str3);
        }
        execute(i, 0, str3);
    }

    @Override
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        if (i != -1) {
            throw new IllegalStateException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
        }
        if (this.f6563mv != null) {
            this.f6563mv.visitFrame(i, i2, objArr, i3, objArr2);
        }
        if (this.locals != null) {
            this.locals.clear();
            this.stack.clear();
        } else {
            this.locals = new ArrayList();
            this.stack = new ArrayList();
        }
        visitFrameTypes(i2, objArr, this.locals);
        visitFrameTypes(i3, objArr2, this.stack);
        this.maxStack = Math.max(this.maxStack, this.stack.size());
    }

    @Override
    public void visitIincInsn(int i, int i2) {
        if (this.f6563mv != null) {
            this.f6563mv.visitIincInsn(i, i2);
        }
        execute(132, i, null);
    }

    @Override
    public void visitInsn(int i) {
        if (this.f6563mv != null) {
            this.f6563mv.visitInsn(i);
        }
        execute(i, 0, null);
        if ((i < 172 || i > 177) && i != 191) {
            return;
        }
        this.locals = null;
        this.stack = null;
    }

    @Override
    public void visitIntInsn(int i, int i2) {
        if (this.f6563mv != null) {
            this.f6563mv.visitIntInsn(i, i2);
        }
        execute(i, i2, null);
    }

    @Override
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        if (this.f6563mv != null) {
            this.f6563mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
        }
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        m8996pop(str2);
        pushDesc(str2);
        this.labels = null;
    }

    @Override
    public void visitJumpInsn(int i, Label label) {
        if (this.f6563mv != null) {
            this.f6563mv.visitJumpInsn(i, label);
        }
        execute(i, 0, null);
        if (i == 167) {
            this.locals = null;
            this.stack = null;
        }
    }

    @Override
    public void visitLabel(Label label) {
        if (this.f6563mv != null) {
            this.f6563mv.visitLabel(label);
        }
        if (this.labels == null) {
            this.labels = new ArrayList(3);
        }
        this.labels.add(label);
    }

    @Override
    public void visitLdcInsn(Object obj) {
        if (this.f6563mv != null) {
            this.f6563mv.visitLdcInsn(obj);
        }
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        if (obj instanceof Integer) {
            push(Opcodes.INTEGER);
        } else if (obj instanceof Long) {
            push(Opcodes.LONG);
            push(Opcodes.f6639TOP);
        } else if (obj instanceof Float) {
            push(Opcodes.FLOAT);
        } else if (obj instanceof Double) {
            push(Opcodes.DOUBLE);
            push(Opcodes.f6639TOP);
        } else if (obj instanceof String) {
            push("java/lang/String");
        } else if (obj instanceof Type) {
            int sort = ((Type) obj).getSort();
            if (sort == 10 || sort == 9) {
                push("java/lang/Class");
            } else {
                if (sort != 11) {
                    throw new IllegalArgumentException();
                }
                push("java/lang/invoke/MethodType");
            }
        } else {
            if (!(obj instanceof Handle)) {
                throw new IllegalArgumentException();
            }
            push("java/lang/invoke/MethodHandle");
        }
        this.labels = null;
    }

    @Override
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        if (this.f6563mv != null) {
            this.f6563mv.visitLookupSwitchInsn(label, iArr, labelArr);
        }
        execute(171, 0, null);
        this.locals = null;
        this.stack = null;
    }

    @Override
    public void visitMaxs(int i, int i2) {
        if (this.f6563mv != null) {
            this.maxStack = Math.max(this.maxStack, i);
            this.maxLocals = Math.max(this.maxLocals, i2);
            this.f6563mv.visitMaxs(this.maxStack, this.maxLocals);
        }
    }

    @Override
    public void visitMethodInsn(int i, String str, String str2, String str3) {
        if (this.f6562api >= 327680) {
            super.visitMethodInsn(i, str, str2, str3);
        } else {
            doVisitMethodInsn(i, str, str2, str3, i == 185);
        }
    }

    @Override
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.f6562api < 327680) {
            super.visitMethodInsn(i, str, str2, str3, z);
        } else {
            doVisitMethodInsn(i, str, str2, str3, z);
        }
    }

    @Override
    public void visitMultiANewArrayInsn(String str, int i) {
        if (this.f6563mv != null) {
            this.f6563mv.visitMultiANewArrayInsn(str, i);
        }
        execute(197, i, str);
    }

    @Override
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        if (this.f6563mv != null) {
            this.f6563mv.visitTableSwitchInsn(i, i2, label, labelArr);
        }
        execute(170, 0, null);
        this.locals = null;
        this.stack = null;
    }

    @Override
    public void visitTypeInsn(int i, String str) {
        if (i == 187) {
            if (this.labels == null) {
                Label label = new Label();
                this.labels = new ArrayList(3);
                this.labels.add(label);
                if (this.f6563mv != null) {
                    this.f6563mv.visitLabel(label);
                }
            }
            for (int i2 = 0; i2 < this.labels.size(); i2++) {
                this.uninitializedTypes.put(this.labels.get(i2), str);
            }
        }
        if (this.f6563mv != null) {
            this.f6563mv.visitTypeInsn(i, str);
        }
        execute(i, 0, str);
    }

    @Override
    public void visitVarInsn(int i, int i2) {
        if (this.f6563mv != null) {
            this.f6563mv.visitVarInsn(i, i2);
        }
        execute(i, i2, null);
    }
}
