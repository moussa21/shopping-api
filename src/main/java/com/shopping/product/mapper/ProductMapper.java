package com.shopping.product.mapper;

import com.shopping.product.dto.ProductDTO;
import com.shopping.product.entity.Product;

public interface ProductMapper {
	

	ProductDTO mapToProductDTO(Product product);

	Product mapToProduct(ProductDTO productDTO);

}
