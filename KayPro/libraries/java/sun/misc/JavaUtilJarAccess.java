package sun.misc;

import java.io.IOException;
import java.util.jar.JarFile;

public interface JavaUtilJarAccess {
    boolean jarFileHasClassPathAttribute(JarFile jarFile) throws IOException;
}
