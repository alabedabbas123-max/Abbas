package javax.lang.model.type;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MirroredTypesException extends RuntimeException {
    private static final long serialVersionUID = 269;
    transient List<? extends TypeMirror> types;

    MirroredTypesException(String message, TypeMirror type) {
        super(message);
        List<TypeMirror> tmp = new ArrayList<>();
        tmp.add(type);
        this.types = Collections.unmodifiableList(tmp);
    }

    public MirroredTypesException(List<? extends TypeMirror> types) {
        StringBuilder sb = new StringBuilder();
        sb.append("Attempt to access Class objects for TypeMirrors ");
        List<? extends TypeMirror> types2 = new ArrayList<>(types);
        sb.append(types2.toString());
        super(sb.toString());
        this.types = Collections.unmodifiableList(types2);
    }

    public List<? extends TypeMirror> getTypeMirrors() {
        return this.types;
    }

    private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {
        s.defaultReadObject();
        this.types = null;
    }
}
