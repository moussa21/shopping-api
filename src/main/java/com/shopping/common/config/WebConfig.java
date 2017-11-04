package com.shopping.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.shopping.common.config.entity.CrossDomain;

import java.util.List;

/**
 * Created by frederic on 19/05/17. This class configure the rest service for
 * CORS
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private CrossDomain crossDomainProd;

	/**
	 * Allow request from cross domain server
	 * 
	 * @param registry
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		List<String> origins = crossDomainProd.getOrigins();
		List<String> methods = crossDomainProd.getMethods();
		registry.addMapping(crossDomainProd.getMapping()).allowedOrigins(origins.toArray(new String[0]))
				.allowedMethods(methods.toArray(new String[0])).allowCredentials(false);
	}
}
