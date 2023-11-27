package com.example.mentalhealth.activities

import android.content.Context
import android.database.Cursor
import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        const val DATABASE_NAME = "mental_health.db"
        const val DATABASE_VERSION = 1

        // Cambiados a internal para que puedan ser accesibles desde otras clases en el mismo módulo
        internal const val TABLE_USERS = "users"
        internal const val COLUMN_ID= "id"
        internal const val COLUMN_USERNAME = "username"
        internal const val COLUMN_PASSWORD = "password"


        private const val CREATE_USERS_TABLE =
            "CREATE TABLE $TABLE_USERS ($COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "$COLUMN_USERNAME TEXT, $COLUMN_PASSWORD TEXT)"

    }

    override fun onCreate(db: SQLiteDatabase) {
        // Crear la tabla de usuarios al crear la base de datos
        db.execSQL(CREATE_USERS_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // En caso de actualizaciones futuras de la base de datos
        // Puedes realizar migraciones de datos aquí si es necesario
    }
    fun checkUserCredentials(username: String, password: String): Boolean {
        val db = readableDatabase
        val selection = "$COLUMN_USERNAME = ? AND $COLUMN_PASSWORD = ?"
        val selectionArgs = arrayOf(username, password)
        val cursor: Cursor = db.query(TABLE_USERS, null, selection, selectionArgs, null, null, null)

        val userExists = cursor.moveToFirst()

        cursor.close()
        return userExists
    }
}