package org.dom4j.io;

import java.util.ArrayList;
import java.util.HashMap;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

class DispatchHandler implements ElementHandler {
    private ElementHandler defaultHandler;
    private boolean atRoot = true;
    private String path = "/";
    private ArrayList pathStack = new ArrayList();
    private ArrayList handlerStack = new ArrayList();
    private HashMap handlers = new HashMap();

    public void addHandler(String str, ElementHandler elementHandler) {
        this.handlers.put(str, elementHandler);
    }

    public boolean containsHandler(String str) {
        return this.handlers.containsKey(str);
    }

    public int getActiveHandlerCount() {
        return this.handlerStack.size();
    }

    public ElementHandler getHandler(String str) {
        return (ElementHandler) this.handlers.get(str);
    }

    public String getPath() {
        return this.path;
    }

    @Override
    public void onEnd(ElementPath elementPath) {
        if (this.handlers != null && this.handlers.containsKey(this.path)) {
            ElementHandler elementHandler = (ElementHandler) this.handlers.get(this.path);
            this.handlerStack.remove(this.handlerStack.size() - 1);
            elementHandler.onEnd(elementPath);
        } else if (this.handlerStack.isEmpty() && this.defaultHandler != null) {
            this.defaultHandler.onEnd(elementPath);
        }
        this.path = (String) this.pathStack.remove(this.pathStack.size() - 1);
        if (this.pathStack.size() == 0) {
            this.atRoot = true;
        }
    }

    @Override
    public void onStart(ElementPath elementPath) {
        Element current = elementPath.getCurrent();
        this.pathStack.add(this.path);
        if (this.atRoot) {
            this.path = new StringBuffer().append(this.path).append(current.getName()).toString();
            this.atRoot = false;
        } else {
            this.path = new StringBuffer().append(this.path).append("/").append(current.getName()).toString();
        }
        if (this.handlers != null && this.handlers.containsKey(this.path)) {
            ElementHandler elementHandler = (ElementHandler) this.handlers.get(this.path);
            this.handlerStack.add(elementHandler);
            elementHandler.onStart(elementPath);
        } else {
            if (!this.handlerStack.isEmpty() || this.defaultHandler == null) {
                return;
            }
            this.defaultHandler.onStart(elementPath);
        }
    }

    public ElementHandler removeHandler(String str) {
        return (ElementHandler) this.handlers.remove(str);
    }

    public void resetHandlers() {
        this.atRoot = true;
        this.path = "/";
        this.pathStack.clear();
        this.handlerStack.clear();
        this.handlers.clear();
        this.defaultHandler = null;
    }

    public void setDefaultHandler(ElementHandler elementHandler) {
        this.defaultHandler = elementHandler;
    }
}
