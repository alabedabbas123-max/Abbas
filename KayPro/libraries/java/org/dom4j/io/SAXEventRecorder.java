package org.dom4j.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DeclHandler;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

public class SAXEventRecorder extends DefaultHandler implements LexicalHandler, DeclHandler, DTDHandler, Externalizable {
    private static final String EMPTY_STRING = "";
    private static final byte NULL = 2;
    private static final byte OBJECT = 1;
    private static final byte STRING = 0;
    private static final String XMLNS = "xmlns";
    public static final long serialVersionUID = 1;
    private List events = new ArrayList();
    private Map prefixMappings = new HashMap();

    static class SAXEvent implements Externalizable {
        static final byte ATTRIBUTE_DECL = 17;
        static final byte CHARACTERS = 8;
        static final byte COMMENT = 15;
        static final byte ELEMENT_DECL = 16;
        static final byte END_CDATA = 14;
        static final byte END_DOCUMENT = 5;
        static final byte END_DTD = 10;
        static final byte END_ELEMENT = 7;
        static final byte END_ENTITY = 12;
        static final byte END_PREFIX_MAPPING = 3;
        static final byte EXTERNAL_ENTITY_DECL = 19;
        static final byte INTERNAL_ENTITY_DECL = 18;
        static final byte PROCESSING_INSTRUCTION = 1;
        static final byte START_CDATA = 13;
        static final byte START_DOCUMENT = 4;
        static final byte START_DTD = 9;
        static final byte START_ELEMENT = 6;
        static final byte START_ENTITY = 11;
        static final byte START_PREFIX_MAPPING = 2;
        public static final long serialVersionUID = 1;
        protected byte event;
        protected List parms;

        public SAXEvent() {
        }

        SAXEvent(byte b) {
            this.event = b;
        }

        void addParm(Object obj) {
            if (this.parms == null) {
                this.parms = new ArrayList(3);
            }
            this.parms.add(obj);
        }

        Object getParm(int i) {
            if (this.parms == null || i >= this.parms.size()) {
                return null;
            }
            return this.parms.get(i);
        }

        @Override
        public void readExternal(ObjectInput objectInput) throws ClassNotFoundException, IOException {
            this.event = objectInput.readByte();
            if (objectInput.readByte() != 2) {
                this.parms = (List) objectInput.readObject();
            }
        }

