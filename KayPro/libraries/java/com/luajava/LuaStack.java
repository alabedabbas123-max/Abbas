package com.luajava;

import java.util.HashMap;

public class LuaStack {
    private static final HashMap<String, LuaState> luaStack = new HashMap<>();

    public static Object call(String str, String str2, Object[] objArr) throws LuaException {
        return new LuaFunction(m7087get(str), str2).call(objArr);
    }

    public static LuaState m7087get(String str) {
        return luaStack.get(str);
    }

    public static void m7088put(String str, LuaState luaState) {
        luaStack.put(str, luaState);
    }
}
