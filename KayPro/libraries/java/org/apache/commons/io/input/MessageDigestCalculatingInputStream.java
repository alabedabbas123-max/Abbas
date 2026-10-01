package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestCalculatingInputStream extends ObservableInputStream {
    private final MessageDigest messageDigest;

    public static class MessageDigestMaintainingObserver extends ObservableInputStream.Observer {

        private final MessageDigest f5387md;

        public MessageDigestMaintainingObserver(MessageDigest messageDigest) {
            this.f5387md = messageDigest;
        }

        @Override
        void data(int i) throws IOException {
            this.f5387md.update((byte) i);
        }

        @Override
        void data(byte[] bArr, int i, int i2) throws IOException {
            this.f5387md.update(bArr, i, i2);
        }
    }

    public MessageDigestCalculatingInputStream(InputStream inputStream) throws NoSuchAlgorithmException {
        this(inputStream, MessageDigest.getInstance("MD5"));
    }

    public MessageDigestCalculatingInputStream(InputStream inputStream, String str) throws NoSuchAlgorithmException {
        this(inputStream, MessageDigest.getInstance(str));
    }

    public MessageDigestCalculatingInputStream(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream);
        this.messageDigest = messageDigest;
        m7500add(new MessageDigestMaintainingObserver(messageDigest));
    }

    public MessageDigest getMessageDigest() {
        return this.messageDigest;
    }
}
