package com.shopping.image.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.image.dal.ImageDal;
import com.shopping.image.dto.ImageDTO;
import com.shopping.image.mapper.ImageMapper;

@Component
public class ImageImplBll implements ImageBll{

	@Autowired
	private ImageDal imageDal;
	
	@Autowired
	private ImageMapper imageMapper;

	@Override
	public ImageDTO saveImage(ImageDTO imageDTO) {
		return imageMapper.mapToImageDTO(imageDal.save(imageMapper.mapToImage(imageDTO)));
	}
}
