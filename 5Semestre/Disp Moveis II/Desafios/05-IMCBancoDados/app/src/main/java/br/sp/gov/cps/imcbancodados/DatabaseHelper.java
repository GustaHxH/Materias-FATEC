package br.sp.gov.cps.imcbancodados;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "imc.db";
    public static final String TABLE_NAME = "usuarios";

    public static final String COL_1 = "ID";
    public static final String COL_2 = "NOME";
    public static final String COL_3 = "IDADE";
    public static final String COL_4 = "ALTURA";
    public static final String COL_5 = "PESO";
    public static final String COL_6 = "IMC";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + TABLE_NAME + " (" +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "NOME TEXT, " +
                "IDADE INTEGER, " +
                "ALTURA REAL, " +
                "PESO REAL, " +
                "IMC REAL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean inserirDados(String nome, int idade,
                                double altura, double peso, double imc) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COL_2, nome);
        values.put(COL_3, idade);
        values.put(COL_4, altura);
        values.put(COL_5, peso);
        values.put(COL_6, imc);

        long resultado = db.insert(TABLE_NAME, null, values);

        db.close();

        return resultado != -1;
    }

    public Cursor consultarDados(String nome) {

        SQLiteDatabase db = this.getReadableDatabase();

        return db.rawQuery(
                "SELECT * FROM " + TABLE_NAME + " WHERE NOME = ?",
                new String[]{nome});
    }

    public boolean atualizarDados(String nome,
                                  int idade,
                                  double altura,
                                  double peso,
                                  double imc) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COL_3, idade);
        values.put(COL_4, altura);
        values.put(COL_5, peso);
        values.put(COL_6, imc);

        int linhas = db.update(
                TABLE_NAME,
                values,
                "NOME = ?",
                new String[]{nome});

        db.close();

        return linhas > 0;
    }

    public boolean deletarDados(String nome) {

        SQLiteDatabase db = this.getWritableDatabase();

        int linhas = db.delete(
                TABLE_NAME,
                "NOME = ?",
                new String[]{nome});

        db.close();

        return linhas > 0;
    }
}