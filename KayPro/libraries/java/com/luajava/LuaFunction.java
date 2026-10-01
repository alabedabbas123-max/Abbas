package com.luajava;

public class LuaFunction<T> extends LuaObject implements LuaMetaTable {
    protected LuaFunction(LuaState luaState, int i) {
        super(luaState, i);
    }

    protected LuaFunction(LuaState luaState, String str) {
        super(luaState, str);
    }

    @Override
    public T __call(Object[] objArr) throws LuaException {
        return (T) super.call(objArr);
    }

    @Override
    public Object __index(String str) {
        return (Object) null;
    }

    @Override
    public void __newIndex(String str, Object obj) {
    }

    @Override
    public T call(Object... objArr) throws LuaException {
        return (T) super.call(objArr);
    }
}
