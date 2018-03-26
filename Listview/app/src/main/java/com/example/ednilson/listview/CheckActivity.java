package com.example.ednilson.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckActivity extends AppCompatActivity {

    private CheckBox checkcachorro;
    private CheckBox checkgat;
    private CheckBox checkgalinha;
    private Button btn;
    private TextView monstra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        checkcachorro = (CheckBox) findViewById(R.id.checkcachorroid);
        checkgat = (CheckBox) findViewById(R.id.checkgatoid);
        checkgalinha = (CheckBox) findViewById(R.id.checkgalinhaid);
        btn = (Button)findViewById(R.id.btnChekid);
        monstra = (TextView) findViewById(R.id.monstraid);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itensSelecionados = "";

                itensSelecionados += "Item:"+ checkcachorro.getText() +"Status: "+checkcachorro.isChecked() + "/n";
                itensSelecionados +="Item:"+ checkgat.getText()+"Status: "+checkgat.isChecked() + "/n";
                itensSelecionados +="Item:"+ checkgalinha.getText()+"Status: "+checkgalinha.isChecked()+ "/n";
            }
        });



    }
}
