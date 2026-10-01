package javax.lang.model.type;

public interface TypeVisitor<R, P> {
    R visit(TypeMirror typeMirror);

    R visit(TypeMirror typeMirror, P p);

    R visitArray(ArrayType arrayType, P p);

    R visitDeclared(DeclaredType declaredType, P p);

    R visitError(ErrorType errorType, P p);

    R visitExecutable(ExecutableType executableType, P p);

    R visitNoType(NoType noType, P p);

    R visitNull(NullType nullType, P p);

    R visitPrimitive(PrimitiveType primitiveType, P p);

    R visitTypeVariable(TypeVariable typeVariable, P p);

    R visitUnion(UnionType unionType, P p);

    R visitUnknown(TypeMirror typeMirror, P p);

    R visitWildcard(WildcardType wildcardType, P p);
}
