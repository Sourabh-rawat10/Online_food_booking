package com.online_food.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online_food.food.entities.AdminLogin;
import com.online_food.food.services.AdminService;
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService adminService;

	@GetMapping("/login/{email}/{password}")
	String adminLogin(@PathVariable String email,@PathVariable String password) {
		return adminService.adminLogin(email, password);
	}
	
	@PostMapping("/signup")
	String singUp(@RequestBody AdminLogin adminLogin) {
		return adminService.singUp(adminLogin);
	}
}
