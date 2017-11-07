/**
 * 
 */
package com.shopping.image.dal;

import org.springframework.data.repository.CrudRepository;

import com.shopping.image.entity.Image;

/**
 * @author mbalde
 *
 */
public interface ImageDal extends CrudRepository<Image, Long> {

}
