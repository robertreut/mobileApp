package com.example.robert.carpark;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DatabaseHelper  extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "CarPark.db";
    public static final String TABLE_NAME = "Pins";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "Longitude";
    public static final String COL_3 = "Latitude";
    public static final String COL_4 = "Occupied";
    public static final String COL_5 = "Address";
    public static final String COL_6 = "Locality";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        //SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                                                    " Longitude REAL," +
                                                    " Latitude REAL," +
                                                    " Occupied INT," +
                                                    " Address TEXT," +
                                                    " Locality TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        //onCreate(db);
    }

    public boolean insertData(Pin pin){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, pin.getLongitude());
        contentValues.put(COL_3, pin.getLatitude());
        contentValues.put(COL_4, pin.getOccupied());
        contentValues.put(COL_5, pin.getAddress());
        contentValues.put(COL_6, pin.getLocality());
        long result = db.insert(TABLE_NAME,null,contentValues);

        if (result == -1){
            return false;
        }
        return true;

    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME,null);
        return res;
    }
}
