package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DealerResource {

	@Autowired
	RestTemplate restTemplate = new RestTemplate();
	
	@RequestMapping("/call")
	public String call() {
		
		return restTemplate.getForObject("http://farmer-app/getall", String.class).toString();
				
//		return "hi iam hard coded";
	}
	
	
	
	
	
	
	
}
