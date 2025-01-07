package com.example.springbootdi.repository;


import com.example.springbootdi.models.Product;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryJson implements  IProductRepository {

    private List<Product> products;

    public ProductRepositoryJson() throws IOException {

        Resource resource = new ClassPathResource("products.json");

        ObjectMapper objectMapper = new ObjectMapper();



            products =  new ArrayList<>(List.of(objectMapper.readValue(resource.getFile(),Product[].class)));





    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(Long id) {
        return  products.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);
    }
}
