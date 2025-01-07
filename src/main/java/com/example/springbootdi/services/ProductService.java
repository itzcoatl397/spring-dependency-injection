package com.example.springbootdi.services;

import com.example.springbootdi.models.Product;
import com.example.springbootdi.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService implements IProductService {


    private final IProductRepository productRepository;
    private Environment environment;

    @Value("${config.price.task}")
    private Double tax;

    public ProductService(@Qualifier("productList") IProductRepository productRepository, Environment environment) {
        this.productRepository = productRepository;
        this.environment = environment;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll().stream().map(
                p -> {

                    Double priceImp = p.getPrice() * tax;
                    priceImp += p.getPrice();
                    Product product = (Product) p.clone();
                    product.setPrice(priceImp.longValue());

                    return product;


                }
        ).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }


}
