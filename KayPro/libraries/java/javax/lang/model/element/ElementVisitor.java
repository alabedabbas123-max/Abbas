package javax.lang.model.element;

public interface ElementVisitor<R, P> {
    R visit(Element element);

    R visit(Element element, P p);

    R visitExecutable(ExecutableElement executableElement, P p);

    R visitPackage(PackageElement packageElement, P p);

    R visitType(TypeElement typeElement, P p);

    R visitTypeParameter(TypeParameterElement typeParameterElement, P p);

    R visitUnknown(Element element, P p);

    R visitVariable(VariableElement variableElement, P p);
}
