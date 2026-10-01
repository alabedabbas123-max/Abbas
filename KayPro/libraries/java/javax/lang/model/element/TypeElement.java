package javax.lang.model.element;

import java.util.List;
import javax.lang.model.type.TypeMirror;

public interface TypeElement extends Element, Parameterizable, QualifiedNameable {
    @Override
    List<? extends Element> getEnclosedElements();

    @Override
    Element getEnclosingElement();

    List<? extends TypeMirror> getInterfaces();

    NestingKind getNestingKind();

    Name getQualifiedName();

    @Override
    Name getSimpleName();

    TypeMirror getSuperclass();

    @Override
    List<? extends TypeParameterElement> getTypeParameters();
}
