package com.almlkaide.kaypro.android.dx.rop.type;

import com.almlkaide.kaypro.android.dx.util.FixedSizeList;

public final class StdTypeList extends FixedSizeList implements TypeList {
    public static final StdTypeList EMPTY = new StdTypeList(0);

    public static final StdTypeList f5077INT = make(Type.f5078INT);
    public static final StdTypeList LONG = make(Type.LONG);
    public static final StdTypeList FLOAT = make(Type.FLOAT);
    public static final StdTypeList DOUBLE = make(Type.DOUBLE);
    public static final StdTypeList OBJECT = make(Type.OBJECT);
    public static final StdTypeList RETURN_ADDRESS = make(Type.RETURN_ADDRESS);
    public static final StdTypeList THROWABLE = make(Type.THROWABLE);
    public static final StdTypeList INT_INT = make(Type.f5078INT, Type.f5078INT);
    public static final StdTypeList LONG_LONG = make(Type.LONG, Type.LONG);
    public static final StdTypeList FLOAT_FLOAT = make(Type.FLOAT, Type.FLOAT);
    public static final StdTypeList DOUBLE_DOUBLE = make(Type.DOUBLE, Type.DOUBLE);
    public static final StdTypeList OBJECT_OBJECT = make(Type.OBJECT, Type.OBJECT);
    public static final StdTypeList INT_OBJECT = make(Type.f5078INT, Type.OBJECT);
    public static final StdTypeList LONG_OBJECT = make(Type.LONG, Type.OBJECT);
    public static final StdTypeList FLOAT_OBJECT = make(Type.FLOAT, Type.OBJECT);
    public static final StdTypeList DOUBLE_OBJECT = make(Type.DOUBLE, Type.OBJECT);
    public static final StdTypeList LONG_INT = make(Type.LONG, Type.f5078INT);
    public static final StdTypeList INTARR_INT = make(Type.INT_ARRAY, Type.f5078INT);
    public static final StdTypeList LONGARR_INT = make(Type.LONG_ARRAY, Type.f5078INT);
    public static final StdTypeList FLOATARR_INT = make(Type.FLOAT_ARRAY, Type.f5078INT);
    public static final StdTypeList DOUBLEARR_INT = make(Type.DOUBLE_ARRAY, Type.f5078INT);
    public static final StdTypeList OBJECTARR_INT = make(Type.OBJECT_ARRAY, Type.f5078INT);
    public static final StdTypeList BOOLEANARR_INT = make(Type.BOOLEAN_ARRAY, Type.f5078INT);
    public static final StdTypeList BYTEARR_INT = make(Type.BYTE_ARRAY, Type.f5078INT);
    public static final StdTypeList CHARARR_INT = make(Type.CHAR_ARRAY, Type.f5078INT);
    public static final StdTypeList SHORTARR_INT = make(Type.SHORT_ARRAY, Type.f5078INT);
    public static final StdTypeList INT_INTARR_INT = make(Type.f5078INT, Type.INT_ARRAY, Type.f5078INT);
    public static final StdTypeList LONG_LONGARR_INT = make(Type.LONG, Type.LONG_ARRAY, Type.f5078INT);
    public static final StdTypeList FLOAT_FLOATARR_INT = make(Type.FLOAT, Type.FLOAT_ARRAY, Type.f5078INT);
    public static final StdTypeList DOUBLE_DOUBLEARR_INT = make(Type.DOUBLE, Type.DOUBLE_ARRAY, Type.f5078INT);
    public static final StdTypeList OBJECT_OBJECTARR_INT = make(Type.OBJECT, Type.OBJECT_ARRAY, Type.f5078INT);
    public static final StdTypeList INT_BOOLEANARR_INT = make(Type.f5078INT, Type.BOOLEAN_ARRAY, Type.f5078INT);
    public static final StdTypeList INT_BYTEARR_INT = make(Type.f5078INT, Type.BYTE_ARRAY, Type.f5078INT);
    public static final StdTypeList INT_CHARARR_INT = make(Type.f5078INT, Type.CHAR_ARRAY, Type.f5078INT);
    public static final StdTypeList INT_SHORTARR_INT = make(Type.f5078INT, Type.SHORT_ARRAY, Type.f5078INT);

    public static StdTypeList make(Type type) {
        StdTypeList stdTypeList = new StdTypeList(1);
        stdTypeList.m7198set(0, type);
        return stdTypeList;
    }

    public static StdTypeList make(Type type, Type type2) {
        StdTypeList stdTypeList = new StdTypeList(2);
        stdTypeList.m7198set(0, type);
        stdTypeList.m7198set(1, type2);
        return stdTypeList;
    }

    public static StdTypeList make(Type type, Type type2, Type type3) {
        StdTypeList stdTypeList = new StdTypeList(3);
        stdTypeList.m7198set(0, type);
        stdTypeList.m7198set(1, type2);
        stdTypeList.m7198set(2, type3);
        return stdTypeList;
    }

    public static StdTypeList make(Type type, Type type2, Type type3, Type type4) {
        StdTypeList stdTypeList = new StdTypeList(4);
        stdTypeList.m7198set(0, type);
        stdTypeList.m7198set(1, type2);
        stdTypeList.m7198set(2, type3);
        stdTypeList.m7198set(3, type4);
        return stdTypeList;
    }

    public static String toHuman(TypeList typeList) {
        int size = typeList.size();
        if (size == 0) {
            return "<empty>";
        }
        StringBuilder sb = new StringBuilder(100);
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(typeList.getType(i).toHuman());
        }
        return sb.toString();
    }

    public static int hashContents(TypeList typeList) {
        int size = typeList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int iHashCode = (i2 * 31) + typeList.getType(i).hashCode();
            i++;
            i2 = iHashCode;
        }
        return i2;
    }

    public static boolean equalContents(TypeList typeList, TypeList typeList2) {
        int size = typeList.size();
        if (typeList2.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!typeList.getType(i).equals(typeList2.getType(i))) {
                return false;
            }
        }
        return true;
    }

    public static int compareContents(TypeList typeList, TypeList typeList2) {
        int size = typeList.size();
        int size2 = typeList2.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo2 = typeList.getType(i).compareTo2(typeList2.getType(i));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        if (size == size2) {
            return 0;
        }
        if (size < size2) {
            return -1;
        }
        return 1;
    }

    public StdTypeList(int i) {
        super(i);
    }

    @Override
    public Type getType(int i) {
        return m7197get(i);
    }

    @Override
    public int getWordCount() {
        int size = size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int category = m7197get(i).getCategory() + i2;
            i++;
            i2 = category;
        }
        return i2;
    }

    @Override
    public TypeList withAddedType(Type type) {
        int size = size();
        StdTypeList stdTypeList = new StdTypeList(size + 1);
        for (int i = 0; i < size; i++) {
            stdTypeList.set0(i, get0(i));
        }
        stdTypeList.m7198set(size, type);
        stdTypeList.setImmutable();
        return stdTypeList;
    }

    public Type m7197get(int i) {
        return (Type) get0(i);
    }

    public void m7198set(int i, Type type) {
        set0(i, type);
    }

    public StdTypeList withFirst(Type type) {
        int size = size();
        StdTypeList stdTypeList = new StdTypeList(size + 1);
        stdTypeList.set0(0, type);
        for (int i = 0; i < size; i++) {
            stdTypeList.set0(i + 1, getOrNull0(i));
        }
        return stdTypeList;
    }
}
