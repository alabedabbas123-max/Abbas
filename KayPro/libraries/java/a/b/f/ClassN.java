package a.b.f;

import a.b.b.a;
import a.b.b.a.f;
import a.b.b.b;
import a.b.b.l;
import a.b.b.r;
import a.b.c;
import a.b.d.a.d;
import a.b.f.w;
import com.almlkaide.kaypro.android.dx.io.Opcodes;
import a.b.Interfacej;
import a.b.d.Abstractc;
import a.b.d.ClassB;
import a.b.d.ClassH;

class ClassN extends w implements f, d {

    final ClassL f265a;

    private int f266b;

    private int f267c;

    private int f268d;

    private c f269e;

    private String f270f;

    private int f271g;

    private int f272h;

    private StringBuffer f273i;

    private ClassN(ClassL c0081l) {
        this.f265a = c0081l;
        this.f273i = new StringBuffer();
    }

    private void m834a(c cVar, boolean z, boolean z2, boolean z3) {
        String str = z ? null : '(' + this.f273i.toString() + ")L***;";
        if (this.f269e == null) {
            this.f265a.m822a(cVar, z2 ? "<init>" : this.f270f, str, z, z2, z3);
        } else if (z2) {
            this.f265a.m820a(cVar, this.f269e, str, z3);
        } else {
            this.f265a.m819a(cVar, this.f268d, this.f269e, this.f270f, str, z, z2, z3);
        }
    }

    public void m835a() {
        this.f266b = 0;
        this.f269e = null;
        this.f270f = null;
        this.f273i.setLength(0);
    }

    public void m836a(c cVar, a aVar) {
        switch (this.f266b) {
            case 0:
                this.f269e = aVar.b;
                this.f266b = 1;
                break;
            case 3:
                if (!aVar.a(cVar).equals("java/lang/Class")) {
                    this.f269e = aVar.b;
                    this.f266b = 1;
                } else {
                    this.f272h = 0;
                    this.f266b = this.f271g > 0 ? 4 : 8;
                }
                break;
            case 6:
                this.f273i.append(ClassI.m791n(aVar.a(cVar)));
                this.f266b = 7;
                break;
            default:
                this.f269e = aVar.b;
                this.f266b = 1;
                break;
        }
    }

    public void m837a(c cVar, b bVar) {
        m835a();
    }

    public void m838a(c cVar, a.b.b.d dVar) {
        switch (this.f266b) {
            case 6:
                String strA = dVar.a(cVar);
                String strB = dVar.b(cVar);
                String strC = dVar.c(cVar);
                if (strA.startsWith("java/lang/") && strB.equals("TYPE") && strC.equals("Ljava/lang/Class;")) {
                    this.f273i.append(ClassI.m794q(strA));
                    this.f266b = 7;
                } else {
                    m835a();
                }
                break;
            default:
                m835a();
                break;
        }
    }

    public void m839a(c cVar, l lVar) {
        if (!lVar.a(cVar).equals("java/lang/Class")) {
            m835a();
            return;
        }
        String strB = lVar.b(cVar);
        String strC = lVar.c(cVar);
        if (this.f266b == 2 && strC.equals("(Ljava/lang/String;)Ljava/lang/reflect/Field;") && this.f270f != null) {
            if (strB.equals("getField")) {
                m834a(cVar, true, false, false);
                return;
            } else if (strB.equals("getDeclaredField")) {
                m834a(cVar, true, false, true);
                return;
            } else {
                m835a();
                return;
            }
        }
        if (this.f266b == 8 && strC.equals("([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;")) {
            if (strB.equals("getConstructor")) {
                m834a(cVar, false, true, false);
                return;
            } else if (strB.equals("getDeclaredConstructor")) {
                m834a(cVar, false, true, true);
                return;
            } else {
                m835a();
                return;
            }
        }
        if (this.f266b != 8 || !strC.equals("(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;") || this.f270f == null) {
            m835a();
            return;
        }
        if (strB.equals("getMethod")) {
            m834a(cVar, false, false, false);
        } else if (strB.equals("getDeclaredMethod")) {
            m834a(cVar, false, false, true);
        } else {
            m835a();
        }
    }

    public void m840a(c cVar, r rVar) {
        switch (this.f266b) {
            case 1:
                break;
            default:
                this.f269e = null;
                break;
        }
        this.f268d = this.f267c;
        this.f270f = rVar.a(cVar);
        this.f266b = 2;
    }

    public void m841a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassB c0047b) {
        switch (c0047b.mo332b()) {
            case -78:
            case -74:
                cVar.a(c0047b.f139a, this);
                break;
            case -67:
                if (this.f266b != 3) {
                    m835a();
                } else {
                    cVar.a(c0047b.f139a, this);
                }
                break;
            case 18:
                this.f267c = i;
                cVar.a(c0047b.f139a, this);
                break;
            default:
                m835a();
                break;
        }
    }

    public void m842a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, Abstractc abstractC0048c) {
        m835a();
    }

    public void m843a(c cVar, Interfacej interfaceC0162j, a.b.a.d dVar, int i, ClassH c0053h) {
        switch (this.f266b | (c0053h.mo332b() << 8)) {
            case 258:
                this.f271g = 0;
                this.f266b = 8;
                break;
            case Opcodes.FILL_ARRAY_DATA_PAYLOAD:
            case 769:
            case 771:
            case 772:
            case 774:
            case 775:
            case 776:
                m835a();
                this.f271g = c0053h.f150a;
                this.f266b = 3;
                break;
            case 770:
                this.f271g = c0053h.f150a;
                this.f266b = 3;
                break;
            case 773:
                if (this.f272h != c0053h.f150a) {
                    m835a();
                    this.f271g = c0053h.f150a;
                    this.f266b = 3;
                } else {
                    this.f266b = 6;
                }
                break;
            case 21255:
                int i2 = this.f272h + 1;
                this.f272h = i2;
                this.f266b = i2 < this.f271g ? 4 : 8;
                break;
            case 22788:
                this.f266b = 5;
                break;
            default:
                m835a();
                break;
        }
    }
}
