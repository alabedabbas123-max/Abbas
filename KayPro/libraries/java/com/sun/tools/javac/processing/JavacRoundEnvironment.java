package com.sun.tools.javac.processing;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.ElementScanner7;
import javax.lang.model.util.Types;

public class JavacRoundEnvironment implements RoundEnvironment {
    private static final String NOT_AN_ANNOTATION_TYPE = "The argument does not represent an annotation type: ";
    private final boolean errorRaised;
    private final ProcessingEnvironment processingEnv;
    private final boolean processingOver;
    private final Set<? extends Element> rootElements;

    JavacRoundEnvironment(boolean processingOver, boolean errorRaised, Set<? extends Element> rootElements, ProcessingEnvironment processingEnv) {
        this.processingOver = processingOver;
        this.errorRaised = errorRaised;
        this.rootElements = rootElements;
        this.processingEnv = processingEnv;
    }

    public String toString() {
        return String.format("[errorRaised=%b, rootElements=%s, processingOver=%b]", Boolean.valueOf(this.errorRaised), this.rootElements, Boolean.valueOf(this.processingOver));
    }

    @Override
    public boolean processingOver() {
        return this.processingOver;
    }

    @Override
    public boolean errorRaised() {
        return this.errorRaised;
    }

    @Override
    public Set<? extends Element> getRootElements() {
        return this.rootElements;
    }

    @Override
    public Set<? extends Element> getElementsAnnotatedWith(TypeElement a) {
        Set<Element> result = Collections.emptySet();
        Types typeUtil = this.processingEnv.getTypeUtils();
        if (a.getKind() != ElementKind.ANNOTATION_TYPE) {
            throw new IllegalArgumentException(NOT_AN_ANNOTATION_TYPE + a);
        }
        TypeMirror tm = a.asType();
        if (tm instanceof DeclaredType) {
            DeclaredType annotationTypeElement = (DeclaredType) a.asType();
            ElementScanner7<Set<Element>, DeclaredType> scanner = new AnnotationSetScanner(result, typeUtil);
            for (Element element : this.rootElements) {
                result = scanner.scan(element, annotationTypeElement);
            }
            return result;
        }
        throw new AssertionError("Bad implementation type for " + tm);
    }

    private class AnnotationSetScanner extends ElementScanner7<Set<Element>, DeclaredType> {
        Set<Element> annotatedElements;
        Types typeUtil;

        AnnotationSetScanner(Set<Element> defaultSet, Types typeUtil) {
            super(defaultSet);
            this.annotatedElements = new LinkedHashSet();
            this.typeUtil = typeUtil;
        }

        @Override
        public Set<Element> scan(Element e, DeclaredType p) {
            List<? extends AnnotationMirror> annotationMirrors = JavacRoundEnvironment.this.processingEnv.getElementUtils().getAllAnnotationMirrors(e);
            for (AnnotationMirror annotationMirror : annotationMirrors) {
                if (this.typeUtil.isSameType(annotationMirror.getAnnotationType(), p)) {
                    this.annotatedElements.add(e);
                }
            }
            e.accept(this, p);
            return this.annotatedElements;
        }
    }

    @Override
    public Set<? extends Element> getElementsAnnotatedWith(Class<? extends Annotation> a) {
        if (!a.isAnnotation()) {
            throw new IllegalArgumentException(NOT_AN_ANNOTATION_TYPE + a);
        }
        String name = a.getCanonicalName();
        if (name == null) {
            return Collections.emptySet();
        }
        TypeElement annotationType = this.processingEnv.getElementUtils().getTypeElement(name);
        if (annotationType == null) {
            return Collections.emptySet();
        }
        return getElementsAnnotatedWith(annotationType);
    }
}
