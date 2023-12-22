package com.online_food.food.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_food.food.Repositories.AdminRepository;
import com.online_food.food.entities.AdminLogin;
import com.online_food.food.entities.User;
import com.online_food.food.entities.UserLogin;
import com.online_food.food.services.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminRepository adminRepository;
	@Override
	public String adminLogin(String email, String password) {
		
		AdminLogin adminLogin = adminRepository.findByEmail(email);
		if(adminLogin!=null) {
			if(adminLogin.getPassword().equals(password))
				return "welcome user";
			else
				return "Invalid Password";
		}
		else
			return "Kindly create Account";
		
	}
	

	@Override
	public String singUp(AdminLogin adminLogin) {
		adminRepository.save(adminLogin);
		return "successfully signup";
	}
	
}
