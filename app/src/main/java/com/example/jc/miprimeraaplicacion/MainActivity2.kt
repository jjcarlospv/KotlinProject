package com.example.jc.miprimeraaplicacion

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_2.*
import java.util.HashMap
import java.util.stream.Collectors


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

        var llParent = findViewById<LinearLayout>(R.id.ll_parent)

        var button = Button(this)
        button.text = "TEST"
        var linearParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)

        button.layoutParams = linearParams
        button.setOnClickListener {

            val mapObj = HashMap<Int, String>()

            mapObj[10] = "casas"
            mapObj[20] = "oficinas"
            mapObj[11] = "salon"
            mapObj[9] = "comedor"
            mapObj[15] = "cocina"

            /*Iterator<Integer> iterator = mapObj.keySet().iterator();
        int key = 0;
        while(iterator.hasNext()){
            key = iterator.next();
            System.out.println(key);
        }*/

            val intLst = mapObj.keys.stream().filter { x -> x > 5 }.sorted{x,y -> x.compareTo (y)}.collect(Collectors.toList())

            Toast.makeText(this, "HELLO", Toast.LENGTH_SHORT).show()
        }
        llParent.addView(button)
    }

    fun eventOrder(view : View){
        if(!(cbMain.isChecked && cbStarter.isChecked)){
            tvResultado.text = "Seleccione un plato"
        }else{
            tvResultado.text = "Selec"
        }

    }
}

