package javax.lang.model.util;

import java.util.List;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;

@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class SimpleAnnotationValueVisitor6<R, P> extends AbstractAnnotationValueVisitor6<R, P> {
    protected final R DEFAULT_VALUE;

    protected SimpleAnnotationValueVisitor6() {
        this.DEFAULT_VALUE = null;
    }

    protected SimpleAnnotationValueVisitor6(R defaultValue) {
        this.DEFAULT_VALUE = defaultValue;
    }

    protected R defaultAction(Object o, P p) {
        return this.DEFAULT_VALUE;
    }

    @Override
    public R visitBoolean(boolean b, P p) {
        return defaultAction(Boolean.valueOf(b), p);
    }

    @Override
    public R visitByte(byte b, P p) {
        return defaultAction(Byte.valueOf(b), p);
    }

    @Override
    public R visitChar(char c, P p) {
        return defaultAction(Character.valueOf(c), p);
    }

    @Override
    public R visitDouble(double d, P p) {
        return defaultAction(Double.valueOf(d), p);
    }

    @Override
    public R visitFloat(float f, P p) {
        return defaultAction(Float.valueOf(f), p);
    }

    @Override
    public R visitInt(int i, P p) {
        return defaultAction(Integer.valueOf(i), p);
    }

    @Override
    public R visitLong(long i, P p) {
        return defaultAction(Long.valueOf(i), p);
    }

    @Override
    public R visitShort(short s, P p) {
        return defaultAction(Short.valueOf(s), p);
    }

    @Override
    public R visitString(String s, P p) {
        return defaultAction(s, p);
    }

    @Override
    public R visitType(TypeMirror t, P p) {
        return defaultAction(t, p);
    }

    @Override
    public R visitEnumConstant(VariableElement c, P p) {
        return defaultAction(c, p);
    }

    @Override
    public R visitAnnotation(AnnotationMirror a, P p) {
        return defaultAction(a, p);
    }

    @Override
    public R visitArray(List<? extends AnnotationValue> vals, P p) {
        return defaultAction(vals, p);
    }
}
