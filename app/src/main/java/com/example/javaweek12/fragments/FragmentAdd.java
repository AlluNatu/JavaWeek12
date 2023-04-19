package com.example.javaweek12.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.javaweek12.Product;
import com.example.javaweek12.ProductStorage;
import com.example.javaweek12.R;

public class FragmentAdd extends Fragment {

    private Button button;

    private CheckBox cB;

    private EditText productName;

    private EditText productInfo;

    private ProductStorage storage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);
        productName = view.findViewById(R.id.editProductName);
        productInfo = view.findViewById(R.id.editProductInfo);
        cB = view.findViewById(R.id.importantCheck);
        storage = ProductStorage.getInstance();
        button = view.findViewById(R.id.addProductBt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addProduct();
            }
        });



        return view;
    }

    private void addProduct(){
        if (cB.isChecked()){
            Product product2 = new Product(productName.getText().toString(), productInfo.getText().toString(), cB.isChecked());
            storage.addImportant(product2);
            storage.addProduct(product2);
        } else {
            Product product = new Product(productName.getText().toString(), productInfo.getText().toString(), cB.isChecked());
            storage.addProduct(product);

        }
        FragmentList.adapter.notifyDataSetChanged();
        FragmentStatic.adapter.notifyDataSetChanged();

    }
}
