package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.io.TaggedIOException;

public class TaggedOutputStream extends ProxyOutputStream {

    private final Serializable f5397tag;

    public TaggedOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.f5397tag = UUID.randomUUID();
    }

    @Override
    protected void handleIOException(IOException iOException) throws IOException {
        throw new TaggedIOException(iOException, this.f5397tag);
    }

    public boolean isCauseOf(Exception exc) {
        return TaggedIOException.isTaggedWith(exc, this.f5397tag);
    }

    public void throwIfCauseOf(Exception exc) throws IOException {
        TaggedIOException.throwCauseIfTaggedWith(exc, this.f5397tag);
    }
}
