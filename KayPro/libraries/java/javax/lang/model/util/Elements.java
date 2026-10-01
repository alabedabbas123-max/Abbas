package javax.lang.model.util;

import java.io.Writer;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Name;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;

public interface Elements {
    List<? extends AnnotationMirror> getAllAnnotationMirrors(Element element);

    List<? extends Element> getAllMembers(TypeElement typeElement);

    Name getBinaryName(TypeElement typeElement);

    String getConstantExpression(Object obj);

    String getDocComment(Element element);

    Map<? extends ExecutableElement, ? extends AnnotationValue> getElementValuesWithDefaults(AnnotationMirror annotationMirror);

    Name getName(CharSequence charSequence);

    PackageElement getPackageElement(CharSequence charSequence);

    PackageElement getPackageOf(Element element);

    TypeElement getTypeElement(CharSequence charSequence);

    boolean hides(Element element, Element element2);

    boolean isDeprecated(Element element);

    boolean overrides(ExecutableElement executableElement, ExecutableElement executableElement2, TypeElement typeElement);

    void printElements(Writer writer, Element... elementArr);
}
