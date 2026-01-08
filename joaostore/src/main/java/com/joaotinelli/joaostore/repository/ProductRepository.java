package com.joaotinelli.joaostore.repository;

import com.joaotinelli.joaostore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
