package com.github.caroltmaciel.ecommerce.repositories;

import com.github.caroltmaciel.ecommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}