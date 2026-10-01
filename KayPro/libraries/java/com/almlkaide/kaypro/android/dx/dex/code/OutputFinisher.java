package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dex.DexException;
import com.almlkaide.kaypro.android.dx.dex.DexOptions;
import com.almlkaide.kaypro.android.dx.rop.code.LocalItem;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecSet;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMemberRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.ssa.BasicRegisterMapper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

public final class OutputFinisher {
    private final DexOptions dexOptions;
    private ArrayList<DalvInsn> insns;
    private final int paramSize;
    private int reservedParameterCount;
    private final int unreservedRegCount;
    private int reservedCount = -1;
    private boolean hasAnyPositionInfo = false;
    private boolean hasAnyLocalInfo = false;

    public OutputFinisher(DexOptions dexOptions, int i, int i2, int i3) {
        this.dexOptions = dexOptions;
        this.unreservedRegCount = i2;
        this.insns = new ArrayList<>(i);
        this.paramSize = i3;
    }

    public boolean hasAnyPositionInfo() {
        return this.hasAnyPositionInfo;
    }

    public boolean hasAnyLocalInfo() {
        return this.hasAnyLocalInfo;
    }

    private static boolean hasLocalInfo(DalvInsn dalvInsn) {
        if (dalvInsn instanceof LocalSnapshot) {
            RegisterSpecSet locals = ((LocalSnapshot) dalvInsn).getLocals();
            int size = locals.size();
            for (int i = 0; i < size; i++) {
                if (hasLocalInfo(locals.m7190get(i))) {
                    return true;
                }
            }
        } else if ((dalvInsn instanceof LocalStart) && hasLocalInfo(((LocalStart) dalvInsn).getLocal())) {
            return true;
        }
        return false;
    }

    private static boolean hasLocalInfo(RegisterSpec registerSpec) {
        return (registerSpec == null || registerSpec.getLocalItem().getName() == null) ? false : true;
    }

    public HashSet<Constant> getAllConstants() {
        HashSet<Constant> hashSet = new HashSet<>(20);
        Iterator<DalvInsn> it = this.insns.iterator();
        while (it.hasNext()) {
            addConstants(hashSet, it.next());
        }
        return hashSet;
    }

    private static void addConstants(HashSet<Constant> hashSet, DalvInsn dalvInsn) {
        int i = 0;
        if (dalvInsn instanceof CstInsn) {
            hashSet.add(((CstInsn) dalvInsn).getConstant());
            return;
        }
        if (dalvInsn instanceof MultiCstInsn) {
            MultiCstInsn multiCstInsn = (MultiCstInsn) dalvInsn;
            while (i < multiCstInsn.getNumberOfConstants()) {
                hashSet.add(multiCstInsn.getConstant(i));
                i++;
            }
            return;
        }
        if (dalvInsn instanceof LocalSnapshot) {
            RegisterSpecSet locals = ((LocalSnapshot) dalvInsn).getLocals();
            int size = locals.size();
            while (i < size) {
                addConstants(hashSet, locals.m7190get(i));
                i++;
            }
            return;
        }
        if (dalvInsn instanceof LocalStart) {
            addConstants(hashSet, ((LocalStart) dalvInsn).getLocal());
        }
    }

    private static void addConstants(HashSet<Constant> hashSet, RegisterSpec registerSpec) {
        if (registerSpec != null) {
            LocalItem localItem = registerSpec.getLocalItem();
            CstString name = localItem.getName();
            CstString signature = localItem.getSignature();
            Type type = registerSpec.getType();
            if (type != Type.KNOWN_NULL) {
                hashSet.add(CstType.intern(type));
            } else {
                hashSet.add(CstType.intern(Type.OBJECT));
            }
            if (name != null) {
                hashSet.add(name);
            }
            if (signature != null) {
                hashSet.add(signature);
            }
        }
    }

    public void m7161add(DalvInsn dalvInsn) {
        this.insns.add(dalvInsn);
        updateInfo(dalvInsn);
    }

    public void insert(int i, DalvInsn dalvInsn) {
        this.insns.add(i, dalvInsn);
        updateInfo(dalvInsn);
    }

    public DalvInsn m7162get(int i) {
        return this.insns.get(i);
    }

    public int size() {
        return this.insns.size();
    }

    private void updateInfo(DalvInsn dalvInsn) {
        if (!this.hasAnyPositionInfo && dalvInsn.getPosition().getLine() >= 0) {
            this.hasAnyPositionInfo = true;
        }
        if (this.hasAnyLocalInfo || !hasLocalInfo(dalvInsn)) {
            return;
        }
        this.hasAnyLocalInfo = true;
    }

