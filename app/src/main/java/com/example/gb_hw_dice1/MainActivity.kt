package com.example.gb_hw_dice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gb_hw_dice1.R
import android.media.MediaPlayer
import android.hardware.SensorManager
import android.hardware.SensorEventListener
import android.hardware.SensorEvent
import android.annotation.SuppressLint
import android.hardware.Sensor
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    var dice: ImageView? = null
    var rng = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dice = findViewById(R.id.dice)
        val mp = MediaPlayer.create(this, R.raw.idc)
        val roll = MediaPlayer.create(this, R.raw.roll)
        val sm = getSystemService(SENSOR_SERVICE) as SensorManager
        val sensorShake = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        val se: SensorEventListener = object : SensorEventListener {
            override fun onSensorChanged(sensorEvent: SensorEvent) {
                if (sensorEvent != null) {
                    val x_accl = sensorEvent.values[0]
                    val y_accl = sensorEvent.values[1]
                    val z_accl = sensorEvent.values[2]
                    if (x_accl > 2 || x_accl < -2 || y_accl > 12 || y_accl < -12 || z_accl > 2 || z_accl < -2) {
                        roll.start()
                        idk()
                    }
                }
            }

            override fun onAccuracyChanged(sensor: Sensor, i: Int) {}
        }
        sm.registerListener(se, sensorShake, SensorManager.SENSOR_DELAY_NORMAL)
        dice?.setOnClickListener(View.OnClickListener {
            mp.start()
            idk()
        }
        )
    }

    fun idk() {
        val mh = MediaPlayer.create(this, R.raw.loud)
        val kl = MediaPlayer.create(this, R.raw.cool)
        val num = rng.nextInt(20) + 1
        val text = findViewById<TextView>(R.id.text)
        when (num) {
            1 -> {
                dice!!.setImageResource(R.drawable.dice1)
                text.setPadding(64, 64, 64, 64)
                text.text = "Critical Miss!"
                mh.start()
            }
            2 -> {
                dice!!.setImageResource(R.drawable.dice2)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            3 -> {
                dice!!.setImageResource(R.drawable.dice3)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            4 -> {
                dice!!.setImageResource(R.drawable.dice4)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            5 -> {
                dice!!.setImageResource(R.drawable.dice5)
                text.setPadding(64, 64, 64, 64)
                text.text = "Critical Hit!"
                kl.start()
            }
            6 -> {
                dice!!.setImageResource(R.drawable.dice6)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            7 -> {
                dice!!.setImageResource(R.drawable.dice7)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            8 -> {
                dice!!.setImageResource(R.drawable.dice8)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            9 -> {
                dice!!.setImageResource(R.drawable.dice9)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            10 -> {
                dice!!.setImageResource(R.drawable.dice10)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            11 -> {
                dice!!.setImageResource(R.drawable.dice11)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            12 -> {
                dice!!.setImageResource(R.drawable.dice12)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            13 -> {
                dice!!.setImageResource(R.drawable.dice13)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            14 -> {
                dice!!.setImageResource(R.drawable.dice14)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            15 -> {
                dice!!.setImageResource(R.drawable.dice15)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            16 -> {
                dice!!.setImageResource(R.drawable.dice16)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            17 -> {
                dice!!.setImageResource(R.drawable.dice17)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            18 -> {
                dice!!.setImageResource(R.drawable.dice18)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            19 -> {
                dice!!.setImageResource(R.drawable.dice19)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
            20 -> {
                dice!!.setImageResource(R.drawable.dice20)
                text.setPadding(0, 0, 0, 0)
                text.text = ""
            }
        }
    }
}