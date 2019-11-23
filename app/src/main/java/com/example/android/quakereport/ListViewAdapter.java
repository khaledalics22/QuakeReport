package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends ArrayAdapter<EarthQuake> {
    public ListViewAdapter(@NonNull Context context, ArrayList<EarthQuake> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView==null)
        {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_view_item,parent,false);
        }
        EarthQuake currQuake= getItem(position);
        TextView tvFelt =(TextView) convertView.findViewById(R.id.tv_felt);
        TextView tvPlace =(TextView)convertView.findViewById(R.id.tv_place);
        TextView tvTime =(TextView)convertView.findViewById(R.id.tv_time);
        tvFelt.setText(String.valueOf(currQuake.getFelt()));
        tvPlace.setText(currQuake.getPlace());
        tvTime.setText(currQuake.getTime());
        return convertView;
    }
}
