package javax.lang.model.element;

import java.util.List;
import javax.lang.model.type.TypeMirror;

public interface ExecutableElement extends Element, Parameterizable {
    AnnotationValue getDefaultValue();

    List<? extends VariableElement> getParameters();

    TypeMirror getReturnType();

    @Override
    Name getSimpleName();

    List<? extends TypeMirror> getThrownTypes();

    @Override
    List<? extends TypeParameterElement> getTypeParameters();

    boolean isVarArgs();
}
