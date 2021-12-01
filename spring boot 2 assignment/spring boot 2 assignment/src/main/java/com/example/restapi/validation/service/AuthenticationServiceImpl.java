package com.example.restapi.validation.service;

import org.springframework.stereotype.Service;

import com.example.restapi.validation.model.UserCredentials;

@Service
public class AuthenticationServiceImpl implements Authentication {
	
	UserCredentials u = new UserCredentials();

	@Override
	public String isValid(String username, String password) {
		if(username.equals(u.getUsername())&& password.equals(u.getPassword())) {
			return "Valid User";
		}
		else {

		return "Invalid user";
		}
	}

}
