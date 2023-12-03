package com.example.mentalhealth.activities

import android.annotation.SuppressLint
import android.content.Context
import android.database.Cursor
import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.util.Calendar
import java.text.SimpleDateFormat
import android.util.Log
import java.util.Locale

class DatabaseHelper(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        const val DATABASE_NAME = "mental_health.db"
        const val DATABASE_VERSION = 6
        // Cambiados a internal para que puedan ser accesibles desde otras clases en el mismo módulo
        internal const val TABLE_USERS = "users"
        private const val COLUMN_ID= "id"
        internal const val COLUMN_FIRST_NAME = "first_name"
        internal const val COLUMN_LAST_NAME = "last_name"
        internal const val COLUMN_USERNAME = "username"
        internal const val COLUMN_PASSWORD = "password"
        internal const val COLUMN_DOB = "dob"
        internal const val COLUMN_DIAG = "diagnostic"
        internal const val TABLE_EVENTS = "events"
        internal const val COLUMN_EVENT_ID = "event_id"
        internal const val COLUMN_EVENT_NAME = "event_name"
        internal const val COLUMN_EVENT_DATE = "event_date"

        private const val CREATE_USERS_TABLE =
            "CREATE TABLE $TABLE_USERS ($COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "$COLUMN_DIAG TEXT, $COLUMN_USERNAME TEXT, $COLUMN_FIRST_NAME TEXT, $COLUMN_LAST_NAME TEXT, $COLUMN_DOB DATE, $COLUMN_PASSWORD TEXT)"

        private const val CREATE_EVENTS_TABLE =
            "CREATE TABLE $TABLE_EVENTS ($COLUMN_EVENT_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "$COLUMN_EVENT_NAME TEXT, $COLUMN_EVENT_DATE TEXT)"

        private val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    }

    override fun onCreate(db: SQLiteDatabase) {
        Log.d("DatabaseHelper", "onCreate: Creating tables")
        db.execSQL(CREATE_USERS_TABLE)
        db.execSQL(CREATE_EVENTS_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        Log.d("DatabaseHelper", "onUpgrade: Upgrading database")
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
    fun insertEvent(eventName: String, eventDate: Calendar): Long {
        val db = writableDatabase
        val values = ContentValues().apply {
            put(COLUMN_EVENT_NAME, eventName)
            put(COLUMN_EVENT_DATE, formatDate(eventDate))
        }
        return db.insert(TABLE_EVENTS, null, values)
    }

    @SuppressLint("Range")
    fun getUpcomingEvents(limit: Int): List<String> {
        val db = readableDatabase
        val currentDate = formatDate(Calendar.getInstance())

        val cursor: Cursor = db.query(
            TABLE_EVENTS,
            null,
            "$COLUMN_EVENT_DATE >= DATE(?)",
            arrayOf(currentDate),
            null,
            null,
            "$COLUMN_EVENT_DATE",
            "$limit"
        )

        val events = mutableListOf<String>()
        while (cursor.moveToNext()) {
            val eventId = cursor.getLong(cursor.getColumnIndex(COLUMN_EVENT_ID))
            val eventName = cursor.getString(cursor.getColumnIndex(COLUMN_EVENT_NAME))
            val eventDate = cursor.getString(cursor.getColumnIndex(COLUMN_EVENT_DATE))
            events.add("ID: $eventId\nEvento: $eventName\nFecha: $eventDate")
        }

        cursor.close()
        return events
    }
private fun formatDate(calendar: Calendar): String {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return dateFormat.format(calendar.time)
            }
    }
