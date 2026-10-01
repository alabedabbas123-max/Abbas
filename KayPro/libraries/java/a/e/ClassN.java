package a.e;

import a.b.b;
import a.b.c;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import org.apache.commons.io.FilenameUtils;

public class ClassN extends ClassH {

    private final b f652a;

    private final Charset f653b;

    public ClassN(b bVar, Charset charset, Interfaceo interfaceC0275o) {
        super(interfaceC0275o);
        this.f652a = bVar;
        this.f653b = charset;
    }

    private void m1756a(Writer writer, String str) throws IOException {
        if (str.length() > 0) {
            boolean z = str.indexOf(46) >= 0;
            String strReplace = z ? str.replace(FilenameUtils.EXTENSION_SEPARATOR, '/') : str;
            c cVarA = this.f652a.a(strReplace);
            if (cVarA != null) {
                String strB = cVarA.b();
                if (!strReplace.equals(strB)) {
                    str = z ? strB.replace('/', FilenameUtils.EXTENSION_SEPARATOR) : strB;
                }
            }
            writer.write(str);
        }
    }

    @Override
    protected void mo1754a(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, this.f653b));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, this.f653b));
        mo1757a(bufferedReader, bufferedWriter);
        bufferedWriter.flush();
    }

    protected void mo1757a(Reader reader, Writer writer) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i = reader.read();
            if (i < 0) {
                m1756a(writer, stringBuffer.toString());
                return;
            }
            char c = (char) i;
            if (Character.isJavaIdentifierPart(c) || c == '.' || c == '-') {
                stringBuffer.append(c);
            } else {
                m1756a(writer, stringBuffer.toString());
                stringBuffer.setLength(0);
                writer.write(c);
            }
        }
    }
}
