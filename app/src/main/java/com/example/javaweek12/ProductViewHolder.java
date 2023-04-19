package com.example.javaweek12;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    TextView ProductName, ProductInfo, productImportant;


    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        ProductName = itemView.findViewById(R.id.textProduct);
        ProductInfo = itemView.findViewById(R.id.textInfo);
        productImportant = itemView.findViewById(R.id.importantTXT);
    }
}
