package com.example.ednilson.sharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private Button btn;
    private TextView txt;

    private static final String ARQUIVO_PREFERENCIA   = "ArquivoEdnilson";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.nomeId);
        btn =(Button) findViewById(R.id.btnId);
        txt = (TextView) findViewById(R.id.txtId);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
                SharedPreferences.Editor editor= sharedPreferences.edit();

                    if (nome.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Por Favor digite seu nome.",Toast.LENGTH_LONG).show();
                    }else {
                        editor.putString("nome", nome.getText().toString());
                        editor.commit();
                        txt.setText("Ola, " + nome.getText().toString());

                    }
            }
        });

        //Recuperar texto salvo
        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
        if (sharedPreferences.contains("nome")){
            String nomeUsuario = sharedPreferences.getString("nome", "Usuario nao definido");
            txt.setText("Ola," + nomeUsuario);
        }else {
            txt.setText("Ola, Usuario não definido");
        }

    }
}
