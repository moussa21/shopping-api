/**
 * 
 */
package com.shopping.user.dal;

import org.springframework.data.repository.CrudRepository;

import com.shopping.user.entity.User;

/**
 * @author mbalde
 *
 */
public interface UserDal extends CrudRepository<User, Long> {

}
