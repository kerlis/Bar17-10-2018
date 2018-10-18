package com.kotlin.order.coffee.bar

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Context
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.NotificationCompat
import android.view.View

class Notification : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
    }


    @RequiresApi(Build.VERSION_CODES.O)

    fun actualizar(view: View){

        var id = "mi canal"
        val nombre = getString(R.string.abc_action_bar_home_description)
        val descripcion = getString(R.string.abc_action_bar_home_description)
        val importancia = NotificationManager.IMPORTANCE_HIGH

        val  canal = NotificationChannel(id, nombre, importancia)



        val canal_id = "mi_canal_01"

        val buildderNot =  NotificationCompat.Builder(
                this, canal_id)
                .setSmallIcon(R.drawable.notification_action_background)
                .setContentTitle("mis notificaciones")
                .setContentText("veri  ficar mis notificaciones")

        val intentresultado = Intent(this, activity_resultado::class.java)

        val resultadoPila = TaskStackBuilder.create(this)

        resultadoPila.addNextIntent(intentresultado)
        val pendingIntentresultado = resultadoPila.getPendingIntent(0, PendingIntent.FLAG_CANCEL_CURRENT)

        buildderNot.setContentIntent(pendingIntentresultado)
        val administradornot = getSystemService(
                Context.NOTIFICATION_SERVICE) as NotificationManager
        administradornot.notify(1, buildderNot.build())
administradornot.createNotificationChannel(canal)

    }

}
