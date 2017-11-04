/**
 * 
 */
package com.shopping.product.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.shopping.category.entity.Category;
import com.shopping.comment.Comment;
import com.shopping.image.entity.Image;

/**
 * @author mbalde
 *
 */
@Entity
@Table(name = "Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;
	
	private String genre;
	
	private String status;

	private Integer price;
	

    /**
     * List of work to do in the term
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Image> images;
	
    /**
     * List of work to do in the term
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments;

	/**
	 * 
	 */
	public Product() {
	}

	/**
	 * @param category
	 * @param genre
	 * @param status
	 * @param price
	 * @param images
	 * @param comments
	 */
	public Product(Category category, String genre, String status, Integer price, List<Image> images,
			List<Comment> comments) {
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
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

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	

}
