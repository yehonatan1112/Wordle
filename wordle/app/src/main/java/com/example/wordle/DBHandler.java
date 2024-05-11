package com.example.wordle;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Dictionary;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "Users";

    private static final int DB_VERSION = 1;

    private static final String TABLE_NAME = "myusers1";


    private static final String FNAME_COL = "firstname";


    private static final String EMAIL_COL = "email";


    private static final String PASSWORD_COL = "password";
    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + FNAME_COL + " TEXT,"
                + EMAIL_COL + " TEXT,"
                + PASSWORD_COL + " TEXT)";
        db.execSQL(query);
    }

    public void addNewUser(String firstname, String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(FNAME_COL, firstname);
        values.put(EMAIL_COL, email.toLowerCase());
        values.put(PASSWORD_COL, password);

        db.insert(TABLE_NAME, null, values);

        db.close();
    }
    @SuppressLint("Range")
    public String checkPassword(String email, String name) {
        SQLiteDatabase db = getReadableDatabase();
        String[] projection = {"password"};
        String selection = "email = ? AND firstname = ?";
        String[] selectionArgs = {email, name};

        Cursor cursor = db.query(TABLE_NAME, projection, selection, selectionArgs, null, null, null);
        String savedPassword = "";

        if (cursor != null && cursor.moveToFirst()) {
            savedPassword = cursor.getString(cursor.getColumnIndex("password"));
            cursor.close();
        }

        return savedPassword;
    }

    public void deleteUser(String email, String password) {
        SQLiteDatabase db = getWritableDatabase();
        String whereClause = "email = ? OR password = ?";
        String[] whereArgs = {email, password};

        int rowsDeleted = db.delete(TABLE_NAME, whereClause, whereArgs);
    }
    public void updateUser( String originalUserPassword,String email, String password)  {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(PASSWORD_COL, password);
        db.update(TABLE_NAME,values,"password= ? AND email= ?",new String[]{originalUserPassword,email});
        db.close();
    }

    @SuppressLint("Range")
    public boolean login(String tryfirstname, String trypassword) {
        SQLiteDatabase db = this.getWritableDatabase();
        String[] selections={tryfirstname.toLowerCase(),trypassword};
        Cursor cursor=db.rawQuery("SELECT "+ FNAME_COL+" FROM "+TABLE_NAME+" WHERE firstname= ? AND password= ?",selections);
        cursor.moveToFirst();
        if(cursor.getCount()>0)
        {
            String name=cursor.getString(cursor.getColumnIndex(FNAME_COL));
            if(name.length()==tryfirstname.length())
            {
                cursor.close();
                db.close();
                return true;
            }
        }
            cursor.close();
            db.close();
            return false;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
