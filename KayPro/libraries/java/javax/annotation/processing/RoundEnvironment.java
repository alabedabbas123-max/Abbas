package javax.annotation.processing;

import java.lang.annotation.Annotation;
import java.util.Set;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

public interface RoundEnvironment {
    boolean errorRaised();

    Set<? extends Element> getElementsAnnotatedWith(Class<? extends Annotation> cls);

    Set<? extends Element> getElementsAnnotatedWith(TypeElement typeElement);

    Set<? extends Element> getRootElements();

    boolean processingOver();
}
