package com.example.homework52java3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private AddressAdapter adapter;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recycler_view_addresses);
        ArrayList<String> address = new ArrayList<>();
        address.add("Gagarin str.44");
        address.add("Manas str.12");
        address.add("Wall str.56");
        address.add("Ankara str.34");
        address.add("Tata str.156");
        address.add("Marks str.96");
        address.add("Lenin str.54");
        address.add("Baha str.13");
        address.add("Auezov str.44");
        address.add("Lermontov str.376");
        adapter = new AddressAdapter(address);
        recyclerView.setAdapter(adapter);
    }
}