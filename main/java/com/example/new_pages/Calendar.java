package com.example.new_pages;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.CalendarView;

import java.util.ArrayList;
import java.util.List;

public class Calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        CalendarView view = findViewById(R.id.cal);





        RecyclerView recyclerView = findViewById(R.id.rec_view_cal);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<Model> models = new ArrayList<>();
        models.add(new Model("1 : AM", "", "", "", "", "", "", ""));
        models.add(new Model("2 : AM", "", "", "", "", "", "", ""));
        models.add(new Model("3 : AM", "", "", "", "", "", "", ""));
        models.add(new Model("4 : AM", "", "", "", "", "", "", ""));
        models.add(new Model("5 : AM", "", "", "", "", "", "", ""));
        models.add(new Model("6 : AM", "", "", "", "", "", "", ""));
        models.add(new Model("7 : AM", "", "", "", "", "", "", ""));
        models.add(new Model("8 : AM", "", "", "", "", "", "", ""));
        models.add(new Model("9 : AM", "", "", "", "", "", "", ""));
        models.add(new Model("10 : AM", "", "", "", "", "", "", ""));
        models.add(new Model("11 : AM", "", "", "", "", "", "", ""));
        models.add(new Model("12 : AM", "", "", "", "", "", "", ""));

        models.add(new Model("1 : PM", "", "", "", "", "", "", ""));
        models.add(new Model("2 : PM", "", "", "", "", "", "", ""));
        models.add(new Model("3 : PM", "", "", "", "", "", "", ""));
        models.add(new Model("4 : PM", "", "", "", "", "", "", ""));
        models.add(new Model("5 : PM", "", "", "", "", "", "", ""));
        models.add(new Model("6 : PM", "", "", "", "", "", "", ""));
        models.add(new Model("7 : PM", "", "", "", "", "", "", ""));
        models.add(new Model("8 : PM", "", "", "", "", "", "", ""));
        models.add(new Model("9 : PM", "", "", "", "", "", "", ""));
        models.add(new Model("10 : PM", "", "", "", "", "", "", ""));
        models.add(new Model("11 : PM", "", "", "", "", "", "", ""));
        models.add(new Model("12 : PM", "", "", "", "", "", "", ""));

        Calendar_Adapter calendar_adapter = new Calendar_Adapter(models);
        recyclerView.setAdapter(calendar_adapter);


    }
}