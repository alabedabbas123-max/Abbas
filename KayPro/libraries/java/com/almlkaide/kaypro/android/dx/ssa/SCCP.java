package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.Rop;
import com.almlkaide.kaypro.android.dx.rop.code.CstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.Insn;
import com.almlkaide.kaypro.android.dx.rop.code.PlainInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.Rops;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.rop.cst.TypedConstant;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

public class SCCP {
    private static final int CONSTANT = 1;

    private static final int f5081TOP = 0;
    private static final int VARYING = 2;
    private final BitSet executableBlocks;
    private final Constant[] latticeConstants;
    private final int[] latticeValues;
    private final int regCount;
    private final SsaMethod ssaMeth;
    private final ArrayList<SsaBasicBlock> cfgWorklist = new ArrayList<>();
    private final ArrayList<SsaBasicBlock> cfgPhiWorklist = new ArrayList<>();
    private final ArrayList<SsaInsn> ssaWorklist = new ArrayList<>();
    private final ArrayList<SsaInsn> varyingWorklist = new ArrayList<>();
    private final ArrayList<SsaInsn> branchWorklist = new ArrayList<>();

    SCCP(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
        this.regCount = ssaMethod.getRegCount();
        this.latticeValues = new int[this.regCount];
        this.latticeConstants = new Constant[this.regCount];
        this.executableBlocks = new BitSet(ssaMethod.getBlocks().size());
        for (int i = 0; i < this.regCount; i++) {
            this.latticeValues[i] = 0;
            this.latticeConstants[i] = (Constant) null;
        }
    }

    public static void process(SsaMethod ssaMethod) {
        new SCCP(ssaMethod).m7210run();
    }

    private void addBlockToWorklist(SsaBasicBlock ssaBasicBlock) {
        if (!this.executableBlocks.get(ssaBasicBlock.getIndex())) {
            this.cfgWorklist.add(ssaBasicBlock);
            this.executableBlocks.set(ssaBasicBlock.getIndex());
        } else {
            this.cfgPhiWorklist.add(ssaBasicBlock);
        }
    }

    private void addUsersToWorklist(int i, int i2) {
        if (i2 == 2) {
            Iterator<SsaInsn> it = this.ssaMeth.getUseListForRegister(i).iterator();
            while (it.hasNext()) {
                this.varyingWorklist.add(it.next());
            }
            return;
        }
        Iterator<SsaInsn> it2 = this.ssaMeth.getUseListForRegister(i).iterator();
        while (it2.hasNext()) {
            this.ssaWorklist.add(it2.next());
        }
    }

    private boolean setLatticeValueTo(int i, int i2, Constant constant) {
        if (i2 != 1) {
            if (this.latticeValues[i] == i2) {
                return false;
            }
            this.latticeValues[i] = i2;
            return true;
        }
        if (this.latticeValues[i] == i2 && this.latticeConstants[i].equals(constant)) {
            return false;
        }
        this.latticeValues[i] = i2;
        this.latticeConstants[i] = constant;
        return true;
    }

