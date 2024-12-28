package com.example.springbootdi.services;

import com.example.springbootdi.models.Product;
import  java.util.List;
public interface IProductService {
    List<Product> findAll();
    Product findById(Long id);
}
