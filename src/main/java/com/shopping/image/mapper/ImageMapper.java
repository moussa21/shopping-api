package com.shopping.image.mapper;

import com.shopping.image.dto.ImageDTO;
import com.shopping.image.entity.Image;

public interface ImageMapper {

	ImageDTO mapToImageDTO(Image image);
	
	Image mapToImage(ImageDTO imageDTO);
}
