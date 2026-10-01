package org.objectweb.asm.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public abstract class AdviceAdapter extends GeneratorAdapter implements Opcodes {
    private static final Object OTHER;
    private static final Object THIS;
    private Map branches;
    private boolean constructor;
    protected int methodAccess;
    protected String methodDesc;
    private List stackFrame;
    private boolean superInitialized;

    static {
        _clinit_();
        THIS = new Object();
        OTHER = new Object();
    }

    protected AdviceAdapter(int i, MethodVisitor methodVisitor, int i2, String str, String str2) {
        super(i, methodVisitor, i2, str, str2);
        this.methodAccess = i2;
        this.methodDesc = str2;
        this.constructor = "<init>".equals(str);
    }

    static void _clinit_() {
    }

    private void addBranch(Label label) {
        if (this.branches.containsKey(label)) {
            return;
        }
        this.branches.put(label, new ArrayList(this.stackFrame));
    }

    private void addBranches(Label label, Label[] labelArr) {
        addBranch(label);
        for (Label label2 : labelArr) {
            addBranch(label2);
        }
    }

    private void doVisitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        this.f6563mv.visitMethodInsn(i, str, str2, str3, z);
        if (this.constructor) {
            for (Type type : Type.getArgumentTypes(str3)) {
                popValue();
                if (type.getSize() == 2) {
                    popValue();
                }
            }
            switch (i) {
                case 182:
                case 185:
                    popValue();
                    break;
                case 183:
                    if (popValue() == THIS && !this.superInitialized) {
                        onMethodEnter();
                        this.superInitialized = true;
                        this.constructor = false;
                    }
                    break;
            }
            Type returnType = Type.getReturnType(str3);
            if (returnType != Type.VOID_TYPE) {
                pushValue(OTHER);
                if (returnType.getSize() == 2) {
                    pushValue(OTHER);
                }
            }
        }
    }

    private Object peekValue() {
        return this.stackFrame.get(this.stackFrame.size() - 1);
    }

    private Object popValue() {
        return this.stackFrame.remove(this.stackFrame.size() - 1);
    }

    private void pushValue(Object obj) {
        this.stackFrame.add(obj);
    }

    protected void onMethodEnter() {
    }

    protected void onMethodExit(int i) {
    }

    @Override
    public void visitCode() {
        this.f6563mv.visitCode();
        if (this.constructor) {
            this.stackFrame = new ArrayList();
            this.branches = new HashMap();
        } else {
            this.superInitialized = true;
            onMethodEnter();
        }
    }

    @Override
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        this.f6563mv.visitFieldInsn(i, str, str2, str3);
        if (this.constructor) {
            char cCharAt = str3.charAt(0);
            boolean z = cCharAt == 'J' || cCharAt == 'D';
            switch (i) {
                case 178:
                    pushValue(OTHER);
                    if (z) {
                        pushValue(OTHER);
                    }
                    break;
                case 179:
                    popValue();
                    if (z) {
                        popValue();
                    }
                    break;
                case 180:
                default:
                    if (z) {
                        pushValue(OTHER);
                    }
                    break;
                case 181:
                    popValue();
                    if (z) {
                        popValue();
                        popValue();
                    }
                    break;
            }
        }
    }

    @Override
    public void visitInsn(int i) {
        if (!this.constructor) {
            switch (i) {
                case 172:
                case 173:
                case 174:
                case 175:
                case 176:
                case 177:
                case 191:
                    onMethodExit(i);
                    break;
            }
        } else {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 11:
                case 12:
                case 13:
                case 133:
                case 135:
                case 140:
                case 141:
                    pushValue(OTHER);
                    break;
                case 9:
                case 10:
                case 14:
                case 15:
                    pushValue(OTHER);
                    pushValue(OTHER);
                    break;
                case 46:
                case 48:
                case 50:
                case 51:
                case 52:
                case 53:
                case 87:
                case 96:
                case 98:
                case 100:
                case 102:
                case 104:
                case 106:
                case 108:
                case 110:
                case 112:
                case 114:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 128:
                case 130:
                case 136:
                case 137:
                case 142:
                case 144:
                case 149:
                case 150:
                case 194:
                case 195:
                    popValue();
                    break;
                case 79:
                case 81:
                case 83:
                case 84:
                case 85:
                case 86:
                case 148:
                case 151:
                case 152:
                    popValue();
                    popValue();
                    popValue();
                    break;
                case 80:
                case 82:
                    popValue();
                    popValue();
                    popValue();
                    popValue();
                    break;
                case 88:
                case 97:
                case 99:
                case 101:
                case 103:
                case 105:
                case 107:
                case 109:
                case 111:
                case 113:
                case 115:
                case 127:
                case 129:
                case 131:
                    popValue();
                    popValue();
                    break;
                case 89:
                    pushValue(peekValue());
                    break;
                case 90:
                    int size = this.stackFrame.size();
                    this.stackFrame.add(size - 2, this.stackFrame.get(size - 1));
                    break;
                case 91:
                    int size2 = this.stackFrame.size();
                    this.stackFrame.add(size2 - 3, this.stackFrame.get(size2 - 1));
                    break;
                case 92:
                    int size3 = this.stackFrame.size();
                    this.stackFrame.add(size3 - 2, this.stackFrame.get(size3 - 1));
                    this.stackFrame.add(size3 - 2, this.stackFrame.get(size3 - 1));
                    break;
                case 93:
                    int size4 = this.stackFrame.size();
                    this.stackFrame.add(size4 - 3, this.stackFrame.get(size4 - 1));
                    this.stackFrame.add(size4 - 3, this.stackFrame.get(size4 - 1));
                    break;
                case 94:
                    int size5 = this.stackFrame.size();
                    this.stackFrame.add(size5 - 4, this.stackFrame.get(size5 - 1));
                    this.stackFrame.add(size5 - 4, this.stackFrame.get(size5 - 1));
                    break;
                case 95:
                    int size6 = this.stackFrame.size();
                    this.stackFrame.add(size6 - 2, this.stackFrame.get(size6 - 1));
                    this.stackFrame.remove(size6);
                    break;
                case 172:
                case 174:
                case 176:
                case 191:
                    popValue();
                    onMethodExit(i);
                    break;
                case 173:
                case 175:
                    popValue();
                    popValue();
                    onMethodExit(i);
                    break;
                case 177:
                    onMethodExit(i);
                    break;
            }
        }
        this.f6563mv.visitInsn(i);
    }

    @Override
    public void visitIntInsn(int i, int i2) {
        this.f6563mv.visitIntInsn(i, i2);
        if (!this.constructor || i == 188) {
            return;
        }
        pushValue(OTHER);
    }

    @Override
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.f6563mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
        if (this.constructor) {
            for (Type type : Type.getArgumentTypes(str2)) {
                popValue();
                if (type.getSize() == 2) {
                    popValue();
                }
            }
            Type returnType = Type.getReturnType(str2);
            if (returnType != Type.VOID_TYPE) {
                pushValue(OTHER);
                if (returnType.getSize() == 2) {
                    pushValue(OTHER);
                }
            }
        }
    }

    @Override
    public void visitJumpInsn(int i, Label label) {
        this.f6563mv.visitJumpInsn(i, label);
        if (this.constructor) {
            switch (i) {
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 198:
                case 199:
                    popValue();
                    break;
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                    popValue();
                    popValue();
                    break;
                case 168:
                    pushValue(OTHER);
                    break;
            }
            addBranch(label);
        }
    }

    @Override
    public void visitLabel(Label label) {
        List list;
        this.f6563mv.visitLabel(label);
        if (!this.constructor || this.branches == null || (list = (List) this.branches.get(label)) == null) {
            return;
        }
        this.stackFrame = list;
        this.branches.remove(label);
    }

    @Override
    public void visitLdcInsn(Object obj) {
        this.f6563mv.visitLdcInsn(obj);
        if (this.constructor) {
            pushValue(OTHER);
            if ((obj instanceof Double) || (obj instanceof Long)) {
                pushValue(OTHER);
            }
        }
    }

    @Override
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.f6563mv.visitLookupSwitchInsn(label, iArr, labelArr);
        if (this.constructor) {
            popValue();
            addBranches(label, labelArr);
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
        this.f6563mv.visitMultiANewArrayInsn(str, i);
        if (this.constructor) {
            for (int i2 = 0; i2 < i; i2++) {
                popValue();
            }
            pushValue(OTHER);
        }
    }

    @Override
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        this.f6563mv.visitTableSwitchInsn(i, i2, label, labelArr);
        if (this.constructor) {
            popValue();
            addBranches(label, labelArr);
        }
    }

    @Override
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        super.visitTryCatchBlock(label, label2, label3, str);
        if (!this.constructor || this.branches.containsKey(label3)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(OTHER);
        this.branches.put(label3, arrayList);
    }

    @Override
    public void visitTypeInsn(int i, String str) {
        this.f6563mv.visitTypeInsn(i, str);
        if (this.constructor && i == 187) {
            pushValue(OTHER);
        }
    }

    @Override
    public void visitVarInsn(int i, int i2) {
        super.visitVarInsn(i, i2);
        if (this.constructor) {
            switch (i) {
                case 21:
                case 23:
                    pushValue(OTHER);
                    break;
                case 22:
                case 24:
                    pushValue(OTHER);
                    pushValue(OTHER);
                    break;
                case 25:
                    pushValue(i2 == 0 ? THIS : OTHER);
                    break;
                case 54:
                case 56:
                case 58:
                    popValue();
                    break;
                case 55:
                case 57:
                    popValue();
                    popValue();
                    break;
            }
        }
    }
}
