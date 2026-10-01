package org.b.a.b;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;

class ClassB implements Interfacee {

    private final Charset f5440a;

    public ClassB(Charset charset) {
        this.f5440a = charset;
    }

    @Override
    public String mo7554a(byte[] bArr) {
        return this.f5440a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString();
    }
}
