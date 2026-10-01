package com.luajava;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LuaTable<K, V> extends LuaObject implements Map<K, V> {

    public class LuaEntry<K, V> implements Map.Entry<K, V> {
        private K mKey;
        private V mValue;
        private final LuaTable this$0;

        public LuaEntry(LuaTable luaTable, K k, V v) {
            this.this$0 = luaTable;
            this.mKey = k;
            this.mValue = v;
        }

        @Override
        public K getKey() {
            return this.mKey;
        }

        @Override
        public V getValue() {
            return this.mValue;
        }

        @Override
        public V setValue(V v) {
            V v2 = this.mValue;
            this.mValue = v;
            return v2;
        }
    }

    public LuaTable(LuaState luaState) {
        super(luaState);
        luaState.newTable();
        registerValue(-1);
    }

    protected LuaTable(LuaState luaState, int i) {
        super(luaState, i);
    }

    protected LuaTable(LuaState luaState, String str) {
        super(luaState, str);
    }

    @Override
    public void clear() {
        push();
        this.f4823L.pushNil();
        while (this.f4823L.next(-2) != 0) {
            this.f4823L.m7091pop(1);
            this.f4823L.pushValue(-1);
            this.f4823L.pushNil();
            this.f4823L.setTable(-4);
        }
        this.f4823L.m7091pop(1);
    }

    @Override
    public boolean containsKey(Object obj) {
        push();
        try {
            this.f4823L.pushObjectValue(obj);
            boolean z = this.f4823L.getTable(-2) == 0;
            this.f4823L.m7091pop(1);
            this.f4823L.m7091pop(1);
            return z;
        } catch (LuaException e) {
            return false;
        }
    }

    @Override
    public boolean containsValue(Object obj) {
        return false;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        HashSet hashSet = new HashSet();
        push();
        this.f4823L.pushNil();
        while (this.f4823L.next(-2) != 0) {
            try {
                hashSet.add(new LuaEntry(this, this.f4823L.toJavaObject(-2), this.f4823L.toJavaObject(-1)));
            } catch (LuaException e) {
            }
            this.f4823L.m7091pop(1);
        }
        this.f4823L.m7091pop(1);
        return hashSet;
    }

    @Override
    public V get(Object obj) {
        push();
        Object obj2 = (Object) null;
        try {
            this.f4823L.pushObjectValue(obj);
            this.f4823L.getTable(-2);
            obj2 = (V) this.f4823L.toJavaObject(-1);
            this.f4823L.m7091pop(1);
        } catch (LuaException e) {
        }
        this.f4823L.m7091pop(1);
        return (V) obj2;
    }

    @Override
    public boolean isEmpty() {
        push();
        this.f4823L.pushNil();
        boolean z = this.f4823L.next(-2) == 0;
        if (z) {
            this.f4823L.m7091pop(1);
        } else {
            this.f4823L.m7091pop(3);
        }
        return z;
    }

    public boolean isList() {
        push();
        if (this.f4823L.rawLen(-1) != 0) {
            m7086pop();
            return true;
        }
        this.f4823L.pushNil();
        boolean z = this.f4823L.next(-2) == 0;
        if (z) {
            this.f4823L.m7091pop(1);
        } else {
            this.f4823L.m7091pop(3);
        }
        return z;
    }

    @Override
    public Set<K> keySet() {
        HashSet hashSet = new HashSet();
        push();
        this.f4823L.pushNil();
        while (this.f4823L.next(-2) != 0) {
            try {
                hashSet.add(this.f4823L.toJavaObject(-2));
            } catch (LuaException e) {
            }
            this.f4823L.m7091pop(1);
        }
        this.f4823L.m7091pop(1);
        return hashSet;
    }

    public int length() {
        push();
        int iRawLen = this.f4823L.rawLen(-1);
        m7086pop();
        return iRawLen;
    }

    @Override
    public V put(K k, V v) {
        push();
        try {
            this.f4823L.pushObjectValue(k);
            this.f4823L.pushObjectValue(v);
            this.f4823L.setTable(-3);
        } catch (LuaException e) {
        }
        this.f4823L.m7091pop(1);
        return (V) ((Object) null);
    }

    @Override
    public void putAll(Map map) {
    }

    @Override
    public V remove(Object obj) {
        push();
        try {
            this.f4823L.pushObjectValue(obj);
            this.f4823L.setTable(-2);
        } catch (LuaException e) {
        }
        this.f4823L.m7091pop(1);
        return (V) ((Object) null);
    }

    @Override
    public int size() {
        int i = 0;
        push();
        this.f4823L.pushNil();
        while (this.f4823L.next(-2) != 0) {
            i++;
            this.f4823L.m7091pop(1);
        }
        this.f4823L.m7091pop(1);
        return i;
    }

    @Override
    public Collection values() {
        return (Collection) null;
    }
}
