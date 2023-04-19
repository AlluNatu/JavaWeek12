package com.example.javaweek12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import java.util.ArrayList;

public class ProductListAdapter extends RecyclerView.Adapter<ProductViewHolder> {


    private Context context;

    private ArrayList<Product> products = new ArrayList<>();

    public ProductListAdapter(Context context, ArrayList<Product> products) {
        this.context = context;
        this.products = products;
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(context).inflate(R.layout.productview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.ProductName.setText(products.get(position).getName());
        holder.ProductInfo.setText(products.get(position).getInfo());
        if(products.get(position).getBoolean() == true){
            holder.productImportant.setVisibility(View.VISIBLE);
        } else{
            holder.productImportant.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return products.size();
    }


}
