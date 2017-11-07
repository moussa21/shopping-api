/**
 * 
 */
package com.shopping.product.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.product.dal.ProductDal;

/**
 * @author mbalde
 *
 */
@Component
public class ProductImplBll implements ProductBll {
	
	@Autowired
	private ProductDal producDal;

}
