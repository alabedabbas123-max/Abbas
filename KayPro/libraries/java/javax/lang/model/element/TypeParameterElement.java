package javax.lang.model.element;

import java.util.List;
import javax.lang.model.type.TypeMirror;

public interface TypeParameterElement extends Element {
    List<? extends TypeMirror> getBounds();

    @Override
    Element getEnclosingElement();

    Element getGenericElement();
}
