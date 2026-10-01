package org.xutils.db.converter;

import android.database.Cursor;
import org.xutils.db.sqlite.ColumnDbType;

public class StringColumnConverter implements ColumnConverter<String> {
    @Override
    public String getFieldValue(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }

    @Override
    public Object fieldValue2DbValue(String str) {
        return str;
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.TEXT;
    }
}
