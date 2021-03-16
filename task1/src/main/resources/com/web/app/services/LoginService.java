package com.web.app.services;

import java.util.List;

import com.web.app.model.User;

public interface LoginService {
	
	List<User> login(String username, String password );

}
