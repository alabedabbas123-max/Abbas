package sun.reflect.generics.reflectiveObjects;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import sun.reflect.generics.factory.GenericsFactory;
import sun.reflect.generics.tree.FieldTypeSignature;
import sun.reflect.generics.visitor.Reifier;

public class WildcardTypeImpl extends LazyReflectiveObjectGenerator implements WildcardType {
    static final boolean $assertionsDisabled = false;
    private FieldTypeSignature[] lowerBoundASTs;
    private Type[] lowerBounds;
    private FieldTypeSignature[] upperBoundASTs;
    private Type[] upperBounds;

    private WildcardTypeImpl(FieldTypeSignature[] ubs, FieldTypeSignature[] lbs, GenericsFactory f) {
        super(f);
        this.upperBoundASTs = ubs;
        this.lowerBoundASTs = lbs;
    }

    public static WildcardTypeImpl make(FieldTypeSignature[] ubs, FieldTypeSignature[] lbs, GenericsFactory f) {
        return new WildcardTypeImpl(ubs, lbs, f);
    }

    private FieldTypeSignature[] getUpperBoundASTs() {
        return this.upperBoundASTs;
    }

    private FieldTypeSignature[] getLowerBoundASTs() {
        return this.lowerBoundASTs;
    }

    @Override
    public Type[] getUpperBounds() {
        if (this.upperBounds == null) {
            FieldTypeSignature[] fts = getUpperBoundASTs();
            Type[] ts = new Type[fts.length];
            for (int j = 0; j < fts.length; j++) {
                Reifier r = getReifier();
                fts[j].accept(r);
                ts[j] = r.getResult();
            }
            this.upperBounds = ts;
        }
        return (Type[]) this.upperBounds.clone();
    }

    @Override
    public Type[] getLowerBounds() {
        if (this.lowerBounds == null) {
            FieldTypeSignature[] fts = getLowerBoundASTs();
            Type[] ts = new Type[fts.length];
            for (int j = 0; j < fts.length; j++) {
                Reifier r = getReifier();
                fts[j].accept(r);
                ts[j] = r.getResult();
            }
            this.lowerBounds = ts;
        }
        return (Type[]) this.lowerBounds.clone();
    }

    public String toString() {
        Type[] lowerBounds = getLowerBounds();
        Type[] bounds = lowerBounds;
        StringBuilder sb = new StringBuilder();
        if (lowerBounds.length > 0) {
            sb.append("? super ");
        } else {
            Type[] upperBounds = getUpperBounds();
            if (upperBounds.length > 0 && !upperBounds[0].equals(Object.class)) {
                bounds = upperBounds;
                sb.append("? extends ");
            } else {
                return "?";
            }
        }
        boolean first = true;
        for (Type bound : bounds) {
            if (!first) {
                sb.append(" & ");
            }
            first = false;
            if (bound instanceof Class) {
                sb.append(((Class) bound).getName());
            } else {
                sb.append(bound.toString());
            }
        }
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (!(o instanceof WildcardType)) {
            return false;
        }
        WildcardType that = (WildcardType) o;
        return Arrays.equals(getLowerBounds(), that.getLowerBounds()) && Arrays.equals(getUpperBounds(), that.getUpperBounds());
    }

    public int hashCode() {
        Type[] lowerBounds = getLowerBounds();
        Type[] upperBounds = getUpperBounds();
        return Arrays.hashCode(lowerBounds) ^ Arrays.hashCode(upperBounds);
    }
}
