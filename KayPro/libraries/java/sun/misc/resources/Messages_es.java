package sun.misc.resources;

import java.util.ListResourceBundle;

public class Messages_es extends ListResourceBundle {
    private static final Object[][] contents = {new Object[]{"optpkg.versionerror", "ERROR: El formato del archivo JAR {0} pertenece a una versión no válida. Busque en la documentación un formato de una versión compatible."}, new Object[]{"optpkg.attributeerror", "ERROR: El atributo obligatorio JAR manifest {0} no está definido en el archivo JAR {1}."}, new Object[]{"optpkg.attributeserror", "ERROR: Algunos atributos obligatorios JAR manifest no están definidos en el archivo JAR {0}."}};

    @Override
    public Object[][] getContents() {
        return contents;
    }
}
