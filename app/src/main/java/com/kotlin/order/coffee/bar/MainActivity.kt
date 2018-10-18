package com.kotlin.order.coffee.bar

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_webview.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        miwebView.setBackgroundColor(Color.TRANSPARENT)
        miwebView.settings.javaScriptEnabled =  true
        miwebView.settings.loadsImagesAutomatically = true
        miwebView.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        miwebView.loadUrl("https://www.newhorizons.edu.pe/")

    }

    fun mostrar(view: View) {
        var snack: Snackbar = Snackbar.make(findViewById(R.id.constraintlayout), "no internet",
                Snackbar.LENGTH_LONG).setAction("Retry") {}
        snack.setActionTextColor(Color.RED)
        snack.show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {

            R.id.item1 -> {
                Toast.makeText(this, "le ganamos 3 - 0", Toast.LENGTH_LONG).show()
                return super.onOptionsItemSelected(item)
            }

            R.id.item2 -> {
                Toast.makeText(this, "empate", Toast.LENGTH_LONG).show()
                return super.onOptionsItemSelected(item)
            }


            R.id.item3 -> {
                Toast.makeText(this, "le ganamos 3 - 0", Toast.LENGTH_LONG).show()
                return super.onOptionsItemSelected(item)
            }

            R.id.item4 -> {
                Toast.makeText(this, "le ganamos 3 - 0", Toast.LENGTH_LONG).show()
                return super.onOptionsItemSelected(item)
            }
            else -> return super.onOptionsItemSelected(item)


        }

    }
}