package javax.tools;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import javax.lang.model.SourceVersion;

public interface Tool {
    Set<SourceVersion> getSourceVersions();

    int mo447run(InputStream inputStream, OutputStream outputStream, OutputStream outputStream2, String... strArr);
}
