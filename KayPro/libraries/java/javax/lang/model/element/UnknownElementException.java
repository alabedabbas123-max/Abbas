package javax.lang.model.element;

import javax.lang.model.UnknownEntityException;

public class UnknownElementException extends UnknownEntityException {
    private static final long serialVersionUID = 269;
    private transient Element element;
    private transient Object parameter;

    public UnknownElementException(Element e, Object p) {
        super("Unknown element: " + e);
        this.element = e;
        this.parameter = p;
    }

    public Element getUnknownElement() {
        return this.element;
    }

    public Object getArgument() {
        return this.parameter;
    }
}
