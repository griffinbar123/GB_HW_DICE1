package com.example.gb_hw_dice1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView dice;
    Random rng =new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dice = findViewById(R.id.dice);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.idc);
        MediaPlayer roll = MediaPlayer.create(this, R.raw.roll);

        SensorManager sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor sensorShake = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        SensorEventListener se = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if (sensorEvent !=null){
                    float x_accl = sensorEvent.values[0];
                    float y_accl = sensorEvent.values[1];
                    float z_accl = sensorEvent.values[2];
                     if(x_accl>2||x_accl<-2 || y_accl>12||y_accl<-12 || z_accl>2||z_accl<-2 ){
                        roll.start();
                        idk();
                     }
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
        sm.registerListener(se, sensorShake, SensorManager.SENSOR_DELAY_NORMAL);

        dice.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                mp.start();
                idk();
            }
        }
        );
    }
    public void idk(){
        MediaPlayer mh = MediaPlayer.create(this, R.raw.loud);
        MediaPlayer kl = MediaPlayer.create(this, R.raw.cool);
        int num = rng.nextInt(20)+1;
        TextView text = findViewById(R.id.text);
        switch(num){
            case 1:
                dice.setImageResource(R.drawable.dice1);
                text.setPadding(64,64, 64,64 );
                text.setText("Critical Miss!");
                mh.start();
                break;
            case 2:
                dice.setImageResource(R.drawable.dice2);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 3:
                dice.setImageResource(R.drawable.dice3);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 4:
                dice.setImageResource(R.drawable.dice4);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 5:
                dice.setImageResource(R.drawable.dice5);
                text.setPadding(64,64, 64,64 );
                text.setText("Critical Hit!");
                kl.start();
                break;
            case 6:
                dice.setImageResource(R.drawable.dice6);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 7:
                dice.setImageResource(R.drawable.dice7);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 8:
                dice.setImageResource(R.drawable.dice8);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 9:
                dice.setImageResource(R.drawable.dice9);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 10:
                dice.setImageResource(R.drawable.dice10);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 11:
                dice.setImageResource(R.drawable.dice11);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 12:
                dice.setImageResource(R.drawable.dice12);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 13:
                dice.setImageResource(R.drawable.dice13);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 14:
                dice.setImageResource(R.drawable.dice14);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 15:
                dice.setImageResource(R.drawable.dice15);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 16:
                dice.setImageResource(R.drawable.dice16);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 17:
                dice.setImageResource(R.drawable.dice17);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 18:
                dice.setImageResource(R.drawable.dice18);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 19:
                dice.setImageResource(R.drawable.dice19);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
            case 20:
                dice.setImageResource(R.drawable.dice20);
                text.setPadding(0,0, 0,0 );
                text.setText("");
                break;
        }
    }
}