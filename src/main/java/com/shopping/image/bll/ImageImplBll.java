package com.shopping.image.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.image.dal.ImageDal;

@Component
public class ImageImplBll implements ImageBll{

	@Autowired
	private ImageDal imageDal;
}
