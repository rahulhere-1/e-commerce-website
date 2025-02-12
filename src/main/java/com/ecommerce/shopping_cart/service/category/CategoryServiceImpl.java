package com.ecommerce.shopping_cart.service.category;

import com.ecommerce.shopping_cart.model.Product;
import com.ecommerce.shopping_cart.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Product> getProductsByCategoryId(Long id){
        return categoryRepository.findProductListByCategoryId(id);
    }
}
