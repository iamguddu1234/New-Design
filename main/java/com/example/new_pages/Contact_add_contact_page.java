package com.example.new_pages;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.new_pages.databinding.FragmentContactAddContactPageBinding;

import java.util.ArrayList;
import java.util.List;

public class Contact_add_contact_page extends Fragment {


    FragmentContactAddContactPageBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentContactAddContactPageBinding.inflate(inflater, container, false);


        binding.addcontactRv.setHasFixedSize(true);
        binding.addcontactRv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        List<model> models = new ArrayList<>();
        models.add(new model("Bibhudutta  Mahakud", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        Add_Contact_adapter contact_adapter = new Add_Contact_adapter(models, this.getContext());
        binding.addcontactRv.setAdapter(contact_adapter);

        return binding.getRoot();
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_contact_add_contact_page, container, false);
    }
}