package com.shopping.category.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.category.dal.CategoryDal;

@Component
public class CategoryImplBll implements CategoryBll {

	@Autowired
	private CategoryDal categoryDal;
	
	
}
