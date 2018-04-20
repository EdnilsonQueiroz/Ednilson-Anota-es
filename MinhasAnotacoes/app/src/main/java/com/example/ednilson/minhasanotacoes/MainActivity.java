package com.example.ednilson.minhasanotacoes;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText texto;
    private ImageView btnSalvar;
    private static final String NOME_ARQUIVO ="anotacao.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (EditText) findViewById(R.id.txtanotarId);
        btnSalvar = (ImageView  ) findViewById(R.id.btnsalvarId);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoDigitado = texto.getText().toString();
                gravarNoArquivo(textoDigitado) ;
                Toast.makeText(MainActivity.this, "Anotações salva", Toast.LENGTH_LONG).show();

            }
        });

        if (lerArquivo() != null) {
            texto.setText(lerArquivo());
        }


    }

    private void gravarNoArquivo(String texto) {

        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput(NOME_ARQUIVO, Context.MODE_APPEND));
            outputStreamWriter.write(texto);
            outputStreamWriter.close();
        }catch (IOException e) {
            Log.v("MainActivity", e.toString());
        }

    }

    private String lerArquivo(){
        String resultado ="";

        try {
            InputStream arquivo = openFileInput(NOME_ARQUIVO);

            if (arquivo != null){
                InputStreamReader inputStreamReader = new InputStreamReader(arquivo);

                BufferedReader bufferedReader =  new BufferedReader(inputStreamReader);

                String linhaArquivo = "";
                while ((linhaArquivo = bufferedReader.readLine() )!= null){
                    resultado += linhaArquivo;
                }

                arquivo.close();
            }

        }catch (IOException e){
            Log.v("MainActivity", e.toString());
        }

        return resultado;

    }
}
