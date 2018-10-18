package com.example.jc.miprimeraaplicacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_progress.*

class ProgressActivity : AppCompatActivity() {

    lateinit var slider: SeekBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)

        var status = 0

        btnDescarga.setOnClickListener { view ->
                Thread(Runnable {
                    while(status< 100){
                        status+= 10
                        try {
                            pbDescarga.progress = status
                            Thread.sleep(500)
                        } catch (e: InterruptedException) {

                        }
                    }

                }).start()
        }

        slider = findViewById(R.id.sbProgress)

        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                    tvProgress.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
     }

        })
    }
}
