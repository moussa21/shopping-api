/**
 * 
 */
package com.shopping.image.entity;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.shopping.product.entity.Product;

/**
 * @author mbalde
 *
 */
@Entity
@Table(name = "Image")
public class Image {

	/**
	 * Category identifier
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long imageId;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;
	
	private Blob picture;

	/**
	 * 
	 */
	public Image() {
	}

	/**
	 * @param image
	 */
	public Image(Blob picture) {
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
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
