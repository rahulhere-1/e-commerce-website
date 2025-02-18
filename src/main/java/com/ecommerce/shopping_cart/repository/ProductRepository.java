package com.ecommerce.shopping_cart.repository;

import com.ecommerce.shopping_cart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query( " FROM Product WHERE name LIKE %?1% ")
    public List<Product> getProductListByName(String name);

    public Product getProductById(Long id);

    public List<Product> getProductByBrand(String brand);

}
