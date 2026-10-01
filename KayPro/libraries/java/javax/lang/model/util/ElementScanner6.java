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
public class ElementScanner6<R, P> extends AbstractElementVisitor6<R, P> {
    protected final R DEFAULT_VALUE;

    protected ElementScanner6() {
        this.DEFAULT_VALUE = null;
    }

    protected ElementScanner6(R defaultValue) {
        this.DEFAULT_VALUE = defaultValue;
    }

    public final R scan(Iterable<? extends Element> iterable, P p) {
        R result = this.DEFAULT_VALUE;
        for (Element e : iterable) {
            result = scan(e, p);
        }
        return result;
    }

    public R scan(Element element, P p) {
        return (R) element.accept(this, p);
    }

    public final R scan(Element e) {
        return scan(e, (Object) null);
    }

    @Override
    public R visitPackage(PackageElement e, P p) {
        return scan(e.getEnclosedElements(), p);
    }

    @Override
    public R visitType(TypeElement e, P p) {
        return scan(e.getEnclosedElements(), p);
    }

    @Override
    public R visitVariable(VariableElement e, P p) {
        if (e.getKind() != ElementKind.RESOURCE_VARIABLE) {
            return scan(e.getEnclosedElements(), p);
        }
        return visitUnknown(e, p);
    }

    @Override
    public R visitExecutable(ExecutableElement e, P p) {
        return scan(e.getParameters(), p);
    }

    @Override
    public R visitTypeParameter(TypeParameterElement e, P p) {
        return scan(e.getEnclosedElements(), p);
    }
}
