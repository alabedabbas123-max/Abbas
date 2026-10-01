package utilcode.com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import utilcode.com.google.gson.JsonArray;
import utilcode.com.google.gson.JsonElement;
import utilcode.com.google.gson.JsonNull;
import utilcode.com.google.gson.JsonObject;
import utilcode.com.google.gson.JsonPrimitive;
import utilcode.com.google.gson.stream.JsonWriter;

public final class JsonTreeWriter extends JsonWriter {
    private String pendingName;
    private JsonElement product;
    private final List<JsonElement> stack;
    private static final Writer UNWRITABLE_WRITER = new Writer() {
        @Override
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    private static final JsonPrimitive SENTINEL_CLOSED = new JsonPrimitive("closed");

    public JsonTreeWriter() {
        super(UNWRITABLE_WRITER);
        this.stack = new ArrayList();
        this.product = JsonNull.INSTANCE;
    }

    private JsonElement peek() {
        List<JsonElement> list = this.stack;
        return list.get(list.size() - 1);
    }

    private void m569put(JsonElement jsonElement) {
        if (this.pendingName != null) {
            if (!jsonElement.isJsonNull() || getSerializeNulls()) {
                ((JsonObject) peek()).m563add(this.pendingName, jsonElement);
            }
            this.pendingName = null;
            return;
        }
        if (this.stack.isEmpty()) {
            this.product = jsonElement;
            return;
        }
        JsonElement jsonElementPeek = peek();
        if (!(jsonElementPeek instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        ((JsonArray) jsonElementPeek).m560add(jsonElement);
    }

    @Override
    public JsonWriter beginArray() throws IOException {
        JsonArray jsonArray = new JsonArray();
        m569put(jsonArray);
        this.stack.add(jsonArray);
        return this;
    }

    @Override
    public JsonWriter beginObject() throws IOException {
        JsonObject jsonObject = new JsonObject();
        m569put(jsonObject);
        this.stack.add(jsonObject);
        return this;
    }

    @Override
    public void close() throws IOException {
        if (!this.stack.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.stack.add(SENTINEL_CLOSED);
    }

    @Override
    public JsonWriter endArray() throws IOException {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException();
        }
        if (!(peek() instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        List<JsonElement> list = this.stack;
        list.remove(list.size() - 1);
        return this;
    }

    @Override
    public JsonWriter endObject() throws IOException {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException();
        }
        if (!(peek() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        List<JsonElement> list = this.stack;
        list.remove(list.size() - 1);
        return this;
    }

    @Override
    public void flush() throws IOException {
    }

    public JsonElement m570get() {
        if (this.stack.isEmpty()) {
            return this.product;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.stack);
    }

    @Override
    public JsonWriter name(String str) throws IOException {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException();
        }
        if (!(peek() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        this.pendingName = str;
        return this;
    }

    @Override
    public JsonWriter nullValue() throws IOException {
        m569put(JsonNull.INSTANCE);
        return this;
    }

    @Override
    public JsonWriter value(double d) throws IOException {
        if (isLenient() || !(Double.isNaN(d) || Double.isInfinite(d))) {
            m569put(new JsonPrimitive((Number) Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    @Override
    public JsonWriter value(long j) throws IOException {
        m569put(new JsonPrimitive((Number) Long.valueOf(j)));
        return this;
    }

    @Override
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        m569put(new JsonPrimitive(bool));
        return this;
    }

    @Override
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m569put(new JsonPrimitive(number));
        return this;
    }

    @Override
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        m569put(new JsonPrimitive(str));
        return this;
    }

    @Override
    public JsonWriter value(boolean z) throws IOException {
        m569put(new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }
}
