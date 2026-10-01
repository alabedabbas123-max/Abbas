package sun.reflect.annotation;

public class EnumConstantNotPresentExceptionProxy extends ExceptionProxy {
    String constName;
    Class<? extends Enum> enumType;

    public EnumConstantNotPresentExceptionProxy(Class<? extends Enum> enumType, String constName) {
        this.enumType = enumType;
        this.constName = constName;
    }

    @Override
    protected RuntimeException generateException() {
        return new EnumConstantNotPresentException(this.enumType, this.constName);
    }
}
