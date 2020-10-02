package com.example.yasen;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {
    private Button btn;
    private FloatingActionButton play_btn ;
    int i=0;
     MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        play_btn = findViewById(R.id.floatingActionButton);
        final Ayat ayat = new Ayat(this);

        Toast.makeText(MainActivity.this, getResources().getString(R.string.press_to_next), Toast.LENGTH_LONG).show();
        //boton on clock
        View.OnClickListener onClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setText(ayat.getAya(i));
                i++;

            }
        };
        btn.setOnClickListener(onClickListener);

       //blay the sound
        play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(MainActivity.this,ayat.getSound(i));

                mediaPlayer.start();

            }
        });

    }
}
