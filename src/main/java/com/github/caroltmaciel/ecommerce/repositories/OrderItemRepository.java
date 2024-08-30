package com.github.caroltmaciel.ecommerce.repositories;

import com.github.caroltmaciel.ecommerce.entities.OrderItem;
import com.github.caroltmaciel.ecommerce.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}