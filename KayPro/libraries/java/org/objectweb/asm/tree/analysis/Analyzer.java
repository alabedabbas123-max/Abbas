package org.objectweb.asm.tree.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.IincInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.VarInsnNode;

public class Analyzer implements Opcodes {
    private Frame[] frames;
    private List[] handlers;
    private InsnList insns;
    private final Interpreter interpreter;

    private int f6687n;
    private int[] queue;
    private boolean[] queued;
    private Subroutine[] subroutines;

    private int f6688top;

    public Analyzer(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    private void findSubroutine(int i, Subroutine subroutine, List list) throws AnalyzerException {
        while (i >= 0 && i < this.f6687n) {
            if (this.subroutines[i] == null) {
                this.subroutines[i] = subroutine.copy();
                AbstractInsnNode abstractInsnNodeM9027get = this.insns.m9027get(i);
                if (abstractInsnNodeM9027get instanceof JumpInsnNode) {
                    if (abstractInsnNodeM9027get.getOpcode() == 168) {
                        list.add(abstractInsnNodeM9027get);
                    } else {
                        findSubroutine(this.insns.indexOf(((JumpInsnNode) abstractInsnNodeM9027get).label), subroutine, list);
                    }
                } else if (abstractInsnNodeM9027get instanceof TableSwitchInsnNode) {
                    TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) abstractInsnNodeM9027get;
                    findSubroutine(this.insns.indexOf(tableSwitchInsnNode.dflt), subroutine, list);
                    for (int size = tableSwitchInsnNode.labels.size() - 1; size >= 0; size--) {
                        findSubroutine(this.insns.indexOf((LabelNode) tableSwitchInsnNode.labels.get(size)), subroutine, list);
                    }
                } else if (abstractInsnNodeM9027get instanceof LookupSwitchInsnNode) {
                    LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) abstractInsnNodeM9027get;
                    findSubroutine(this.insns.indexOf(lookupSwitchInsnNode.dflt), subroutine, list);
                    for (int size2 = lookupSwitchInsnNode.labels.size() - 1; size2 >= 0; size2--) {
                        findSubroutine(this.insns.indexOf((LabelNode) lookupSwitchInsnNode.labels.get(size2)), subroutine, list);
                    }
                }
                List list2 = this.handlers[i];
                if (list2 != null) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 < list2.size()) {
                            findSubroutine(this.insns.indexOf(((TryCatchBlockNode) list2.get(i3)).handler), subroutine, list);
                            i2 = i3 + 1;
                        }
                    }
                }
                switch (abstractInsnNodeM9027get.getOpcode()) {
                    case 167:
                    case 169:
                    case 170:
                    case 171:
                    case 172:
                    case 173:
                    case 174:
                    case 175:
                    case 176:
                    case 177:
                    case 191:
                        return;
                    case 168:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                    case 182:
                    case 183:
                    case 184:
                    case 185:
                    case 186:
                    case 187:
                    case 188:
                    case 189:
                    case 190:
                    default:
                        i++;
                        break;
                }
            } else {
                return;
            }
        }
        throw new AnalyzerException(null, "Execution can fall off end of the code");
    }

    private void merge(int i, Frame frame, Frame frame2, Subroutine subroutine, boolean[] zArr) throws AnalyzerException {
        boolean zMerge;
        Frame frame3 = this.frames[i];
        Subroutine subroutine2 = this.subroutines[i];
        frame2.merge(frame, zArr);
        if (frame3 == null) {
            this.frames[i] = newFrame(frame2);
            zMerge = true;
        } else {
            zMerge = frame3.merge(frame2, this.interpreter);
        }
        if (subroutine2 != null && subroutine != null) {
            zMerge |= subroutine2.merge(subroutine);
        }
        if (!zMerge || this.queued[i]) {
            return;
        }
        this.queued[i] = true;
        int[] iArr = this.queue;
        int i2 = this.f6688top;
        this.f6688top = i2 + 1;
        iArr[i2] = i;
    }

    private void merge(int i, Frame frame, Subroutine subroutine) throws AnalyzerException {
        boolean zMerge;
        Frame frame2 = this.frames[i];
        Subroutine subroutine2 = this.subroutines[i];
        if (frame2 == null) {
            this.frames[i] = newFrame(frame);
            zMerge = true;
        } else {
            zMerge = frame2.merge(frame, this.interpreter);
        }
        if (subroutine2 == null) {
            if (subroutine != null) {
                this.subroutines[i] = subroutine.copy();
                zMerge = true;
            }
        } else if (subroutine != null) {
            zMerge |= subroutine2.merge(subroutine);
        }
        if (!zMerge || this.queued[i]) {
            return;
        }
        this.queued[i] = true;
        int[] iArr = this.queue;
        int i2 = this.f6688top;
        this.f6688top = i2 + 1;
        iArr[i2] = i;
    }

    public Frame[] analyze(String str, MethodNode methodNode) throws AnalyzerException {
        int i;
        if ((methodNode.access & 1280) != 0) {
            this.frames = new Frame[0];
            return this.frames;
        }
        this.f6687n = methodNode.instructions.size();
        this.insns = methodNode.instructions;
        this.handlers = new List[this.f6687n];
        this.frames = new Frame[this.f6687n];
        this.subroutines = new Subroutine[this.f6687n];
        this.queued = new boolean[this.f6687n];
        this.queue = new int[this.f6687n];
        this.f6688top = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= methodNode.tryCatchBlocks.size()) {
                break;
            }
            TryCatchBlockNode tryCatchBlockNode = (TryCatchBlockNode) methodNode.tryCatchBlocks.get(i3);
            int iIndexOf = this.insns.indexOf(tryCatchBlockNode.start);
            int iIndexOf2 = this.insns.indexOf(tryCatchBlockNode.f6685end);
            for (int i4 = iIndexOf; i4 < iIndexOf2; i4++) {
                List arrayList = this.handlers[i4];
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.handlers[i4] = arrayList;
                }
                arrayList.add(tryCatchBlockNode);
            }
            i2 = i3 + 1;
        }
        Subroutine subroutine = new Subroutine(null, methodNode.maxLocals, null);
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        findSubroutine(0, subroutine, arrayList2);
        while (!arrayList2.isEmpty()) {
            JumpInsnNode jumpInsnNode = (JumpInsnNode) arrayList2.remove(0);
            Subroutine subroutine2 = (Subroutine) map.get(jumpInsnNode.label);
            if (subroutine2 == null) {
                Subroutine subroutine3 = new Subroutine(jumpInsnNode.label, methodNode.maxLocals, jumpInsnNode);
                map.put(jumpInsnNode.label, subroutine3);
                findSubroutine(this.insns.indexOf(jumpInsnNode.label), subroutine3, arrayList2);
            } else {
                subroutine2.callers.add(jumpInsnNode);
            }
        }
        for (int i5 = 0; i5 < this.f6687n; i5++) {
            if (this.subroutines[i5] != null && this.subroutines[i5].start == null) {
                this.subroutines[i5] = null;
            }
        }
        Frame frameNewFrame = newFrame(methodNode.maxLocals, methodNode.maxStack);
        Frame frameNewFrame2 = newFrame(methodNode.maxLocals, methodNode.maxStack);
        frameNewFrame.setReturn(this.interpreter.newValue(Type.getReturnType(methodNode.desc)));
        Type[] argumentTypes = Type.getArgumentTypes(methodNode.desc);
        if ((methodNode.access & 8) == 0) {
            i = 1;
            frameNewFrame.setLocal(0, this.interpreter.newValue(Type.getObjectType(str)));
        } else {
            i = 0;
        }
        int i6 = i;
        for (int i7 = 0; i7 < argumentTypes.length; i7++) {
            int i8 = i6 + 1;
            frameNewFrame.setLocal(i6, this.interpreter.newValue(argumentTypes[i7]));
            if (argumentTypes[i7].getSize() == 2) {
                i6 = i8 + 1;
                frameNewFrame.setLocal(i8, this.interpreter.newValue(null));
            } else {
                i6 = i8;
            }
        }
        while (i6 < methodNode.maxLocals) {
            frameNewFrame.setLocal(i6, this.interpreter.newValue(null));
            i6++;
        }
        merge(0, frameNewFrame, null);
        init(str, methodNode);
        while (this.f6688top > 0) {
            int[] iArr = this.queue;
            int i9 = this.f6688top - 1;
            this.f6688top = i9;
            int i10 = iArr[i9];
            Frame frame = this.frames[i10];
            Subroutine subroutineCopy = this.subroutines[i10];
            this.queued[i10] = false;
            AbstractInsnNode abstractInsnNodeM9027get = null;
            try {
                abstractInsnNodeM9027get = methodNode.instructions.m9027get(i10);
                int opcode = abstractInsnNodeM9027get.getOpcode();
                int type = abstractInsnNodeM9027get.getType();
                if (type == 8 || type == 15 || type == 14) {
                    merge(i10 + 1, frame, subroutineCopy);
                    newControlFlowEdge(i10, i10 + 1);
                } else {
                    frameNewFrame.init(frame).execute(abstractInsnNodeM9027get, this.interpreter);
                    subroutineCopy = subroutineCopy == null ? null : subroutineCopy.copy();
                    if (abstractInsnNodeM9027get instanceof JumpInsnNode) {
                        JumpInsnNode jumpInsnNode2 = (JumpInsnNode) abstractInsnNodeM9027get;
                        if (opcode != 167 && opcode != 168) {
                            merge(i10 + 1, frameNewFrame, subroutineCopy);
                            newControlFlowEdge(i10, i10 + 1);
                        }
                        int iIndexOf3 = this.insns.indexOf(jumpInsnNode2.label);
                        if (opcode == 168) {
                            merge(iIndexOf3, frameNewFrame, new Subroutine(jumpInsnNode2.label, methodNode.maxLocals, jumpInsnNode2));
                        } else {
                            merge(iIndexOf3, frameNewFrame, subroutineCopy);
                        }
                        newControlFlowEdge(i10, iIndexOf3);
                    } else if (abstractInsnNodeM9027get instanceof LookupSwitchInsnNode) {
                        LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) abstractInsnNodeM9027get;
                        int iIndexOf4 = this.insns.indexOf(lookupSwitchInsnNode.dflt);
                        merge(iIndexOf4, frameNewFrame, subroutineCopy);
                        newControlFlowEdge(i10, iIndexOf4);
                        for (int i11 = 0; i11 < lookupSwitchInsnNode.labels.size(); i11++) {
                            int iIndexOf5 = this.insns.indexOf((LabelNode) lookupSwitchInsnNode.labels.get(i11));
                            merge(iIndexOf5, frameNewFrame, subroutineCopy);
                            newControlFlowEdge(i10, iIndexOf5);
                        }
                    } else if (abstractInsnNodeM9027get instanceof TableSwitchInsnNode) {
                        TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) abstractInsnNodeM9027get;
                        int iIndexOf6 = this.insns.indexOf(tableSwitchInsnNode.dflt);
                        merge(iIndexOf6, frameNewFrame, subroutineCopy);
                        newControlFlowEdge(i10, iIndexOf6);
                        for (int i12 = 0; i12 < tableSwitchInsnNode.labels.size(); i12++) {
                            int iIndexOf7 = this.insns.indexOf((LabelNode) tableSwitchInsnNode.labels.get(i12));
                            merge(iIndexOf7, frameNewFrame, subroutineCopy);
                            newControlFlowEdge(i10, iIndexOf7);
                        }
                    } else if (opcode == 169) {
                        if (subroutineCopy == null) {
                            throw new AnalyzerException(abstractInsnNodeM9027get, "RET instruction outside of a sub routine");
                        }
                        for (int i13 = 0; i13 < subroutineCopy.callers.size(); i13++) {
                            int iIndexOf8 = this.insns.indexOf((JumpInsnNode) subroutineCopy.callers.get(i13));
                            if (this.frames[iIndexOf8] != null) {
                                merge(iIndexOf8 + 1, this.frames[iIndexOf8], frameNewFrame, this.subroutines[iIndexOf8], subroutineCopy.access);
                                newControlFlowEdge(i10, iIndexOf8 + 1);
                            }
                        }
                    } else if (opcode != 191 && (opcode < 172 || opcode > 177)) {
                        if (subroutineCopy != null) {
                            if (abstractInsnNodeM9027get instanceof VarInsnNode) {
                                int i14 = ((VarInsnNode) abstractInsnNodeM9027get).f6686var;
                                subroutineCopy.access[i14] = true;
                                if (opcode == 22 || opcode == 24 || opcode == 55 || opcode == 57) {
                                    subroutineCopy.access[i14 + 1] = true;
                                }
                            } else if (abstractInsnNodeM9027get instanceof IincInsnNode) {
                                subroutineCopy.access[((IincInsnNode) abstractInsnNodeM9027get).f6677var] = true;
                            }
                        }
                        merge(i10 + 1, frameNewFrame, subroutineCopy);
                        newControlFlowEdge(i10, i10 + 1);
                    }
                }
                List list = this.handlers[i10];
                if (list != null) {
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        TryCatchBlockNode tryCatchBlockNode2 = (TryCatchBlockNode) list.get(i15);
                        Type objectType = tryCatchBlockNode2.type == null ? Type.getObjectType("java/lang/Throwable") : Type.getObjectType(tryCatchBlockNode2.type);
                        int iIndexOf9 = this.insns.indexOf(tryCatchBlockNode2.handler);
                        if (newControlFlowExceptionEdge(i10, tryCatchBlockNode2)) {
                            frameNewFrame2.init(frame);
                            frameNewFrame2.clearStack();
                            frameNewFrame2.push(this.interpreter.newValue(objectType));
                            merge(iIndexOf9, frameNewFrame2, subroutineCopy);
                        }
                    }
                }
            } catch (AnalyzerException e) {
                throw new AnalyzerException(e.node, new StringBuffer().append("Error at instruction ").append(i10).append(": ").append(e.getMessage()).toString(), e);
            } catch (Exception e2) {
                throw new AnalyzerException(abstractInsnNodeM9027get, new StringBuffer().append("Error at instruction ").append(i10).append(": ").append(e2.getMessage()).toString(), e2);
            }
        }
        return this.frames;
    }

    public Frame[] getFrames() {
        return this.frames;
    }

    public List getHandlers(int i) {
        return this.handlers[i];
    }

    protected void init(String str, MethodNode methodNode) throws AnalyzerException {
    }

    protected void newControlFlowEdge(int i, int i2) {
    }

    protected boolean newControlFlowExceptionEdge(int i, int i2) {
        return true;
    }

    protected boolean newControlFlowExceptionEdge(int i, TryCatchBlockNode tryCatchBlockNode) {
        return newControlFlowExceptionEdge(i, this.insns.indexOf(tryCatchBlockNode.handler));
    }

    protected Frame newFrame(int i, int i2) {
        return new Frame(i, i2);
    }

    protected Frame newFrame(Frame frame) {
        return new Frame(frame);
    }
}
