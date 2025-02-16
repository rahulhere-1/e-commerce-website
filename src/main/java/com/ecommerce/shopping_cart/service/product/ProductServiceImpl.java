package com.ecommerce.shopping_cart.service.product;

import com.ecommerce.shopping_cart.exception.ProductNotFoundException;
import com.ecommerce.shopping_cart.model.Product;
import com.ecommerce.shopping_cart.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepo;
    @Override
    public Product getProductById(Long id) {
        return productRepo.findById(id).orElseThrow(() -> new ProductNotFoundException("PRODUCT NOT FOUND"));
    }

    @Override
    public Product getProductByName(String name) {
        return null;
    }

    public List<Product> getProductByBrandName(String brand){
        return productRepo.getProductByBrand(brand);
    }
}
