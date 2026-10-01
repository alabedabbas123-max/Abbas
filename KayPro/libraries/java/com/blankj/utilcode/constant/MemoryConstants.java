package com.blankj.utilcode.constant;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class MemoryConstants {
    public static final int BYTE = 1;

    public static final int f4579GB = 1073741824;

    public static final int f4580KB = 1024;

    public static final int f4581MB = 1048576;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Unit {
    }
}
