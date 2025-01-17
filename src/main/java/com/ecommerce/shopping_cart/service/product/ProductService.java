package com.ecommerce.shopping_cart.service.product;

import com.ecommerce.shopping_cart.model.Product;
import com.ecommerce.shopping_cart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    public Product getProductById(Long id);

    public Product getProductByName(String name);
}
