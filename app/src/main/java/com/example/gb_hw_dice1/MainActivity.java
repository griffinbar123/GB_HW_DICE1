package com.example.gb_hw_dice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView dice;
    Random rng =new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dice = findViewById(R.id.dice);

        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dice_id = R.drawable.dice1 + rng.nextInt(6);
                dice.setImageResource(dice_id);
            }
        }

        );
    }
}