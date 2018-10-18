package com.example.jc.miprimeraaplicacion

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.TaskStackBuilder
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.view.View

class NotificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
    }

    fun actualizar(view: View){
        val id = "mi_canal_01"
        val nombre = getString(R.string.abc_action_bar_home_description)
        val descripcion = getString(R.string.abc_action_bar_home_description)
        val importancia = NotificationManager.IMPORTANCE_HIGH
        val canal = NotificationChannel(id, nombre, importancia)
        canal.description = descripcion

        val builderNot = NotificationCompat.Builder(
                this, id )
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Mi Notification")
                .setContentText("Mi Mensaje")

        val intentResultado = Intent(this, NotificationActivity::class.java)
        val resultadoPila = TaskStackBuilder.create(this)

    }
}
