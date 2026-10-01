package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.ssa.RegisterMapper;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.TwoColumnOutput;
import java.util.BitSet;

public abstract class DalvInsn {
    private int address;
    private final Dop opcode;
    private final SourcePosition position;
    private final RegisterSpecList registers;

    protected abstract String argString();

    public abstract int codeSize();

    protected abstract String listingString0(boolean z);

    public abstract DalvInsn withOpcode(Dop c1680Dop);

    public abstract DalvInsn withRegisterOffset(int i);

    public abstract DalvInsn withRegisters(RegisterSpecList registerSpecList);

    public abstract void writeTo(AnnotatedOutput annotatedOutput);

    public static SimpleInsn makeMove(SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        Dop c1680Dop;
        boolean z = registerSpec.getCategory() == 1;
        boolean zIsReference = registerSpec.getType().isReference();
        int reg = registerSpec.getReg();
        if ((registerSpec2.getReg() | reg) < 16) {
            if (zIsReference) {
                c1680Dop = Dops.MOVE_OBJECT;
            } else {
                c1680Dop = z ? Dops.MOVE : Dops.MOVE_WIDE;
            }
        } else if (reg < 256) {
            if (zIsReference) {
                c1680Dop = Dops.MOVE_OBJECT_FROM16;
            } else {
                c1680Dop = z ? Dops.MOVE_FROM16 : Dops.MOVE_WIDE_FROM16;
            }
        } else if (zIsReference) {
            c1680Dop = Dops.MOVE_OBJECT_16;
        } else {
            c1680Dop = z ? Dops.MOVE_16 : Dops.MOVE_WIDE_16;
        }
        return new SimpleInsn(c1680Dop, sourcePosition, RegisterSpecList.make(registerSpec, registerSpec2));
    }

    public DalvInsn(Dop c1680Dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        if (c1680Dop == null) {
            throw new NullPointerException("opcode == null");
        }
        if (sourcePosition == null) {
            throw new NullPointerException("position == null");
        }
        if (registerSpecList == null) {
            throw new NullPointerException("registers == null");
        }
        this.address = -1;
        this.opcode = c1680Dop;
        this.position = sourcePosition;
        this.registers = registerSpecList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(identifierString());
        sb.append(' ');
        sb.append(this.position);
        sb.append(": ");
        sb.append(this.opcode.getName());
        boolean z = false;
        if (this.registers.size() != 0) {
            sb.append(this.registers.toHuman(" ", ", ", (String) null));
            z = true;
        }
        String strArgString = argString();
        if (strArgString != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(strArgString);
        }
        return sb.toString();
    }

    public final boolean hasAddress() {
        return this.address >= 0;
    }

    public final int getAddress() {
        if (this.address < 0) {
            throw new RuntimeException("address not yet known");
        }
        return this.address;
    }

    public final Dop getOpcode() {
        return this.opcode;
    }

    public final SourcePosition getPosition() {
        return this.position;
    }

    public final RegisterSpecList getRegisters() {
        return this.registers;
    }

    public final boolean hasResult() {
        return this.opcode.hasResult();
    }

    public final int getMinimumRegisterRequirement(BitSet bitSet) {
        int i = 0;
        boolean zHasResult = hasResult();
        int size = this.registers.size();
        int category = (!zHasResult || bitSet.get(0)) ? 0 : this.registers.m7188get(0).getCategory();
        int i2 = zHasResult ? 1 : 0;
        while (i2 < size) {
            int category2 = !bitSet.get(i2) ? this.registers.m7188get(i2).getCategory() + i : i;
            i2++;
            i = category2;
        }
        return Math.max(i, category);
    }

    public DalvInsn getLowRegVersion() {
        return withRegisters(this.registers.withExpandedRegisters(0, hasResult(), (BitSet) null));
    }

    public DalvInsn expandedPrefix(BitSet bitSet) {
        RegisterSpecList registerSpecList = this.registers;
        boolean z = bitSet.get(0);
        if (hasResult()) {
            bitSet.set(0);
        }
        RegisterSpecList registerSpecListSubset = registerSpecList.subset(bitSet);
        if (hasResult()) {
            bitSet.set(0, z);
        }
        return registerSpecListSubset.size() == 0 ? (DalvInsn) null : new HighRegisterPrefix(this.position, registerSpecListSubset);
    }

    public DalvInsn expandedSuffix(BitSet bitSet) {
        if (!hasResult() || bitSet.get(0)) {
            return (DalvInsn) null;
        }
        RegisterSpec registerSpecM7188get = this.registers.m7188get(0);
        return makeMove(this.position, registerSpecM7188get, registerSpecM7188get.withReg(0));
    }

    public DalvInsn expandedVersion(BitSet bitSet) {
        return withRegisters(this.registers.withExpandedRegisters(0, hasResult(), bitSet));
    }

    public final String identifierString() {
        return this.address != -1 ? String.format("%04x", new Integer(this.address)) : Hex.m7227u4(System.identityHashCode(this));
    }

    public final String listingString(String str, int i, boolean z) {
        String strListingString0 = listingString0(z);
        if (strListingString0 == null) {
            return (String) null;
        }
        String string = new StringBuffer().append(new StringBuffer().append(str).append(identifierString()).toString()).append(": ").toString();
        int length = string.length();
        return TwoColumnOutput.toString(string, length, "", strListingString0, i == 0 ? strListingString0.length() : i - length);
    }

    public final void setAddress(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        this.address = i;
    }

    public final int getNextAddress() {
        return getAddress() + codeSize();
    }

    public DalvInsn withMapper(RegisterMapper registerMapper) {
        return withRegisters(registerMapper.m7208map(getRegisters()));
    }

    public String cstString() {
        throw new UnsupportedOperationException("Not supported.");
    }

    public String cstComment() {
        throw new UnsupportedOperationException("Not supported.");
    }
}
