package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.io.Opcodes;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLiteral32;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLiteral64;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.ArrayList;

public final class ArrayData extends VariableSizeInsn {
    private final Constant arrayType;
    private final int elemWidth;
    private final int initLength;
    private final CodeAddress user;
    private final ArrayList<Constant> values;

    public ArrayData(SourcePosition sourcePosition, CodeAddress codeAddress, ArrayList<Constant> arrayList, Constant constant) {
        super(sourcePosition, RegisterSpecList.EMPTY);
        if (codeAddress == null) {
            throw new NullPointerException("user == null");
        }
        if (arrayList == null) {
            throw new NullPointerException("values == null");
        }
        if (arrayList.size() <= 0) {
            throw new IllegalArgumentException("Illegal number of init values");
        }
        this.arrayType = constant;
        if (constant == CstType.BYTE_ARRAY || constant == CstType.BOOLEAN_ARRAY) {
            this.elemWidth = 1;
        } else if (constant == CstType.SHORT_ARRAY || constant == CstType.CHAR_ARRAY) {
            this.elemWidth = 2;
        } else if (constant == CstType.INT_ARRAY || constant == CstType.FLOAT_ARRAY) {
            this.elemWidth = 4;
        } else if (constant == CstType.LONG_ARRAY || constant == CstType.DOUBLE_ARRAY) {
            this.elemWidth = 8;
        } else {
            throw new IllegalArgumentException("Unexpected constant type");
        }
        this.user = codeAddress;
        this.values = arrayList;
        this.initLength = arrayList.size();
    }

    @Override
    public int codeSize() {
        return (((this.initLength * this.elemWidth) + 1) / 2) + 4;
    }

    @Override
    public void writeTo(AnnotatedOutput annotatedOutput) {
        int size = this.values.size();
        annotatedOutput.writeShort(Opcodes.FILL_ARRAY_DATA_PAYLOAD);
        annotatedOutput.writeShort(this.elemWidth);
        annotatedOutput.writeInt(this.initLength);
        switch (this.elemWidth) {
            case 1:
                for (int i = 0; i < size; i++) {
                    annotatedOutput.writeByte((byte) ((CstLiteral32) this.values.get(i)).getIntBits());
                }
                break;
            case 2:
                for (int i2 = 0; i2 < size; i2++) {
                    annotatedOutput.writeShort((short) ((CstLiteral32) this.values.get(i2)).getIntBits());
                }
                break;
            case 4:
                for (int i3 = 0; i3 < size; i3++) {
                    annotatedOutput.writeInt(((CstLiteral32) this.values.get(i3)).getIntBits());
                }
                break;
            case 8:
                for (int i4 = 0; i4 < size; i4++) {
                    annotatedOutput.writeLong(((CstLiteral64) this.values.get(i4)).getLongBits());
                }
                break;
        }
        if (this.elemWidth != 1 || size % 2 == 0) {
            return;
        }
        annotatedOutput.writeByte(0);
    }

    @Override
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new ArrayData(getPosition(), this.user, this.values, this.arrayType);
    }

    @Override
    protected String argString() {
        StringBuilder sb = new StringBuilder(100);
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            sb.append("\n    ");
            sb.append(i);
            sb.append(": ");
            sb.append(this.values.get(i).toHuman());
        }
        return sb.toString();
    }

    @Override
    protected String listingString0(boolean z) {
        int address = this.user.getAddress();
        StringBuilder sb = new StringBuilder(100);
        int size = this.values.size();
        sb.append("fill-array-data-payload // for fill-array-data @ ");
        sb.append(Hex.m7225u2(address));
        for (int i = 0; i < size; i++) {
            sb.append("\n  ");
            sb.append(i);
            sb.append(": ");
            sb.append(this.values.get(i).toHuman());
        }
        return sb.toString();
    }
}
