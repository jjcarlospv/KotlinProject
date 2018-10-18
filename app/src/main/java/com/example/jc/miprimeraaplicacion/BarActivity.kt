package com.example.jc.miprimeraaplicacion

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bar.*

class BarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bar)



        miWebView.setBackgroundColor(Color.TRANSPARENT)
        miWebView.settings.javaScriptEnabled = true
        miWebView.settings.loadsImagesAutomatically = true
        miWebView.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        miWebView.loadUrl("https://elcomercio.pe")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when (item?.itemId) {
            R.id.menu_chile -> Snackbar.make(findViewById(R.id.constraintLayout), "Ganamos a CHILE", Snackbar.LENGTH_SHORT)
                    .setAction("Close") {}.setActionTextColor(Color.RED).show()

            R.id.menu_eeuu -> Snackbar.make(findViewById(R.id.constraintLayout), "Ganamos a EEUU", Snackbar.LENGTH_SHORT)
                    .setAction("Close") {}.setActionTextColor(Color.RED).show()

            R.id.menu_ecuador -> Snackbar.make(findViewById(R.id.constraintLayout), "Ganamos a ECUADOR", Snackbar.LENGTH_SHORT)
                    .setAction("Close") {}.setActionTextColor(Color.RED).show()

            R.id.menu_costa_rica -> Snackbar.make(findViewById(R.id.constraintLayout), "Ganamos a COSTA RICA", Snackbar.LENGTH_SHORT)
                    .setAction("Close") {}.setActionTextColor(Color.RED).show()

            else -> Snackbar.make(findViewById(R.id.constraintLayout), "DEFAULT", Snackbar.LENGTH_SHORT)
                    .setAction("Close") {}.setActionTextColor(Color.RED).show()
        }
        return true
    }

    fun mostrar(view: View) {
        var snack: Snackbar = Snackbar.make(findViewById(R.id.constraintLayout), "No internet",
                Snackbar.LENGTH_LONG).setAction("Retry") {
            Toast.makeText(this, "Click", Toast.LENGTH_LONG).show()
        }
        snack.setActionTextColor(Color.BLUE)
        snack.show()
    }
}
