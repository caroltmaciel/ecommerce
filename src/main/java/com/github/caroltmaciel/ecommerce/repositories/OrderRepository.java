package com.github.caroltmaciel.ecommerce.repositories;

import com.github.caroltmaciel.ecommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}