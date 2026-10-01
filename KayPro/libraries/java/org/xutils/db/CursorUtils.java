package org.xutils.db;

import android.database.Cursor;
import java.util.LinkedHashMap;
import org.xutils.db.table.ColumnEntity;
import org.xutils.db.table.DbModel;
import org.xutils.db.table.TableEntity;

final class CursorUtils {
    CursorUtils() {
    }

    public static <T> T getEntity(TableEntity<T> tableEntity, Cursor cursor) throws Throwable {
        T tCreateEntity = tableEntity.createEntity();
        LinkedHashMap<String, ColumnEntity> columnMap = tableEntity.getColumnMap();
        int columnCount = cursor.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            ColumnEntity columnEntity = columnMap.get(cursor.getColumnName(i));
            if (columnEntity != null) {
                columnEntity.setValueFromCursor(tCreateEntity, cursor, i);
            }
        }
        return tCreateEntity;
    }

    public static DbModel getDbModel(Cursor cursor) {
        DbModel dbModel = new DbModel();
        int columnCount = cursor.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            dbModel.m9073add(cursor.getColumnName(i), cursor.getString(i));
        }
        return dbModel;
    }
}
