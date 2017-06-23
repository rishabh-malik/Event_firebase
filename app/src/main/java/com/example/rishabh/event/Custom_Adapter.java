package com.example.rishabh.event;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rishabh on 21-06-2017.
 */

class Custom_Adapter extends ArrayAdapter<String> {

    Custom_Adapter(Context context, String[] foods) {
        super(context,R.layout.custom_row, foods);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater myInflater= LayoutInflater.from(getContext());
        View customView=myInflater.inflate(R.layout.custom_row,parent,false);

        //getting references
        String singleEventItem=getItem(position);
        TextView myTxt=(TextView)customView.findViewById(R.id.textView);


        myTxt.setText(singleEventItem);


        return customView;
    }
}