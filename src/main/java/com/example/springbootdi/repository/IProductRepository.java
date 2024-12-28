package com.example.springbootdi.repository;

import com.example.springbootdi.models.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> findAll();
    Product findById(Long id);
}
