package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.Rop;
import com.almlkaide.kaypro.android.dx.rop.code.Exceptions;
import com.almlkaide.kaypro.android.dx.rop.code.FillArrayDataInsn;
import com.almlkaide.kaypro.android.dx.rop.code.Insn;
import com.almlkaide.kaypro.android.dx.rop.code.PlainCstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.PlainInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.Rops;
import com.almlkaide.kaypro.android.dx.rop.code.ThrowingCstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.ThrowingInsn;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLiteralBits;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.cst.TypedConstant;
import com.almlkaide.kaypro.android.dx.rop.cst.Zeroes;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import com.almlkaide.kaypro.android.dx.util.ToHuman;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

public class EscapeAnalysis {
    private final ArrayList<EscapeSet> latticeValues = new ArrayList<>();
    private final int regCount;
    private final SsaMethod ssaMeth;

    static class EscapeSet {
        ArrayList<EscapeSet> childSets;
        EscapeState escape;
        ArrayList<EscapeSet> parentSets;
        BitSet regSet;
        boolean replaceableArray;

        EscapeSet(int i, int i2, EscapeState escapeState) {
            this.regSet = new BitSet(i2);
            this.regSet.set(i);
            this.escape = escapeState;
            this.childSets = new ArrayList<>();
            this.parentSets = new ArrayList<>();
            this.replaceableArray = false;
        }
    }

    public enum EscapeState {
        TOP,
        NONE,
        METHOD,
        INTER,
        GLOBAL;

