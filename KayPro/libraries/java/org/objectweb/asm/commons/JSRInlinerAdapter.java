package org.objectweb.asm.commons;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

public class JSRInlinerAdapter extends MethodNode implements Opcodes {

    static Class f6667xb2a9f25f = class$("org.objectweb.asm.commons.JSRInlinerAdapter");
    final BitSet dualCitizens;
    private final BitSet mainSubroutine;
    private final Map subroutineHeads;

    class Instantiation extends AbstractMap {
        final Instantiation previous;
        public final Map rangeTable = new HashMap();
        public final LabelNode returnLabel;
        public final BitSet subroutine;
        final JSRInlinerAdapter this$0;

        Instantiation(JSRInlinerAdapter jSRInlinerAdapter, Instantiation instantiation, BitSet bitSet) {
            this.this$0 = jSRInlinerAdapter;
            this.previous = instantiation;
            this.subroutine = bitSet;
            for (Instantiation instantiation2 = instantiation; instantiation2 != null; instantiation2 = instantiation2.previous) {
                if (instantiation2.subroutine == bitSet) {
                    throw new RuntimeException(new StringBuffer().append("Recursive invocation of ").append(bitSet).toString());
                }
            }
            if (instantiation != null) {
                this.returnLabel = new LabelNode();
            } else {
                this.returnLabel = null;
            }
            int size = jSRInlinerAdapter.instructions.size();
            LabelNode labelNode = null;
            for (int i = 0; i < size; i++) {
                AbstractInsnNode abstractInsnNodeM9027get = jSRInlinerAdapter.instructions.m9027get(i);
                if (abstractInsnNodeM9027get.getType() == 8) {
                    LabelNode labelNode2 = (LabelNode) abstractInsnNodeM9027get;
                    labelNode = labelNode == null ? new LabelNode() : labelNode;
                    this.rangeTable.put(labelNode2, labelNode);
                } else if (findOwner(i) == this) {
                    labelNode = null;
                }
            }
        }

        @Override
        public Set entrySet() {
            return null;
        }

        public Instantiation findOwner(int i) {
            if (!this.subroutine.get(i)) {
                return null;
            }
            if (!this.this$0.dualCitizens.get(i)) {
                return this;
            }
            for (Instantiation instantiation = this.previous; instantiation != null; instantiation = instantiation.previous) {
                if (instantiation.subroutine.get(i)) {
                    this = instantiation;
                }
            }
            return this;
        }

        @Override
        public Object get(Object obj) {
            return get(obj);
        }

        @Override
        public LabelNode get(Object obj) {
            return gotoLabel((LabelNode) obj);
        }

        public LabelNode gotoLabel(LabelNode labelNode) {
            return (LabelNode) findOwner(this.this$0.instructions.indexOf(labelNode)).rangeTable.get(labelNode);
        }

        public LabelNode rangeLabel(LabelNode labelNode) {
            return (LabelNode) this.rangeTable.get(labelNode);
        }
    }

    protected JSRInlinerAdapter(int i, MethodVisitor methodVisitor, int i2, String str, String str2, String str3, String[] strArr) {
        super(i, i2, str, str2, str3, strArr);
        this.subroutineHeads = new HashMap();
        this.mainSubroutine = new BitSet();
        this.dualCitizens = new BitSet();
        this.f6563mv = methodVisitor;
    }

    public JSRInlinerAdapter(MethodVisitor methodVisitor, int i, String str, String str2, String str3, String[] strArr) {
        this(Opcodes.ASM5, methodVisitor, i, str, str2, str3, strArr);
        if (getClass() != f6667xb2a9f25f) {
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

    private void emitCode() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Instantiation(this, null, this.mainSubroutine));
        InsnList insnList = new InsnList();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        while (!linkedList.isEmpty()) {
            emitSubroutine((Instantiation) linkedList.removeFirst(), linkedList, insnList, arrayList, arrayList2);
        }
        this.instructions = insnList;
        this.tryCatchBlocks = arrayList;
        this.localVariables = arrayList2;
    }

