package com.luajava;

public interface LuaMetaTable {
    Object __call(Object... objArr) throws LuaException;

    Object __index(String str);

    void __newIndex(String str, Object obj);
}
