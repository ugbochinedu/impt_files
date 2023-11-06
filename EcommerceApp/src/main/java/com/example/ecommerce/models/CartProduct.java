package com.example.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class CartProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    @ManyToOne
    private Cart cart;
    private String productName;
    private Integer quantity;
    private BigDecimal pricePerUnit;
    @Enumerated(EnumType.STRING)
    private Category category;
    private BigDecimal totalPrice;
}
