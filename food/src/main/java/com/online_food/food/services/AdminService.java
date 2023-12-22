package com.online_food.food.services;

import com.online_food.food.entities.AdminLogin;

public interface AdminService {
	String adminLogin(String email,String password);
	String singUp(AdminLogin adminLogin);
}
