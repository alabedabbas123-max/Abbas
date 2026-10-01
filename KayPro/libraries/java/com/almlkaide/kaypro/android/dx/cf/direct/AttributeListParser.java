package com.almlkaide.kaypro.android.dx.cf.direct;

import com.almlkaide.kaypro.android.dx.cf.iface.Attribute;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseException;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseObserver;
import com.almlkaide.kaypro.android.dx.cf.iface.StdAttributeList;
import com.almlkaide.kaypro.android.dx.util.ByteArray;
import com.almlkaide.kaypro.android.dx.util.Hex;

final class AttributeListParser {
    private final AttributeFactory attributeFactory;

    private final DirectClassFile f5010cf;
    private final int context;
    private int endOffset;
    private final StdAttributeList list;
    private ParseObserver observer;
    private final int offset;

    public AttributeListParser(DirectClassFile directClassFile, int i, int i2, AttributeFactory attributeFactory) {
        if (directClassFile == null) {
            throw new NullPointerException("cf == null");
        }
        if (attributeFactory == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        int unsignedShort = directClassFile.getBytes().getUnsignedShort(i2);
        this.f5010cf = directClassFile;
        this.context = i;
        this.offset = i2;
        this.attributeFactory = attributeFactory;
        this.list = new StdAttributeList(unsignedShort);
        this.endOffset = -1;
    }

    public void setObserver(ParseObserver parseObserver) {
        this.observer = parseObserver;
    }

    public int getEndOffset() {
        parseIfNecessary();
        return this.endOffset;
    }

    public StdAttributeList getList() {
        parseIfNecessary();
        return this.list;
    }

    private void parseIfNecessary() {
        if (this.endOffset < 0) {
            parse();
        }
    }

    private void parse() {
        int size = this.list.size();
        int iByteLength = this.offset + 2;
        ByteArray bytes = this.f5010cf.getBytes();
        if (this.observer != null) {
            this.observer.parsed(bytes, this.offset, 2, new StringBuffer().append("attributes_count: ").append(Hex.m7225u2(size)).toString());
        }
        for (int i = 0; i < size; i++) {
            try {
                if (this.observer != null) {
                    this.observer.parsed(bytes, iByteLength, 0, new StringBuffer().append(new StringBuffer().append("\nattributes[").append(i).toString()).append("]:\n").toString());
                    this.observer.changeIndent(1);
                }
                Attribute attribute = this.attributeFactory.parse(this.f5010cf, this.context, iByteLength, this.observer);
                iByteLength += attribute.byteLength();
                this.list.m7141set(i, attribute);
                if (this.observer != null) {
                    this.observer.changeIndent(-1);
                    this.observer.parsed(bytes, iByteLength, 0, new StringBuffer().append(new StringBuffer().append("end attributes[").append(i).toString()).append("]\n").toString());
                }
            } catch (ParseException e) {
                e.addContext(new StringBuffer().append(new StringBuffer().append("...while parsing attributes[").append(i).toString()).append("]").toString());
                throw e;
            } catch (RuntimeException e2) {
                ParseException parseException = new ParseException(e2);
                parseException.addContext(new StringBuffer().append(new StringBuffer().append("...while parsing attributes[").append(i).toString()).append("]").toString());
                throw parseException;
            }
        }
        this.endOffset = iByteLength;
    }
}
