package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.io.TaggedIOException;

public class TaggedInputStream extends ProxyInputStream {

    private final Serializable f5391tag;

    public TaggedInputStream(InputStream inputStream) {
        super(inputStream);
        this.f5391tag = UUID.randomUUID();
    }

    @Override
    protected void handleIOException(IOException iOException) throws IOException {
        throw new TaggedIOException(iOException, this.f5391tag);
    }

    public boolean isCauseOf(Throwable th) {
        return TaggedIOException.isTaggedWith(th, this.f5391tag);
    }

    public void throwIfCauseOf(Throwable th) throws IOException {
        TaggedIOException.throwCauseIfTaggedWith(th, this.f5391tag);
    }
}
