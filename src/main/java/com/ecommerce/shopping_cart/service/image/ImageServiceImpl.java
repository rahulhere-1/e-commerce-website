package com.ecommerce.shopping_cart.service.image;

import com.ecommerce.shopping_cart.model.Image;
import com.ecommerce.shopping_cart.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public Image getImageById(Long Id){
        return imageRepository.findImageById(Id);
    }
}
