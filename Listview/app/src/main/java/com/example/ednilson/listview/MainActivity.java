package com.example.ednilson.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaView;
    private String[] itens = {"{Manaus","{Manaus","{Manaus","{Manaus",
            "{Manaus","{Manaus","{Manaus","{Manaus","{Manaus",};

    private Button btndialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaView = (ListView) findViewById(R.id.listviewid);

        btndialog = (Button) findViewById(R.id.btnDiaid);

        ArrayAdapter<String> adaptador = new  ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );


        listaView.setAdapter(adaptador);

        listaView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                int codigo = position;
                String valorC = (String) listaView.getItemAtPosition(codigo);
                Toast.makeText(getApplicationContext(),valorC,Toast.LENGTH_LONG).show();
            }
        });


        btndialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,DialogActivity.class));
            }
        });


    }
}
