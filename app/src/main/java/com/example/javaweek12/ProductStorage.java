package com.example.javaweek12;

import android.text.Editable;

import java.util.ArrayList;

public class ProductStorage {
    private ArrayList<Product> products = new ArrayList<>();

    private ArrayList<Product> importants = new ArrayList<>();
    private static ProductStorage storage = null;

    private ProductStorage(){

    }

    public static ProductStorage getInstance(){
        if (storage == null){
            storage = new ProductStorage();
        }
        return storage;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addImportant(Product product) {
        importants.add(product);
    }

    public ArrayList<Product> getProducts() {return products; }

    public ArrayList<Product> getImportants() {return importants; }


    public void removeProduct(String id) {
        int i = 0;
        for (Product p : products){
            if (p.getId().equals(id)) {
                break;
            }
            i++;
        }
        products.remove(i);
    }

    public Product getProductById(int id) {
        return products.get(id);
    }


}
