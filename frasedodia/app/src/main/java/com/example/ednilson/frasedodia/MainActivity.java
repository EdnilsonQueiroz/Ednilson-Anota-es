package com.example.ednilson.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView idtextofrase;
    private Button idfrase;

    private String[] frase ={"Te amo Fabiane","Te amo Leticia","Eu amo Minha Familia"} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idtextofrase = (TextView) findViewById(R.id.idtextofrase);
        idfrase = (Button) findViewById(R.id.idfrase);

        //idtextofrase.setText(frase[0]);
        //setOnClickListener  Evento que dira que o botão vai ter uma acão


        idfrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(3);
                idtextofrase.setText(frase[numeroAleatorio]);
            }
        });



    }
}
