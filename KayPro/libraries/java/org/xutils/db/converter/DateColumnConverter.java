package org.xutils.db.converter;

import android.database.Cursor;
import java.util.Date;
import org.xutils.db.sqlite.ColumnDbType;

public class DateColumnConverter implements ColumnConverter<Date> {
    @Override
    public Date getFieldValue(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return new Date(cursor.getLong(i));
    }

    @Override
    public Object fieldValue2DbValue(Date date) {
        if (date == null) {
            return null;
        }
        return Long.valueOf(date.getTime());
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }
}
