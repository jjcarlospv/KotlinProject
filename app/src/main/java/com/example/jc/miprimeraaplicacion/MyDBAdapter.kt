package com.example.jc.miprimeraaplicacion

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDBAdapter(context: Context){

    private val nombreBd = "BdPersona"
    private var myContext: Context? = null
    private val mDbHelper: MyDBHelper? = null
}

   class MyDBHelper(context: Context,
                          name : String,
                          factory: SQLiteDatabase.CursorFactory,
                          version: Int) : SQLiteOpenHelper(context, name, factory, version){
       override fun onCreate(db: SQLiteDatabase?) {
            var str = "CREATE TABLE Casa (id primary key autoincrement )"
           db?.execSQL(str)
       }

       override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
           TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
       }

   }
