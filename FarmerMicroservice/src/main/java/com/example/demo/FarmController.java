package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarmController {

	@Autowired
	FarmUserService farmUserService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String username, @RequestParam String password) {
		FarmUser u = farmUserService.create(username, password);
		return u.toString();
	}
	
	@RequestMapping("/getall")
	public List<FarmUser> getAll(){
		return farmUserService.getall();
	}
	
	
}
