package com.shopping.product.bll;



import java.util.List;

import com.shopping.product.dto.ProductDTO;
import com.shopping.product.entity.Product;


public interface ProductBll {

	ProductDTO saveProduct(ProductDTO productDTO);
	
	ProductDTO getProductDTO(Long produtId);
	
	void deleteProduct(Long productId);
	
	List <Product> getPoducts();
}
