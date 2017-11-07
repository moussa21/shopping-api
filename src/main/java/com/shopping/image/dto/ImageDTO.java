/**
 * 
 */
package com.shopping.image.dto;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.shopping.product.dto.ProductDTO;
import com.shopping.product.entity.Product;

/**
 * @author mbalde
 *
 */
public class ImageDTO {

	/**
	 * Category identifier
	 */
	private Long imageId;

	private ProductDTO product;
	
	private Blob picture;

	/**
	 * 
	 */
	public ImageDTO() {
	}

	/**
	 * @param image
	 */
	public ImageDTO(Blob picture) {
		this.picture = picture;
	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	/**
	 * @return the product
	 */
	public ProductDTO getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	
}
