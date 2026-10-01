package com.aide.common;

@abcd.Interfacexu
public class pa {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.common.pa.class, -3648150566812432569L, -3648150566812432569L);
    }

    public pa() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -1892778899644250163L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1892778899644250163L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static org.w3c.dom.Document j6(java.io.InputStream r8) {
        org.xml.sax.XMLReader r3 = null;
        org.w3c.dom.Document r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 12: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 16; continue $sw1; }
                    abcd.wu.j6(th, 4809939954446494251L, null, r8);
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 17; continue $sw1; }
                    try {
                        abcd.wu.j6(4809939954446494251L, null, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    try {
                        r3 = javax.xml.parsers.SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                        r3.setFeature("http://xml.org/sax/features/namespaces", false);
                        r3.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
                        r4 = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof javax.xml.parsers.ParserConfigurationException) { $pc1 = 9; continue $sw1; }
                        $pc1 = 12; continue $sw1;
                    }
                    try {
                        r3.setContentHandler(new com.aide.common.oa(r4, new java.util.Stack(), new java.lang.StringBuilder()));
                        r3.parse(new org.xml.sax.InputSource(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    return r4;
                }
                case 9: {
                    e = $ex1;
                    try {
                        throw new java.lang.RuntimeException("Can't create SAX parser / DOM builder.", e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
