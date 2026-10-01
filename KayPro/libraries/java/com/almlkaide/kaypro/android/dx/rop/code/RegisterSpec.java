package com.almlkaide.kaypro.android.dx.rop.code;

import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import com.almlkaide.kaypro.android.dx.util.ToHuman;
import java.util.concurrent.ConcurrentHashMap;

public final class RegisterSpec implements TypeBearer, ToHuman, Comparable<RegisterSpec> {
    public static final String PREFIX = "v";
    private final LocalItem local;

    private final int f5070reg;
    private final TypeBearer type;
    private static final ConcurrentHashMap<Object, RegisterSpec> theInterns = new ConcurrentHashMap<>(10000, 0.75f);
    private static final ThreadLocal<ForComparison> theInterningItem = new ThreadLocal<ForComparison>() {
        @Override
        protected ForComparison initialValue() {
            return initialValue();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        protected ForComparison initialValue() {
            return new ForComparison();
        }
    };

    @Override
    public int compareTo(RegisterSpec registerSpec) {
        return compareTo2(registerSpec);
    }

    private static RegisterSpec intern(int i, TypeBearer typeBearer, LocalItem localItem) {
        RegisterSpec registerSpecPutIfAbsent;
        ForComparison forComparison = theInterningItem.get();
        forComparison.m7185set(i, typeBearer, localItem);
        RegisterSpec registerSpec = theInterns.get(forComparison);
        return (registerSpec != null || (registerSpecPutIfAbsent = theInterns.putIfAbsent((registerSpec = forComparison.toRegisterSpec()), registerSpec)) == null) ? registerSpec : registerSpecPutIfAbsent;
    }

    public static RegisterSpec make(int i, TypeBearer typeBearer) {
        return intern(i, typeBearer, (LocalItem) null);
    }

    public static RegisterSpec make(int i, TypeBearer typeBearer, LocalItem localItem) {
        if (localItem == null) {
            throw new NullPointerException("local  == null");
        }
        return intern(i, typeBearer, localItem);
    }

    public static RegisterSpec makeLocalOptional(int i, TypeBearer typeBearer, LocalItem localItem) {
        return intern(i, typeBearer, localItem);
    }

    public static String regString(int i) {
        return new StringBuffer().append("v").append(i).toString();
    }

    RegisterSpec(int i, TypeBearer typeBearer, LocalItem localItem) {
        if (i < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (typeBearer == null) {
            throw new NullPointerException("type == null");
        }
        this.f5070reg = i;
        this.type = typeBearer;
        this.local = localItem;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterSpec)) {
            if (obj instanceof ForComparison) {
                ForComparison forComparison = (ForComparison) obj;
                return equals(forComparison.f5071reg, forComparison.type, forComparison.local);
            }
            return false;
        }
        RegisterSpec registerSpec = (RegisterSpec) obj;
        return equals(registerSpec.f5070reg, registerSpec.type, registerSpec.local);
    }

    public boolean equalsUsingSimpleType(RegisterSpec registerSpec) {
        return matchesVariable(registerSpec) && this.f5070reg == registerSpec.f5070reg;
    }

    public boolean matchesVariable(RegisterSpec registerSpec) {
        if (registerSpec != null && this.type.getType().equals(registerSpec.type.getType())) {
            return this.local == registerSpec.local || (this.local != null && this.local.equals(registerSpec.local));
        }
        return false;
    }

    public boolean equals(int i, TypeBearer typeBearer, LocalItem localItem) {
        return this.f5070reg == i && this.type.equals(typeBearer) && (this.local == localItem || (this.local != null && this.local.equals(localItem)));
    }

    public int compareTo2(RegisterSpec registerSpec) {
        if (this.f5070reg < registerSpec.f5070reg) {
            return -1;
        }
        if (this.f5070reg > registerSpec.f5070reg) {
            return 1;
        }
        if (this == registerSpec) {
            return 0;
        }
        int iCompareTo2 = this.type.getType().compareTo2(registerSpec.type.getType());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (this.local == null) {
            return registerSpec.local != null ? -1 : 0;
        }
        if (registerSpec.local == null) {
            return 1;
        }
        return this.local.compareTo2(registerSpec.local);
    }

    public int hashCode() {
        return hashCodeOf(this.f5070reg, this.type, this.local);
    }

    public static int hashCodeOf(int i, TypeBearer typeBearer, LocalItem localItem) {
        return ((((localItem != null ? localItem.hashCode() : 0) * 31) + typeBearer.hashCode()) * 31) + i;
    }

