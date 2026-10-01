package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class CstInsn extends FixedSizeInsn {
    private int classIndex;
    private final Constant constant;
    private int index;

    public CstInsn(Dop c1680Dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, Constant constant) {
        super(c1680Dop, sourcePosition, registerSpecList);
        if (constant == null) {
            throw new NullPointerException("constant == null");
        }
        this.constant = constant;
        this.index = -1;
        this.classIndex = -1;
    }

    @Override
    public DalvInsn withOpcode(Dop c1680Dop) {
        CstInsn cstInsn = new CstInsn(c1680Dop, getPosition(), getRegisters(), this.constant);
        if (this.index >= 0) {
            cstInsn.setIndex(this.index);
        }
        if (this.classIndex >= 0) {
            cstInsn.setClassIndex(this.classIndex);
        }
        return cstInsn;
    }

    @Override
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        CstInsn cstInsn = new CstInsn(getOpcode(), getPosition(), registerSpecList, this.constant);
        if (this.index >= 0) {
            cstInsn.setIndex(this.index);
        }
        if (this.classIndex >= 0) {
            cstInsn.setClassIndex(this.classIndex);
        }
        return cstInsn;
    }

    public Constant getConstant() {
        return this.constant;
    }

    public int getIndex() {
        if (this.index < 0) {
            throw new IllegalStateException(new StringBuffer().append("index not yet set for ").append(this.constant).toString());
        }
        return this.index;
    }

    public boolean hasIndex() {
        return this.index >= 0;
    }

    public void setIndex(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.index >= 0) {
            throw new IllegalStateException("index already set");
        }
        this.index = i;
    }

    public int getClassIndex() {
        if (this.classIndex < 0) {
            throw new IllegalStateException("class index not yet set");
        }
        return this.classIndex;
    }

    public boolean hasClassIndex() {
        return this.classIndex >= 0;
    }

    public void setClassIndex(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.classIndex >= 0) {
            throw new IllegalStateException("class index already set");
        }
        this.classIndex = i;
    }

    @Override
    protected String argString() {
        return this.constant.toHuman();
    }

    @Override
    public String cstString() {
        return this.constant instanceof CstString ? ((CstString) this.constant).toQuoted() : this.constant.toHuman();
    }

    @Override
    public String cstComment() {
        if (!hasIndex()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(getConstant().typeName());
        sb.append('@');
        if (this.index < 65536) {
            sb.append(Hex.m7225u2(this.index));
        } else {
            sb.append(Hex.m7227u4(this.index));
        }
        return sb.toString();
    }
}
