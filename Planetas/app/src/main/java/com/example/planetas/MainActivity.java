package com.example.planetas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);

        //PlanetaAdapter planteaAdapter = new PlanetaAdapter(this, R.layout.item_planeta, DAOPlaneta.get)
       // listView.setAdapter();
    }
}