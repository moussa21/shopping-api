package com.shopping.category.dal;

import org.springframework.data.repository.CrudRepository;

import com.shopping.category.entity.Category;

public interface CategoryDal extends CrudRepository<Category, Long> {

}
