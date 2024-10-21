package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase database;
    EditText editNome, editEmail, editData;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Associar variavis locais a views da interface
        editNome = findViewById(R.id.editNome);
        editEmail = findViewById(R.id.editEmail);
        editData = findViewById(R.id.editData);
        button = findViewById(R.id.buttonCadastrar);

        //defininfo tratamnto para evento e click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = editNome.getText().toString();
                String email = editEmail.getText().toString();
                ContentValues cv = new ContentValues();
                cv.put("nome", nome);
                cv.put("email", email);

                long status = database.insert("pessoas", null, cv);
                if (status>0){
                    Toast.makeText(getApplicationContext(), "Deu boa", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Deu ruim", Toast.LENGTH_LONG).show();
                }

            }
        });

        database = openOrCreateDatabase("meubd", MODE_PRIVATE, null);
        database.execSQL("CREATE TABLE IF NOT EXISTS pessoas (id INTEGER PRIMARY KEY AUTOINCREMENT,nome varchar, email varchar, datanasc Date)");

    }
}