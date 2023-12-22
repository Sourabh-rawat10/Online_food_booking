package com.online_food.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.online_food.food.entities.AdminLogin;


public interface AdminRepository extends JpaRepository<AdminLogin, Long>{
	@Query(value ="select * from admin_login ul where ul.email=(:email)", nativeQuery= true)
	AdminLogin findByEmail(String email);
}
