package com.ecommerce.shopping_cart.repository;

import com.ecommerce.shopping_cart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
