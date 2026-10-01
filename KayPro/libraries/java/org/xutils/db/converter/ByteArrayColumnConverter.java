package org.xutils.db.converter;

import android.database.Cursor;
import org.xutils.db.sqlite.ColumnDbType;

public class ByteArrayColumnConverter implements ColumnConverter<byte[]> {
    @Override
    public byte[] getFieldValue(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getBlob(i);
    }

    @Override
    public Object fieldValue2DbValue(byte[] bArr) {
        return bArr;
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.BLOB;
    }
}
