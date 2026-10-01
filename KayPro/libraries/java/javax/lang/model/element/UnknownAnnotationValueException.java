package javax.lang.model.element;

import javax.lang.model.UnknownEntityException;

public class UnknownAnnotationValueException extends UnknownEntityException {
    private static final long serialVersionUID = 269;

    private transient AnnotationValue f582av;
    private transient Object parameter;

    public UnknownAnnotationValueException(AnnotationValue av, Object p) {
        super("Unknown annotation value: " + av);
        this.f582av = av;
        this.parameter = p;
    }

    public AnnotationValue getUnknownAnnotationValue() {
        return this.f582av;
    }

    public Object getArgument() {
        return this.parameter;
    }
}
