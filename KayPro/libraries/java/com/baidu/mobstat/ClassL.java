package com.baidu.mobstat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

class ClassL extends SQLiteOpenHelper {

    private String f4526a;

    private SQLiteDatabase f4527b;

    public ClassL(Context context, String str) throws SQLiteException {
        super(context, ClassY.f4569e, (SQLiteDatabase.CursorFactory) null, 1);
        this.f4526a = str;
    }

    @Override
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f4527b = sQLiteDatabase;
    }

    public synchronized boolean m6786a() {
        boolean z;
        synchronized (this) {
            boolean z2 = this.f4527b == null || !this.f4527b.isOpen();
            if (z2) {
                try {
                    this.f4527b = getWritableDatabase();
                } catch (NullPointerException e) {
                    throw new NullPointerException("db path is null");
                }
            }
            z = this.f4527b != null && this.f4527b.isOpen();
        }
        return z;
    }

    @Override
    public synchronized void close() {
        super.close();
        if (this.f4527b != null) {
            this.f4527b.close();
            this.f4527b = null;
        }
    }

    @Override
    public synchronized SQLiteDatabase getReadableDatabase() {
        return super.getReadableDatabase();
    }

    @Override
    public synchronized SQLiteDatabase getWritableDatabase() {
        return super.getWritableDatabase();
    }

    @Override
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void m6785a(String str) {
        getWritableDatabase().execSQL(str);
    }

    public final int m6787b() {
        Cursor cursorRawQuery = null;
        int i = 0;
        try {
            cursorRawQuery = this.f4527b.rawQuery("SELECT COUNT(*) FROM " + this.f4526a, null);
            if (cursorRawQuery != null && cursorRawQuery.moveToNext()) {
                i = cursorRawQuery.getInt(0);
            }
            return i;
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    public Cursor m6784a(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        return this.f4527b.query(this.f4526a, strArr, str, strArr2, str2, str3, str4, str5);
    }

    public long m6783a(String str, ContentValues contentValues) {
        return this.f4527b.insert(this.f4526a, str, contentValues);
    }

    public int m6782a(String str, String[] strArr) {
        return this.f4527b.delete(this.f4526a, str, strArr);
    }
}
