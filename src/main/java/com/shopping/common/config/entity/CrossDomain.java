/**
 * 
 */
package com.shopping.common.config.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author mbalde
 *
 */
@Component
@ConfigurationProperties(prefix = "crossdomain")
public class CrossDomain {
	/**
	 * List of allowed IP to request Shopping API
	 */
	private List<String> origins = new ArrayList<String>();
	/**
	 * List of mapping allow to be requested in Uni-Corn API
	 */
	private String mapping = null;
	/**
	 * List of method that can be requested Shopping API
	 */
	private List<String> methods = new ArrayList<String>();

	/**
	 * Method that return origins
	 * 
	 * @return List of origin
	 */
	public List<String> getOrigins() {
		return this.origins;
	}

	/**
	 * Method that set origins
	 * 
	 * @param origins
	 */
	public void setOrigins(List<String> origins) {
		this.origins = origins;
	}

	/**
	 * Method that return mapping
	 * 
	 * @return mapping
	 */
	public String getMapping() {
		return this.mapping;
	}

	/**
	 * Method that set mapping
	 * 
	 * @param mapping
	 */
	public void setMapping(String mapping) {
		this.mapping = mapping;
	}

	/**
	 * Method that return methods
	 * 
	 * @return List of method
	 */
	public List<String> getMethods() {
		return this.methods;
	}

	/**
	 * Method that set methods
	 * 
	 * @param methods
	 */
	public void setMethods(List<String> methods) {
		this.methods = methods;
	}
}
