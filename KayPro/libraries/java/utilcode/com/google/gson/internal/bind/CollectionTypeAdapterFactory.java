package utilcode.com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import utilcode.com.google.gson.Gson;
import utilcode.com.google.gson.TypeAdapter;
import utilcode.com.google.gson.TypeAdapterFactory;
import utilcode.com.google.gson.internal.C$Gson$Types;
import utilcode.com.google.gson.internal.ConstructorConstructor;
import utilcode.com.google.gson.internal.ObjectConstructor;
import utilcode.com.google.gson.reflect.TypeToken;
import utilcode.com.google.gson.stream.JsonReader;
import utilcode.com.google.gson.stream.JsonToken;
import utilcode.com.google.gson.stream.JsonWriter;

public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;

    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        private final ObjectConstructor<? extends Collection<E>> constructor;
        private final TypeAdapter<E> elementTypeAdapter;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, ObjectConstructor<? extends Collection<E>> objectConstructor) {
            this.elementTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.constructor = objectConstructor;
        }

        @Override
        public Collection<E> read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collectionConstruct = this.constructor.construct();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collectionConstruct.add(this.elementTypeAdapter.read(jsonReader));
            }
            jsonReader.endArray();
            return collectionConstruct;
        }

        @Override
        public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.elementTypeAdapter.write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type collectionElementType = C$Gson$Types.getCollectionElementType(type, rawType);
        return new Adapter(gson, collectionElementType, gson.getAdapter(TypeToken.m572get(collectionElementType)), this.constructorConstructor.m566get(typeToken));
    }
}
