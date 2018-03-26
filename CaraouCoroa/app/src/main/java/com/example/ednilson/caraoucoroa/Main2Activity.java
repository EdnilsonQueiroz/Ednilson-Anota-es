package com.example.ednilson.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    private ImageView btnvoltar;
    private ImageView moeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnvoltar = (ImageView) findViewById(R.id.btnvoltarid);
        moeda = (ImageView) findViewById(R.id.moedaid);

        Bundle extra = getIntent().getExtras();

        if (extra != null){
            String opcapEscolhida = extra.getString("opcao");
            if (opcapEscolhida.equals("cara")){
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else {
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }

        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
            }
        });
    }
}
