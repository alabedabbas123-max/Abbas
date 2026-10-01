package javax.tools;

import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;

public interface JavaFileObject extends FileObject {
    Modifier getAccessLevel();

    Kind getKind();

    NestingKind getNestingKind();

    boolean isNameCompatible(String str, Kind kind);

    public enum Kind {
        SOURCE(".java"),
        CLASS(".class"),
        HTML(".html"),
        OTHER("");

        public final String extension;

        Kind(String extension) {
            extension.getClass();
            this.extension = extension;
        }
    }
}
