package javax.lang.model.element;

public interface PackageElement extends Element, QualifiedNameable {
    @Override
    Element getEnclosingElement();

    @Override
    Name getQualifiedName();

    @Override
    Name getSimpleName();

    boolean isUnnamed();
}
