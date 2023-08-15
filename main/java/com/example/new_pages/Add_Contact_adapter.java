package com.example.new_pages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Add_Contact_adapter extends RecyclerView.Adapter<Add_Contact_adapter.Viewholder> {


    private List<model> models;
    Context context;

    public Add_Contact_adapter(List<model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_custom_layout_2,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        holder.imageView.setImageResource(models.get(position).getImgIocn());
        holder.textView.setText(models.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.title);

        }
    }
}
