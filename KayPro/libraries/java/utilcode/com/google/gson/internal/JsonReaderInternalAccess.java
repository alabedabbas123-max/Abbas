package utilcode.com.google.gson.internal;

import java.io.IOException;
import utilcode.com.google.gson.stream.JsonReader;

public abstract class JsonReaderInternalAccess {
    public static JsonReaderInternalAccess INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
