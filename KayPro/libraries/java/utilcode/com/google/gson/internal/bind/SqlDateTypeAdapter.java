package utilcode.com.google.gson.internal.bind;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import utilcode.com.google.gson.Gson;
import utilcode.com.google.gson.JsonSyntaxException;
import utilcode.com.google.gson.TypeAdapter;
import utilcode.com.google.gson.TypeAdapterFactory;
import utilcode.com.google.gson.reflect.TypeToken;
import utilcode.com.google.gson.stream.JsonReader;
import utilcode.com.google.gson.stream.JsonToken;
import utilcode.com.google.gson.stream.JsonWriter;

public final class SqlDateTypeAdapter extends TypeAdapter<Date> {
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format = new SimpleDateFormat("MMM d, yyyy");

    @Override
    public synchronized Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Date(this.format.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override
    public synchronized void write(JsonWriter jsonWriter, Date date) throws IOException {
        jsonWriter.value(date == null ? null : this.format.format((java.util.Date) date));
    }
}
