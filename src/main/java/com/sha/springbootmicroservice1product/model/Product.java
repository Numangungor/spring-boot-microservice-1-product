package com.sha.springbootmicroservice1product.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name="name",length=100,nullable=false)
    private String name;

    @Column(name="price")
     private Double price;

    @Column(name="create_time",nullable = false)
    private LocalDateTime createTime;
}
