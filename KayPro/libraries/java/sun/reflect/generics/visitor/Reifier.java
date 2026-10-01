package sun.reflect.generics.visitor;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import sun.reflect.generics.factory.GenericsFactory;
import sun.reflect.generics.tree.ArrayTypeSignature;
import sun.reflect.generics.tree.BooleanSignature;
import sun.reflect.generics.tree.BottomSignature;
import sun.reflect.generics.tree.ByteSignature;
import sun.reflect.generics.tree.CharSignature;
import sun.reflect.generics.tree.ClassTypeSignature;
import sun.reflect.generics.tree.DoubleSignature;
import sun.reflect.generics.tree.FloatSignature;
import sun.reflect.generics.tree.FormalTypeParameter;
import sun.reflect.generics.tree.IntSignature;
import sun.reflect.generics.tree.LongSignature;
import sun.reflect.generics.tree.ShortSignature;
import sun.reflect.generics.tree.SimpleClassTypeSignature;
import sun.reflect.generics.tree.TypeArgument;
import sun.reflect.generics.tree.TypeVariableSignature;
import sun.reflect.generics.tree.VoidDescriptor;
import sun.reflect.generics.tree.Wildcard;

public class Reifier implements TypeTreeVisitor<Type> {
    static final boolean $assertionsDisabled = false;
    private GenericsFactory factory;
    private Type resultType;

    private Reifier(GenericsFactory f) {
        this.factory = f;
    }

    private GenericsFactory getFactory() {
        return this.factory;
    }

    public static Reifier make(GenericsFactory f) {
        return new Reifier(f);
    }

    private Type[] reifyTypeArguments(TypeArgument[] tas) {
        Type[] ts = new Type[tas.length];
        for (int i = 0; i < tas.length; i++) {
            tas[i].accept(this);
            ts[i] = this.resultType;
        }
        return ts;
    }

    @Override
    public Type getResult() {
        return this.resultType;
    }

    @Override
    public void visitFormalTypeParameter(FormalTypeParameter ftp) {
        this.resultType = getFactory().makeTypeVariable(ftp.getName(), ftp.getBounds());
    }

    @Override
    public void visitClassTypeSignature(ClassTypeSignature ct) {
        List<SimpleClassTypeSignature> scts = ct.getPath();
        Iterator<SimpleClassTypeSignature> iter = scts.iterator();
        SimpleClassTypeSignature sc = iter.next();
        StringBuilder n = new StringBuilder(sc.getName());
        sc.getDollar();
        while (true) {
            String str = "$";
            if (!iter.hasNext() || sc.getTypeArguments().length != 0) {
                break;
            }
            sc = iter.next();
            boolean dollar = sc.getDollar();
            if (!dollar) {
                str = ".";
            }
            n.append(str);
            n.append(sc.getName());
        }
        Type c = getFactory().makeNamedType(n.toString());
        if (sc.getTypeArguments().length == 0) {
            this.resultType = c;
            return;
        }
        Type[] pts = reifyTypeArguments(sc.getTypeArguments());
        Type owner = getFactory().makeParameterizedType(c, pts, null);
        while (iter.hasNext()) {
            SimpleClassTypeSignature sc2 = iter.next();
            boolean dollar2 = sc2.getDollar();
            n.append(dollar2 ? "$" : ".");
            n.append(sc2.getName());
            Type c2 = getFactory().makeNamedType(n.toString());
            Type[] pts2 = reifyTypeArguments(sc2.getTypeArguments());
            owner = getFactory().makeParameterizedType(c2, pts2, owner);
        }
        this.resultType = owner;
    }

    @Override
    public void visitArrayTypeSignature(ArrayTypeSignature a) {
        a.getComponentType().accept(this);
        Type ct = this.resultType;
        this.resultType = getFactory().makeArrayType(ct);
    }

    @Override
    public void visitTypeVariableSignature(TypeVariableSignature tv) {
        this.resultType = getFactory().findTypeVariable(tv.getIdentifier());
    }

    @Override
    public void visitWildcard(Wildcard w) {
        this.resultType = getFactory().makeWildcard(w.getUpperBounds(), w.getLowerBounds());
    }

    @Override
    public void visitSimpleClassTypeSignature(SimpleClassTypeSignature sct) {
        this.resultType = getFactory().makeNamedType(sct.getName());
    }

    @Override
    public void visitBottomSignature(BottomSignature b) {
    }

    @Override
    public void visitByteSignature(ByteSignature b) {
        this.resultType = getFactory().makeByte();
    }

    @Override
    public void visitBooleanSignature(BooleanSignature b) {
        this.resultType = getFactory().makeBool();
    }

    @Override
    public void visitShortSignature(ShortSignature s) {
        this.resultType = getFactory().makeShort();
    }

    @Override
    public void visitCharSignature(CharSignature c) {
        this.resultType = getFactory().makeChar();
    }

    @Override
    public void visitIntSignature(IntSignature i) {
        this.resultType = getFactory().makeInt();
    }

    @Override
    public void visitLongSignature(LongSignature l) {
        this.resultType = getFactory().makeLong();
    }

    @Override
    public void visitFloatSignature(FloatSignature f) {
        this.resultType = getFactory().makeFloat();
    }

    @Override
    public void visitDoubleSignature(DoubleSignature d) {
        this.resultType = getFactory().makeDouble();
    }

    @Override
    public void visitVoidDescriptor(VoidDescriptor v) {
        this.resultType = getFactory().makeVoid();
    }
}
