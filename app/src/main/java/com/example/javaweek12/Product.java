package com.example.javaweek12;

import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

public class Product {

    private Boolean checkbox;
    private String name;
    private String info;

    private String ID;

    public String getName(){
        return name;
    }

    public String getInfo(){
        return info;
    }

    public String getId() {
        return ID;
    }

    public void setProductName(String productName) {
        this.name = productName;
    }

    public void setProductInformation(String productInformation) {
        this.info = productInformation;
    }

    public static Comparator<Product> productComparatorAlpabet = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().compareTo(p2.getName());
        }
    };

    public static Comparator<Product> productComparatorID = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return Integer.parseInt(p1.getId()) - Integer.parseInt(p2.getId());
        }
    };


    public Product (String name, String info, Boolean checkbox){
        this.name = name;
        this.info = info;
        this.checkbox = checkbox;
    }

    public Boolean getBoolean(){
        return checkbox;
    }
}


