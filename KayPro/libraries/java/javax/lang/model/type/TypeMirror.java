package javax.lang.model.type;

public interface TypeMirror {
    <R, P> R accept(TypeVisitor<R, P> typeVisitor, P p);

    boolean equals(Object obj);

    TypeKind getKind();

    int hashCode();

    String toString();
}
