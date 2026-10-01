package org.xutils.db.converter;

import android.database.Cursor;
import org.xutils.db.sqlite.ColumnDbType;

public class CharColumnConverter implements ColumnConverter<Character> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public Character getFieldValue(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Character.valueOf((char) cursor.getInt(i));
    }

    @Override
    public Object fieldValue2DbValue(Character ch) {
        if (ch == null) {
            return null;
        }
        return Integer.valueOf(ch.charValue());
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }
}
