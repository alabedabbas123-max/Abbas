package utilcode.com.google.gson;

import utilcode.com.google.gson.reflect.TypeToken;

public interface TypeAdapterFactory {
    <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken);
}
