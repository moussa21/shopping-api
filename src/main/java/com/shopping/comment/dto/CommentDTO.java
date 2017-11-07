package com.shopping.comment.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.shopping.product.dto.ProductDTO;
import com.shopping.product.entity.Product;

public class CommentDTO {

		private Long commentId;
		
		private ProductDTO product;
		
		private String description;
		
		private Long userId;
		
		private Integer rating;
		
		
		/**
		 * Constructor
		 */
		public CommentDTO() {
		}

		/**
		 * @param description
		 * @param userId
		 * @param rating
		 */
		public CommentDTO(String description, ProductDTO product, Long userId, Integer rating) {
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
