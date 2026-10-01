package utilcode.com.google.gson.internal.bind;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import utilcode.com.google.gson.Gson;
import utilcode.com.google.gson.JsonSyntaxException;
import utilcode.com.google.gson.TypeAdapter;
import utilcode.com.google.gson.TypeAdapterFactory;
import utilcode.com.google.gson.reflect.TypeToken;
import utilcode.com.google.gson.stream.JsonReader;
import utilcode.com.google.gson.stream.JsonToken;
import utilcode.com.google.gson.stream.JsonWriter;

public final class TimeTypeAdapter extends TypeAdapter<Time> {
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format = new SimpleDateFormat("hh:mm:ss a");

    @Override
    public synchronized Time read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Time(this.format.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override
    public synchronized void write(JsonWriter jsonWriter, Time time) throws IOException {
        jsonWriter.value(time == null ? null : this.format.format((Date) time));
    }
}
