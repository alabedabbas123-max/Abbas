package org.xutils.db.converter;

import android.database.Cursor;
import org.xutils.db.sqlite.ColumnDbType;

public class LongColumnConverter implements ColumnConverter<Long> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public Long getFieldValue(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    @Override
    public Object fieldValue2DbValue(Long l) {
        return l;
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }
}
