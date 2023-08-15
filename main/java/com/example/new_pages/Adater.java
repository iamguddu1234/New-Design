package com.example.new_pages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adater extends RecyclerView.Adapter<Adater.Viewholder> {

    private List<model> model;

    public Adater(List<com.example.new_pages.model> model) {
        this.model = model;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_detail_rec, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        Context context = holder.itemView.getContext();
        Glide.with(context).load(model.get(position).getImg()).into(holder.imageView);
        holder.name.setText(model.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name);
        }
    }
}
