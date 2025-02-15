package com.ecommerce.shopping_cart.service.image;

import com.ecommerce.shopping_cart.model.Image;
import org.springframework.stereotype.Service;

@Service
public interface ImageService {

    public Image getImageById(Long Id);
}
