/**
 * 
 */
package com.shopping.comment.entity;

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
@Table(name = "Comment")
public class Comment {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long commentId;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;
	
	private String description;
	
	private Long userId;
	
	private Integer rating;
	
	
	/**
	 * Constructor
	 */
	public Comment() {
	}

	/**
	 * @param description
	 * @param userId
	 * @param rating
	 */
	public Comment(String description, Product product, Long userId, Integer rating) {
		this.description = description;
		this.userId = userId;
		this.rating = rating;
		this.product = product;
	}

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
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
