package sun.misc;

import java.nio.charset.Charset;

public interface JavaIOAccess {
    Charset charset();

    Runnable consoleRestoreHook();
}
