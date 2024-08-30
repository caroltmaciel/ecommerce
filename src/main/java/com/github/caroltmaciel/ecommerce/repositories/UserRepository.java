package com.github.caroltmaciel.ecommerce.repositories;

import com.github.caroltmaciel.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}