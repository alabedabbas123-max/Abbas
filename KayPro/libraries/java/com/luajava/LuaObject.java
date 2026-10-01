package com.luajava;

import java.lang.reflect.Array;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class LuaObject {

    protected LuaState f4823L;

    protected int f4824ref;

    protected LuaObject(LuaObject luaObject, LuaObject luaObject2) throws LuaException {
        if (luaObject.getLuaState() != luaObject2.getLuaState()) {
            throw new LuaException("LuaStates must be the same!");
        }
        synchronized (luaObject.getLuaState()) {
            if (!luaObject.isTable() && !luaObject.isUserdata()) {
                throw new LuaException("Object parent should be a table or userdata .");
            }
            this.f4823L = luaObject.getLuaState();
            luaObject.push();
            luaObject2.push();
            this.f4823L.getTable(-2);
            this.f4823L.remove(-2);
            registerValue(-1);
            this.f4823L.m7091pop(1);
        }
    }

    protected LuaObject(LuaObject luaObject, Number number) throws LuaException {
        synchronized (luaObject.getLuaState()) {
            this.f4823L = luaObject.getLuaState();
            if (!luaObject.isTable() && !luaObject.isUserdata()) {
                throw new LuaException("Object parent should be a table or userdata .");
            }
            luaObject.push();
            this.f4823L.pushNumber(number.doubleValue());
            this.f4823L.getTable(-2);
            this.f4823L.remove(-2);
            registerValue(-1);
            this.f4823L.m7091pop(1);
        }
    }

    protected LuaObject(LuaObject luaObject, String str) throws LuaException {
        synchronized (luaObject.getLuaState()) {
            this.f4823L = luaObject.getLuaState();
            if (!luaObject.isTable() && !luaObject.isUserdata()) {
                throw new LuaException("Object parent should be a table or userdata .");
            }
            luaObject.push();
            this.f4823L.pushString(str);
            this.f4823L.getTable(-2);
            this.f4823L.remove(-2);
            registerValue(-1);
            this.f4823L.m7091pop(1);
        }
    }

    protected LuaObject(LuaState luaState) {
        this.f4823L = luaState;
    }

    protected LuaObject(LuaState luaState, int i) {
        synchronized (luaState) {
            this.f4823L = luaState;
            registerValue(i);
        }
    }

    protected LuaObject(LuaState luaState, String str) {
        synchronized (luaState) {
            this.f4823L = luaState;
            luaState.getGlobal(str);
            registerValue(-1);
            luaState.m7091pop(1);
        }
    }

    public Object[] asArray() throws LuaException {
        Object[] objArr;
        synchronized (this.f4823L) {
            if (!isTable()) {
                throw new LuaException("Invalid object. Not a table .");
            }
            push();
            int iObjLen = this.f4823L.objLen(-1);
            try {
                Object objNewInstance = Array.newInstance(Class.forName("java.lang.Object"), iObjLen);
                for (int i = 1; i <= iObjLen; i++) {
                    this.f4823L.pushInteger(i);
                    this.f4823L.getTable(-2);
                    try {
                        Array.set(objNewInstance, i - 1, this.f4823L.toJavaObject(-1));
                    } catch (LuaException e) {
                    }
                    this.f4823L.m7091pop(1);
                }
                this.f4823L.m7091pop(1);
                objArr = (Object[]) objNewInstance;
            } catch (ClassNotFoundException e2) {
                throw new NoClassDefFoundError(e2.getMessage());
            }
        }
        return objArr;
    }

    public Map asMap(LuaState luaState, Class<?> cls, int i) throws LuaException {
        HashMap map;
        synchronized (luaState) {
            if (!isTable()) {
                throw new LuaException("Invalid object. Not a table .");
            }
            map = new HashMap();
            push();
            luaState.pushNil();
            while (luaState.next(i) != 0) {
                try {
                    map.put(luaState.toJavaObject(-2), luaState.toJavaObject(-1));
                } catch (LuaException e) {
                }
                luaState.m7091pop(1);
            }
            luaState.m7091pop(1);
        }
        return map;
    }

    public Object call(Object... objArr) throws LuaException {
        return callx(objArr, 1)[0];
    }

    public Object[] callx(Object[] objArr, int i) throws LuaException {
        int i2;
        Object[] objArr2;
        String string;
        String string2;
        synchronized (this.f4823L) {
            if (!isFunction() && !isTable() && !isUserdata()) {
                throw new LuaException("Invalid object. Not a function, table or userdata .");
            }
            int top = this.f4823L.getTop();
            push();
            if (objArr != null) {
                for (Object obj : objArr) {
                    this.f4823L.pushObjectValue(obj);
                }
            } else {
                i2 = 0;
            }
            int iPcall = this.f4823L.pcall(i2, i, 0);
            if (iPcall != 0) {
                if (this.f4823L.isString(-1)) {
                    string = this.f4823L.toString(-1);
                    this.f4823L.m7091pop(1);
                } else {
                    string = "";
                }
                if (iPcall == 2) {
                    string2 = new StringBuffer().append("Runtime error. ").append(string).toString();
                } else if (iPcall == 4) {
                    string2 = new StringBuffer().append("Memory allocation error. ").append(string).toString();
                } else {
                    string2 = iPcall == 6 ? new StringBuffer().append("Error while running the error handler function. ").append(string).toString() : new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Lua Error code ").append(iPcall).toString()).append(". ").toString()).append(string).toString();
                }
                throw new LuaException(string2);
            }
            int top2 = i == -1 ? this.f4823L.getTop() - top : i;
            if (this.f4823L.getTop() - top < top2) {
                throw new LuaException("Invalid Number of Results .");
            }
            objArr2 = new Object[top2];
            while (top2 > 0) {
                objArr2[top2 - 1] = this.f4823L.toJavaObject(-1);
                this.f4823L.m7091pop(1);
                top2--;
            }
        }
        return objArr2;
    }

    public Object createProxy(Class cls) throws LuaException {
        Object objNewProxyInstance;
        synchronized (this.f4823L) {
            if (!isTable()) {
                throw new LuaException("Invalid Object. Must be Table.");
            }
            objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new LuaInvocationHandler(this));
        }
        return objNewProxyInstance;
    }

    public Object createProxy(String str) throws LuaException, ClassNotFoundException {
        Object objNewProxyInstance;
        synchronized (this.f4823L) {
            if (!isTable()) {
                throw new LuaException("Invalid Object. Must be Table.");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            Class[] clsArr = new Class[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                clsArr[i] = Class.forName(stringTokenizer.nextToken());
                i++;
            }
            objNewProxyInstance = Proxy.newProxyInstance(getClass().getClassLoader(), clsArr, new LuaInvocationHandler(this));
        }
        return objNewProxyInstance;
    }

    public byte[] dump() throws LuaException {
        byte[] bArrDump;
        synchronized (this.f4823L) {
            if (!isFunction()) {
                throw new LuaException("Invalid object. Not a function .");
            }
            push();
            bArrDump = this.f4823L.dump(-1);
            this.f4823L.m7091pop(1);
        }
        return bArrDump;
    }

    protected void finalize() {
        try {
            synchronized (this.f4823L) {
                if (this.f4823L.getPointer() != 0) {
                    this.f4823L.LunRef(LuaState.LUA_REGISTRYINDEX, this.f4824ref);
                }
            }
        } catch (Exception e) {
            System.err.println(new StringBuffer().append("Unable to release object ").append(this.f4824ref).toString());
        }
    }

    public boolean getBoolean() {
        boolean z;
        synchronized (this.f4823L) {
            push();
            z = this.f4823L.toBoolean(-1);
            this.f4823L.m7091pop(1);
        }
        return z;
    }

    public LuaObject getField(String str) throws LuaException {
        return this.f4823L.getLuaObject(this, str);
    }

    public LuaFunction<?> getFunction() {
        LuaFunction<?> luaFunction;
        synchronized (this.f4823L) {
            push();
            luaFunction = new LuaFunction<>(this.f4823L, -1);
            this.f4823L.m7091pop(1);
        }
        return luaFunction;
    }

    public LuaObject getI(long j) throws LuaException {
        return this.f4823L.getLuaObject(this, new Long(j));
    }

    public long getInteger() {
        long integer;
        synchronized (this.f4823L) {
            push();
            integer = this.f4823L.toInteger(-1);
            this.f4823L.m7091pop(1);
        }
        return integer;
    }

    public LuaState getLuaState() {
        return this.f4823L;
    }

    public double getNumber() {
        double number;
        synchronized (this.f4823L) {
            push();
            number = this.f4823L.toNumber(-1);
            this.f4823L.m7091pop(1);
        }
        return number;
    }

    public Object getObject() throws LuaException {
        Object objectFromUserdata;
        synchronized (this.f4823L) {
            push();
            objectFromUserdata = this.f4823L.getObjectFromUserdata(-1);
            this.f4823L.m7091pop(1);
        }
        return objectFromUserdata;
    }

    public String getString() {
        String string;
        synchronized (this.f4823L) {
            push();
            string = this.f4823L.toString(-1);
            this.f4823L.m7091pop(1);
        }
        return string;
    }

    public LuaTable<?, ?> getTable() {
        LuaTable<?, ?> luaTable;
        synchronized (this.f4823L) {
            push();
            luaTable = new LuaTable<>(this.f4823L, -1);
            this.f4823L.m7091pop(1);
        }
        return luaTable;
    }

    public boolean isBoolean() {
        boolean zIsBoolean;
        synchronized (this.f4823L) {
            push();
            zIsBoolean = this.f4823L.isBoolean(-1);
            this.f4823L.m7091pop(1);
        }
        return zIsBoolean;
    }

    public boolean isFunction() {
        boolean zIsFunction;
        synchronized (this.f4823L) {
            push();
            zIsFunction = this.f4823L.isFunction(-1);
            this.f4823L.m7091pop(1);
        }
        return zIsFunction;
    }

    public boolean isInteger() {
        boolean zIsInteger;
        synchronized (this.f4823L) {
            push();
            zIsInteger = this.f4823L.isInteger(-1);
            this.f4823L.m7091pop(1);
        }
        return zIsInteger;
    }

    public boolean isJavaFunction() {
        boolean zIsJavaFunction;
        synchronized (this.f4823L) {
            push();
            zIsJavaFunction = this.f4823L.isJavaFunction(-1);
            this.f4823L.m7091pop(1);
        }
        return zIsJavaFunction;
    }

    public boolean isJavaObject() {
        boolean zIsObject;
        synchronized (this.f4823L) {
            push();
            zIsObject = this.f4823L.isObject(-1);
            this.f4823L.m7091pop(1);
        }
        return zIsObject;
    }

    public boolean isNil() {
        boolean zIsNil;
        synchronized (this.f4823L) {
            push();
            zIsNil = this.f4823L.isNil(-1);
            this.f4823L.m7091pop(1);
        }
        return zIsNil;
    }

    public boolean isNumber() {
        boolean zIsNumber;
        synchronized (this.f4823L) {
            push();
            zIsNumber = this.f4823L.isNumber(-1);
            this.f4823L.m7091pop(1);
        }
        return zIsNumber;
    }

    public boolean isString() {
        boolean zIsString;
        synchronized (this.f4823L) {
            push();
            zIsString = this.f4823L.isString(-1);
            this.f4823L.m7091pop(1);
        }
        return zIsString;
    }

    public boolean isTable() {
        boolean zIsTable;
        synchronized (this.f4823L) {
            push();
            zIsTable = this.f4823L.isTable(-1);
            this.f4823L.m7091pop(1);
        }
        return zIsTable;
    }

    public boolean isUserdata() {
        boolean zIsUserdata;
        synchronized (this.f4823L) {
            push();
            zIsUserdata = this.f4823L.isUserdata(-1);
            this.f4823L.m7091pop(1);
        }
        return zIsUserdata;
    }

    public void m7086pop() {
        this.f4823L.m7091pop(1);
    }

    public void push() {
        this.f4823L.rawGetI(LuaState.LUA_REGISTRYINDEX, this.f4824ref);
    }

    protected void registerValue(int i) {
        synchronized (this.f4823L) {
            this.f4823L.pushValue(i);
            this.f4824ref = this.f4823L.Lref(LuaState.LUA_REGISTRYINDEX);
        }
    }

    public void setField(String str, Object obj) {
        push();
        try {
            this.f4823L.pushObjectValue(obj);
        } catch (LuaException e) {
            this.f4823L.pushNil();
        }
        this.f4823L.setField(-2, str);
        this.f4823L.m7091pop(1);
    }

    public void setI(long j, Object obj) {
        push();
        try {
            this.f4823L.pushObjectValue(obj);
        } catch (LuaException e) {
            this.f4823L.pushNil();
        }
        this.f4823L.setI(-2, j);
        this.f4823L.m7091pop(1);
    }

    public String toString() {
        String string;
        synchronized (this.f4823L) {
            try {
                if (isNil()) {
                    string = "nil";
                } else if (isBoolean()) {
                    string = String.valueOf(getBoolean());
                } else if (isNumber()) {
                    string = String.valueOf(getNumber());
                } else if (isString()) {
                    string = getString();
                } else if (isFunction()) {
                    string = "Lua Function";
                } else if (isJavaObject()) {
                    string = getObject().toString();
                } else if (isUserdata()) {
                    string = "Userdata";
                } else if (isTable()) {
                    string = "Lua Table";
                } else {
                    string = isJavaFunction() ? "Java Function" : (String) null;
                }
            } catch (LuaException e) {
                string = (String) null;
            }
        }
        return string;
    }

    public int type() {
        int iType;
        synchronized (this.f4823L) {
            push();
            iType = this.f4823L.type(-1);
            this.f4823L.m7091pop(1);
        }
        return iType;
    }
}
