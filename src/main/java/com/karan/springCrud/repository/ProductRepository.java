package com.karan.springCrud.repository;

import com.karan.springCrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
/*
    Product FindByName(String name);
*/
}
