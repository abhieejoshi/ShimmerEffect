package com.example.abhinav.shimmereffect;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by abhinav on 13/1/18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.SimpleRcViewHolder> {
    @Override
    public SimpleRcViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SimpleRcViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.onerow,parent,false));
    }

    @Override
    public void onBindViewHolder(SimpleRcViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class SimpleRcViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView,textView2,textView3;

        public SimpleRcViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView);

        }


        }
    }

