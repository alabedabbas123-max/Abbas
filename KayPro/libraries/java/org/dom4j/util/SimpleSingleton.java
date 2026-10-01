package org.dom4j.util;

public class SimpleSingleton implements SingletonStrategy {
    private String singletonClassName = null;
    private Object singletonInstance = null;

    @Override
    public Object instance() {
        return this.singletonInstance;
    }

    @Override
    public void reset() {
        if (this.singletonClassName != null) {
            try {
                this.singletonInstance = Thread.currentThread().getContextClassLoader().loadClass(this.singletonClassName).newInstance();
            } catch (Exception e) {
                try {
                    this.singletonInstance = Class.forName(this.singletonClassName).newInstance();
                } catch (Exception e2) {
                }
            }
        }
    }

    @Override
    public void setSingletonClassName(String str) {
        this.singletonClassName = str;
        reset();
    }
}
