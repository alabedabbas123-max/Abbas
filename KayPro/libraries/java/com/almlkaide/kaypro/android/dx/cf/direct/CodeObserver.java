package com.almlkaide.kaypro.android.dx.cf.direct;

import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;
import com.almlkaide.kaypro.android.dx.cf.code.BytecodeArray;
import com.almlkaide.kaypro.android.dx.cf.code.SwitchList;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseObserver;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstDouble;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFloat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.rop.cst.CstKnownNull;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLong;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.ByteArray;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.ArrayList;

public class CodeObserver implements BytecodeArray.Visitor {
    private final ByteArray bytes;
    private final ParseObserver observer;

    @Override
    public void setPreviousOffset(int i) {
    }

    public CodeObserver(ByteArray byteArray, ParseObserver parseObserver) {
        if (byteArray == null) {
            throw new NullPointerException("bytes == null");
        }
        if (parseObserver == null) {
            throw new NullPointerException("observer == null");
        }
        this.bytes = byteArray;
        this.observer = parseObserver;
    }

    @Override
    public void visitInvalid(int i, int i2, int i3) {
        this.observer.parsed(this.bytes, i2, i3, header(i2));
    }

    @Override
    public void visitNoArgs(int i, int i2, int i3, Type type) {
        this.observer.parsed(this.bytes, i2, i3, header(i2));
    }

    @Override
    public void visitLocal(int i, int i2, int i3, int i4, Type type, int i5) {
        String strM7224u1 = i3 <= 3 ? Hex.m7224u1(i4) : Hex.m7225u2(i4);
        boolean z = i3 == 1;
        String string = "";
        if (i == 132) {
            string = new StringBuffer().append(", #").append(i3 <= 3 ? Hex.m7220s1(i5) : Hex.m7221s2(i5)).toString();
        }
        String string2 = "";
        if (type.isCategory2()) {
            string2 = new StringBuffer().append(z ? "," : " //").append(" category-2").toString();
        }
        this.observer.parsed(this.bytes, i2, i3, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(header(i2)).append(z ? " // " : " ").toString()).append(strM7224u1).toString()).append(string).toString()).append(string2).toString());
    }

    @Override
    public void visitConstant(int i, int i2, int i3, Constant constant, int i4) {
        if (constant instanceof CstKnownNull) {
            visitNoArgs(i, i2, i3, (Type) null);
            return;
        }
        if (constant instanceof CstInteger) {
            visitLiteralInt(i, i2, i3, i4);
            return;
        }
        if (constant instanceof CstLong) {
            visitLiteralLong(i, i2, i3, ((CstLong) constant).getValue());
            return;
        }
        if (constant instanceof CstFloat) {
            visitLiteralFloat(i, i2, i3, ((CstFloat) constant).getIntBits());
            return;
        }
        if (constant instanceof CstDouble) {
            visitLiteralDouble(i, i2, i3, ((CstDouble) constant).getLongBits());
            return;
        }
        String string = "";
        if (i4 != 0) {
            string = i == 197 ? new StringBuffer().append(", ").append(Hex.m7224u1(i4)).toString() : new StringBuffer().append(", ").append(Hex.m7225u2(i4)).toString();
        }
        this.observer.parsed(this.bytes, i2, i3, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(header(i2)).append(" ").toString()).append(constant).toString()).append(string).toString());
    }

    @Override
    public void visitBranch(int i, int i2, int i3, int i4) {
        this.observer.parsed(this.bytes, i2, i3, new StringBuffer().append(new StringBuffer().append(header(i2)).append(" ").toString()).append(i3 <= 3 ? Hex.m7225u2(i4) : Hex.m7227u4(i4)).toString());
    }

    @Override
    public void visitSwitch(int i, int i2, int i3, SwitchList switchList, int i4) {
        int size = switchList.size();
        StringBuilder sb = new StringBuilder((size * 20) + 100);
        sb.append(header(i2));
        if (i4 != 0) {
            sb.append(new StringBuffer().append(" // padding: ").append(Hex.m7227u4(i4)).toString());
        }
        sb.append('\n');
        for (int i5 = 0; i5 < size; i5++) {
            sb.append("  ");
            sb.append(Hex.m7222s4(switchList.getValue(i5)));
            sb.append(": ");
            sb.append(Hex.m7225u2(switchList.getTarget(i5)));
            sb.append('\n');
        }
        sb.append("  default: ");
        sb.append(Hex.m7225u2(switchList.getDefaultTarget()));
        this.observer.parsed(this.bytes, i2, i3, sb.toString());
    }

    @Override
    public void visitNewarray(int i, int i2, CstType cstType, ArrayList<Constant> arrayList) {
        this.observer.parsed(this.bytes, i, i2, new StringBuffer().append(new StringBuffer().append(header(i)).append(i2 == 1 ? " // " : " ").toString()).append(cstType.getClassType().getComponentType().toHuman()).toString());
    }

    @Override
    public int getPreviousOffset() {
        return -1;
    }

    private String header(int i) {
        int unsignedByte = this.bytes.getUnsignedByte(i);
        String strOpName = ByteOps.opName(unsignedByte);
        if (unsignedByte == 196) {
            strOpName = new StringBuffer().append(strOpName).append(new StringBuffer().append(" ").append(ByteOps.opName(this.bytes.getUnsignedByte(i + 1))).toString()).toString();
        }
        return new StringBuffer().append(new StringBuffer().append(Hex.m7225u2(i)).append(": ").toString()).append(strOpName).toString();
    }

    private void visitLiteralInt(int i, int i2, int i3, int i4) {
        String string;
        String str = i3 == 1 ? " // " : " ";
        int unsignedByte = this.bytes.getUnsignedByte(i2);
        if (i3 == 1 || unsignedByte == 16) {
            string = new StringBuffer().append("#").append(Hex.m7220s1(i4)).toString();
        } else if (unsignedByte == 17) {
            string = new StringBuffer().append("#").append(Hex.m7221s2(i4)).toString();
        } else {
            string = new StringBuffer().append("#").append(Hex.m7222s4(i4)).toString();
        }
        this.observer.parsed(this.bytes, i2, i3, new StringBuffer().append(new StringBuffer().append(header(i2)).append(str).toString()).append(string).toString());
    }

    private void visitLiteralLong(int i, int i2, int i3, long j) {
        String strM7223s8;
        String str = i3 == 1 ? " // " : " #";
        if (i3 == 1) {
            strM7223s8 = Hex.m7220s1((int) j);
        } else {
            strM7223s8 = Hex.m7223s8(j);
        }
        this.observer.parsed(this.bytes, i2, i3, new StringBuffer().append(new StringBuffer().append(header(i2)).append(str).toString()).append(strM7223s8).toString());
    }

    private void visitLiteralFloat(int i, int i2, int i3, int i4) {
        this.observer.parsed(this.bytes, i2, i3, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(header(i2)).append(i3 != 1 ? new StringBuffer().append(" #").append(Hex.m7227u4(i4)).toString() : "").toString()).append(" // ").toString()).append(Float.intBitsToFloat(i4)).toString());
    }

    private void visitLiteralDouble(int i, int i2, int i3, long j) {
        this.observer.parsed(this.bytes, i2, i3, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(header(i2)).append(i3 != 1 ? new StringBuffer().append(" #").append(Hex.m7228u8(j)).toString() : "").toString()).append(" // ").toString()).append(Double.longBitsToDouble(j)).toString());
    }
}
