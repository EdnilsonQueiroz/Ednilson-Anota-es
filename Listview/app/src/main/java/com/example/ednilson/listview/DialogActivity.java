package com.example.ednilson.listview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {

    private Button btnDia;
    private AlertDialog.Builder dialog;
    private Button btnChek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        btnDia = (Button) findViewById(R.id.btnDiaid);
        btnChek = (Button) findViewById(R.id.btnChekid);

        btnDia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog = new AlertDialog.Builder(DialogActivity.this);

                dialog.setTitle("Titulo da DiaLog");
                dialog.setMessage("Mensagem da Dialog");

                dialog.setCancelable(false);

                dialog.setIcon(android.R.drawable.ic_dialog_alert);

                dialog.setNegativeButton("Nao",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(DialogActivity.this, "pressionado o botão nao", Toast.LENGTH_LONG).show();
                            }
                        });
                dialog.setPositiveButton("sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(DialogActivity.this, "pressionado o botão sim", Toast.LENGTH_LONG).show();
                            }
                        });

                dialog.create();
                dialog.show();
            }
        });

        btnChek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DialogActivity.this,CheckActivity.class));
            }
        });



    }
}
