package com.almlkaide.kaypro.android.dx.ssa.back;

import com.almlkaide.kaypro.android.dx.rop.code.Rop;
import com.almlkaide.kaypro.android.dx.rop.code.CstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.LocalItem;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.ssa.InterferenceRegisterMapper;
import com.almlkaide.kaypro.android.dx.ssa.NormalSsaInsn;
import com.almlkaide.kaypro.android.dx.ssa.Optimizer;
import com.almlkaide.kaypro.android.dx.ssa.PhiInsn;
import com.almlkaide.kaypro.android.dx.ssa.RegisterMapper;
import com.almlkaide.kaypro.android.dx.ssa.SsaInsn;
import com.almlkaide.kaypro.android.dx.ssa.SsaMethod;
import com.almlkaide.kaypro.android.dx.util.IntIterator;
import com.almlkaide.kaypro.android.dx.util.IntSet;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class FirstFitLocalCombiningAllocator extends RegisterAllocator {
    private static final boolean DEBUG = false;
    private final ArrayList<NormalSsaInsn> invokeRangeInsns;
    private final Map<LocalItem, ArrayList<RegisterSpec>> localVariables;
    private final InterferenceRegisterMapper mapper;
    private final boolean minimizeRegisters;
    private final ArrayList<NormalSsaInsn> moveResultPseudoInsns;
    private final int paramRangeEnd;
    private final ArrayList<PhiInsn> phiInsns;
    private final BitSet reservedRopRegs;
    private final BitSet ssaRegsMapped;
    private final BitSet usedRopRegs;

    private enum Alignment {
        EVEN {
            @Override
            int nextClearBit(BitSet bitSet, int i) {
                int iNextClearBit = bitSet.nextClearBit(i);
                while (!FirstFitLocalCombiningAllocator.isEven(iNextClearBit)) {
                    iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
                }
                return iNextClearBit;
            }
        },
        ODD {
            @Override
            int nextClearBit(BitSet bitSet, int i) {
                int iNextClearBit = bitSet.nextClearBit(i);
                while (FirstFitLocalCombiningAllocator.isEven(iNextClearBit)) {
                    iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
                }
                return iNextClearBit;
            }
        },
        UNSPECIFIED {
            @Override
            int nextClearBit(BitSet bitSet, int i) {
                return bitSet.nextClearBit(i);
            }
        };

        abstract int nextClearBit(BitSet bitSet, int i);

        public static Alignment valueOf(String str) {
            for (Alignment alignment : values()) {
                if (alignment.name().equals(str)) {
                    return alignment;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    public FirstFitLocalCombiningAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph, boolean z) {
        super(ssaMethod, interferenceGraph);
        this.ssaRegsMapped = new BitSet(ssaMethod.getRegCount());
        this.mapper = new InterferenceRegisterMapper(interferenceGraph, ssaMethod.getRegCount());
        this.minimizeRegisters = z;
        this.paramRangeEnd = ssaMethod.getParamWidth();
        this.reservedRopRegs = new BitSet(this.paramRangeEnd * 2);
        this.reservedRopRegs.set(0, this.paramRangeEnd);
        this.usedRopRegs = new BitSet(this.paramRangeEnd * 2);
        this.localVariables = new TreeMap();
        this.moveResultPseudoInsns = new ArrayList<>();
        this.invokeRangeInsns = new ArrayList<>();
        this.phiInsns = new ArrayList<>();
    }

    @Override
    public boolean wantsParamsMovedHigh() {
        return true;
    }

    @Override
    public RegisterMapper allocateRegisters() {
        analyzeInstructions();
        handleLocalAssociatedParams();
        handleUnassociatedParameters();
        handleInvokeRangeInsns();
        handleLocalAssociatedOther();
        handleCheckCastResults();
        handlePhiInsns();
        handleNormalUnassociated();
        return this.mapper;
    }

    private void printLocalVars() {
        System.out.println("Printing local vars");
        for (Map.Entry<LocalItem, ArrayList<RegisterSpec>> entry : this.localVariables.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append('{');
            sb.append(' ');
            for (RegisterSpec registerSpec : entry.getValue()) {
                sb.append('v');
                sb.append(registerSpec.getReg());
                sb.append(' ');
            }
            sb.append('}');
            System.out.printf("Local: %s Registers: %s\n", entry.getKey(), sb);
        }
    }

    private void handleLocalAssociatedParams() {
        int i;
        int parameterIndexForReg;
        for (ArrayList<RegisterSpec> arrayList : this.localVariables.values()) {
            int size = arrayList.size();
            int i2 = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i = 0;
                    parameterIndexForReg = i2;
                    break;
                }
                RegisterSpec registerSpec = arrayList.get(i3);
                parameterIndexForReg = getParameterIndexForReg(registerSpec.getReg());
                if (parameterIndexForReg < 0) {
                    i3++;
                    i2 = parameterIndexForReg;
                } else {
                    int category = registerSpec.getCategory();
                    addMapping(registerSpec, parameterIndexForReg);
                    i = category;
                    break;
                }
            }
            if (parameterIndexForReg >= 0) {
                tryMapRegs(arrayList, parameterIndexForReg, i, true);
            }
        }
    }

    private int getParameterIndexForReg(int i) {
        Rop opcode;
        SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
        if (definitionForRegister == null || (opcode = definitionForRegister.getOpcode()) == null || opcode.getOpcode() != 3) {
            return -1;
        }
        return ((CstInteger) ((CstInsn) definitionForRegister.getOriginalRopInsn()).getConstant()).getValue();
    }

    private void handleLocalAssociatedOther() {
        boolean z;
        for (ArrayList<RegisterSpec> arrayList : this.localVariables.values()) {
            int i = this.paramRangeEnd;
            while (true) {
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 1;
                while (i2 < size) {
                    RegisterSpec registerSpec = arrayList.get(i2);
                    int category = registerSpec.getCategory();
                    i2++;
                    i3 = (this.ssaRegsMapped.get(registerSpec.getReg()) || category <= i3) ? i3 : category;
                }
                int iFindRopRegForLocal = findRopRegForLocal(i, i3);
                boolean zTryMapRegs = canMapRegs(arrayList, iFindRopRegForLocal) ? tryMapRegs(arrayList, iFindRopRegForLocal, i3, true) : z;
                i = iFindRopRegForLocal + 1;
                z = zTryMapRegs ? false : zTryMapRegs;
            }
        }
    }

    private boolean tryMapRegs(ArrayList<RegisterSpec> arrayList, int i, int i2, boolean z) {
        boolean z2 = false;
        for (RegisterSpec registerSpec : arrayList) {
            if (!this.ssaRegsMapped.get(registerSpec.getReg())) {
                boolean zTryMapReg = tryMapReg(registerSpec, i, i2);
                z2 = !zTryMapReg || z2;
                if (zTryMapReg && z) {
                    markReserved(i, registerSpec.getCategory());
                }
            }
        }
        return !z2;
    }

    private boolean tryMapReg(RegisterSpec registerSpec, int i, int i2) {
        if (registerSpec.getCategory() > i2 || this.ssaRegsMapped.get(registerSpec.getReg()) || !canMapReg(registerSpec, i)) {
            return false;
        }
        addMapping(registerSpec, i);
        return true;
    }

    private void markReserved(int i, int i2) {
        this.reservedRopRegs.set(i, i + i2, true);
    }

    private boolean rangeContainsReserved(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (this.reservedRopRegs.get(i3)) {
                return true;
            }
        }
        return false;
    }

    private boolean isThisPointerReg(int i) {
        return i == 0 && !this.ssaMeth.isStatic();
    }

    private Alignment getAlignment(int i) {
        Alignment alignment = Alignment.UNSPECIFIED;
        if (i == 2) {
            if (isEven(this.paramRangeEnd)) {
                return Alignment.EVEN;
            }
            return Alignment.ODD;
        }
        return alignment;
    }

    private int findNextUnreservedRopReg(int i, int i2) {
        return findNextUnreservedRopReg(i, i2, getAlignment(i2));
    }

    private int findNextUnreservedRopReg(int i, int i2, Alignment alignment) {
        int iNextClearBit = alignment.nextClearBit(this.reservedRopRegs, i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !this.reservedRopRegs.get(iNextClearBit + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return iNextClearBit;
            }
            iNextClearBit = alignment.nextClearBit(this.reservedRopRegs, iNextClearBit + i3);
        }
    }

    private int findRopRegForLocal(int i, int i2) {
        Alignment alignment = getAlignment(i2);
        int iNextClearBit = alignment.nextClearBit(this.usedRopRegs, i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !this.usedRopRegs.get(iNextClearBit + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return iNextClearBit;
            }
            iNextClearBit = alignment.nextClearBit(this.usedRopRegs, iNextClearBit + i3);
        }
    }

    private void handleUnassociatedParameters() {
        int regCount = this.ssaMeth.getRegCount();
        for (int i = 0; i < regCount; i++) {
            if (!this.ssaRegsMapped.get(i)) {
                int parameterIndexForReg = getParameterIndexForReg(i);
                RegisterSpec definitionSpecForSsaReg = getDefinitionSpecForSsaReg(i);
                if (parameterIndexForReg >= 0) {
                    addMapping(definitionSpecForSsaReg, parameterIndexForReg);
                }
            }
        }
    }

    private void handleInvokeRangeInsns() {
        Iterator<NormalSsaInsn> it = this.invokeRangeInsns.iterator();
        while (it.hasNext()) {
            adjustAndMapSourceRangeRange(it.next());
        }
    }

    private void handleCheckCastResults() {
        for (NormalSsaInsn normalSsaInsn : this.moveResultPseudoInsns) {
            RegisterSpec result = normalSsaInsn.getResult();
            int reg = result.getReg();
            BitSet predecessors = normalSsaInsn.getBlock().getPredecessors();
            if (predecessors.cardinality() == 1) {
                ArrayList<SsaInsn> insns = this.ssaMeth.getBlocks().get(predecessors.nextSetBit(0)).getInsns();
                SsaInsn ssaInsn = insns.get(insns.size() - 1);
                if (ssaInsn.getOpcode().getOpcode() == 43) {
                    RegisterSpec registerSpecM7188get = ssaInsn.getSources().m7188get(0);
                    int reg2 = registerSpecM7188get.getReg();
                    int category = registerSpecM7188get.getCategory();
                    boolean zTryMapReg = this.ssaRegsMapped.get(reg);
                    boolean z = this.ssaRegsMapped.get(reg2);
                    boolean zTryMapReg2 = (!z) & zTryMapReg ? tryMapReg(registerSpecM7188get, this.mapper.oldToNew(reg), category) : z;
                    if ((!zTryMapReg) & zTryMapReg2) {
                        zTryMapReg = tryMapReg(result, this.mapper.oldToNew(reg2), category);
                    }
                    if (!zTryMapReg || !zTryMapReg2) {
                        int iFindNextUnreservedRopReg = findNextUnreservedRopReg(this.paramRangeEnd, category);
                        ArrayList<RegisterSpec> arrayList = new ArrayList<>(2);
                        arrayList.add(result);
                        arrayList.add(registerSpecM7188get);
                        while (!tryMapRegs(arrayList, iFindNextUnreservedRopReg, category, false)) {
                            iFindNextUnreservedRopReg = findNextUnreservedRopReg(iFindNextUnreservedRopReg + 1, category);
                        }
                    }
                    boolean z2 = ssaInsn.getOriginalRopInsn().getCatches().size() != 0;
                    int iOldToNew = this.mapper.oldToNew(reg);
                    if (iOldToNew != this.mapper.oldToNew(reg2) && !z2) {
                        ((NormalSsaInsn) ssaInsn).changeOneSource(0, insertMoveBefore(ssaInsn, registerSpecM7188get));
                        addMapping(ssaInsn.getSources().m7188get(0), iOldToNew);
                    }
                }
            }
        }
    }

    private void handlePhiInsns() {
        Iterator<PhiInsn> it = this.phiInsns.iterator();
        while (it.hasNext()) {
            processPhiInsn(it.next());
        }
    }

    private void handleNormalUnassociated() {
        RegisterSpec definitionSpecForSsaReg;
        int regCount = this.ssaMeth.getRegCount();
        for (int i = 0; i < regCount; i++) {
            if (!this.ssaRegsMapped.get(i) && (definitionSpecForSsaReg = getDefinitionSpecForSsaReg(i)) != null) {
                int category = definitionSpecForSsaReg.getCategory();
                int iFindNextUnreservedRopReg = findNextUnreservedRopReg(this.paramRangeEnd, category);
                while (!canMapReg(definitionSpecForSsaReg, iFindNextUnreservedRopReg)) {
                    iFindNextUnreservedRopReg = findNextUnreservedRopReg(iFindNextUnreservedRopReg + 1, category);
                }
                addMapping(definitionSpecForSsaReg, iFindNextUnreservedRopReg);
            }
        }
    }

    private boolean canMapRegs(ArrayList<RegisterSpec> arrayList, int i) {
        for (RegisterSpec registerSpec : arrayList) {
            if (!this.ssaRegsMapped.get(registerSpec.getReg()) && !canMapReg(registerSpec, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean canMapReg(RegisterSpec registerSpec, int i) {
        return (spansParamRange(i, registerSpec.getCategory()) || this.mapper.interferes(registerSpec, i)) ? false : true;
    }

    private boolean spansParamRange(int i, int i2) {
        return i < this.paramRangeEnd && i + i2 > this.paramRangeEnd;
    }

    private void analyzeInstructions() {
        this.ssaMeth.forEachInsn(new SsaInsn.Visitor(this) {
            private final FirstFitLocalCombiningAllocator this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
                processInsn(normalSsaInsn);
            }

            @Override
            public void visitPhiInsn(PhiInsn phiInsn) {
                processInsn(phiInsn);
            }

            @Override
            public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
                processInsn(normalSsaInsn);
            }

            private void processInsn(SsaInsn ssaInsn) {
                RegisterSpec localAssignment = ssaInsn.getLocalAssignment();
                if (localAssignment != null) {
                    LocalItem localItem = localAssignment.getLocalItem();
                    ArrayList arrayList = (ArrayList) this.this$0.localVariables.get(localItem);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.this$0.localVariables.put(localItem, arrayList);
                    }
                    arrayList.add(localAssignment);
                }
                if (ssaInsn instanceof NormalSsaInsn) {
                    if (ssaInsn.getOpcode().getOpcode() == 56) {
                        this.this$0.moveResultPseudoInsns.add((NormalSsaInsn) ssaInsn);
                        return;
                    } else {
                        if (Optimizer.getAdvice().requiresSourcesInOrder(ssaInsn.getOriginalRopInsn().getOpcode(), ssaInsn.getSources())) {
                            this.this$0.invokeRangeInsns.add((NormalSsaInsn) ssaInsn);
                            return;
                        }
                        return;
                    }
                }
                if (ssaInsn instanceof PhiInsn) {
                    this.this$0.phiInsns.add((PhiInsn) ssaInsn);
                }
            }
        });
    }

    private void addMapping(RegisterSpec registerSpec, int i) {
        int reg = registerSpec.getReg();
        if (this.ssaRegsMapped.get(reg) || !canMapReg(registerSpec, i)) {
            throw new RuntimeException("attempt to add invalid register mapping");
        }
        int category = registerSpec.getCategory();
        this.mapper.addMapping(registerSpec.getReg(), i, category);
        this.ssaRegsMapped.set(reg);
        this.usedRopRegs.set(i, category + i);
    }

    private void adjustAndMapSourceRangeRange(NormalSsaInsn normalSsaInsn) {
        int iFindRangeAndAdjust = findRangeAndAdjust(normalSsaInsn);
        RegisterSpecList sources = normalSsaInsn.getSources();
        int size = sources.size();
        int i = 0;
        int i2 = iFindRangeAndAdjust;
        while (i < size) {
            RegisterSpec registerSpecM7188get = sources.m7188get(i);
            int reg = registerSpecM7188get.getReg();
            int category = registerSpecM7188get.getCategory();
            int i3 = i2 + category;
            if (!this.ssaRegsMapped.get(reg)) {
                LocalItem localItemForReg = getLocalItemForReg(reg);
                addMapping(registerSpecM7188get, i2);
                if (localItemForReg != null) {
                    markReserved(i2, category);
                    ArrayList<RegisterSpec> arrayList = this.localVariables.get(localItemForReg);
                    int size2 = arrayList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        RegisterSpec registerSpec = arrayList.get(i4);
                        if (-1 == sources.indexOfRegister(registerSpec.getReg())) {
                            tryMapReg(registerSpec, i2, category);
                        }
                    }
                }
            }
            i++;
            i2 = i3;
        }
    }

    private int findRangeAndAdjust(NormalSsaInsn normalSsaInsn) {
        BitSet bitSet;
        int iFindAnyFittingRange;
        int iOldToNew;
        BitSet bitSet2;
        int iFitPlanForRange;
        RegisterSpecList sources = normalSsaInsn.getSources();
        int size = sources.size();
        int[] iArr = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i] = sources.m7188get(i).getCategory();
            int i3 = iArr[i] + i2;
            i++;
            i2 = i3;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        BitSet bitSet3 = (BitSet) null;
        while (true) {
            if (i7 >= size) {
                bitSet = bitSet3;
                break;
            }
            int reg = sources.m7188get(i7).getReg();
            int i8 = i7 != 0 ? i6 - iArr[i7 - 1] : i6;
            if (this.ssaRegsMapped.get(reg) && (iOldToNew = this.mapper.oldToNew(reg) + i8) >= 0 && !spansParamRange(iOldToNew, i2) && (iFitPlanForRange = fitPlanForRange(iOldToNew, normalSsaInsn, iArr, (bitSet2 = new BitSet(size)))) >= 0) {
                int iCardinality = iFitPlanForRange - bitSet2.cardinality();
                if (iCardinality > i4) {
                    i5 = iOldToNew;
                    i4 = iCardinality;
                } else {
                    bitSet2 = bitSet3;
                }
                if (iFitPlanForRange == i2) {
                    bitSet = bitSet2;
                    break;
                }
                bitSet3 = bitSet2;
            }
            i7++;
            i6 = i8;
        }
        if (i5 == -1) {
            bitSet = new BitSet(size);
            iFindAnyFittingRange = findAnyFittingRange(normalSsaInsn, i2, iArr, bitSet);
        } else {
            iFindAnyFittingRange = i5;
        }
        for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
            normalSsaInsn.changeOneSource(iNextSetBit, insertMoveBefore(normalSsaInsn, sources.m7188get(iNextSetBit)));
        }
        return iFindAnyFittingRange;
    }

    private int findAnyFittingRange(NormalSsaInsn normalSsaInsn, int i, int[] iArr, BitSet bitSet) {
        Alignment alignment;
        Alignment alignment2 = Alignment.UNSPECIFIED;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < iArr.length) {
            if (iArr[i2] == 2) {
                if (isEven(i5)) {
                    i4++;
                } else {
                    i3++;
                }
                i5 += 2;
            } else {
                i5++;
            }
            i2++;
            i3 = i3;
        }
        if (i3 > i4) {
            if (isEven(this.paramRangeEnd)) {
                alignment = Alignment.ODD;
            } else {
                alignment = Alignment.EVEN;
            }
        } else if (i4 <= 0) {
            alignment = alignment2;
        } else if (isEven(this.paramRangeEnd)) {
            alignment = Alignment.EVEN;
        } else {
            alignment = Alignment.ODD;
        }
        int i6 = this.paramRangeEnd;
        while (true) {
            int iFindNextUnreservedRopReg = findNextUnreservedRopReg(i6, i, alignment);
            if (fitPlanForRange(iFindNextUnreservedRopReg, normalSsaInsn, iArr, bitSet) < 0) {
                i6 = iFindNextUnreservedRopReg + 1;
                bitSet.clear();
            } else {
                return iFindNextUnreservedRopReg;
            }
        }
    }

    private int fitPlanForRange(int i, NormalSsaInsn normalSsaInsn, int[] iArr, BitSet bitSet) {
        RegisterSpecList sources = normalSsaInsn.getSources();
        int size = sources.size();
        int i2 = 0;
        RegisterSpecList registerSpecListSsaSetToSpecs = ssaSetToSpecs(normalSsaInsn.getBlock().getLiveOutRegs());
        BitSet bitSet2 = new BitSet(this.ssaMeth.getRegCount());
        int i3 = i;
        for (int i4 = 0; i4 < size; i4++) {
            RegisterSpec registerSpecM7188get = sources.m7188get(i4);
            int reg = registerSpecM7188get.getReg();
            int i5 = iArr[i4];
            if (i4 != 0) {
                i3 += iArr[i4 - 1];
            }
            if (this.ssaRegsMapped.get(reg) && this.mapper.oldToNew(reg) == i3) {
                i2 += i5;
            } else {
                if (rangeContainsReserved(i3, i5)) {
                    return -1;
                }
                if (!this.ssaRegsMapped.get(reg) && canMapReg(registerSpecM7188get, i3) && !bitSet2.get(reg)) {
                    i2 += i5;
                } else if (!this.mapper.areAnyPinned(registerSpecListSsaSetToSpecs, i3, i5) && !this.mapper.areAnyPinned(sources, i3, i5)) {
                    bitSet.set(i4);
                } else {
                    return -1;
                }
            }
            bitSet2.set(reg);
        }
        return i2;
    }

    RegisterSpecList ssaSetToSpecs(IntSet intSet) {
        RegisterSpecList registerSpecList = new RegisterSpecList(intSet.elements());
        IntIterator it = intSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            registerSpecList.m7189set(i, getDefinitionSpecForSsaReg(it.next()));
            i++;
        }
        return registerSpecList;
    }

    private LocalItem getLocalItemForReg(int i) {
        for (Map.Entry<LocalItem, ArrayList<RegisterSpec>> entry : this.localVariables.entrySet()) {
            Iterator<RegisterSpec> it = entry.getValue().iterator();
            while (it.hasNext()) {
                if (it.next().getReg() == i) {
                    return entry.getKey();
                }
            }
        }
        return (LocalItem) null;
    }

    private void processPhiInsn(PhiInsn phiInsn) {
        RegisterSpec result = phiInsn.getResult();
        int reg = result.getReg();
        int category = result.getCategory();
        RegisterSpecList sources = phiInsn.getSources();
        int size = sources.size();
        ArrayList<RegisterSpec> arrayList = new ArrayList<>();
        Multiset multiset = new Multiset(size + 1);
        if (this.ssaRegsMapped.get(reg)) {
            multiset.m7211add(this.mapper.oldToNew(reg));
        } else {
            arrayList.add(result);
        }
        for (int i = 0; i < size; i++) {
            RegisterSpec result2 = this.ssaMeth.getDefinitionForRegister(sources.m7188get(i).getReg()).getResult();
            int reg2 = result2.getReg();
            if (this.ssaRegsMapped.get(reg2)) {
                multiset.m7211add(this.mapper.oldToNew(reg2));
            } else {
                arrayList.add(result2);
            }
        }
        for (int i2 = 0; i2 < multiset.getSize(); i2++) {
            tryMapRegs(arrayList, multiset.getAndRemoveHighestCount(), category, false);
        }
        int iFindNextUnreservedRopReg = findNextUnreservedRopReg(this.paramRangeEnd, category);
        while (!tryMapRegs(arrayList, iFindNextUnreservedRopReg, category, false)) {
            iFindNextUnreservedRopReg = findNextUnreservedRopReg(iFindNextUnreservedRopReg + 1, category);
        }
    }

    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }

    private static class Multiset {
        private final int[] count;

        private final int[] f5083reg;
        private int size = 0;

        public Multiset(int i) {
            this.f5083reg = new int[i];
            this.count = new int[i];
        }

        public void m7211add(int i) {
            for (int i2 = 0; i2 < this.size; i2++) {
                if (this.f5083reg[i2] == i) {
                    int[] iArr = this.count;
                    iArr[i2] = iArr[i2] + 1;
                    return;
                }
            }
            this.f5083reg[this.size] = i;
            this.count[this.size] = 1;
            this.size++;
        }

        public int getAndRemoveHighestCount() {
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            int i4 = -1;
            while (true) {
                int i5 = i;
                if (i2 < this.size) {
                    if (i3 < this.count[i2]) {
                        i4 = this.f5083reg[i2];
                        i3 = this.count[i2];
                        i = i2;
                    } else {
                        i = i5;
                    }
                    i2++;
                } else {
                    this.count[i5] = 0;
                    return i4;
                }
            }
        }

        public int getSize() {
            return this.size;
        }
    }
}