    private void simulatePhi(PhiInsn phiInsn) {
        int reg = phiInsn.getResult().getReg();
        if (this.latticeValues[reg] != 2) {
            RegisterSpecList sources = phiInsn.getSources();
            Constant constant = (Constant) null;
            int size = sources.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int iPredBlockIndexForSourcesIndex = phiInsn.predBlockIndexForSourcesIndex(i2);
                int reg2 = sources.m7188get(i2).getReg();
                int i3 = this.latticeValues[reg2];
                if (this.executableBlocks.get(iPredBlockIndexForSourcesIndex)) {
                    if (i3 == 1) {
                        if (constant == null) {
                            constant = this.latticeConstants[reg2];
                            i = 1;
                        } else if (!this.latticeConstants[reg2].equals(constant)) {
                            i = 2;
                            break;
                        }
                    } else {
                        i = i3;
                        break;
                    }
                }
            }
            if (setLatticeValueTo(reg, i, constant)) {
                addUsersToWorklist(reg, i);
            }
        }
    }

    private void simulateBlock(SsaBasicBlock ssaBasicBlock) {
        for (SsaInsn ssaInsn : ssaBasicBlock.getInsns()) {
            if (ssaInsn instanceof PhiInsn) {
                simulatePhi((PhiInsn) ssaInsn);
            } else {
                simulateStmt(ssaInsn);
            }
        }
    }

    private void simulatePhiBlock(SsaBasicBlock ssaBasicBlock) {
        for (SsaInsn ssaInsn : ssaBasicBlock.getInsns()) {
            if (!(ssaInsn instanceof PhiInsn)) {
                return;
            } else {
                simulatePhi((PhiInsn) ssaInsn);
            }
        }
    }

    private static String latticeValName(int i) {
        switch (i) {
            case 0:
                return "TOP";
            case 1:
                return "CONSTANT";
            case 2:
                return "VARYING";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    private void simulateBranch(SsaInsn ssaInsn) {
        boolean z;
        boolean z2;
        int iM7231get;
        Rop opcode = ssaInsn.getOpcode();
        RegisterSpecList sources = ssaInsn.getSources();
        if (opcode.getBranchingness() == 4) {
            Constant constant = (Constant) null;
            Constant constant2 = (Constant) null;
            RegisterSpec registerSpecM7188get = sources.m7188get(0);
            int reg = registerSpecM7188get.getReg();
            Constant constant3 = (this.ssaMeth.isRegALocal(registerSpecM7188get) || this.latticeValues[reg] != 1) ? constant : this.latticeConstants[reg];
            if (sources.size() == 2) {
                RegisterSpec registerSpecM7188get2 = sources.m7188get(1);
                int reg2 = registerSpecM7188get2.getReg();
                if (!this.ssaMeth.isRegALocal(registerSpecM7188get2) && this.latticeValues[reg2] == 1) {
                    constant2 = this.latticeConstants[reg2];
                }
            }
            if (constant3 != null && sources.size() == 1) {
                switch (((TypedConstant) constant3).getBasicType()) {
                    case 6:
                        int value = ((CstInteger) constant3).getValue();
                        switch (opcode.getOpcode()) {
                            case 7:
                                z = value == 0;
                                break;
                            case 8:
                                z = value != 0;
                                break;
                            case 9:
                                z = value < 0;
                                break;
                            case 10:
                                z = value >= 0;
                                break;
                            case 11:
                                z = value <= 0;
                                break;
                            case 12:
                                z = value > 0;
                                break;
                            default:
                                throw new RuntimeException("Unexpected op");
                        }
                        z2 = true;
                        break;
                    default:
                        z = false;
                        z2 = false;
                        break;
                }
            } else if (constant3 != null && constant2 != null) {
                switch (((TypedConstant) constant3).getBasicType()) {
                    case 6:
                        int value2 = ((CstInteger) constant3).getValue();
                        int value3 = ((CstInteger) constant2).getValue();
                        switch (opcode.getOpcode()) {
                            case 7:
                                z = value2 == value3;
                                break;
                            case 8:
                                z = value2 != value3;
                                break;
                            case 9:
                                z = value2 < value3;
                                break;
                            case 10:
                                z = value2 >= value3;
                                break;
                            case 11:
                                z = value2 <= value3;
                                break;
                            case 12:
                                z = value2 > value3;
                                break;
                            default:
                                throw new RuntimeException("Unexpected op");
                        }
                        z2 = true;
                        break;
                    default:
                        z = false;
                        z2 = false;
                        break;
                }
            } else {
                z = false;
                z2 = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        SsaBasicBlock block = ssaInsn.getBlock();
        if (z2) {
            if (z) {
                iM7231get = block.getSuccessorList().m7231get(1);
            } else {
                iM7231get = block.getSuccessorList().m7231get(0);
            }
            addBlockToWorklist(this.ssaMeth.getBlocks().get(iM7231get));
            this.branchWorklist.add(ssaInsn);
            return;
        }
        for (int i = 0; i < block.getSuccessorList().size(); i++) {
            addBlockToWorklist(this.ssaMeth.getBlocks().get(block.getSuccessorList().m7231get(i)));
        }
    }

    private Constant simulateMath(SsaInsn ssaInsn, int i) {
        Constant constant;
        Constant constant2;
        int i2;
        int i3;
        boolean z;
        int i4;
        boolean z2 = false;
        boolean z3 = true;
        Insn originalRopInsn = ssaInsn.getOriginalRopInsn();
        int opcode = ssaInsn.getOpcode().getOpcode();
        RegisterSpecList sources = ssaInsn.getSources();
        int reg = sources.m7188get(0).getReg();
        if (this.latticeValues[reg] != 1) {
            constant = (Constant) null;
        } else {
            constant = this.latticeConstants[reg];
        }
        if (sources.size() == 1) {
            constant2 = ((CstInsn) originalRopInsn).getConstant();
        } else {
            int reg2 = sources.m7188get(1).getReg();
            if (this.latticeValues[reg2] != 1) {
                constant2 = (Constant) null;
            } else {
                constant2 = this.latticeConstants[reg2];
            }
        }
        if (constant == null || constant2 == null) {
            return (Constant) null;
        }
        switch (i) {
            case 6:
                int value = ((CstInteger) constant).getValue();
                int value2 = ((CstInteger) constant2).getValue();
                switch (opcode) {
                    case 14:
                        i3 = value2 + value;
                        break;
                    case 15:
                        if (sources.size() == 1) {
                            i4 = value2 - value;
                        } else {
                            i4 = value - value2;
                        }
                        i3 = i4;
                        break;
                    case 16:
                        i3 = value2 * value;
                        break;
                    case 17:
                        if (value2 == 0) {
                            z = true;
                            i3 = 0;
                        } else {
                            i3 = value / value2;
                            z = false;
                        }
                        z2 = z;
                        break;
                    case 18:
                        if (value2 == 0) {
                            i2 = 0;
                        } else {
                            i2 = value % value2;
                            z3 = false;
                        }
                        z2 = z3;
                        i3 = i2;
                        break;
                    case 19:
                    default:
                        throw new RuntimeException("Unexpected op");
                    case 20:
                        i3 = value2 & value;
                        break;
                    case 21:
                        i3 = value2 | value;
                        break;
                    case 22:
                        i3 = value2 ^ value;
                        break;
                    case 23:
                        i3 = value << value2;
                        break;
                    case 24:
                        i3 = value >> value2;
                        break;
                    case 25:
                        i3 = value >>> value2;
                        break;
                }
                return z2 ? (CstInteger) null : CstInteger.make(i3);
            default:
                return (Constant) null;
        }
    }

    private void simulateStmt(SsaInsn ssaInsn) {
        RegisterSpec result;
        int i;
        Insn originalRopInsn = ssaInsn.getOriginalRopInsn();
        if (originalRopInsn.getOpcode().getBranchingness() != 1 || originalRopInsn.getOpcode().isCallLike()) {
            simulateBranch(ssaInsn);
        }
        int opcode = ssaInsn.getOpcode().getOpcode();
        RegisterSpec result2 = ssaInsn.getResult();
        if (result2 != null) {
            result = result2;
        } else if (opcode != 17 && opcode != 18) {
            return;
        } else {
            result = ssaInsn.getBlock().getPrimarySuccessor().getInsns().get(0).getResult();
        }
        int reg = result.getReg();
        int i2 = 2;
        Constant constantSimulateMath = (Constant) null;
        switch (opcode) {
            case 2:
                if (ssaInsn.getSources().size() != 1) {
                    i = 2;
                } else {
                    int reg2 = ssaInsn.getSources().m7188get(0).getReg();
                    i = this.latticeValues[reg2];
                    constantSimulateMath = this.latticeConstants[reg2];
                }
                i2 = i;
                break;
            case 5:
                constantSimulateMath = ((CstInsn) originalRopInsn).getConstant();
                i2 = 1;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                constantSimulateMath = simulateMath(ssaInsn, result.getBasicType());
                if (constantSimulateMath != null) {
                    i2 = 1;
                }
                break;
            case 56:
                if (this.latticeValues[reg] == 1) {
                    i2 = this.latticeValues[reg];
                    constantSimulateMath = this.latticeConstants[reg];
                }
                break;
        }
        if (setLatticeValueTo(reg, i2, constantSimulateMath)) {
            addUsersToWorklist(reg, i2);
        }
    }

    private void m7210run() {
        addBlockToWorklist(this.ssaMeth.getEntryBlock());
        while (true) {
            if (!this.cfgWorklist.isEmpty() || !this.cfgPhiWorklist.isEmpty() || !this.ssaWorklist.isEmpty() || !this.varyingWorklist.isEmpty()) {
                while (!this.cfgWorklist.isEmpty()) {
                    simulateBlock(this.cfgWorklist.remove(this.cfgWorklist.size() - 1));
                }
                while (!this.cfgPhiWorklist.isEmpty()) {
                    simulatePhiBlock(this.cfgPhiWorklist.remove(this.cfgPhiWorklist.size() - 1));
                }
                while (!this.varyingWorklist.isEmpty()) {
                    SsaInsn ssaInsnRemove = this.varyingWorklist.remove(this.varyingWorklist.size() - 1);
                    if (this.executableBlocks.get(ssaInsnRemove.getBlock().getIndex())) {
                        if (ssaInsnRemove instanceof PhiInsn) {
                            simulatePhi((PhiInsn) ssaInsnRemove);
                        } else {
                            simulateStmt(ssaInsnRemove);
                        }
                    }
                }
                while (!this.ssaWorklist.isEmpty()) {
                    SsaInsn ssaInsnRemove2 = this.ssaWorklist.remove(this.ssaWorklist.size() - 1);
                    if (this.executableBlocks.get(ssaInsnRemove2.getBlock().getIndex())) {
                        if (ssaInsnRemove2 instanceof PhiInsn) {
                            simulatePhi((PhiInsn) ssaInsnRemove2);
                        } else {
                            simulateStmt(ssaInsnRemove2);
                        }
                    }
                }
            } else {
                replaceConstants();
                replaceBranches();
                return;
            }
        }
    }

    private void replaceConstants() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.regCount) {
                return;
            }
            if (this.latticeValues[i2] == 1 && (this.latticeConstants[i2] instanceof TypedConstant)) {
                SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i2);
                if (!definitionForRegister.getResult().getTypeBearer().isConstant()) {
                    definitionForRegister.setResult(definitionForRegister.getResult().withType((TypedConstant) this.latticeConstants[i2]));
                    for (SsaInsn ssaInsn : this.ssaMeth.getUseListForRegister(i2)) {
                        if (!ssaInsn.isPhiOrMove()) {
                            NormalSsaInsn normalSsaInsn = (NormalSsaInsn) ssaInsn;
                            RegisterSpecList sources = ssaInsn.getSources();
                            int iIndexOfRegister = sources.indexOfRegister(i2);
                            normalSsaInsn.changeOneSource(iIndexOfRegister, sources.m7188get(iIndexOfRegister).withType((TypedConstant) this.latticeConstants[i2]));
                        }
                    }
                }
            }
            i = i2 + 1;
        }
    }

    private void replaceBranches() {
        for (SsaInsn ssaInsn : this.branchWorklist) {
            SsaBasicBlock block = ssaInsn.getBlock();
            int size = block.getSuccessorList().size();
            int i = 0;
            int i2 = -1;
            while (i < size) {
                int iM7231get = block.getSuccessorList().m7231get(i);
                if (this.executableBlocks.get(iM7231get)) {
                    iM7231get = i2;
                }
                i++;
                i2 = iM7231get;
            }
            if (size == 2 && i2 != -1) {
                block.replaceLastInsn(new PlainInsn(Rops.GOTO, ssaInsn.getOriginalRopInsn().getPosition(), (RegisterSpec) null, RegisterSpecList.EMPTY));
                block.removeSuccessor(i2);
            }
        }
    }
}
