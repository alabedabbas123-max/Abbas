package org.xutils.db.converter;

import android.database.Cursor;
import org.xutils.db.sqlite.ColumnDbType;

public class FloatColumnConverter implements ColumnConverter<Float> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public Float getFieldValue(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i));
    }

    @Override
    public Object fieldValue2DbValue(Float f) {
        return f;
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.REAL;
    }
}
