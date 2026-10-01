package javax.lang.model.util;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;

@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class SimpleElementVisitor6<R, P> extends AbstractElementVisitor6<R, P> {
    protected final R DEFAULT_VALUE;

    protected SimpleElementVisitor6() {
        this.DEFAULT_VALUE = null;
    }

    protected SimpleElementVisitor6(R defaultValue) {
        this.DEFAULT_VALUE = defaultValue;
    }

    protected R defaultAction(Element e, P p) {
        return this.DEFAULT_VALUE;
    }

    @Override
    public R visitPackage(PackageElement e, P p) {
        return defaultAction(e, p);
    }

    @Override
    public R visitType(TypeElement e, P p) {
        return defaultAction(e, p);
    }

    @Override
    public R visitVariable(VariableElement e, P p) {
        if (e.getKind() != ElementKind.RESOURCE_VARIABLE) {
            return defaultAction(e, p);
        }
        return visitUnknown(e, p);
    }

    @Override
    public R visitExecutable(ExecutableElement e, P p) {
        return defaultAction(e, p);
    }

    @Override
    public R visitTypeParameter(TypeParameterElement e, P p) {
        return defaultAction(e, p);
    }
}
