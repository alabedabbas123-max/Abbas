package org.dom4j.io;

import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

class SAXHelper {
    private static boolean loggedWarning = true;

    protected SAXHelper() {
    }

    public static XMLReader createXMLReader(boolean z) throws SAXException {
        XMLReader xMLReaderCreateXMLReaderViaJAXP = 0 == 0 ? createXMLReaderViaJAXP(z, true) : null;
        if (xMLReaderCreateXMLReaderViaJAXP == null) {
            try {
                xMLReaderCreateXMLReaderViaJAXP = XMLReaderFactory.createXMLReader();
            } catch (Exception e) {
                if (isVerboseErrorReporting()) {
                    System.out.println("Warning: Caught exception attempting to use SAX to load a SAX XMLReader ");
                    System.out.println(new StringBuffer().append("Warning: Exception was: ").append(e).toString());
                    System.out.println("Warning: I will print the stack trace then carry on using the default SAX parser");
                    e.printStackTrace();
                }
                throw new SAXException(e);
            }
        }
        if (xMLReaderCreateXMLReaderViaJAXP == null) {
            throw new SAXException("Couldn't create SAX reader");
        }
        return xMLReaderCreateXMLReaderViaJAXP;
    }

    protected static XMLReader createXMLReaderViaJAXP(boolean z, boolean z2) {
        try {
            return JAXPHelper.createXMLReader(z, z2);
        } catch (Throwable th) {
            if (!loggedWarning) {
                loggedWarning = true;
                if (isVerboseErrorReporting()) {
                    System.out.println("Warning: Caught exception attempting to use JAXP to load a SAX XMLReader");
                    System.out.println(new StringBuffer().append("Warning: Exception was: ").append(th).toString());
                    th.printStackTrace();
                }
            }
            return null;
        }
    }

    protected static boolean isVerboseErrorReporting() {
        try {
            String property = System.getProperty("org.dom4j.verbose");
            if (property == null || property.equalsIgnoreCase("true")) {
            }
        } catch (Exception e) {
        }
        return true;
    }

    public static boolean setParserFeature(XMLReader xMLReader, String str, boolean z) {
        try {
            xMLReader.setFeature(str, z);
            return true;
        } catch (SAXNotRecognizedException | SAXNotSupportedException e) {
            return false;
        }
    }

    public static boolean setParserProperty(XMLReader xMLReader, String str, Object obj) {
        try {
            xMLReader.setProperty(str, obj);
            return true;
        } catch (SAXNotRecognizedException | SAXNotSupportedException e) {
            return false;
        }
    }
}
