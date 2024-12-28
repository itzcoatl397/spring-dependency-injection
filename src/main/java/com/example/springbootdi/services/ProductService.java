package com.example.springbootdi.services;

import com.example.springbootdi.models.Product;
import com.example.springbootdi.repository.ProductRepository;

import  java.util.List;
import java.util.stream.Collectors;

public class ProductService {


    private final ProductRepository productRepository = new ProductRepository();

    public  List<Product> findAll(){
            return  productRepository.findAll().stream().map(
                    p-> {
                        Double priceImp = p.getPrice() * .16;
                        priceImp+= p.getPrice();
                        Product product = (Product) p.clone();
                        product.setPrice(priceImp.longValue());

                        return product ;
                    }
            ).collect(Collectors.toList());
    }

    public Product findById(Long id){
        return productRepository.findById(id);
    }

}
