package com.karan.springCrud.controller;


import com.karan.springCrud.entity.Product;
import com.karan.springCrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
@Autowired
private ProductService productService;

@PostMapping("/addProduct")
public Product addProduct(@RequestBody  Product product){
    return  productService.saveProduct(product);
}
@PostMapping("/addAllProducts")
    public List<Product> addProducts(@RequestBody  List<Product> products){
        return  productService.saveProducts(products);
    }

    @GetMapping("/getProducts")
    public  List<Product> findAllProduct(){
return  productService.getProducts();
    }

    @GetMapping("/getProductById/{id}")
    public  Product findAllProducts(@PathVariable int id){
        return  productService.getProductsById(id);
    }
/*
    @GetMapping("/getProductsByName/{name}")
    public  Product findAllProducts(@PathVariable String  name){
        return  productService.getProductsByName(name);
    }*/

@DeleteMapping("/deleteById/{id}")
    public  String deleteProduct(@PathVariable int id){
      productService.deleteProduct(id);
    return "Product delete "+id; }


@PutMapping("/update")
    public  Product updateProduct(@RequestBody Product product){
    return  productService.updateProduct(product);
    }




}
