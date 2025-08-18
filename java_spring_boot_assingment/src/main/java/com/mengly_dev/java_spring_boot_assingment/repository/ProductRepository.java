package com.mengly_dev.java_spring_boot_assingment.repository;

import com.mengly_dev.java_spring_boot_assingment.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
