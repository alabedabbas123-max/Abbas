package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class Rop {
    public static final int BRANCH_GOTO = 3;
    public static final int BRANCH_IF = 4;
    public static final int BRANCH_MAX = 6;
    public static final int BRANCH_MIN = 1;
    public static final int BRANCH_NONE = 1;
    public static final int BRANCH_RETURN = 2;
    public static final int BRANCH_SWITCH = 5;
    public static final int BRANCH_THROW = 6;
    private final int branchingness;
    private final TypeList exceptions;
    private final boolean isCallLike;
    private final String nickname;
    private final int opcode;
    private final Type result;
    private final TypeList sources;

    public Rop(int i, Type type, TypeList typeList, TypeList typeList2, int i2, boolean z, String str) {
        if (type == null) {
            throw new NullPointerException("result == null");
        }
        if (typeList == null) {
            throw new NullPointerException("sources == null");
        }
        if (typeList2 == null) {
            throw new NullPointerException("exceptions == null");
        }
        if (i2 < 1 || i2 > 6) {
            throw new IllegalArgumentException(new StringBuffer().append("invalid branchingness: ").append(i2).toString());
        }
        if (typeList2.size() != 0 && i2 != 6) {
            throw new IllegalArgumentException(new StringBuffer().append("exceptions / branchingness ").append("mismatch").toString());
        }
        this.opcode = i;
        this.result = type;
        this.sources = typeList;
        this.exceptions = typeList2;
        this.branchingness = i2;
        this.isCallLike = z;
        this.nickname = str;
    }

    public Rop(int i, Type type, TypeList typeList, TypeList typeList2, int i2, String str) {
        this(i, type, typeList, typeList2, i2, false, str);
    }

    public Rop(int i, Type type, TypeList typeList, int i2, String str) {
        this(i, type, typeList, StdTypeList.EMPTY, i2, false, str);
    }

    public Rop(int i, Type type, TypeList typeList, String str) {
        this(i, type, typeList, StdTypeList.EMPTY, 1, false, str);
    }

    public Rop(int i, Type type, TypeList typeList, TypeList typeList2, String str) {
        this(i, type, typeList, typeList2, 6, false, str);
    }

    public Rop(int i, TypeList typeList, TypeList typeList2) {
        this(i, Type.VOID, typeList, typeList2, 6, true, (String) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rop)) {
            return false;
        }
        Rop c1681Rop = (Rop) obj;
        return this.opcode == c1681Rop.opcode && this.branchingness == c1681Rop.branchingness && this.result == c1681Rop.result && this.sources.equals(c1681Rop.sources) && this.exceptions.equals(c1681Rop.exceptions);
    }

    public int hashCode() {
        return (((((((this.opcode * 31) + this.branchingness) * 31) + this.result.hashCode()) * 31) + this.sources.hashCode()) * 31) + this.exceptions.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("Rop{");
        sb.append(RegOps.opName(this.opcode));
        if (this.result != Type.VOID) {
            sb.append(" ");
            sb.append(this.result);
        } else {
            sb.append(" .");
        }
        sb.append(" <-");
        int size = this.sources.size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(' ');
                sb.append(this.sources.getType(i));
            }
        }
        if (this.isCallLike) {
            sb.append(" call");
        }
        int size2 = this.exceptions.size();
        if (size2 != 0) {
            sb.append(" throws");
            for (int i2 = 0; i2 < size2; i2++) {
                sb.append(' ');
                if (this.exceptions.getType(i2) == Type.THROWABLE) {
                    sb.append("<any>");
                } else {
                    sb.append(this.exceptions.getType(i2));
                }
            }
        } else {
            switch (this.branchingness) {
                case 1:
                    sb.append(" flows");
                    break;
                case 2:
                    sb.append(" returns");
                    break;
                case 3:
                    sb.append(" gotos");
                    break;
                case 4:
                    sb.append(" ifs");
                    break;
                case 5:
                    sb.append(" switches");
                    break;
                default:
                    sb.append(new StringBuffer().append(" ").append(Hex.m7224u1(this.branchingness)).toString());
                    break;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public int getOpcode() {
        return this.opcode;
    }

    public Type getResult() {
        return this.result;
    }

    public TypeList getSources() {
        return this.sources;
    }

    public TypeList getExceptions() {
        return this.exceptions;
    }

    public int getBranchingness() {
        return this.branchingness;
    }

    public boolean isCallLike() {
        return this.isCallLike;
    }

    public boolean isCommutative() {
        switch (this.opcode) {
            case 14:
            case 16:
            case 20:
            case 21:
            case 22:
                return true;
            case 15:
            case 17:
            case 18:
            case 19:
            default:
                return false;
        }
    }

    public String getNickname() {
        return this.nickname != null ? this.nickname : toString();
    }

    public final boolean canThrow() {
        return this.exceptions.size() != 0;
    }
}