    public void reverseBranch(int i, CodeAddress codeAddress) {
        int size = (this.insns.size() - i) - 1;
        try {
            this.insns.set(size, ((TargetInsn) this.insns.get(size)).withNewTargetAndReversed(codeAddress));
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("non-reversible instruction");
        } catch (IndexOutOfBoundsException e2) {
            throw new IllegalArgumentException("too few instructions");
        }
    }

    public void assignIndices(DalvCode.AssignIndicesCallback assignIndicesCallback) {
        for (DalvInsn dalvInsn : this.insns) {
            if (dalvInsn instanceof CstInsn) {
                assignIndices((CstInsn) dalvInsn, assignIndicesCallback);
            } else if (dalvInsn instanceof MultiCstInsn) {
                assignIndices((MultiCstInsn) dalvInsn, assignIndicesCallback);
            }
        }
    }

    private static void assignIndices(CstInsn cstInsn, DalvCode.AssignIndicesCallback assignIndicesCallback) {
        int index;
        Constant constant = cstInsn.getConstant();
        int index2 = assignIndicesCallback.getIndex(constant);
        if (index2 >= 0) {
            cstInsn.setIndex(index2);
        }
        if (!(constant instanceof CstMemberRef) || (index = assignIndicesCallback.getIndex(((CstMemberRef) constant).getDefiningClass())) < 0) {
            return;
        }
        cstInsn.setClassIndex(index);
    }