    private void emitSubroutine(Instantiation instantiation, List list, InsnList insnList, List list2, List list3) {
        LabelNode labelNodeRangeLabel;
        int size = this.instructions.size();
        int i = 0;
        LabelNode labelNode = null;
        while (i < size) {
            AbstractInsnNode abstractInsnNodeM9027get = this.instructions.m9027get(i);
            Instantiation instantiationFindOwner = instantiation.findOwner(i);
            if (abstractInsnNodeM9027get.getType() == 8) {
                labelNodeRangeLabel = instantiation.rangeLabel((LabelNode) abstractInsnNodeM9027get);
                if (labelNodeRangeLabel != labelNode) {
                    insnList.m9025add(labelNodeRangeLabel);
                } else {
                    labelNodeRangeLabel = labelNode;
                }
            } else if (instantiationFindOwner != instantiation) {
                labelNodeRangeLabel = labelNode;
            } else if (abstractInsnNodeM9027get.getOpcode() == 169) {
                LabelNode labelNode2 = null;
                for (Instantiation instantiation2 = instantiation; instantiation2 != null; instantiation2 = instantiation2.previous) {
                    if (instantiation2.subroutine.get(i)) {
                        labelNode2 = instantiation2.returnLabel;
                    }
                }
                if (labelNode2 == null) {
                    throw new RuntimeException(new StringBuffer().append("Instruction #").append(i).append(" is a RET not owned by any subroutine").toString());
                }
                insnList.m9025add(new JumpInsnNode(167, labelNode2));
                labelNodeRangeLabel = labelNode;
            } else if (abstractInsnNodeM9027get.getOpcode() == 168) {
                LabelNode labelNode3 = ((JumpInsnNode) abstractInsnNodeM9027get).label;
                Instantiation instantiation3 = new Instantiation(this, instantiation, (BitSet) this.subroutineHeads.get(labelNode3));
                LabelNode labelNodeGotoLabel = instantiation3.gotoLabel(labelNode3);
                insnList.m9025add(new InsnNode(1));
                insnList.m9025add(new JumpInsnNode(167, labelNodeGotoLabel));
                insnList.m9025add(instantiation3.returnLabel);
                list.add(instantiation3);
                labelNodeRangeLabel = labelNode;
            } else {
                insnList.m9025add(abstractInsnNodeM9027get.clone(instantiation));
                labelNodeRangeLabel = labelNode;
            }
            i++;
            labelNode = labelNodeRangeLabel;
        }
        for (TryCatchBlockNode tryCatchBlockNode : this.tryCatchBlocks) {
            LabelNode labelNodeRangeLabel2 = instantiation.rangeLabel(tryCatchBlockNode.start);
            LabelNode labelNodeRangeLabel3 = instantiation.rangeLabel(tryCatchBlockNode.f6685end);
            if (labelNodeRangeLabel2 != labelNodeRangeLabel3) {
                LabelNode labelNodeGotoLabel2 = instantiation.gotoLabel(tryCatchBlockNode.handler);
                if (labelNodeRangeLabel2 == null || labelNodeRangeLabel3 == null || labelNodeGotoLabel2 == null) {
                    throw new RuntimeException("Internal error!");
                }
                list2.add(new TryCatchBlockNode(labelNodeRangeLabel2, labelNodeRangeLabel3, labelNodeGotoLabel2, tryCatchBlockNode.type));
            }
        }
        for (LocalVariableNode localVariableNode : this.localVariables) {
            LabelNode labelNodeRangeLabel4 = instantiation.rangeLabel(localVariableNode.start);
            LabelNode labelNodeRangeLabel5 = instantiation.rangeLabel(localVariableNode.f6681end);
            if (labelNodeRangeLabel4 != labelNodeRangeLabel5) {
                list3.add(new LocalVariableNode(localVariableNode.name, localVariableNode.desc, localVariableNode.signature, labelNodeRangeLabel4, labelNodeRangeLabel5, localVariableNode.index));
            }
        }
    }

    private static void m9019log(String str) {
        System.err.println(str);
    }

