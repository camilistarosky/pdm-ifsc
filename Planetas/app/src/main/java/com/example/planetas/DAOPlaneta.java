package com.example.planetas;

import java.util.ArrayList;

public class DAOPlaneta {
    ArrayList<Planeta> planetas;

    public DAOPlaneta(){
        planetas = new ArrayList<>();
        planetas.add(new Planeta("Saturno", R.drawable.saturn));
        planetas.add(new Planeta("Urano", R.drawable.uranus));
        planetas.add(new Planeta("Netuno", R.drawable.neptune));
        planetas.add(new Planeta("Sol", R.drawable.sun));
        planetas.add(new Planeta("mercurio", R.drawable.mercury));
        planetas.add(new Planeta("Vênus", R.drawable.venus));
        planetas.add(new Planeta("Terra", R.drawable.earth));
    }
    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }
}