        @Override
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(this.event);
            if (this.parms == null) {
                objectOutput.writeByte(2);
            } else {
                objectOutput.writeByte(1);
                objectOutput.writeObject(this.parms);
            }
        }
    }

    @Override
    public void attributeDecl(String str, String str2, String str3, String str4, String str5) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent((byte) 17);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        sAXEvent.addParm(str3);
        sAXEvent.addParm(str4);
        sAXEvent.addParm(str5);
        this.events.add(sAXEvent);
    }

    @Override
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent((byte) 8);
        sAXEvent.addParm(cArr);
        sAXEvent.addParm(new Integer(i));
        sAXEvent.addParm(new Integer(i2));
        this.events.add(sAXEvent);
    }

    @Override
    public void comment(char[] cArr, int i, int i2) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent((byte) 15);
        sAXEvent.addParm(cArr);
        sAXEvent.addParm(new Integer(i));
        sAXEvent.addParm(new Integer(i2));
        this.events.add(sAXEvent);
    }

    @Override
    public void elementDecl(String str, String str2) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent((byte) 16);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        this.events.add(sAXEvent);
    }

    @Override
    public void endCDATA() throws SAXException {
        this.events.add(new SAXEvent((byte) 14));
    }

    @Override
    public void endDTD() throws SAXException {
        this.events.add(new SAXEvent((byte) 10));
    }

    @Override
    public void endDocument() throws SAXException {
        this.events.add(new SAXEvent((byte) 5));
    }

    @Override
    public void endElement(String str, String str2, String str3) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent((byte) 7);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        sAXEvent.addParm(str3);
        this.events.add(sAXEvent);
        List list = (List) this.prefixMappings.get(str != null ? new QName(str2, Namespace.m8864get(str)) : new QName(str2));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SAXEvent sAXEvent2 = new SAXEvent((byte) 3);
                sAXEvent2.addParm(it.next());
                this.events.add(sAXEvent2);
            }
        }
    }

    @Override
    public void endEntity(String str) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent((byte) 12);
        sAXEvent.addParm(str);
        this.events.add(sAXEvent);
    }

    @Override
    public void endPrefixMapping(String str) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent((byte) 3);
        sAXEvent.addParm(str);
        this.events.add(sAXEvent);
    }

    @Override
    public void externalEntityDecl(String str, String str2, String str3) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent((byte) 19);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        sAXEvent.addParm(str3);
        this.events.add(sAXEvent);
    }

    @Override
    public void internalEntityDecl(String str, String str2) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent((byte) 18);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        this.events.add(sAXEvent);
    }

    @Override
    public void processingInstruction(String str, String str2) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent(OBJECT);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        this.events.add(sAXEvent);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws ClassNotFoundException, IOException {
        if (objectInput.readByte() != 2) {
            this.events = (List) objectInput.readObject();
        }
    }

    public void replay(ContentHandler contentHandler) throws SAXException {
        for (SAXEvent sAXEvent : this.events) {
            switch (sAXEvent.event) {
                case 1:
                    contentHandler.processingInstruction((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1));
                    break;
                case 2:
                    contentHandler.startPrefixMapping((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1));
                    break;
                case 3:
                    contentHandler.endPrefixMapping((String) sAXEvent.getParm(0));
                    break;
                case 4:
                    contentHandler.startDocument();
                    break;
                case 5:
                    contentHandler.endDocument();
                    break;
                case 6:
                    AttributesImpl attributesImpl = new AttributesImpl();
                    List<String[]> list = (List) sAXEvent.getParm(3);
                    if (list != null) {
                        for (String[] strArr : list) {
                            attributesImpl.addAttribute(strArr[0], strArr[1], strArr[2], strArr[3], strArr[4]);
                        }
                    }
                    contentHandler.startElement((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1), (String) sAXEvent.getParm(2), attributesImpl);
                    break;
                case 7:
                    contentHandler.endElement((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1), (String) sAXEvent.getParm(2));
                    break;
                case 8:
                    contentHandler.characters((char[]) sAXEvent.getParm(0), ((Integer) sAXEvent.getParm(1)).intValue(), ((Integer) sAXEvent.getParm(2)).intValue());
                    break;
                case 9:
                    ((LexicalHandler) contentHandler).startDTD((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1), (String) sAXEvent.getParm(2));
                    break;
                case 10:
                    ((LexicalHandler) contentHandler).endDTD();
                    break;
                case 11:
                    ((LexicalHandler) contentHandler).startEntity((String) sAXEvent.getParm(0));
                    break;
                case 12:
                    ((LexicalHandler) contentHandler).endEntity((String) sAXEvent.getParm(0));
                    break;
                case 13:
                    ((LexicalHandler) contentHandler).startCDATA();
                    break;
                case 14:
                    ((LexicalHandler) contentHandler).endCDATA();
                    break;
                case 15:
                    ((LexicalHandler) contentHandler).comment((char[]) sAXEvent.getParm(0), ((Integer) sAXEvent.getParm(1)).intValue(), ((Integer) sAXEvent.getParm(2)).intValue());
                    break;
                case 16:
                    ((DeclHandler) contentHandler).elementDecl((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1));
                    break;
                case 17:
                    ((DeclHandler) contentHandler).attributeDecl((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1), (String) sAXEvent.getParm(2), (String) sAXEvent.getParm(3), (String) sAXEvent.getParm(4));
                    break;
                case 18:
                    ((DeclHandler) contentHandler).internalEntityDecl((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1));
                    break;
                case 19:
                    ((DeclHandler) contentHandler).externalEntityDecl((String) sAXEvent.getParm(0), (String) sAXEvent.getParm(1), (String) sAXEvent.getParm(2));
                    break;
                default:
                    throw new SAXException(new StringBuffer().append("Unrecognized event: ").append((int) sAXEvent.event).toString());
            }
        }
    }

    @Override
    public void startCDATA() throws SAXException {
        this.events.add(new SAXEvent((byte) 13));
    }

    @Override
    public void startDTD(String str, String str2, String str3) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent((byte) 9);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        sAXEvent.addParm(str3);
        this.events.add(sAXEvent);
    }

    @Override
    public void startDocument() throws SAXException {
        this.events.add(new SAXEvent((byte) 4));
    }

    @Override
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent((byte) 6);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        sAXEvent.addParm(str3);
        QName qName = str != null ? new QName(str2, Namespace.m8864get(str)) : new QName(str2);
        if (attributes != null && attributes.getLength() > 0) {
            ArrayList arrayList = new ArrayList(attributes.getLength());
            for (int i = 0; i < attributes.getLength(); i++) {
                String localName = attributes.getLocalName(i);
                if (localName.startsWith(XMLNS)) {
                    String strSubstring = localName.length() > 5 ? localName.substring(6) : "";
                    SAXEvent sAXEvent2 = new SAXEvent(NULL);
                    sAXEvent2.addParm(strSubstring);
                    sAXEvent2.addParm(attributes.getValue(i));
                    this.events.add(sAXEvent2);
                    List arrayList2 = (List) this.prefixMappings.get(qName);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        this.prefixMappings.put(qName, arrayList2);
                    }
                    arrayList2.add(strSubstring);
                } else {
                    arrayList.add(new String[]{attributes.getURI(i), localName, attributes.getQName(i), attributes.getType(i), attributes.getValue(i)});
                }
            }
            sAXEvent.addParm(arrayList);
        }
        this.events.add(sAXEvent);
    }

    @Override
    public void startEntity(String str) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent((byte) 11);
        sAXEvent.addParm(str);
        this.events.add(sAXEvent);
    }

    @Override
    public void startPrefixMapping(String str, String str2) throws SAXException {
        SAXEvent sAXEvent = new SAXEvent(NULL);
        sAXEvent.addParm(str);
        sAXEvent.addParm(str2);
        this.events.add(sAXEvent);
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        if (this.events == null) {
            objectOutput.writeByte(2);
        } else {
            objectOutput.writeByte(1);
            objectOutput.writeObject(this.events);
        }
    }
}
