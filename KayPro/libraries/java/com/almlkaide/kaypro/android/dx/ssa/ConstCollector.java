package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.Rop;
import com.almlkaide.kaypro.android.dx.rop.code.LocalItem;
import com.almlkaide.kaypro.android.dx.rop.code.PlainCstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.PlainInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.Rops;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.rop.code.ThrowingCstInsn;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.TypedConstant;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ConstCollector {
    private static final boolean COLLECT_ONE_LOCAL = false;
    private static final boolean COLLECT_STRINGS = false;
    private static final int MAX_COLLECTED_CONSTANTS = 5;
    private final SsaMethod ssaMeth;

    public static void process(SsaMethod ssaMethod) {
        new ConstCollector(ssaMethod).m7200run();
    }

    ConstCollector(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
    }

    private void m7200run() {
        int regCount = this.ssaMeth.getRegCount();
        ArrayList<TypedConstant> constsSortedByCountUse = getConstsSortedByCountUse();
        int iMin = Math.min(constsSortedByCountUse.size(), 5);
        SsaBasicBlock entryBlock = this.ssaMeth.getEntryBlock();
        HashMap<TypedConstant, RegisterSpec> map = new HashMap<>(iMin);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < iMin) {
                TypedConstant typedConstant = constsSortedByCountUse.get(i2);
                RegisterSpec registerSpecMake = RegisterSpec.make(this.ssaMeth.makeNewSsaReg(), typedConstant);
                Rop c1681RopOpConst = Rops.opConst(typedConstant);
                if (c1681RopOpConst.getBranchingness() == 1) {
                    entryBlock.addInsnToHead(new PlainCstInsn(Rops.opConst(typedConstant), SourcePosition.NO_INFO, registerSpecMake, RegisterSpecList.EMPTY, typedConstant));
                } else {
                    SsaBasicBlock entryBlock2 = this.ssaMeth.getEntryBlock();
                    SsaBasicBlock primarySuccessor = entryBlock2.getPrimarySuccessor();
                    SsaBasicBlock ssaBasicBlockInsertNewSuccessor = entryBlock2.insertNewSuccessor(primarySuccessor);
                    ssaBasicBlockInsertNewSuccessor.replaceLastInsn(new ThrowingCstInsn(c1681RopOpConst, SourcePosition.NO_INFO, RegisterSpecList.EMPTY, StdTypeList.EMPTY, typedConstant));
                    ssaBasicBlockInsertNewSuccessor.insertNewSuccessor(primarySuccessor).addInsnToHead(new PlainInsn(Rops.opMoveResultPseudo(registerSpecMake.getTypeBearer()), SourcePosition.NO_INFO, registerSpecMake, RegisterSpecList.EMPTY));
                }
                map.put(typedConstant, registerSpecMake);
                i = i2 + 1;
            } else {
                updateConstUses(map, regCount);
                return;
            }
        }
    }

    private ArrayList<TypedConstant> getConstsSortedByCountUse() {
        int regCount = this.ssaMeth.getRegCount();
        HashMap map = new HashMap();
        new HashSet();
        for (int i = 0; i < regCount; i++) {
            SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
            if (definitionForRegister != null && definitionForRegister.getOpcode() != null) {
                RegisterSpec result = definitionForRegister.getResult();
                TypeBearer typeBearer = result.getTypeBearer();
                if (typeBearer.isConstant()) {
                    TypedConstant typedConstant = (TypedConstant) typeBearer;
                    if (definitionForRegister.getOpcode().getOpcode() == 56) {
                        ArrayList<SsaInsn> insns = this.ssaMeth.getBlocks().get(definitionForRegister.getBlock().getPredecessors().nextSetBit(0)).getInsns();
                        definitionForRegister = insns.get(insns.size() - 1);
                    }
                    if (definitionForRegister.canThrow()) {
                        if (typedConstant instanceof CstString) {
                        }
                    } else if (!this.ssaMeth.isRegALocal(result)) {
                        Integer num = (Integer) map.get(typedConstant);
                        if (num == null) {
                            map.put(typedConstant, new Integer(1));
                        } else {
                            map.put(typedConstant, new Integer(num.intValue() + 1));
                        }
                    }
                }
            }
        }
        ArrayList<TypedConstant> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > 1) {
                arrayList.add((TypedConstant) entry.getKey());
            }
        }
        Collections.sort(arrayList, new Comparator<Constant>(this, map) {
            private final ConstCollector this$0;
            private final HashMap val$countUses;

            {
                this.this$0 = this;
                this.val$countUses = map;
            }

            @Override
            public int compare(Constant constant, Constant constant2) {
                return compare2(constant, constant2);
            }

            public int compare2(Constant constant, Constant constant2) {
                int iIntValue = ((Integer) this.val$countUses.get(constant2)).intValue() - ((Integer) this.val$countUses.get(constant)).intValue();
                if (iIntValue == 0) {
                    return constant.compareTo2(constant2);
                }
                return iIntValue;
            }

            @Override
            public boolean equals(Object obj) {
                return obj == this;
            }
        });
        return arrayList;
    }

    private void fixLocalAssignment(RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        for (SsaInsn ssaInsn : this.ssaMeth.getUseListForRegister(registerSpec.getReg())) {
            RegisterSpec localAssignment = ssaInsn.getLocalAssignment();
            if (localAssignment != null && ssaInsn.getResult() != null) {
                LocalItem localItem = localAssignment.getLocalItem();
                ssaInsn.setResultLocal((LocalItem) null);
                registerSpec2 = registerSpec2.withLocalItem(localItem);
                SsaInsn ssaInsnMakeFromRop = SsaInsn.makeFromRop(new PlainInsn(Rops.opMarkLocal(registerSpec2), SourcePosition.NO_INFO, (RegisterSpec) null, RegisterSpecList.make(registerSpec2)), ssaInsn.getBlock());
                ArrayList<SsaInsn> insns = ssaInsn.getBlock().getInsns();
                insns.add(insns.indexOf(ssaInsn) + 1, ssaInsnMakeFromRop);
            }
        }
    }

    private void updateConstUses(HashMap<TypedConstant, RegisterSpec> map, int i) {
        RegisterSpec registerSpec;
        new HashSet();
        ArrayList<SsaInsn>[] useListCopy = this.ssaMeth.getUseListCopy();
        for (int i2 = 0; i2 < i; i2++) {
            SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i2);
            if (definitionForRegister != null) {
                RegisterSpec result = definitionForRegister.getResult();
                TypeBearer typeBearer = definitionForRegister.getResult().getTypeBearer();
                if (typeBearer.isConstant() && (registerSpec = map.get((TypedConstant) typeBearer)) != null && !this.ssaMeth.isRegALocal(result)) {
                    RegisterMapper registerMapper = new RegisterMapper(this, result, registerSpec) {
                        private final ConstCollector this$0;
                        private final RegisterSpec val$newReg;
                        private final RegisterSpec val$origReg;

                        {
                            this.this$0 = this;
                            this.val$origReg = result;
                            this.val$newReg = registerSpec;
                        }

                        @Override
                        public int getNewRegisterCount() {
                            return this.this$0.ssaMeth.getRegCount();
                        }

                        @Override
                        public RegisterSpec mo7199map(RegisterSpec registerSpec2) {
                            if (registerSpec2.getReg() == this.val$origReg.getReg()) {
                                return this.val$newReg.withLocalItem(registerSpec2.getLocalItem());
                            }
                            return registerSpec2;
                        }
                    };
                    for (SsaInsn ssaInsn : useListCopy[result.getReg()]) {
                        if (!ssaInsn.canThrow() || ssaInsn.getBlock().getSuccessors().cardinality() <= 1) {
                            ssaInsn.mapSourceRegisters(registerMapper);
                        }
                    }
                }
            }
        }
    }
}
