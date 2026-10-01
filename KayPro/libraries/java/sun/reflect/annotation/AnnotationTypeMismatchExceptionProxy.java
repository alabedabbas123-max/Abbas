package sun.reflect.annotation;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.reflect.Method;

class AnnotationTypeMismatchExceptionProxy extends ExceptionProxy {
    private String foundType;
    private Method member;

    AnnotationTypeMismatchExceptionProxy(String foundType) {
        this.foundType = foundType;
    }

    AnnotationTypeMismatchExceptionProxy setMember(Method member) {
        this.member = member;
        return this;
    }

    @Override
    protected RuntimeException generateException() {
        return new AnnotationTypeMismatchException(this.member, this.foundType);
    }
}
