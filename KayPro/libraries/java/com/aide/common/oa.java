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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, -310322638441469720L, this);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(-310322638441469720L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (this.Zo.length() <= 0) { $pc0 = 17; continue $sw0; }
                    try {
                        ((org.w3c.dom.Element) this.v5.peek()).appendChild(this.Hw.createTextNode(this.Zo.toString()));
                        this.Zo.delete(0, this.Zo.length());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -1691300000669250817L)
    public void characters(char[] r9, int r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, -3354427488514114800L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-3354427488514114800L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        this.Zo.append(r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 3428007830828331444L)
    public void endElement(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        org.w3c.dom.Element r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 10: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 14; continue $sw2; }
                    abcd.wu.j6(th, 328282518374786231L, this, r9, r10, r11);
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(328282518374786231L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        j6();
                        r0 = (org.w3c.dom.Element) this.v5.pop();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    if (this.v5.isEmpty() == false) { $pc2 = 8; continue $sw2; }
                    try {
                        this.Hw.appendChild(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    return;
                }
                case 8: {
                    try {
                        ((org.w3c.dom.Element) this.v5.peek()).appendChild(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 10; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 977126083058243104L)
    public void setDocumentLocator(org.xml.sax.Locator r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -4054330668650940327L, this, r5);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-4054330668650940327L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        this.FH = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -293546554364828544L)
    public void startElement(java.lang.String r10, java.lang.String r11, java.lang.String r12, org.xml.sax.Attributes r13) {
        org.w3c.dom.Element r0 = null;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 11: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 16; continue $sw4; }
                    abcd.wu.j6(th, 2256026356225305339L, this, r10, r11, r12, r13);
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(2256026356225305339L, this, r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    try {
                        j6();
                        r0 = this.Hw.createElement(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    r1 = 0;
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (r1 >= r13.getLength()) { $pc4 = 9; continue $sw4; }
                    try {
                        r0.setAttribute(r13.getQName(r1), r13.getValue(r1));
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    { $pc4 = 7; continue $sw4; }
                }
                case 9: {
                    try {
                        r0.setUserData("line", java.lang.String.valueOf(this.FH.getLineNumber()), null);
                        r0.setUserData("column", java.lang.String.valueOf(this.FH.getColumnNumber() + 1), null);
                        this.v5.push(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
