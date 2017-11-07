package com.shopping.product.dal;

import org.springframework.data.repository.CrudRepository;

import com.shopping.product.entity.Product;

public interface ProductDal extends CrudRepository<Product, Long> {

}
