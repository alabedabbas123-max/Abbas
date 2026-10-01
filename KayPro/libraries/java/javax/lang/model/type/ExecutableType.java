package javax.lang.model.type;

import java.util.List;

public interface ExecutableType extends TypeMirror {
    List<? extends TypeMirror> mo573getParameterTypes();

    TypeMirror mo574getReturnType();

    List<? extends TypeMirror> mo575getThrownTypes();

    List<? extends TypeVariable> getTypeVariables();
}
