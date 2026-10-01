package com.almlkaide.kaypro.android.dx.merge;

public enum CollisionPolicy {
    KEEP_FIRST,
    FAIL;

    public static CollisionPolicy valueOf(String str) {
        for (CollisionPolicy collisionPolicy : values()) {
            if (collisionPolicy.name().equals(str)) {
                return collisionPolicy;
            }
        }
        throw new IllegalArgumentException();
    }
}
