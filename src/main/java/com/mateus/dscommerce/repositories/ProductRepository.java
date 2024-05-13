package com.mateus.dscommerce.repositories;

import com.mateus.dscommerce.domains.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
