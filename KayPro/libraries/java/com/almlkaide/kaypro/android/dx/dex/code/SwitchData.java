package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.IntList;

public final class SwitchData extends VariableSizeInsn {
    private final IntList cases;
    private final boolean packed;
    private final CodeAddress[] targets;
    private final CodeAddress user;

    public SwitchData(SourcePosition sourcePosition, CodeAddress codeAddress, IntList intList, CodeAddress[] codeAddressArr) {
        super(sourcePosition, RegisterSpecList.EMPTY);
        if (codeAddress == null) {
            throw new NullPointerException("user == null");
        }
        if (intList == null) {
            throw new NullPointerException("cases == null");
        }
        if (codeAddressArr == null) {
            throw new NullPointerException("targets == null");
        }
        int size = intList.size();
        if (size != codeAddressArr.length) {
            throw new IllegalArgumentException("cases / targets mismatch");
        }
        if (size > 65535) {
            throw new IllegalArgumentException("too many cases");
        }
        this.user = codeAddress;
        this.cases = intList;
        this.targets = codeAddressArr;
        this.packed = shouldPack(intList);
    }

    @Override
    public int codeSize() {
        return this.packed ? (int) packedCodeSize(this.cases) : (int) sparseCodeSize(this.cases);
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput) {
        int address;
        int i;
        int address2 = this.user.getAddress();
        int iCodeSize = Dops.PACKED_SWITCH.getFormat().codeSize();
        int length = this.targets.length;
        if (this.packed) {
            int iM7231get = length == 0 ? 0 : this.cases.m7231get(0);
            int iM7231get2 = ((length == 0 ? 0 : this.cases.m7231get(length - 1)) - iM7231get) + 1;
            annotatedOutput.writeShort(256);
            annotatedOutput.writeShort(iM7231get2);
            annotatedOutput.writeInt(iM7231get);
            int i2 = 0;
            int i3 = 0;
            while (i2 < iM7231get2) {
                if (this.cases.m7231get(i3) > iM7231get + i2) {
                    address = iCodeSize;
                    i = i3;
                } else {
                    address = this.targets[i3].getAddress() - address2;
                    i = i3 + 1;
                }
                annotatedOutput.writeInt(address);
                i2++;
                i3 = i;
            }
            return;
        }
        annotatedOutput.writeShort(512);
        annotatedOutput.writeShort(length);
        for (int i4 = 0; i4 < length; i4++) {
            annotatedOutput.writeInt(this.cases.m7231get(i4));
        }
        for (int i5 = 0; i5 < length; i5++) {
            annotatedOutput.writeInt(this.targets[i5].getAddress() - address2);
        }
    }

    @Override
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new SwitchData(getPosition(), this.user, this.cases, this.targets);
    }

    public boolean isPacked() {
        return this.packed;
    }

    @Override
    protected String argString() {
        StringBuilder sb = new StringBuilder(100);
        int length = this.targets.length;
        for (int i = 0; i < length; i++) {
            sb.append("\n    ");
            sb.append(this.cases.m7231get(i));
            sb.append(": ");
            sb.append(this.targets[i]);
        }
        return sb.toString();
    }

    @Override
    protected String listingString0(boolean z) {
        int address = this.user.getAddress();
        StringBuilder sb = new StringBuilder(100);
        int length = this.targets.length;
        sb.append(this.packed ? "packed" : "sparse");
        sb.append("-switch-payload // for switch @ ");
        sb.append(Hex.m7225u2(address));
        for (int i = 0; i < length; i++) {
            int address2 = this.targets[i].getAddress();
            sb.append("\n  ");
            sb.append(this.cases.m7231get(i));
            sb.append(": ");
            sb.append(Hex.m7227u4(address2));
            sb.append(" // ");
            sb.append(Hex.m7222s4(address2 - address));
        }
        return sb.toString();
    }

    private static long packedCodeSize(IntList intList) {
        long jM7231get = (((((long) intList.m7231get(intList.size() - 1)) - ((long) intList.m7231get(0))) + ((long) 1)) * ((long) 2)) + ((long) 4);
        return jM7231get <= ((long) Integer.MAX_VALUE) ? jM7231get : -1;
    }

    private static long sparseCodeSize(IntList intList) {
        return (((long) intList.size()) * 4) + ((long) 2);
    }

    private static boolean shouldPack(IntList intList) {
        if (intList.size() < 2) {
            return true;
        }
        long jPackedCodeSize = packedCodeSize(intList);
        return jPackedCodeSize >= ((long) 0) && jPackedCodeSize <= (sparseCodeSize(intList) * ((long) 5)) / ((long) 4);
    }
}
