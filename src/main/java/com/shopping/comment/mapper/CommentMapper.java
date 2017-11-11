package com.shopping.comment.mapper;

import org.springframework.stereotype.Component;

import com.shopping.comment.dto.CommentDTO;
import com.shopping.comment.entity.Comment;

 
public interface CommentMapper {

	CommentDTO mapToCommentDTO(Comment comment);
	
	Comment mapToComment(CommentDTO commentDTO);

}