        public static EscapeState valueOf(String str) {
            for (EscapeState escapeState : values()) {
                if (escapeState.name().equals(str)) {
                    return escapeState;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    EscapeAnalysis(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
        this.regCount = ssaMethod.getRegCount();
    }

    private int findSetIndex(RegisterSpec registerSpec) {
        int i;
        int i2 = 0;
        while (true) {
            i = i2;
            if (i >= this.latticeValues.size() || this.latticeValues.get(i).regSet.get(registerSpec.getReg())) {
                break;
            }
            i2 = i + 1;
        }
        return i;
    }

    private SsaInsn getInsnForMove(SsaInsn ssaInsn) {
        ArrayList<SsaInsn> insns = this.ssaMeth.getBlocks().get(ssaInsn.getBlock().getPredecessors().nextSetBit(0)).getInsns();
        return insns.get(insns.size() - 1);
    }

    private SsaInsn getMoveForInsn(SsaInsn ssaInsn) {
        return this.ssaMeth.getBlocks().get(ssaInsn.getBlock().getSuccessors().nextSetBit(0)).getInsns().get(0);
    }

    private void addEdge(EscapeSet escapeSet, EscapeSet escapeSet2) {
        if (!escapeSet2.parentSets.contains(escapeSet)) {
            escapeSet2.parentSets.add(escapeSet);
        }
        if (escapeSet.childSets.contains(escapeSet2)) {
            return;
        }
        escapeSet.childSets.add(escapeSet2);
    }

    private void replaceNode(EscapeSet escapeSet, EscapeSet escapeSet2) {
        for (EscapeSet escapeSet3 : escapeSet2.parentSets) {
            escapeSet3.childSets.remove(escapeSet2);
            escapeSet3.childSets.add(escapeSet);
            escapeSet.parentSets.add(escapeSet3);
        }
        for (EscapeSet escapeSet4 : escapeSet2.childSets) {
            escapeSet4.parentSets.remove(escapeSet2);
            escapeSet4.parentSets.add(escapeSet);
            escapeSet.childSets.add(escapeSet4);
        }
    }

    public static void process(SsaMethod ssaMethod) {
        new EscapeAnalysis(ssaMethod).m7204run();
    }

    public void processInsn(SsaInsn ssaInsn) {
        int opcode = ssaInsn.getOpcode().getOpcode();
        RegisterSpec result = ssaInsn.getResult();
        if (opcode == 56 && result.getTypeBearer().getBasicType() == 9) {
            processRegister(result, processMoveResultPseudoInsn(ssaInsn));
            return;
        }
        if (opcode == 3 && result.getTypeBearer().getBasicType() == 9) {
            EscapeSet escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.NONE);
            this.latticeValues.add(escapeSet);
            processRegister(result, escapeSet);
        } else if (opcode == 55 && result.getTypeBearer().getBasicType() == 9) {
            EscapeSet escapeSet2 = new EscapeSet(result.getReg(), this.regCount, EscapeState.NONE);
            this.latticeValues.add(escapeSet2);
            processRegister(result, escapeSet2);
        }
    }

    private EscapeSet processMoveResultPseudoInsn(SsaInsn ssaInsn) {
        EscapeSet escapeSet;
        RegisterSpec result = ssaInsn.getResult();
        SsaInsn insnForMove = getInsnForMove(ssaInsn);
        switch (insnForMove.getOpcode().getOpcode()) {
            case 5:
            case 40:
                escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.NONE);
                break;
            case 38:
            case 43:
            case 45:
                RegisterSpec registerSpecM7188get = insnForMove.getSources().m7188get(0);
                int iFindSetIndex = findSetIndex(registerSpecM7188get);
                if (iFindSetIndex != this.latticeValues.size()) {
                    EscapeSet escapeSet2 = this.latticeValues.get(iFindSetIndex);
                    escapeSet2.regSet.set(result.getReg());
                    return escapeSet2;
                }
                if (registerSpecM7188get.getType() == Type.KNOWN_NULL) {
                    escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.NONE);
                } else {
                    escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.GLOBAL);
                }
                break;
                break;
            case 41:
            case 42:
                if (insnForMove.getSources().m7188get(0).getTypeBearer().isConstant()) {
                    escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.NONE);
                    escapeSet.replaceableArray = true;
                } else {
                    escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.GLOBAL);
                }
                break;
            case 46:
                escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.GLOBAL);
                break;
            default:
                return (EscapeSet) null;
        }
        this.latticeValues.add(escapeSet);
        return escapeSet;
    }

    private void processRegister(RegisterSpec registerSpec, EscapeSet escapeSet) {
        ArrayList<RegisterSpec> arrayList = new ArrayList<>();
        arrayList.add(registerSpec);
        while (!arrayList.isEmpty()) {
            RegisterSpec registerSpecRemove = arrayList.remove(arrayList.size() - 1);
            for (SsaInsn ssaInsn : this.ssaMeth.getUseListForRegister(registerSpecRemove.getReg())) {
                if (ssaInsn.getOpcode() == null) {
                    processPhiUse(ssaInsn, escapeSet, arrayList);
                } else {
                    processUse(registerSpecRemove, ssaInsn, escapeSet, arrayList);
                }
            }
        }
    }

    private void processPhiUse(SsaInsn ssaInsn, EscapeSet escapeSet, ArrayList<RegisterSpec> arrayList) {
        int iFindSetIndex = findSetIndex(ssaInsn.getResult());
        if (iFindSetIndex != this.latticeValues.size()) {
            EscapeSet escapeSet2 = this.latticeValues.get(iFindSetIndex);
            if (escapeSet2 != escapeSet) {
                escapeSet.replaceableArray = false;
                escapeSet.regSet.or(escapeSet2.regSet);
                if (escapeSet.escape.compareTo(escapeSet2.escape) < 0) {
                    escapeSet.escape = escapeSet2.escape;
                }
                replaceNode(escapeSet, escapeSet2);
                this.latticeValues.remove(iFindSetIndex);
                return;
            }
            return;
        }
        escapeSet.regSet.set(ssaInsn.getResult().getReg());
        arrayList.add(ssaInsn.getResult());
    }

    private void processUse(RegisterSpec registerSpec, SsaInsn ssaInsn, EscapeSet escapeSet, ArrayList<RegisterSpec> arrayList) {
        switch (ssaInsn.getOpcode().getOpcode()) {
            case 2:
                escapeSet.regSet.set(ssaInsn.getResult().getReg());
                arrayList.add(ssaInsn.getResult());
                return;
            case 7:
            case 8:
            case 43:
                if (escapeSet.escape.compareTo(EscapeState.METHOD) < 0) {
                    escapeSet.escape = EscapeState.METHOD;
                    return;
                }
                return;
            case 33:
            case 35:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                escapeSet.escape = EscapeState.INTER;
                return;
            case 38:
                if (!ssaInsn.getSources().m7188get(1).getTypeBearer().isConstant()) {
                    escapeSet.replaceableArray = false;
                    return;
                }
                return;
            case 39:
                if (!ssaInsn.getSources().m7188get(2).getTypeBearer().isConstant()) {
                    escapeSet.replaceableArray = false;
                }
                break;
            case 47:
                break;
            case 48:
                escapeSet.escape = EscapeState.GLOBAL;
                return;
            default:
                return;
        }
        if (ssaInsn.getSources().m7188get(0).getTypeBearer().getBasicType() == 9) {
            escapeSet.replaceableArray = false;
            RegisterSpecList sources = ssaInsn.getSources();
            if (sources.m7188get(0).getReg() == registerSpec.getReg()) {
                int iFindSetIndex = findSetIndex(sources.m7188get(1));
                if (iFindSetIndex != this.latticeValues.size()) {
                    EscapeSet escapeSet2 = this.latticeValues.get(iFindSetIndex);
                    addEdge(escapeSet2, escapeSet);
                    if (escapeSet.escape.compareTo(escapeSet2.escape) < 0) {
                        escapeSet.escape = escapeSet2.escape;
                        return;
                    }
                    return;
                }
                return;
            }
            int iFindSetIndex2 = findSetIndex(sources.m7188get(0));
            if (iFindSetIndex2 != this.latticeValues.size()) {
                EscapeSet escapeSet3 = this.latticeValues.get(iFindSetIndex2);
                addEdge(escapeSet, escapeSet3);
                if (escapeSet3.escape.compareTo(escapeSet.escape) < 0) {
                    escapeSet3.escape = escapeSet.escape;
                }
            }
        }
    }

    private void scalarReplacement() {
        for (EscapeSet escapeSet : this.latticeValues) {
            if (escapeSet.replaceableArray && escapeSet.escape == EscapeState.NONE) {
                int iNextSetBit = escapeSet.regSet.nextSetBit(0);
                SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(iNextSetBit);
                SsaInsn insnForMove = getInsnForMove(definitionForRegister);
                int intBits = ((CstLiteralBits) insnForMove.getSources().m7188get(0).getTypeBearer()).getIntBits();
                ArrayList<RegisterSpec> arrayList = new ArrayList<>(intBits);
                HashSet<SsaInsn> hashSet = new HashSet<>();
                replaceDef(definitionForRegister, insnForMove, intBits, arrayList);
                hashSet.add(insnForMove);
                hashSet.add(definitionForRegister);
                for (SsaInsn ssaInsn : this.ssaMeth.getUseListForRegister(iNextSetBit)) {
                    replaceUse(ssaInsn, insnForMove, arrayList, hashSet);
                    hashSet.add(ssaInsn);
                }
                this.ssaMeth.deleteInsns(hashSet);
                this.ssaMeth.onInsnsChanged();
                SsaConverter.updateSsaMethod(this.ssaMeth, this.regCount);
                movePropagate();
            }
        }
    }

    private void replaceDef(SsaInsn ssaInsn, SsaInsn ssaInsn2, int i, ArrayList<RegisterSpec> arrayList) {
        Type type = ssaInsn.getResult().getType();
        for (int i2 = 0; i2 < i; i2++) {
            Constant constantZeroFor = Zeroes.zeroFor(type.getComponentType());
            RegisterSpec registerSpecMake = RegisterSpec.make(this.ssaMeth.makeNewSsaReg(), (TypedConstant) constantZeroFor);
            arrayList.add(registerSpecMake);
            insertPlainInsnBefore(ssaInsn, RegisterSpecList.EMPTY, registerSpecMake, 5, constantZeroFor);
        }
    }

    private void replaceUse(SsaInsn ssaInsn, SsaInsn ssaInsn2, ArrayList<RegisterSpec> arrayList, HashSet<SsaInsn> hashSet) {
        int size = arrayList.size();
        switch (ssaInsn.getOpcode().getOpcode()) {
            case 34:
                ToHuman typeBearer = ssaInsn2.getSources().m7188get(0).getTypeBearer();
                SsaInsn moveForInsn = getMoveForInsn(ssaInsn);
                insertPlainInsnBefore(moveForInsn, RegisterSpecList.EMPTY, moveForInsn.getResult(), 5, (Constant) typeBearer);
                hashSet.add(moveForInsn);
                break;
            case 38:
                SsaInsn moveForInsn2 = getMoveForInsn(ssaInsn);
                RegisterSpecList sources = ssaInsn.getSources();
                int intBits = ((CstLiteralBits) sources.m7188get(1).getTypeBearer()).getIntBits();
                if (intBits < size) {
                    RegisterSpec registerSpec = arrayList.get(intBits);
                    insertPlainInsnBefore(moveForInsn2, RegisterSpecList.make(registerSpec), registerSpec.withReg(moveForInsn2.getResult().getReg()), 2, (Constant) null);
                } else {
                    insertExceptionThrow(moveForInsn2, sources.m7188get(1), hashSet);
                    hashSet.add(moveForInsn2.getBlock().getInsns().get(2));
                }
                hashSet.add(moveForInsn2);
                break;
            case 39:
                RegisterSpecList sources2 = ssaInsn.getSources();
                int intBits2 = ((CstLiteralBits) sources2.m7188get(2).getTypeBearer()).getIntBits();
                if (intBits2 < size) {
                    RegisterSpec registerSpecM7188get = sources2.m7188get(0);
                    RegisterSpec registerSpecWithReg = registerSpecM7188get.withReg(arrayList.get(intBits2).getReg());
                    insertPlainInsnBefore(ssaInsn, RegisterSpecList.make(registerSpecM7188get), registerSpecWithReg, 2, (Constant) null);
                    arrayList.set(intBits2, registerSpecWithReg.withSimpleType());
                } else {
                    insertExceptionThrow(ssaInsn, sources2.m7188get(2), hashSet);
                }
                break;
            case 57:
                ArrayList<Constant> initValues = ((FillArrayDataInsn) ssaInsn.getOriginalRopInsn()).getInitValues();
                for (int i = 0; i < size; i++) {
                    RegisterSpec registerSpecMake = RegisterSpec.make(arrayList.get(i).getReg(), (TypeBearer) ((Constant) initValues.get(i)));
                    insertPlainInsnBefore(ssaInsn, RegisterSpecList.EMPTY, registerSpecMake, 5, initValues.get(i));
                    arrayList.set(i, registerSpecMake);
                }
                break;
        }
    }

    private void movePropagate() {
        for (int i = 0; i < this.ssaMeth.getRegCount(); i++) {
            SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
            if (definitionForRegister != null && definitionForRegister.getOpcode() != null && definitionForRegister.getOpcode().getOpcode() == 2) {
                ArrayList<SsaInsn>[] useListCopy = this.ssaMeth.getUseListCopy();
                RegisterSpec registerSpecM7188get = definitionForRegister.getSources().m7188get(0);
                RegisterSpec result = definitionForRegister.getResult();
                if (registerSpecM7188get.getReg() >= this.regCount || result.getReg() >= this.regCount) {
                    RegisterMapper registerMapper = new RegisterMapper(this, result, registerSpecM7188get) {
                        private final EscapeAnalysis this$0;
                        private final RegisterSpec val$result;
                        private final RegisterSpec val$source;

                        {
                            this.this$0 = this;
                            this.val$result = result;
                            this.val$source = registerSpecM7188get;
                        }

                        @Override
                        public int getNewRegisterCount() {
                            return this.this$0.ssaMeth.getRegCount();
                        }

                        @Override
                        public RegisterSpec mo7199map(RegisterSpec registerSpec) {
                            if (registerSpec.getReg() == this.val$result.getReg()) {
                                return this.val$source;
                            }
                            return registerSpec;
                        }
                    };
                    Iterator<SsaInsn> it = useListCopy[result.getReg()].iterator();
                    while (it.hasNext()) {
                        it.next().mapSourceRegisters(registerMapper);
                    }
                }
            }
        }
    }

    private void m7204run() {
        this.ssaMeth.forEachBlockDepthFirstDom(new AnonymousClass100000002(this));
        for (EscapeSet escapeSet : this.latticeValues) {
            if (escapeSet.escape != EscapeState.NONE) {
                for (EscapeSet escapeSet2 : escapeSet.childSets) {
                    if (escapeSet.escape.compareTo(escapeSet2.escape) > 0) {
                        escapeSet2.escape = escapeSet.escape;
                    }
                }
            }
        }
        scalarReplacement();
    }

    class AnonymousClass100000002 implements SsaBasicBlock.Visitor {
        private final EscapeAnalysis this$0;

        AnonymousClass100000002(EscapeAnalysis escapeAnalysis) {
            this.this$0 = escapeAnalysis;
        }

        @Override
        public void visitBlock(SsaBasicBlock ssaBasicBlock, SsaBasicBlock ssaBasicBlock2) {
            ssaBasicBlock.forEachInsn(new SsaInsn.Visitor(this) {
                private final AnonymousClass100000002 this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
                }

                @Override
                public void visitPhiInsn(PhiInsn phiInsn) {
                }

                @Override
                public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
                    this.this$0.this$0.processInsn(normalSsaInsn);
                }
            });
        }
    }

    private void insertExceptionThrow(SsaInsn ssaInsn, RegisterSpec registerSpec, HashSet<SsaInsn> hashSet) {
        CstType cstType = new CstType(Exceptions.TYPE_ArrayIndexOutOfBoundsException);
        insertThrowingInsnBefore(ssaInsn, RegisterSpecList.EMPTY, (RegisterSpec) null, 40, cstType);
        SsaBasicBlock block = ssaInsn.getBlock();
        SsaBasicBlock ssaBasicBlockInsertNewSuccessor = block.insertNewSuccessor(block.getPrimarySuccessor());
        SsaInsn ssaInsn2 = ssaBasicBlockInsertNewSuccessor.getInsns().get(0);
        RegisterSpec registerSpecMake = RegisterSpec.make(this.ssaMeth.makeNewSsaReg(), cstType);
        insertPlainInsnBefore(ssaInsn2, RegisterSpecList.EMPTY, registerSpecMake, 56, (Constant) null);
        SsaBasicBlock ssaBasicBlockInsertNewSuccessor2 = ssaBasicBlockInsertNewSuccessor.insertNewSuccessor(ssaBasicBlockInsertNewSuccessor.getPrimarySuccessor());
        SsaInsn ssaInsn3 = ssaBasicBlockInsertNewSuccessor2.getInsns().get(0);
        insertThrowingInsnBefore(ssaInsn3, RegisterSpecList.make(registerSpecMake, registerSpec), (RegisterSpec) null, 52, new CstMethodRef(cstType, new CstNat(new CstString("<init>"), new CstString("(I)V"))));
        hashSet.add(ssaInsn3);
        SsaBasicBlock ssaBasicBlockInsertNewSuccessor3 = ssaBasicBlockInsertNewSuccessor2.insertNewSuccessor(ssaBasicBlockInsertNewSuccessor2.getPrimarySuccessor());
        SsaInsn ssaInsn4 = ssaBasicBlockInsertNewSuccessor3.getInsns().get(0);
        insertThrowingInsnBefore(ssaInsn4, RegisterSpecList.make(registerSpecMake), (RegisterSpec) null, 35, (Constant) null);
        ssaBasicBlockInsertNewSuccessor3.replaceSuccessor(ssaBasicBlockInsertNewSuccessor3.getPrimarySuccessorIndex(), this.ssaMeth.getExitBlock().getIndex());
        hashSet.add(ssaInsn4);
    }

    private void insertPlainInsnBefore(SsaInsn ssaInsn, RegisterSpecList registerSpecList, RegisterSpec registerSpec, int i, Constant constant) {
        Rop c1681RopRopFor;
        Insn plainCstInsn;
        Insn originalRopInsn = ssaInsn.getOriginalRopInsn();
        if (i == 56) {
            c1681RopRopFor = Rops.opMoveResultPseudo(registerSpec.getType());
        } else {
            c1681RopRopFor = Rops.ropFor(i, registerSpec, registerSpecList, constant);
        }
        if (constant == null) {
            plainCstInsn = new PlainInsn(c1681RopRopFor, originalRopInsn.getPosition(), registerSpec, registerSpecList);
        } else {
            plainCstInsn = new PlainCstInsn(c1681RopRopFor, originalRopInsn.getPosition(), registerSpec, registerSpecList, constant);
        }
        NormalSsaInsn normalSsaInsn = new NormalSsaInsn(plainCstInsn, ssaInsn.getBlock());
        ArrayList<SsaInsn> insns = ssaInsn.getBlock().getInsns();
        insns.add(insns.lastIndexOf(ssaInsn), normalSsaInsn);
        this.ssaMeth.onInsnAdded(normalSsaInsn);
    }

    private void insertThrowingInsnBefore(SsaInsn ssaInsn, RegisterSpecList registerSpecList, RegisterSpec registerSpec, int i, Constant constant) {
        Insn throwingCstInsn;
        Insn originalRopInsn = ssaInsn.getOriginalRopInsn();
        Rop c1681RopRopFor = Rops.ropFor(i, registerSpec, registerSpecList, constant);
        if (constant == null) {
            throwingCstInsn = new ThrowingInsn(c1681RopRopFor, originalRopInsn.getPosition(), registerSpecList, StdTypeList.EMPTY);
        } else {
            throwingCstInsn = new ThrowingCstInsn(c1681RopRopFor, originalRopInsn.getPosition(), registerSpecList, StdTypeList.EMPTY, constant);
        }
        NormalSsaInsn normalSsaInsn = new NormalSsaInsn(throwingCstInsn, ssaInsn.getBlock());
        ArrayList<SsaInsn> insns = ssaInsn.getBlock().getInsns();
        insns.add(insns.lastIndexOf(ssaInsn), normalSsaInsn);
        this.ssaMeth.onInsnAdded(normalSsaInsn);
    }
}
