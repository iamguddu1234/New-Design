package com.example.new_pages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Useful_Link extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useful_link);

        RecyclerView rv1 = findViewById(R.id.rv_usefulLink);
        rv1.setHasFixedSize(true);
        rv1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<usefulLink_model> models = new ArrayList<>();
        models.add(new usefulLink_model("How Electricity Work ?", "Sometimes, the electrons in an atom's outermost shells do not have a strong force of attraction to the protons."));
        models.add(new usefulLink_model("How Electricity Work ?", "Sometimes, the electrons in an atom's outermost shells do not have a strong force of attraction to the protons."));
        models.add(new usefulLink_model("How Electricity Work ?", "Sometimes, the electrons in an atom's outermost shells do not have a strong force of attraction to the protons."));
        models.add(new usefulLink_model("How Electricity Work ?", "Sometimes, the electrons in an atom's outermost shells do not have a strong force of attraction to the protons."));
        models.add(new usefulLink_model("How Electricity Work ?", "Sometimes, the electrons in an atom's outermost shells do not have a strong force of attraction to the protons."));
        models.add(new usefulLink_model("How Electricity Work ?", "Sometimes, the electrons in an atom's outermost shells do not have a strong force of attraction to the protons."));
        models.add(new usefulLink_model("How Electricity Work ?", "Sometimes, the electrons in an atom's outermost shells do not have a strong force of attraction to the protons."));
        models.add(new usefulLink_model("How Electricity Work ?", "Sometimes, the electrons in an atom's outermost shells do not have a strong force of attraction to the protons."));
        models.add(new usefulLink_model("How Electricity Work ?", "Sometimes, the electrons in an atom's outermost shells do not have a strong force of attraction to the protons."));
        models.add(new usefulLink_model("How Electricity Work ?", "Sometimes, the electrons in an atom's outermost shells do not have a strong force of attraction to the protons."));
        models.add(new usefulLink_model("How Electricity Work ?", "Sometimes, the electrons in an atom's outermost shells do not have a strong force of attraction to the protons."));
        models.add(new usefulLink_model("How Electricity Work ?", "Sometimes, the electrons in an atom's outermost shells do not have a strong force of attraction to the protons."));
        models.add(new usefulLink_model("How Electricity Work ?", "Sometimes, the electrons in an atom's outermost shells do not have a strong force of attraction to the protons."));

        UsefulLink_adapter usefulLink_adapter = new UsefulLink_adapter(models, this);
        rv1.setAdapter(usefulLink_adapter);


        CardView cardView = findViewById(R.id.addLinkButton);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Useful_Link_form useful_link_form = new Useful_Link_form();
                useful_link_form.show(getSupportFragmentManager(), useful_link_form.getTag());
            }
        });

    }
}