package com.example.ednilson.sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {


         SQLiteDatabase bancoDados = openOrCreateDatabase("app",MODE_PRIVATE, null);

        //table

         bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas (id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, idade INTEGER(3) )");

            //bancoDados.execSQL("DROP table pessoas");

        //inserir dados

         bancoDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Ednilson',24)");
         bancoDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Fabiane',26)");

        // recuperar dados

         Cursor cursor = bancoDados.rawQuery("SELECT * FROM pessoas ", null);

         int indiceColunasNome = cursor.getColumnIndex("nome");
         int indiceColunasIdade = cursor.getColumnIndex("idade");
            int indiceColunasId = cursor.getColumnIndex("id");

         cursor.moveToFirst();

         while (cursor != null){

            Log.i("RSULTADO - nome : ",cursor.getString(indiceColunasNome ));
            Log.i("RSULTADO - nome : ",cursor.getString(indiceColunasIdade ));
             Log.i("RSULTADO - nome : ",cursor.getString(indiceColunasId ));

            cursor.moveToNext();
         }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
