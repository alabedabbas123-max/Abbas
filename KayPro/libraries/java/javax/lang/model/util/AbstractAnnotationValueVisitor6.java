package javax.lang.model.util;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.AnnotationValueVisitor;
import javax.lang.model.element.UnknownAnnotationValueException;

@SupportedSourceVersion(SourceVersion.RELEASE_6)
public abstract class AbstractAnnotationValueVisitor6<R, P> implements AnnotationValueVisitor<R, P> {
    protected AbstractAnnotationValueVisitor6() {
    }

    @Override
    public final R visit(AnnotationValue annotationValue, P p) {
        return (R) annotationValue.accept(this, p);
    }

    @Override
    public final R visit(AnnotationValue annotationValue) {
        return (R) annotationValue.accept(this, null);
    }

    @Override
    public R visitUnknown(AnnotationValue av, P p) {
        throw new UnknownAnnotationValueException(av, p);
    }
}
