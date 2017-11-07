package com.shopping.product.dto;

import java.util.List;

import com.shopping.category.dto.CategoryDTO;
import com.shopping.comment.dto.CommentDTO;
import com.shopping.image.dto.ImageDTO;


public class ProductDTO {


	private Long productId;
	
	private CategoryDTO category;
	
	private String genre;
	
	private String status;

	private Integer price;
	

    /**
     * List of images to do in the term
     */
    private List<ImageDTO> images;
	
    /**
     * List of comment to do in the term
     */
    private List<CommentDTO> comments;

	/**
	 * 
	 */
	public ProductDTO() {
	}

	/**
	 * @param category
	 * @param genre
	 * @param status
	 * @param price
	 * @param images
	 * @param comments
	 */
	public ProductDTO(CategoryDTO category, String genre, String status, Integer price, List<ImageDTO> images,
			List<CommentDTO> comments) {
		this.category = category;
		this.genre = genre;
		this.status = status;
		this.price = price;
		this.images = images;
		this.comments = comments;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public List<ImageDTO> getImages() {
		return images;
	}

	public void setImages(List<ImageDTO> images) {
		this.images = images;
	}

	public List<CommentDTO> getComments() {
		return comments;
	}

	public void setComments(List<CommentDTO> comments) {
		this.comments = comments;
	}
	
}
