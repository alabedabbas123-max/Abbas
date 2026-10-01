package com.almlkaide.kaypro.manifesteditor;

import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.xmlpull.v1.XmlPullParser;

public class ClassG {

    public String f3712a;

    private List f3713b = new ArrayList();

    private List f3714c = new ArrayList();

    public ClassG(String str) {
        this.f3712a = str;
    }

    private void m5799a(StringBuffer stringBuffer, int i) {
        stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        for (int i2 = 1; i2 < i; i2++) {
            stringBuffer.append("\t");
        }
    }

    public String m5800a() {
        for (ClassC c1342c : this.f3713b) {
            if (c1342c.f3558a.equals("android:name")) {
                return c1342c.f3559b;
            }
        }
        return "";
    }

    public void m5801a(TextView textView) {
        boolean z;
        for (ClassC c1342c : this.f3713b) {
            if (c1342c.f3558a.equals("android:name")) {
                z = false;
                for (ClassF c1365f : ManifestActivity.f3512a) {
                    if (c1365f.f3710a.equals(c1342c.f3559b)) {
                        textView.setText(c1365f.toString());
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            if (!z) {
                textView.setText("未知\n(" + c1342c.f3559b + ")");
            }
        }
    }

    public void m5802a(ClassC c1342c) {
        this.f3713b.add(c1342c);
    }

    public void m5803a(StringBuffer stringBuffer, List list, String str, int i) {
        if (this.f3712a != null) {
            if (!this.f3712a.equals(str)) {
                m5799a(stringBuffer, i);
                stringBuffer.append('<').append(this.f3712a);
                if (this.f3713b.size() == 1) {
                    stringBuffer.append(" ").append(((ClassC) this.f3713b.get(0)).f3558a).append("=\"").append(((ClassC) this.f3713b.get(0)).f3559b).append("\"");
                } else {
                    for (ClassC c1342c : this.f3713b) {
                        m5799a(stringBuffer, i + 1);
                        stringBuffer.append(c1342c.f3558a).append("=\"").append(c1342c.f3559b).append("\"");
                    }
                }
                if (this.f3714c.size() > 0) {
                    stringBuffer.append(">");
                }
            }
            if (this.f3712a.equals("manifest")) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ClassG) it.next()).m5803a(stringBuffer, null, "", i + 1);
                }
            }
        }
        Iterator it2 = this.f3714c.iterator();
        while (it2.hasNext()) {
            ((ClassG) it2.next()).m5803a(stringBuffer, list, str, i + 1);
        }
        if (this.f3712a == null || this.f3712a.equals(str)) {
            return;
        }
        if (this.f3714c.size() <= 0) {
            stringBuffer.append("/>");
        } else {
            m5799a(stringBuffer, i);
            stringBuffer.append("</").append(this.f3712a).append(">");
        }
    }

    public void m5804a(List list, String str, String str2) {
        if (!str.equals(this.f3712a)) {
            Iterator it = this.f3714c.iterator();
            while (it.hasNext()) {
                ((ClassG) it.next()).m5804a(list, str, str2);
            }
        } else {
            for (ClassG c1366g : this.f3714c) {
                if (c1366g.f3712a.equals(str2)) {
                    list.add(c1366g);
                }
            }
        }
    }

    public void m5805a(XmlPullParser xmlPullParser, int i) {
        if (i == 2) {
            this.f3712a = xmlPullParser.getName();
            int attributeCount = xmlPullParser.getAttributeCount();
            for (int i2 = 0; i2 < attributeCount; i2++) {
                ClassC c1342c = new ClassC();
                c1342c.f3558a = xmlPullParser.getAttributeName(i2);
                c1342c.f3559b = xmlPullParser.getAttributeValue(i2);
                this.f3713b.add(c1342c);
            }
        }
        int next = xmlPullParser.next();
        while (next != 1) {
            if (next == 2) {
                ClassG c1366g = new ClassG(xmlPullParser.getName());
                c1366g.m5805a(xmlPullParser, next);
                this.f3714c.add(c1366g);
            }
            if (next == 3 && xmlPullParser.getName().equals(this.f3712a)) {
                return;
            } else {
                next = xmlPullParser.next();
            }
        }
    }
}
