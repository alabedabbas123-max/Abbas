package javax.lang.model.type;

import javax.lang.model.UnknownEntityException;

public class UnknownTypeException extends UnknownEntityException {
    private static final long serialVersionUID = 269;
    private transient Object parameter;
    private transient TypeMirror type;

    public UnknownTypeException(TypeMirror t, Object p) {
        super("Unknown type: " + t);
        this.type = t;
        this.parameter = p;
    }

    public TypeMirror getUnknownType() {
        return this.type;
    }

    public Object getArgument() {
        return this.parameter;
    }
}
