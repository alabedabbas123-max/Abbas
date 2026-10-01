package org.xutils.db.converter;

import android.database.Cursor;
import org.xutils.db.sqlite.ColumnDbType;

public class ShortColumnConverter implements ColumnConverter<Short> {
    @Override
    public Short getFieldValue(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i));
    }

    @Override
    public Object fieldValue2DbValue(Short sh) {
        return sh;
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }
}
