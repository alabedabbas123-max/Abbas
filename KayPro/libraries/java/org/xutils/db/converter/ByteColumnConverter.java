package org.xutils.db.converter;

import android.database.Cursor;
import org.xutils.db.sqlite.ColumnDbType;

public class ByteColumnConverter implements ColumnConverter<Byte> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public Byte getFieldValue(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Byte.valueOf((byte) cursor.getInt(i));
    }

    @Override
    public Object fieldValue2DbValue(Byte b) {
        return b;
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }
}
