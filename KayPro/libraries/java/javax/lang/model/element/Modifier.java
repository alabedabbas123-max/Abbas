package javax.lang.model.element;

import java.util.Locale;

public enum Modifier {
    PUBLIC,
    PROTECTED,
    PRIVATE,
    ABSTRACT,
    STATIC,
    FINAL,
    TRANSIENT,
    VOLATILE,
    SYNCHRONIZED,
    NATIVE,
    STRICTFP;

    private String lowercase = null;

    Modifier() {
    }

    @Override
    public String toString() {
        if (this.lowercase == null) {
            this.lowercase = name().toLowerCase(Locale.US);
        }
        return this.lowercase;
    }
}
