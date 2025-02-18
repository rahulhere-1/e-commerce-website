package com.ecommerce.shopping_cart.service.inventory;

import com.ecommerce.shopping_cart.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepo;

    public Integer getProductSizeByProductId(Long productId){
        return inventoryRepo.getProductSizeByProductId(productId);
    }
}
