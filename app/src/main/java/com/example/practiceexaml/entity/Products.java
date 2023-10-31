package com.example.practiceexaml.entity;

public class Products {
    private  int ProductID;
    private  String ProductName;

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Products(int productID, String productName) {
        ProductID = productID;
        ProductName = productName;
    }
}
