package javax.lang.model.util;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.type.NoType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeKind;

@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class TypeKindVisitor6<R, P> extends SimpleTypeVisitor6<R, P> {
    protected TypeKindVisitor6() {
        super(null);
    }

    protected TypeKindVisitor6(R defaultValue) {
        super(defaultValue);
    }

    @Override
    public R visitPrimitive(PrimitiveType t, P p) {
        TypeKind k = t.getKind();
        switch (C07351.$SwitchMap$javax$lang$model$type$TypeKind[k.ordinal()]) {
            case 1:
                return visitPrimitiveAsBoolean(t, p);
            case 2:
                return visitPrimitiveAsByte(t, p);
            case 3:
                return visitPrimitiveAsShort(t, p);
            case 4:
                return visitPrimitiveAsInt(t, p);
            case 5:
                return visitPrimitiveAsLong(t, p);
            case 6:
                return visitPrimitiveAsChar(t, p);
            case 7:
                return visitPrimitiveAsFloat(t, p);
            case 8:
                return visitPrimitiveAsDouble(t, p);
            default:
                throw new AssertionError("Bad kind " + k + " for PrimitiveType" + t);
        }
    }

    public R visitPrimitiveAsBoolean(PrimitiveType t, P p) {
        return defaultAction(t, p);
    }

    public R visitPrimitiveAsByte(PrimitiveType t, P p) {
        return defaultAction(t, p);
    }

    public R visitPrimitiveAsShort(PrimitiveType t, P p) {
        return defaultAction(t, p);
    }

    public R visitPrimitiveAsInt(PrimitiveType t, P p) {
        return defaultAction(t, p);
    }

    public R visitPrimitiveAsLong(PrimitiveType t, P p) {
        return defaultAction(t, p);
    }

    public R visitPrimitiveAsChar(PrimitiveType t, P p) {
        return defaultAction(t, p);
    }

    public R visitPrimitiveAsFloat(PrimitiveType t, P p) {
        return defaultAction(t, p);
    }

    public R visitPrimitiveAsDouble(PrimitiveType t, P p) {
        return defaultAction(t, p);
    }

    @Override
    public R visitNoType(NoType t, P p) {
        TypeKind k = t.getKind();
        switch (k) {
            case VOID:
                return visitNoTypeAsVoid(t, p);
            case PACKAGE:
                return visitNoTypeAsPackage(t, p);
            case NONE:
                return visitNoTypeAsNone(t, p);
            default:
                throw new AssertionError("Bad kind " + k + " for NoType" + t);
        }
    }

    public R visitNoTypeAsVoid(NoType t, P p) {
        return defaultAction(t, p);
    }

    public R visitNoTypeAsPackage(NoType t, P p) {
        return defaultAction(t, p);
    }

    public R visitNoTypeAsNone(NoType t, P p) {
        return defaultAction(t, p);
    }
}
