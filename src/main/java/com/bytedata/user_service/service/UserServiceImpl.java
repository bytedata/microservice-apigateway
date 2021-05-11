package com.bytedata.user_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bytedata.user_service.entity.User;

@Service
public class UserServiceImpl implements UserService {

	//Fake list
	List<User> list = List.of(
			new User(110l, "Kiran kumar", "8818181818" ),
			new User(111L, "Narayan sood", "919199199" ),
			new User(112L, "Sparsh dubay", "773737733" )
			);
	
	
	@Override
	public User getUser(Long id) {
		return list.stream().filter(userDetails ->userDetails.getUserId().equals(id)).findAny().orElse(null);
	}

}
