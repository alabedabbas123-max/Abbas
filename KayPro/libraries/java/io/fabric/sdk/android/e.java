package io.fabric.sdk.android;

class e extends android.content.ContextWrapper {
    private final java.lang.String DW;
    private final java.lang.String j6;

    public e(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
        super(r1);
        this.DW = r2;
        this.j6 = r3;
    }

    @Override
    public java.io.File getCacheDir() {
        return new java.io.File(super.getCacheDir(), this.j6);
    }

    @Override
    public java.io.File getDatabasePath(java.lang.String r4) {
        java.io.File r0 = new java.io.File(super.getDatabasePath(r4).getParentFile(), this.j6);
        r0.mkdirs();
        return new java.io.File(r0, r4);
    }

    @Override
    @android.annotation.TargetApi(8)
    public java.io.File getExternalCacheDir() {
        return new java.io.File(super.getExternalCacheDir(), this.j6);
    }

    @Override
    @android.annotation.TargetApi(8)
    public java.io.File getExternalFilesDir(java.lang.String r3) {
        return new java.io.File(super.getExternalFilesDir(r3), this.j6);
    }

    @Override
    public java.io.File getFilesDir() {
        return new java.io.File(super.getFilesDir(), this.j6);
    }

    @Override
    public android.content.SharedPreferences getSharedPreferences(java.lang.String r3, int r4) {
        return super.getSharedPreferences(this.DW + ":" + r3, r4);
    }

    @Override
    public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String r1, int r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3) {
        return android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(getDatabasePath(r1), r3);
    }

    @Override
    @android.annotation.TargetApi(11)
    public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String r1, int r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3, android.database.DatabaseErrorHandler r4) {
        return android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(getDatabasePath(r1).getPath(), r3, r4);
    }
}
