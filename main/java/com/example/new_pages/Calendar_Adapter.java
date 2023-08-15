package com.example.new_pages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Calendar_Adapter extends RecyclerView.Adapter<Calendar_Adapter.Viewholder> {

    private List<Model> models;
    Context context;

    public Calendar_Adapter(List<Model> models) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.calendar_view2, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.textView.setText(models.get(position).getTitle());
        holder.t1.setText(models.get(position).getT1());
        holder.t2.setText(models.get(position).getT2());
        holder.t3.setText(models.get(position).getT3());
        holder.t4.setText(models.get(position).getT4());
        holder.t5.setText(models.get(position).getT5());
        holder.t6.setText(models.get(position).getT6());
        holder.t7.setText(models.get(position).getT7());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder {

        TextView textView;
        TextView t1;
        TextView t2;
        TextView t3;
        TextView t4;
        TextView t5;
        TextView t6;
        TextView t7;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.title);
            t1 = itemView.findViewById(R.id.t1);
            t2 = itemView.findViewById(R.id.t2);
            t3 = itemView.findViewById(R.id.t3);
            t4 = itemView.findViewById(R.id.t4);
            t5 = itemView.findViewById(R.id.t5);
            t6 = itemView.findViewById(R.id.t6);
            t7 = itemView.findViewById(R.id.t7);
        }
    }
}
