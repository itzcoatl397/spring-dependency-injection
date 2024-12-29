package com.example.springbootdi.services;

import com.example.springbootdi.models.Product;
import com.example.springbootdi.repository.IProductRepository;
import com.example.springbootdi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import  java.util.List;
import java.util.stream.Collectors;
@Service
public class ProductService implements IProductService  {


    @Autowired
    private IProductRepository productRepository ;

@Override
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
@Override
    public Product findById(Long id){
        return productRepository.findById(id);
    }
}
