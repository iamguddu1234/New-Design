package com.example.new_pages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        RecyclerView rec1 = findViewById(R.id.contact);
        rec1.setHasFixedSize(true);
        rec1.setLayoutManager(new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false));
        List<model> models = new ArrayList<>();
        models.add(new model("https://images.indulgexpress.com/uploads/user/ckeditor_images/article/2019/5/3/The_true_all-rounder.jpg?w=576&dpr=1.0", "AB de Villiers"));
        models.add(new model("https://upload.wikimedia.org/wikipedia/commons/a/a0/Pierre-Person.jpg", "Martin Guptill"));
        models.add(new model("https://engineering.unl.edu/images/staff/Kayla-Person.jpg", "Nancy Phill"));
        models.add(new model("https://business-images.unl.edu/content/bailey-birkholtz1.jpg", "Fin Allen"));
        models.add(new model("https://www.diethelmtravel.com/wp-content/uploads/2016/04/bill-gates-wealthiest-person.jpg", "Bill Gates"));
        models.add(new model("https://upload.wikimedia.org/wikipedia/commons/thumb/5/54/Steve_Jobs.jpg/800px-Steve_Jobs.jpg", "Steve Jobs"));
        Adater a = new Adater(models);
        rec1.setAdapter(a);


        CardView view1 = findViewById(R.id.add_student_card);
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Student.this, Add_student_activity.class);
                startActivity(intent);
            }
        });


    }
}