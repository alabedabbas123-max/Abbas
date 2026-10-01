package javax.lang.model.util;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;

@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class ElementKindVisitor6<R, P> extends SimpleElementVisitor6<R, P> {
    static final boolean $assertionsDisabled = false;

    protected ElementKindVisitor6() {
        super(null);
    }

    protected ElementKindVisitor6(R defaultValue) {
        super(defaultValue);
    }

    @Override
    public R visitPackage(PackageElement e, P p) {
        return defaultAction(e, p);
    }

    @Override
    public R visitType(TypeElement e, P p) {
        ElementKind k = e.getKind();
        int i = C07341.$SwitchMap$javax$lang$model$element$ElementKind[k.ordinal()];
        if (i == 1) {
            return visitTypeAsAnnotationType(e, p);
        }
        if (i == 2) {
            return visitTypeAsClass(e, p);
        }
        if (i == 3) {
            return visitTypeAsEnum(e, p);
        }
        if (i == 4) {
            return visitTypeAsInterface(e, p);
        }
        throw new AssertionError("Bad kind " + k + " for TypeElement" + e);
    }

    public R visitTypeAsAnnotationType(TypeElement e, P p) {
        return defaultAction(e, p);
    }

    public R visitTypeAsClass(TypeElement e, P p) {
        return defaultAction(e, p);
    }

    public R visitTypeAsEnum(TypeElement e, P p) {
        return defaultAction(e, p);
    }

    public R visitTypeAsInterface(TypeElement e, P p) {
        return defaultAction(e, p);
    }

    @Override
    public R visitVariable(VariableElement e, P p) {
        ElementKind k = e.getKind();
        switch (k) {
            case ENUM_CONSTANT:
                return visitVariableAsEnumConstant(e, p);
            case EXCEPTION_PARAMETER:
                return visitVariableAsExceptionParameter(e, p);
            case FIELD:
                return visitVariableAsField(e, p);
            case LOCAL_VARIABLE:
                return visitVariableAsLocalVariable(e, p);
            case PARAMETER:
                return visitVariableAsParameter(e, p);
            case RESOURCE_VARIABLE:
                return visitVariableAsResourceVariable(e, p);
            default:
                throw new AssertionError("Bad kind " + k + " for VariableElement" + e);
        }
    }

    public R visitVariableAsEnumConstant(VariableElement e, P p) {
        return defaultAction(e, p);
    }

    public R visitVariableAsExceptionParameter(VariableElement e, P p) {
        return defaultAction(e, p);
    }

    public R visitVariableAsField(VariableElement e, P p) {
        return defaultAction(e, p);
    }

    public R visitVariableAsLocalVariable(VariableElement e, P p) {
        return defaultAction(e, p);
    }

    public R visitVariableAsParameter(VariableElement e, P p) {
        return defaultAction(e, p);
    }

    public R visitVariableAsResourceVariable(VariableElement e, P p) {
        return visitUnknown(e, p);
    }

    @Override
    public R visitExecutable(ExecutableElement e, P p) {
        ElementKind k = e.getKind();
        switch (k) {
            case CONSTRUCTOR:
                return visitExecutableAsConstructor(e, p);
            case INSTANCE_INIT:
                return visitExecutableAsInstanceInit(e, p);
            case METHOD:
                return visitExecutableAsMethod(e, p);
            case STATIC_INIT:
                return visitExecutableAsStaticInit(e, p);
            default:
                throw new AssertionError("Bad kind " + k + " for ExecutableElement" + e);
        }
    }

    public R visitExecutableAsConstructor(ExecutableElement e, P p) {
        return defaultAction(e, p);
    }

    public R visitExecutableAsInstanceInit(ExecutableElement e, P p) {
        return defaultAction(e, p);
    }

    public R visitExecutableAsMethod(ExecutableElement e, P p) {
        return defaultAction(e, p);
    }

    public R visitExecutableAsStaticInit(ExecutableElement e, P p) {
        return defaultAction(e, p);
    }

    @Override
    public R visitTypeParameter(TypeParameterElement e, P p) {
        return defaultAction(e, p);
    }
}
