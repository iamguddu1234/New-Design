package com.example.new_pages;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class More_page_Adapter extends RecyclerView.Adapter<More_page_Adapter.ViewHolder> {


    private List<model> models;
    Context context;

    public More_page_Adapter(List<model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.more_page_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(models.get(position).getName());
        holder.icon.setImageResource(models.get(position).getImgIocn());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int clickedPosition = holder.getAdapterPosition();

                switch (clickedPosition) {

                    case 0:
                        Dialog dialog = new Dialog(context);
                        dialog.setContentView(R.layout.quick_meeting_dialog);
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        dialog.show();
                        break;

                    case 1:

                        if (context instanceof AppCompatActivity) {


                            Contacts_Page_frag contactsPageFragment = new Contacts_Page_frag();
                            AppCompatActivity activity = (AppCompatActivity) context;
                            FragmentManager fragmentManager = activity.getSupportFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(android.R.id.content, contactsPageFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();


                        }
                        break;

                    case 2:
                        Toast.makeText(context, "Hello From Email", Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        Toast.makeText(context, "Hello From Theme", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(context, "Hello From Time Table", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Intent intent1 = new Intent(context, Useful_Link.class);
                        context.startActivity(intent1);
                        break;

                    case 6:
                        Toast.makeText(context, "Hello From Social Network", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(context, "Hello From Diary", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(context, "Hello From Archived Course", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(context, "Hello From Setting", Toast.LENGTH_SHORT).show();
                        break;

                    case 10:
                        Toast.makeText(context, "Hello From Help", Toast.LENGTH_SHORT).show();
                        break;
                    case 11:
                        Toast.makeText(context, "Hello From Help", Toast.LENGTH_SHORT).show();



                        break;


                }


//                if (position == 0) {
//                    Dialog dialog = new Dialog(context);
//                    dialog.setContentView(R.layout.quick_meeting_dialog);
//                    dialog.show();
//                }
//                if (position == 1) {
//                    Intent intent = new Intent(context,Contacts_Page.class);
//
//                    startActivity(intent);
//                }
//                if (position == 2) {
//                    Toast.makeText(context, "Hello Mail", Toast.LENGTH_LONG).show();
//                }
//                if (position == 3) {
//                    Toast.makeText(context, "Hello theme", Toast.LENGTH_LONG).show();
//                }
//                if (position == 4) {
//                    Toast.makeText(context, "Hello Time Table", Toast.LENGTH_LONG).show();
//                }
//                if (position == 5) {
//                    Toast.makeText(context, "Hello Useful Link", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 6) {
//                    Toast.makeText(context, "Social Network", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 7) {
//                    Toast.makeText(context, "Hello Diary", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 8) {
//                    Toast.makeText(context, "Archived Course", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 9) {
//                    Toast.makeText(context, "Setting", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 10) {
//                    Toast.makeText(context, "Help", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 11) {
//                    Toast.makeText(context, "Contact Us", Toast.LENGTH_SHORT).show();
//                }


            }
        });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView icon;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.icon);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
