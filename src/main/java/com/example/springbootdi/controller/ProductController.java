package com.example.springbootdi.controller;

import com.example.springbootdi.models.Product;
import com.example.springbootdi.services.IProductService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")


public class ProductController {


    private  final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> list() {


        return productService.findAll();
    }
    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {

        return productService.findById(id);
    }


}
