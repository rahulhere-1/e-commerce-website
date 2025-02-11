package com.ecommerce.shopping_cart.repository;

import com.ecommerce.shopping_cart.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

    public Category findCategoryByName(String name);


}
