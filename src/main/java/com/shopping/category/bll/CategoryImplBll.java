package com.shopping.category.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.category.dal.CategoryDal;
import com.shopping.category.dto.CategoryDTO;
import com.shopping.category.mapper.CategoryMapper;

@Component
public class CategoryImplBll implements CategoryBll {

	@Autowired
	private CategoryDal categoryDal;
	
	@Autowired 
	CategoryMapper categoryMapper;

	@Override
	public CategoryDTO saveCategory(CategoryDTO categoryDTO) {
		return categoryMapper.mapToCategoryDTO(categoryDal.save(categoryMapper.mapToCategory(categoryDTO)));
	}
	
	
}
