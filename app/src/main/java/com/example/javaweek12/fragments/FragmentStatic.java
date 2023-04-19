package com.example.javaweek12.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.javaweek12.ProductListAdapter;
import com.example.javaweek12.ProductStorage;
import com.example.javaweek12.R;

public class FragmentStatic extends Fragment {


    private ProductStorage storage;

    private RecyclerView recyclerView;

    public static ProductListAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_static, container, false);

        storage = ProductStorage.getInstance();

        recyclerView = view.findViewById(R.id.rvStatic);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new ProductListAdapter(getActivity(), storage.getImportants());
        recyclerView.setAdapter(adapter);



        return view;
    }
}