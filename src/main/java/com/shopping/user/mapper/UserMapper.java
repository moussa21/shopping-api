package com.shopping.user.mapper;

import com.shopping.user.dto.UserDTO;
import com.shopping.user.entity.User;

public interface UserMapper {

	UserDTO mapToUserDTO(User user);
	
	User mapToUser(UserDTO userDTO);

}
