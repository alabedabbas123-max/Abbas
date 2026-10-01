package com.luajava;

import java.util.HashMap;
import java.util.Map;

public final class LuaStateFactory {
    private static final Map<Long, LuaState> states = new HashMap();

    LuaStateFactory() {
    }

    public static synchronized LuaState getExistingState(long j) {
        LuaState luaState;
        luaState = states.get(new Long(j));
        if (luaState == null) {
            luaState = new LuaState(j);
            states.put(new Long(j), luaState);
        }
        return luaState;
    }

    public static synchronized long insertLuaState(LuaState luaState) {
        states.put(new Long(luaState.getPointer()), luaState);
        return luaState.getPointer();
    }

    public static synchronized LuaState newLuaState() {
        LuaState luaState;
        luaState = new LuaState();
        states.put(new Long(luaState.getPointer()), luaState);
        return luaState;
    }

    public static synchronized void removeLuaState(long j) {
        states.put(new Long(j), (LuaState) null);
    }
}
