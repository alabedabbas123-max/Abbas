package com.baidu.mobstat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.io.Closeable;
import java.util.ArrayList;

abstract class Abstractj implements Closeable {

    private ClassL f4518a;

    public abstract long mo6765a(String str, String str2);

    public abstract ArrayList<ClassI> mo6768a(int i, int i2);

    public abstract boolean mo6772b(long j);

    public Abstractj(Context context, String str, String str2) {
        try {
            this.f4518a = new ClassL(context, str);
            if (context.getDatabasePath(ClassY.f4569e) != null) {
                m6763a(str2);
            }
        } catch (Exception e) {
        }
    }

    private void m6763a(String str) {
        this.f4518a.m6785a(str);
    }

    public synchronized boolean m6769a() {
        boolean zM6786a;
        try {
            zM6786a = this.f4518a.m6786a();
        } catch (Exception e) {
            ba.m6312c().m6305b(e);
            zM6786a = false;
        }
        return zM6786a;
    }

    @Override
    public synchronized void close() {
        try {
            this.f4518a.close();
        } catch (Exception e) {
            ba.m6312c().m6305b(e);
        }
    }

    protected int m6771b() {
        return this.f4518a.m6787b();
    }

    protected Cursor m6766a(String str, int i, int i2) {
        return this.f4518a.m6784a(null, null, null, null, null, str + " desc", i2 + ", " + i);
    }

    protected Cursor m6767a(String str, String str2, String str3, int i) {
        return this.f4518a.m6784a(null, str + "=? ", new String[]{str2}, null, null, str3 + " desc", i + "");
    }

    protected long m6764a(ContentValues contentValues) {
        return this.f4518a.m6783a((String) null, contentValues);
    }

    protected boolean m6770a(long j) {
        return this.f4518a.m6782a("_id=? ", new String[]{new StringBuilder().append(j).append("").toString()}) > 0;
    }
}
