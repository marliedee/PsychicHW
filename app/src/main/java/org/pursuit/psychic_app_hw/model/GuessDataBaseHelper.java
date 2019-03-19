package org.pursuit.psychic_app_hw.model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import java.util.ArrayList;
import java.util.List;

public class GuessDataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "psychic.db";
    private static final String TABLE_NAME = "psychic";

    public GuessDataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE " + TABLE_NAME +
                        " (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "right Integer, wrong Integer);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //not in use.
    }

    public boolean addGuess(Guess guess) {
        Cursor cursor = getReadableDatabase().rawQuery(
                "SELECT * FROM " + TABLE_NAME + " WHERE right = '" + guess.getRight() +
                        "' AND wrong = '" + guess.getWrong() +
                        "';", null);
        if (cursor.getCount() == 0) {
            getWritableDatabase().execSQL("INSERT INTO " + TABLE_NAME +
                    "(right, wrong) VALUES('" +
                    guess.getRight() + "', '" +
                    guess.getWrong() + "',");
        }
        cursor.close();
    return true;
}

    public List<Guess> getGuessList() {
        List<Guess> guessList = new ArrayList<>();
        Cursor cursor = getReadableDatabase().rawQuery(
                "SELECT * FROM " + TABLE_NAME + ";", null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                do {
                    Guess guess = new Guess(
                            cursor.getInt(cursor.getColumnIndex("right")),
                            cursor.getInt(cursor.getColumnIndex("wrong")));
                    guessList.add(guess);
                } while (cursor.moveToNext());
            }
        }
        return guessList;
    }
}


