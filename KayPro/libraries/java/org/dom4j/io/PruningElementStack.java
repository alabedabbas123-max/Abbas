package org.dom4j.io;

import org.dom4j.Element;
import org.dom4j.ElementHandler;

class PruningElementStack extends ElementStack {
    private ElementHandler elementHandler;
    private int matchingElementIndex;
    private String[] path;

    public PruningElementStack(String[] strArr, ElementHandler elementHandler) {
        this.path = strArr;
        this.elementHandler = elementHandler;
        checkPath();
    }

    public PruningElementStack(String[] strArr, ElementHandler elementHandler, int i) {
        super(i);
        this.path = strArr;
        this.elementHandler = elementHandler;
        checkPath();
    }

    private void checkPath() {
        if (this.path.length < 2) {
            throw new RuntimeException(new StringBuffer().append("Invalid path of length: ").append(this.path.length).append(" it must be greater than 2").toString());
        }
        this.matchingElementIndex = this.path.length - 2;
    }

    protected void pathMatches(Element element, Element element2) {
        this.elementHandler.onEnd(this);
        element.remove(element2);
    }

    @Override
    public Element popElement() {
        Element element = null;
        Element elementPopElement = super.popElement();
        if (this.lastElementIndex == this.matchingElementIndex && this.lastElementIndex >= 0 && validElement(elementPopElement, this.lastElementIndex + 1)) {
            int i = 0;
            Element element2 = null;
            while (true) {
                if (i > this.lastElementIndex) {
                    element = element2;
                    break;
                }
                element2 = this.stack[i];
                if (!validElement(element2, i)) {
                    break;
                }
                i++;
            }
            if (element != null) {
                pathMatches(element, elementPopElement);
            }
        }
        return elementPopElement;
    }

    protected boolean validElement(Element element, int i) {
        String str = this.path[i];
        String name = element.getName();
        if (str == name) {
            return true;
        }
        if (str == null || name == null) {
            return false;
        }
        return str.equals(name);
    }
}
