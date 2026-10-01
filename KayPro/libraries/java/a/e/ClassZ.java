package a.e;

import a.b.b;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ClassZ extends ClassN {
    public ClassZ(b bVar, Charset charset, Interfaceo interfaceC0275o) {
        super(bVar, charset, interfaceC0275o);
    }

    @Override
    protected void mo1757a(Reader reader, Writer writer) throws IOException {
        super.mo1757a(new aa(reader), new ab(writer));
    }
}
