package com.shopping.user.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class UserDTO {


	private Long userId;
	
	private String name;
	
	private String firstName;
	
	private String phone;
	
	private String email;

	/**
	 * 
	 */
	public UserDTO() {
	}

	/**
	 * @param name
	 * @param firstName
	 * @param phone
	 * @param email
	 */
	public UserDTO(String name, String firstName, String phone, String email) {
		this.name = name;
		this.firstName = firstName;
		this.phone = phone;
		this.email = email;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param mail the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
