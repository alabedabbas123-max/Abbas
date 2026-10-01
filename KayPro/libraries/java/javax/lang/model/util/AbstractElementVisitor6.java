package javax.lang.model.util;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementVisitor;
import javax.lang.model.element.UnknownElementException;

@SupportedSourceVersion(SourceVersion.RELEASE_6)
public abstract class AbstractElementVisitor6<R, P> implements ElementVisitor<R, P> {
    protected AbstractElementVisitor6() {
    }

    @Override
    public final R visit(Element element, P p) {
        return (R) element.accept(this, p);
    }

    @Override
    public final R visit(Element element) {
        return (R) element.accept(this, null);
    }

    @Override
    public R visitUnknown(Element e, P p) {
        throw new UnknownElementException(e, p);
    }
}
