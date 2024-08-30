package com.github.caroltmaciel.ecommerce.repositories;

import com.github.caroltmaciel.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}