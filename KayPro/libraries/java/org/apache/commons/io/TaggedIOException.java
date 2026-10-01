package org.apache.commons.io;

import java.io.IOException;
import java.io.Serializable;

public class TaggedIOException extends IOExceptionWithCause {
    private static final long serialVersionUID = -6994123481142850163L;

    private final Serializable f5382tag;

    public TaggedIOException(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.f5382tag = serializable;
    }

    public static boolean isTaggedWith(Throwable th, Object obj) {
        return obj != null && (th instanceof TaggedIOException) && obj.equals(((TaggedIOException) th).f5382tag);
    }

    public static void throwCauseIfTaggedWith(Throwable th, Object obj) throws IOException {
        if (isTaggedWith(th, obj)) {
            throw ((TaggedIOException) th).getCause();
        }
    }

    @Override
    public IOException getCause() {
        return (IOException) super.getCause();
    }

    public Serializable getTag() {
        return this.f5382tag;
    }
}
