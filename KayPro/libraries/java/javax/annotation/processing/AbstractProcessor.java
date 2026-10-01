package javax.annotation.processing;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

public abstract class AbstractProcessor implements Processor {
    static final boolean $assertionsDisabled = false;
    private boolean initialized = false;
    protected ProcessingEnvironment processingEnv;

    @Override
    public abstract boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment);

    protected AbstractProcessor() {
    }

    @Override
    public Set<String> getSupportedOptions() {
        SupportedOptions so = (SupportedOptions) getClass().getAnnotation(SupportedOptions.class);
        if (so == null) {
            return Collections.emptySet();
        }
        return arrayToSet(so.value());
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        SupportedAnnotationTypes sat = (SupportedAnnotationTypes) getClass().getAnnotation(SupportedAnnotationTypes.class);
        if (sat == null) {
            if (isInitialized()) {
                this.processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING, "No SupportedAnnotationTypes annotation found on " + getClass().getName() + ", returning an empty set.");
            }
            return Collections.emptySet();
        }
        return arrayToSet(sat.value());
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        SupportedSourceVersion ssv = (SupportedSourceVersion) getClass().getAnnotation(SupportedSourceVersion.class);
        if (ssv == null) {
            SourceVersion sv = SourceVersion.RELEASE_6;
            if (isInitialized()) {
                this.processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING, "No SupportedSourceVersion annotation found on " + getClass().getName() + ", returning " + sv + ".");
                return sv;
            }
            return sv;
        }
        return ssv.value();
    }

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        if (this.initialized) {
            throw new IllegalStateException("Cannot call init more than once.");
        }
        if (processingEnv == null) {
            throw new NullPointerException("Tool provided null ProcessingEnvironment");
        }
        this.processingEnv = processingEnv;
        this.initialized = true;
    }

    @Override
    public Iterable<? extends Completion> getCompletions(Element element, AnnotationMirror annotation, ExecutableElement member, String userText) {
        return Collections.emptyList();
    }

    protected synchronized boolean isInitialized() {
        return this.initialized;
    }

    private static Set<String> arrayToSet(String[] array) {
        Set<String> set = new HashSet<>(array.length);
        for (String s : array) {
            set.add(s);
        }
        return Collections.unmodifiableSet(set);
    }
}
