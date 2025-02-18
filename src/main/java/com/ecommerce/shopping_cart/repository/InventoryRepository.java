package com.ecommerce.shopping_cart.repository;

import com.ecommerce.shopping_cart.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {

    @Query(" SELECT size FROM Inventory WHERE productId = ?1 ")
    public Integer getProductSizeByProductId(Long id);

}
