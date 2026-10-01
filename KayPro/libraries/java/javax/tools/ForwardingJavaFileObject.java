package javax.tools;

import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.tools.JavaFileObject;

public class ForwardingJavaFileObject<F extends JavaFileObject> extends ForwardingFileObject<F> implements JavaFileObject {
    protected ForwardingJavaFileObject(F fileObject) {
        super(fileObject);
    }

    @Override
    public JavaFileObject.Kind getKind() {
        return ((JavaFileObject) this.fileObject).getKind();
    }

    @Override
    public boolean isNameCompatible(String simpleName, JavaFileObject.Kind kind) {
        return ((JavaFileObject) this.fileObject).isNameCompatible(simpleName, kind);
    }

    @Override
    public NestingKind getNestingKind() {
        return ((JavaFileObject) this.fileObject).getNestingKind();
    }

    @Override
    public Modifier getAccessLevel() {
        return ((JavaFileObject) this.fileObject).getAccessLevel();
    }
}