    private static void assignIndices(MultiCstInsn multiCstInsn, DalvCode.AssignIndicesCallback assignIndicesCallback) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= multiCstInsn.getNumberOfConstants()) {
                return;
            }
            Constant constant = multiCstInsn.getConstant(i2);
            multiCstInsn.setIndex(i2, assignIndicesCallback.getIndex(constant));
            if (constant instanceof CstMemberRef) {
                multiCstInsn.setClassIndex(assignIndicesCallback.getIndex(((CstMemberRef) constant).getDefiningClass()));
            }
            i = i2 + 1;
        }
    }

    public DalvInsnList finishProcessingAndGetList() {
        if (this.reservedCount >= 0) {
            throw new UnsupportedOperationException("already processed");
        }
        Dop[] c1680DopArrMakeOpcodesArray = makeOpcodesArray();
        reserveRegisters(c1680DopArrMakeOpcodesArray);
        if (this.dexOptions.ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER) {
            align64bits(c1680DopArrMakeOpcodesArray);
        }
        massageInstructions(c1680DopArrMakeOpcodesArray);
        assignAddressesAndFixBranches();
        return DalvInsnList.makeImmutable(this.insns, this.reservedCount + this.unreservedRegCount + this.reservedParameterCount);
    }

    private Dop[] makeOpcodesArray() {
        int size = this.insns.size();
        Dop[] c1680DopArr = new Dop[size];
        for (int i = 0; i < size; i++) {
            c1680DopArr[i] = this.insns.get(i).getOpcode();
        }
        return c1680DopArr;
    }

    private boolean reserveRegisters(Dop[] c1680DopArr) {
        int i = this.reservedCount < 0 ? 0 : this.reservedCount;
        boolean z = false;
        while (true) {
            int iCalculateReservedCount = calculateReservedCount(c1680DopArr);
            if (i < iCalculateReservedCount) {
                z = true;
                int i2 = iCalculateReservedCount - i;
                int size = this.insns.size();
                for (int i3 = 0; i3 < size; i3++) {
                    DalvInsn dalvInsn = this.insns.get(i3);
                    if (!(dalvInsn instanceof CodeAddress)) {
                        this.insns.set(i3, dalvInsn.withRegisterOffset(i2));
                    }
                }
                i = iCalculateReservedCount;
            } else {
                this.reservedCount = i;
                return z;
            }
        }
    }

    private int calculateReservedCount(Dop[] c1680DopArr) {
        int minimumRegisterRequirement;
        int size = this.insns.size();
        int i = this.reservedCount;
        for (int i2 = 0; i2 < size; i2++) {
            DalvInsn dalvInsn = this.insns.get(i2);
            Dop c1680Dop = c1680DopArr[i2];
            Dop c1680DopFindOpcodeForInsn = findOpcodeForInsn(dalvInsn, c1680Dop);
            if (c1680DopFindOpcodeForInsn == null) {
                minimumRegisterRequirement = dalvInsn.getMinimumRegisterRequirement(findExpandedOpcodeForInsn(dalvInsn).getFormat().compatibleRegs(dalvInsn));
                if (minimumRegisterRequirement <= i) {
                }
                c1680DopArr[i2] = c1680DopFindOpcodeForInsn;
                i = minimumRegisterRequirement;
            } else {
                if (c1680Dop != c1680DopFindOpcodeForInsn) {
                }
            }
            minimumRegisterRequirement = i;
            c1680DopArr[i2] = c1680DopFindOpcodeForInsn;
            i = minimumRegisterRequirement;
        }
        return i;
    }

    private Dop findOpcodeForInsn(DalvInsn dalvInsn, Dop c1680Dop) {
        while (c1680Dop != null && (!c1680Dop.getFormat().isCompatible(dalvInsn) || (this.dexOptions.forceJumbo && c1680Dop.getOpcode() == 26))) {
            c1680Dop = Dops.getNextOrNull(c1680Dop, this.dexOptions);
        }
        return c1680Dop;
    }

    private Dop findExpandedOpcodeForInsn(DalvInsn dalvInsn) {
        Dop c1680DopFindOpcodeForInsn = findOpcodeForInsn(dalvInsn.getLowRegVersion(), dalvInsn.getOpcode());
        if (c1680DopFindOpcodeForInsn == null) {
            throw new DexException(new StringBuffer().append("No expanded opcode for ").append(dalvInsn).toString());
        }
        return c1680DopFindOpcodeForInsn;
    }

    private void massageInstructions(Dop[] c1680DopArr) {
        if (this.reservedCount == 0) {
            int size = this.insns.size();
            for (int i = 0; i < size; i++) {
                DalvInsn dalvInsn = this.insns.get(i);
                Dop opcode = dalvInsn.getOpcode();
                Dop c1680Dop = c1680DopArr[i];
                if (opcode != c1680Dop) {
                    this.insns.set(i, dalvInsn.withOpcode(c1680Dop));
                }
            }
            return;
        }
        this.insns = performExpansion(c1680DopArr);
    }

    private ArrayList<DalvInsn> performExpansion(Dop[] c1680DopArr) {
        DalvInsn dalvInsnExpandedPrefix;
        DalvInsn dalvInsnExpandedSuffix;
        DalvInsn dalvInsnExpandedVersion;
        int size = this.insns.size();
        ArrayList<DalvInsn> arrayList = new ArrayList<>(size * 2);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < size; i++) {
            DalvInsn dalvInsn = this.insns.get(i);
            Dop opcode = dalvInsn.getOpcode();
            Dop c1680DopFindExpandedOpcodeForInsn = c1680DopArr[i];
            if (c1680DopFindExpandedOpcodeForInsn != null) {
                dalvInsnExpandedPrefix = (DalvInsn) null;
                dalvInsnExpandedSuffix = (DalvInsn) null;
                dalvInsnExpandedVersion = dalvInsn;
            } else {
                c1680DopFindExpandedOpcodeForInsn = findExpandedOpcodeForInsn(dalvInsn);
                BitSet bitSetCompatibleRegs = c1680DopFindExpandedOpcodeForInsn.getFormat().compatibleRegs(dalvInsn);
                dalvInsnExpandedPrefix = dalvInsn.expandedPrefix(bitSetCompatibleRegs);
                dalvInsnExpandedSuffix = dalvInsn.expandedSuffix(bitSetCompatibleRegs);
                dalvInsnExpandedVersion = dalvInsn.expandedVersion(bitSetCompatibleRegs);
            }
            if ((dalvInsnExpandedVersion instanceof CodeAddress) && ((CodeAddress) dalvInsnExpandedVersion).getBindsClosely()) {
                arrayList2.add((CodeAddress) dalvInsnExpandedVersion);
            } else {
                if (dalvInsnExpandedPrefix != null) {
                    arrayList.add(dalvInsnExpandedPrefix);
                }
                if (!(dalvInsnExpandedVersion instanceof ZeroSizeInsn) && arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((CodeAddress) it.next());
                    }
                    arrayList2.clear();
                }
                if (c1680DopFindExpandedOpcodeForInsn != opcode) {
                    dalvInsnExpandedVersion = dalvInsnExpandedVersion.withOpcode(c1680DopFindExpandedOpcodeForInsn);
                }
                arrayList.add(dalvInsnExpandedVersion);
                if (dalvInsnExpandedSuffix != null) {
                    arrayList.add(dalvInsnExpandedSuffix);
                }
            }
        }
        return arrayList;
    }

    private void assignAddressesAndFixBranches() {
        do {
            assignAddresses();
        } while (fixBranches());
    }

    private void assignAddresses() {
        int size = this.insns.size();
        int iCodeSize = 0;
        for (int i = 0; i < size; i++) {
            DalvInsn dalvInsn = this.insns.get(i);
            dalvInsn.setAddress(iCodeSize);
            iCodeSize += dalvInsn.codeSize();
        }
    }

    private boolean fixBranches() {
        int i;
        int i2;
        int size = this.insns.size();
        int i3 = 0;
        boolean z = false;
        while (i3 < size) {
            DalvInsn dalvInsn = this.insns.get(i3);
            if (dalvInsn instanceof TargetInsn) {
                Dop opcode = dalvInsn.getOpcode();
                TargetInsn targetInsn = (TargetInsn) dalvInsn;
                if (opcode.getFormat().branchFits(targetInsn)) {
                    i = size;
                } else {
                    if (opcode.getFamily() == 40) {
                        Dop c1680DopFindOpcodeForInsn = findOpcodeForInsn(dalvInsn, opcode);
                        if (c1680DopFindOpcodeForInsn == null) {
                            throw new UnsupportedOperationException("method too long");
                        }
                        this.insns.set(i3, dalvInsn.withOpcode(c1680DopFindOpcodeForInsn));
                        i2 = i3;
                        i = size;
                    } else {
                        try {
                            CodeAddress codeAddress = (CodeAddress) this.insns.get(i3 + 1);
                            this.insns.set(i3, new TargetInsn(Dops.GOTO, targetInsn.getPosition(), RegisterSpecList.EMPTY, targetInsn.getTarget()));
                            this.insns.add(i3, targetInsn.withNewTargetAndReversed(codeAddress));
                            i = size + 1;
                            i2 = i3 + 1;
                        } catch (ClassCastException e) {
                            throw new IllegalStateException("unpaired TargetInsn");
                        } catch (IndexOutOfBoundsException e2) {
                            throw new IllegalStateException("unpaired TargetInsn (dangling)");
                        }
                    }
                    i3 = i2;
                    z = true;
                }
            } else {
                i = size;
            }
            i3++;
            size = i;
        }
        return z;
    }

    private void align64bits(Dop[] c1680DopArr) {
        do {
            int i = ((this.unreservedRegCount + this.reservedCount) + this.reservedParameterCount) - this.paramSize;
            Iterator<DalvInsn> it = this.insns.iterator();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (it.hasNext()) {
                RegisterSpecList registers = it.next().getRegisters();
                int i6 = i2;
                for (int i7 = 0; i7 < registers.size(); i7++) {
                    RegisterSpec registerSpecM7188get = registers.m7188get(i7);
                    if (registerSpecM7188get.isCategory2()) {
                        boolean z = registerSpecM7188get.getReg() >= i;
                        if (registerSpecM7188get.isEvenRegister()) {
                            if (z) {
                                i6++;
                            } else {
                                i4++;
                            }
                        } else if (z) {
                            i3++;
                        } else {
                            i5++;
                        }
                    }
                }
                i2 = i6;
            }
            if (i3 > i2 && i5 > i4) {
                addReservedRegisters(1);
            } else if (i3 > i2) {
                addReservedParameters(1);
            } else {
                if (i5 <= i4) {
                    return;
                }
                addReservedRegisters(1);
                if (this.paramSize != 0 && i2 > i3) {
                    addReservedParameters(1);
                }
            }
        } while (reserveRegisters(c1680DopArr));
    }

    private void addReservedParameters(int i) {
        shiftParameters(i);
        this.reservedParameterCount += i;
    }

    private void addReservedRegisters(int i) {
        shiftAllRegisters(i);
        this.reservedCount += i;
    }

    private void shiftAllRegisters(int i) {
        int size = this.insns.size();
        for (int i2 = 0; i2 < size; i2++) {
            DalvInsn dalvInsn = this.insns.get(i2);
            if (!(dalvInsn instanceof CodeAddress)) {
                this.insns.set(i2, dalvInsn.withRegisterOffset(i));
            }
        }
    }

    private void shiftParameters(int i) {
        int size = this.insns.size();
        int i2 = this.reservedParameterCount + this.unreservedRegCount + this.reservedCount;
        int i3 = i2 - this.paramSize;
        BasicRegisterMapper basicRegisterMapper = new BasicRegisterMapper(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 >= i3) {
                basicRegisterMapper.addMapping(i4, i4 + i, 1);
            } else {
                basicRegisterMapper.addMapping(i4, i4, 1);
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            DalvInsn dalvInsn = this.insns.get(i5);
            if (!(dalvInsn instanceof CodeAddress)) {
                this.insns.set(i5, dalvInsn.withMapper(basicRegisterMapper));
            }
        }
    }
}
