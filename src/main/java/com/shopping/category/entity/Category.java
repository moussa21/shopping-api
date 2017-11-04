/**
 * 
 */
package com.shopping.category.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * @author mbalde
 *
 */
@Entity
@Table(name = "Category")
public class Category {
	
	/**
	 * Category identifier
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	
	/**
	 * Category name
	 */
	private String name;

	/**
	 * 
	 */
	public Category() {
		super();
	}

	/**
	 * @param name
	 */
	public Category(String name) {
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
