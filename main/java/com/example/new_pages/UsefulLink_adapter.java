package com.example.new_pages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UsefulLink_adapter extends RecyclerView.Adapter<UsefulLink_adapter.Viewholder> {

    private List<usefulLink_model> models;
    Context context;

    public UsefulLink_adapter(List<usefulLink_model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.useful_link_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        holder.TitleTextView.setText(models.get(position).getTitle());
        holder.SubtitleTextView.setText(models.get(position).getDetails());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        TextView TitleTextView;
        TextView SubtitleTextView;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            TitleTextView = itemView.findViewById(R.id.title);
            SubtitleTextView = itemView.findViewById(R.id.detail);
        }
    }
}
