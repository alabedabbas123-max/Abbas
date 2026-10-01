package sun.misc.resources;

import java.util.ListResourceBundle;

public class Messages_it extends ListResourceBundle {
    private static final Object[][] contents = {new Object[]{"optpkg.versionerror", "ERRORE: Formato versione non valido nel file JAR {0}. Verificare nella documentazione il formato della versione supportato."}, new Object[]{"optpkg.attributeerror", "ERRORE: L''attributo manifesto JAR {0} richiesto non è impostato nel file JAR {1}."}, new Object[]{"optpkg.attributeserror", "ERRORE: Alcuni attributi manifesti JAR {0} richiesti non sono impostati nel file JAR {1}."}};

    @Override
    public Object[][] getContents() {
        return contents;
    }
}
