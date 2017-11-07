/**
 * 
 */
package com.shopping.comment.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.comment.dal.CommentDal;

/**
 * @author mbalde
 *
 */
@Component
public class CommentImplBll implements CommentBll {
	
	@Autowired
	private CommentDal commentDal;
	

}
