package com.ecommerce.shopping_cart.repository;

import com.ecommerce.shopping_cart.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {


    public Image findImageById(Long id);
}
