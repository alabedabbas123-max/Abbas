package sun.reflect.generics.tree;

import sun.reflect.generics.visitor.TypeTreeVisitor;

public class Wildcard implements TypeArgument {
    private static final FieldTypeSignature[] emptyBounds = new FieldTypeSignature[0];
    private FieldTypeSignature[] lowerBounds;
    private FieldTypeSignature[] upperBounds;

    private Wildcard(FieldTypeSignature[] ubs, FieldTypeSignature[] lbs) {
        this.upperBounds = ubs;
        this.lowerBounds = lbs;
    }

    public static Wildcard make(FieldTypeSignature[] ubs, FieldTypeSignature[] lbs) {
        return new Wildcard(ubs, lbs);
    }

    public FieldTypeSignature[] getUpperBounds() {
        return this.upperBounds;
    }

    public FieldTypeSignature[] getLowerBounds() {
        FieldTypeSignature[] fieldTypeSignatureArr = this.lowerBounds;
        if (fieldTypeSignatureArr.length == 1 && fieldTypeSignatureArr[0] == BottomSignature.make()) {
            return emptyBounds;
        }
        return this.lowerBounds;
    }

    @Override
    public void accept(TypeTreeVisitor<?> v) {
        v.visitWildcard(this);
    }
}
