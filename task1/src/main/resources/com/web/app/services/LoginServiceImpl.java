package com.web.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import com.web.app.model.User;

public class LoginServiceImpl implements LoginService {

	private static final AtomicLong counter = new AtomicLong();

	private static List<User> users;

	static {
		users = populateMockUsers();
				
	}

	private static List<User> populateMockUsers() {

		List<User> users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(), "Raymond", "Champion", "raychamp", "thePassword", "8503 Timber Crest", "ray@gmail.com"));

		return users;
	}

	@Override
	public List<User> login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
