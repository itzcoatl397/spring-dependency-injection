package com.example.springbootdi.services;

import com.example.springbootdi.models.Product;
import com.example.springbootdi.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import  java.util.List;
import java.util.stream.Collectors;
@Service
public class ProductService implements IProductService  {



    private  IProductRepository productRepository ;

    public ProductService(@Qualifier("productList") IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public  List<Product> findAll(){
        return  productRepository.findAll().stream().map(
                p-> {
                    Double priceImp = p.getPrice() * .16;
                    priceImp+= p.getPrice();
//                    Product product = (Product) p.clone();
//                    product.setPrice(priceImp.longValue());
//
//                    return product ;

                    p.setPrice(priceImp.longValue());
                    return p;

                }
        ).collect(Collectors.toList());
    }
@Override
    public Product findById(Long id){
        return productRepository.findById(id);
    }




}
