package com.shopping.category.DTO;


/**
 * @author mbalde
 *
 */
public class CategoryDTO {
	
	/**
	 * Category identifier
	 */
	private Long categoryId;
	
	/**
	 * Category name
	 */
	private String name;

	/**
	 * 
	 */
	public CategoryDTO() {
	}

	/**
	 * @param name
	 */
	public CategoryDTO(String name) {
		super();
		this.name = name;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
