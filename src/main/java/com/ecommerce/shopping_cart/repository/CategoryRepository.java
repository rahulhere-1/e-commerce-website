package com.ecommerce.shopping_cart.repository;

import com.ecommerce.shopping_cart.model.Category;
import com.ecommerce.shopping_cart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    public Category findCategoryByName(String name);

    @Query(" Select productList FROM Category WHERE id = ?1 ")
    public List<Product> findProductListByCategoryId(Long id);

    public Category findCategoryById(Long id);


}
