package com.example.chaeyeon.registeration;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LeeHyeokJin on 2017-07-06.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    public ArrayList<String> myValues;
    public RecyclerViewAdapter (ArrayList<String> myValues){
        this.myValues= myValues;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, null);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.myTextView.setText(myValues.get(position));
    }


    @Override
    public int getItemCount() {
        return myValues.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView myTextView;
        public MyViewHolder(View itemView) {
            super(itemView);
            myTextView = (TextView)itemView.findViewById(R.id.text_cardview);
        }
    }
}