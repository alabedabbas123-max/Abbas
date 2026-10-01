package javax.lang.model;

public class UnknownEntityException extends RuntimeException {
    private static final long serialVersionUID = 269;

    protected UnknownEntityException(String message) {
        super(message);
    }
}
