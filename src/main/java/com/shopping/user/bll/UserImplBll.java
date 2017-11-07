/**
 * 
 */
package com.shopping.user.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.user.dal.UserDal;

/**
 * @author mbalde
 *
 */
@Component
public class UserImplBll implements UserBll {

	@Autowired
	private UserDal userDal;
}
