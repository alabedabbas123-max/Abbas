package com.baidu.mobstat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;

class ClassN extends Abstractj {
    public ClassN(Context context) {
        super(context, "app_apk3", "Create table if not exists app_apk3(_id Integer primary key AUTOINCREMENT,time VARCHAR(50),content TEXT);");
    }

    @Override
    public ArrayList<ClassI> mo6768a(int i, int i2) {
        Cursor cursorA = m6766a("time", i, i2);
        ArrayList<ClassI> arrayListM6789a = m6789a(cursorA);
        if (cursorA != null) {
            cursorA.close();
        }
        return arrayListM6789a;
    }

    @Override
    public long mo6765a(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("time", str);
        contentValues.put("content", str2);
        return m6764a(contentValues);
    }

    @Override
    public boolean mo6772b(long j) {
        return m6770a(j);
    }

    private ArrayList<ClassI> m6789a(Cursor cursor) {
        ArrayList<ClassI> arrayList = new ArrayList<>();
        if (cursor != null && cursor.getCount() != 0) {
            int columnIndex = cursor.getColumnIndex("_id");
            int columnIndex2 = cursor.getColumnIndex("time");
            int columnIndex3 = cursor.getColumnIndex("content");
            while (cursor.moveToNext()) {
                arrayList.add(new ClassI(cursor.getLong(columnIndex), cursor.getString(columnIndex2), cursor.getString(columnIndex3)));
            }
        }
        return arrayList;
    }
}
