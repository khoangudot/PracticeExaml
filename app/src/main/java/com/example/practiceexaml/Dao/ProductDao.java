package com.example.practiceexaml.Dao;

import com.example.practiceexaml.entity.Products;

import java.util.List;

public interface ProductDao {
    void  add(Products products);
    List<Products>getProducts();
    Products getProducts(int ProductID);

    void  update(Products products);
    void  delete(int ProductID);
    
}
