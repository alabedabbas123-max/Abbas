package a.b.g;

import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import java.util.Set;
import org.apache.commons.io.FilenameUtils;
import a.b.Interfacei;

public class ak extends w implements aq {

    private final boolean f337a;

    private final boolean f338b;

    private final boolean f339c;

    private final Set f340d;

    public ak(boolean z, boolean z2, boolean z3, Set set) {
        this.f337a = z;
        this.f338b = z2;
        this.f339c = z3;
        this.f340d = set;
    }

    public void m985a(c cVar, Interfacei interfaceC0161i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f337a) {
            stringBuffer.append(cVar.b()).append(FilenameUtils.EXTENSION_SEPARATOR);
        }
        if (this.f338b) {
            stringBuffer.append(interfaceC0161i.mo946a(cVar)).append(FilenameUtils.EXTENSION_SEPARATOR);
        }
        if (this.f339c) {
            stringBuffer.append(interfaceC0161i.mo949b(cVar));
        }
        this.f340d.add(stringBuffer.toString());
    }
}
