package com.aide.common;

@abcd.Interfacexu
class oa extends org.xml.sax.helpers.DefaultHandler {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 1083821891400801060L)
    private org.xml.sax.Locator FH;
    final org.w3c.dom.Document Hw;
    final java.lang.StringBuilder Zo;
    final java.util.Stack v5;

    static {
        abcd.wu.j6(com.aide.common.oa.class, -3648150566812432569L, -721187905215067152L);
    }

    oa(org.w3c.dom.Document r1, java.util.Stack r2, java.lang.StringBuilder r3) {
        this.Hw = r1;
        this.v5 = r2;
        this.Zo = r3;
    }

    @abcd.Interfacesu(method = -336377366257808425L)
    private void j6() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -310322638441469720L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-310322638441469720L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.Zo.length() <= 0) goto L17;
        ((org.w3c.dom.Element) this.v5.peek()).appendChild(this.Hw.createTextNode(this.Zo.toString()));     // Catch: java.lang.Throwable -> L10
        this.Zo.delete(0, this.Zo.length());     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    @abcd.Interfacesu(method = -1691300000669250817L)
    public void characters(char[] r9, int r10, int r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -3354427488514114800L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3354427488514114800L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        this.Zo.append(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    }

    @Override
    @abcd.Interfacesu(method = 3428007830828331444L)
    public void endElement(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 328282518374786231L, this, r9, r10, r11);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(328282518374786231L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L10
    L5:
        j6();     // Catch: java.lang.Throwable -> L10
        org.w3c.dom.Element r0 = (org.w3c.dom.Element) this.v5.pop();     // Catch: java.lang.Throwable -> L10
        if (this.v5.isEmpty() == false) goto L8;
        this.Hw.appendChild(r0);     // Catch: java.lang.Throwable -> L10
        return;
    L8:
        ((org.w3c.dom.Element) this.v5.peek()).appendChild(r0);     // Catch: java.lang.Throwable -> L10
    }

    @Override
    @abcd.Interfacesu(method = 977126083058243104L)
    public void setDocumentLocator(org.xml.sax.Locator r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4054330668650940327L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4054330668650940327L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r5;     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -293546554364828544L)
    public void startElement(java.lang.String r10, java.lang.String r11, java.lang.String r12, org.xml.sax.Attributes r13) {
    L11:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 2256026356225305339L, this, r10, r11, r12, r13);
    L16:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2256026356225305339L, this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L11
    L5:
        j6();     // Catch: java.lang.Throwable -> L11
        org.w3c.dom.Element r0 = this.Hw.createElement(r12);     // Catch: java.lang.Throwable -> L11
        int r1 = 0;
    L7:
        if (r1 >= r13.getLength()) goto L9;
        r0.setAttribute(r13.getQName(r1), r13.getValue(r1));     // Catch: java.lang.Throwable -> L11
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L11
        goto L7
    L9:
        r0.setUserData("line", java.lang.String.valueOf(this.FH.getLineNumber()), null);     // Catch: java.lang.Throwable -> L11
        r0.setUserData("column", java.lang.String.valueOf(this.FH.getColumnNumber() + 1), null);     // Catch: java.lang.Throwable -> L11
        this.v5.push(r0);     // Catch: java.lang.Throwable -> L11
    }
}
