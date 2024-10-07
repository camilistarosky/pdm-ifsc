package com.example.planetas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PlanetaAdapter extends ArrayAdapter {

    Context mContext;
    Integer mResouse;
    List mListPlaneta;

    public PlanetaAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        mContext = context;
        mResouse = resource;
        mListPlaneta = objects;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view  = layoutInflater.inflate(mResouse, parent, false);
        TextView tv = view.findViewById(R.id.textView);
        tv.setText("PlanetaQualquer");
        // SPlaneta p = getItem(position);
        return view;
    }
}
