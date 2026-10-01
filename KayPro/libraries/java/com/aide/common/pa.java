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
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1892778899644250163L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1892778899644250163L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static org.w3c.dom.Document j6(java.io.InputStream r8) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 4809939954446494251L, null, r8);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L17;
        abcd.wu.j6(4809939954446494251L, null, r8);     // Catch: java.lang.Throwable -> L12
    L17:
        org.xml.sax.XMLReader r3 = javax.xml.parsers.SAXParserFactory.newInstance().newSAXParser().getXMLReader();     // Catch: javax.xml.parsers.ParserConfigurationException -> L9 java.lang.Throwable -> L12
        r3.setFeature("http://xml.org/sax/features/namespaces", false);     // Catch: javax.xml.parsers.ParserConfigurationException -> L9 java.lang.Throwable -> L12
        r3.setFeature("http://xml.org/sax/features/namespace-prefixes", false);     // Catch: javax.xml.parsers.ParserConfigurationException -> L9 java.lang.Throwable -> L12
        org.w3c.dom.Document r4 = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();     // Catch: javax.xml.parsers.ParserConfigurationException -> L9 java.lang.Throwable -> L12
        r3.setContentHandler(new com.aide.common.oa(r4, new java.util.Stack(), new java.lang.StringBuilder()));     // Catch: java.lang.Throwable -> L12
        r3.parse(new org.xml.sax.InputSource(r8));     // Catch: java.lang.Throwable -> L12
        return r4;
    L9:
        e = move-exception;
        throw new java.lang.RuntimeException("Can't create SAX parser / DOM builder.", e);     // Catch: java.lang.Throwable -> L12
    }
}
