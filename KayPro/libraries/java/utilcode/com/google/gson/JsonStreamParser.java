package utilcode.com.google.gson;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import utilcode.com.google.gson.internal.Streams;
import utilcode.com.google.gson.stream.JsonReader;
import utilcode.com.google.gson.stream.JsonToken;
import utilcode.com.google.gson.stream.MalformedJsonException;

public final class JsonStreamParser implements Iterator<JsonElement> {
    private final Object lock;
    private final JsonReader parser;

    public JsonStreamParser(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.parser = jsonReader;
        jsonReader.setLenient(true);
        this.lock = new Object();
    }

    public JsonStreamParser(String str) {
        this(new StringReader(str));
    }

    @Override
    public boolean hasNext() {
        boolean z;
        synchronized (this.lock) {
            try {
                try {
                    try {
                        z = this.parser.peek() != JsonToken.END_DOCUMENT;
                    } catch (IOException e) {
                        throw new JsonIOException(e);
                    }
                } catch (MalformedJsonException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override
    public JsonElement next() throws JsonParseException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return Streams.parse(this.parser);
        } catch (OutOfMemoryError e) {
            throw new JsonParseException("Failed parsing JSON source to Json", e);
        } catch (StackOverflowError e2) {
            throw new JsonParseException("Failed parsing JSON source to Json", e2);
        } catch (JsonParseException e3) {
            if (e3.getCause() instanceof EOFException) {
                throw new NoSuchElementException();
            }
            throw e3;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
