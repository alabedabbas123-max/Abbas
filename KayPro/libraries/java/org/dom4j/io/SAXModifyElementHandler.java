package org.dom4j.io;

import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

class SAXModifyElementHandler implements ElementHandler {
    private ElementModifier elemModifier;
    private Element modifiedElement;

    public SAXModifyElementHandler(ElementModifier elementModifier) {
        this.elemModifier = elementModifier;
    }

    protected Element getModifiedElement() {
        return this.modifiedElement;
    }

    @Override
    public void onEnd(ElementPath elementPath) {
        try {
            Element current = elementPath.getCurrent();
            Element parent = current.getParent();
            if (parent != null) {
                this.modifiedElement = this.elemModifier.modifyElement((Element) current.clone());
                if (this.modifiedElement != null) {
                    this.modifiedElement.setParent(current.getParent());
                    this.modifiedElement.setDocument(current.getDocument());
                    parent.content().set(parent.indexOf(current), this.modifiedElement);
                }
                current.detach();
            } else if (current.isRootElement()) {
                this.modifiedElement = this.elemModifier.modifyElement((Element) current.clone());
                if (this.modifiedElement != null) {
                    this.modifiedElement.setDocument(current.getDocument());
                    current.getDocument().setRootElement(this.modifiedElement);
                }
                current.detach();
            }
            if (elementPath instanceof ElementStack) {
                ElementStack elementStack = (ElementStack) elementPath;
                elementStack.popElement();
                elementStack.pushElement(this.modifiedElement);
            }
        } catch (Exception e) {
            throw new SAXModifyException(e);
        }
    }

    @Override
    public void onStart(ElementPath elementPath) {
        this.modifiedElement = elementPath.getCurrent();
    }
}
