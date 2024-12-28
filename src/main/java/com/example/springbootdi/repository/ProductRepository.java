package com.example.springbootdi.repository;

import com.example.springbootdi.models.Product;

import java.util.ArrayList;
import  java.util.List;

public class ProductRepository {

    List<Product> data;

    public ProductRepository() {

        this.data = new ArrayList<>(
                List.of(
                        new Product(1L,"Memoria corsair",500L),
                        new Product(2L,"Monitor",3000L),
                        new Product(3L,"Teclado Razer",700L),
                        new Product(4L,"MotherBoard Gigabyte",490L)

                )
        );


    }
    public List<Product> findAll(){
        return data;
    }

    public Product findById(Long id){
        return data.stream().filter(p->p.getId().equals(id))
                .findFirst().orElseThrow();
    }
}
