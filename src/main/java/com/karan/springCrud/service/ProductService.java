package com.karan.springCrud.service;

import com.karan.springCrud.entity.Product;
import com.karan.springCrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return  productRepository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return  productRepository.saveAll(products);
    }
    public List<Product> getProducts(){
        return  productRepository.findAll();
    }
    public Product getProductsById(int id){
        return  productRepository.findById(id).orElse(null);
    }
    /*
    public Product getProductsByName(String  name){
        return  productRepository.FindByName(name);
    }*/
public  String deleteProduct(int id){
        productRepository.deleteById(id);
return  "Product remove from id "+id;
    }


    public  Product updateProduct(Product product){
        Product existing=productRepository.findById(product.getId()).orElse(null);
        existing.setName(product.getName());
        existing.setQuantity(product.getQuantity());
        existing.setPrice(product.getPrice());
        return  productRepository.save(existing);
    }












}