    private void markSubroutineWalk(BitSet bitSet, int i, BitSet bitSet2) {
        boolean z;
        markSubroutineWalkDFS(bitSet, i, bitSet2);
        boolean z2 = true;
        while (z2) {
            z2 = false;
            for (TryCatchBlockNode tryCatchBlockNode : this.tryCatchBlocks) {
                int iIndexOf = this.instructions.indexOf(tryCatchBlockNode.handler);
                if (!bitSet.get(iIndexOf)) {
                    int iIndexOf2 = this.instructions.indexOf(tryCatchBlockNode.start);
                    int iIndexOf3 = this.instructions.indexOf(tryCatchBlockNode.f6685end);
                    int iNextSetBit = bitSet.nextSetBit(iIndexOf2);
                    if (iNextSetBit == -1 || iNextSetBit >= iIndexOf3) {
                        z = z2;
                    } else {
                        markSubroutineWalkDFS(bitSet, iIndexOf, bitSet2);
                        z = true;
                    }
                    z2 = z;
                }
            }
        }
    }

    /* JADX WARN: Switch 'out' block B:2:0x0000 for B:24:0x00b0 already processed. Defaulting to fallback option. */
    private void markSubroutineWalkDFS(BitSet bitSet, int i, BitSet bitSet2) {
        do {
            AbstractInsnNode abstractInsnNodeM9027get = this.instructions.m9027get(i);
            if (!bitSet.get(i)) {
                bitSet.set(i);
                if (bitSet2.get(i)) {
                    this.dualCitizens.set(i);
                }
                bitSet2.set(i);
                if (abstractInsnNodeM9027get.getType() == 7 && abstractInsnNodeM9027get.getOpcode() != 168) {
                    markSubroutineWalkDFS(bitSet, this.instructions.indexOf(((JumpInsnNode) abstractInsnNodeM9027get).label), bitSet2);
                }
                if (abstractInsnNodeM9027get.getType() == 11) {
                    TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) abstractInsnNodeM9027get;
                    markSubroutineWalkDFS(bitSet, this.instructions.indexOf(tableSwitchInsnNode.dflt), bitSet2);
                    for (int size = tableSwitchInsnNode.labels.size() - 1; size >= 0; size--) {
                        markSubroutineWalkDFS(bitSet, this.instructions.indexOf((LabelNode) tableSwitchInsnNode.labels.get(size)), bitSet2);
                    }
                }
                if (abstractInsnNodeM9027get.getType() == 12) {
                    LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) abstractInsnNodeM9027get;
                    markSubroutineWalkDFS(bitSet, this.instructions.indexOf(lookupSwitchInsnNode.dflt), bitSet2);
                    for (int size2 = lookupSwitchInsnNode.labels.size() - 1; size2 >= 0; size2--) {
                        markSubroutineWalkDFS(bitSet, this.instructions.indexOf((LabelNode) lookupSwitchInsnNode.labels.get(size2)), bitSet2);
                    }
                }
                switch (this.instructions.m9027get(i).getOpcode()) {
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
        } while (i < this.instructions.size());
    }

    private void markSubroutines() {
        BitSet bitSet = new BitSet();
        markSubroutineWalk(this.mainSubroutine, 0, bitSet);
        for (Map.Entry entry : this.subroutineHeads.entrySet()) {
            markSubroutineWalk((BitSet) entry.getValue(), this.instructions.indexOf((LabelNode) entry.getKey()), bitSet);
        }
    }

    @Override
    public void visitEnd() {
        if (!this.subroutineHeads.isEmpty()) {
            markSubroutines();
            emitCode();
        }
        if (this.f6563mv != null) {
            accept(this.f6563mv);
        }
    }

    @Override
    public void visitJumpInsn(int i, Label label) {
        super.visitJumpInsn(i, label);
        LabelNode labelNode = ((JumpInsnNode) this.instructions.getLast()).label;
        if (i != 168 || this.subroutineHeads.containsKey(labelNode)) {
            return;
        }
        this.subroutineHeads.put(labelNode, new BitSet());
    }
}
