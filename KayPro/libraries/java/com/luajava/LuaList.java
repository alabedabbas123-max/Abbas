package com.luajava;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LuaList extends LuaObject implements List {
    public LuaList(LuaState luaState) {
        super(luaState);
        luaState.newTable();
        registerValue(-1);
    }

    protected LuaList(LuaState luaState, int i) {
        super(luaState, i);
    }

    protected LuaList(LuaState luaState, String str) {
        super(luaState, str);
    }

    @Override
    public void add(int i, Object obj) {
    }

    @Override
    public boolean add(Object obj) {
        push();
        int iRawLen = this.f4823L.rawLen(-1);
        try {
            this.f4823L.pushObjectValue(obj);
            this.f4823L.setI(-2, iRawLen + 1);
            m7086pop();
            return true;
        } catch (LuaException e) {
            m7086pop();
            return false;
        }
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection collection) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return false;
    }

    @Override
    public Object get(int i) {
        return (Object) null;
    }

    @Override
    public int indexOf(Object obj) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        push();
        int iRawLen = this.f4823L.rawLen(-1);
        this.f4823L.m7091pop(1);
        return iRawLen == 0;
    }

    @Override
    public Iterator iterator() {
        return (Iterator) null;
    }

    @Override
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return (ListIterator) null;
    }

    @Override
    public ListIterator listIterator(int i) {
        return (ListIterator) null;
    }

    @Override
    public Object remove(int i) {
        return (Object) null;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public Object set(int i, Object obj) {
        return (Object) null;
    }

    @Override
    public int size() {
        push();
        int iRawLen = this.f4823L.rawLen(-1);
        this.f4823L.m7091pop(1);
        return iRawLen;
    }

    @Override
    public List subList(int i, int i2) {
        return (List) null;
    }

    @Override
    public Object[] toArray() {
        return (Object[]) null;
    }

    @Override
    public Object[] toArray(Object[] objArr) {
        return (Object[]) null;
    }
}
