package sun.reflect.generics.visitor;

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
import sun.reflect.generics.tree.TypeVariableSignature;
import sun.reflect.generics.tree.VoidDescriptor;
import sun.reflect.generics.tree.Wildcard;

public interface TypeTreeVisitor<T> {
    T getResult();

    void visitArrayTypeSignature(ArrayTypeSignature arrayTypeSignature);

    void visitBooleanSignature(BooleanSignature booleanSignature);

    void visitBottomSignature(BottomSignature bottomSignature);

    void visitByteSignature(ByteSignature byteSignature);

    void visitCharSignature(CharSignature charSignature);

    void visitClassTypeSignature(ClassTypeSignature classTypeSignature);

    void visitDoubleSignature(DoubleSignature doubleSignature);

    void visitFloatSignature(FloatSignature floatSignature);

    void visitFormalTypeParameter(FormalTypeParameter formalTypeParameter);

    void visitIntSignature(IntSignature intSignature);

    void visitLongSignature(LongSignature longSignature);

    void visitShortSignature(ShortSignature shortSignature);

    void visitSimpleClassTypeSignature(SimpleClassTypeSignature simpleClassTypeSignature);

    void visitTypeVariableSignature(TypeVariableSignature typeVariableSignature);

    void visitVoidDescriptor(VoidDescriptor voidDescriptor);

    void visitWildcard(Wildcard wildcard);
}
