package org.dom4j.io;

import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

class ElementStack implements ElementPath {
    private DispatchHandler handler;
    protected int lastElementIndex;
    protected Element[] stack;

    public ElementStack() {
        this(50);
    }

    public ElementStack(int i) {
        this.lastElementIndex = -1;
        this.handler = null;
        this.stack = new Element[i];
    }

    private String getHandlerPath(String str) {
        if (this.handler == null) {
            setDispatchHandler(new DispatchHandler());
        }
        if (str.startsWith("/")) {
            return str;
        }
        return getPath().equals("/") ? new StringBuffer().append(getPath()).append(str).toString() : new StringBuffer().append(getPath()).append("/").append(str).toString();
    }

    @Override
    public void addHandler(String str, ElementHandler elementHandler) {
        this.handler.addHandler(getHandlerPath(str), elementHandler);
    }

    public void clear() {
        this.lastElementIndex = -1;
    }

    public boolean containsHandler(String str) {
        return this.handler.containsHandler(str);
    }

    @Override
    public Element getCurrent() {
        return peekElement();
    }

    public DispatchHandler getDispatchHandler() {
        return this.handler;
    }

    @Override
    public Element getElement(int i) {
        try {
            return this.stack[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    @Override
    public String getPath() {
        if (this.handler == null) {
            setDispatchHandler(new DispatchHandler());
        }
        return this.handler.getPath();
    }

    public Element peekElement() {
        if (this.lastElementIndex < 0) {
            return null;
        }
        return this.stack[this.lastElementIndex];
    }

    public Element popElement() {
        if (this.lastElementIndex < 0) {
            return null;
        }
        Element[] elementArr = this.stack;
        int i = this.lastElementIndex;
        this.lastElementIndex = i - 1;
        return elementArr[i];
    }

    public void pushElement(Element element) {
        int length = this.stack.length;
        int i = this.lastElementIndex + 1;
        this.lastElementIndex = i;
        if (i >= length) {
            reallocate(length * 2);
        }
        this.stack[this.lastElementIndex] = element;
    }

    protected void reallocate(int i) {
        Element[] elementArr = this.stack;
        this.stack = new Element[i];
        System.arraycopy(elementArr, 0, this.stack, 0, elementArr.length);
    }

    @Override
    public void removeHandler(String str) {
        this.handler.removeHandler(getHandlerPath(str));
    }

    public void setDispatchHandler(DispatchHandler dispatchHandler) {
        this.handler = dispatchHandler;
    }

    @Override
    public int size() {
        return this.lastElementIndex + 1;
    }
}
