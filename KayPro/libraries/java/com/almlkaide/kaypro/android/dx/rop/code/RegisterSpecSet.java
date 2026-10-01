package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.util.MutabilityControl;

public final class RegisterSpecSet extends MutabilityControl {
    public static final RegisterSpecSet EMPTY = new RegisterSpecSet(0);
    private int size;
    private final RegisterSpec[] specs;

    public RegisterSpecSet(int i) {
        super(i != 0);
        this.specs = new RegisterSpec[i];
        this.size = 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RegisterSpecSet)) {
            return false;
        }
        RegisterSpecSet registerSpecSet = (RegisterSpecSet) obj;
        RegisterSpec[] registerSpecArr = registerSpecSet.specs;
        int length = this.specs.length;
        if (length != registerSpecArr.length || size() != registerSpecSet.size()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            RegisterSpec registerSpec = this.specs[i];
            Object obj2 = registerSpecArr[i];
            if (registerSpec != obj2 && (registerSpec == null || !registerSpec.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int length = this.specs.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            RegisterSpec registerSpec = this.specs[i];
            iHashCode = (iHashCode * 31) + (registerSpec == null ? 0 : registerSpec.hashCode());
        }
        return iHashCode;
    }

    public String toString() {
        int length = this.specs.length;
        StringBuilder sb = new StringBuilder(length * 25);
        sb.append('{');
        boolean z = false;
        for (int i = 0; i < length; i++) {
            RegisterSpec registerSpec = this.specs[i];
            if (registerSpec != null) {
                if (z) {
                    sb.append(", ");
                } else {
                    z = true;
                }
                sb.append(registerSpec);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public int getMaxSize() {
        return this.specs.length;
    }

    public int size() {
        int i = this.size;
        if (i < 0) {
            int length = this.specs.length;
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (this.specs[i2] != null) {
                    i++;
                }
            }
            this.size = i;
        }
        return i;
    }

    public RegisterSpec m7190get(int i) {
        try {
            return this.specs[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    public RegisterSpec m7191get(RegisterSpec registerSpec) {
        return m7190get(registerSpec.getReg());
    }

    public RegisterSpec findMatchingLocal(RegisterSpec registerSpec) {
        int length = this.specs.length;
        for (int i = 0; i < length; i++) {
            RegisterSpec registerSpec2 = this.specs[i];
            if (registerSpec2 != null && registerSpec.matchesVariable(registerSpec2)) {
                return registerSpec2;
            }
        }
        return (RegisterSpec) null;
    }

    public RegisterSpec localItemToSpec(LocalItem localItem) {
        int length = this.specs.length;
        for (int i = 0; i < length; i++) {
            RegisterSpec registerSpec = this.specs[i];
            if (registerSpec != null && localItem.equals(registerSpec.getLocalItem())) {
                return registerSpec;
            }
        }
        return (RegisterSpec) null;
    }

    public void remove(RegisterSpec registerSpec) {
        try {
            this.specs[registerSpec.getReg()] = (RegisterSpec) null;
            this.size = -1;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    public void m7192put(RegisterSpec registerSpec) {
        int i;
        RegisterSpec registerSpec2;
        throwIfImmutable();
        if (registerSpec == null) {
            throw new NullPointerException("spec == null");
        }
        this.size = -1;
        try {
            int reg = registerSpec.getReg();
            this.specs[reg] = registerSpec;
            if (reg > 0 && (registerSpec2 = this.specs[(i = reg - 1)]) != null && registerSpec2.getCategory() == 2) {
                this.specs[i] = (RegisterSpec) null;
            }
            if (registerSpec.getCategory() == 2) {
                this.specs[reg + 1] = (RegisterSpec) null;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
    }

    public void putAll(RegisterSpecSet registerSpecSet) {
        int maxSize = registerSpecSet.getMaxSize();
        for (int i = 0; i < maxSize; i++) {
            RegisterSpec registerSpecM7190get = registerSpecSet.m7190get(i);
            if (registerSpecM7190get != null) {
                m7192put(registerSpecM7190get);
            }
        }
    }

    public void intersect(RegisterSpecSet registerSpecSet, boolean z) {
        RegisterSpec registerSpecIntersect;
        throwIfImmutable();
        RegisterSpec[] registerSpecArr = registerSpecSet.specs;
        int length = this.specs.length;
        int iMin = Math.min(length, registerSpecArr.length);
        this.size = -1;
        for (int i = 0; i < iMin; i++) {
            RegisterSpec registerSpec = this.specs[i];
            if (registerSpec != null && (registerSpecIntersect = registerSpec.intersect(registerSpecArr[i], z)) != registerSpec) {
                this.specs[i] = registerSpecIntersect;
            }
        }
        for (int i2 = iMin; i2 < length; i2++) {
            this.specs[i2] = (RegisterSpec) null;
        }
    }

    public RegisterSpecSet withOffset(int i) {
        int length = this.specs.length;
        RegisterSpecSet registerSpecSet = new RegisterSpecSet(length + i);
        for (int i2 = 0; i2 < length; i2++) {
            RegisterSpec registerSpec = this.specs[i2];
            if (registerSpec != null) {
                registerSpecSet.m7192put(registerSpec.withOffset(i));
            }
        }
        registerSpecSet.size = this.size;
        if (isImmutable()) {
            registerSpecSet.setImmutable();
        }
        return registerSpecSet;
    }

    public RegisterSpecSet mutableCopy() {
        int length = this.specs.length;
        RegisterSpecSet registerSpecSet = new RegisterSpecSet(length);
        for (int i = 0; i < length; i++) {
            RegisterSpec registerSpec = this.specs[i];
            if (registerSpec != null) {
                registerSpecSet.m7192put(registerSpec);
            }
        }
        registerSpecSet.size = this.size;
        return registerSpecSet;
    }
}
