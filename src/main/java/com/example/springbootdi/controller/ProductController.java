package com.example.springbootdi.controller;

import com.example.springbootdi.models.Product;
import com.example.springbootdi.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")


public class ProductController {

    private   ProductService productService = new ProductService();


    @GetMapping
    public List<Product> list() {


        return productService.findAll();
    }
    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {



        return productService.findById(id);
    }

}
