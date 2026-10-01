package com.almlkaide.kaypro.android.dx.rop.annotation;

import com.almlkaide.kaypro.android.dx.util.ToHuman;

public enum AnnotationVisibility implements ToHuman {
    RUNTIME("runtime"),
    BUILD("build"),
    SYSTEM("system"),
    EMBEDDED("embedded");

    private final String human;

    public static AnnotationVisibility valueOf(String str) {
        for (AnnotationVisibility annotationVisibility : values()) {
            if (annotationVisibility.name().equals(str)) {
                return annotationVisibility;
            }
        }
        throw new IllegalArgumentException();
    }

    AnnotationVisibility(String str) {
        this.human = str;
    }

    @Override
    public String toHuman() {
        return this.human;
    }
}
