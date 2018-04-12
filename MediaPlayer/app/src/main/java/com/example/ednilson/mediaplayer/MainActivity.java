package com.example.ednilson.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private MediaPlayer musicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnId);
        musicas = MediaPlayer.create(MainActivity.this, R.raw.musica);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (musicas.isPlaying()){
                    tocarMusica();
                }else{
                    pausarMusica();
                }

            }
        });

    }

    private void tocarMusica(){
        if (musicas != null){
            musicas.start();


        }
    }

    private void pausarMusica(){
        if (musicas != null){
            musicas.pause();


        }
    }
}
