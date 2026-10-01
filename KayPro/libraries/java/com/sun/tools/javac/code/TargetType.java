package com.sun.tools.javac.code;

import java.util.EnumSet;
import java.util.Set;

public enum TargetType {
    TYPECAST(0, TargetAttribute.IsLocal),
    TYPECAST_GENERIC_OR_ARRAY(1, TargetAttribute.HasLocation, TargetAttribute.IsLocal),
    INSTANCEOF(2, TargetAttribute.IsLocal),
    INSTANCEOF_GENERIC_OR_ARRAY(3, TargetAttribute.HasLocation, TargetAttribute.IsLocal),
    NEW(4, TargetAttribute.IsLocal),
    NEW_GENERIC_OR_ARRAY(5, TargetAttribute.HasLocation, TargetAttribute.IsLocal),
    METHOD_RECEIVER(6, new TargetAttribute[0]),
    LOCAL_VARIABLE(8, TargetAttribute.IsLocal),
    LOCAL_VARIABLE_GENERIC_OR_ARRAY(9, TargetAttribute.HasLocation, TargetAttribute.IsLocal),
    METHOD_RETURN_GENERIC_OR_ARRAY(11, TargetAttribute.HasLocation),
    METHOD_PARAMETER_GENERIC_OR_ARRAY(13, TargetAttribute.HasLocation),
    FIELD_GENERIC_OR_ARRAY(15, TargetAttribute.HasLocation),
    CLASS_TYPE_PARAMETER_BOUND(16, TargetAttribute.HasBound, TargetAttribute.HasParameter),
    CLASS_TYPE_PARAMETER_BOUND_GENERIC_OR_ARRAY(17, TargetAttribute.HasBound, TargetAttribute.HasLocation, TargetAttribute.HasParameter),
    METHOD_TYPE_PARAMETER_BOUND(18, TargetAttribute.HasBound, TargetAttribute.HasParameter),
    METHOD_TYPE_PARAMETER_BOUND_GENERIC_OR_ARRAY(19, TargetAttribute.HasBound, TargetAttribute.HasLocation, TargetAttribute.HasParameter),
    CLASS_EXTENDS(20, new TargetAttribute[0]),
    CLASS_EXTENDS_GENERIC_OR_ARRAY(21, TargetAttribute.HasLocation),
    THROWS(22, new TargetAttribute[0]),
    NEW_TYPE_ARGUMENT(24, TargetAttribute.IsLocal),
    NEW_TYPE_ARGUMENT_GENERIC_OR_ARRAY(25, TargetAttribute.HasLocation, TargetAttribute.IsLocal),
    METHOD_TYPE_ARGUMENT(26, TargetAttribute.IsLocal),
    METHOD_TYPE_ARGUMENT_GENERIC_OR_ARRAY(27, TargetAttribute.HasLocation, TargetAttribute.IsLocal),
    WILDCARD_BOUND(28, TargetAttribute.HasBound),
    WILDCARD_BOUND_GENERIC_OR_ARRAY(29, TargetAttribute.HasBound, TargetAttribute.HasLocation),
    CLASS_LITERAL(30, TargetAttribute.IsLocal),
    CLASS_LITERAL_GENERIC_OR_ARRAY(31, TargetAttribute.HasLocation, TargetAttribute.IsLocal),
    METHOD_TYPE_PARAMETER(32, TargetAttribute.HasParameter),
    CLASS_TYPE_PARAMETER(34, TargetAttribute.HasParameter),
    UNKNOWN(-1, new TargetAttribute[0]);

    static final int MAXIMUM_TARGET_TYPE_VALUE = 34;
    private static TargetType[] targets = null;
    private Set<TargetAttribute> flags;
    private final int targetTypeValue;

    enum TargetAttribute {
        HasLocation,
        HasParameter,
        HasBound,
        IsLocal
    }

    TargetType(int targetTypeValue, TargetAttribute... attributes) {
        if (targetTypeValue < -128 || targetTypeValue > 127) {
            throw new AssertionError("attribute type value needs to be a byte: " + targetTypeValue);
        }
        this.targetTypeValue = (byte) targetTypeValue;
        this.flags = EnumSet.noneOf(TargetAttribute.class);
        for (TargetAttribute attr : attributes) {
            this.flags.add(attr);
        }
    }

    public boolean hasLocation() {
        return this.flags.contains(TargetAttribute.HasLocation);
    }

    public TargetType getGenericComplement() {
        if (hasLocation()) {
            return this;
        }
        return fromTargetTypeValue(targetTypeValue() + 1);
    }

    public boolean hasParameter() {
        return this.flags.contains(TargetAttribute.HasParameter);
    }

    public boolean hasBound() {
        return this.flags.contains(TargetAttribute.HasBound);
    }

    public boolean isLocal() {
        return this.flags.contains(TargetAttribute.IsLocal);
    }

    public int targetTypeValue() {
        return this.targetTypeValue;
    }

    private static TargetType[] buildTargets() {
        TargetType[] targets2 = new TargetType[35];
        TargetType[] alltargets = values();
        for (TargetType target : alltargets) {
            int i = target.targetTypeValue;
            if (i >= 0) {
                targets2[i] = target;
            }
        }
        for (int i2 = 0; i2 <= 34; i2++) {
            if (targets2[i2] == null) {
                targets2[i2] = UNKNOWN;
            }
        }
        return targets2;
    }

    public static boolean isValidTargetTypeValue(int tag) {
        if (targets == null) {
            targets = buildTargets();
        }
        if (((byte) tag) == ((byte) UNKNOWN.targetTypeValue)) {
            return true;
        }
        return tag >= 0 && tag < targets.length;
    }

    public static TargetType fromTargetTypeValue(int tag) {
        if (targets == null) {
            targets = buildTargets();
        }
        byte b = (byte) tag;
        TargetType targetType = UNKNOWN;
        if (b == ((byte) targetType.targetTypeValue)) {
            return targetType;
        }
        if (tag >= 0) {
            TargetType[] targetTypeArr = targets;
            if (tag < targetTypeArr.length) {
                return targetTypeArr[tag];
            }
        }
        throw new IllegalArgumentException("Unknown TargetType: " + tag);
    }
}
