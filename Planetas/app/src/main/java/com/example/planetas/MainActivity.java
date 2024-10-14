package com.example.planetas;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //SQLiteDatabase db;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //db=openOrCreateDatabase("banco", MODE_PRIVATE, null);
        //db.excecSQL("CREATE table pesoas (id int, nome varchar);");

        listView = findViewById(R.id.listView);
        DAOPlaneta dao = new DAOPlaneta();
        PlanetaAdapter planteaAdapter = new PlanetaAdapter(this, R.layout.item_planeta, dao.getPlanetas());
        listView.setAdapter(planteaAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, Integer.toString(position), Toast.LENGTH_LONG).show();

            }
        });
    }
}