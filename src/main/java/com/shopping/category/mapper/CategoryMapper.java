package com.shopping.category.mapper;

import com.shopping.category.dto.CategoryDTO;
import com.shopping.category.entity.Category;

public interface CategoryMapper {

	CategoryDTO mapToCategoryDTO(Category category);
	
	Category mapToCategory(CategoryDTO categoryDTO);
}
