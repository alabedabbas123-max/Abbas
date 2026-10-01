package org.xutils.db.converter;

import android.database.Cursor;
import org.xutils.db.sqlite.ColumnDbType;

public class IntegerColumnConverter implements ColumnConverter<Integer> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public Integer getFieldValue(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i));
    }

    @Override
    public Object fieldValue2DbValue(Integer num) {
        return num;
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }
}
