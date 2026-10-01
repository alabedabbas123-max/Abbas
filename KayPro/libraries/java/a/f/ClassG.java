package a.f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ClassG implements Interfacet {

    private final List f703a;

    private final Interfacet f704b;

    private int f705c;

    public ClassG(ClassG c0297g, Interfacet interfaceC0310t) {
        this.f705c = 0;
        this.f703a = c0297g.f703a;
        this.f704b = interfaceC0310t;
    }

    public ClassG(Reader reader, boolean z, Interfacet interfaceC0310t) throws IOException {
        this.f705c = 0;
        this.f703a = new ArrayList();
        this.f704b = interfaceC0310t;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int i = reader.read();
                if (i != -1) {
                    if (z) {
                        if (stringBuffer.length() == 0) {
                            if (Character.isJavaIdentifierStart((char) i)) {
                                stringBuffer.append((char) i);
                            }
                        } else if (Character.isJavaIdentifierPart((char) i)) {
                            stringBuffer.append((char) i);
                        }
                    } else if (i != 10 && i != 13 && i != 35) {
                        stringBuffer.append((char) i);
                    }
                }
                if (stringBuffer.length() > 0) {
                    String string = stringBuffer.toString();
                    if (!this.f703a.contains(string)) {
                        this.f703a.add(string);
                    }
                    stringBuffer.setLength(0);
                }
                if (i == 35) {
                    do {
                        i = reader.read();
                        if (i == -1 || i == 10) {
                            break;
                        }
                    } while (i != 13);
                }
                if (i == -1) {
                    return;
                }
            }
        } finally {
            reader.close();
        }
    }

    public ClassG(URL url, Interfacet interfaceC0310t) {
        this(url, true, interfaceC0310t);
    }

    public ClassG(URL url, boolean z, Interfacet interfaceC0310t) {
        this(new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8")), z, interfaceC0310t);
    }

    @Override
    public void mo1777a() {
        this.f705c = 0;
        this.f704b.mo1777a();
    }

    @Override
    public String mo1778b() {
        String strMo1778b;
        if (this.f705c >= this.f703a.size()) {
            do {
                strMo1778b = this.f704b.mo1778b();
            } while (this.f703a.contains(strMo1778b));
            return strMo1778b;
        }
        List list = this.f703a;
        int i = this.f705c;
        this.f705c = i + 1;
        return (String) list.get(i);
    }
}
