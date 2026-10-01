package com.almlkaide.kaypro.android.dx.rop.type;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class Prototype implements Comparable<Prototype> {
    private static final ConcurrentMap<String, Prototype> internTable = new ConcurrentHashMap(10000, 0.75f);
    private final String descriptor;
    private StdTypeList parameterFrameTypes;
    private final StdTypeList parameterTypes;
    private final Type returnType;

    @Override
    public int compareTo(Prototype prototype) {
        return compareTo2(prototype);
    }

    public static Prototype intern(String str) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        Prototype prototype = internTable.get(str);
        return prototype != null ? prototype : putIntern(fromDescriptor(str));
    }

    public static Prototype fromDescriptor(String str) {
        int i;
        Prototype prototype = internTable.get(str);
        if (prototype == null) {
            Type[] typeArrMakeParameterArray = makeParameterArray(str);
            int i2 = 1;
            int i3 = 0;
            while (true) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != ')') {
                    int i4 = i2;
                    while (cCharAt == '[') {
                        i4++;
                        cCharAt = str.charAt(i4);
                    }
                    if (cCharAt == 'L') {
                        int iIndexOf = str.indexOf(59, i4);
                        if (iIndexOf == -1) {
                            throw new IllegalArgumentException("bad descriptor");
                        }
                        i = iIndexOf + 1;
                    } else {
                        i = i4 + 1;
                    }
                    typeArrMakeParameterArray[i3] = Type.intern(str.substring(i2, i));
                    i3++;
                    i2 = i;
                } else {
                    Type typeInternReturnType = Type.internReturnType(str.substring(i2 + 1));
                    StdTypeList stdTypeList = new StdTypeList(i3);
                    for (int i5 = 0; i5 < i3; i5++) {
                        stdTypeList.m7198set(i5, typeArrMakeParameterArray[i5]);
                    }
                    return new Prototype(str, typeInternReturnType, stdTypeList);
                }
            }
        } else {
            return prototype;
        }
    }

    public static void clearInternTable() {
        internTable.clear();
    }

    private static Type[] makeParameterArray(String str) {
        int length = str.length();
        if (str.charAt(0) != '(') {
            throw new IllegalArgumentException("bad descriptor");
        }
        int i = 1;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = 0;
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == ')') {
                break;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i2++;
            }
            i++;
        }
        if (i == 0 || i == length - 1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        if (str.indexOf(41, i + 1) != -1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        return new Type[i2];
    }

    public static Prototype intern(String str, Type type, boolean z, boolean z2) {
        Prototype prototypeIntern = intern(str);
        if (!z) {
            if (z2) {
                type = type.asUninitialized(Integer.MAX_VALUE);
            }
            return prototypeIntern.withFirstParameter(type);
        }
        return prototypeIntern;
    }

    public static Prototype internInts(Type type, int i) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('(');
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('I');
        }
        sb.append(')');
        sb.append(type.getDescriptor());
        return intern(sb.toString());
    }

    Prototype(String str, Type type, StdTypeList stdTypeList) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (type == null) {
            throw new NullPointerException("returnType == null");
        }
        if (stdTypeList == null) {
            throw new NullPointerException("parameterTypes == null");
        }
        this.descriptor = str;
        this.returnType = type;
        this.parameterTypes = stdTypeList;
        this.parameterFrameTypes = (StdTypeList) null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Prototype)) {
            return false;
        }
        return this.descriptor.equals(((Prototype) obj).descriptor);
    }

    public int hashCode() {
        return this.descriptor.hashCode();
    }

    public int compareTo2(Prototype prototype) {
        if (this == prototype) {
            return 0;
        }
        int iCompareTo2 = this.returnType.compareTo2(prototype.returnType);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int size = this.parameterTypes.size();
        int size2 = prototype.parameterTypes.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo3 = this.parameterTypes.m7197get(i).compareTo2(prototype.parameterTypes.m7197get(i));
            if (iCompareTo3 != 0) {
                return iCompareTo3;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    public String toString() {
        return this.descriptor;
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public Type getReturnType() {
        return this.returnType;
    }

    public StdTypeList getParameterTypes() {
        return this.parameterTypes;
    }

    public StdTypeList getParameterFrameTypes() {
        if (this.parameterFrameTypes == null) {
            int size = this.parameterTypes.size();
            StdTypeList stdTypeList = new StdTypeList(size);
            boolean z = false;
            for (int i = 0; i < size; i++) {
                Type typeM7197get = this.parameterTypes.m7197get(i);
                if (typeM7197get.isIntlike()) {
                    z = true;
                    typeM7197get = Type.f5078INT;
                }
                stdTypeList.m7198set(i, typeM7197get);
            }
            this.parameterFrameTypes = z ? stdTypeList : this.parameterTypes;
        }
        return this.parameterFrameTypes;
    }

    public Prototype withFirstParameter(Type type) {
        String string = new StringBuffer().append(new StringBuffer().append("(").append(type.getDescriptor()).toString()).append(this.descriptor.substring(1)).toString();
        StdTypeList stdTypeListWithFirst = this.parameterTypes.withFirst(type);
        stdTypeListWithFirst.setImmutable();
        return putIntern(new Prototype(string, this.returnType, stdTypeListWithFirst));
    }

    private static Prototype putIntern(Prototype prototype) {
        Prototype prototypePutIfAbsent = internTable.putIfAbsent(prototype.getDescriptor(), prototype);
        return prototypePutIfAbsent != null ? prototypePutIfAbsent : prototype;
    }
}
