package com.example.springbootdi.repository;

import com.example.springbootdi.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


import java.util.Collections;
import java.util.List;

@Primary
@Repository
public class ProductRepositoryFoo  implements  IProductRepository{

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1L,"Monitor",500L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(id,"Monitor",500L);
    }
}
