package javax.lang.model.element;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import javax.lang.model.type.TypeMirror;

public interface Element {
    <R, P> R accept(ElementVisitor<R, P> elementVisitor, P p);

    TypeMirror asType();

    boolean equals(Object obj);

    <A extends Annotation> A getAnnotation(Class<A> cls);

    List<? extends AnnotationMirror> getAnnotationMirrors();

    List<? extends Element> getEnclosedElements();

    Element getEnclosingElement();

    ElementKind getKind();

    Set<Modifier> getModifiers();

    Name getSimpleName();

    int hashCode();
}
