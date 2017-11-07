/**
 * 
 */
package com.shopping.comment.dal;

import org.springframework.data.repository.CrudRepository;

import com.shopping.comment.entity.Comment;

/**
 * @author mbalde
 *
 */
public interface CommentDal extends CrudRepository<Comment, Long> {

}
