package com.example.ednilson.preferenciacores;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

        private RadioGroup radiogroup;
        private RadioButton radioButtonSlecionado;
        private Button btn;
        private ConstraintLayout lay;

        private static final String ARQUIVO_PREFERENCIA = "ArqProferencias";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiogroup = (RadioGroup) findViewById(R.id.radioId);
        btn = (Button) findViewById(R.id.btnId);
        lay = (ConstraintLayout) findViewById(R.id.layoutId);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idradioEscolhido = radiogroup.getCheckedRadioButtonId();


                if (idradioEscolhido>0){
                    radioButtonSlecionado =(RadioButton) findViewById(idradioEscolhido);

                    SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA,0);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    String corEscolhida = radioButtonSlecionado.getText().toString();
                    editor.putString("corEscolhida", corEscolhida);
                    editor.commit();

                    getBackground(corEscolhida);


                }
            }


        });
        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA,0);
        if (sharedPreferences.contains("corEscolhida")){
            String corRecuperada = sharedPreferences.getString("corEscolhida","Laranja");
            getBackground(corRecuperada);
        }
    }

    private void getBackground(String cor){
        if(cor.equals("Azul")){
            lay.setBackgroundColor(Color.parseColor("#495b7c"));
        }else if (cor.equals("laranja")){
            lay.setBackgroundColor(Color.parseColor("#ffce26"));
        }else if (cor.equals("Verde")){
            lay.setBackgroundColor(Color.parseColor("#009670"));
        }
    }
}
