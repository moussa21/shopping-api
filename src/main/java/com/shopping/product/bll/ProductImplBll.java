/**
 * 
 */
package com.shopping.product.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.product.dal.ProductDal;
import com.shopping.product.dto.ProductDTO;
import com.shopping.product.entity.Product;
import com.shopping.product.mapper.ProductMapper;

/**
 * @author mbalde
 *
 */
@Component
public class ProductImplBll implements ProductBll {
	
	@Autowired
	private ProductDal productDal;
	
	@Autowired
	ProductMapper productMapper;

	@Override
	public ProductDTO saveProduct(ProductDTO productDTO) {
		return productMapper.mapToProductDTO(productDal.save(productMapper.mapToProduct(productDTO)));
	}

	@Override
	public ProductDTO getProductDTO(Long productId) {
		return productMapper.mapToProductDTO(productDal.findOne(productId));
	}

	@Override
	public void deleteProduct(Long productId) {
		productDal.delete(productId);;
	}

	@Override
	public List<Product> getPoducts() {
		return (List<Product>) productDal.findAll();
	}

	
	
}
