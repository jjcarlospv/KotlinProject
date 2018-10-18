package com.example.jc.miprimeraaplicacion

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import java.util.*

class DatePickerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        var c = Calendar.getInstance()
        var dia = c.get(Calendar.DAY_OF_MONTH)
        var mes = c.get(Calendar.MONTH)
        var año = c.get(Calendar.YEAR)

        val timePicker = TimePickerDialog(this,
                TimePickerDialog.OnTimeSetListener{
                TimePicker,  hour, minute ->  },año, mes, true

        )
        timePicker.show()
    }
}
