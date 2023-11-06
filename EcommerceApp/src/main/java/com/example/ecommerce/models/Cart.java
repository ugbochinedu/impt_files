package com.example.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Cart {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @OneToMany(mappedBy="cart")
   private List<CartProduct> cartProducts = new ArrayList<>();

}
