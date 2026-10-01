package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class MultiCstInsn extends FixedSizeInsn {
    private static final int NOT_SET = -1;
    private int classIndex;
    private final Constant[] constants;
    private final int[] index;

    public MultiCstInsn(Dop c1680Dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, Constant[] constantArr) {
        super(c1680Dop, sourcePosition, registerSpecList);
        if (constantArr == null) {
            throw new NullPointerException("constants == null");
        }
        this.constants = constantArr;
        this.index = new int[constantArr.length];
        for (int i = 0; i < this.index.length; i++) {
            if (constantArr[i] == null) {
                throw new NullPointerException("constants[i] == null");
            }
            this.index[i] = -1;
        }
        this.classIndex = -1;
    }

    MultiCstInsn(Dop c1680Dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, Constant[] constantArr, int[] iArr, int i) {
        super(c1680Dop, sourcePosition, registerSpecList);
        this.constants = constantArr;
        this.index = iArr;
        this.classIndex = i;
    }

    @Override
    public DalvInsn withOpcode(Dop c1680Dop) {
        return new MultiCstInsn(c1680Dop, getPosition(), getRegisters(), this.constants, this.index, this.classIndex);
    }

    @Override
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new MultiCstInsn(getOpcode(), getPosition(), registerSpecList, this.constants, this.index, this.classIndex);
    }

    public int getNumberOfConstants() {
        return this.constants.length;
    }

    public Constant getConstant(int i) {
        return this.constants[i];
    }

    public int getIndex(int i) {
        if (!hasIndex(i)) {
            throw new IllegalStateException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("index not yet set for constant ").append(i).toString()).append(" value = ").toString()).append(this.constants[i]).toString());
        }
        return this.index[i];
    }

    public boolean hasIndex(int i) {
        return this.index[i] != -1;
    }

    public void setIndex(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (hasIndex(i)) {
            throw new IllegalStateException("index already set");
        }
        this.index[i] = i2;
    }

    public int getClassIndex() {
        if (!hasClassIndex()) {
            throw new IllegalStateException("class index not yet set");
        }
        return this.classIndex;
    }

    public boolean hasClassIndex() {
        return this.classIndex != -1;
    }

    public void setClassIndex(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (hasClassIndex()) {
            throw new IllegalStateException("class index already set");
        }
        this.classIndex = i;
    }

    @Override
    protected String argString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.constants.length; i++) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.constants[i].toHuman());
        }
        return sb.toString();
    }

    @Override
    public String cstString() {
        return argString();
    }

    @Override
    public String cstComment() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.constants.length; i++) {
            if (!hasIndex(i)) {
                return "";
            }
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(getConstant(i).typeName());
            sb.append('@');
            int index = getIndex(i);
            if (index < 65536) {
                sb.append(Hex.m7225u2(index));
            } else {
                sb.append(Hex.m7227u4(index));
            }
        }
        return sb.toString();
    }
}
