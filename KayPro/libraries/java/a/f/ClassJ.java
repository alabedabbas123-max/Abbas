package a.f;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.a.m;
import a.b.a.n;
import a.b.c;
import a.b.f.w;
import a.b.g.aq;
import a.b.g.s;
import a.b.k;
import com.baidu.mobstat.Config;
import java.io.PrintStream;
import java.util.Stack;
import org.apache.commons.io.FilenameUtils;
import a.b.ClassL;
import a.b.ClassN;
import a.b.Interfacej;
import a.b.f.ClassI;

public class ClassJ extends w implements i, aq, s {

    private final PrintStream f710a;

    private boolean f711b;

    public ClassJ() {
        this(System.out);
    }

    public ClassJ(PrintStream printStream) {
        this.f710a = printStream;
    }

    private void m1823a(String str, String str2, String str3, m mVar, Stack stack, String str4) {
        String strA = mVar.a();
        int iIndexOf = strA.indexOf(46);
        int iIndexOf2 = strA.indexOf(40, iIndexOf + 1);
        int iIndexOf3 = strA.indexOf(58, iIndexOf2 + 1);
        int iIndexOf4 = strA.indexOf(58, iIndexOf3 + 1);
        String strSubstring = strA.substring(0, iIndexOf);
        String strSubstring2 = strA.substring(iIndexOf + 1, iIndexOf2);
        String strSubstring3 = strA.substring(iIndexOf2, iIndexOf3);
        String strSubstring4 = strA.substring(iIndexOf3);
        int i = Integer.parseInt(strA.substring(iIndexOf3 + 1, iIndexOf4));
        int i2 = Integer.parseInt(strA.substring(iIndexOf4 + 1));
        int i3 = mVar.c;
        int i4 = (i2 + i3) - i;
        this.f710a.println("    " + i3 + Config.TRACE_TODAY_VISIT_SPLIT + i4 + Config.TRACE_TODAY_VISIT_SPLIT + ClassI.m803z(strSubstring3) + " " + (strSubstring.equals(str) ? "" : ClassI.m764c(strSubstring) + FilenameUtils.EXTENSION_SEPARATOR) + strSubstring2 + '(' + ClassI.m742A(strSubstring3) + ')' + strSubstring4 + " -> " + str4);
        for (int size = stack.size() - 1; size >= 0; size--) {
            m1824a(str, str2, str3, i3 + Config.TRACE_TODAY_VISIT_SPLIT + i4, (m) stack.get(size), str4);
        }
    }

    private void m1824a(String str, String str2, String str3, String str4, m mVar, String str5) {
        String strSubstring;
        int i;
        String strA = mVar.a();
        if (strA == null) {
            i = mVar.c;
            strSubstring = str;
        } else {
            int iIndexOf = strA.indexOf(46);
            int iIndexOf2 = strA.indexOf(40, iIndexOf + 1);
            int iIndexOf3 = strA.indexOf(58, iIndexOf2 + 1);
            int i2 = Integer.parseInt(strA.substring(iIndexOf3 + 1, strA.indexOf(58, iIndexOf3 + 1)));
            strSubstring = strA.substring(0, iIndexOf);
            str2 = strA.substring(iIndexOf + 1, iIndexOf2);
            str3 = strA.substring(iIndexOf2, iIndexOf3);
            i = ((mVar.c - i2) % 1000) + i2;
        }
        this.f710a.println("    " + str4 + Config.TRACE_TODAY_VISIT_SPLIT + ClassI.m803z(str3) + " " + (strSubstring.equals(str) ? "" : ClassI.m764c(strSubstring) + FilenameUtils.EXTENSION_SEPARATOR) + str2 + '(' + ClassI.m742A(str3) + ')' + Config.TRACE_TODAY_VISIT_SPLIT + i + " -> " + str5);
    }

    public void m1825a(c cVar, a aVar) {
    }

    public void m1826a(c cVar, Interfacej interfaceC0162j, d dVar) {
        dVar.b(cVar, interfaceC0162j, this);
    }

    public void m1827a(c cVar, Interfacej interfaceC0162j, d dVar, n nVar) {
        m[] mVarArr = nVar.d;
        int i = nVar.c;
        String strA = interfaceC0162j.mo946a(cVar);
        String strB = interfaceC0162j.mo949b(cVar);
        String strM1850b = ClassP.m1850b(interfaceC0162j);
        if (strM1850b == null) {
            strM1850b = strA;
        }
        int iA = nVar.a();
        int iB = nVar.b();
        if (nVar.a(dVar.e) == null) {
            if (iA > 0) {
                this.f710a.println("    " + iA + Config.TRACE_TODAY_VISIT_SPLIT + iB + Config.TRACE_TODAY_VISIT_SPLIT + ClassI.m803z(interfaceC0162j.mo949b(cVar)) + " " + strA + '(' + ClassI.m742A(interfaceC0162j.mo949b(cVar)) + ") -> " + strM1850b);
            } else {
                this.f710a.println("    " + ClassI.m803z(interfaceC0162j.mo949b(cVar)) + " " + strA + '(' + ClassI.m742A(interfaceC0162j.mo949b(cVar)) + ") -> " + strM1850b);
            }
        }
        Stack stack = new Stack();
        int i2 = 0;
        m mVar = new m(0, 0);
        while (i2 < i) {
            m mVar2 = mVarArr[i2];
            if (mVar2.a() != mVar.a()) {
                if (mVar2.c > mVar.c) {
                    if (i2 > 0) {
                        stack.push(mVar);
                    }
                    m1823a(cVar.b(), strA, strB, mVar2, stack, strM1850b);
                } else if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            i2++;
            mVar = mVar2;
        }
        this.f711b = true;
    }

    public void m1828a(k kVar) {
        this.f710a.println(ClassI.m764c(kVar.b()) + " -> " + ClassI.m764c(ClassC.m1794b((c) kVar)) + Config.TRACE_TODAY_VISIT_SPLIT);
        kVar.a(this);
        kVar.b(this);
    }

    public void m1829a(k kVar, ClassL c0163l) {
        String strA = c0163l.mo946a((c) kVar);
        String strM1850b = ClassP.m1850b(c0163l);
        if (strM1850b == null) {
            strM1850b = strA;
        }
        this.f710a.println("    " + ClassI.m802y(c0163l.mo949b(kVar)) + " " + strA + " -> " + strM1850b);
    }

    public void m1830a(k kVar, ClassN c0165n) {
        String strA = c0165n.mo946a((c) kVar);
        String strM1850b = ClassP.m1850b(c0165n);
        if (strM1850b == null) {
            strM1850b = strA;
        }
        this.f711b = false;
        c0165n.mo1267a(kVar, (i) this);
        if (this.f711b) {
            return;
        }
        this.f710a.println("    " + ClassI.m803z(c0165n.mo949b(kVar)) + " " + strA + '(' + ClassI.m742A(c0165n.mo949b(kVar)) + ") -> " + strM1850b);
    }
}
