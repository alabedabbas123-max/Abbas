package com.a.b.c.c;

import com.a.b.g.Interfacea;
import org.apache.commons.io.IOUtils;

class az {

    private final String f2413a;

    private int f2414b;

    private int f2415c;

    private int f2416d;

    private int f2417e;

    public az(Abstractag abstractC1066ag, String str) {
        int iMo4484e_ = abstractC1066ag.mo4484e_();
        this.f2413a = str;
        this.f2414b = 1;
        this.f2415c = iMo4484e_;
        this.f2416d = iMo4484e_;
        this.f2417e = iMo4484e_;
    }

    public String m4550a() {
        StringBuilder sb = new StringBuilder();
        sb.append("  " + this.f2413a + ": " + this.f2414b + " item" + (this.f2414b == 1 ? "" : "s") + "; " + this.f2415c + " bytes total\n");
        if (this.f2417e == this.f2416d) {
            sb.append("    " + this.f2417e + " bytes/item\n");
        } else {
            sb.append("    " + this.f2417e + ".." + this.f2416d + " bytes/item; average " + (this.f2415c / this.f2414b) + IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    public void m4551a(Abstractag abstractC1066ag) {
        int iMo4484e_ = abstractC1066ag.mo4484e_();
        this.f2414b++;
        this.f2415c += iMo4484e_;
        if (iMo4484e_ > this.f2416d) {
            this.f2416d = iMo4484e_;
        }
        if (iMo4484e_ < this.f2417e) {
            this.f2417e = iMo4484e_;
        }
    }

    public void m4552a(Interfacea interfaceC1303a) {
        interfaceC1303a.mo5404a(m4550a());
    }
}
