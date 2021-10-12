package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmUserService {
	
	@Autowired
	private FarmUserRepository farmUserRepo;
	
	public FarmUser create(String username, String password) {
		return farmUserRepo.save(new FarmUser(username,password));
	}
	
	public List<FarmUser> getall(){
		return farmUserRepo.findAll();
	}

}
