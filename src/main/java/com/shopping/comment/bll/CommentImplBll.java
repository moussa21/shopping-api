/**
 * 
 */
package com.shopping.comment.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.comment.dal.CommentDal;
import com.shopping.comment.dto.CommentDTO;
import com.shopping.comment.mapper.CommentMapper;

/**
 * @author mbalde
 *
 */
@Component
public class CommentImplBll implements CommentBll {

	@Autowired
	private CommentDal commentDal;

	/**
	 * Comment Mapper
	 */
	@Autowired
	private CommentMapper commentMapper;

	/**
	 * Method that create a new comment
	 * 
	 * @param commentDTO
	 * @return CommentDTO
	 * @throws ValidationException
	 */
	@Override
	public CommentDTO saveComment(CommentDTO commentDTO) {
		return commentMapper.mapToCommentDTO(this.commentDal.save(commentMapper.mapToComment(commentDTO)));
	}
}
