package javax.lang.model.element;

public interface AnnotationValue {
    <R, P> R accept(AnnotationValueVisitor<R, P> annotationValueVisitor, P p);

    Object getValue();

    String toString();
}
