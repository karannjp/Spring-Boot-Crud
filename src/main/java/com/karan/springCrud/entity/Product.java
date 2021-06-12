package com.karan.springCrud.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    private  int id;
    private String name;
    private  int quantity;
    private  double price;


}
