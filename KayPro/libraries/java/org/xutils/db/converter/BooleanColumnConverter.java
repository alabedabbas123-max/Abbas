package org.xutils.db.converter;

import android.database.Cursor;
import org.xutils.db.sqlite.ColumnDbType;

public class BooleanColumnConverter implements ColumnConverter<Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public Boolean getFieldValue(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Boolean.valueOf(cursor.getInt(i) == 1);
    }

    @Override
    public Object fieldValue2DbValue(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return Integer.valueOf(bool.booleanValue() ? 1 : 0);
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }
}
