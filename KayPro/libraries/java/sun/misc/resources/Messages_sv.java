package sun.misc.resources;

import java.util.ListResourceBundle;

public class Messages_sv extends ListResourceBundle {
    private static final Object[][] contents = {new Object[]{"optpkg.versionerror", "FEL: Ogiltigt versionsformat i {0} JAR-fil. Kontrollera i dokumentationen vilket versionsformat som stöds."}, new Object[]{"optpkg.attributeerror", "FEL: Det JAR manifest-attribut {0} som krävs är inte angivet i {1} JAR-filen."}, new Object[]{"optpkg.attributeserror", "FEL: Vissa JAR manifest-attribut som krävs är inte angivna i {0} JAR-filen."}};

    @Override
    public Object[][] getContents() {
        return contents;
    }
}
