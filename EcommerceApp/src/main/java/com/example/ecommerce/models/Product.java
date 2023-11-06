package com.example.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer quantity;
    private String ProductName;
    private BigDecimal price;
//    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @Enumerated(EnumType.STRING)
    private Category category;
}
