package sun.reflect.annotation;

public class TypeNotPresentExceptionProxy extends ExceptionProxy {
    Throwable cause;
    String typeName;

    public TypeNotPresentExceptionProxy(String typeName, Throwable cause) {
        this.typeName = typeName;
        this.cause = cause;
    }

    @Override
    protected RuntimeException generateException() {
        return new TypeNotPresentException(this.typeName, this.cause);
    }
}
