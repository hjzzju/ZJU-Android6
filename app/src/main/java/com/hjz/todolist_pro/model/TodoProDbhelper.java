package com.hjz.todolist_pro.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TodoProDbhelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "todo.db";
    private static final int DB_VERSION = 2;

    public TodoProDbhelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TodoProContract.SQL_CREATE_NOTES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        for (int j = i; i < i1; j++) {
            switch (j) {
                case 1:
                    sqLiteDatabase.execSQL(TodoProContract.SQL_ADD_PRIORITY_COLUMN);
                    break;
            }
        }
    }
}
