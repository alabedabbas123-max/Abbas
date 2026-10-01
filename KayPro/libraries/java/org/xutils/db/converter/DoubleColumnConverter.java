package org.xutils.db.converter;

import android.database.Cursor;
import org.xutils.db.sqlite.ColumnDbType;

public class DoubleColumnConverter implements ColumnConverter<Double> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public Double getFieldValue(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i));
    }

    @Override
    public Object fieldValue2DbValue(Double d) {
        return d;
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.REAL;
    }
}
