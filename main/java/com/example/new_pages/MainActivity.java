package com.example.new_pages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void assignmentCard(View view) {
        Intent intent1 = new Intent(MainActivity.this, Assignment_card.class);
        startActivity(intent1);
    }

    public void assignmentform(View view) {
        Assignment_card_form assignment_card_form = new Assignment_card_form();
        assignment_card_form.show(getSupportFragmentManager(), assignment_card_form.getTag());
    }

    public void summary(View view) {
        Summary_fragment fragment1 = new Summary_fragment();
        fragment1.show(getSupportFragmentManager(), fragment1.getTag());
    }

    public void publicProfile(View view) {

        Public_profile public_profile = new Public_profile();
        public_profile.show(getSupportFragmentManager(), public_profile.getTag());
    }

    public void privateProfile(View view) {

        PrivateProfile privateProfile = new PrivateProfile();
        privateProfile.show(getSupportFragmentManager(), privateProfile.getTag());

    }


    public void showBottomSheetDialog() {

        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this);
        bottomSheetDialog.setContentView(R.layout.more_bottomsheet_dialog_box);
        bottomSheetDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        bottomSheetDialog.show();

//        bottomSheetDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        RecyclerView recyclerView = bottomSheetDialog.findViewById(R.id.more_rec);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 4));
        List<model> models = new ArrayList<>();
        models.add(new model("Quick Meeting", R.drawable.quick_meeting));
        models.add(new model("Contacts", R.drawable.contact_icon));
        models.add(new model("Mail", R.drawable.baseline_email_24_dark));
        models.add(new model("Theme", R.drawable.baseline_dark_mode_24_theme));
        models.add(new model("Time Table", R.drawable.baseline_table_chart_24_dark));
        models.add(new model("Useful Link", R.drawable.useful_link));
        models.add(new model("Social Network", R.drawable.social_media));
        models.add(new model("Diary", R.drawable.baseline_book_24));
        models.add(new model("Archived Course", R.drawable.baseline_courses));
        models.add(new model("Setting", R.drawable.baseline_settings_24));
        models.add(new model("Help", R.drawable.baseline_live_help_24_dark));
        models.add(new model("Contact Us", R.drawable.baseline_contact_phone_24));

        More_page_Adapter more_page_adapter = new More_page_Adapter(models, MainActivity.this);

        recyclerView.setAdapter(more_page_adapter);

    }

    public void More(View view) {
        showBottomSheetDialog();
    }

    public void cal(View view) {
        Intent intent = new Intent(MainActivity.this, Calendar.class);
        startActivity(intent);
    }

    public void std(View view) {

        Intent intent = new Intent(MainActivity.this, Student.class);
        startActivity(intent);
    }

    public void vdt(View view) {
        Intent intent = new Intent(MainActivity.this, Video_section.class);
        startActivity(intent);
    }

    public void cfiles(View view) {
        Intent intent = new Intent(MainActivity.this, FIles_secton.class);
        startActivity(intent);
    }

    public void courseCard(View view) {
        Intent intent = new Intent(MainActivity.this, Course_card_activity.class);
        startActivity(intent);
    }

    public void onClickFeed(View view) {
        Intent intent = new Intent(MainActivity.this, Feed.class);
        startActivity(intent);
    }

    public void go_setting(View view) {
        Intent intent = new Intent(MainActivity.this, Setting_Page.class);
        startActivity(intent);
    }
}