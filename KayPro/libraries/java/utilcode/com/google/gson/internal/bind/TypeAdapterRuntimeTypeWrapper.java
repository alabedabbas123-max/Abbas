package utilcode.com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import utilcode.com.google.gson.Gson;
import utilcode.com.google.gson.TypeAdapter;
import utilcode.com.google.gson.reflect.TypeToken;
import utilcode.com.google.gson.stream.JsonReader;
import utilcode.com.google.gson.stream.JsonWriter;

final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {
    private final Gson context;
    private final TypeAdapter<T> delegate;
    private final Type type;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.context = gson;
        this.delegate = typeAdapter;
        this.type = type;
    }

    private Type getRuntimeTypeIfMoreSpecific(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }

    @Override
    public T read(JsonReader jsonReader) throws IOException {
        return this.delegate.read(jsonReader);
    }

    @Override
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        TypeAdapter<T> adapter = this.delegate;
        Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.type, t);
        if (runtimeTypeIfMoreSpecific != this.type) {
            adapter = this.context.getAdapter(TypeToken.m572get(runtimeTypeIfMoreSpecific));
            if (adapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter = this.delegate;
                if (!(typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    adapter = typeAdapter;
                }
            }
        }
        adapter.write(jsonWriter, t);
    }
}
