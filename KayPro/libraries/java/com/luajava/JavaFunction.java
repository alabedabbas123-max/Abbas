package com.luajava;

public abstract class JavaFunction {

    protected LuaState f4820L;

    public JavaFunction(LuaState luaState) {
        this.f4820L = luaState;
    }

    public abstract int execute() throws LuaException;

    public LuaObject getParam(int i) {
        return this.f4820L.getLuaObject(i);
    }

    public void register(String str) throws LuaException {
        synchronized (this.f4820L) {
            this.f4820L.pushJavaFunction(this);
            this.f4820L.setGlobal(str);
        }
    }
}