    public String toString() {
        return toString0(false);
    }

    @Override
    public String toHuman() {
        return toString0(true);
    }

    @Override
    public Type getType() {
        return this.type.getType();
    }

    @Override
    public TypeBearer getFrameType() {
        return this.type.getFrameType();
    }

    @Override
    public final int getBasicType() {
        return this.type.getBasicType();
    }

    @Override
    public final int getBasicFrameType() {
        return this.type.getBasicFrameType();
    }

    @Override
    public final boolean isConstant() {
        return false;
    }

    public int getReg() {
        return this.f5070reg;
    }

    public TypeBearer getTypeBearer() {
        return this.type;
    }

    public LocalItem getLocalItem() {
        return this.local;
    }

    public int getNextReg() {
        return this.f5070reg + getCategory();
    }

    public int getCategory() {
        return this.type.getType().getCategory();
    }

    public boolean isCategory1() {
        return this.type.getType().isCategory1();
    }

    public boolean isCategory2() {
        return this.type.getType().isCategory2();
    }

    public String regString() {
        return regString(this.f5070reg);
    }

    public RegisterSpec intersect(RegisterSpec registerSpec, boolean z) {
        if (this == registerSpec) {
            return this;
        }
        if (registerSpec == null || this.f5070reg != registerSpec.getReg()) {
            return (RegisterSpec) null;
        }
        LocalItem localItem = (this.local == null || !this.local.equals(registerSpec.getLocalItem())) ? (LocalItem) null : this.local;
        boolean z2 = localItem == this.local;
        if (z && !z2) {
            return (RegisterSpec) null;
        }
        Type type = getType();
        if (type != registerSpec.getType()) {
            return (RegisterSpec) null;
        }
        TypeBearer typeBearer = this.type.equals(registerSpec.getTypeBearer()) ? this.type : type;
        if (typeBearer == this.type && z2) {
            return this;
        }
        return localItem == null ? make(this.f5070reg, typeBearer) : make(this.f5070reg, typeBearer, localItem);
    }

    public RegisterSpec withReg(int i) {
        return this.f5070reg == i ? this : makeLocalOptional(i, this.type, this.local);
    }

    public RegisterSpec withType(TypeBearer typeBearer) {
        return makeLocalOptional(this.f5070reg, typeBearer, this.local);
    }

    public RegisterSpec withOffset(int i) {
        return i == 0 ? this : withReg(this.f5070reg + i);
    }

    public RegisterSpec withSimpleType() {
        Type type;
        TypeBearer typeBearer = this.type;
        if (typeBearer instanceof Type) {
            type = (Type) typeBearer;
        } else {
            type = typeBearer.getType();
        }
        if (type.isUninitialized()) {
            type = type.getInitializedType();
        }
        return type == typeBearer ? this : makeLocalOptional(this.f5070reg, type, this.local);
    }

    public RegisterSpec withLocalItem(LocalItem localItem) {
        if (this.local != localItem) {
            return (this.local == null || !this.local.equals(localItem)) ? makeLocalOptional(this.f5070reg, this.type, localItem) : this;
        }
        return this;
    }

    public boolean isEvenRegister() {
        return (getReg() & 1) == 0;
    }

    private String toString0(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(regString());
        sb.append(Config.TRACE_TODAY_VISIT_SPLIT);
        if (this.local != null) {
            sb.append(this.local.toString());
        }
        Type type = this.type.getType();
        sb.append(type);
        if (type != this.type) {
            sb.append("=");
            if (z && (this.type instanceof CstString)) {
                sb.append(((CstString) this.type).toQuoted());
            } else if (z && (this.type instanceof Constant)) {
                sb.append(this.type.toHuman());
            } else {
                sb.append(this.type);
            }
        }
        return sb.toString();
    }

    public static void clearInternTable() {
        theInterns.clear();
    }

    private static class ForComparison {
        private LocalItem local;

        private int f5071reg;
        private TypeBearer type;

        public void m7185set(int i, TypeBearer typeBearer, LocalItem localItem) {
            this.f5071reg = i;
            this.type = typeBearer;
            this.local = localItem;
        }

        public RegisterSpec toRegisterSpec() {
            return new RegisterSpec(this.f5071reg, this.type, this.local);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof RegisterSpec)) {
                return false;
            }
            return ((RegisterSpec) obj).equals(this.f5071reg, this.type, this.local);
        }

        public int hashCode() {
            return RegisterSpec.hashCodeOf(this.f5071reg, this.type, this.local);
        }
    }
}
